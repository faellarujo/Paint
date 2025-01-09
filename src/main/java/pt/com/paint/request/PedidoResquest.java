package pt.com.paint.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import pt.com.paint.model.PedidoModel;
import pt.com.paint.model.StatusModel;

public class PedidoResquest {

    @NotNull
    @JsonProperty("NumeroPedido")
    private Long numeroPedido;

    @NotEmpty
    @JsonProperty("DescricaoPedido")
    private String descricaoPedido;

    @JsonProperty("statusModelPedido")
    private StatusModel statusModelPedido;

    @JsonProperty("Scriptsql")
    private String scriptsql;

    public PedidoResquest() {
    }

    public PedidoResquest(@NotNull Long numeroPedido, @NotEmpty String descricaoPedido, StatusModel statusModel, String scriptsql) {
        this.numeroPedido = numeroPedido;
        this.descricaoPedido = descricaoPedido;
        this.statusModelPedido = statusModel;
        this.scriptsql = scriptsql;
    }



    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public StatusModel getStatus() {
        return statusModelPedido;
    }

    public void setStatus(StatusModel statusModel) {
        this.statusModelPedido = statusModel;
    }

    public String getScriptsql() {
        return scriptsql;
    }

    public void setScriptsql(String scriptsql) {
        this.scriptsql = scriptsql;
    }

    @Override
    public String toString() {
        return "PedidoResquest{" +
                "numeroPedido=" + numeroPedido +
                ", descricaoPedido='" + descricaoPedido + '\'' +
                ", status='" + statusModelPedido + '\'' +
                ", scriptsql='" + scriptsql + '\'' +
                '}';
    }

    public PedidoModel toModel() {
        return new PedidoModel(numeroPedido, descricaoPedido, statusModelPedido, scriptsql);
    }
}