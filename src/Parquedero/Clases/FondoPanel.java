/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Axel
 */
public class FondoPanel extends JPanel{
    private Image imagen;
    private String URL="/Parqueadero/imagenes/Imagen_fondo.jpg";
        public FondoPanel() {
           
        }
    public FondoPanel(String URL) {
           this.URL=URL;
        }
    public void setParURL(String parURL) {
        this.URL = parURL;
    }
    
    @Override
    public void paint (Graphics a){
        imagen=new ImageIcon(getClass().getResource(URL)).getImage();
        
        a.drawImage(imagen,0,0, getWidth(),getHeight(),this);
        
        setOpaque(false);
        
        super.paint(a);
    }
    
}