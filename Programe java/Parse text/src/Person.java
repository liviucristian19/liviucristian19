public class Person {
    private final String surname;
    private final String name;
    private final String city;

    public Person(String surname, String name, String city) {
        this.surname = surname;
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Surname is "+ surname + "," +
                " Name is " + name + "," + " " +
                "City is " + city + ".";
    }

}