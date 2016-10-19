package tarea_2;

import java.util.Scanner;

public class Profesor extends Carta {
    private int daño;
    
    public Profesor(){
        this("","",0);
    }
    
    public Profesor(String nombre,String descripcion,int daño){
        this.nombre = nombre; 
        this.descripcion = descripcion;
        this.daño = daño;
    }
    
    public void setDaño(int daño){
        this.daño = daño;
    }
    
    public void cartaAzar(int numero){
        if (numero == 7){
            setNombre("Bahamondes");
            setDescripcion(": Reduce 420 puntos de prioridad");
            setDaño(420);
            //iniCarta("Bahamondes",": Reduce 420 puntos de prioridad",420);
        }
        if (numero == 8){
            setNombre("MaxAraya");
            setDescripcion(": Reduce 350 puntos de prioridad");
            setDaño(350);
            //iniCarta("MaxAraya",": Reduce 350 puntos de prioridad",350);
        }
        if (numero == 9){
            setNombre("Cifuentes");
            setDescripcion(": Reduce 390 puntos de prioridad");
            setDaño(390);
            //iniCarta("Cifuentes",": Reduce 390 puntos de prioridad",390);
        }
        if (numero == 10){
            setNombre("MaxRivera");
            setDescripcion(": Reduce 280 puntos de prioridad");
            setDaño(280);
            //iniCarta("MaxRivera",": Reduce 280 puntos de prioridad",280);
        }
    }
    
    public void Recorregir(Sansano jugador){
        int priori = jugador.getPrioridad() - daño;
        if (priori < 0){
            priori = 0;
        }
        jugador.setPrioridad(priori);
    }
    
    @Override
    public void Activar(Sansano jugador , int opcion) {
        Recorregir(jugador);
    }
    
    
}
