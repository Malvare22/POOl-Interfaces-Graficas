import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;

public class ControllerCirculo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblCentroX;

    @FXML
    private Label lblCoordenadaXPunto;

    @FXML
    private Label lblCentroY;

    @FXML
    private Label lblRadio;

    @FXML
    private Label lblCoordenadaYPunto;

    @FXML
    private TextField txtCentroX;

    @FXML
    private TextField txtCentroY;

    @FXML
    private TextField txtRadio;

    @FXML
    private TextField txtCoordenadaXPunto;

    @FXML
    private TextField txtCoordenadaYPunto;

    @FXML
    private Button cmdActualizarCoordenadas;

    @FXML
    private Button cmdDeterminarPosicion;

    @FXML
    private Button cmdAyuda;

    @FXML
    private Button cmdAcercaDe1;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private ImageView imgImagen;

    @FXML
    void acercaDe(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andrés Malaver Suárez");

        alert.showAndWait();       
    }

    @FXML
    void actualizarCoordenadas(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Actualizar");
        alert.setHeaderText(null);
        alert.setContentText("Circulo Actualizado");

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
    void determinarPosicion(ActionEvent event) {
        c.getPosicionPunto(Float.parseFloat(txtCoordenadaXPunto.getText())
            ,Float.parseFloat(txtCoordenadaYPunto.getText()));
        txtRespuesta.setText("" + c.getPosicionPunto(Float.parseFloat(txtCoordenadaXPunto.getText())
            ,Float.parseFloat(txtCoordenadaYPunto.getText())));
    }
    
    private void actualizarGUI(){
        c.setCentroX((Float.parseFloat(txtCentroX.getText())));
        c.setCentroY((Float.parseFloat(txtCentroY.getText())));
        c.setRadio((Float.parseFloat(txtRadio.getText())));
    }
    
    private Circulo c;

    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert lblCentroX != null : "fx:id=\"lblCentroX\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert lblCoordenadaXPunto != null : "fx:id=\"lblCoordenadaXPunto\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert lblCentroY != null : "fx:id=\"lblCentroY\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert lblRadio != null : "fx:id=\"lblRadio\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert lblCoordenadaYPunto != null : "fx:id=\"lblCoordenadaYPunto\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtCentroX != null : "fx:id=\"txtCentroX\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtCentroY != null : "fx:id=\"txtCentroY\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtRadio != null : "fx:id=\"txtRadio\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtCoordenadaXPunto != null : "fx:id=\"txtCoordenadaXPunto\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtCoordenadaYPunto != null : "fx:id=\"txtCoordenadaYPunto\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert cmdActualizarCoordenadas != null : "fx:id=\"cmdActualizarCoordenadas\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert cmdDeterminarPosicion != null : "fx:id=\"cmdDeterminarPosicion\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert cmdAcercaDe1 != null : "fx:id=\"cmdAcercaDe1\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert txtRespuesta != null : "fx:id=\"txtRespuesta\" was not injected: check your FXML file 'Circunferencia.fxml'.";
        assert imgImagen != null : "fx:id=\"imgImagen\" was not injected: check your FXML file 'Circunferencia.fxml'.";

        c = new Circulo();
    }
}
