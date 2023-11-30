import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void valueOfSauceTest() {
        // Arrange
        String typeString = "SAUCE";

        // Act
        IngredientType actual = IngredientType.valueOf(typeString);

        // Assert
        Assert.assertEquals("Тип ингредиента не соответствует", IngredientType.SAUCE, actual);
    }

    @Test
    public void valueOfFillingTest() {
        // Arrange
        String typeString = "FILLING";

        // Act
        IngredientType actual = IngredientType.valueOf(typeString);

        // Assert
        Assert.assertEquals("Тип ингредиента не соответствует", IngredientType.FILLING, actual);
    }
}
