/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.imp;

import java.util.ArrayList;
import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.Doa.IEtudiant;
import sn.fatoumatabintandiaye.gestionscolaire.model.Etudiants;

/**
 *
 * @author ester maria
 */
public class EtudiantImp implements IEtudiant{

    ArrayList<Etudiants> etud = new ArrayList<Etudiants>();
            
    @Override
    public void addEtudiant(Etudiants etudiant) {
       etud.add(etudiant);
    }

    @Override
    public void deleteEtiant(Etudiants etudiant) {
        etud.remove(etudiant);
    }

    @Override
    public void updateEtudiants(Etudiants etudiant) {
        for (Etudiants etudiants2:etud)
       {
           if(etudiants2.getId()==etudiant.getId())
           {
               etudiants2.setAdresse(etudiant.getAdresse());
               etudiants2.setCarte_etudians(etudiant.getCarte_etudians());
               etudiants2.setNom(etudiant.getNom());
               etudiants2.setLogin(etudiant.getLogin());
               etudiants2.setPassword(etudiant.getPassword());
               etudiants2.setPrenom(etudiant.getPrenom());
           }
       } 
    }

    @Override
    public Etudiants getEtudiantsbyId(int i) {
        for(Etudiants etudiants:etud)
        {
            if(etudiants.getId()==i)
            {
                return etudiants;
            }
        }
        return null;
    }

    @Override
    public List<Etudiants> getAllEtudiants() {
       return etud;
    }
    
}
