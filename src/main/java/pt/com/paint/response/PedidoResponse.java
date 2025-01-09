package pt.com.paint.response;

public class PedidoResponse {

    private Long numeroPedido;
    private String descricaoPedido;
    private String statusModelPedido;
    private String scriptsql;

    public PedidoResponse(Long numeroPedido, String descricaoPedido, String statusModelPedido, String scriptsql) {
        this.numeroPedido = numeroPedido;
        this.descricaoPedido = descricaoPedido;
        this.statusModelPedido = statusModelPedido;
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

    public String getStatusModelPedido() {
        return statusModelPedido;
    }

    public void setStatusModelPedido(String statusModelPedido) {
        this.statusModelPedido = statusModelPedido;
    }

    public String getScriptsql() {
        return scriptsql;
    }

    public void setScriptsql(String scriptsql) {
        this.scriptsql = scriptsql;
    }
}
