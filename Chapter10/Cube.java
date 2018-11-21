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

public class Cube extends ThreeDimensional{
    private double edge;

    public Cube(double edge){
        setEdge(edge);
    }


    public final void setEdge(double edge){
        if(edge <= 0)
            throw new IllegalArgumentException("Edge has to be positive!");
        else
            this.edge = edge;
    }

    public double getEdge(){return this.edge;}


    @Override
    public double getArea(){return 6 * Math.pow(getEdge(), 2);}

    @Override
    public double getVolume(){return Math.pow(getEdge(), 3);}

    @Override
    public String toString(){return String.format("%s: %2f%n", "Edge equals", getEdge());}


}
