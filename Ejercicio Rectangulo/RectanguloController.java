import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;

public class RectanguloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text txtTitulo;

    @FXML
    private Text txt;

    @FXML
    private Text txtOrigenY;

    @FXML
    private Text txtAncho;

    @FXML
    private Text txtAlto;

    @FXML
    private Text txtCoordenadaXPunto;

    @FXML
    private Text txtCoordenadaYPunto;

    @FXML
    private TextField txtValorOrigenX;

    @FXML
    private TextField txtValorOrigenY;

    @FXML
    private TextField txtValorCoordenadaYPunto;

    @FXML
    private TextField txtValorAncho;

    @FXML
    private TextField txtValorAlto;

    @FXML
    private TextField txtValorCoordenadaXPunto;

    @FXML
    private Button cmdAcercaDe;

    @FXML
    private Button cmdActualizarCoordenadas;

    @FXML
    private Button cmdAyuda;

    @FXML
    private Button cmdDeterminarPosicion;

    @FXML
    private Text txtUbicacion;

    Rectangulo r;

    @FXML
    void actualizarCoordenadas(ActionEvent event) {
        try{
            r.setOrigenX(Float.parseFloat(txtValorOrigenX.getText()));
            r.setOrigenY(Float.parseFloat(txtValorOrigenY.getText()));
            r.setAncho(Float.parseFloat(txtValorAncho.getText()));
            r.setAlto(Float.parseFloat(txtValorAlto.getText()));
            r.getPosicionPunto(Float.parseFloat(txtValorCoordenadaXPunto.getText()),Float.parseFloat(txtValorCoordenadaYPunto.getText()));
            cmdActualizarCoordenadas.setDisable(true);
            cmdDeterminarPosicion.setDisable(false);
            txtUbicacion.setText("Ubicación Desconocida");
        }
        catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("¡Dato inválido!");
            alert.setContentText("Únicamente puede ingresar números");

            alert.showAndWait();
        }
    }

    @FXML
    void determinarPosicion(ActionEvent event) {
        txtUbicacion.setText(r.getPosicionPunto(Float.parseFloat(txtValorCoordenadaXPunto.getText()),
                Float.parseFloat(txtValorCoordenadaYPunto.getText())));
        cmdActualizarCoordenadas.setDisable(false);
        cmdDeterminarPosicion.setDisable(true);
    }

    @FXML
    void mostrarAcercaDe(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andrés Malaver Suárez.");

        alert.showAndWait();
    }

    @FXML
    void mostrarAyuda(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Determina la ubicación de un Punto respecto a el Rectángulo.");

        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert txtTitulo != null : "fx:id=\"txtTitulo\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txt != null : "fx:id=\"txt\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtOrigenY != null : "fx:id=\"txtOrigenY\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtAncho != null : "fx:id=\"txtAncho\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtAlto != null : "fx:id=\"txtAlto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtCoordenadaXPunto != null : "fx:id=\"txtCoordenadaXPunto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtCoordenadaYPunto != null : "fx:id=\"txtCoordenadaYPunto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorOrigenX != null : "fx:id=\"txtValorOrigenX\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorOrigenY != null : "fx:id=\"txtValorOrigenY\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorCoordenadaYPunto != null : "fx:id=\"txtValorCoordenadaYPunto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorAncho != null : "fx:id=\"txtValorAncho\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorAlto != null : "fx:id=\"txtValorAlto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtValorCoordenadaXPunto != null : "fx:id=\"txtValorCoordenadaXPunto\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert cmdAcercaDe != null : "fx:id=\"cmdAcercaDe\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert cmdActualizarCoordenadas != null : "fx:id=\"cmdActualizarCoordenadas\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert cmdDeterminarPosicion != null : "fx:id=\"cmdDeterminarPosicion\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        assert txtUbicacion != null : "fx:id=\"txtUbicacion\" was not injected: check your FXML file 'Rectangulo.fxml'.";
        r = new Rectangulo();
    }
}
