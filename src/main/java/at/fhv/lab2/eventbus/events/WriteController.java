package at.fhv.lab2.eventbus.events;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8081"})
@RestController
public class WriteController {

    @GetMapping("/aaa")
    public String aaa() {
        System.out.println("aaa");
        return "aaa";
    }

    @GetMapping("/bbb")
    public String bbb() {
        System.out.println("bbb");
        return "bbb";
    }

    @GetMapping("/ccc")
    public String ccc() {
        System.out.println("ccc");
        return "ccc";
    }
}
