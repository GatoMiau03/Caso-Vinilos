package org.example;
class Vinilo {
    String artista;
    String nombreDisco;
    int añoLanzamiento;

    public Vinilo(String artista, String nombreDisco, int añoLanzamiento) {
        this.artista = artista;
        this.nombreDisco = nombreDisco;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getArtista() {
        return artista;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
}