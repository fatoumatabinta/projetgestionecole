/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.Doa;

import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.model.GroupeEtudiants;

/**
 *
 * @author fatoumata binta 
 */
public interface IGroupeEtudiants {
    public void addGroupeEtudiant(GroupeEtudiants groetu);
    public void deleteGrpEtudiant (GroupeEtudiants id);
    public void updateGrpEtudiants(GroupeEtudiants etudiant);
    public GroupeEtudiants getGroupeEtudiantsbyId(int i);
    public List<GroupeEtudiants> getAllgrpEtudiants();
    
}
