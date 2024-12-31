package pt.com.paint.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.com.paint.Service.PedidoService;
import pt.com.paint.request.PedidoResquest;

@Controller
public class LocalizarPedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/localizar/pedido")
    public String showForm(Model model) {
        model.addAttribute("existe", new PedidoResquest());
        return "localizarPedidoForm";
    }

    @PostMapping("/localizar/pedido")
    public String getPedido(Model model) {
        model.addAttribute("existe", null);
        return "localizarPedidoForm";
    }


}



