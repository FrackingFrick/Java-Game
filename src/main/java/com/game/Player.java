package com.game;

public class Player {
    private String name;
    private Integer gamesPlayed;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
   public void setGames(Integer games){
    this.gamesPlayed=games;
   }
   public Integer getGames(){
    return gamesPlayed;
   }
    public Player(){
        this.name="Heta";
        this.gamesPlayed=0;
    }
    
}
