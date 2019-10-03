/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.IUniversidadFacadeLocal;
import com.mycompany.entity.Universidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}
