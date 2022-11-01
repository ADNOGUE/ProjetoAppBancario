import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int operacao;

        Scanner a = new Scanner(System.in);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("        BEM VINDO AO BANCO ITAU-LETSCODE      ");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("INFORME A OPERAÇÃO DESEJADA:");
        System.out.printf("1-ABIR CONTA, 2-SACAR, 3-DEPOSITAR \n4-TRANSFERIR, 5-INVESTIR, 6-CONSULTAR SALDO \n");
        operacao = a.nextInt();

        switch (operacao) {
            case 1:
                new AbrirConta().realizarOperacao();
                break;
            case 2:
                new Sacar().realizarOperacao();
                break;
            case 3:
                new Depositar().realizarOperacao();
                break;
            case 4:
                new Tranferir().realizarOperacao();
                break;
            case 5:
                new Investir().realizarOperacao();
                break;
            case 6:
                new ConsultarSaldo().realizarOperacao();
                break;
            case default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }


    }
}