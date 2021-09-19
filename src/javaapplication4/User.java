
package javaapplication4;

import java.awt.Label;
import java.awt.Image;
import javax.swing.*;


public class User {
    
    protected String Nom ;
    protected String Prenom ;
    protected String email;
    protected String Password;
   
    protected String daten;
    
    public User(String nomm,String prenomm,String emaill,String ph,String pwd,String datee)
    {
        this.Nom=nomm;
        this.Prenom=prenomm;
        this.email=emaill;
        this.Password=pwd;
        this.daten=datee;
    }
}
