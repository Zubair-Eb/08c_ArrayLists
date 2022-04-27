package com.cc.java;

import java.security.cert.LDAPCertStoreParameters;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    
    public static void main(String[] args) {

        // ArrayListe anlegen

       ArrayList<String> carMakers = new ArrayList<>();

       output("AL: " + carMakers);
       output("Elementenanzahl: " + carMakers.size());

        // AL dynamisch füllen (Java--> add())

       carMakers.add("Volvo");
       carMakers.add("BMW");
       carMakers.add("Ford");
       carMakers.add("Honda");
       carMakers.add("Tesla");

       output("AL: " + carMakers);
       output("Elementenanzahl: " + carMakers.size());

        // Daten aus AL lesen

        output("1. Element: " + carMakers.get(0));
        output("Letztes Element: " + carMakers.get(carMakers.size()-1));


        output("");
        output("---------------Iteration 1------------------");

        for (int i = 0; i < carMakers.size(); i++) {
            System.out.print(carMakers.get(i) + " ");
            
        }

        output("");
        output("---------------Iteration 2------------------");

        for (String element : carMakers) {
            System.out.print(element + " ");
            
        }

        // Daten in AL ersetzen/ Überschreiben


        output("");
        carMakers.set(1, "Audi");

        output("AL: " + carMakers);

        output("");
        output("---------------Sortierung------------------");

        Collections.sort(carMakers);
        output("AL: " + carMakers);






     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

