package pt.com.paint.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pt.com.paint.request.PedidoResquest;

@RestController
public class PedidoController {
}


    @PostMapping("/pedido")
    public String createPedido(@RequestBody @Valid PedidoResquest pedido) {
        return "Pedido criado com sucesso!";
    }









