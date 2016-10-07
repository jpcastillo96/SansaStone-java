package tarea_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sansano {
    private String nombre;
    private int prioridad;
    List mazo= new LinkedList();
    public int iniSansano(String nombre,int prioridad){
        this.nombre = nombre;
        this.prioridad = prioridad;
        return 1;
        
    }
    
    public String Nombre(){
        return this.nombre;
    }
    public int Prioridad(){
        return this.prioridad;
    }
    public List getMazo(){
        return this.mazo;
    }
    public void crearMazo(int[]opciones){
        if (opciones[0] == 0){
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
                    //System.out.println("PASO");
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
        if (opciones[0] == 1){
            
        }
        else{
           
        }
    }
    }
