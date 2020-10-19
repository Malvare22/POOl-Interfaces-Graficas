/**
 * Complete
 * @author (Milton Jesús Vera Contreras - miltonjeussvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaCafetera { 

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    /*No requiere propiedades adicionales, pero es libre de usarlas*/

    MaquinaCafetera(){
        //complete
        this.cafe = 0;
        this.azucar = 0;
        this.vasos = 0;
        this.egresos = 0;
        this.ingresos = 0;
        this.gananciasBrutas = 0;
        this.impuestos = 0;
        this.gananciasNetas = 0;
    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        //complete
        this.cafe = cantidadInicialCafe;
        this.azucar = cantidadInicialAzucar;
        this.vasos = cantidadInicialVasos;
        this.egresos = 0;
        this.ingresos = 0;
        this.gananciasBrutas = 0;
        this.impuestos = 0;
        this.gananciasNetas = 0;
    }

    //complete metodos GET / SET
    public void setPrecioBaseCafe(int precio){
        this.precioBaseCafe = precio;
    }

    public void getCafe(int cantidad){
        this.cafe=cantidad;
    }

    public int getVasos(){
        return this.vasos;
    }

    public int getAzucar(){
        return this.azucar;
    }

    public int getCafe(){
        return this.cafe;
    }

    public int getGananciasNetas(){
        return this.gananciasNetas;
    }
    
    public void setGananciasNetas(int costo){
        this.gananciasNetas=this.gananciasNetas-costo;
    }

    public int getImpuestos(){
        return this.impuestos;
    }

    public int getGananciasBrutas(){
        return this.gananciasBrutas;
    }

    public int getEgresos(){
        return this.egresos;
    }

    public int getIngresos(){
        return this.ingresos;
    }
    
    public void setIngresos(int valorEntrante){
        this.ingresos=this.ingresos+valorEntrante;
    }

    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }

    public void setEgresos(int cantidad){
        this.egresos=this.egresos+cantidad;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        //complete
        int cantidadGramosCafe;
        int valorAzucar;
        if(tipoCafe==1){
            cantidadGramosCafe=55;
        }
        else{
            if(tipoCafe==2){
                cantidadGramosCafe=55*2;
            }
            else{
                cantidadGramosCafe=55*3;
            }
        }       
        if(cantidadAzucar==1){
            valorAzucar=0;
        }
        else{
            if(cantidadAzucar==2){
                valorAzucar=5;
            }
            else{
                valorAzucar=10;
            }
        }
        int precioInicial=(this.precioBaseCafe/1000)*cantidadGramosCafe;
        int precioConAzucar=(precioInicial)+((precioInicial*valorAzucar)/100);
        int precioConGanancia=precioConAzucar+((precioConAzucar*15)/100);
        return precioConGanancia;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        //complete
        boolean sePuedeRecargar=this.gananciasNetas>=costoCompraCafe;
        if(sePuedeRecargar){
            this.cafe=this.cafe+cantidadCafe;
            setEgresos(costoCompraCafe);
            setGananciasNetas(costoCompraCafe);
        }
        return sePuedeRecargar;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        //complete
        boolean sePuedeRecargar=this.gananciasNetas>=costoCompraAzucar;
        if(sePuedeRecargar){
            this.azucar=this.azucar+cantidadAzucar;
            setEgresos(costoCompraAzucar);
            setGananciasNetas(costoCompraAzucar);
        }
        return sePuedeRecargar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        //complete
        boolean sePuedeRecargar=this.gananciasNetas>=costoCompraVasos;
        if(sePuedeRecargar){
            this.vasos=this.vasos+cantidadVasos;
            setEgresos(costoCompraVasos);
            setGananciasNetas(costoCompraVasos);
        }
        return sePuedeRecargar;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        //complete
        boolean sePuedeHacer;
        int valorAzucar;
        if(cantidadAzucar==1){
            valorAzucar=0;
        }
        else{
            if(cantidadAzucar==2){
                valorAzucar=5;
            }
            else{
                valorAzucar=10;
            }
        }
        if(tipoCafe==1){
            if(cantidadAzucar==2){
                sePuedeHacer=this.vasos>0&&this.azucar>=5&&this.cafe>=55;
            }
            else{
                if(cantidadAzucar==1){
                    sePuedeHacer=this.vasos>0&&this.azucar>=0&&this.cafe>=55;
                }
                else{
                    sePuedeHacer=this.vasos>0&&this.azucar>=10&&this.cafe>=55;
                }
            }
        }
        else{
            if(tipoCafe==2){
                if(cantidadAzucar==2){
                    sePuedeHacer=this.vasos>0&&this.azucar>=5&&this.cafe>=110;
                }
                else{
                    if(cantidadAzucar==1){
                        sePuedeHacer=this.vasos>0&&this.azucar>=0&&this.cafe>=110;
                    }
                    else{
                        sePuedeHacer=this.vasos>0&&this.azucar>=10&&this.cafe>=110;
                    }
                }
            }
            else{
                if(cantidadAzucar==2){
                    sePuedeHacer=this.vasos>0&&this.azucar>=5&&this.cafe>=165;
                }
                else{
                    if(cantidadAzucar==1){
                        sePuedeHacer=this.vasos>0&&this.azucar>=0&&this.cafe>=165;
                    }
                    else{
                        sePuedeHacer=this.vasos>0&&this.azucar>=10&&this.cafe>=165;
                    }
                }
            }
        }
        if(sePuedeHacer){
            if(tipoCafe==1){
                this.cafe=this.cafe-55; this.vasos=this.vasos-1; this.azucar= this.azucar-valorAzucar;
            }
            else{
                if(tipoCafe==2){
                    this.cafe=this.cafe-110; this.vasos=this.vasos-1; this.azucar= this.azucar-valorAzucar;
                }
                else{
                    this.cafe=this.cafe-165; this.vasos=this.vasos-1; this.azucar= this.azucar-valorAzucar;
                }
            }
        }
        return sePuedeHacer;
    }

    public void registrarFactura(int valorFactura) {
        //complete  
        setIngresos(valorFactura);
        getEgresos();
        this.gananciasBrutas=valorFactura;
        this.impuestos=this.gananciasBrutas*16/100;
        this.gananciasNetas=this.gananciasBrutas-this.impuestos;
    }

}
