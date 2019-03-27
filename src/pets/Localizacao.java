
package pets;


public class Localizacao {
    
    /* Latitude DDºDDDDD*/
    private double latitude;
    
    /* Longitude DDDºDDDDD*/
    private double longitude;
    
    /* Construtor padrão */
    public Localizacao(String latitude, String longitude){
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
    }
    
    public double getLatitude() {
        return latitude;
    }

    public void getLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }

    public void getLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public void imprimirLocalizacao(){
        System.out.println("Localização atual é: "+ latitude+","+longitude);
    }
}
