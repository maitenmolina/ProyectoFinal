import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class ControladorBeneficiario  {
    
    ObservableList<String> grupoSanguineoList = FXCollections.observableArrayList("A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-");
    
    ObservableList<String> ramaBeneficiarioList = FXCollections.observableArrayList("Manada", "Unidad", "Caminante", "Rover");
    

    @FXML
    private ChoiceBox grupoSanguineo;
    
    @FXML
    private ChoiceBox ramaBeneficiario;
    
    @FXML
    private TextField txtNomApe;

    @FXML
    private DatePicker txtNacimiento;

    @FXML
    private TextField txtNacion;

    @FXML
    private TextField txtDomic;

    @FXML
    private TextField txtLocal;

    @FXML
    private TextField txtTelef;

    @FXML
    private TextField txtObrSoc;

    @FXML
    private TextField txtDNI;

    @FXML
    private RadioButton uno;

    @FXML
    private RadioButton dos;

    @FXML
    private RadioButton tres;
    
    @FXML
    private TextArea txtViveCon;

    @FXML
    private TextField txtCargoDe;

    @FXML
    private DatePicker txtFechaIngreso;

    @FXML
    private TextArea txtFamiliar;

    @FXML
    private TextField txtTelefEmerg;

    @FXML
    private TextField txtQue;

    @FXML
    private RadioButton si;

    @FXML
    private RadioButton no;
    
    
    
    
    void radioButtonToggleEstudiosCursados(){
    ToggleGroup cursados = new ToggleGroup();
    
    // Radio Primaria
    uno.setToggleGroup(cursados);
    uno.setSelected(true);
    //Radio Secundaria
    dos.setToggleGroup(cursados);
    //Radio Terciaria
    tres.setToggleGroup(cursados);
    
    }
    void radioButtonToggleEstudiaActualmente(){
    ToggleGroup group = new ToggleGroup();
        
        //Radio Si
        si.setToggleGroup(group);
        si.setSelected(true);
        
        //Radio No
        no.setToggleGroup(group);
    
    }
        @FXML
    void onBtnCancelar(ActionEvent event) throws IOException{
        Parent planillaAfil = FXMLLoader.load(getClass().getResource("PrimerVentana.fxml"));
        Scene planillaAfilScene = new Scene(planillaAfil);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(planillaAfilScene);
        app_stage.show();
    }
    
    @FXML
    void onBtnTest(ActionEvent event){
        String dni = this.txtDNI.getText();
        String nombre = this.txtNomApe.getText();
        String apellidoo = this.txtNacion.getText();
        String telefono = this.txtTelef.getText();
        String edad = this.txtObrSoc.getText();
        String id = this.txtTelefEmerg.getText();
        
        Base miBase = new Base();
        miBase.conectar();
        miBase.ejecutar("INSERT INTO Beneficiario (id, nombre, apellidoo, edad, dni, telefono) VALUES (?,?,?,?,?,?)",id, nombre, apellidoo, edad, dni, telefono);
    }
    
    
    @FXML
    
    void initialize() {
        
        // ChoiceBox del grupo sanguineo
        grupoSanguineo.setValue("mm");
        grupoSanguineo.setItems(grupoSanguineoList);
        
        // ChoiceBox del beneficiario ingresante
        
        ramaBeneficiario.setValue("mm");
        ramaBeneficiario.setItems(ramaBeneficiarioList);
        
         assert txtNomApe != null : "fx:id=\"txtNomApe\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtNacimiento != null : "fx:id=\"txtNacimiento\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtNacion != null : "fx:id=\"txtNacion\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtDomic != null : "fx:id=\"txtDomic\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtLocal != null : "fx:id=\"txtLocal\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtTelef != null : "fx:id=\"txtTelef\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtObrSoc != null : "fx:id=\"txtObrSoc\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtDNI != null : "fx:id=\"txtDNI\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert uno != null : "fx:id=\"uno\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
       
        assert dos != null : "fx:id=\"dos\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert tres != null : "fx:id=\"tres\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert grupoSanguineo != null : "fx:id=\"grupoSanguineo\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtViveCon != null : "fx:id=\"txtViveCon\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtCargoDe != null : "fx:id=\"txtCargoDe\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtFechaIngreso != null : "fx:id=\"txtFechaIngreso\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert ramaBeneficiario != null : "fx:id=\"ramaBeneficiario\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtFamiliar != null : "fx:id=\"txtFamiliar\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtTelefEmerg != null : "fx:id=\"txtTelefEmerg\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert txtQue != null : "fx:id=\"txtQue\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
        assert no != null : "fx:id=\"no\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";
   
        assert si != null : "fx:id=\"si\" was not injected: check your FXML file 'PlanillaDeAfilicacion.fxml'.";

    }
    

}
