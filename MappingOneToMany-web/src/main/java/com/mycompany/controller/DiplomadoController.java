/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTODiplomado;
import com.mycompany.dto.DTOUniversidad;
import com.mycompany.entity.Diplomado;
import com.mycompany.entity.Universidad;
import com.mycompany.interfaces.IDiplomadoFacadeLocal;
import com.mycompany.interfaces.IUniversidadFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.modelmapper.ModelMapper;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author angie
 */

@Named(value = "diplomadoController")
@SessionScoped
public class DiplomadoController implements Serializable{
    /**
     * declaracion de variables
     */
    private String nombre;
    private String duracion;
    private Date fechaIncio;
    private Date fechaFin;
    private List<Universidad> listaUniversidades;
    private int auxUniversidad;
    
    //Declaracion de instancias para acceder a los P.O.J.O de cada clase
    DTODiplomado dtoDiplomado = new DTODiplomado();
    DTOUniversidad dtoUniversidad = new DTOUniversidad();
    
    //Declaracion de instancias para obtener metodos de la persistencia
    @EJB
    IDiplomadoFacadeLocal diplomadoFacade;
    
    @EJB
    IUniversidadFacadeLocal universidadFacade;
    
    @Inject
    private EstudianteController estController;
    /**
     * Constructor donde se inicializa la lista de universidades
     */
    public DiplomadoController() {
        listaUniversidades = new ArrayList();
    }
    /**
     * Metodo que se inicializa para llenar la lista de universidades encontradas en el facade
     */
    @PostConstruct
    public void _init(){
        listaUniversidades = universidadFacade.findAll();
    }
    
    public void llenarLista(){
        listaUniversidades = universidadFacade.findAll();
    }
    /**
     * Metodo que retorna lista de diplomados
     * @return 
     */
    public List<Diplomado> listarDiplomado(){
        return diplomadoFacade.findAll();
    }
    /**
     * Metodo para insertar diplomado a la base de datos
     */
    public void crearDiplomado(){
        
        Universidad uni = universidadFacade.find(auxUniversidad);
        Diplomado dip = new Diplomado(nombre, duracion, fechaIncio, fechaFin, uni);
        List<Diplomado> listaDiplomado = new ArrayList<>();
        listaDiplomado.add(dip);
        dip.setUniversidad(uni);
        diplomadoFacade.create(dip);
        estController.llenarLista();
        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                        "Diplomado "+nombre+" agregado"));
    }
    /**
     * Metodo para editar elemento
     * @param event 
     */
    public void onRowEdit(RowEditEvent event){
        ModelMapper model = new ModelMapper();
        DTODiplomado dtoDiplomado = model.map(event.getObject(), DTODiplomado.class);
        diplomadoFacade.editarDiplomado(dtoDiplomado);
        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Editado",
                        "Diplomado Editado"));
    }
    /**
     * Metodo para cancelar accion de editar
     * @param event 
     */
    public void onRowCancel(RowEditEvent event){
        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cancelado",
                        "Transacción cancelada por el uduario"));
    }
    /**
     * 
     * @return 
     */
    public EstudianteController getEstController() {
        return estController;
    }
    /**
     * 
     * @param estController 
     */
    public void setEstController(EstudianteController estController) {
        this.estController = estController;
    }
    /**
     * 
     * @return 
     */
    public List<Universidad> getListaUniversidades() {
        return listaUniversidades;
    }
    /**
     * 
     * @param listaUniversidades 
     */
    public void setListaUniversidades(List<Universidad> listaUniversidades) {
        this.listaUniversidades = listaUniversidades;
    }
    /**
     * 
     * @return 
     */
    public int getAuxUniversidad() {
        return auxUniversidad;
    }
    /**
     * 
     * @param auxUniversidad 
     */
    public void setAuxUniversidad(int auxUniversidad) {
        this.auxUniversidad = auxUniversidad;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public String getDuracion() {
        return duracion;
    }
    /**
     * 
     * @param duracion 
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    /**
     * 
     * @return 
     */
    public DTODiplomado getDtoDiplomado() {
        return dtoDiplomado;
    }
    /**
     * 
     * @param dtoDiplomado 
     */
    public void setDtoDiplomado(DTODiplomado dtoDiplomado) {
        this.dtoDiplomado = dtoDiplomado;
    }
    /**
     * 
     * @return 
     */
    public IDiplomadoFacadeLocal getDiplomadoFacade() {
        return diplomadoFacade;
    }
    /**
     * 
     * @param diplomadoFacade 
     */
    public void setDiplomadoFacade(IDiplomadoFacadeLocal diplomadoFacade) {
        this.diplomadoFacade = diplomadoFacade;
    }
    /**
     * 
     * @return 
     */
    public Date getFechaIncio() {
        return fechaIncio;
    }
    /**
     * 
     * @param fechaIncio 
     */
    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }
    /**
     * 
     * @return 
     */
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * 
     * @param fechaFin 
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
