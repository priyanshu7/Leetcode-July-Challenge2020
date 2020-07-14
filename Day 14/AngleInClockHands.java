package july2020;

public class AngleInClockHands {
	
	public double angleClock(int hour, int minutes) {
        double degree_minute = minutes * 6;
        double degree_hour = hour * 30 + minutes * 0.5;
        degree_hour = degree_hour >= 360.0 ? degree_hour - 360.0 : degree_hour;
        return Math.min(Math.abs(degree_hour - degree_minute) , 360 - Math.abs(degree_hour - degree_minute));
    }

}
