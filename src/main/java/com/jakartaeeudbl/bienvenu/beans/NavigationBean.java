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
@Named("NavigationBean")
@RequestScoped
public class NavigationBean {
    
    public String allerAPropos() {
        return "a_propos"; // Retourne l'outcome pour aller à la page apropos.xhtml
    }

    public String allerLieu() {
        return "lieu"; // Retourne l'outcome pour aller à la page lieu.xhtml
    }
    public String voirLieu(){
        return "visiter";
    }
}
