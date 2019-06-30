import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.fxml.FXML;

public class ControladorPadre {
    @FXML
    void onBtnAtras(ActionEvent event)throws Exception{
        Parent planillaAfil = FXMLLoader.load(getClass().getResource("PlanillaDeAfiliacion.fxml"));
        Scene planillaAfilScene = new Scene(planillaAfil);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(planillaAfilScene);
        app_stage.show();
    
    }
}