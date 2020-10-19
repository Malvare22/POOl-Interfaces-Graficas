import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerMaquinaCafetera {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblCantCafe;

    @FXML
    private Label lblCantAzucar;

    @FXML
    private Label lblCantVasos;

    @FXML
    private Label lblPrecioBaseCafe;

    @FXML
    private Label lblTotalIngresos;

    @FXML
    private Label lblTotalEgresos;

    @FXML
    private Label lblGananciasIVA;

    @FXML
    private Label lblIVA;

    @FXML
    private Label lblGananciasNetas;

    @FXML
    private TextField txtCantCafe;

    @FXML
    private TextField txtCantAzucar;

    @FXML
    private TextField txtCantVasos;

    @FXML
    private TextField txtGananciasNetas;

    @FXML
    private TextField txtIVA;

    @FXML
    private TextField txtGananciasIVA;

    @FXML
    private TextField txtTotalEgresos;

    @FXML
    private TextField txtTotalIngresos;

    @FXML
    private TextField txtPrecioCafe;

    @FXML
    private ComboBox<?> cboTipoCafe;

    @FXML
    private ComboBox<?> cboCuantaAzucar;

    @FXML
    private Button cmdFijarPrecioBaseCafe;

    @FXML
    private Button cmdRecargarCafe;

    @FXML
    private Button cmdRecargarAzucar;

    @FXML
    private Button cmdRecargarVasos;

    @FXML
    private Button cmdRegistrarFactura;

    @FXML
    private Button cmdPrepararCafe;

    @FXML
    private Label lblPrecio;

    @FXML
    private TextField txtPrecio;

    @FXML
    private ImageView imgImagen;

    @FXML
    void FijarPrecioBaseCafe(ActionEvent event) {

    }

    @FXML
    void PrepararCafe(ActionEvent event) {

    }

    @FXML
    void RecargarAzucar(ActionEvent event) {

    }

    @FXML
    void RecargarCafe(ActionEvent event) {

    }

    @FXML
    void RecargarVasos(ActionEvent event) {

    }

    @FXML
    void RegistrarFactura(ActionEvent event) {

    }

    private MaquinaCafetera m;
    
    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblCantCafe != null : "fx:id=\"lblCantCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblCantAzucar != null : "fx:id=\"lblCantAzucar\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblCantVasos != null : "fx:id=\"lblCantVasos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblPrecioBaseCafe != null : "fx:id=\"lblPrecioBaseCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblTotalIngresos != null : "fx:id=\"lblTotalIngresos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblTotalEgresos != null : "fx:id=\"lblTotalEgresos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblGananciasIVA != null : "fx:id=\"lblGananciasIVA\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblIVA != null : "fx:id=\"lblIVA\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblGananciasNetas != null : "fx:id=\"lblGananciasNetas\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtCantCafe != null : "fx:id=\"txtCantCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtCantAzucar != null : "fx:id=\"txtCantAzucar\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtCantVasos != null : "fx:id=\"txtCantVasos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtGananciasNetas != null : "fx:id=\"txtGananciasNetas\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtIVA != null : "fx:id=\"txtIVA\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtGananciasIVA != null : "fx:id=\"txtGananciasIVA\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtTotalEgresos != null : "fx:id=\"txtTotalEgresos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtTotalIngresos != null : "fx:id=\"txtTotalIngresos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtPrecioCafe != null : "fx:id=\"txtPrecioCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cboTipoCafe != null : "fx:id=\"cboTipoCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cboCuantaAzucar != null : "fx:id=\"cboCuantaAzucar\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdFijarPrecioBaseCafe != null : "fx:id=\"cmdFijarPrecioBaseCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdRecargarCafe != null : "fx:id=\"cmdRecargarCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdRecargarAzucar != null : "fx:id=\"cmdRecargarAzucar\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdRecargarVasos != null : "fx:id=\"cmdRecargarVasos\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdRegistrarFactura != null : "fx:id=\"cmdRegistrarFactura\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert cmdPrepararCafe != null : "fx:id=\"cmdPrepararCafe\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert lblPrecio != null : "fx:id=\"lblPrecio\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";
        assert imgImagen != null : "fx:id=\"imgImagen\" was not injected: check your FXML file 'MaquinaCafetera.fxml'.";

        m = new MaquinaCafetera();
    }
}
