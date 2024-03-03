/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1uf4;

import generated.ClashType;
import generated.JugadorType;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;
import pràctica.pkg3.pkg1.jabx.binding.i.unmarshaller.Controlador;

/**
 *
 * @author AluCiclesGS1
 */
public class P1UF4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException{
        // TODO code application logic here
        ClashType c = Controlador.carrega("./clash.xml");
        ArrayList<JugadorType> jugadors =(ArrayList<JugadorType>) c.getJugador();
        for(JugadorType j: jugadors){
            System.out.println("Nom Jugador: " + j.getNom());
        }
    }
    
    
}
