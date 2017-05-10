/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view.tablemodel;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import swinga.entity.Reservation;

/**
 *
 * @author Administrateur
 */
public class TableModelReservation extends AbstractTableModel{
    private List<Reservation> listReservations;

    public TableModelReservation(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }


    
    @Override
    public int getRowCount() {
        return listReservations.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation res = listReservations.get(rowIndex);
        switch(columnIndex){
            case 0:return res.getId();
            case 1: return res.getClient();
            case 2: return res.getChambres();
        }
        return new RuntimeException("index colonne reservation error");
    }
    
    
}
