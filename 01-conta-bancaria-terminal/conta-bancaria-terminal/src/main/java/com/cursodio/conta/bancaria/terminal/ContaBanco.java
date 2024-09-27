/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.cursodio.conta.bancaria.terminal;

import java.util.Scanner;

/**
 *
 * @author Luiz Matos
 */
public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta.");
        String numeroConta = scanner.nextLine();
        System.out.println("Digite a agência da conta.");
        String agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente.");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o valor disponível na conta");
        Double valor = scanner.nextDouble();

        Conta conta = new Conta(numeroConta, agencia, nomeCliente, valor);

        System.out.println(conta.toString());

    }
}

class Conta {

    private final String numeroConta;
    private final String agencia;
    private final String nomeCliente;
    private Double valor;

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getValor() {
        return valor;
    }

    public Conta(String numeroConta, String agencia, String nomeCliente, Double valor) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", valor) + " já está disponível para saque";
    }

}
