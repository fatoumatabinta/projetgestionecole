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
public class GroupeEtudiants {
    private int id ;
    private  String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String login;
    private String password;
    private String nomGroupe;
     private String carte_etudians;

    public GroupeEtudiants() {
    }

    public GroupeEtudiants(int id, String nom, String prenom, String adresse, String tel, String login, String password, String nomGroupe, String carte_etudians) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.login = login;
        this.password = password;
        this.nomGroupe = nomGroupe;
        this.carte_etudians = carte_etudians;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getCarte_etudians() {
        return carte_etudians;
    }

    public void setCarte_etudians(String carte_etudians) {
        this.carte_etudians = carte_etudians;
    }

    @Override
    public String toString() {
        return "GroupeEtudiants{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", login=" + login + ", password=" + password + ", nomGroupe=" + nomGroupe + ", carte_etudians=" + carte_etudians + '}';
    }
    
    
}
