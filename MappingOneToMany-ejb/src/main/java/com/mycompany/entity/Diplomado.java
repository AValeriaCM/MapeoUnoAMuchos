/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
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

/**
 *
 * @author angie
 */

@Entity
@Table(name = "diplomado")
public class Diplomado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "duracion")
    private String duracion;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "universidad_id", nullable = false)
    private Universidad universidad;
    @OneToMany(mappedBy = "diplomado", cascade = CascadeType.ALL)
    private List<Estudiante> listaEstudiante;

    public Diplomado() {
    }
    
    /**
     * Constructor
     * @param id
     * @param nombre
     * @param duracion
     * @param estado 
     */
    public Diplomado(int id, String nombre, String duracion, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.estado = estado;
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
    public boolean isEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
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
    
    
    
}
