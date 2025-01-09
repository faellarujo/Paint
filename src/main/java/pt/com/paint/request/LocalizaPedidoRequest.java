package pt.com.paint.request;

import jakarta.validation.constraints.NotNull;
import pt.com.paint.model.PedidoModel;

public class LocalizaPedidoRequest {

    @NotNull
    private Long numeroPedido;

    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalizaPedidoRequest() {
    }

    public LocalizaPedidoRequest(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public PedidoModel toModel() {
        return new PedidoModel(numeroPedido);
    }
}
