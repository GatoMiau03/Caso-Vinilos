package org.example;

public class Main {
    public static void main(String[] args) {
        ColeccionVinilos coleccion = new ColeccionVinilos();
        Vinilo vinilo1 = new Vinilo("Pink Floyd", "The Dark Side of the Moon", 1973);
        Vinilo vinilo2 = new Vinilo("The Beatles", "Abbey Road", 1969);
        Vinilo vinilo3 = new Vinilo("Led Zeppelin", "Led Zeppelin IV", 1971);

        coleccion.agregarVinilo(vinilo1);
        coleccion.agregarVinilo(vinilo2);
        coleccion.agregarVinilo(vinilo3);

        System.out.println("¿El vinilo 'The Dark Side of the Moon' está en la colección? " + coleccion.buscarVinilo(vinilo3));
        System.out.println("¿El vinilo 'Revolver' está en la colección? " + coleccion.buscarVinilo(new Vinilo("The Beatles", "Revolver", 1966)));

        System.out.println("Cantidad de vinilos en la colección: " + coleccion.cantidadVinilos());
        System.out.println("Espacios disponibles en la colección: " + coleccion.espaciosDisponibles());
    }
}