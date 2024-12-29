package pt.com.paint.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StatusModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status")
    private String status;

    @OneToMany
    @JoinColumn(name = "status_id")
    private List<PedidoModel> pedidoModel;

    public StatusModel() {
    }

    public StatusModel(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
