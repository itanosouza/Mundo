
package mundo;


public class Bebe extends Pessoas {
    short meses;
    
    //criação do método construtor
    public Bebe(String nome,char sexo){
        this.nome = nome;
        this.sexo = sexo;
    
    }    
    
     @Override
     public void andar(){
        System.out.println(nome+"está engatinhando");
    
}
}