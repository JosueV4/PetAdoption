package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Adoptante;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    @Override
    public String login(String username, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from adoptante where username = '" + username
                + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                double petcoin = rs.getDouble("petcoin");
                boolean contribuyente = rs.getBoolean("contribuyente");

                Adoptante adoptante
                        = new Adoptante(username, contrasena, nombre, apellidos, email, petcoin, contribuyente);
                return gson.toJson(adoptante);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    //@Override
    public String register(String username, String contrasena, String nombre, String apellidos, String email,
            double petcoin, boolean contribuyente) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into adoptante values('" + username + "', '" + contrasena + "', '" + nombre
                + "', '" + apellidos + "', '" + email + "', " + petcoin + ", " + contribuyente + ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Adoptante adoptante = new Adoptante(username, contrasena, nombre, apellidos, email, petcoin, contribuyente);

            st.close();

            return gson.toJson(adoptante);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
   
}
