import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int saldoInicial = 10;
        String numeroConta = "0011-58";

        System.out.println("Bem vindo ao banco do Futuro");
        System.out.println("Digite seu nome");
        String nome = entrada.next();

        System.out.println("Ola " + nome + " Sua conta foi criada com sucesso");
        System.out.println("Conta " + numeroConta);
        System.out.println("Saldo inicial " + saldoInicial);
        System.out.println("Gostaria de depositar mais algum valor ?");
        System.out.println("S para sim N para não");
        String resposta = entrada.next().toUpperCase();

        if (resposta.equals("S")) {
            System.out.println("Digite um valo");
                int valorDepositado = entrada.nextInt();

                saldoInicial += valorDepositado;
            System.out.println("Seu saldo " + saldoInicial);

        }else{
            System.out.println("Obrigado, volte sempre");
        }

        
    }
    
}
