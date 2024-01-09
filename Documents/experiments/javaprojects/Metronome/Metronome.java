public class Metronome {
    public static void main(String[] args) {
        String mode = args[0];
        if (mode.equals("0")) {
            TapTempo.main(args);
        }
        else if (mode.equals("1")) {
            PeriodicTask.main(args);
        }
    }
}
