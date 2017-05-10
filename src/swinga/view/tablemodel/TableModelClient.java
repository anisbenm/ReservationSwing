/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import swinga.entity.Client;

/**
 *
 * @author Administrateur
 */
public class TableModelClient extends AbstractTableModel{
    private List<Client> listeClients;

    public TableModelClient(List<Client> listeClients) {
        this.listeClients = listeClients;
    }
    

    @Override
    public int getRowCount() {
        return listeClients.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client cl = listeClients.get(rowIndex);
        switch(columnIndex){
            case 0: return cl.getId();
            case 1: return cl.getNom();
            case 2: return cl.getPrenom();
        }
        return new RuntimeException("Indice de colonne client incorrect");
    }
    
}
