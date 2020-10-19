import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
public class ClockController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button lblAumentoHoras;

    @FXML
    private Button lblAumentarSegundos;

    @FXML
    private Button lblAumentoMinutos;

    @FXML
    private Label lblHoras;

    @FXML
    private Label lblMinutos;

    @FXML
    private Label lblSegundos;

    @FXML
    private Button lblAcercaDe;

    private Reloj r;

    @FXML
    void AdicionarHora(ActionEvent event) {
        r.moverHorario();
        actualizarGUI();
    }

    @FXML
    void AdicionarMinutos(ActionEvent event) {
        r.moverMinutero();
        actualizarGUI();
    }

    @FXML
    void AdicionarSegundos(ActionEvent event) {
        r.moverSegundero();
        actualizarGUI();
    }

    @FXML
    void ObtenerInformacion(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andrés Malaver Suárez.");

        alert.showAndWait();
    }

    private void actualizarGUI(){
        lblHoras.setText("" + r.getHoras());
        if(r.getHoras()<10){
            lblHoras.setText("0" + r.getHoras());
        }
        lblMinutos.setText("" + r.getMinutos());
        if(r.getMinutos()<10){
            lblMinutos.setText("0" + r.getMinutos());
        }
        lblSegundos.setText("" + r.getSegundos());
        if(r.getSegundos()<10){
            lblSegundos.setText("0" + r.getSegundos());
        }
    }

    @FXML
    void initialize() {
        assert lblAumentoHoras != null : "fx:id=\"lblAumentoHoras\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblAumentarSegundos != null : "fx:id=\"lblAumentarSegundos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblAumentoMinutos != null : "fx:id=\"lblAumentoMinutos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblAcercaDe != null : "fx:id=\"lblAcercaDe\" was not injected: check your FXML file 'Reloj.fxml'.";

        r = new Reloj();
    }
}

