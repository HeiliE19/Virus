/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.is.coronavirus.Coronavirus;
/**
 *
 * @author Espinosa
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coronavirus nuevocoronavirus=new Coronavirus();
        nuevocoronavirus.setNombre("Covid-19");
        nuevocoronavirus.setTamanio(0.00015f);
        nuevocoronavirus.setForma("Helicoidal");
        nuevocoronavirus.setCiudadDeOrigen("Wuhan, China.");
        nuevocoronavirus.setSintomas("Fiebre, cansancio, tos seca, congestión nasal, dolor de garganta.");     
        System.out.println(nuevocoronavirus);
        nuevocoronavirus.replicarse();
        nuevocoronavirus.transmitirse();
        nuevocoronavirus.EnfermarGente();
        nuevocoronavirus.crearEpidemiasXv();      
        System.out.println("\n");
        
        Coronavirus sars =new Coronavirus ("Dolor de cabeza, escalofríos, tos, falta de aliento",
                "Guangdong, China", "SARS-CoV", 0.0002f, "Helicoidal");      
        System.out.println(sars);
              
    }            
    }
    

