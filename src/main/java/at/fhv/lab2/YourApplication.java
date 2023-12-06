package at.fhv.lab2;

import at.fhv.lab2.commandclient.EventPublisher;
import at.fhv.lab2.eventbus.events.Event;
import at.fhv.lab2.eventbus.events.ReadController;
import at.fhv.lab2.eventbus.events.WriteController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YourApplication implements CommandLineRunner {

    private final EventPublisher eventPublisher;

    public YourApplication(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public static void main(String[] args) {

//        MyController myController = new MyController();
//        MyPostController myPostController = new MyPostController();
        SpringApplication.run(YourApplication.class, args);

        WriteController writeController = new WriteController();
        ReadController readController = new ReadController();
        System.out.println(writeController.aaa());
        writeController.aaa();
    }

    @Override
    public void run(String... args) throws Exception {
        Event event = new Event(); // Erstellen Sie ein Event-Objekt
        // Konfigurieren Sie das Event-Objekt nach Bedarf
        eventPublisher.publishEvent(event); // Veröffentlichen des Events
    }
}
