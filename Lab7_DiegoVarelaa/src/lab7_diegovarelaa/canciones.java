/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_diegovarelaa;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class canciones implements Serializable {

    private String nombre;
    private int duracion;
    private static final long SerialVersionUID = 555L;

    public canciones() {
    }

    public canciones(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return  nombre;
    }

}
