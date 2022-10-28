package com.game;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class PointsController {

    @GetMapping("/points")
    public int getPoints(){
        return 0;
    }
    
}
