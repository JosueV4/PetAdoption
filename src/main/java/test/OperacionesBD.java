/** Acciones que se van a realizar dentro del aplicativo web * */
package test;

import beans.Mascota;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        //listarMascota();
        actualizarMascota(1, "M");

    }

    public static void actualizarMascota(int id, String genero) {
        DBConnection con = new DBConnection();

        String sql = "UPDATE mascota SET genero = ' " + genero + " ' WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            /**
             * Quiere decir que cuando desconecte termine el proceso *
             */
            con.desconectar();
        }
    }

    public static void listarMascota() {
        DBConnection con = new DBConnection();
        /**
         * DBConnection para conectarnos a la base de datos *
         */
        String sql = "SELECT * FROM mascota";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            /**
             * Ejecuta la sentencia SQL select *
             */
            while (rs.next()) {
                /**
                 * next es un metodo que va a recorrer mascota por mascota *
                 */
                int id = rs.getInt("id");
                /**
                 * Trae el valor que encuentre el id *
                 */
                String nombremascota = rs.getString("nombremascota");
                String genero = rs.getString("genero");
                String especie = rs.getString("especie");
                String ubicacion = rs.getString("ubicacion");
                String raza = rs.getString("raza");
                int edad = rs.getInt("edad");
                boolean disponible = rs.getBoolean("disponible");

                Mascota mascota = new Mascota(id, nombremascota, genero, especie, ubicacion, raza, edad, disponible);
                System.out.println(mascota.toString());
            }
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            /**
             * Quiere decir que cuando desconecte termine el proceso *
             */
            con.desconectar();
        }
    }

}
