package InfoOfPerson;

public class Person {
    private String name;
    private String surname;
    private int ticketsAmount;

    public Person(String name, String surname, int ticketsAmount) {
        this.name = name;
        this.surname = surname;
        this.ticketsAmount = ticketsAmount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicketsAmount() {
        return ticketsAmount;
    }

    public void setTicketsAmount(int ticketsAmount) {
        this.ticketsAmount = ticketsAmount;
    }
}