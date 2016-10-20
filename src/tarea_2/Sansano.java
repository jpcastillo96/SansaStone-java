package tarea_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sansano {
    private String nombre;
    private int prioridad;    
    List <Carta> mazo= new LinkedList();
    /******** Funcion: constructor Sansano********************
    Descripcion: inicializa al jugador con un nombre y prioridad.
    Parametros:
    * String nombre
    * int prioridad
    Retorno: jugador inicializado
    ************************************************/
    public Sansano(String nombre,int prioridad){
        this.nombre = nombre;
        this.prioridad = prioridad;  
    }
    
    public Sansano(){
        this("Oponente",3000);
    }
    /******** Funcion: getNombre********************
    Descripcion: obtiene el nombre del jugador
    Parametros:
    * void
    Retorno: el nombre del jugador
    ************************************************/
    public String getNombre(){
        return this.nombre;
    }
    
    /******** Funcion: getPrioridad********************
    Descripcion: obtiene la Prioridad del jugador
    Parametros:
    * void
    Retorno: Prioridad del jugador
    ************************************************/
    public int getPrioridad(){
        return this.prioridad;
    }
    
    /******** Funcion: getMazo ********************
    Descripcion: obtiene el mazo del jugador
    Parametros:
    * void
    Retorno: mazo del jugador
    ************************************************/
    public List getMazo(){
        return this.mazo;
    }
    
    /******** Funcion: setPrioridad ********************
    Descripcion: define la Prioridad del jugador
    Parametros:
    * int n
    Retorno: void
    ************************************************/
    public void setPrioridad(int n){
            this.prioridad = n;
    }
    /******** Funcion: setNombre********************
    Descripcion: define el nombre del jugador
    Parametros:
    * String newName
    Retorno: void
    ************************************************/
    public void setNombre(String newName){
        this.nombre = newName;
    }
    /******** Funcion: crearMazoAzar ********************
    Descripcion: crea un mazo ordenado aleatoriamente
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public void crearMazoAzar(){
        int[] cartas1 = {1,4,2,6,3,4,1,1,1,1,1,1,1,1,1,1};
        int[] cartas2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int cont = 0;
        while( cont<30 ){
            int numero;
            Random rnd = new Random();  
            numero = (int)((rnd.nextDouble()*16.0)+ 1.0);
            
            if(cartas2[numero-1] < cartas1[numero-1] && (1 <= numero&&numero <= 6)){
                Curso carta = new Curso();
                carta.cartaAzar(numero);
                mazo.add(carta);                
                cartas2[numero-1]++;
                cont++;
            }
            if(cartas2[numero-1] < cartas1[numero-1] && (7 <= numero && numero <= 10)){
                Profesor carta = new Profesor();
                carta.cartaAzar(numero);
                mazo.add(carta);
                //System.out.println("PASO");
                cartas2[numero-1]++;
                cont++;
            }
            if(cartas2[numero-1] < cartas1[numero-1] && ((11 <= numero) && (numero <= 16))){
            Carrete carta = new Carrete();
                carta.cartaAzar(numero);
                mazo.add(carta);
                //System.out.println("PASO");
                cartas2[numero-1]++;
                cont++;
            }
        }
        
    }
    /******** Funcion: crearMazoAgresivo ********************
    Descripcion: crea un mazo ordenado descendentemente,según la carta con ataque más alto.
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public void crearMazoAgresivo(){
        int numero;
        double index = 20.0;
        for(int i=1;i<21;i++){
                Curso carta = new Curso();
                carta.cartaAgresivo(i);
                mazo.add(carta);
        }
        for (int j=7;j<17;j++){
            Random rnd = new Random();  
            numero = (int)((rnd.nextDouble()*index)+ 1.0);
            if ((7 <= j && j <= 10)){
                Profesor carta = new Profesor();
                carta.cartaAzar(j);
                mazo.add(numero,carta);
                index++;
            }
            else if ((11 <= j && j <= 16)){
                Carrete carta = new Carrete();
                carta.cartaAzar(j);
                mazo.add(numero,carta);
                index++;
                
            }
            
        }        
    }
    /******** Funcion: crearMazoDefensivo ********************
   Descripcion: crea un mazo ordenado descendentemente,según la carta con la defensa más alta.
    Parametros:
    * void
    Retorno: void
    ************************************************/
    public void crearMazoDefensivo(){
        int numero;
        double index = 20.0;
        for(int i=1;i<21;i++){
                Curso carta = new Curso();
                carta.cartaDefensivo(i);
                mazo.add(carta);
        }
        for (int j=7;j<17;j++){
            Random rnd = new Random();  
            numero = (int)((rnd.nextDouble()*index)+ 1.0);
            if ((7 <= j && j <= 10)){
                Profesor carta = new Profesor();
                carta.cartaAzar(j);
                mazo.add(numero,carta);
                index++;
            }
            else if ((11 <= j && j <= 16)){
                Carrete carta = new Carrete();
                carta.cartaAzar(j);
                mazo.add(numero,carta);
                index++;
                
            }
            
        }        
    }
    }
