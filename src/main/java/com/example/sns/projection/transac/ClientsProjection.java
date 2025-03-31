package com.example.sns.projection.transac;

import java.sql.Date;

public interface ClientsProjection {

    int getId();
    int getAdressID();
    Date getDateInscription();
    char getSexe();
    Date getDateNaissance();
    String getEtatCivil();
    double getSalaireMensuel();
}
