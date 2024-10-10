import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primerio valor");
        int parametroUm = entrada.nextInt();

        System.out.println("Digite o segundo valor");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (Exception e) {
            System.out.println("O segundo numero deve ser maior que o primerio");
        }
        
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois){
            int contagem = parametroUm - parametroDois;

            for (int i=0; i < contagem.length; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("O segundo numero deve ser maior que o primerio");
        }
        
    }
}
