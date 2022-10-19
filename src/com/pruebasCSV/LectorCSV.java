package com.pruebasCSV;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Esta clase se encarga de leer el archivo .csv que se le pase por parametro.
No devuelve nada, sino que muestra el contenido del csv por terminal.
 */
public class LectorCSV {
    /**
     * @author PabloC
     */

    public void leeCSV(String nombreArchivo){
        /**
         * Para poder leer el fichero CSV,
         * CSVReader es una utilidad que dan los de OPENCSV
         * Lo que estamos haciendo es crear un objeto en java
         * Explicado:
         * CSVReader es la clase de OPENCSV.
         * csvReader es el nombre nuevo.
         * = new CSVReader ... es que el nombreArchivo se pasa a FileReader.
         */
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo))
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
