/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

import java.awt.Image;
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
        
        
        if(MyImage.getIconWidth() < MyImage.getIconHeight()){
            newImg = img.getScaledInstance(labelIcon.getWidth(), -1, Image.SCALE_SMOOTH);
        }
        else{
            newImg = img.getScaledInstance(-1, labelIcon.getHeight(), Image.SCALE_SMOOTH);
        }
        
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}


