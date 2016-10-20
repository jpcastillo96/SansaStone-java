package tarea_2;

public abstract class Carta {
    protected String nombre;
    protected String descripcion;
    
    public abstract void Activar(Sansano jugador , int  opcion);
    
    /******** Funcion: getNombre ********************
    Descripcion: define el nombre de la carta
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public String getNombre(){
        return this.nombre;
    }
    
    /******** Funcion: getNombre ********************
    Descripcion: Obtiene la descripción de la carta
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /******** Funcion: getNombre ********************
    Descripcion: Obtiene el nombre de la carta
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
   /******** Funcion: getNombre ********************
    Descripcion: define la descripción de la carta
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
