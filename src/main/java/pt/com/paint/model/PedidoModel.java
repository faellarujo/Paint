package pt.com.paint.exceptionHandler.model;

import jakarta.persistence.*;

@Entity
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "numeroPedido")
    private int numeroPedido;

    @Column(nullable = false, name = "descriçãoPedido")
    private String descriçãoPedido;


    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    @Column(nullable = false, name = "scriptsql")
    private String scriptsql;

    public PedidoModel() {
    }

    public PedidoModel(int numeroPedido, String descriçãoPedido, Status status, String scriptsql) {
        this.numeroPedido = numeroPedido;
        this.descriçãoPedido = descriçãoPedido;
        this.status = status;
        this.scriptsql = scriptsql;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescriçãoPedido() {
        return descriçãoPedido;
    }

    public void setDescriçãoPedido(String descriçãoPedido) {
        this.descriçãoPedido = descriçãoPedido;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
                ", descriçãoPedido='" + descriçãoPedido + '\'' +
                ", status='" + status + '\'' +
                ", scriptsql='" + scriptsql + '\'' +
                '}';
    }
}





