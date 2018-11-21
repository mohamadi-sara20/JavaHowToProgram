//(Project:
// Shape
// Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each Two-
//DimensionalShape
// should contain method getArea to calculate the area of the two-dimensional
//shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
//surface area and volume, respectively, of the three-dimensional shape. Create a program that uses
//an array of Shape references to objects of each concrete class in the hierarchy. The program should
//print a text description of the object to which each array element refers. Also, in the loop that pro-
//cesses all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
//ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimension-
//alShape, display its area and volume.


package JavaHowToProgram.Chapter10;

public class ShapeTest {

    public static void main(String[] args){

        Circle circle = new Circle(1);
        Square square = new Square(1);
        Triangle triangle = new Triangle(1, 1);

        Sphere sphere = new Sphere(1);
        Cube cube = new Cube(1);
        Tetrahedron tetrahedron = new Tetrahedron(1);

        Shape[] shapes = new Shape[6];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;


        for(Shape shape: shapes) {
            if(shape instanceof TwoDimensional)
            System.out.printf("%s%n%s: %2f%n%n", shape.getClass().getName(), "Area equals", shape.getArea());

            if(shape instanceof ThreeDimensional){
                System.out.printf("%s%n%s: %f%n%n", shape.getClass().getName(), "Volume equals", ((ThreeDimensional) shape).getVolume());

            }

        }







    }


}
