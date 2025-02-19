/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakartaeeudbl.bienvenu.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


/**
 *
 * @author HS
 */

@Named("welcomeBean")
@RequestScoped
public class welcomeBean {
    private String nom;
    private String message;

    public String getMessage() {
        return message;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void afficherMessage(){
        if(nom != null && !nom.trim().isEmpty()){
            message = "selamat datang,"+ nom + "!";
        }else{
            message= "";
        }
    }
    
    
}

