package pt.com.paint.repositore;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.com.paint.model.PedidoModel;


@Repository
public interface PedidoRepositore extends JpaRepository<PedidoModel, Long> {
    PedidoModel findByNumeroPedido(int pedido);

}
