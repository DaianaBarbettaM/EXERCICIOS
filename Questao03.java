import javax.swing.JOptionPane;

public class Questao03{

    public static void main (String[] args){

     /* Solicite o peso para o usuário até que o peso seja menor que 0 ou maior que
        300,00, apresente ao final a quantidade de pessoas que informaram o peso.*/

         int quantidadeDePessoas = 0;
         double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um peso"));

          while (peso > 0 && peso < 300) {
              peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um peso"));
          quantidadeDePessoas = quantidadeDePessoas +1;
          }
            Integer.parseInt ( JOptionPane.showMessegeDialog(quantidadeDePessoas + 
            "Quantidade de pessoas que informaram seu peso é de " ));
               
          
        }
        }



