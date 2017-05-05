/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class JFramePrincipale extends JFrame {

    public JFramePrincipale() {

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//arrete le processus à la fermeture de la fenetre

        JPanel panneau = new JPanel();

//        for (int i = 0; i < 100; i++) {
////            panneau.add(new JButton("" +( i + 1)));
//            panneau.add(new JButton("" + (i + 1)));
//        }
//        panneau.setLayout(new GridLayout(10, 10));
//        JButton bouton = new JButton("etki");
//        panneau.add(bouton);
        this.add(panneau);
//        this.add(new JPanelHotel()); 
        this.add(new JPanelPrincipale());
        this.setVisible(true);

    }

}
