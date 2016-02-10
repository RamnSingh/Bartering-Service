/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.bartering.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "t_note", catalog = "prj_001_jav", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TNote.findAll", query = "SELECT t FROM TNote t"),
    @NamedQuery(name = "TNote.findByNoteId", query = "SELECT t FROM TNote t WHERE t.noteId = :noteId"),
    @NamedQuery(name = "TNote.findByNoteNoteurId", query = "SELECT t FROM TNote t WHERE t.noteNoteurId = :noteNoteurId"),
    @NamedQuery(name = "TNote.findByNoteVal", query = "SELECT t FROM TNote t WHERE t.noteVal = :noteVal"),
    @NamedQuery(name = "TNote.findByNoteDate", query = "SELECT t FROM TNote t WHERE t.noteDate = :noteDate")})
public class TNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "note_id", nullable = false)
    private Integer noteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "note_noteur_id", nullable = false)
    private int noteNoteurId;
    @Column(name = "note_val")
    private Integer noteVal;
    @Lob
    @Size(max = 65535)
    @Column(name = "note_commentaire", length = 65535)
    private String noteCommentaire;
    @Column(name = "note_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date noteDate;
    @JoinColumn(name = "note_note_id", referencedColumnName = "Utilisateur_Id", nullable = false)
    @ManyToOne(optional = false)
    private TUtilisateur noteNoteId;

    public TNote() {
    }

    public TNote(Integer noteId) {
        this.noteId = noteId;
    }

    public TNote(Integer noteId, int noteNoteurId) {
        this.noteId = noteId;
        this.noteNoteurId = noteNoteurId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public int getNoteNoteurId() {
        return noteNoteurId;
    }

    public void setNoteNoteurId(int noteNoteurId) {
        this.noteNoteurId = noteNoteurId;
    }

    public Integer getNoteVal() {
        return noteVal;
    }

    public void setNoteVal(Integer noteVal) {
        this.noteVal = noteVal;
    }

    public String getNoteCommentaire() {
        return noteCommentaire;
    }

    public void setNoteCommentaire(String noteCommentaire) {
        this.noteCommentaire = noteCommentaire;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public TUtilisateur getNoteNoteId() {
        return noteNoteId;
    }

    public void setNoteNoteId(TUtilisateur noteNoteId) {
        this.noteNoteId = noteNoteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noteId != null ? noteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TNote)) {
            return false;
        }
        TNote other = (TNote) object;
        if ((this.noteId == null && other.noteId != null) || (this.noteId != null && !this.noteId.equals(other.noteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.supinfo.bartering.entity.TNote[ noteId=" + noteId + " ]";
    }
    
}
