package br.com.cashmanager;

import br.com.cashmanager.service.CalculadoraImpostos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da receita bruta:");
        double receitaBruta = scanner.nextDouble();

        CalculadoraImpostos calculadora = new CalculadoraImpostos(receitaBruta);
        System.out.println("\nImpostos calculados:");
        System.out.printf("ISS: R$ %.2f\n", calculadora.calcularISS());
        System.out.printf("ICMS: R$ %.2f\n", calculadora.calcularICMS());
        System.out.printf("IRPJ: R$ %.2f\n", calculadora.calcularIRPJ());
        System.out.printf("CSLL: R$ %.2f\n", calculadora.calcularCSLL());
        System.out.printf("PIS/COFINS: R$ %.2f\n", calculadora.calcularPISCOFINS());

    }
}