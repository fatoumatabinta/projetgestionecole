/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.imp;

import java.util.ArrayList;
import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.Doa.IGroupe;
import sn.fatoumatabintandiaye.gestionscolaire.model.Groupe;

/**
 *
 * @author ester maria
 */
public class GroupeImp implements IGroupe {
    
     ArrayList<Groupe> grou = new ArrayList<>();
            
     @Override
    public void addGroupe(Groupe groupe) {
       grou.add(groupe);
    }
    
    @Override
    public void updateGroupe(Groupe groupe) {
        for (Groupe groupes2:grou)
       {
           if(groupes2.getId()==groupe.getId())
           {
               groupes2.setNomGroupe(groupe.getNomGroupe());
               groupes2.setDate_creation(groupe.getDate_creation());
           }
       } 
    }

    @Override
    public Groupe getGroupebyId(int i) {
        for(Groupe groupes:grou)
        {
            if(groupes.getId()==i)
            {
                return groupes;
            }
        }
        return null;
    }

    @Override
    public List<Groupe> getAllGroupe() {
       return grou;
    }

    @Override
    public void deleteGroupe(Groupe groupe) {
        grou.remove(groupe);
    }
}
