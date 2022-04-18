/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Axel
 */
public class AjustarImagen {
    public void EscalarLabel(JLabel label,String URLImagen){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(URLImagen)).getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
        
    }
}
