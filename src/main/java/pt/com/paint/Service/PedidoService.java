package pt.com.paint.Service;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.com.paint.exceptions.PedidoJaExistenteException;
import pt.com.paint.model.PedidoModel;
import pt.com.paint.repositore.PedidoRepositore;
import pt.com.paint.repositore.StatusRepositore;

import java.util.List;

@Service
public class PedidoService {

    @PersistenceContext
    private EntityManager manager;


    @Autowired
    private PedidoRepositore pedidoRepositore;

    @Autowired
    private StatusRepositore statusRepositore;

    public String createPedido(PedidoModel pedido) {

            final PedidoModel pedidoExistente = getPedido(pedido);
            if (pedidoExistente == null) {
                setaStatudPedido(pedido);
                String formattedSql =  SqlFormatter.format(pedido.getScriptsql());
                pedido.setScriptsql(formattedSql);
                manager.persist(pedido);
            } else {
                throw new PedidoJaExistenteException("Pedido já existe");
            }
        return "Pedido criado com sucesso";
    }

    public PedidoModel getPedido(PedidoModel pedido) {
        PedidoModel pedidoExistente = pedidoRepositore.findByNumeroPedido(pedido.getNumeroPedido());
        return pedidoExistente;
    }

    private void setaStatudPedido(PedidoModel pedido) {
        pedido.setStatus(statusRepositore.findByStatus("Aberto"));
    }

    public List<PedidoModel> getAllPedidos() {
        final List<PedidoModel> all = pedidoRepositore.findAll();
        return pedidoRepositore.findAll();
    }

    public boolean pedidoExiste(Integer numeroPedido) {
        PedidoModel pedidoExistente = pedidoRepositore.findByNumeroPedido(numeroPedido);
        return pedidoExistente != null;
    }



}
