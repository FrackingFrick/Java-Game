package com.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    Player p= null;
    Game g=null;

    @PostMapping("/player")
    public void postPlayer(@RequestParam String name){
        p= new Player();
        p.setName(name);
    }
    @GetMapping("/player")
    public String getPlayer(){
        return p.getName() + ", " + p.getGames();
    }
    @PostMapping("/game")
    public void newGame(){
         g=new Game();
    }
    @PutMapping()
    public String chosenNumber(){
        g.chosenNumber();
        return "Guess a number between 0 and 100. ";
    }
    @PutMapping("/game")
    public String gameLogic(@RequestParam int guess){
        return g.gameLogic(guess);

    }


    }
    
    

