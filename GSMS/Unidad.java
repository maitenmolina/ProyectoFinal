
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class Unidad{
    private String nombreApellido;
    private int dni;
    private String nacionalidad;
    private Date fechaDeNacimiento;
    private String domicilio;
    private String localidad;
    private int telefono;
    private String obraSocial;
    private String grupoSanguineo;
    private boolean estudioCursado;
    private boolean estudiaActualmente;
    private String viveCon;
    private String patriaPotestad;
    private String nucleoFamiliar;
    private int telfEmergencia;
    
    
    
    public Unidad(String unNombreApellido, int unDni, String unaNacionalidad, Date unaFechaDeNacimiento, String unDomicilio,String unaLocalidad, int unTelefono, String unaObraSocial, String unGrupoSanguineo, boolean unEstudiosCursados, boolean unEstudiaActualmente, String viveCon, String patriaPotestad, String unNucleoFamiliar, int unTelfEmergencia){
        this.nombreApellido = unNombreApellido;
        this.dni =unDni;
        this.nacionalidad = unaNacionalidad;
        this.fechaDeNacimiento = unaFechaDeNacimiento;
        this.domicilio = unDomicilio;
        this.localidad = unaLocalidad;
        this.telefono = unTelefono;
        this.obraSocial = unaObraSocial;
        this.grupoSanguineo = unGrupoSanguineo;
        this.estudioCursado = unEstudiosCursados;
        this.estudiaActualmente = unEstudiaActualmente;
        this.viveCon = viveCon;
        this.patriaPotestad = patriaPotestad;
        this.nucleoFamiliar = unNucleoFamiliar;
        this.telfEmergencia = unTelfEmergencia;
        
        
    }
}