import javax.swing.JOptionPane;

public class Questao02{

    public static void main (String[] args){

        //Solicite a idade para o usuário até que ele digite uma idade maior que 128:
        
        int idadeMaxima = 128;
        
        int idade =  Integer.parseInt(JOptionPane.showInputDialog (null, "Digite sua idade "));
         
        
        while(idade < idadeMaxima) { 
          idade = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite sua idade "));
        
        }
       }
   }
   