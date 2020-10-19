import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class ControllerCasaDeCambio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button cmdCambiarPrecioBolivar;

    @FXML
    private Button cmdInyectarPesos;

    @FXML
    private Button cmdComprarBolivares;

    @FXML
    private Button cmdInyectarBolivares;

    @FXML
    private Button cmdVenderBolivares;

    @FXML
    private Button cmdAyuda;

    @FXML
    private Label lblPrecioBsCompra;

    @FXML
    private Label lblPrecioBsNota;

    @FXML
    private Label lblGananciaBs;

    @FXML
    private Label lblBolivaresComprados;

    @FXML
    private Label lblImpuesto;

    @FXML
    private Label lblBolivaresVendidos;

    @FXML
    private Label lblBolivaresEnCaja;

    @FXML
    private Label lblPesosEnCaja;

    @FXML
    private Label lblGanancias;

    @FXML
    private TextField txtPrecioBsCompra;

    @FXML
    private TextField txtPrecioBsNota;

    @FXML
    private TextField txtGananciaBs;

    @FXML
    private TextField txtBolivaresComprados;

    @FXML
    private TextField txtBolivaresVendidos;

    @FXML
    private TextField txtBolivaresEnCaja;

    @FXML
    private TextField txtImpuesto;

    @FXML
    private TextField txtGanancias;

    @FXML
    private TextField txtPesosEnCaja;

    @FXML
    private ImageView imgImagen;

    @FXML
    void ComprarBolivares(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Comprar");
        dialog.setHeaderText("");
        dialog.setContentText("Cuantos Bolivares tiene?");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
                
        if(c.comprarBolivares(Integer.parseInt(result.get()))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Correcto");
            alert.setHeaderText(null);
            alert.setContentText("Compra Registrada");

            alert.showAndWait();       
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrecto");
            alert.setHeaderText(null);
            alert.setContentText("Hay un error en la compra");

            alert.showAndWait();       
        }
        
        actualizarGUI();
    }

    @FXML
    void InyectarPesos(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Comprar");
        dialog.setHeaderText("");
        dialog.setContentText("Cuantos Pesos tiene?");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        
        c.inyectarPesos(Integer.parseInt(result.get()));
        
        actualizarGUI();
    }

    @FXML
    void ayuda(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andres Malaver Suarez");

        alert.showAndWait();       
    }

    @FXML
    void cambiarPrecioBolivar(ActionEvent event) {
        float compra = cambiarPrecioCompra();
        float venta = cambiarPrecioVenta();
        
        if(venta > compra){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Correcto");
            alert.setHeaderText(null);
            alert.setContentText("Registrado el cambio de precio");

            alert.showAndWait();       
            
            c.cambiarPrecioDelBolivar(compra, venta);
            
            actualizarGUI();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrecto");
            alert.setHeaderText(null);
            alert.setContentText("Vuelva a ingresar los datos");

            alert.showAndWait();       
        }
    }
    
    private float cambiarPrecioCompra(){
        float x = 0;
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Comprar");
        dialog.setHeaderText("");
        dialog.setContentText("Precio de Compra:");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        
        x = Integer.parseInt(result.get());
        return x;
    }
    
    private float cambiarPrecioVenta(){
        float x = 0;
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Vender");
        dialog.setHeaderText("");
        dialog.setContentText("Precio de Venta:");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        
        x = Integer.parseInt(result.get());
        return x;
    }
    
    @FXML
    void inyectarBolivares() {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Comprar");
        dialog.setHeaderText("");
        dialog.setContentText("Cuantos Bolivares tiene?");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        
        c.inyectarBolivares(Integer.parseInt(result.get()));
        actualizarGUI();
    }

    @FXML
    void venderBolivares(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Vender");
        dialog.setHeaderText("");
        dialog.setContentText("Cuantos Bolivares quiere?");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
                        
        if(c.venderBolivares(Integer.parseInt(result.get()))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrecto");
            alert.setHeaderText(null);
            alert.setContentText("Hay un error en la venta");

            alert.showAndWait();   
            
            actualizarGUI();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Correcto");
            alert.setHeaderText(null);
            alert.setContentText("Venta registrada");

            alert.showAndWait();   
        }
    }
    
    private void actualizarGUI() {
        txtBolivaresEnCaja.setText("" + c.getBolivaresEnCaja());
        txtBolivaresComprados.setText("" + c.getBolivaresComprados());
        txtPesosEnCaja.setText("" + c.getPesosEnCaja());
        txtPrecioBsCompra.setText("" + c.getPrecioDeCompra());
        txtPrecioBsNota.setText("" + c.getPrecioDeVenta());
        txtGananciaBs.setText("" + c.getGananciaEnUnBolivar());
        txtBolivaresVendidos.setText("" + c.getBolivaresVendidos());
        txtGanancias.setText("" + c.getGanancias());
        txtImpuesto.setText("" + c.getImpuestos());
    }

    private CasaDeCambio c;
    
    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdCambiarPrecioBolivar != null : "fx:id=\"cmdCambiarPrecioBolivar\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdInyectarPesos != null : "fx:id=\"cmdInyectarPesos\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdComprarBolivares != null : "fx:id=\"cmdComprarBolivares\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdInyectarBolivares != null : "fx:id=\"cmdInyectarBolivares\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdVenderBolivares != null : "fx:id=\"cmdVenderBolivares\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblPrecioBsCompra != null : "fx:id=\"lblPrecioBsCompra\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblPrecioBsNota != null : "fx:id=\"lblPrecioBsNota\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblGananciaBs != null : "fx:id=\"lblGananciaBs\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblBolivaresComprados != null : "fx:id=\"lblBolivaresComprados\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblImpuesto != null : "fx:id=\"lblImpuesto\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblBolivaresVendidos != null : "fx:id=\"lblBolivaresVendidos\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblBolivaresEnCaja != null : "fx:id=\"lblBolivaresEnCaja\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblPesosEnCaja != null : "fx:id=\"lblPesosEnCaja\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert lblGanancias != null : "fx:id=\"lblGanancias\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtPrecioBsCompra != null : "fx:id=\"txtPrecioBsCompra\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtPrecioBsNota != null : "fx:id=\"txtPrecioBsNota\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtGananciaBs != null : "fx:id=\"txtGananciaBs\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtBolivaresComprados != null : "fx:id=\"txtBolivaresComprados\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtBolivaresVendidos != null : "fx:id=\"txtBolivaresVendidos\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtBolivaresEnCaja != null : "fx:id=\"txtBolivaresEnCaja\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtImpuesto != null : "fx:id=\"txtImpuesto\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtGanancias != null : "fx:id=\"txtGanancias\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert txtPesosEnCaja != null : "fx:id=\"txtPesosEnCaja\" was not injected: check your FXML file 'Tio Rico.fxml'.";
        assert imgImagen != null : "fx:id=\"imgImagen\" was not injected: check your FXML file 'Tio Rico.fxml'.";

        c = new CasaDeCambio();
    }
}
