/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.imp;

import java.util.ArrayList;
import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.Doa.IGroupeEtudiants;
import sn.fatoumatabintandiaye.gestionscolaire.model.GroupeEtudiants;

/**
 *
 * @author ester maria
 */
public class GroupeEtudiantsImp implements IGroupeEtudiants{

    ArrayList<GroupeEtudiants> groupEtud = new ArrayList<GroupeEtudiants>();
    
    @Override
    public void addGroupeEtudiant(GroupeEtudiants groetu) {
        groupEtud.add(groetu);
    }

    @Override
    public void deleteGrpEtudiant(GroupeEtudiants GE) {
        groupEtud.remove(GE);
    }

    @Override
    public void updateGrpEtudiants(GroupeEtudiants etudiant) {
        for (GroupeEtudiants etudiants2:groupEtud)
       {
           if(etudiants2.getId()==etudiant.getId())
           {
               etudiants2.setAdresse(etudiant.getAdresse());
               etudiants2.setCarte_etudians(etudiant.getCarte_etudians());
               etudiants2.setNom(etudiant.getNom());
               etudiants2.setLogin(etudiant.getLogin());
               etudiants2.setPassword(etudiant.getPassword());
               etudiants2.setPrenom(etudiant.getPrenom());
               etudiants2.setNomGroupe(etudiant.getNomGroupe());
           }
       }
    }

    @Override
    public GroupeEtudiants getGroupeEtudiantsbyId(int i) {
        for(GroupeEtudiants etudiants:groupEtud)
        {
            if(etudiants.getId()==i)
            {
                return etudiants;
            }
        }
        return null;
    }

    @Override
    public List<GroupeEtudiants> getAllgrpEtudiants() {
        return groupEtud;
    }
    
}
