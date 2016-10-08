package tarea_2;

import java.util.Scanner;

public class ConUnAmigo implements ModoJuego{
    
    @Override
    public void iniciar(Sansano jugador1 , Sansano jugador2){
        System.out.println("Ingrese el nombre de playe1 :");
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine();
        jugador1.setNombre(name1);
        System.out.println("Ingrese el nombre de playe2 :");
        Scanner sc2 = new Scanner(System.in);
        String name2 = sc2.nextLine();
        jugador2.setNombre(name2);
    }

    @Override
    public void asignarCartas(Sansano jugador1, Sansano jugador2) {
        int [] option = {0,0};
        jugador1.crearMazo(option);
        jugador2.crearMazo(option);

    }
}
