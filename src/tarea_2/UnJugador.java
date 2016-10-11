/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

import java.util.Scanner;

public class UnJugador implements ModoJuego {
    
        @Override
    public void iniciar(Sansano jugador1, Sansano jugador2) {
        /*System.out.println("Ingrese su nombre :");
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine();*/
        jugador1.setNombre(registroUnPlayer.name1);
        
    }

    @Override
    public void asignarCartas(Sansano jugador1, Sansano jugador2) {
        jugador1.crearMazoAzar();
        System.out.println("Ingrese 0 para modo Agresivo y 1 para Defensivo :");
        
        int modo = PeleaCom.Agresivo_Defensivo;
        while (modo == 5){
            try {
                Thread.sleep(1000); // 1000 es tiempo en milisegundos.
                } catch (Exception e) {
            e.printStackTrace();
            }
            modo = PeleaCom.Agresivo_Defensivo;
        }
        
        if (modo == 0){
            jugador2.crearMazoAgresivo();            
        }
        if (modo == 1){
           jugador2.crearMazoDefensivo();    
        }
        
    }

}