package com.example.devoirblanc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class InterfaceController {
    @FXML
    private TextField FirstName;
    @FXML
    private TextField LastName;
    @FXML
    private TextField Email;
    @FXML
    private TextField Phone;
    @FXML
    private Button saveButton;
    public void initialize() {
        saveButton.setOnAction(event -> {insererDb();});


    }
    public void insererDb() {
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String email = Email.getText();
        String phone = Phone.getText();
        try {
            // Exemple d'utilisation
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection conn = dbConnection.getConnection();

            dbConnection.insertMembre(firstName,lastName,email,phone);


            // Fermeture de la connexion
            dbConnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();}
    }

    }
