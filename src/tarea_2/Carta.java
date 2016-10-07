package tarea_2;

public abstract class Carta {
    protected String nombre;
    protected String descripcion;
    
    public abstract void Activar(Sansano jugador);
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }    
    
       
}
