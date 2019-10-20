/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTOEstudiante;
import com.mycompany.entity.Diplomado;
import com.mycompany.entity.Estudiante;
import com.mycompany.interfaces.IDiplomadoFacadeLocal;
import com.mycompany.interfaces.IEstudianteFacadeLocal;
import com.mycompany.interfaces.IUniversidadFacadeLocal;
import com.mycompany.utilitarios.AgregarFoto;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author angie
 */
@Named(value = "estudianteController")
@SessionScoped
public class EstudianteController implements Serializable {

    private UploadedFile file;
    private String nombre;
    private String cedula;
    private String foto;
    DTOEstudiante dtoEstudiante = new DTOEstudiante();
    private List<Diplomado> listaDiplomado;
    private int auxDiplomado;

    @EJB
    IEstudianteFacadeLocal estudianteFacade;

    @EJB
    IDiplomadoFacadeLocal diplomadoFacade;

    @EJB
    IUniversidadFacadeLocal universidadFacade;

    public EstudianteController() {
        listaDiplomado = new ArrayList();
    }

    @PostConstruct
    public void _init() {
        listaDiplomado = diplomadoFacade.findAll();
    }

    public void llenarLista() {
        listaDiplomado = diplomadoFacade.findAll();
    }

    public List<Estudiante> listarEstudiante() {
        return estudianteFacade.findAll();
    }

    public void crearEstudiante() {
        try {
            if (file != null) {
                AgregarFoto add = new AgregarFoto();
                foto = add.copyFile(file.getFileName(), file.getInputstream());
                Diplomado dip = diplomadoFacade.find(auxDiplomado);
                Estudiante est = new Estudiante(nombre, cedula, foto, dip);
                List<Estudiante> listaEstudiante = new ArrayList<>();
                listaEstudiante.add(est);

                estudianteFacade.create(est);

                FacesContext fCtx = FacesContext.getCurrentInstance();
                fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                        "Estudiante " + nombre + " agregado"));
            } else {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No hay archivos cargados.");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void handleFileUpload(FileUploadEvent event) {
        if (event != null) {
            file = event.getFile();
        }
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
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
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public DTOEstudiante getDtoEstudiante() {
        return dtoEstudiante;
    }

    /**
     *
     * @param dtoEstudiante
     */
    public void setDtoEstudiante(DTOEstudiante dtoEstudiante) {
        this.dtoEstudiante = dtoEstudiante;
    }

    /**
     *
     * @return
     */
    public IEstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    /**
     *
     * @param estudianteFacade
     */
    public void setEstudianteFacade(IEstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
    }

    /**
     *
     * @return
     */
    public List<Diplomado> getListaDiplomado() {
        return listaDiplomado;
    }

    /**
     *
     * @param listaDiplomado
     */
    public void setListaDiplomado(List<Diplomado> listaDiplomado) {
        this.listaDiplomado = listaDiplomado;
    }

    /**
     *
     * @return
     */
    public int getAuxDiplomado() {
        return auxDiplomado;
    }

    /**
     *
     * @param auxDiplomado
     */
    public void setAuxDiplomado(int auxDiplomado) {
        this.auxDiplomado = auxDiplomado;
    }

    /**
     *
     * @return
     */
    public String getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

}
