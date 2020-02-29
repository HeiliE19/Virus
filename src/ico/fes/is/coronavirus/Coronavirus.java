/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.coronavirus;
import ico.fes.is.Virus;

/**
 *
 * @author Espinosa
 */
public class Coronavirus extends Virus {
    String sintomas;
    String ciudadDeOrigen;

    public Coronavirus(String sintomas, String ciudadDeOrigen, String nombre, float tamanio, String forma) {
        super(nombre, tamanio, forma);
        this.sintomas = sintomas;
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    
    public Coronavirus(){
        
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }
    public void EnfermarGente(){
        System.out.println("Enfermando gente...");
    }
    public void crearEpidemiasXv(){
        System.out.println("Creando epidemia/pandemia :v");
        
    }

    @Override
    public String toString() {
        String res=super.toString();
        res = res + "Síntomas de contagiados: "+this.sintomas +"\n";
        res= res + "Ciudad de origen: "+this.ciudadDeOrigen+"\n";
    
        return res;
    
    }   
}

