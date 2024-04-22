import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Bem-Vindo! Por favor, insira o numero de sua agência:\nExemplo: 000-0 ");
        String agencia = scanner.nextLine();
        

        System.out.println("Agora digite sua conta:\nExemplo: 0000 ");
        int numeroConta = scanner.nextInt();
       scanner.nextLine();

        System.out.println("Insira seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Deseja realizar um depósito? Se sim, digite 1. Caso contrário, digite 0.");
        int desejaDeposito = scanner.nextInt();
        double saldo = 0;
            if (desejaDeposito == 1) {
                System.out.println("Valor do depósito:\nExemplo: 10,50,400");
                double deposito = scanner.nextDouble();
                saldo += deposito;
            }
            
        
        System.out.println("Ola "+ nomeCliente +", obrigado por criar uma conta em nosso banco! Sua agência é: "+ agencia+", conta: "+ numeroConta+" e seu saldo R$"+ saldo+" esta liberado." );
            

    

     


       
    }
}
