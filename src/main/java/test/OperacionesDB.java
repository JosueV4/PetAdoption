package test;

import beans.Mascota;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
public class OperacionesDB {
    
    public static void main(String[] args) {
        // listarMascota();
        actualizarMascota(1, "cali");
       
    }
    
    public static void actualizarMascota(int id, String ubicacion) {
        
        DBConnection con = new DBConnection();
        String sql = "UPDATE mascota SET ubicacion = '" + ubicacion + "'WHERE id = " +id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
    public static void listarMascota() {
         DBConnection con = new DBConnection();
         String sql = "SELECT * FROM mascota ";
         try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int idmascota=rs.getInt("idmascota");
                String nombremascota=rs.getString("nombremascota");
                String genero=rs.getString("genero");
                String especie=rs.getString("especie");
                String ubicacion=rs.getString("ubicacion");
                String raza=rs.getString("raza");
                int edad=rs.getInt("edad");
                boolean disponible=rs.getBoolean("disponible");
                Mascota mascota = new Mascota(idmascota, nombremascota, genero, especie, ubicacion, raza, edad, disponible);
                System.out.println(mascota.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
}
