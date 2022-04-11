import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner (System.in);
  //Variavel
  double deposito = 0.0,
         taxaDeJuros = 0.0,
         rendimento = 0.0,
         total = 0.0;
//Entrada de dados
System.out.print("Valor De Deposito : R$ ");
 deposito = leitor.nextDouble();
 System.out.print("Taxa de juros : % ");
 taxaDeJuros = leitor.nextDouble();
 //Processamento
 rendimento = (taxaDeJuros /100) * deposito;
 total = rendimento + deposito;
 //saida
 System.out.println("Rendimento : R$ " + total);


  }
}