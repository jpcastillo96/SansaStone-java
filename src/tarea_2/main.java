package tarea_2;
public class main {
    public static void main(String[] args) {
        int i;
        Curso ejemplo1 = new Curso();
        Profesor ejemplo2 = new Profesor();
        Carrete ejemplo3 = new Carrete();
        Sansano jugador = new Sansano();
        jugador.iniSansano("Juan",3000);
        int[] arreglo = {0,0};
        jugador.crearMazo(arreglo);
        
        System.out.println("----AQUI "+jugador.getMazo().size());
        for (int x=0;x<jugador.getMazo().size();x++){
            
            //System.out.println("AQUI "+jugador.getMazo().get(x).getClass());
            if (jugador.getMazo().get(x).getClass()==ejemplo1.getClass()){
                Curso cardAux;
                cardAux = (Curso)jugador.getMazo().get(x);
                System.out.println(cardAux.getNombre()+"->"+cardAux.Descripcion());
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
        }
        
        
        /*List<Carta> list1;
        list1= new LinkedList();
        Curso card;
        Carrete card2;
        card2= new Carrete();
        card = new Curso();
        card2.iniCarta("Sansafonda", "Recupera 100 puntos de prioridad", 100);
        System.out.println(card2.Nombre()+"-->"+card2.Descripcion());
        card.iniCarta("Mate4","Ataca 550/Cura 200 puntos de prioridad. Cantidad: 1", 500, 600);
        System.out.println(card.Nombre() +"-->"+card.Descripcion());
        list1.add(card);
        list1.add(card2);
        System.out.println(list1.get(0).Nombre());
        System.out.println(list1.get(1).Nombre());
        
        for (i=0;i<list1.size();i++){
            if (list1.get(i).getClass()==ejemplo1.getClass()){
                
            }
        }
        if (list1.get(0).getClass()==ejemplo1.getClass()){
            System.out.println("la wea es tipo Curso!!!");
            
        }*/
        
    }
    
}
