package ${package}.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public ResponseEntity<String> balance(@RequestParam String echo) {
        return ResponseEntity.ok(echo);
    }

}