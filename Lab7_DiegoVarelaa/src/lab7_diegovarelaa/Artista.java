/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_diegovarelaa;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Artista implements Serializable {

    private String usuario;
    private String contraseña;
    private String nombre;
    private String genero;
    private ArrayList<canciones> cancion = new ArrayList();
    private ArrayList <Evento> eventos=new ArrayList();
    private static final long SerialVersionUID = 555L;

    public Artista(String usuario, String contraseña, String nombre, String genero) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<canciones> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }

}
