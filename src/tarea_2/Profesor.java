package tarea_2;

import java.util.Scanner;

public class Profesor extends Carta {
    private int daño;
    
     /******** Funcion: constructor Profesor ********************
    Descripcion: inicializa la carta tipo profesor
    Parametros:
    * String nombre
    * String descripcion
    * int daño
    Retorno: carta tipo carrete
    ************************************************/
    public Profesor(){
        this("","",0);
    }
    
    public Profesor(String nombre,String descripcion,int daño){
        this.nombre = nombre; 
        this.descripcion = descripcion;
        this.daño = daño;
    }
    
    /******** Funcion: setDaño ********************
    Descripcion: define cuanta prioridad quitará la carta
    Parametros:
    * int daño
    Retorno: void
    ************************************************/
    public void setDaño(int daño){
        this.daño = daño;
    }
     /******** Funcion: cartaAzar ********************
    Descripcion: segun un numero al azar inicializa una carta tipo Profesor
    Parametros:
    * int numero
    Retorno: void
    ************************************************/
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
    
    /******** Funcion: Recorregir ********************
    Descripcion: resta prioridad al jugador según la carta
    Parametros:
    * Sansano jugador
    Retorno: void
    ************************************************/
    public void Recorregir(Sansano jugador){
        int priori = jugador.getPrioridad() - daño;
        if (priori < 0){
            priori = 0;
        }
        jugador.setPrioridad(priori);
    }
    /******** Funcion: Activar ********************
    Descripcion: activa la función recorregir
    Parametros:
    * Sansano jugador
    Retorno: void
    ************************************************/
    @Override
    public void Activar(Sansano jugador , int opcion) {
        Recorregir(jugador);
    }
    
    
}
