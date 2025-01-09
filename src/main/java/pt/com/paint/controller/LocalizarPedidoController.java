package pt.com.paint.controller;


import jakarta.persistence.EntityManager;
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
import pt.com.paint.request.LocalizaPedidoRequest;

@Controller
public class LocalizarPedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private EntityManager entityManager;



    @GetMapping("/localizar/pedido")
    public String showForm(Model model) {
        model.addAttribute("existe", new LocalizaPedidoRequest());
        return "localizarPedidoForm";
    }

    @PostMapping("/localizar/pedido")
    @Transactional
    public String submitForm(@ModelAttribute @Valid LocalizaPedidoRequest localizaPedidoRequest , Model model) {
        model.addAttribute("existe", new LocalizaPedidoRequest());
        final PedidoModel pedidoModel = pedidoService.pedidoExiste(localizaPedidoRequest.getNumeroPedido());
        model.addAttribute("pedidoResponse", pedidoModel);
        return "PedidoResponseForm";
    }


}



