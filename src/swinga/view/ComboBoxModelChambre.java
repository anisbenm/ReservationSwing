/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import swinga.entity.Chambre;

/**
 *
 * @author Administrateur
 */
public class ComboBoxModelChambre extends DefaultComboBoxModel {
    
    private List<Chambre> listChambre;

    public ComboBoxModelChambre(List<Chambre> listChambre) {
        this.listChambre = listChambre;
    }

    @Override
    public String getElementAt(int index) {
        return listChambre.get(index).getNom();
    }

    @Override
    public int getSize() {
        return listChambre.size();
    }
    
    
}