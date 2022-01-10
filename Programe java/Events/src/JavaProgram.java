public class JavaProgram implements AlarmListener {

    public static void main(String[] args) {
        JavaProgram javaProgram = new JavaProgram();
        JavaProgram javaProgram1 = new JavaProgram();
        JavaProgram javaProgram2 = new JavaProgram();

        Alarm alarm = new Alarm();
        alarm.addListener(javaProgram);
        alarm.addListener(javaProgram1);
        alarm.addListener(javaProgram2);

        alarm.removeListener(javaProgram1); // dupa 2 s obtinem
        alarm.setTimeFromNow(2000); //dupa 2s timer-ul va fi activat si evenimentul va fi emis
    }
    @Override
    public void alarmRang(AlarmEvent event) {
        System.out.println(event.message);
        System.out.println("Wake up!!!");
    }
}

