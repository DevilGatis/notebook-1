package lv.tele2.javacourses;

import java.time.LocalTime;

public class Alarm extends Note implements Expirable{
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Alarm(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean isExpired() {
        return time.isBefore(LocalTime.now());
    }

    @Override
    public void dismiss() {

    }
}
