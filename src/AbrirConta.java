import java.math.BigDecimal;
import java.util.Scanner;

public class AbrirConta {

    Scanner scanner;
    public void realizarOperacao(){

        this.scanner = new Scanner(System.in);
        System.out.println("Implementar abertura de contas");
        System.out.println("Informe o nome do Titular");
        String nome = this.scanner.next();
        System.out.println("Informe o PF para pessoa fisica e PJ para pessoa Juridica");
        String tipoPessoa = this.scanner.next();
        System.out.println("Informe o tipo da conta: \n 1 - conta corrente, 2 - conta poupança e 3 - conta investimento");
        int tipoConta = this.scanner.nextInt();

        int numConta = 1;

        Conta conta1 = new Conta(nome, tipoPessoa, tipoConta, numConta, BigDecimal.valueOf(0d));

        System.out.println("Conta aberta com sucesso, seu novo numero de conta é: " +numConta);


    }
}
