package com.calculadora;

public class DescontoService {

    // 1. Obter Categoria Cliente
    public String obterCategoriaCliente(int totalCompras) {
        if (totalCompras < 5) {
            return "BRONZE";
        } else if (totalCompras <= 10) {
            return "PRATA";
        } else {
            return "OURO";
        }
    }

    // 2. Calcular Desconto por Percentual
    public int calcularDescontoPorPercentual(int valorOriginal, int percentualDesconto) {
        return valorOriginal - (valorOriginal * percentualDesconto / 100);
    }

    // 3. E Valido Para Cupom
    public boolean eValidoParaCupom(int idade, boolean primeiraCompra) {
        return idade >= 18 || primeiraCompra;
    }
}