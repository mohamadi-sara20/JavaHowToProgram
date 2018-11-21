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

public class Square extends TwoDimensional {
    private double side;

    public Square(double side){
        setSide(side);
    }



    public final void setSide(double side){
        if(side <= 0)
            throw new IllegalArgumentException("Side must be positive!");
        else
            this.side = side;
    }

    public double getSide(){return this.side;}


    @Override
    public double getArea(){return getSide() * getSide(); }

    @Override
    public String toString(){

        return String.format("%s: %2f%n" , "Side equals", getSide());
    }


}