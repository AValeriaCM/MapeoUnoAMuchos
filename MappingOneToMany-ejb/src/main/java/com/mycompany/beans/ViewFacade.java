/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTOView;
import com.mycompany.interfaces.ViewFacadeLocal;
import com.mycompany.entity.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author angie
 */
@Stateless
public class ViewFacade extends AbstractFacade<View> implements ViewFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingOneToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewFacade() {
        super(View.class);
    }
    
    @Override
    public List<View> reporte(){
        TypedQuery<View> consulta = em.createNamedQuery("reporte", View.class);
        List<View> listaReporte = consulta.getResultList();
        
        List<View> listaTemp = new ArrayList();
        Iterator it = listaReporte.iterator();
        
        while(it.hasNext()){
            Object[] obj = (Object[]) it.next();
            View v = new View(String.valueOf(obj[0]), String.valueOf(obj[1]), String.valueOf(obj[2]), String.valueOf(obj[3]), String.valueOf(obj[4]), String.valueOf(obj[5]), String.valueOf(obj[6]));        
            listaTemp.add(v);
        }
        
        return listaTemp;
    }
    
}
