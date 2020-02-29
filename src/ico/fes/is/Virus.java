/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is;

/**
 *
 * @author Espinosa
 */
public class Virus {
    private String nombre;
    private float tamanio;
    private String forma;

    public Virus(String nombre, float tamanio, String forma) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.forma = forma;
    }
    public Virus() {
        
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    
    public void replicarse() {  
        System.out.println("Reproduciendo...");
}
    public void transmitirse(){
        System.out.println("Contagiando gente...");
        
    }
    @Override
    public String toString() {
        String res="Nombre: "+this.nombre +"\n";
        res=res + "Tamaño: "+this.tamanio +" mm \n";
        res = res +"Forma: "+this.forma+"\n";

        return res;
    }
}
