import java.util.Locale;
import java.util.Scanner;

public class Cliente{
//    TO DO:
//    Atributo	Tipo	Exemplo
//    Numero	Inteiro	1021
//    Agencia	Texto	067-8
//    Nome Cliente	Texto	MARIO ANDRADE
//    Saldo	Decimal	237.48
//
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale (Locale.US);

        System.out.println("Por favor, digite o número da Sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        double saldo = 250.0;

        System.out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " +  agencia +
                ", conta " + numero +   " e seu saldo " + saldo + " já está disponível para saque");

    }





}




