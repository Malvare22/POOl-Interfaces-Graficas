import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

public class ControllerTelevisor {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button cmdSubirVolumen;

    @FXML
    private Button cmdBajarVolumen;

    @FXML
    private Button cmdAvanzarCanal;

    @FXML
    private Button cmdRetrocederCanal;

    @FXML
    private Button cmdCambiarTipoEntrada;

    @FXML
    private ImageView lblImagen;

    @FXML
    private Label lblVolumen;

    @FXML
    private Label lblCanal;

    @FXML
    private Label lblEntrada;

    @FXML
    private TextField txtVolumen;

    @FXML
    private TextField txtCanal;

    @FXML
    private TextField txtTipoEntrada;
    
    private Televisor t;

    @FXML
    void avanzarCanal(ActionEvent event) {
        t.avanzarCanal();
        actualizarGUI();
    }

    @FXML
    void bajarVolumen(ActionEvent event) {
        if(t.getVolumen() == 0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cuidado!");
            alert.setHeaderText(null);
            alert.setContentText("Volumen Mínimo");

            alert.showAndWait();       
        }
        else t.bajarVolumen();
        actualizarGUI();
    }

    @FXML
    void cambiarEntrada(ActionEvent event) {
        List<String> choices = new ArrayList<>();
        choices.add("Apagado");
        choices.add("Antena");
        choices.add("Cable");
        choices.add("Auxiliar");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Apagado", choices);
        dialog.setTitle("Seleccione el tipo de Entrada");
        dialog.setHeaderText("");
        dialog.setContentText("Tipo de entrada TV:");

        Optional<String> result = dialog.showAndWait();
        
        int n = 0;
        
        if(result.get() == "Apagado") n = 0;
        if(result.get() == "Antena") n = 1;
        if(result.get() == "Cable") n = 2;
        if(result.get() == "Auxiliar") n = 3;
        
        t.setTipoDeEntrada(n);
        actualizarGUI();
    }

    @FXML
    void retrocederCanal(ActionEvent event) {
        t.retrocederCanal();
        actualizarGUI();
    }

    @FXML
    void subirVolumen(ActionEvent event) {
        if(t.getVolumen() == 20){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cuidado!");
            alert.setHeaderText(null);
            alert.setContentText("Volumen Máximo");

            alert.showAndWait();       
        }
        else t.subirVolumen();
        actualizarGUI();
    }

    private void actualizarGUI(){
        txtVolumen.setText("" + t.getVolumen());
        txtCanal.setText("" + t.getCanal());
        txtTipoEntrada.setText("" + t.getTipoDeEntrada());
    }
    
    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert cmdSubirVolumen != null : "fx:id=\"cmdSubirVolumen\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert cmdBajarVolumen != null : "fx:id=\"cmdBajarVolumen\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert cmdAvanzarCanal != null : "fx:id=\"cmdAvanzarCanal\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert cmdRetrocederCanal != null : "fx:id=\"cmdRetrocederCanal\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert cmdCambiarTipoEntrada != null : "fx:id=\"cmdCambiarTipoEntrada\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert lblImagen != null : "fx:id=\"lblImagen\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert lblVolumen != null : "fx:id=\"lblVolumen\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert lblCanal != null : "fx:id=\"lblCanal\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert lblEntrada != null : "fx:id=\"lblEntrada\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert txtVolumen != null : "fx:id=\"txtVolumen\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert txtCanal != null : "fx:id=\"txtCanal\" was not injected: check your FXML file 'Televisor.fxml'.";
        assert txtTipoEntrada != null : "fx:id=\"txtTipoEntrada\" was not injected: check your FXML file 'Televisor.fxml'.";
        
        t = new Televisor();
    }
}
