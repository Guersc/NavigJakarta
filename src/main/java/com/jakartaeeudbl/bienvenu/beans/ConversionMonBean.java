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


@Named("conversionMonBean")
@RequestScoped
public class ConversionMonBean {
    private double monnaieRoupi;
    private double montantFranc;
    private double montantDollar;

    public double getMonnaieRoupi() {
        return monnaieRoupi;
    }

    public void setMonnaieRoupi(double monnaieRoupi) {
        this.monnaieRoupi = monnaieRoupi;
    }

    public double getMontantFranc() {
        return montantFranc;
    }

    public double getMontantDollar() {
        return montantDollar;
    }

    public void convertir() {
        montantFranc = convertirEnFranc();
        montantDollar = convertirEnDollar();
    }

    private double convertirEnFranc() {
        // Utilisation d'un taux de conversion fictif basé sur le marché mondial actuel
        double tauxDeConversion = 0.045; // Exemple de taux pour convertir la Roupie en Franc Congolais
        return monnaieRoupi * tauxDeConversion;
    }

    private double convertirEnDollar() {
        // Utilisation d'un taux de conversion fictif basé sur le marché mondial actuel
        double tauxDeConversion = 0.030; // Exemple de taux pour convertir la Roupie en Dollar
        return monnaieRoupi * tauxDeConversion;
    }
}
