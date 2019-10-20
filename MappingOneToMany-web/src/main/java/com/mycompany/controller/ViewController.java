/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entity.Estudiante;
import com.mycompany.entity.View;
import com.mycompany.interfaces.ViewFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author angie
 */
@Named(value = "viewController")
@SessionScoped
public class ViewController implements Serializable{
    
    @EJB
    ViewFacadeLocal viewFacade;
    
    private List<View> listaView;

    public ViewController() {
        listaView = new ArrayList();
    }

    @PostConstruct
    public void _init() {
        listaView = viewFacade.findAll();
    }

    public void llenarLista() {
        listaView = viewFacade.findAll();
    }

    public List<View> listarView() {
        return viewFacade.reporte();
    }
    
    public List<View> getListaView() {
        return listaView;
    }

    public void setListaView(List<View> listaView) {
        this.listaView = listaView;
    }
    
    
    
}
