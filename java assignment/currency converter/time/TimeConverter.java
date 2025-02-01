package time;

public class TimeConverter {
    public static double hoursToMinutes(double time) {
        return time * 60;
    }

    public static double minutesToHours(double time) {
        return time / 60;
    }

    public static double hoursToSeconds(double time) {
        return time * 3600;
    }

    public static double secondsToHours(double time) {
        return time / 3600;
    }
}