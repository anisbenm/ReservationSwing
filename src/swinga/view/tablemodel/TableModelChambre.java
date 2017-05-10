/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import swinga.entity.Chambre;

/**
 *
 * @author Administrateur
 */
public class TableModelChambre extends AbstractTableModel{
    private List<Chambre> listChambres;

    public TableModelChambre(List<Chambre> listChambres) {
        this.listChambres = listChambres;
    }
    
    
    @Override
    public int getRowCount() {
        return listChambres.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chambre ch= listChambres.get(rowIndex);
        switch(columnIndex){
            case 0: return ch.getId();
            case 1: return ch.getNom();
            case 2: return ch.getPrix();
        }
        return new RuntimeException("Indice colonne chambre incorrect");
    }
    
}
