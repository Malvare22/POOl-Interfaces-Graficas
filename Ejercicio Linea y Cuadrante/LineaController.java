import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
public class LineaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdActualizar;

    @FXML
    private Button cmdDeterminarUbicacion;

    @FXML
    private Button cmdAyuda;

    @FXML
    private Button cmdInformacion;

    @FXML
    private Text txtTitulo;

    @FXML
    private Text txtXPunto1;

    @FXML
    private Text txtYPunto1;

    @FXML
    private Text txtXPunto2;

    @FXML
    private Text txtYPunto2;

    @FXML
    private TextField txtX1;

    @FXML
    private TextField txtY1;

    @FXML
    private TextField txtX2;

    @FXML
    private TextField txtY2;

    @FXML
    private Text txtUbicacion;

    private Linea l;

    @FXML
    void actualizar(ActionEvent event) {
        try{
            l.setX1(Float.parseFloat(txtX1.getText()));
            l.setY1(Float.parseFloat(txtY1.getText()));
            l.setX2(Float.parseFloat(txtX2.getText()));
            l.setY2(Float.parseFloat(txtY2.getText()));
            cmdActualizar.setDisable(true);
            cmdDeterminarUbicacion.setDisable(false);
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
    void ayuda(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Determina la ubicación de la Linea respecto al plano.");

        alert.showAndWait();
    }

    @FXML
    void determinarUbicacion(ActionEvent event) {
        txtUbicacion.setText(l.getUbicacion());
        cmdActualizar.setDisable(false);
        cmdDeterminarUbicacion.setDisable(true);
    }

    @FXML
    void informacion(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andrés Malaver Suárez.");

        alert.showAndWait();
    }    

    @FXML
    void initialize() {
        assert cmdActualizar != null : "fx:id=\"cmdActualizar\" was not injected: check your FXML file 'Linea.fxml'.";
        assert cmdDeterminarUbicacion != null : "fx:id=\"cmdDeterminarUbicacion\" was not injected: check your FXML file 'Linea.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'Linea.fxml'.";
        assert cmdInformacion != null : "fx:id=\"cmdInformacion\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtTitulo != null : "fx:id=\"txtTitulo\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtXPunto1 != null : "fx:id=\"txtXPunto1\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtYPunto1 != null : "fx:id=\"txtYPunto1\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtXPunto2 != null : "fx:id=\"txtXPunto2\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtYPunto2 != null : "fx:id=\"txtYPunto2\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtX1 != null : "fx:id=\"txtX1\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtY1 != null : "fx:id=\"txtY1\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtX2 != null : "fx:id=\"txtX2\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtY2 != null : "fx:id=\"txY2\" was not injected: check your FXML file 'Linea.fxml'.";
        assert txtUbicacion != null : "fx:id=\"txtUbicacion\" was not injected: check your FXML file 'Linea.fxml'.";
        l = new Linea();
        txtUbicacion.setText("Ubicación Desconocida");
    }
}
