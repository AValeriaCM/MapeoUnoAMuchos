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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author angie
 */

@Entity
@Table(name = "universidad")
public class Universidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private String extension;
    @Column
    private String escudo;
    @OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
    private List<Diplomado> listaDiplomados;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fundacion;

    public Universidad() {
    }
    
    
    /**
     * 
     * @param nombre
     * @param extension
     * @param escudo
     * @param fundacion 
     */
    public Universidad(String nombre, String extension, String escudo, Date fundacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
        this.fundacion = fundacion;
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
    public String getEscudo() {
        return escudo;
    }
    /**
     * 
     * @param escudo 
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    /**
     * 
     * @return 
     */
    public List<Diplomado> getListaDiplomados() {
        return listaDiplomados;
    }
    /**
     * 
     * @param listaDiplomados 
     */
    public void setListaDiplomados(List<Diplomado> listaDiplomados) {
        this.listaDiplomados = listaDiplomados;
    }
    /**
     * 
     * @return 
     */
    public Date getFundacion() {
        return fundacion;
    }
    /**
     * 
     * @param fundacion 
     */
    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }
    
    
    
}
