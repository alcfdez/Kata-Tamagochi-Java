package com.kata;

public class Rules {
    private int energy = 0;
    private int mood = 0;
    private int hunger = 0 ;
    
    
    public Rules(int energy, int mood, int hunger) {
        this.energy = energy;
        this.mood = mood;
        this.hunger = hunger;
    }


    public int getEnergy() {
        return energy;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public int getMood() {
        return mood;
    }


    public void setMood(int mood) {
        this.mood = mood;
    }


    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public void rulesEnergy() {
        switch(energy){
            case 1:  energy < 3 = "(-_-)" ;
            case 2:  energy = 0 = "(-_-) zZZ";
            case 3: energy >=3 = ":-|"; 

        }
            
}

}
 