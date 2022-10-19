package com.pruebasCSV;
/*
Ejemplo sencillo de acceso a un archivo .csv desde java
NO UTILIZAR NINGÚN GESTOR DE DEPENDENCIAS
 */
public class PruebasCSV {
    /**
     * @author Pablo Cayetano
     *
     */
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./datos/pokemon.csv");
    }
}
