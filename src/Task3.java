/**
 * Created by volodymyr on 07.06.17.
 */
public class Task3 {
    void calculateAngle(int hour, int minute)
    {
        System.out.println("Task 3");

        // validate the input
        if (hour <0 || minute < 0 || hour >12 || minute > 60)
            System.out.println("Wrong input");

        if (hour == 12) hour = 0;
        if (minute == 60) minute = 0;

        // Calculate the angles moved by hour and minute hands
        // with reference to 12:00
        double hour_angle = 0.5 * (hour*60 + minute);
        double minute_angle = 6*minute;

        // Find the difference between two angles
        double angle = Math.abs(hour_angle - minute_angle);

        // Return the smaller angle of two possible angles
        if (360 - angle < angle) {
            angle = 360 - angle;
        }
        System.out.println("The angle is: " + angle);
        System.out.println("End of task 3");
        System.out.println();

    }
}
