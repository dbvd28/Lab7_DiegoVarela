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
public class Usuario implements Serializable {

    private static final long SerialVersionUID = 555L;
    private String usuario;
    private String contraseña;
    private String nombre;
    private int edad;
    private ArrayList<Evento> listaevento = new ArrayList();
    private ArrayList<Artista> listaartistfav = new ArrayList();

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String nombre, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.edad = edad;
    }

    public ArrayList<Evento> getListaevento() {
        return listaevento;
    }

    public void setListaevento(ArrayList<Evento> listaevento) {
        this.listaevento = listaevento;
    }

    public ArrayList<Artista> getListaartistfav() {
        return listaartistfav;
    }

    public void setListaartistfav(ArrayList<Artista> listaartistfav) {
        this.listaartistfav = listaartistfav;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre + '}';
    }

}
