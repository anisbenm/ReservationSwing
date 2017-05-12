/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import swinga.entity.Client;

/**
 *
 * @author Administrateur
 */
public class ComboBoxModelClient extends DefaultComboBoxModel{

   
    private List<Client> listClient;
    
    public List<Client> getListClient() {
        return listClient;
    }

    public ComboBoxModelClient(List<Client> listClient) {
        this.listClient = listClient;
    }
    
     @Override
    public Object getElementAt(int index) {
       return listClient.get(index).getNom();
    }

    @Override
    public int getSize() {
        return listClient.size();
       
    }

    
  
    
    
    
}
