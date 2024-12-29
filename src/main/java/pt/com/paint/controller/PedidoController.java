package pt.com.paint.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pt.com.paint.Service.PedidoService;
import pt.com.paint.model.PedidoModel;
import pt.com.paint.request.PedidoResquest;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/pedido")
    @Transactional
    public String createPedido(@RequestBody @Valid PedidoResquest pedido) {
        final PedidoModel model = pedido.toModel();
        pedidoService.createPedido(model);
        return "Pedido criado com sucesso";
    }
}




