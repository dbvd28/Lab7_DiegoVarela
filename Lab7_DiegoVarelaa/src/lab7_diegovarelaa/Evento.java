/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_diegovarelaa;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Evento {
    private String fecha;
    private String ciudad;
    private String lugar;
    private String cappersonas;
    private ArrayList <canciones> setlist=new ArrayList();

    public Evento(String fecha, String ciudad, String lugar, String cappersonas) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.cappersonas = cappersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCappersonas() {
        return cappersonas;
    }

    public void setCappersonas(String cappersonas) {
        this.cappersonas = cappersonas;
    }

    public ArrayList<canciones> getSetlist() {
        return setlist;
    }

    public void setSetlist(ArrayList<canciones> setlist) {
        this.setlist = setlist;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", lugar=" + lugar + '}';
    }
    
}
