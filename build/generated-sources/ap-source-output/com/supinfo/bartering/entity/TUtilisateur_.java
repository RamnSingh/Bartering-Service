package com.supinfo.bartering.entity;

import com.supinfo.bartering.entity.TNote;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-10T23:21:55")
@StaticMetamodel(TUtilisateur.class)
public class TUtilisateur_ { 

    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurnbobjetligne;
    public static volatile ListAttribute<TUtilisateur, TNote> tNoteList;
    public static volatile SingularAttribute<TUtilisateur, String> utilisateurMail;
    public static volatile SingularAttribute<TUtilisateur, String> utilisateurCp;
    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurId;
    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurnote;
    public static volatile SingularAttribute<TUtilisateur, String> utilisateurTel;
    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurnbobjettroc;
    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurnbobjetvendu;
    public static volatile SingularAttribute<TUtilisateur, String> utilisateurPseudo;
    public static volatile SingularAttribute<TUtilisateur, String> utilisateurMdpx;
    public static volatile SingularAttribute<TUtilisateur, Integer> utilisateurnbobjetachete;

}