package com.kata;

public class Hunger extends States{
    private int eating = 0;

    public Hunger(String mood, int hunger, String energy, int eating) {
        super(mood, hunger, energy);
        this.eating = eating;
    }

    public int getEating() {
        return eating;
    }

    public void setEating(int eating) {
        this.eating = eating;
    }
    

    
}
