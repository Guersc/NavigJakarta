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
@Named("lieuBean")
@RequestScoped



public class lieuBean  {

    private String name;
    private String description;
    private double latitude;
    private double longitude;

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Méthode pour ajouter un lieu
    public void addLieu() {
        // Logique pour ajouter un lieu, par exemple, sauvegarder dans une base de données
        System.out.println("Lieu ajouté : " + name + ", " + description + ", " + latitude + ", " + longitude);
    }
}