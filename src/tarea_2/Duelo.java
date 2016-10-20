package tarea_2;

public class Duelo {
    private int turnos;
    private String ganador;
    
    /******** Funcion: Duelo ********************
    Descripcion: inicializa la carta tipo curso
    Parametros:
    * Void
    Retorno: void
    ************************************************/
    public Duelo(){
        ganador = "";
        turnos=0;
    }
    /******** Funcion: setGanador ********************
    Descripcion: Define el ganador con el nombre del jugador que ha ganado
    Parametros:
    * String winner
    Retorno: void
    ************************************************/
    public void  setGanador(String winner){
        ganador = winner;
    }
    
    /******** Funcion: setGanador ********************
    Descripcion: obtien el nombre del jugador que ha ganado
    Parametros:void
    Retorno: nombre del ganador
    ************************************************/
    public String getGanador(){
        return ganador;
    }
    /******** Funcion: setGanador ********************
    Descripcion: suma uno los turnos jugados por el jugador
    Parametros:void
    Retorno: void
    ************************************************/
    public void addTurnos(){
        turnos++;
    }
    /******** Funcion: setGanador ********************
    Descripcion: obtiene los turnos jugados
    Parametros:void
    Retorno: turnos jugados
    ************************************************/
    public int getTurnos(){
        return turnos;
    }
    
}
