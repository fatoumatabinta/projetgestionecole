/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.imp;

import java.util.ArrayList;
import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.model.Professeur;


/**
 *
 * @author ester maria
 */
public class ProfesseurImp{
     ArrayList<Professeur> pro = new ArrayList<Professeur>();
     
    public void addProfesseur(Professeur prof) {
       pro.add(prof);
    }

    public void deleteProfesseur(Professeur prof) {
        pro.remove(prof);
    }

    public void updateProfesseur(Professeur prof) {
        for (Professeur professeur2:pro)
       {
           if(professeur2.getId()==prof.getId())
           {
               professeur2.setAdresse(prof.getAdresse());
               professeur2.setSalaire(prof.getSalaire());
               professeur2.setNom(prof.getNom());
               professeur2.setLogin(prof.getLogin());
               professeur2.setPassword(prof.getPassword());
               professeur2.setPrenom(prof.getPrenom());
           }
       } 
    }

    public Professeur getProfesseurbyId(int i) {
        for(Professeur prof:pro)
        {
            if(prof.getId()==i)
            {
                return prof;
            }
        }
        return null;
    }

    public List<Professeur> getAllprofesseur() {
       return pro;
    }
    
}
