
/*Previo elaborado por:
 * Juan Esteban Serrano Rodelo 1152033 
 *  correo: juanestebansero@ufps.edu.co
 *Rodrigo Andres Malaver Suarez 1152016
 *  correo: rodrigoandresmasu@ufps.edu.co
 */
import java.text.DecimalFormat;

public class Vehiculo {
    public static int TARIFA_BICICLETA = 1000;
    public static int TARIFA_MOTO = 2000;
    public static int TARIFA_CARRO_GRANDE = 10000;
    public static int TARIFA_CARRO_PEQUENO = 5000;
    private String placa;
    private String cedulaPropietario;
    private int tarifa;
    private double tiempoServicio;
    private int puestoHistorico;
    Hora horaIngreso;
    Hora horaSalida;
    private DecimalFormat f = new DecimalFormat("###.##"); 
    public Vehiculo(String placa, String cedulaPropietario, int hora, int minuto, int segundo){
        this.placa = placa;
        this.cedulaPropietario = cedulaPropietario;
        this.horaIngreso = new Hora(hora, minuto, segundo);
        getTarifa();
    }

    public Vehiculo (){
        this.placa=null;
        this.cedulaPropietario=null;
        this.horaIngreso = new Hora();  
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void registrarSalida(int hora, int minuto, int segundo){
        this.horaSalida = new Hora(hora, minuto, segundo);
        this.tiempoServicio = 0;
        if(this.horaSalida.esMayor(this.horaIngreso)){
            this.tiempoServicio = this.horaSalida.restar(this.horaIngreso);
        }
    }

    public double getValorTotalServicio(){
        if(this.horaSalida.esMayor(this.horaIngreso)){
            this.tiempoServicio=this.horaSalida.restar(this.horaIngreso);   
        }
        double totalSinIva= (getTarifa() * getTiempoServicio());
        double iva = totalSinIva*(0.19);
        return totalSinIva + iva;
    }

    public Hora getHoraIngreso(){
        return this.horaIngreso;
    }

    public Hora getHoraSalida(){
        return this.horaSalida;
    }

    public int getTarifa(){
        if (this instanceof CarroGrande){
            this.tarifa=TARIFA_CARRO_GRANDE;
        }
        if (this instanceof CarroPequeno){
            this.tarifa=TARIFA_CARRO_PEQUENO;
        }
        if (this instanceof Moto){
            this.tarifa=TARIFA_MOTO;
        }
        if (this instanceof Bicicleta){
            this.tarifa=TARIFA_BICICLETA;
        }
        return this.tarifa;
    }

    public String getCedulaPropietario(){
        return this.cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario){
        this.cedulaPropietario = cedulaPropietario;
    }

    public double getTiempoServicio(){
        return this.tiempoServicio;
    }

    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof Vehiculo){
            Vehiculo v = (Vehiculo)otro;
            rta = this.placa.equals(v.placa);
        }
        return rta;
    }

    public int getPuestoHistorico(){
        return this.puestoHistorico;
    }

    public void setPuestoHistorico(int i){
        this.puestoHistorico = i;
    }

    public String getCostoTotal(){
        return "" + f.format(this.getValorTotalServicio());
    }

    public String getTiempoDelServicio(){
        return "" + f.format(this. getTiempoServicio());
    }
}
