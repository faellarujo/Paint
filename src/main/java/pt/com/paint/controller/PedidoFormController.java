package pt.com.paint.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pt.com.paint.Service.PedidoService;
import pt.com.paint.model.PedidoModel;
import pt.com.paint.request.PedidoResquest;

@Controller
public class PedidoFormController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedido/form")
    public String showForm(Model model) {
        model.addAttribute("pedido", new PedidoResquest());
        return "pedidoForm";
    }

    @PostMapping("/pedido/form")
    @Transactional
    public String submitForm(@ModelAttribute @Valid PedidoResquest pedidoResquest, Model model) {
        final PedidoModel pedidoModel  = pedidoResquest.toModel();
        final String sucesso = pedidoService.createPedido(pedidoModel);
        if (sucesso.equals("Pedido criado com sucesso")) {
            model.addAttribute("pedido", new PedidoResquest());
        } else {
            model.addAttribute("erro", sucesso);
        }
        return "pedidoForm";
    }
}