/**
 * Un ejemplo que modela un Linea usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Linea {

    float x1, x2, y1, y2;

    public Linea() {
    }

    public Linea(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /*complete GET/SET*/
    /**Getter method x1*/
    public float getX1(){
        return this.x1;
    }//end method getX1

    /**Setter method x1*/
    public void setX1(float x1){
        this.x1 = x1;
    }//end method setX1

    /**Getter method x2*/
    public float getX2(){
        return this.x2;
    }//end method getX2

    /**Setter method x2*/
    public void setX2(float x2){
        this.x2 = x2;
    }//end method setX2

    /**Getter method y1*/
    public float getY1(){
        return this.y1;
    }//end method getY1

    /**Setter method y1*/
    public void setY1(float y1){
        this.y1 = y1;
    }//end method setY1

    /**Getter method y2*/
    public float getY2(){
        return this.y2;
    }//end method getY2

    /**Setter method y2*/
    public void setY2(float y2){
        this.y2 = y2;
    }//end method setY2

    public String getUbicacion() {
        String ubicacion = "Error, es imposible";
        if(getCuantosCuadrantes()==1){
            if((estaEnCuadranteI() && !estaEnCuadranteII() && !estaEnCuadranteIII() && !estaEnCuadranteIV())){
                ubicacion = "La linea se encuentra en el cuadrante I";
            }
            else{
                if((!estaEnCuadranteI() && estaEnCuadranteII() && !estaEnCuadranteIII() && !estaEnCuadranteIV())){
                    ubicacion = "La linea se encuentra en el cuadrante II";
                }
                else{
                    if((!estaEnCuadranteI() && !estaEnCuadranteII() && estaEnCuadranteIII() && !estaEnCuadranteIV())){
                        ubicacion = "La linea se encuentra en el cuadrante III";
                    }   
                    else{
                        ubicacion = "La linea se encuentra en el cuadrante IV";
                    }
                }
            }
        }
        else{
            if(getCuantosCuadrantes()==2){
                if((estaEnCuadranteI() && estaEnCuadranteII() && !estaEnCuadranteIII() && !estaEnCuadranteIV())){
                    ubicacion = "La linea se encuentra en los cuadrantes I y II";
                }
                else{
                    if(estaEnCuadranteI() && !estaEnCuadranteII() && estaEnCuadranteIII() && !estaEnCuadranteIV()){
                        ubicacion = "La linea se encuentra en los cuadrantes I y III";
                    }
                    else{
                        if((estaEnCuadranteI() && !estaEnCuadranteII() && !estaEnCuadranteIII() && estaEnCuadranteIV())){
                            ubicacion = "La linea se encuentra en los cuadrantes I y IV";
                        }
                        else{
                            if((!estaEnCuadranteI() && estaEnCuadranteII() && estaEnCuadranteIII() && !estaEnCuadranteIV())){
                                ubicacion = "La linea se encuentra en los cuadrantes II y III";
                            }
                            else{
                                if((!estaEnCuadranteI() && estaEnCuadranteII() && !estaEnCuadranteIII() && estaEnCuadranteIV())){
                                    ubicacion = "La linea se encuentra en los cuadrantes II y IV";
                                }
                                else{
                                    ubicacion = "La linea se encuentra en los cuadrantes III y IV";
                                }
                            }
                        }
                    }
                }
            }
            else{
                if(estaEnCuadranteI() && estaEnCuadranteII() && estaEnCuadranteIII() && !estaEnCuadranteIV()){
                    ubicacion = "La linea se encuentra en los cuadrantes I, II y III";
                }
                else{
                    if(estaEnCuadranteI() && estaEnCuadranteII() && !estaEnCuadranteIII() && estaEnCuadranteIV()){
                        ubicacion = "La linea se encuentra en los cuadrantes I, II y IV";
                    }
                    else{
                        if((!estaEnCuadranteI() && estaEnCuadranteII() && estaEnCuadranteIII() && estaEnCuadranteIV())){
                            ubicacion = "La linea se encuentra en los cuadrantes II, III y IV";
                        }
                        else{
                            ubicacion = "La linea se encuentra en los cuadrantes I, III y IV";
                        }
                    }
                }
            }
        }
        return ubicacion;
    }//fin getUbicacion

    public int getCuantosCuadrantes() {
        int cuantos=0;
        if(estaEnCuadranteI())
            cuantos++;
        if(estaEnCuadranteII())
            cuantos++;
        if(estaEnCuadranteIII())
            cuantos++;
        if(estaEnCuadranteIV())
            cuantos++;
        return cuantos;//complete
    }//fin getCuantosCuadrantes

    public boolean estaEnCuadranteI() {
        return (getX1()>0 && getY1()>0)||
        (getX2()>0 && getY2()>0)||
        (getIntersectoY()>0 && getPendiente()<0);
    }//fin estaEnCuadranteI

    public boolean estaEnCuadranteII() {
        return (getX1()<0 && getY1()>0)||
        (getX2()<0 && getY2()>0)||
        (getIntersectoY()>0 && getPendiente()>0);
    }//fin estaEnPrimerCuadranteII

    public boolean estaEnCuadranteIII() {
        return (getX1()<0 && getY1()<0)||
        (getX2()<0 && getY2()<0)||
        (getIntersectoY()<0 && getPendiente()<0);
    }//fin estaEnCuadranteIII

    public boolean estaEnCuadranteIV() {
        return (getX1()>0 && getY1()<0)||
        (getX2()>0 && getY2()<0)||
        (getIntersectoY()<0 && getPendiente()>0);
    }//fin estaEnCuadranteIV

    public float getPendiente() {
        return (y2-y1)/(x2-x1);
    }

    public float getIntersectoY() {
        return y1 - (getPendiente() * x1);
    }
}//End class !

