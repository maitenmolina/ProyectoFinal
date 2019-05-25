import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;

public class Base{
    private Connection conexion;
    
    public void conectar(){
        try{
            this.conexion= DriverManager.getConnection("jdbc:sqlite:grupoScoutsMonseñorEsposito.db");
        }
        catch(Exception unError){
            System.out.println("Hubo un error al conectar: " +unError.getMessage());
        }
    }
    
    public void ejecutar(String sql, String... valores){
        try{
            PreparedStatement ps= this.conexion.prepareStatement(sql);
            int n = 1;
            for (String valor: valores){
                ps.setString(n++, valor);
            }
            ps.executeUpdate();
        }
        catch(Exception unError){
            System.out.println("Hubo un error al ejecutar"+unError.getMessage());
        }
    }
    public ArrayList<HashMap> consultar (String sql){
        try{
            ArrayList <HashMap> registros = new ArrayList<HashMap>();
            Statement st = this.conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            while(rs.next()){
                HashMap registro = new HashMap();
                for (int i = 1; i <= rsmd.getColumnCount(); i ++){
                    String columna = rsmd.getColumnName(i);
                    String valor = rs.getString(columna);
                    registro.put(columna, valor);
                }
                registros.add(registro);
            }
            return registros;
        }
        catch(Exception unError){
            System.out.println("Hubi un error al ejecutar");
            return null;
        }
    }
}



