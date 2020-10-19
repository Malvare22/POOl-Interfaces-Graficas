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
    private Button lblAumentoSegundos;

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

    @FXML
    private Button lblReduccionHoras;

    @FXML
    private Button lblReduccionMinutos;

    @FXML
    private Button lblReduccionSegundos;

    private Reloj r;

    @FXML
    void AdicionarHora(ActionEvent event) {
        r.avanzarHorario();
        actualizarGUI();
    }

    @FXML
    void AdicionarMinutos(ActionEvent event) {
        r.avanzarMinutero();
        actualizarGUI();
    }

    @FXML
    void AdicionarSegundos(ActionEvent event) {
        r.avanzarSegundero();
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

    @FXML
    void ReducirHora(ActionEvent event) {
        r.retrocederHorario();
        actualizarGUI();
    }

    @FXML
    void ReducirMinutos(ActionEvent event) {
        r.retrocederMinutero();
        actualizarGUI();
    }

    @FXML
    void ReducirSegundos(ActionEvent event) {
        r.retrocederSegundero();
        actualizarGUI();
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
        assert lblAumentoSegundos != null : "fx:id=\"lblAumentoSegundos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblAumentoMinutos != null : "fx:id=\"lblAumentoMinutos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblAcercaDe != null : "fx:id=\"lblAcercaDe\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblReduccionHoras != null : "fx:id=\"lblReduccionHoras\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblReduccionMinutos != null : "fx:id=\"lblReduccionMinutos\" was not injected: check your FXML file 'Reloj.fxml'.";
        assert lblReduccionSegundos != null : "fx:id=\"lblReduccionSegundos\" was not injected: check your FXML file 'Reloj.fxml'.";
        r = new Reloj();
    }
}

