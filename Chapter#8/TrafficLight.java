package ir.phgnight;

//Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
//the duration of the light. Write a program to test the TrafficLight enum so that it displays the
//enum constants and their durations.

public enum TrafficLight{
    Red(120),
    Green(60),
    Yellow(10);

    private final int number;

     TrafficLight(int number){
        this.number = number;
    }

    public int getDuration(TrafficLight t){
         return t.number;
    }
}

