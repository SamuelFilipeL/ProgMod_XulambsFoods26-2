import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    Pizza pizza;
    
    @BeforeEach
    public void setUp(){
        //Arrange
        pizza = new Pizza();
        pizza.adicionarIngredientes(2);
    }

    @Test
    public void adicionaIngredientesCorretamente(){
        //Act
        int quantos = pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(6, quantos);
    }

    @Test
    public void naoAdicionaIngredienteNegativos(){
        //Act
       int quantidade = pizza.adicionarIngredientes(-1);

       //Assert: valor esperado, valor testado 
       assertEquals(2, quantidade);
    }

     @Test
    public void naoUltrapassaMaximoIngredientes(){
        //Act
        int quantidade = pizza.adicionarIngredientes(7);
        //Assert
        assertEquals(2, quantidade);
    }
    
    @Test
    public void calculaOPrecoCorretamente(){
        //Act
        double preço = pizza.valorFinal();
        //Assert
        assertEquals(39, preço, 0.01);
    }
}
