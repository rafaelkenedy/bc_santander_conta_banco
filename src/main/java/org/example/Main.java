package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor digite o nome do cliente: ");
        conta.setCliente(scanner.nextLine());

        System.out.println("Por favor digite o saldo inicial:");
        conta.setSaldo(scanner.nextBigDecimal());

        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        String saldoFormatado = formatadorMoeda.format(conta.getSaldo());


        System.out.println(
                "Olá " + conta.getCliente() + ", "
                        + "obrigado por criar uma conta em nosso banco, sua agência é "
                        + conta.getAgencia()
                        + ", conta " + conta.getNumero().getLeft()
                        + " e seu saldo é de " + saldoFormatado
                        + " já está disponível para saque.");

        scanner.close();
    }
}