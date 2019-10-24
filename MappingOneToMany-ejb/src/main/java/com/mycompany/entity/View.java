/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "vista_univ")
@NamedNativeQueries({
    @NamedNativeQuery(name = "reporte", query = "SELECT e.id, u.nombre AS 'nombreUniversidad', u.extension, d.nombre AS 'nombreDiplomado', d.fecha_inicio AS 'fechaInicio', d.fecha_fin AS 'fechaFin', e.nombre AS 'nombreEstudiante', e.foto FROM universidad u JOIN diplomado d ON d.universidad_id = u.id JOIN estudiante e ON e.diplomado_id = d.id", resultClass = View.class)
})
public class View implements Serializable{
    
    @Id
    private int id;
    
    @Column
    private String nombreUniversidad;
    @Column
    private String extension;
    @Column
    private String nombreDiplomado;
    @Column
    private String fechaInicio;
    @Column
    private String fechaFin;
    @Column
    private String nombreEstudiante;
    @Column
    private String foto;
    /**
     * Constructor vacio
     */
    public View() {
    }
    /**
     * Constructor
     * @param nombreUniversidad
     * @param extension
     * @param nombreDiplomado
     * @param fechaInicio
     * @param fechaFin
     * @param nombreEstudiante
     * @param foto 
     */
    public View(String nombreUniversidad, String extension, String nombreDiplomado, String fechaInicio, String fechaFin, String nombreEstudiante, String foto) {
        this.nombreUniversidad = nombreUniversidad;
        this.extension = extension;
        this.nombreDiplomado = nombreDiplomado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEstudiante = nombreEstudiante;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }
    /**
     * 
     * @param nombreUniversidad 
     */
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
    /**
     * 
     * @return 
     */
    public String getExtension() {
        return extension;
    }
    /**
     * 
     * @param extension 
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * 
     * @return 
     */
    public String getNombreDiplomado() {
        return nombreDiplomado;
    }
    /**
     * 
     * @param nombreDiplomado 
     */
    public void setNombreDiplomado(String nombreDiplomado) {
        this.nombreDiplomado = nombreDiplomado;
    }
    /**
     * 
     * @return 
     */
    public String getFechaInicio() {
        return fechaInicio;
    }
    /**
     * 
     * @param fechaInicio 
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * 
     * @return 
     */
    public String getFechaFin() {
        return fechaFin;
    }
    /**
     * 
     * @param fechaFin 
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * 
     * @return 
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    /**
     * 
     * @param nombreEstudiante 
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
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
