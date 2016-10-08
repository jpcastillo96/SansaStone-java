package tarea_2;

import java.util.Scanner;

public class Curso extends Carta{
    int ataque;
    int defensa;
    
    public Curso(){
        this ("","",0,0);
    }
    
    public Curso(String nombre,String descripcion,int ataque, int defensa){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    
    public void setDefensa(int defensa){
        this.defensa=defensa;
    }
    
    public void cartaAzar(int numero){
        if (numero == 1){
            setNombre("Matemáticas");
            setDescripcion(": Ataca 550/Cura 200 puntos de prioridad. Cantidad:1");
            setAtaque(550);
            setDefensa(200);
            //Curso("Matemáticas",": Ataca 550/Cura 200 puntos de prioridad. Cantidad:1",550,200);
        }
        if (numero == 2){
            setNombre("Física");
            setDescripcion(": Ataca 450/Cura 150 puntos de prioridad. Cantidad: 4");
            setAtaque(450);
            setDefensa(150);
            //Curso("Física",": Ataca 450/Cura 150 puntos de prioridad. Cantidad: 4",450,150);
        }
        if (numero == 3){
            setNombre("LP");
            setDescripcion(": Ataca 510/Cura 180 puntos de prioridad. Cantidad: 2");
            setAtaque(510);
            setDefensa(180);
        }
        if (numero == 4){
            setNombre("Programación");
            setDescripcion(": Ataca 110/Cura 300 puntos de prioridad. Cantidad: 6");
            setAtaque(110);
            setDefensa(300);
            //Curso("Programación",": Ataca 110/Cura 300 puntos de prioridad. Cantidad: 6",110,300);
        }
        if (numero == 5){
            setNombre("ED");
            setDescripcion(": Ataca 470/Cura 160 puntos de prioridad. Cantidad: 3");
            setAtaque(470);
            setDefensa(160);
            //Curso("ED",": Ataca 470/Cura 160 puntos de prioridad. Cantidad: 3",470,160);
        }
        if (numero == 6){
            setNombre("EDD");
            setDescripcion(": Ataca 430/Cura 120 puntos de prioridad. Cantidad: 4");
            setAtaque(430);
            setDefensa(120);
            //Curso("EDD",": Ataca 430/Cura 120 puntos de prioridad. Cantidad: 4",430,120);
        }
    }
    public void  Aprobar(Sansano jugador){
        int priori = jugador.getPrioridad() + defensa;
        if (priori > 3000){
            priori = 3000;
        }
        jugador.setPrioridad(priori);      
    }
    
    public void  Reprobar(Sansano jugador){
       int priori = jugador.getPrioridad() - ataque;
       if (priori < 0){
           priori = 0;
       }
       jugador.setPrioridad(priori);
    }

    @Override
    public void Activar(Sansano jugador) {
        System.out.println("Ingrese 0 para curarse y 1 para atacar :");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 0){
            Aprobar(jugador);
        }
        if (opcion == 1){
            Reprobar(jugador);
        }
            
    }
    
}
