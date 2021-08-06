/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.Doa;

import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.model.Groupe;


/**
 *
 * @author fatoumata binta
 */
public interface IGroupe {
    public void addGroupe(Groupe group);
    public void deleteGroupe (Groupe id);
    public void updateGroupe(Groupe group);
    public Groupe getGroupebyId(int i);
    public List<Groupe> getAllGroupe();
    
}
