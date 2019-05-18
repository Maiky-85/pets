/*
 * PetSOS
 * Aplicativo para localicação de animais domésticos perdidos
 * Projeto de Programação Orientada a Objetos I
 */

/**
 * @author Brunna Dalzini
 * @author Maikysuel Braga
 * @author Rafaela Pessin
*/ 

package pets.modelo;

public class RedeSocial {
    
    private String facebook;
    private String twitter;
    private String instagram;
    private long whatsapp;
    
    public RedeSocial(String facebook, String twitter, String instagram, String whatsapp){
        
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.whatsapp = Long.parseLong(whatsapp);                               // conversão do dado de String para Long
    }
    
    // facebook
    public String getFacebook() {
        return facebook;
    }
    
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    
    // twitter
    public String getTwitter() {
        return twitter;
    }
    
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    
    // instagram
    public String getInstagram() {
        return instagram;
    }
    
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    
    // whatsapp
    public long getWhatsapp() {
        return whatsapp;
    }
    
    public void setWhatsapp(long whatsapp){
        this.whatsapp = whatsapp;
    }
    
    
}
