
import java.util.ArrayList;
/*Previo elaborado por:
 * Juan Esteban Serrano Rodelo 1152033 
 *  correo: juanestebansero@ufps.edu.co
 *Rodrigo Andres Malaver Suarez 1152016
 *  correo: rodrigoandresmasu@ufps.edu.co
 */
public class Parqueadero {
    private ArrayList<Vehiculo> historialVehiculos;
    private Vehiculo[] vehiculosParqueados;
    public Parqueadero(){
        this.vehiculosParqueados = new Vehiculo[30];
        this.historialVehiculos = new ArrayList<Vehiculo>();
    }

    public Parqueadero(int capacidad){
        this.vehiculosParqueados = new Vehiculo[capacidad];
        this.historialVehiculos = new ArrayList<Vehiculo>();
    }

    public int ingresarVehiculo(Vehiculo vehiculo){
        for(int i = 0;i<this.vehiculosParqueados.length; i++){
            if(vehiculo.equals(this.vehiculosParqueados[i]) && vehiculo!=null){
                throw new RuntimeException ("El vehiculo ya se encuentra");
            }
            if(this.vehiculosParqueados[i]==null){
                this.vehiculosParqueados[i] = vehiculo;
                return i;
            }
        }
        return -1;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo){
        int sitio = buscarVehiculo(placa);
        Vehiculo v = getVehiculos()[sitio];
        v.registrarSalida(hora, minuto, segundo);
        v.getValorTotalServicio();
        getHistorialVehiculos().add(v);
        getVehiculos()[sitio]=null;
        return v;
    }

    public int buscarVehiculo(String placa){
        for(int i=0; i<this.vehiculosParqueados.length; i++){
            if(this.vehiculosParqueados[i]!= null && placa.equals(this.vehiculosParqueados[i].getPlaca()))
                return i;
        }
        return -1;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double acumulado = 0;
        for(int i = 0; i<this.historialVehiculos.size(); i++){
            if(tipoVehiculo==1){
                if (this.historialVehiculos.get(i).getTarifa() == 10000){
                    acumulado = acumulado + (this.historialVehiculos.get(i).getTarifa()* this.historialVehiculos.get(i).getTiempoServicio());
                }
            }
            if(tipoVehiculo==2){
                if (this.historialVehiculos.get(i).getTarifa() == 5000){
                    acumulado = acumulado + (this.historialVehiculos.get(i).getTarifa()* this.historialVehiculos.get(i).getTiempoServicio());
                }
            }
            if(tipoVehiculo==3){
                if (this.historialVehiculos.get(i).getTarifa() == 2000){
                    acumulado = acumulado + (this.historialVehiculos.get(i).getTarifa()* this.historialVehiculos.get(i).getTiempoServicio());
                }
            }
            if(tipoVehiculo==4){
                if (this.historialVehiculos.get(i).getTarifa() == 1000){
                    acumulado = acumulado + (this.historialVehiculos.get(i).getTarifa()* this.historialVehiculos.get(i).getTiempoServicio());
                }
            }
        }
        return acumulado;
    }

    public Vehiculo[] getVehiculos(){
        return this.vehiculosParqueados;
    }

    public java.util.ArrayList getHistorialVehiculos(){
        return this.historialVehiculos;
    }
}
