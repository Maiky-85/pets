/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

//import java.awt.Graphics;
import java.awt.Image;
//import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author B. Dalzini
 */
public class TesteResizeFoto {
    
    
    
    
    
    public ImageIcon ResizeImage(String ImagePath, JLabel labelIcon)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg;
        
        if(labelIcon.getWidth() > labelIcon.getHeight()){
            newImg = img.getScaledInstance(labelIcon.getWidth(), -1, Image.SCALE_SMOOTH);
        }
        else{
            newImg = img.getScaledInstance(-1, labelIcon.getHeight(), Image.SCALE_SMOOTH);
        }
        
        //g.drawImage(img.getScaledInstance(labelIcon.getWidth(), -1, Image.SCALE_SMOOTH), labelIcon.getX(), labelIcon.getY(), this);

        //BufferedImage newImg = Scalr.resize(labelIcon.getWidth(), img.getHeight(labelIcon));
        
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}


