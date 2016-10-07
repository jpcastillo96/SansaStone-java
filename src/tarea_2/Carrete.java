package tarea_2;

public class Carrete extends Carta {
    private int curacion;
    
    public Carrete(){
        this.nombre = "";
        this.descripcion = "";
        this.curacion = 0;
    }
    
    public Carrete(String nombre,String descripcion,int curacion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curacion = curacion;
    }
    public void setCuracion(int curacion){
        this.curacion = curacion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void cartaAzar(int numero){
        if (numero == 11){
            setNombre("Cerrito");
            setDescripcion(": Recupera 55 puntos de prioridad.");
            setCuracion(55);
            //iniCarta("Cerrito",": Recupera 55 puntos de prioridad.",55);
        }
        if (numero == 12){
            setNombre("InterMechón");
            setDescripcion("Recupera 80 puntos de prioridad.");
            setCuracion(80);
            //iniCarta("InterMechón","Recupera 80 puntos de prioridad.",80);
        }
        if (numero == 13){
            setNombre("Sansafonda");
            setDescripcion("Recupera 100 puntos de prioridad.");
            setCuracion(100);
            //iniCarta("Sansafonda","Recupera 100 puntos de prioridad.",100);
        }
        if (numero == 14){
            setNombre("SemanaSansana");
            setDescripcion("Recupera 150 puntos de prioridad.");
            setCuracion(150);
           //iniCarta("SemanaSansana","Recupera 150 puntos de prioridad.",150);
        }
        if (numero == 15){
            setNombre("BloqueLibre");
            setDescripcion("Recupera 30 puntos de prioridad.");
            setCuracion(30);
            //iniCarta("BloqueLibre","Recupera 30 puntos de prioridad.",30);
        }
        if (numero == 16){
            setNombre("FiestaOmbligo");
            setDescripcion("Recupera 125 puntos de prioridad.");
            setCuracion(125);
            //iniCarta("FiestaOmbligo","Recupera 125 puntos de prioridad.",125);
        }
    }
    
    
}
