import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class JavaProgram {
    public static void main(String[] args) {
        System.out.println("Program started...");

        Timer timer = new Timer("Timer");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello World");
                System.exit(0);
            }
        },5000);
    }
}
