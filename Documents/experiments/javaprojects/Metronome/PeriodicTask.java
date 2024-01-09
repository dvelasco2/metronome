
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class PeriodicTask extends TimerTask {
    public void run() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {
        Timer myTimer = new Timer();
        System.out.println("Enter an integer tempo (BPM)");
        Scanner in = new Scanner(System.in);
        int bpm = in.nextInt();
        long period = (60 * 1000) / bpm;
        myTimer.schedule(new PeriodicTask(), 0, period);
    }
}
