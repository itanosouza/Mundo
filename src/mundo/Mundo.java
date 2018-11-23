
package mundo;


public class Mundo {

    
    public static void main(String[] args) {
       Pessoas p1 = new Pessoas();
       Pessoas p2 = new Pessoas();
       p1.nome = " Adão ";
       p2.nome = " Eva ";
       p1.andar();
       p2.comer();
       Bebe b1 = new Bebe(" Abel ", 'M');
       b1.andar();
               
    };
    
    
}
