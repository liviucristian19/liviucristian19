import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = new String("John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow Vasile.Ion/Bucuresti");
        String[] textArray = text.split("[./ ]+");
        Person [] personArray = new Person[textArray.length/3];

        for (String s : textArray)
            for (int i = 0; i < personArray.length; i++) {
                personArray[i] = new Person(textArray[i * 3], textArray[i * 3 + 1], textArray[i * 3 + 2]);
            }
       for(Person person : personArray){
          System.out.println(person);
        }
    }
}