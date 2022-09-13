import InfoOfPerson.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<Person> queue = new LinkedList<>();
        for (Person client : generateClients()) {
            queue.offer(client);
        }
        Person haveRide;

        while (!queue.isEmpty()) {
            Thread.sleep(500);
            haveRide = queue.poll();
            System.out.println(haveRide.getName() + haveRide.getSurname() + " прокатился(ась) на аттракционе, осталось билетов: " + (haveRide.getTicketsAmount() - 1));
            haveRide.setTicketsAmount(haveRide.getTicketsAmount() - 1);
            if (haveRide.getTicketsAmount() > 0) {
                queue.offer(haveRide);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Саша ", "Лаухин", 10));
        clients.add(new Person("Рома ", "Закалов", 5));
        clients.add(new Person("Аня ", "Илькина", 3));
        clients.add(new Person("Саша ", "Батаева", 2));
        clients.add(new Person("Оля ", "Кузьмина", 9));
        return clients;
    }
}