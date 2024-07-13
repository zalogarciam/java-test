package org.example.models;
public class AnimalSoundEivy {
    private String nombre;
    private String raza;
    private String sonido;
    private String color;

    public AnimalSoundEivy(String nombre, String raza, String sonido, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.sonido = sonido;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getSonido() {
        return sonido;
    }

    public String getColor() {
        return color;
    }

    public String hacerSonido() {
        return sonido;
    }
}
