package br.com.cashmanager.service;

public class CalculadoraImpostos {
    private double receitaBruta;

    public CalculadoraImpostos(double receitaBruta) {
        this.receitaBruta = receitaBruta;
    }

    public double calcularISS() {
        return receitaBruta * 0.02; // 2% de ISS
    }

    public double calcularICMS() {
        return receitaBruta * 0.18; // 18% de ICMS
    }

    public double calcularIRPJ() {
        return receitaBruta * 0.15; // 15% de IRPJ
    }

    public double calcularCSLL() {
        return receitaBruta * 0.09; // 9% de CSLL
    }

    public double calcularPISCOFINS() {
        return receitaBruta * 0.034; // 3.4% de PIS/COFINS
    }
}
