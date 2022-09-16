// control + shift + c --> para comentarios
//package controller;
//
//import java.sql.ResultSet;
//import java.sql.Statement;
//import beans.Adoptante;
//import connection.DBConnection;
//import com.google.gson.Gson;
//
//public class UsuarioController implements IUsuarioController{
//    
//    @Override
//    public String login(String username, String contrasena){
//        Gson gson = new Gson();                  //El gson sirve para sincronisar el back con el front
//        DBConnection con = new DBConnection();
//
//        String sql = "SELECT * FROM adoptante WHERE username = ' " + username + " '  and contrasena = ' " + contrasena + " ' ";
//
//        try {
//            Statement st = con.getConnection().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            
//            while (rs.next()) {
//                String nombre = rs.getString("nombre");
//                String apellido = rs.getString("apellido");
//                String email = rs.getString("email");
//                double petcoin = rs.getDouble("petcoin");
//                boolean contribuyente = rs.getBoolean("contribuyente");
//                Adoptante adoptante = new Adoptante(username, contrasena, nombre, apellido, email, petcoin, contribuyente);
//                return gson.toJson(adoptante);
//
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }finally {
//            con.desconectar();
//        }
//        return "false";
//    }
//
//}
//
