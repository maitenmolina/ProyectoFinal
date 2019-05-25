import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;

public class AplicacionScouts extends Exception{
    public static Beneficiario beneficiarios;
    
   //@Override
   
    public void start (Stage stage) throws Exception{
        AplicacionScouts.beneficiarios = new Beneficiario();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("PrimerVentana.fmxl")));
        stage.setTitle("Grupo Scouts Monseño Esposito");
        stage.setScene(scene);
        stage.show(); 
    }
    public static Parent loadFXML(String archivo){
        try{
            return FXMLLoader.load(AplicacionScouts.class.getResource(archivo));
        }
        catch(IOException e){
            System.out.println("Error no se encuentra el archivo");
            return null;
        }
    }
}