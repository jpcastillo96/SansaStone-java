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
        System.out.println("Ingrese su nombre :");
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine();
        jugador1.setNombre(name1);
        
    }

    @Override
    public void asignarCartas(Sansano jugador1, Sansano jugador2) {
        int [] optionP = {0,0};
        jugador1.crearMazo(optionP);
        System.out.println("Ingrese 0 para modo Agresivo y 1 para Defensivo :");
        Scanner sc = new Scanner(System.in);
        int modo = sc.nextInt();
        
        if (modo == 0){
            int [] option = {1,0};
            jugador2.crearMazo(option);            
        }
        if (modo == 1){
           int [] option = {2,0};
           jugador2.crearMazo(option);    
        }
        
    }

}
