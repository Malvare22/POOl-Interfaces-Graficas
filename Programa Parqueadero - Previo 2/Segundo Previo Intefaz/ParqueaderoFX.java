import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.scene.image.Image;

/*Previo elaborado por:
 * Juan Esteban Serrano Rodelo 1152033 
 *  correo: juanestebansero@ufps.edu.co
 *Rodrigo Andres Malaver Suarez 1152016
 *  correo: rodrigoandresmasu@ufps.edu.co
 */
public class ParqueaderoFX extends Application{

    public void start(Stage stage) throws IOException{
        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "Interfaz.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        Pane root = (Pane) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Programa Parqueadero");
        stage.getIcons().add(new Image("/imagenes/Icono.png"));

        stage.resizableProperty().setValue(Boolean.FALSE);
        // Display the Stage
        stage.show();
    }

}
