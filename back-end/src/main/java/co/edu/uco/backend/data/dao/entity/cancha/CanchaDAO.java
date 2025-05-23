package co.edu.uco.backend.data.dao.entity.cancha;

import co.edu.uco.backend.crosscutting.exceptions.BackEndException;
import co.edu.uco.backend.data.dao.entity.CreateDAO;
import co.edu.uco.backend.data.dao.entity.DeleteDAO;
import co.edu.uco.backend.data.dao.entity.RetrieveDAO;
import co.edu.uco.backend.data.dao.entity.UpdateDAO;
import co.edu.uco.backend.entity.CanchaEntity;

import java.util.UUID;

public interface CanchaDAO extends
        CreateDAO<CanchaEntity>,
        RetrieveDAO<CanchaEntity, UUID>,
        UpdateDAO<CanchaEntity, UUID>,
        DeleteDAO<UUID> {

    void create(CanchaEntity entity);

    void crear(CanchaEntity entity) throws BackEndException;
}
