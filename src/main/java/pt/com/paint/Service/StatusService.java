package pt.com.paint.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.com.paint.model.StatusModel;
import pt.com.paint.repositore.StatusRepositore;

import java.util.List;


@Service
public class StatusService {


    @Autowired
    private StatusRepositore statusRepositore;

    public List<StatusModel> getStatus() {
        return statusRepositore.findAll();

    }
}
