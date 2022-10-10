package ss4_classes_and_objects_in_java.excercise;

import java.util.Date;

public class StopWatch {
    public Date startTime;
    private Date endTime;


    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}