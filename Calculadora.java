import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Calculadora\n");

        System.out.println("Digite o primeiro número:");
        double n1 = x.nextDouble();
        System.out.println("Digite o segundo número:");
        double n2 = x.nextDouble();

        Metodos calcular = new Metodos(n1, n2);

        int escolha;
        do {
            System.out.println("Escolha uma operação para realizar: \n[1]Soma \n[2]Subtração \n[3]Multiplicação \n[4]Divisão \n[5]Alterar Números [6]Encerrar Programa ");

            escolha = x.nextInt();

            if (escolha == 1) {
                System.out.println("Soma é = " + calcular.Soma());
            }
            else if (escolha == 2) {
                System.out.println("Subtração é = " + calcular.Sub());
            }
            else if (escolha == 3) {
                System.out.println("Multiplicação é = " + calcular.Mul());
            }
            else if (escolha == 4) {
                System.out.println("Divisão é = " + calcular.Div());
            }
            else if (escolha == 5) {
                System.out.println("Digite o primeiro número:");
                n1 = x.nextDouble();
                System.out.println("Digite o segundo número:");
                n2 = x.nextDouble();
                calcular = new Metodos(n1, n2);
            }

        } while (escolha != 6);

        System.out.println("Programa encerrado.");
        x.close();
    }
}
