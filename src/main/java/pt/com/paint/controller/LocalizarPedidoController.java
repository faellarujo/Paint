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
import pt.com.paint.Service.StatusService;
import pt.com.paint.model.PedidoModel;
import pt.com.paint.model.StatusModel;
import pt.com.paint.request.LocalizaPedidoRequest;

import java.util.List;

@Controller
public class LocalizarPedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private EntityManager entityManager;



    @Autowired
    private StatusService statusService;



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
        final List<StatusModel> ListaDeStatus = statusService.getStatus();
        model.addAttribute("pedidoResponse", pedidoModel);
        model.addAttribute("statusList", ListaDeStatus);
        return "PedidoResponseForm";
    }
}



