package JavaHowToProgram.Chapter15;


import java.util.EnumSet;

public class TrafficLightTest{

    public static void main(String[] args){
        for(TrafficLight trafficLight: TrafficLight.values())
            System.out.printf("%-5s:%-5d%n", trafficLight.getDuration(trafficLight));

        System.out.print("Using EnumSet: \n");

        for(TrafficLight trafficLight: EnumSet.range(TrafficLight.Red, TrafficLight.Yellow))
            System.out.printf("%-5s:%-5d%n",trafficLight, trafficLight.getDuration(trafficLight));


    }
}

