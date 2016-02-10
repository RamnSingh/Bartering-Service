/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.bartering.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "t_objet", catalog = "prj_001_jav", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TObjet.findAll", query = "SELECT t FROM TObjet t"),
    @NamedQuery(name = "TObjet.findByObjetId", query = "SELECT t FROM TObjet t WHERE t.objetId = :objetId"),
    @NamedQuery(name = "TObjet.findByObjetDesignation", query = "SELECT t FROM TObjet t WHERE t.objetDesignation = :objetDesignation"),
    @NamedQuery(name = "TObjet.findByObjetimage", query = "SELECT t FROM TObjet t WHERE t.objetimage = :objetimage"),
    @NamedQuery(name = "TObjet.findByObjetType", query = "SELECT t FROM TObjet t WHERE t.objetType = :objetType"),
    @NamedQuery(name = "TObjet.findByObjetNbVu", query = "SELECT t FROM TObjet t WHERE t.objetNbVu = :objetNbVu"),
    @NamedQuery(name = "TObjet.findByUtilisateurid", query = "SELECT t FROM TObjet t WHERE t.utilisateurid = :utilisateurid")})
public class TObjet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Objet_Id", nullable = false)
    private Integer objetId;
    @Size(max = 220)
    @Column(name = "Objet_Designation", length = 220)
    private String objetDesignation;
    @Lob
    @Size(max = 65535)
    @Column(name = "objet_Description", length = 65535)
    private String objetDescription;
    @Size(max = 220)
    @Column(name = "Objet_image", length = 220)
    private String objetimage;
    @Size(max = 200)
    @Column(name = "objet_type", length = 200)
    private String objetType;
    @Column(name = "objet_nb_vu")
    private Integer objetNbVu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Utilisateur_id", nullable = false)
    private int utilisateurid;

    public TObjet() {
    }

    public TObjet(Integer objetId) {
        this.objetId = objetId;
    }

    public TObjet(Integer objetId, int utilisateurid) {
        this.objetId = objetId;
        this.utilisateurid = utilisateurid;
    }

    public Integer getObjetId() {
        return objetId;
    }

    public void setObjetId(Integer objetId) {
        this.objetId = objetId;
    }

    public String getObjetDesignation() {
        return objetDesignation;
    }

    public void setObjetDesignation(String objetDesignation) {
        this.objetDesignation = objetDesignation;
    }

    public String getObjetDescription() {
        return objetDescription;
    }

    public void setObjetDescription(String objetDescription) {
        this.objetDescription = objetDescription;
    }

    public String getObjetimage() {
        return objetimage;
    }

    public void setObjetimage(String objetimage) {
        this.objetimage = objetimage;
    }

    public String getObjetType() {
        return objetType;
    }

    public void setObjetType(String objetType) {
        this.objetType = objetType;
    }

    public Integer getObjetNbVu() {
        return objetNbVu;
    }

    public void setObjetNbVu(Integer objetNbVu) {
        this.objetNbVu = objetNbVu;
    }

    public int getUtilisateurid() {
        return utilisateurid;
    }

    public void setUtilisateurid(int utilisateurid) {
        this.utilisateurid = utilisateurid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objetId != null ? objetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TObjet)) {
            return false;
        }
        TObjet other = (TObjet) object;
        if ((this.objetId == null && other.objetId != null) || (this.objetId != null && !this.objetId.equals(other.objetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.supinfo.bartering.entity.TObjet[ objetId=" + objetId + " ]";
    }
    
}
