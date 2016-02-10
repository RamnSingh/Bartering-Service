/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.bartering.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "t_utilisateur", catalog = "prj_001_jav", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUtilisateur.findAll", query = "SELECT t FROM TUtilisateur t"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurId", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurId = :utilisateurId"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurPseudo", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurPseudo = :utilisateurPseudo"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurMail", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurMail = :utilisateurMail"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurMdpx", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurMdpx = :utilisateurMdpx"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurTel", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurTel = :utilisateurTel"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurCp", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurCp = :utilisateurCp"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurnbobjettroc", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurnbobjettroc = :utilisateurnbobjettroc"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurnbobjetvendu", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurnbobjetvendu = :utilisateurnbobjetvendu"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurnbobjetachete", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurnbobjetachete = :utilisateurnbobjetachete"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurnbobjetligne", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurnbobjetligne = :utilisateurnbobjetligne"),
    @NamedQuery(name = "TUtilisateur.findByUtilisateurnote", query = "SELECT t FROM TUtilisateur t WHERE t.utilisateurnote = :utilisateurnote")})
public class TUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Utilisateur_Id", nullable = false)
    private Integer utilisateurId;
    @Size(max = 35)
    @Column(name = "Utilisateur_Pseudo", length = 35)
    private String utilisateurPseudo;
    @Size(max = 60)
    @Column(name = "Utilisateur_Mail", length = 60)
    private String utilisateurMail;
    @Size(max = 60)
    @Column(name = "Utilisateur_Mdpx", length = 60)
    private String utilisateurMdpx;
    @Size(max = 10)
    @Column(name = "Utilisateur_Tel", length = 10)
    private String utilisateurTel;
    @Size(max = 5)
    @Column(name = "Utilisateur_Cp", length = 5)
    private String utilisateurCp;
    @Column(name = "Utilisateur_nb_objet_troc")
    private Integer utilisateurnbobjettroc;
    @Column(name = "Utilisateur_nb_objet_vendu")
    private Integer utilisateurnbobjetvendu;
    @Column(name = "Utilisateur_nb_objet_achete")
    private Integer utilisateurnbobjetachete;
    @Column(name = "Utilisateur_nb_objet_ligne")
    private Integer utilisateurnbobjetligne;
    @Column(name = "Utilisateur_note")
    private Integer utilisateurnote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteNoteId")
    private List<TNote> tNoteList;

    public TUtilisateur() {
    }

    public TUtilisateur(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getUtilisateurPseudo() {
        return utilisateurPseudo;
    }

    public void setUtilisateurPseudo(String utilisateurPseudo) {
        this.utilisateurPseudo = utilisateurPseudo;
    }

    public String getUtilisateurMail() {
        return utilisateurMail;
    }

    public void setUtilisateurMail(String utilisateurMail) {
        this.utilisateurMail = utilisateurMail;
    }

    public String getUtilisateurMdpx() {
        return utilisateurMdpx;
    }

    public void setUtilisateurMdpx(String utilisateurMdpx) {
        this.utilisateurMdpx = utilisateurMdpx;
    }

    public String getUtilisateurTel() {
        return utilisateurTel;
    }

    public void setUtilisateurTel(String utilisateurTel) {
        this.utilisateurTel = utilisateurTel;
    }

    public String getUtilisateurCp() {
        return utilisateurCp;
    }

    public void setUtilisateurCp(String utilisateurCp) {
        this.utilisateurCp = utilisateurCp;
    }

    public Integer getUtilisateurnbobjettroc() {
        return utilisateurnbobjettroc;
    }

    public void setUtilisateurnbobjettroc(Integer utilisateurnbobjettroc) {
        this.utilisateurnbobjettroc = utilisateurnbobjettroc;
    }

    public Integer getUtilisateurnbobjetvendu() {
        return utilisateurnbobjetvendu;
    }

    public void setUtilisateurnbobjetvendu(Integer utilisateurnbobjetvendu) {
        this.utilisateurnbobjetvendu = utilisateurnbobjetvendu;
    }

    public Integer getUtilisateurnbobjetachete() {
        return utilisateurnbobjetachete;
    }

    public void setUtilisateurnbobjetachete(Integer utilisateurnbobjetachete) {
        this.utilisateurnbobjetachete = utilisateurnbobjetachete;
    }

    public Integer getUtilisateurnbobjetligne() {
        return utilisateurnbobjetligne;
    }

    public void setUtilisateurnbobjetligne(Integer utilisateurnbobjetligne) {
        this.utilisateurnbobjetligne = utilisateurnbobjetligne;
    }

    public Integer getUtilisateurnote() {
        return utilisateurnote;
    }

    public void setUtilisateurnote(Integer utilisateurnote) {
        this.utilisateurnote = utilisateurnote;
    }

    @XmlTransient
    public List<TNote> getTNoteList() {
        return tNoteList;
    }

    public void setTNoteList(List<TNote> tNoteList) {
        this.tNoteList = tNoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utilisateurId != null ? utilisateurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUtilisateur)) {
            return false;
        }
        TUtilisateur other = (TUtilisateur) object;
        if ((this.utilisateurId == null && other.utilisateurId != null) || (this.utilisateurId != null && !this.utilisateurId.equals(other.utilisateurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.supinfo.bartering.entity.TUtilisateur[ utilisateurId=" + utilisateurId + " ]";
    }
    
}
