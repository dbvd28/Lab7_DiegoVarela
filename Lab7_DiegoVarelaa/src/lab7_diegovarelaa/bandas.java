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
public class bandas extends Artista{
private int integrantes;
    public bandas(String usuario, String contraseña, String nombre, String genero,int integrantes) {
        super(usuario, contraseña, nombre, genero);
        this.integrantes=integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
    
}
