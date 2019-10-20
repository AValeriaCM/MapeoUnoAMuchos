/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author angie
 */

@Entity
@Table
public class Diplomado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private String duracion;
    @Column (name = "fecha_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Column (name = "fecha_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    @ManyToOne
    @JoinColumn(name = "universidad_id", nullable = false)
    private Universidad universidad;
    @OneToMany(mappedBy = "diplomado", cascade = CascadeType.ALL)
    private List<Estudiante> listaEstudiante;
    
    
    public Diplomado() {
    }

    
    
    /**
     * 
     * @param nombre
     * @param duracion
     * @param fechaInicio
     * @param fechaFin
     * @param universidad 
     */
    public Diplomado(String nombre, String duracion, Date fechaInicio, Date fechaFin, Universidad universidad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.universidad = universidad;
    }

    /**
     *
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
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
    public List<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }
    /**
     * 
     * @param listaEstudiante 
     */
    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
}
