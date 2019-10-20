/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTOUniversidad;
import com.mycompany.entity.Universidad;
import com.mycompany.interfaces.IUniversidadFacadeLocal;
import com.mycompany.utilitarios.AgregarFoto;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.modelmapper.ModelMapper;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author angie
 */
@Named(value = "universidadController")
@ViewScoped
public class UniversidadController implements Serializable {

    private UploadedFile file;//una variable de tipo archivo que vamos a usar para poder enviar los parametros del file y as[i lograr almacenarlos
    private String nombre;
    private String extension;
    private String escudo;
    private Date fundacion;

    DTOUniversidad dtoUniversidad = new DTOUniversidad();

    @Inject
    private DiplomadoController dipController;

    @EJB
    IUniversidadFacadeLocal universidadFacade;

    public UniversidadController() {
    }

    public List<Universidad> listarUniversidad() {
        return universidadFacade.findAll();
    }

    public void crearUniversidad() {
        try {
            if (file != null) {//verificamos que exista un archivo
                AgregarFoto add = new AgregarFoto();
                String foto = add.copyFile(file.getFileName(), file.getInputstream());//obtenemos el nombre de la imagen almacenada
                dtoUniversidad.setNombre(nombre);
                dtoUniversidad.setExtension(extension);
                dtoUniversidad.setEscudo(foto);
                dtoUniversidad.setFundacion(fundacion);

                universidadFacade.crearUniversidad(dtoUniversidad);
                dipController.llenarLista();
                FacesContext fCtx = FacesContext.getCurrentInstance();
                fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                        "Universidad " + nombre + " agregada"));
            } else {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No hay archivos cargados.");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void onRowEdit(RowEditEvent event) {
        ModelMapper model = new ModelMapper();
        DTOUniversidad dtoUni = model.map(event.getObject(), DTOUniversidad.class);
        universidadFacade.editarUniversidad(dtoUni);

        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Editado",
                "Universidad Editada"));
    }

    public void onRowCancel(RowEditEvent event) {
        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cancelado",
                "Transacción cancelada por el uduario"));
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

    public String getNombre() {
        return nombre;
    }

    public DiplomadoController getDipController() {
        return dipController;
    }

    public void setDipController(DiplomadoController dipController) {
        this.dipController = dipController;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public DTOUniversidad getDtoUniversidad() {
        return dtoUniversidad;
    }

    public void setDtoUniversidad(DTOUniversidad dtoUniversidad) {
        this.dtoUniversidad = dtoUniversidad;
    }

    public IUniversidadFacadeLocal getUniversidadFacade() {
        return universidadFacade;
    }

    public void setUniversidadFacade(IUniversidadFacadeLocal universidadFacade) {
        this.universidadFacade = universidadFacade;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

}
