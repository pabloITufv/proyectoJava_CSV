package com.pruebasCSV;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

/*
Esta clase se encarga de leer el archivo .csv que se le pase por parametro.
No devuelve nada, sino que muestra el contenido del csv por terminal.
 */
public class LectorCSV {
    /**
     * @author PabloC
     */

    public void leeCSV(String nombreArchivo){
        try {
            /**
             * Para poder leer el fichero CSV,
             * CSVReader es una utilidad que dan los de OPENCSV
             * Lo que estamos haciendo es crear un objeto en java
             * Explicado:
             * CSVReader es la clase de OPENCSV.
             * csvReader es el nombre nuevo.
             * = new CSVReader ... es que el nombreArchivo se pasa a FileReader.
             */
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            /**
             * Array de string que guarda cada linea (lee y guarda).
             */
            String[] fila;
            /**
             * Voy a leer una fila del archivo, y si consigo leerla, es que todavía hay filas, por eso while
             */
            while((fila = csvReader.readNext()) != null){
                System.out.printf(fila[0] + " | "
                + fila[1] + " | "
                + fila[2] + " | ");
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
