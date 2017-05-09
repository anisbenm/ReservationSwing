/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import swinga.entity.Hotel;

/**
 *
 * @author Administrateur
 */
public class TableModelHotel extends AbstractTableModel{
    private List<Hotel> hotels;
    
    private TableModelHotel(){
    }

    public TableModelHotel(List<Hotel> hotels) {
        this.hotels = hotels;
    }
    
    
    @Override
    public int getRowCount() {
        return hotels.size();
    }

    @Override
    public int getColumnCount() {//nombre de colonnes que nous voulons afficher
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hotel hotel = hotels.get(rowIndex);
        switch(columnIndex){
        case 0: return hotel.getId();
        case 1: return hotel.getNom();
        }
        return new RuntimeException("Indice de colonne incorrect");
    }
    
}
