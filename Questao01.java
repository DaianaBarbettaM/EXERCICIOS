import javax.swing.JOptionPane;

import org.omg.CORBA.NO_MEMORY;

public class Questao01{

    public static void main (String[] args){

        //Solicite nomes ao usuário até que o mesmo digite fim para o nome:
        
     String nome = JOptionPane.showInputDialog (null, "Digite o seu nome");

     while(!nome.equalsIgnoreCase("sair") && 
                !nome.equalsIgnoreCase("fim")){
      nome = JOptionPane.showInputDialog(null, "Digite seu nome.\n Se desejar sair digite \"Sair\"  ");
    
                 
                  }
    }
}