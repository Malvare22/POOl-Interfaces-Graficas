import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;

public class ControllerTriangulo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblLado1;

    @FXML
    private Label lblLado2;

    @FXML
    private Label lblLado3;

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;

    @FXML
    private TextField txtValor3;

    @FXML
    private Button cmdActualizarMedidas;

    @FXML
    private Button cmdDeterminarTipo;

    @FXML
    private Button cmdAyuda;

    @FXML
    private ImageView imgImagen;

    @FXML
    private TextField txtRespuesta;

    private Triangulo t;
    
    @FXML
    void actualizarMedidas(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Actualizar");
        alert.setHeaderText(null);
        alert.setContentText("Meidas Actualizadas");

        alert.showAndWait();  
        
        actualizarGUI();
    }

    @FXML
    void ayuda(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ayuda!");
        alert.setHeaderText(null);
        alert.setContentText("Determina el tipo de Triángulo");

        alert.showAndWait();       
    }

    @FXML
    void determinarTipo(ActionEvent event) {
        t.getTipo();
        txtRespuesta.setText("" + t.getTipo());
    }
    
    private void actualizarGUI(){
        t.setLado1((Float.parseFloat(txtValor1.getText())));
        t.setLado2((Float.parseFloat(txtValor2.getText())));
        t.setLado3((Float.parseFloat(txtValor3.getText())));
    }

    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert lblLado1 != null : "fx:id=\"lblLado1\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert lblLado2 != null : "fx:id=\"lblLado2\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert lblLado3 != null : "fx:id=\"lblLado3\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert txtValor1 != null : "fx:id=\"txtValor1\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert txtValor2 != null : "fx:id=\"txtValor2\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert txtValor3 != null : "fx:id=\"txtValor3\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert cmdActualizarMedidas != null : "fx:id=\"cmdActualizarMedidas\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert cmdDeterminarTipo != null : "fx:id=\"cmdDeterminarTipo\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert imgImagen != null : "fx:id=\"imgImagen\" was not injected: check your FXML file 'Triangulo.fxml'.";
        assert txtRespuesta != null : "fx:id=\"txtRespuesta\" was not injected: check your FXML file 'Triangulo.fxml'.";

        t = new Triangulo();
    }
}
