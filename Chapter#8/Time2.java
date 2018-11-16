package ir.phgnight;
//It would be perfectly reasonable
//for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since midnight
//rather than the three integer values hour, minute and second. Clients could use the same public
//methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
//the number of seconds since midnight and show that no change is visible to the clients of the class.
public class Time2 {
    private int second;

    public Time2(){
        this(0);
    }

    public Time2(int second){
        this.second = second;
    }

    public Time2(Time2 time2){
        time2.second = this.second;
    }


    public static void main(String[] args) {
        Time2 time2 = new Time2(0);
        System.out.print(time2.toUniversalString());
        System.out.print(time2.toString());

        time2.setSecond(9340);
        System.out.print(time2.toUniversalString());
        System.out.print(time2.toString());


    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour(){
        int hour = second/3600;
        return hour;
    }

    public int getMinute(){
        int minute = (second - 3600 * getHour()) / 60;
        return  minute;
    }

    public int getSecond(){
        int second = (this.second - 3600 * getHour() - 60 * getMinute());
        return second;
    }

    public String toUniversalString(){
        int hour = getHour();
        int minute = getMinute();
        int second = getSecond();
        return String.format("%02d:%02d:%02d%n", hour, minute, second);
    }

    public String toString(){
        int hour = getHour();
        int minute = getMinute();
        int second = getSecond();
        return String.format("%02d:%02d:%02d %s%n", hour>12? hour%12 : hour, minute, second, hour>12 ? "PM":"AM");
    }




}

