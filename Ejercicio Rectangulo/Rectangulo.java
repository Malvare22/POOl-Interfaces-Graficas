/**
 * Un sencillo ejercicio geométrico con un único objeto Rectangulo.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Rectangulo {

    /**Coordenada x del punto correspondiente a la esquina superior izquierda del Rectangulo*/
    protected float origenX=Float.POSITIVE_INFINITY;
    /**Coordenada y del punto correspondiente a la esquina superior izquierda del Rectangulo*/
    protected float origenY=Float.POSITIVE_INFINITY;
    /**Ancho del Rectangulo*/
    protected float ancho=Float.POSITIVE_INFINITY;
    /**Alto del Rectangulo*/
    protected float alto=Float.POSITIVE_INFINITY;

    /**
     * Constructor default
     */
    public Rectangulo(){
        //COMPLETE para inicializar un Rectangulo en el origen 0,0 y dimensiones 0.
        this.origenX = 0;
        this.origenY = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    /**
     * Constructor con parámetros
     * @x el valor inicial para origenX
     * @y el valor inicial para origenY
     * @w el valor inicial para el ancho
     * @h el valor inicial para el alto
     */
    public Rectangulo(float x, float y, float w, float h){
        //COMPLETE para inicializar el Rectangulo con los valores de los parámetros
        this.origenX = x;
        this.origenY = y;
        this.ancho = w;
        this.alto = h;
    }

    /**
     * Determina la ubicación de unpunto con coordenadas x, y respecto al Rectangulo.
     * Las posibles salidas son:
     * "Punto Dentro del Rectángulo"
     * "Punto En Borde Superior"
     * "Punto en Borde Inferior"
     * "Punto en Borde Izquierdo"
     * "Punto en Borde Derecho"
     * "Punto Fuera del Rectángulo"
     * 
     * @param x coordenada x del punto para el cual se requiere determinar la ubicación
     * @param y coordenada y del punto para el cual se requiere determinar la ubicación
     * @return Un String indicando la ubicacion
     */
    public String getPosicionPunto(float x, float y) {
        String ubicacion = "Ubicaci�n Desconocida";
        /*
         * Complete al algoritmo para que la variable local ubicacion tome alguno de estos valores:
         * Punto Dentro del Rectángulo
         * Punto En Borde Superior
         * Punto en Borde Inferior
         * Punto en Borde Izquierdo
         * Punto en Borde Derecho
         * Punto Fuera del Rectángulo
         */
        if(puntoEstaFuera(x, y)){
            ubicacion="Punto Fuera del Rect�ngulo";
        }
        else{
            if(puntoEstaDentro(x, y)){
                ubicacion="Punto Dentro del Rect�ngulo";
            }
            else{
                if(puntoEstaEnBordeSuperior(x, y)){
                    ubicacion="Punto En Borde Superior";
                }
                else{
                    if(puntoEstaEnBordeInferior(x, y)){
                        ubicacion="Punto en Borde Inferior";
                    }
                    else{
                        if(puntoEstaEnBordeDerecho(x, y)){
                            ubicacion="Punto en Borde Derecho";
                        }
                        else{
                           ubicacion="Punto en Borde Izquierdo"; 
                        }
                    }
                }
            }
        }
        return ubicacion;
    }//fin método getPosiciónPunto

    /**
     * Determina si un punto de coordenadas x,y se encuentran dentro de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está dentro del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está dentro del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaDentro(float x, float y) {
        return ((x>this.origenX)&&(y<this.origenY)&&(x<(this.origenX+this.ancho))&&(y>(this.origenY-this.alto)))
        ||(((x<this.origenX)&&(y>this.origenY)&&(x>(this.origenX+this.ancho))&&(y<(this.origenY-this.alto))));//Complete algoritmo
    }//fin método puntoEstaDentro 

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Superior de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Superior del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Superior del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeSuperior(float x, float y) {
        return (((x>=this.origenX)&&(y==this.origenY))||((x<=(this.origenX+this.ancho))&&(y==this.origenY)))||
        ((x<=this.origenX)&&(y==this.origenY))||((x>=(this.origenX+this.ancho))&&(y==this.origenY));//Complete algoritmo
    }//fin puntoEstaEnBordeSuperior

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Inferior de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Inferior del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Inferior del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeInferior(float x, float y) {
        return (((x>=this.origenX)&&(y==(this.origenY-this.alto)))||((x<=this.origenX)&&(y==(this.origenY-this.alto))))||
        ((x<=this.origenX)&&(y==(this.origenY-this.alto)))||((x>=(this.origenX))&&(y==(this.origenY-this.alto)));//Complete algoritmo
    }//fin puntoEstaEnBordeInferior

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Izquierdo de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Izquierdo  del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Izquierdo  del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeIzquierdo(float x, float y) {
        return (x==this.origenX)&&(y>=(this.origenY-alto))&&(y<=(this.origenY));//Complete algoritmo
    }//fin puntoEstaEnBordeIzquierdo

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Derecho de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Derecho del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Derecho del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeDerecho(float x, float y) {
        return (x==(this.origenX+this.ancho))&&(y>=(this.origenY-alto))&&(y<=(this.origenY));//Complete algoritmo
    }//fin puntoEstaEnBordeDerecho

    /**
     * Determina si un punto de coordenadas x,y se encuentran fuera de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si estáfuera del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si fuera del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaFuera(float x, float y) {
        return (((x>this.origenX)&&(y>this.origenY)&&(x>(this.origenX+this.ancho))&&(y>(this.origenY-this.alto)))||
        ((x<this.origenX)&&(y<this.origenY)&&(x<(this.origenX+this.ancho))&&(y<(this.origenY-this.alto))));//Complete algoritmo
    }//fin puntoEstaFuera

    /**Metodo de acceso a la propiedad origenX*/
    public float getOrigenX(){
        return this.origenX;//Complete algoritmo
    }//end method getOrigenX

    /**Metodo de modificación a la propiedad origenX*/
    public void setOrigenX(float newOrigenX){
        //Complete algoritmo
        this.origenX = newOrigenX;
    }//end method setOrigenX

    /**Metodo de acceso a la propiedad origenY*/
    public float getOrigenY(){
        return this.origenY;//Complete algoritmo
    }//end method getOrigenY

    /**Metodo de modificación a la propiedad origenY*/
    public void setOrigenY(float origenY){
        this.origenY = origenY;//Complete algoritmo
    }//end method setOrigenY

    /**Metodo de acceso a la propiedad ancho*/
    public float getAncho(){
        return this.ancho;//Complete algoritmo
    }//end method getAncho

    /**Metodo de modificación a la propiedad ancho*/
    public void setAncho(float ancho){
        this.ancho = ancho;//Complete algoritmo
    }//end method setAncho

    /**Metodo de acceso a la propiedad alto*/
    public float getAlto(){
        return this.alto;//Complete algoritmo
    }//end method getAlto

    /**Metodo de modificación a la propiedad alto*/
    public void setAlto(float alto){
        this.alto = alto;//Complete algoritmo
    }//end method setAlto

}//fin clase Rectangulo