package tarea_2;

public abstract class Carta {
    protected String nombre;
    protected String descripcion;
    
    public abstract String getNombre();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }    
    
       
}
