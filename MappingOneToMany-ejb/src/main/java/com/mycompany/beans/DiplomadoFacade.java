/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTODiplomado;
import com.mycompany.interfaces.IDiplomadoFacadeLocal;
import com.mycompany.entity.Diplomado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;

/**
 *
 * @author angie
 */
@Stateless
public class DiplomadoFacade extends AbstractFacade<Diplomado> implements IDiplomadoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingOneToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiplomadoFacade() {
        super(Diplomado.class);
    }

    @Override
    public void crearDiplomado(DTODiplomado dipl) {
        ModelMapper model = new ModelMapper();
        Diplomado d = model.map(dipl, Diplomado.class);
        create(d);
    }

    @Override
    public void editarDiplomado(DTODiplomado dipl) {
        ModelMapper model = new ModelMapper();
        Diplomado d = model.map(dipl, Diplomado.class);
        edit(d);
    }
    
}
