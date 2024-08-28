package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ExercicioLeituraJson {
    String apiUrl = "http://localhost:3000/usuarios";

    public void app() {
        try {
            // Conecta-se à API
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            int reponseCode = con.getResponseCode();

            if (reponseCode == HttpURLConnection.HTTP_OK) // código 200
            {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                // Lê a resposta da API linha por linha
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Fecha a conexão
                in.close();

                JSONArray usuarios = new JSONArray(content.toString());

                List<Usuario> dadosUsuarios = new ArrayList<>();
                int somaIdades = 0;

                System.out.println("Dados dos Usuários: ");

                for (int i = 0; i < usuarios.length(); i++) {
                    JSONObject usuario = usuarios.getJSONObject(i);
                    dadosUsuarios.add(new Usuario(
                            usuario.getInt("id"),
                            usuario.getString("nome"),
                            usuario.getInt("idade"),
                            usuario.getString("cidade")));
                    somaIdades += usuario.getInt("idade");

                    System.out.println("ID: " + usuario.getString("id") + "Nome: " + usuario.getString("nome")
                            + "Idade: " + usuario.getString("idade") + "Cidade: " + usuario.getString("cidade"));
                }
                int totalUsuarios = dadosUsuarios.size();

                double mediaIdade = (double) somaIdades / totalUsuarios;

                System.out.println("\nNumero total de usuarios: " + totalUsuarios);
                System.out.println("\nMedia de idade dos usuários: " + mediaIdade);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
