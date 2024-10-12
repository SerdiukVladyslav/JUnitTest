package org.example.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapeTest
{
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(10, 5);
        assertEquals(25, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea(), 0.001);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.calculateArea(), 0.001);
    }

    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus(6, 8);
        assertEquals(24, rhombus.calculateArea(), 0.001);
    }
}
