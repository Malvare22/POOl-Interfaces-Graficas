/**
 * Un ejemplo que modela un Triangulo usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Triangulo {

    protected float lado1;
    protected float lado2;
    protected float lado3;

    public Triangulo() {
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /*complete GET/SET*/    
    /**Metodo de acceso a la propiedad lado1*/
    public float getLado1(){
        return this.lado1;
    }//end method getLado1

    /**Metodo de modificación a la propiedad lado1*/
    public void setLado1(float lado1){
        this.lado1 = lado1;
    }//end method setLado1
    
    /**Metodo de acceso a la propiedad lado2*/
    public float getLado2(){
        return this.lado2;
    }//end method getLado2

    /**Metodo de modificación a la propiedad lado2*/
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }//end method setLado2
   
    /**Metodo de acceso a la propiedad lado3*/
    public float getLado3(){
        return this.lado3;
    }//end method getLado3

    /**Metodo de modificación a la propiedad lado3*/
    public void setLado3(float lado3){
        this.lado3 = lado3;
    }//end method setLado1
    
    public String getTipo() {
     String tipo = "Desconocido";

     if(lado1==lado2 && lado1==lado3)
      tipo = "Equilatero";
     else {
      if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1)
        tipo = "Escaleno";
      else
        tipo = "Isosceles";
      if(esRectangulo())
       tipo = tipo + " Rectángulo";
     }//fin else
     
     return tipo;
    }//fin método getTipo
    
    public boolean esRectangulo()
    {
      float a = lado1 * lado1;
      float b = lado2 * lado2;
      float c = lado3 * lado3;
      return a==b+c || b==a+c || c==a+b;
    }//fin método esRectangulo
    
}//fin clase Triangulo

