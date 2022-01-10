import java.util.EventObject;

public class AlarmEvent extends EventObject { // create constructor

    String message;

    public AlarmEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
