import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
public class LibroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblfechaEdicion;

    @FXML
    private Label lbleditorial;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblAutor;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblCopias;

    @FXML
    private Label lblDisponibles;

    @FXML
    private Label lblPaginas;

    @FXML
    private Label lblPrestadas;

    @FXML
    private Button cmdPrestramo;

    @FXML
    private Button cmdDevolucion;

    @FXML
    private Button cmdInformacion;

    @FXML
    private Button cmdActualizar;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtAutores;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtPaginas;

    @FXML
    private TextField txtCantidadDeCopias;

    @FXML
    private TextField txtCopiasDisponibles;

    @FXML
    private TextField txtCopiasPrestadas;

    private Libro l;

    @FXML
    void actualizar(ActionEvent event) {
        l.setPrecio(Integer.parseInt(txtPrecio.getText()));
        l.setNumeroDePaginas(Integer.parseInt(txtPaginas.getText()));
        l.cambiarNumeroDeCopias(Integer.parseInt(txtCantidadDeCopias.getText()));
        l.setTitulo(txtTitulo.getText());
        l.setEditorial(txtEditorial.getText());
        l.setAutores(txtAutores.getText());
        l.setAñoEdicion(Integer.parseInt(txtFecha.getText()));
        actualizarGUI();
    }

    @FXML
    void devolver(ActionEvent event) {
        if(l.devolver()){
            actualizarGUI();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se Pudo Registrar la devolución");

            alert.showAndWait();       
        }
    }

    @FXML
    void info(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Programa creado por: Juan Esteban Serrano Rodelo y Rodrigo Andres Malaver Suarez");

        alert.showAndWait();       
    }

    @FXML
    void prestar(ActionEvent event) {
        if(l.prestar()){
            actualizarGUI();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se Pudo Registrar el Prestamo");

            alert.showAndWait();       
        }
    }
    
    private void actualizarGUI(){
        txtPrecio.setText("" + l.getPrecio());
        txtCopiasDisponibles.setText("" + l.getNumeroDeCopiasDisponibles());
        txtCopiasPrestadas.setText("" + l.getNumeroDeCopiasPrestadas());
    }

    @FXML
    void initialize() {
        assert lblfechaEdicion != null : "fx:id=\"lblfechaEdicion\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lbleditorial != null : "fx:id=\"lbleditorial\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblAutor != null : "fx:id=\"lblAutor\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblPrecio != null : "fx:id=\"lblPrecio\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblCopias != null : "fx:id=\"lblCopias\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblDisponibles != null : "fx:id=\"lblDisponibles\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblPaginas != null : "fx:id=\"lblPaginas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblPrestadas != null : "fx:id=\"lblPrestadas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdPrestramo != null : "fx:id=\"cmdPrestramo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdDevolucion != null : "fx:id=\"cmdDevolucion\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdInformacion != null : "fx:id=\"cmdInformacion\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdActualizar != null : "fx:id=\"cmdActualizar\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtFecha != null : "fx:id=\"txtFecha\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtEditorial != null : "fx:id=\"txtEditorial\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtTitulo != null : "fx:id=\"txtTitulo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtAutores != null : "fx:id=\"txtAutores\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtPaginas != null : "fx:id=\"txtPaginas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtCantidadDeCopias != null : "fx:id=\"txtCantidadDeCopias\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtCopiasDisponibles != null : "fx:id=\"txtCopiasDisponibles\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtCopiasPrestadas != null : "fx:id=\"txtCopiasPrestadas\" was not injected: check your FXML file 'Libro.fxml'.";
        l = new Libro();
        txtCopiasDisponibles.setDisable(true);
        txtCopiasPrestadas.setDisable(true);
    }
}
