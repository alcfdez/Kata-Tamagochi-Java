package com.kata;

public class States {
   private String mood = null;
    private int hunger = 0;
    private String energy = null;
    
    public States(String mood, int hunger, String energy) {
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }


    
}
