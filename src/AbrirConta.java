import java.math.BigDecimal;
import java.util.Scanner;

public class AbrirConta {

    Scanner scanner;
    public void realizarOperacao(int numConta){

        this.scanner = new Scanner(System.in);
        System.out.println("Vamos abrir a sua conta!");
        System.out.println("Informe o nome do Titular");
        String nome = this.scanner.next();
        System.out.println("Informe o PF para pessoa fisica e PJ para pessoa Juridica");
        String tipoPessoa = this.scanner.next();
        System.out.println("Informe o tipo da conta: \n 1 - conta corrente, 2 - conta poupança e 3 - conta investimento");
        int tipoConta = this.scanner.nextInt();


        Conta conta1 = new Conta(nome, tipoPessoa, tipoConta, numConta);

        System.out.println("Conta aberta com sucesso, seu novo numero de conta é: " +numConta);


    }
}
