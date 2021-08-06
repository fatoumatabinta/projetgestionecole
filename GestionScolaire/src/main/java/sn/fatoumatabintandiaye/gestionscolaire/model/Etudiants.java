/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.model;

/**
 *
 * @author fatoumata
 */
public class Etudiants extends Personne{
    private String carte_etudians;

    public Etudiants(int id, String nom, String prenom, String adresse, String tel, String login, String password) {
        super(id, nom, prenom, adresse, tel, login, password);
    }

    public String getCarte_etudians() {
        return carte_etudians;
    }

    public void setCarte_etudians(String carte_etudians) {
        this.carte_etudians = carte_etudians;
    }

    @Override
    public String toString() {
        return "Etudiants{" + "carte_etudians=" + carte_etudians + '}';
    } 
}
