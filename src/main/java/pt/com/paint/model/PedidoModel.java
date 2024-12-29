package pt.com.paint.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

@Entity
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "numeroPedido")
    private int numeroPedido;

    @Column(nullable = false, name = "descricaoPedido")
    private String descricaoPedido;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private StatusModel statusModel;

    @Column(name = "scriptsql")
    @Size(max = 10000)
    private String scriptsql;

    public PedidoModel() {
    }

    public PedidoModel(int numeroPedido, String descricaoPedido, StatusModel statusModel, String scriptsql) {
        this.numeroPedido = numeroPedido;
        this.descricaoPedido = descricaoPedido;
        this.statusModel = statusModel;
        this.scriptsql = scriptsql;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public StatusModel getStatus() {
        return statusModel;
    }

    public void setStatus(StatusModel statusModel) {
        this.statusModel = statusModel;
    }

    public String getScriptsql() {
        return scriptsql;
    }

    public void setScriptsql(String scriptsql) {
        this.scriptsql = scriptsql;
    }

    @Override
    public String toString() {
        return "PedidoModel{" +
                "numeroPedido=" + numeroPedido +
                ", descricaoPedido='" + descricaoPedido + '\'' +
                ", statusModel='" + statusModel + '\'' +
                ", scriptsql='" + scriptsql + '\'' +
                '}';
    }
}