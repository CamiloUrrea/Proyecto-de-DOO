package co.edu.uco.backend.businesslogic.businesslogic.impl;

import co.edu.uco.backend.businesslogic.businesslogic.DepartamentoBusinessLogic;
import co.edu.uco.backend.businesslogic.businesslogic.domain.DepartamentoDomain;
import co.edu.uco.backend.data.dao.factory.DAOFactory;

import java.util.List;
import java.util.UUID;

public class DepartamentoBusinessLogicImpl implements DepartamentoBusinessLogic {

    public DepartamentoBusinessLogicImpl(DAOFactory daoFactory) {
    }

    @Override
    public void registrarNuevoDepartamento(DepartamentoDomain domain) {

    }

    @Override
    public void modificarDepartamentoExistente(UUID id, DepartamentoDomain domain) {

    }

    @Override
    public void darBajaDefinitivamenteDepartamentoExistente(UUID id) {

    }

    @Override
    public DepartamentoDomain consultarDepartamentoPorId(UUID id) {
        return null;
    }

    @Override
    public List<DepartamentoDomain> consultarDepartamentos(DepartamentoDomain filtro) {
        return List.of();
    }
}
