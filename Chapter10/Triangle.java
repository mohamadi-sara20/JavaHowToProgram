package JavaHowToProgram.Chapter10;

public class Triangle extends TwoDimensional{
    private double height;
    private double base;

    public Triangle(double height, double base){
        setBase(base);
        setHeight(height);
    }




    public final void setHeight(double height){
        if (height <= 0)
            throw new IllegalArgumentException("Height must be positive!");
        else
            this.height = height;
    }

    public final void setBase(double base){
        if(base <= 0)
            throw  new IllegalArgumentException("Base must be positive!");
        else
            this.base = base;
    }

    public double getHeight(){return this.height;}
    public double getBase(){return this.base;}


    @Override
    public double getArea(){return getBase() * getHeight() / 2;}

    @Override
    public String toString(){
        return String.format("%s: %f%n%s: %2f%n", "Height equals", getHeight(), "Base eqyals", getBase());
    }


}


