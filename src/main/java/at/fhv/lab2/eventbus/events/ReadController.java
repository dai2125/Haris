package at.fhv.lab2.eventbus.events;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:8081"})
//@CrossOrigin(origins = {"http://localhost:8081/ccc"})
//@CrossOrigin(origins = {"http://localhost:8081"}, methods = {RequestMethod.POST})
//@RequestMapping("/ccc")
public class ReadController {

    @PostMapping("/aaa")
    public String aaa() {
        System.out.println("PostContorller aaa");
        return "aaa";
    }

    @PostMapping("bbb")
    public String submitData(@RequestBody String data) {
        System.out.println("PostContorller bbb");
        return "Daten erfolgreich erhalten: " + data;
    }

    @PostMapping("/ccc")
    public String ccc() {
        System.out.println("PostController ccc");
        return "ccc";
    }
@PostMapping
public String ddd() {
    System.out.println("PostContorller ddd");
    return "ddd";
}
}

