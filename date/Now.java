package date;

public class Now {
    long totalMillisecond=1000000;
    long second=totalMillisecond/1000;
    long currentSecond=second%60;
    long totalMinutes=second/60;
    long currentMinute=totalMinutes%60;
    long totalHours=totalMinutes/60;
    long currentHour=(totalHours%24)+6;

    @Override
    public String toString() {
        return "Now{" +
                ", currentHour=" + (currentHour)+
                ", currentMinute=" + currentMinute +
                ", currentSecond=" + currentSecond +
                '}';
    }
}
