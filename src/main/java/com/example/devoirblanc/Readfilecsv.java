package com.example.devoirblanc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Readfilecsv {
    public static void main(String[] args) {
        Readfilecsv main = new Readfilecsv();
        Set<Membre> elements =main.chargerListeMembre("C:\\Users\\ahmed\\Downloads\\Password-Manager\\devoircsv.csv");
        for(Membre i:elements){
            System.out.println(i.getNom());
        }
    }
    private Membre parseMembre(String line) {
        // Supposons que chaque ligne a le format : id,nom,prenom,email
        String[] parts = line.split(",");
        if (parts.length == 4) {
            try {
                String phone= parts[3].trim();
                String nom = parts[0].trim();
                String prenom = parts[1].trim();
                String email = parts[2].trim();
                return new Membre(nom, prenom, email,phone);
            } catch (NumberFormatException e) {
                System.err.println("Erreur de format dans la ligne : " + line);
            }
        } else {
            System.err.println("Ligne invalide : " + line);
        }
        return null;
    }
    public Set<Membre> chargerListeMembre(String file) {
        Set<Membre> membreSet = new HashSet<>();

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Parse la ligne pour créer un objet Membre
                Membre membre = parseMembre(line);
                if (membre != null) {
                    membreSet.add(membre);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }

        return membreSet;
    }
}
