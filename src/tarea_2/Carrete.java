package tarea_2;

import java.util.Scanner;

public class Carrete extends Carta {
    private int curacion;
    
    /******** Funcion: constructor Carrete ********************
    Descripcion: inicializa la carta tipo carrete
    Parametros:
    * String nombre
    * String descripcion
    * int curacion
    Retorno: carta tipo carrete
    ************************************************/
    public Carrete(){       
        this("","",0);
    }   
    public Carrete(String nombre,String descripcion,int curacion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curacion = curacion;
    }
    
    /******** Funcion: getCuracion ********************
    Descripcion: obtiene la cantidad que recupera en prioridad
    Parametros:
    * Void
    Retorno: cantidad de recuperación
    ************************************************/
    public int getCuracion(){
        return this.curacion;
    }
    
    /******** Funcion: setCuracion ********************
    Descripcion: define cuanta prioridad curará la carta
    Parametros:
    * int curacion
    Retorno: void
    ************************************************/
    public void setCuracion(int curacion){
        this.curacion = curacion;
    }
    
     /******** Funcion: cartaAzar ********************
    Descripcion: segun un numero al azar inicializa una carta tipo carrete
    Parametros:
    * int numero
    Retorno: void
    ************************************************/
    public void cartaAzar(int numero){
        if (numero == 11){
            setNombre("Cerrito");
            setDescripcion(": Recupera 55 puntos de prioridad.");
            setCuracion(55);
            //iniCarta("Cerrito",": Recupera 55 puntos de prioridad.",55);
        }
        if (numero == 12){
            setNombre("InterMechón");
            setDescripcion(": Recupera 80 puntos de prioridad.");
            setCuracion(80);
            //iniCarta("InterMechón","Recupera 80 puntos de prioridad.",80);
        }
        if (numero == 13){
            setNombre("Sansafonda");
            setDescripcion(": Recupera 100 puntos de prioridad.");
            setCuracion(100);
            //iniCarta("Sansafonda","Recupera 100 puntos de prioridad.",100);
        }
        if (numero == 14){
            setNombre("SemanaSansana");
            setDescripcion(": Recupera 150 puntos de prioridad.");
            setCuracion(150);
           //iniCarta("SemanaSansana","Recupera 150 puntos de prioridad.",150);
        }
        if (numero == 15){
            setNombre("BloqueLibre");
            setDescripcion(": Recupera 30 puntos de prioridad.");
            setCuracion(30);
            //iniCarta("BloqueLibre","Recupera 30 puntos de prioridad.",30);
        }
        if (numero == 16){
            setNombre("FiestaOmbligo");
            setDescripcion(": Recupera 125 puntos de prioridad.");
            setCuracion(125);
            //iniCarta("FiestaOmbligo","Recupera 125 puntos de prioridad.",125);
        }
    }
    /******** Funcion: Carretear ********************
    Descripcion: suma prioridad al jugador según la carta
    Parametros:
    * Sansano jugador
    Retorno: void
    ************************************************/
    public void Carretear(Sansano jugador){
        int priori = jugador.getPrioridad() + curacion;
        if (priori > 3000){
            priori = 3000;
        }
        jugador.setPrioridad(priori);
        
    }
    /******** Funcion: Activar ********************
    Descripcion: activa la función carretear
    Parametros:
    * Sansano jugador
    Retorno: void
    ************************************************/
    public void Activar(Sansano jugador) {
        Carretear(jugador);
    }
    @Override
    public void Activar(Sansano jugador, int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
