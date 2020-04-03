package wiredrtn.demo.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public class SubscriberController {
    @Autowired
    SubscriberRepository subscriberRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Subscriber>> getAllSubscribers(){
        List<Subscriber> subscribers = subscriberRepository.findAll();
        return new ResponseEntity<List<Subscriber>>(subscribers, new HttpHeaders(), HttpStatus.OK);
    }
}
