import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
      System.out.print("Informe o nome do funcionário: "); 
        String nome = sc.nextLine();
        System.out.print("Informe o valor do salário: ");
        int salario = sc.nextInt();
        int bonus = salario * 30 / 100;
        int valorfinal = bonus + salario;
    
      System.out.println("Nome: " + nome);
      System.out.println("Salário bruto: R$" + salario + ".00");
      System.out.println("Adicional: R$" + bonus + ".00");
      System.out.println("Salário final: R$" + valorfinal + ".00");
      
      
      
    }
}