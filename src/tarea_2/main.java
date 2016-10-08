package tarea_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 0;
        Curso ejemplo1 = new Curso();
        Profesor ejemplo2 = new Profesor();
        Carrete ejemplo3 = new Carrete();
        
        Duelo d = new Duelo();
        Sansano jugador1 = new Sansano();
        Sansano jugador2 = new Sansano();
        System.out.println("Ingrese 0 para UN JUGADOR y 1 CON UN AMIGO :");
        Scanner sc = new Scanner(System.in);
        int modoJuego = sc.nextInt();
        
        
        while (modoJuego!=0 && modoJuego != 1){
            System.out.println("Ingrese un comando valido");
            modoJuego = sc.nextInt();
        }
        if (modoJuego == 0 ){
            UnJugador modo = new UnJugador();
            modo.iniciar(jugador1, jugador2);
            modo.asignarCartas(jugador1,jugador2);
        }
        else{
            ConUnAmigo modo = new ConUnAmigo();
            modo.iniciar(jugador1,jugador2);
            modo.asignarCartas(jugador1,jugador2);
        }
        System.out.println("----->"+jugador1.getNombre());
        for (int x=0;x<jugador1.getMazo().size();x++){
            
            //System.out.println("AQUI "+jugador.getMazo().get(x).getClass());
            if (jugador1.getMazo().get(x).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador1.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador1.getMazo().get(x).getClass()==ejemplo2.getClass()){
                Profesor cardAux;
                cardAux = (Profesor)jugador1.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador1.getMazo().get(x).getClass()==ejemplo3.getClass()){
                Carrete cardAux;
                cardAux = (Carrete)jugador1.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
        }
        System.out.println("----->"+jugador2.getNombre());
        for (int x=0;x<jugador2.getMazo().size();x++){
            
            //System.out.println("AQUI "+jugador.getMazo().get(x).getClass());
            if (jugador2.getMazo().get(x).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador2.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador2.getMazo().get(x).getClass()==ejemplo2.getClass()){
                Profesor cardAux;
                cardAux = (Profesor)jugador2.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador2.getMazo().get(x).getClass()==ejemplo3.getClass()){
                Carrete cardAux;
                cardAux = (Carrete)jugador2.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
        }
         System.out.println("**************************Fin Mazos*************************************************");
        
        while (d.getTurnos()<31){
            if (jugador1.getMazo().get(i).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador1.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador1);
            }
            if (jugador1.getMazo().get(i).getClass()==ejemplo2.getClass()){
                Profesor cardAux;
                cardAux = (Profesor)jugador1.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador1);
            }
            if (jugador1.getMazo().get(i).getClass()==ejemplo3.getClass()){
                Carrete cardAux;
                cardAux = (Carrete)jugador1.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador1);
            }
            System.out.println(jugador1.getNombre()+":"+jugador1.getPrioridad()+" / "+jugador2.getNombre()+":"+jugador2.getPrioridad());
            if (jugador2.getMazo().get(i).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador2.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador2);
            }
            if (jugador2.getMazo().get(i).getClass()==ejemplo2.getClass()){
                Profesor cardAux;
                cardAux = (Profesor)jugador2.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador2);
            }
            if (jugador2.getMazo().get(i).getClass()==ejemplo3.getClass()){
                Carrete cardAux;
                cardAux = (Carrete)jugador2.getMazo().get(i);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
                cardAux.Activar(jugador2);
            }
            System.out.println(jugador1.getNombre()+":"+jugador1.getPrioridad()+" / "+jugador2.getNombre()+":"+jugador2.getPrioridad());

            d.addTurnos();
            i++;
        }
       

       /*int i;
        Curso ejemplo1 = new Curso();
        Profesor ejemplo2 = new Profesor();
        Carrete ejemplo3 = new Carrete();
        Sansano jugador = new Sansano();
        int[] arreglo = {0,0};
        jugador.crearMazo(arreglo);
        
        System.out.println("----AQUI "+jugador.getMazo().size());
        for (int x=0;x<jugador.getMazo().size();x++){
            
            //System.out.println("AQUI "+jugador.getMazo().get(x).getClass());
            if (jugador.getMazo().get(x).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador.getMazo().get(x).getClass()==ejemplo2.getClass()){
                Profesor cardAux;
                cardAux = (Profesor)jugador.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
            if (jugador.getMazo().get(x).getClass()==ejemplo3.getClass()){
                Carrete cardAux;
                cardAux = (Carrete)jugador.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.getDescripcion());
            }
        }*/ 
    }
    
}
