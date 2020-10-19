/**
 * Un ejemplo que modela un Circulo usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Circulo {

    float origenX, origenY, radio;

    public Circulo() {
    }

    public Circulo(float origenX, float origenY, float radio) {
        this.origenX = origenX;
        this.origenY = origenY;
        this.radio = radio;
    }

    /**Metodo de acceso a la propiedad origenX*/
    public float getCentroX(){
        return this.origenX;
    }//end method getOrigenX

    /**Metodo de modificación a la propiedad origenX*/
    public void setCentroX(float origenX){
        this.origenX = origenX;
    }//end method setOrigenX;
    
    /**Metodo de acceso a la propiedad origenY*/
    public float getCentroY(){
        return this.origenY;
    }//end method getOrigenX

    /**Metodo de modificación a la propiedad origenY*/
    public void setCentroY(float origenY){
        this.origenY = origenY;
    }//end method setOrigenY;
    
    /**Metodo de acceso a la propiedad radio*/
    public float getRadio(){
        return this.radio;
    }//end method getRadio

    /**Metodo de modificación a la propiedad radio*/
    public void setRadio(float radio){
        this.radio = radio;
    }//end method setRadio;
    
    /**
     * 
     * @param x coordenada x del punto
     * @param y coordenada y del punto
     * @return
     */
    public String getPosicionPunto(float x, float y) {
        String ubicacion = "Ubicacion Desconocida";

        if (puntoEstaDentro(x,y)) {
            ubicacion = "Punto Dentro del Circulo";
        } else if (puntoEstaEnBorde(x,y)) {
            ubicacion = "Punto En Borde de Circulo";
        } else {
            ubicacion = "Punto Fuera del Circulo";
        }

        return ubicacion;
    }//fin método getPosiciónPunto
    
    public boolean puntoEstaDentro(float x, float y) {
        return ((x-origenX)*(x-origenX)+(y-origenY)*(y-origenY))<radio*radio;
    }//fin método puntoEstaDentro 
    
    public boolean puntoEstaFuera(float x, float y) {
        return ((x-origenX)*(x-origenX)+(y-origenY)*(y-origenY))>radio*radio;
    }//fin método puntoEstaFuera
    
    public boolean puntoEstaEnBorde(float x, float y) {
        return ((x-origenX)*(x-origenX)+(y-origenY)*(y-origenY))==radio*radio;
    }//fin puntoEstaEnBordeSuperior
    
}//fin clase Circulo

