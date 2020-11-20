import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType; 
import javafx.collections.FXCollections;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import java.text.DecimalFormat;

/*Previo elaborado por:
 * Juan Esteban Serrano Rodelo 1152033 
 *  correo: juanestebansero@ufps.edu.co
 *Rodrigo Andres Malaver Suarez 1152016
 *  correo: rodrigoandresmasu@ufps.edu.co
 */

public class ParqueaderoController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl7;

    @FXML
    private Label lbl8;

    @FXML
    private Label lbl9;

    @FXML
    private Label lbl13;

    @FXML
    private Label lbl14;

    @FXML
    private Label lbl15;

    @FXML
    private Label lbl19;

    @FXML
    private Label lbl20;

    @FXML
    private Label lbl21;

    @FXML
    private Label lbl25;

    @FXML
    private Label lbl26;

    @FXML
    private Label lbl27;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl10;

    @FXML
    private Label lbl16;

    @FXML
    private Label lbl22;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl28;

    @FXML
    private Label lbl17;

    @FXML
    private Label lbl23;

    @FXML
    private Label lbl29;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl18;

    @FXML
    private Label lbl24;

    @FXML
    private Label lbl30;

    @FXML
    private Label lbl1;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img7;

    @FXML
    private ImageView img10;

    @FXML
    private ImageView img13;

    @FXML
    private ImageView img16;

    @FXML
    private ImageView img19;

    @FXML
    private ImageView img22;

    @FXML
    private ImageView img25;

    @FXML
    private ImageView img28;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img8;

    @FXML
    private ImageView img9;

    @FXML
    private ImageView img11;

    @FXML
    private ImageView img12;

    @FXML
    private ImageView img14;

    @FXML
    private ImageView img15;

    @FXML
    private ImageView img17;

    @FXML
    private ImageView img18;

    @FXML
    private ImageView img20;

    @FXML
    private ImageView img21;

    @FXML
    private ImageView img23;

    @FXML
    private ImageView img24;

    @FXML
    private ImageView img26;

    @FXML
    private ImageView img27;

    @FXML
    private ImageView img29;

    @FXML
    private ImageView img30;

    @FXML
    private Label lblServicio;

    @FXML
    private Label lblValorBruto;

    @FXML
    private Label lblIVA;

    @FXML
    private Label lblBicicletas;

    @FXML
    private Label lblMotos;

    @FXML
    private Label lblCarrosPequenos;

    @FXML
    private Label lblCarrosGrandes;

    @FXML
    private Label lblTotal;

    @FXML
    private TextField txtBicicletaBruto;

    @FXML
    private TextField txtBicicletaIVA;

    @FXML
    private TextField txtMotoBruto;

    @FXML
    private TextField txtMotoIVA;

    @FXML
    private TextField txtCarroPBruto;

    @FXML
    private TextField txtCarroPIVA;

    @FXML
    private TextField txtCarroGBruto;

    @FXML
    private TextField txtTotalBruto;

    @FXML
    private TextField txtCarroGIVA;

    @FXML
    private TextField txtTotalIVA;

    @FXML
    private TableView<Vehiculo> tableHistorial;

    @FXML
    private TableColumn<?, ?> colNumero;

    @FXML
    private TableColumn<?, ?> colPlaca;

    @FXML
    private TableColumn<?, ?> colTiempoServicio;

    @FXML
    private TableColumn<?, ?> colValorServicio;

    @FXML
    private Button cmdLimpiar;

    @FXML
    private Button cmdRegistrarIngreso;

    @FXML
    private Button cmdRegistrarSalida;

    @FXML
    private Button cmdConsultarVehiculo;

    @FXML
    private RadioButton optCarroGrande;

    @FXML
    private RadioButton optCarroPequeno;

    @FXML
    private RadioButton optMotocicleta;

    @FXML
    private RadioButton otpBicicleta;

    @FXML
    private Label lblHoraIngreso;

    @FXML
    private Label lblHoraSalida;

    @FXML
    private Label lblCedulaPropietario;

    @FXML
    private Label lblPlacaVehiculo;

    @FXML
    private TextField txtHoraIngreso;

    @FXML
    private TextField txtHoraSalida;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtMinutoIngreso;

    @FXML
    private TextField txtMinutoSalida;

    @FXML
    private TextField txtSegundoIngreso;

    @FXML
    private TextField txtSegundoSalida;

    @FXML
    private TextField txtPlaca;

    @FXML
    private Label lblCarroGrande;

    @FXML
    private Label lblCarroPequeno;

    @FXML
    private Label lblBIcicleta;

    @FXML
    private Label lblMotocicleta;

    @FXML
    private Label lblPrecioBicicleta;

    @FXML
    private Label lblPrecioMoto;

    @FXML
    private Label lblPrecioCarroP;

    @FXML
    private Label lblPrecioCarroG;

    private ObservableList<Vehiculo> datosHistorial = FXCollections.observableArrayList();

    private Parqueadero p;

    private ImageView[] lugarDeParqueo;

    private Label[] posiciones;

    private DecimalFormat f = new DecimalFormat("###.##"); 

    @FXML
    private void consultarVehiculo(ActionEvent event) {
        String placa = txtPlaca.getText();
        int sitio = p.buscarVehiculo(placa);
        if(sitio==-1){     
            gestorAlertasError("El vehiculo no existe");
        }
        else{
            actualizarCuadricula();
            posiciones[sitio].setStyle("-fx-background-color: darkblue;");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        limpiarDatos();
    }

    private void limpiarDatos(){
        txtHoraIngreso.setText("0");
        txtHoraSalida.setText("0");
        txtMinutoIngreso.setText("0");
        txtMinutoSalida.setText("0");
        txtSegundoIngreso.setText("0");
        txtSegundoSalida.setText("0");
        txtCedula.setText("0");
        txtPlaca.setText("0");
    }

    @FXML
    private void registrarIngreso(ActionEvent event) {
        String placa = txtPlaca.getText();
        String cedulaPropietario = txtCedula.getText();
        int sitio = 0;

        try{
            if(!(new Hora(Integer.parseInt(txtHoraIngreso.getText()),Integer.parseInt(txtMinutoIngreso.getText()),
                Integer.parseInt(txtSegundoIngreso.getText())).esHoraValida())){
                    throw new RuntimeException("Hora de Ingreso no es valida");
            }
            
            if(otpBicicleta.isSelected()){
                Bicicleta v = new Bicicleta(placa, cedulaPropietario, Integer.parseInt(txtHoraIngreso.getText()), Integer.parseInt(txtMinutoIngreso.getText()), 
                        Integer.parseInt(txtSegundoIngreso.getText()));
                sitio = p.ingresarVehiculo((Vehiculo)v);
            }
            else{
                if(optCarroGrande.isSelected()){
                    CarroGrande v = new CarroGrande(placa, cedulaPropietario, Integer.parseInt(txtHoraIngreso.getText()),Integer.parseInt(txtMinutoIngreso.getText()),
                            Integer.parseInt(txtSegundoIngreso.getText()));
                    sitio = p.ingresarVehiculo((Vehiculo)v);
                }
                else{
                    if(optCarroPequeno.isSelected()){
                        CarroPequeno v = new CarroPequeno(placa, cedulaPropietario, Integer.parseInt(txtHoraIngreso.getText()),Integer.parseInt(txtMinutoIngreso.getText()),
                                Integer.parseInt(txtSegundoIngreso.getText()));
                        sitio = p.ingresarVehiculo((Vehiculo)v);
                    }
                    else{
                        if(optMotocicleta.isSelected()){
                            Moto v = new Moto(placa, cedulaPropietario, Integer.parseInt(txtHoraIngreso.getText()),Integer.parseInt(txtMinutoIngreso.getText()),
                                    Integer.parseInt(txtSegundoIngreso.getText()));
                            sitio = p.ingresarVehiculo((Vehiculo)v);
                        }
                        else{
                            throw new RuntimeException("Debe seleccionar un tipo de vehiculo");
                        }
                    }
                }
            }
            if(sitio!=-1){
                actualizarCuadricula(); 
                posiciones[sitio].setStyle("-fx-background-color: darkblue;");
                mensajeRegistro();
            }
            else{
                throw new RuntimeException("Parqueadero lleno");
            }
        }   
        catch(RuntimeException e){
            gestorAlertasError("Error al ingresar: " + e.getMessage());
        }

    }

    private void actualizarSalida(){
        double valorBicicletas = p.getValorBrutoServicio(4);
        double valorMotos = p.getValorBrutoServicio(3);
        double valorCarrosP = p.getValorBrutoServicio(2);
        double valorCarrosG = p.getValorBrutoServicio(1);
        double valorTotal = valorBicicletas + valorMotos + valorCarrosP + valorCarrosG;
        double valorTotalIva = valorTotal*0.19;
        double valorIvaMotos = valorMotos*0.19;
        double valorIvaBicicletas = valorBicicletas*0.19;
        double valorIvaCarrosP = valorCarrosP*0.19;
        double valorIvaCarrosG = valorCarrosG*0.19;

        txtBicicletaBruto.setText("" + f.format(valorBicicletas));
        txtMotoBruto.setText("" + f.format(valorMotos));
        txtCarroGBruto.setText("" + f.format(valorCarrosG));
        txtCarroPBruto.setText("" + f.format(valorCarrosP));
        txtBicicletaIVA.setText("" + f.format(valorIvaBicicletas));
        txtCarroGIVA.setText("" + f.format(valorIvaCarrosG));
        txtCarroPIVA.setText("" + f.format(valorIvaCarrosP));
        txtMotoIVA.setText("" + f.format(valorIvaMotos));
        txtTotalBruto.setText("" + f.format(valorTotal));
        txtTotalIVA.setText("" + f.format(valorTotalIva));
    }

    @FXML
    private void registrarSalida(ActionEvent event) {
        try{
            Vehiculo s = p.retirarVehiculo(txtPlaca.getText(), Integer.parseInt(txtHoraSalida.getText()), Integer.parseInt(txtMinutoSalida.getText()), 
                    Integer.parseInt(txtSegundoSalida.getText()));
            actualizarSalida();

            ArrayList<Vehiculo> v = p.getHistorialVehiculos(); 
            datosHistorial.clear();
            for(int i = 0; i<p.getHistorialVehiculos().size(); i++){
                Vehiculo e = v.get(i);
                e.setPuestoHistorico(i+1);
                datosHistorial.add(e);
            }
            tableHistorial.setItems(datosHistorial);

            tableHistorial.refresh();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText("Registro exitoso");
            alert.setContentText("Tarifa: " + f.format(s.getTarifa()) + "\nTiempo total: " + f.format(s.getTiempoServicio()) + "\nTotal a Pagar: " + f.format(s.getValorTotalServicio()));
            alert.showAndWait();

        }

        catch(RuntimeException e){
            gestorAlertasError("Error al registrar salida: " + e.getMessage());
        }
        actualizarCuadricula();
    }

    private void gestorAlertasError(String texto){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(texto);
        alert.showAndWait();   
    }

    private void mensajeRegistro(){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(null);
        alert.setHeaderText(null);
        alert.setContentText("Registro exitoso");
        alert.showAndWait();
    }

    private void actualizarCuadricula() {
        Vehiculo[] vehiculos = p.getVehiculos();
        String icono = null;
        for (int i = 0; i < lugarDeParqueo.length; i++) {
            icono = "";
            if (vehiculos[i] instanceof CarroPequeno) {
                icono = "/imagenes/CarroPequeno.png";
            }
            if (vehiculos[i] instanceof CarroGrande) {
                icono = "/imagenes/CarroGrande.png";
            }
            if (vehiculos[i] instanceof Moto) {
                icono = "/imagenes/Moto.png";
            }
            if (vehiculos[i] instanceof Bicicleta) {
                icono = "/imagenes/bici.png";
            }
            if (vehiculos[i] != null) {
                lugarDeParqueo[i].setImage(new Image(icono));
            } else {
                lugarDeParqueo[i].setImage(null);
            }
            posiciones[i].setTextFill(Color.BLACK);
            posiciones[i].setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void initialize() {
        assert lbl11 != null : "fx:id=\"lbl11\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl3 != null : "fx:id=\"lbl3\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl2 != null : "fx:id=\"lbl2\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl7 != null : "fx:id=\"lbl7\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl8 != null : "fx:id=\"lbl8\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl9 != null : "fx:id=\"lbl9\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl13 != null : "fx:id=\"lbl13\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl14 != null : "fx:id=\"lbl14\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl15 != null : "fx:id=\"lbl15\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl19 != null : "fx:id=\"lbl19\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl20 != null : "fx:id=\"lbl20\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl21 != null : "fx:id=\"lbl21\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl25 != null : "fx:id=\"lbl25\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl26 != null : "fx:id=\"lbl26\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl27 != null : "fx:id=\"lbl27\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl4 != null : "fx:id=\"lbl4\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl10 != null : "fx:id=\"lbl10\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl16 != null : "fx:id=\"lbl16\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl22 != null : "fx:id=\"lbl22\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl5 != null : "fx:id=\"lbl5\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl28 != null : "fx:id=\"lbl28\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl17 != null : "fx:id=\"lbl17\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl23 != null : "fx:id=\"lbl23\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl29 != null : "fx:id=\"lbl29\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl6 != null : "fx:id=\"lbl6\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl12 != null : "fx:id=\"lbl12\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl18 != null : "fx:id=\"lbl18\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl24 != null : "fx:id=\"lbl24\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl30 != null : "fx:id=\"lbl30\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img1 != null : "fx:id=\"img1\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img4 != null : "fx:id=\"img4\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img7 != null : "fx:id=\"img7\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img10 != null : "fx:id=\"img10\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img13 != null : "fx:id=\"img13\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img16 != null : "fx:id=\"img16\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img19 != null : "fx:id=\"img19\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img22 != null : "fx:id=\"img22\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img25 != null : "fx:id=\"img25\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img28 != null : "fx:id=\"img28\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img2 != null : "fx:id=\"img2\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img3 != null : "fx:id=\"img3\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img5 != null : "fx:id=\"img5\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img6 != null : "fx:id=\"img6\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img8 != null : "fx:id=\"img8\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img9 != null : "fx:id=\"img9\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img11 != null : "fx:id=\"img11\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img12 != null : "fx:id=\"img12\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img14 != null : "fx:id=\"img14\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img15 != null : "fx:id=\"img15\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img17 != null : "fx:id=\"img17\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img18 != null : "fx:id=\"img18\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img20 != null : "fx:id=\"img20\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img21 != null : "fx:id=\"img21\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img23 != null : "fx:id=\"img23\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img24 != null : "fx:id=\"img24\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img26 != null : "fx:id=\"img26\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img27 != null : "fx:id=\"img27\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img29 != null : "fx:id=\"img29\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert img30 != null : "fx:id=\"img30\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblServicio != null : "fx:id=\"lblServicio\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblValorBruto != null : "fx:id=\"lblValorBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblIVA != null : "fx:id=\"lblIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblBicicletas != null : "fx:id=\"lblBicicletas\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblMotos != null : "fx:id=\"lblMotos\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblCarrosPequenos != null : "fx:id=\"lblCarrosPequenos\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblCarrosGrandes != null : "fx:id=\"lblCarrosGrandes\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblTotal != null : "fx:id=\"lblTotal\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtBicicletaBruto != null : "fx:id=\"txtBicicletaBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtBicicletaIVA != null : "fx:id=\"txtBicicletaIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtMotoBruto != null : "fx:id=\"txtMotoBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtMotoIVA != null : "fx:id=\"txtMotoIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtCarroPBruto != null : "fx:id=\"txtCarroPBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtCarroPIVA != null : "fx:id=\"txtCarroPIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtCarroGBruto != null : "fx:id=\"txtCarroGBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtTotalBruto != null : "fx:id=\"txtTotalBruto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtCarroGIVA != null : "fx:id=\"txtCarroGIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtTotalIVA != null : "fx:id=\"txtTotalIVA\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert tableHistorial != null : "fx:id=\"tableHistorial\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert colNumero != null : "fx:id=\"colNumero\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert colPlaca != null : "fx:id=\"colPlaca\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert colTiempoServicio != null : "fx:id=\"colTiempoServicio\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert colValorServicio != null : "fx:id=\"colValorServicio\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert cmdLimpiar != null : "fx:id=\"cmdLimpiar\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert cmdRegistrarIngreso != null : "fx:id=\"cmdRegistrarIngreso\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert cmdRegistrarSalida != null : "fx:id=\"cmdRegistrarSalida\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert cmdConsultarVehiculo != null : "fx:id=\"cmdConsultarVehiculo\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert optCarroGrande != null : "fx:id=\"optCarroGrande\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert optCarroPequeno != null : "fx:id=\"optCarroPequeno\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert optMotocicleta != null : "fx:id=\"optMotocicleta\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert otpBicicleta != null : "fx:id=\"otpBicicleta\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblHoraIngreso != null : "fx:id=\"lblHoraIngreso\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblHoraSalida != null : "fx:id=\"lblHoraSalida\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblCedulaPropietario != null : "fx:id=\"lblCedulaPropietario\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblPlacaVehiculo != null : "fx:id=\"lblPlacaVehiculo\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtHoraIngreso != null : "fx:id=\"txtHoraIngreso\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtHoraSalida != null : "fx:id=\"txtHoraSalida\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtMinutoIngreso != null : "fx:id=\"txtMinutoIngreso\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtMinutoSalida != null : "fx:id=\"txtMinutoSalida\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtSegundoIngreso != null : "fx:id=\"txtSegundoIngreso\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtSegundoSalida != null : "fx:id=\"txtSegundoSalida\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblCarroGrande != null : "fx:id=\"lblCarroGrande\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblCarroPequeno != null : "fx:id=\"lblCarroPequeno\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblBIcicleta != null : "fx:id=\"lblBIcicleta\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblMotocicleta != null : "fx:id=\"lblMotocicleta\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblPrecioBicicleta != null : "fx:id=\"lblPrecioBicicleta\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblPrecioMoto != null : "fx:id=\"lblPrecioMoto\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblPrecioCarroP != null : "fx:id=\"lblPrecioCarroP\" was not injected: check your FXML file 'Interfaz.fxml'.";
        assert lblPrecioCarroG != null : "fx:id=\"lblPrecioCarroG\" was not injected: check your FXML file 'Interfaz.fxml'.";

        lugarDeParqueo = new ImageView[]{
            img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17,
            img18, img19, img20, img21, img22, img23, img24, img25, img26, img27, img28, img29, img30
        };

        posiciones = new Label[]{
            lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17,
            lbl18, lbl19, lbl20, lbl21, lbl22, lbl23, lbl24, lbl25, lbl26, lbl27, lbl28, lbl29, lbl30
        };

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informacion");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por Rodrigo Andrés Malaver Suárez y Juan Esteban Serrano Rodelo");
        alert.showAndWait();

        limpiarDatos();

        TableColumn colNumero = new TableColumn("No");
        colNumero.setMinWidth(70);
        colNumero.setCellValueFactory(
            new PropertyValueFactory<Vehiculo, String>("puestoHistorico"));

        TableColumn colPlaca = new TableColumn("Placa");
        colPlaca.setMinWidth(70);
        colPlaca.setCellValueFactory(
            new PropertyValueFactory<Vehiculo, String>("placa"));

        TableColumn colTiempoServicio = new TableColumn("Tiempo de Servicio");
        colTiempoServicio.setMinWidth(116);
        colTiempoServicio.setCellValueFactory(
            new PropertyValueFactory<Vehiculo, String>("tiempoDelServicio"));

        TableColumn colValorServicio = new TableColumn("Valor del Servicio $");
        colValorServicio.setMinWidth(118);
        colValorServicio.setCellValueFactory(
            new PropertyValueFactory<Vehiculo, String>("costoTotal"));

        tableHistorial.setItems(datosHistorial);
        tableHistorial.getColumns().clear();
        tableHistorial.getColumns().addAll(colNumero, colPlaca, colTiempoServicio, colValorServicio);

        p = new Parqueadero();

        actualizarCuadricula();

    }
}
