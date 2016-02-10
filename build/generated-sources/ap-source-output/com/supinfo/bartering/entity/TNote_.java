package com.supinfo.bartering.entity;

import com.supinfo.bartering.entity.TUtilisateur;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-10T23:21:55")
@StaticMetamodel(TNote.class)
public class TNote_ { 

    public static volatile SingularAttribute<TNote, String> noteCommentaire;
    public static volatile SingularAttribute<TNote, Integer> noteNoteurId;
    public static volatile SingularAttribute<TNote, Integer> noteVal;
    public static volatile SingularAttribute<TNote, Date> noteDate;
    public static volatile SingularAttribute<TNote, Integer> noteId;
    public static volatile SingularAttribute<TNote, TUtilisateur> noteNoteId;

}