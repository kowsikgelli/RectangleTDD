import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    public void createObject(){ rectangle = new Rectangle(2,4);}

    @Test
    @DisplayName("Test whether the length is declared")
    void isLengthAssignedToTwo(){ assertEquals(2,rectangle.getLength());}

    @Test
    @DisplayName(("Test whether the height is declared"))
    void isHeightAssignedToFour(){assertEquals(4,rectangle.getHeight());}

    @Test
    @DisplayName("Length and Height Should not be equal")
    void lengthShouldNotEqualsHeight(){
        int length = rectangle.getLength();
        int height = rectangle.getHeight();
        assertNotEquals(length,height);
    }

    @Test
    @DisplayName(("Check for the zero or negative length condition"))
    void lengthShouldNotBeLessThanOne(){assertNotEquals(0,rectangle.getLength());}

    @Test
    @DisplayName("Check for the zero or negative height condition")
    void heightShouldNotBeLessThanOne(){assertNotEquals(0,rectangle.getHeight());}

    @Test
    @DisplayName("Area should equals to eight")
    void areaOfRectangleEqualsToEight(){assertEquals(8,rectangle.getArea());}
    
}
