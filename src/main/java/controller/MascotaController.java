package controller;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import beans.Mascota;
import connection.DBConnection;



public class MascotaController implements IMascotaController {

    @Override
    public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from mascota";

        if (ordenar == true) {
            sql += " order by genero " + orden;
        }

        List<String> mascotas = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombremascota = rs.getString("nombremascota");
                String genero = rs.getString("genero");
                String especie = rs.getString("especie");
                String ubicacion = rs.getString("ubicacion");
                String raza = rs.getString("raza");
                int edad = rs.getInt("edad");
                boolean disponible = rs.getBoolean("disponible");

                Mascota mascota = new Mascota(id, nombremascota, genero, especie, ubicacion, raza, edad, disponible);

                mascotas.add(gson.toJson(mascota));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(mascotas);

    }

}
