/*Design a class ‘Time’ having data members as hour, minute and second. 
The class should have a parameterized constructor to initialize its data members. 
It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() 
to add two times. Test these methods by creating a main method in another class.*/
class Time {
    int hour, minute, second;
    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
    Time addTime(Time t) {
        int sec = this.second + t.second;
        int min = this.minute + t.minute + sec / 60;
        int hr = this.hour + t.hour + min / 60;
        return new Time(hr % 24, min % 60, sec % 60);
    }
}
public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 20, 30);
        Time sum = t1.addTime(t2);
        sum.displayTime();
    }
}



