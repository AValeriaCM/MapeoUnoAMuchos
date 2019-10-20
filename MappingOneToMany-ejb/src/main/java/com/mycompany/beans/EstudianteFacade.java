/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTOEstudiante;
import com.mycompany.interfaces.IEstudianteFacadeLocal;
import com.mycompany.entity.Estudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;

/**
 *
 * @author angie
 */
@Stateless
public class EstudianteFacade extends AbstractFacade<Estudiante> implements IEstudianteFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingOneToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteFacade() {
        super(Estudiante.class);
    }

    @Override
    public void crearEstudiante(DTOEstudiante est) {
        ModelMapper model = new ModelMapper();
        Estudiante e = model.map(est, Estudiante.class);
        create(e);
    }
    
}
