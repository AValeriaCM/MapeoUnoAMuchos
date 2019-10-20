/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.View;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author angie
 */
@Local
public interface ViewFacadeLocal {

    void create(View view);

    void edit(View view);

    void remove(View view);

    View find(Object id);

    List<View> findAll();

    List<View> findRange(int[] range);

    int count();
    
    List<View> reporte();
    
}
