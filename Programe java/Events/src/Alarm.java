import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

  private AlarmListener[] listeners = {}; //creez un sir de ascultatori + am nevoie de 2 metode(mai jos)

    public void addListener(AlarmListener alarmListener){
  AlarmListener[] newListeners = new AlarmListener[listeners.length + 1];
 System.arraycopy(listeners,0, newListeners, 0, listeners.length);
 newListeners[listeners.length] = alarmListener;
 listeners = newListeners;
    }

     public void removeListener(AlarmListener alarmListener){
    int indexOfElementToRemove = -1;
         for (int i = 0; i <listeners.length ; i++) {
             if(alarmListener.equals(listeners[i]))
                 indexOfElementToRemove = i;
         }
         AlarmListener[] newListeners = new AlarmListener[listeners.length - 1];
         System.arraycopy(listeners,0,newListeners,0,indexOfElementToRemove);

         System.arraycopy(listeners,indexOfElementToRemove +1,newListeners,
                 indexOfElementToRemove,listeners.length - indexOfElementToRemove -1);

         listeners = newListeners;
     }

     public void setTimeFromNow(int millis){

          Timer timer = new Timer("Timer");
          timer.schedule(new TimerTask() {
               @Override
               public void run() {
                    System.out.println("AlarmEvent triggered...");

               for(AlarmListener listener : listeners){
               AlarmEvent eventObj = new AlarmEvent(this, "Time is up!");
               listener.alarmRang(eventObj);
 }
                //trebuie sa setez ca aplicatia sa isi finalizeze executia cu
                   System.exit(0);
               }
          }, millis);
     }
}
