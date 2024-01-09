
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TapTempo {

    public static void main(String[] args) {   
        System.out.println("You are in Tap Tempo mode. Press RETURN to start computing tempo");
        getTime();
    }

    public static void getTime() { 
        Scanner in = new Scanner(System.in);
        String dummy = in.nextLine();

        while (!dummy.equals("c")) {
            long start = System.currentTimeMillis();
            dummy = in.nextLine();
            long time = System.currentTimeMillis() - start;
            displayBPM(time);
        }
        
        in.close();
    }

    public static void displayBPM(long time) {
        double bpm = (60.0 * 1000) / time;
        System.out.println("bpm of  " + bpm);
    }
}

