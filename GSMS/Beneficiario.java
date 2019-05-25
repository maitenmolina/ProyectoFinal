import java.util.ArrayList;
import java.util.HashMap;

public class Beneficiario{
    private ArrayList <Manada> lobatos;
    private ArrayList <Unidad> unidades;
    private ArrayList <Caminante> caminantes;
    private ArrayList <Rover> rovers;
    
    public Beneficiario(){
        this.lobatos = new ArrayList <Manada>();
        this.unidades = new ArrayList <Unidad>();
        this.caminantes = new ArrayList <Caminante>();
        this.rovers = new ArrayList <Rover>();
    }

    public void agregarLobato(Manada unLobato){
        this.lobatos.add(unLobato);
    }
    public void agregar(Unidad unUnidades){
        this.unidades.add(unUnidades);
    }
    public void agregarCaminante(Caminante unCaminante){
        this.caminantes.add(unCaminante);
    }
    public void agregarRover(Rover unRover){
        this.rovers.add(unRover);
    }
}