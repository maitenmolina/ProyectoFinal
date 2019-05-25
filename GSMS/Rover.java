
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class Rover{
    private String nombreApellido;
    private int dni;
    private String nacionalidad;
    private Date fechaDeNacimiento;
    private String domicilio;
    private String localidad;
    private int telefono;
    private String obraSocial;
    
    public Rover(String unNombreApellido, int unDni, String unaNacionalidad, Date unaFechaDeNacimiento, String unDomicilio,String unaLocalidad, int unTelefono, String unaObraSocial){
        this.nombreApellido = unNombreApellido;
        this.dni =unDni;
        this.nacionalidad = unaNacionalidad;
        this.fechaDeNacimiento = unaFechaDeNacimiento;
        this.domicilio = unDomicilio;
        this.localidad = unaLocalidad;
        this.telefono = unTelefono;
        this.obraSocial = unaObraSocial; 
    }
}