# Calculadora de Descontos 🏷️

**Aluno:** Isaque Gabriel da Silva Guimarães  
**RA:** 325131393  
**Disciplina:** Garantia e Gestão da Qualidade de Software  
**Professor:** Daniel Henrique Matos de Paiva  

---

## 📌 Conceito: @Test (Fact) vs. @ParameterizedTest (Theory)
- **`@Test` (`[Fact]` no C#):** Executa o método de teste apenas **uma vez** sem parâmetros[cite: 67].
- **`@ParameterizedTest` (`[Theory]` no C#):** Permite executar o mesmo método de teste **múltiplas vezes** passando diferentes conjuntos de dados através do `@CsvSource` (`[InlineData]` no C#), evitando duplicar código de teste[cite: 67, 69].

## 🧪 Testes Realizados
1. **Categorias de Cliente:** Validação de `BRONZE`, `PRATA` e `OURO`[cite: 68, 69].
2. **Cálculo de Desconto:** Aplicação de porcentagem sobre valores originais[cite: 68, 69].
3. **Elegibilidade ao Cupom:** Validação por idade e status de primeira compra[cite: 68, 69].