package co.edu.uco.backend.businesslogic.businesslogic.impl;

import co.edu.uco.backend.businesslogic.businesslogic.CanchaBusinessLogic;
import co.edu.uco.backend.businesslogic.businesslogic.domain.CanchaDomain;
import co.edu.uco.backend.crosscutting.exceptions.BackEndException;
import co.edu.uco.backend.data.dao.factory.DAOFactory;
import co.edu.uco.backend.entity.CanchaEntity;
import co.edu.uco.backend.entity.OrganizacionDeportivaEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanchaBusinessLogicImpl implements CanchaBusinessLogic {

    private DAOFactory factory;

    public CanchaBusinessLogicImpl(DAOFactory factory) {
        this.factory = factory;
    }

    @Override
    public void registrarNuevaCancha(UUID orgId, CanchaDomain cancha) throws BackEndException {
        CanchaEntity canchaEntity = null;
        OrganizacionDeportivaEntity organizacionDeportivaEntity = factory.getOrganizacionDeportivaDAO().consultarPorId(orgId);
        canchaEntity.setOrganizacionDeportivaEntity(organizacionDeportivaEntity);
        factory.getCanchaDAO().create(canchaEntity);
    }

    @Override
    public void modificarCanchaExistente(UUID orgId, UUID canchaId, CanchaDomain cancha) throws BackEndException {
        CanchaEntity canchaEntity = factory.getCanchaDAO().consultarPorId(canchaId);
        factory.getCanchaDAO().modificar(canchaEntity);

    }

    @Override
    public void darBajaDefinitivamenteCanchaExistente(UUID orgId, UUID canchaId) throws BackEndException {
        CanchaEntity canchaEntity = null;
        factory.getCanchaDAO().eliminar(canchaId);
    }

    @Override
    public CanchaDomain consultarCanchaPorId(UUID orgId, UUID canchaId) {
        return null;
    }

    @Override
    public List<CanchaDomain> consultarMisCanchas(UUID orgId, CanchaDomain filtro) throws BackEndException {
        CanchaEntity canchaFilter = null;
        List<CanchaEntity> canchaEntities = factory.getCanchaDAO().consultar(canchaFilter);

        List<CanchaDomain> datosARetornar = null;

        return datosARetornar;
    }
    

    
}
