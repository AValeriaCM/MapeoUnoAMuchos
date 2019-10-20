/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTOUniversidad;
import com.mycompany.interfaces.IUniversidadFacadeLocal;
import com.mycompany.entity.Universidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;

/**
 *
 * @author angie
 */
@Stateless
public class UniversidadFacade extends AbstractFacade<Universidad> implements IUniversidadFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingOneToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniversidadFacade() {
        super(Universidad.class);
    }
    
    @Override
    public void crearUniversidad(DTOUniversidad uni){
        ModelMapper model = new ModelMapper();
        Universidad u = model.map(uni, Universidad.class);
        create(u);
    }
    
    @Override
    public void editarUniversidad(DTOUniversidad uni){
        ModelMapper model = new ModelMapper();
        Universidad u = model.map(uni, Universidad.class);
        u.setExtension(uni.getExtension());
        edit(u);
    }
    
}
