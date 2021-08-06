/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.model;

/**
 *
 * @author fatoumata binta
 */
public class Professeur extends Personne{
    private String Salaire;

    public Professeur(int id, String nom, String prenom, String adresse, String tel, String login, String password) {
        super(id, nom, prenom, adresse, tel, login, password);
    }

    public String getSalaire() {
        return Salaire;
    }

    public void setSalaire(String Salaire) {
        this.Salaire = Salaire;
    }
    
    
    
}
