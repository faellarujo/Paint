package pt.com.paint.repositore;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.com.paint.model.StatusModel;

public interface StatusRepositore extends JpaRepository<StatusModel, Integer> {

    StatusModel findByStatus(String status);
}
