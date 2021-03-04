package com.jamilton.mandingapp;

public class Menu {

    private String nombrePapas;
    private int imagenPapas;

    public Menu(String nombrePapas, int imagenPapas) {
        this.nombrePapas = nombrePapas;
        this.imagenPapas = imagenPapas;
    }

    public String getNombrePapas() {
        return nombrePapas;
    }

    public void setNombrePapas(String nombrePapas) {
        this.nombrePapas = nombrePapas;
    }

    public int getImagenPapas() {
        return imagenPapas;
    }

    public void setImagenPapas(int imagenPapas) {
        this.imagenPapas = imagenPapas;
    }
}
