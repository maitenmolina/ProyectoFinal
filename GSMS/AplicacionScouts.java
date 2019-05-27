import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.fxml.FXML;

public class AplicacionScouts extends Application{
    public static Beneficiario beneficiarios;
    
   @Override
   
    public void start (Stage stage) throws Exception{
        AplicacionScouts.beneficiarios = new Beneficiario();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("PrimerVentana.fxml")));
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
    
    @FXML
    void onClickManada(ActionEvent event) throws IOException {
        Parent planillaAfil = FXMLLoader.load(getClass().getResource("PlanillaDeAfilicacion.fxml"));
        Scene planillaAfilScene = new Scene(planillaAfil);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(planillaAfilScene);
        app_stage.show();

    }
}