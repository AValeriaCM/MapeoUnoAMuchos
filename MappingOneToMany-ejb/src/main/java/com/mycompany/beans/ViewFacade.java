/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTOView;
import com.mycompany.interfaces.ViewFacadeLocal;
import com.mycompany.entity.View;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

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
    /**
     * Metodo que genera reporte
     */
    public List<View> reporte(){
        List<View> listaReporte = em.createNamedQuery("reporte", View.class).getResultList();
//        for (View lR : listaReporte) {
//            System.out.println(lR.getNombreDiplomado()+" "+lR.getFoto());
//        }
        ModelMapper mp = new ModelMapper();
        Type listType = new TypeToken<List<View>>() {}.getType();
        List<View> listaDto = mp.map(listaReporte, listType);
        
        return listaDto;
    }
    
}
