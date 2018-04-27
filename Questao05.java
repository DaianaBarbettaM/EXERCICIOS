
import javax.swing.JOptionPane;

public class Questao05{

    public static void main (String[] args){

         /* Solicite para o usuário dois números. Apresente o seguinte menu e de acordo com a
            escolha deve ser apresentado a operação aritmética, isto deve ocorrer até que o
            mesmo escolha a opção de sair: */

         int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: "));
         int operacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Para calcular escolha uma opção: " + 
                                                                    "\n1 Somar: " +
                                                                     "\n2 Subtrair: " + 
                                                                     "\n3 Multiplicar: " + 
                                                                     "\n4 Dividir: "   +
                                                                     "\n5 Sair"));
         int sair = 5;


         while(sair < 5 ){
             sair = sair +1;
         if(operacao == 1){
         int resultado = (numero1 + numero2);
            JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
         } else if(operacao == 2){
         int resultado = (numero1 - numero2);
            JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
         } else if (operacao == 3){
         int resultado = (numero1 * numero2);
            JOptionPane.showMessageDialog(null,"O resultado é: "+ resultado);
         } else if (operacao == 4 ){
         int resultado = (numero1 / numero2);
            JOptionPane.showMessageDialog(null, "O resultado é: "+ resultado);
         } else (operacao == 5) {
            JOptionPane.showMessageDialog ( null, "Saindo :*  ");
        }
         }
         
    }



}       
      
     
 

