package tiendat.thinkpad.rectangle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReactangleTest {
    @Test
    public void testThatGetSizeOfRectangle() {
        Rectangle rectangle = new Rectangle(3,5);
        double expectWidth = 3;
        double expectHeight = 5;
        assertEquals(expectWidth, rectangle.getWidth());
        assertEquals(expectHeight,rectangle.getHeight());
    }

    @Test
    public void testThatGetAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3, 5);
        double expect = 15;
        double actual = rectangle.getArea();
        assertEquals(expect, actual);
    }

    @Test
    public void testThatGetPerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(3, 5);
        double expect = 16;
        double actual = rectangle.getPerimeter();
        assertEquals(expect, actual);
    }
}
