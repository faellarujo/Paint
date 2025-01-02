package pt.com.paint.request;

import jakarta.validation.constraints.NotNull;
import pt.com.paint.model.PedidoModel;

public class LocalizaPedidoRequest {

    @NotNull
    private Integer numeroPedido;

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalizaPedidoRequest() {
    }

    public LocalizaPedidoRequest(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public PedidoModel toModel() {
        return new PedidoModel(numeroPedido);
    }
}
