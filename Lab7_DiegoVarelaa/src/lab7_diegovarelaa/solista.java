/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_diegovarelaa;

/**
 *
 * @author diego
 */
public class solista extends Artista {

    private int edad;
    public solista(String usuario, String contraseña, String nombre, String genero,
             int edad) {
        super(usuario, contraseña, nombre, genero);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
