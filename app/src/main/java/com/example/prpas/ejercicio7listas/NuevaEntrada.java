package com.example.prpas.ejercicio7listas;

import java.util.Date;

public class NuevaEntrada {

    private final String titulo;
    private final String autor;
    private final Date fecha;
    private final int icono;

    public NuevaEntrada(String titulo, String autor, Date fecha, int icono) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.icono = icono;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getIcono() {
        return icono;
    }
}
