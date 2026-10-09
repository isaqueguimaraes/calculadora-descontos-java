package com.calculadora;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoServiceTest {

    private final DescontoService service = new DescontoService();

    // Equivalente ao [Theory] + [InlineData] para String
    @ParameterizedTest
    @CsvSource({
        "2, BRONZE",
        "7, PRATA",
        "15, OURO"
    })
    public void testObterCategoriaCliente(int totalCompras, String categoriaEsperada) {
        String resultado = service.obterCategoriaCliente(totalCompras);
        assertEquals(categoriaEsperada, resultado);
    }

    // Equivalente ao [Theory] + [InlineData] para int
    @ParameterizedTest
    @CsvSource({
        "100, 10, 90",
        "200, 20, 160",
        "50, 0, 50"
    })
    public void testCalcularDescontoPorPercentual(int valorOriginal, int percentual, int valorEsperado) {
        int resultado = service.calcularDescontoPorPercentual(valorOriginal, percentual);
        assertEquals(valorEsperado, resultado);
    }

    // Equivalente ao [Theory] + [InlineData] para boolean
    @ParameterizedTest
    @CsvSource({
        "20, false, true",
        "16, true, true",
        "17, false, false"
    })
    public void testEValidoParaCupom(int idade, boolean primeiraCompra, boolean resultadoEsperado) {
        boolean resultado = service.eValidoParaCupom(idade, primeiraCompra);
        assertEquals(resultadoEsperado, resultado);
    }
}