package tarea_2;

public class Duelo {
    private int turnos;
    private String ganador;
    
    public Duelo(){
        ganador = "";
        turnos=0;
    }
    public void  setGanador(String winner){
        ganador = winner;
    }
    public String getGanador(){
        return ganador;
    }
    public void addTurnos(){
        turnos++;
    }
    
    public int getTurnos(){
        return turnos;
    }
    
}
