/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_diegovarelaa;

import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author diego
 */
public class barraregistrarse extends Thread {
      private JProgressBar barra;
      private JDialog ventana;
    private boolean avanzar;
    private boolean vive;

    public barraregistrarse(JProgressBar barra,JDialog ventana) {
        this.barra = barra;
        this.ventana=ventana;
        avanzar = true;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 5) {
                    vive = false;
                }try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
        ventana.setVisible(false);
    }
}
