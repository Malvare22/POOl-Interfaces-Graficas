/**
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Reloj 
{
    //COMPLETE
    int minutos;
    int segundos;
    int horas;

    /**Debe inicializar a la media noche o medio dia 12:00:00*/
    public Reloj(){
        //COMPLETE
        minutos=0;
        segundos=0;
        horas=12;

    }

    /**Inicializa de acuerdo con los parametros*/
    public Reloj(int segundos, int minutos, int horas){
        //COMPLETE   
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    /*De aqui en adelante Ud. debe completar los algoritmos para que el programa funcione*/

    //COMPLETE GETTER Y SETTER

    /**Metodo para avanzar el segundero*/ 
    public void avanzarSegundero(){
        //COMPLETE
        this.segundos++;
        if(this.segundos>59){
            this.segundos=0; 
            avanzarMinutero();
        }
    }

    /**Metodo para retroceder el segundero*/ 
    public void retrocederSegundero(){
        //COMPLETE
        this.segundos--;
        if(this.segundos<0){
            this.segundos=59; 
            retrocederMinutero();
        }
    }

    /**Metodo para avanzar el minutero*/ 
    public void avanzarMinutero(){
        //COMPLETE 
        this.minutos++;
        if(this.minutos>59){
            this.minutos=0;
            avanzarHorario();
        }
    }

    /**Metodo para avanzar el minutero*/ 
    public void retrocederMinutero(){
        //COMPLETE 
        this.minutos--;
        if(this.minutos<0){
            this.minutos=59;
            retrocederHorario();
        }
    }

    /**Metodo para avanzar el horario*/ 
    public void avanzarHorario(){
        //COMPLETE
        this.horas++;
        if(this.horas>12){
            this.horas=1;
        }
    }

    /**Metodo para avanzar el horario*/ 
    public void retrocederHorario(){
        //COMPLETE
        this.horas--;
        if(this.horas<1){
            this.horas=12;
        }
    }

    //Start GetterSetterExtension Code
    /**Getter method minutos*/
    public int getMinutos(){
        return this.minutos;
    }//end method getMinutos

    /**Setter method minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }//end method setMinutos

    /**Getter method segundos*/
    public int getSegundos(){
        return this.segundos;
    }//end method getSegundos

    /**Setter method segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }//end method setSegundos

    /**Getter method horas*/
    public int getHoras(){
        return this.horas;
    }//end method getHoras

    /**Setter method horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }//end method setHoras

    //End GetterSetterExtension Code
    //!
}