
import org.junit.jupiter.api.*;
import trianglepackage.Triangle;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {

    Triangle triangle;


    @Test
    public void testToCheckIfTheTriangleIsImpossible(){
        triangle = new Triangle(-1,2,5);
        assertEquals("impossible",triangle.classify());
    }

    @Test
    public void testToCheckIfTheTriangleIsScalene(){
        triangle = new Triangle(1,2,3);
        assertEquals("scalene",triangle.classify());
        assertEquals(true,triangle.isScalene());
    }

    @Test
    public void testToCheckIfTheTriangleIsEquilateral(){
        triangle = new Triangle(2,2,2);
        assertEquals("equilateral",triangle.classify());
        assertEquals(true,triangle.isEquilateral());
    }

    @Test
    public void testToCheckIfTheTriangleIsIsossceles(){
        triangle = new Triangle(3,3,1);
        assertEquals("isossceles",triangle.classify());
        assertEquals(true,triangle.isIsosceles());
    }

    @Test
    public void testToCheckIfTheTriangleIsRightAngled(){
        triangle = new Triangle(3,4,5);
        assertEquals("right-angled",triangle.classify());
    }

    @Test
    public void testTriangleArea(){
        triangle = new Triangle(3,4,5);
        assertEquals(6,triangle.getArea());
    }

    @Test
    public void testTrianglePerimeter(){
        triangle = new Triangle(3,4,5);
        assertEquals(12,triangle.getPerimeter());
    }
}
