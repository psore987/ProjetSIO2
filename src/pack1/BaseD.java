package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseD {

 static void ecrireBD(String nom, String prenom, String mdp) {
        String url = "jdbc:mysql://192.168.1.100:3306/MaBase";
        String user = "user2";
        String password = "password";

     // Établissement de la connexion à la base de données
        try {
            // Enregistrement du pilote MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établissement de la connexion à la base de données
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("GetConnection ok");
            
        // Création de l'instruction d'insertion
        String insertQuery = 
        		"INSERT INTO Clients (nomCli, prenomCli, mdpCli) "
        		+ "VALUES (" + nom + ", " + prenom + ", "+ mdp +" )";
        Statement stmt = connection.createStatement();

        // Exécution de l'instruction d'insertion
        int rowsAffected = stmt.executeUpdate(insertQuery);
        System.out.println(rowsAffected + " ligne(s) insérée(s) avec succès.");

        // Fermeture de la connexion
        connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}