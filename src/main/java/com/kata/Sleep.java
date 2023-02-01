package com.kata;

public class Sleep  extends States{
    private String tired = "(-_-)";
    private String sleeping = "(-_-) zZZ";
    private String normal = ":-|";
    
    
    public Sleep(String mood, int hunger, String energy, String tired, String sleeping, String normal) {
        super(mood, hunger, energy);
        this.tired = tired;
        this.sleeping = sleeping;
        this.normal = normal;
    }


    public String getTired() {
        return tired;
    }


    public void setTired(String tired) {
        this.tired = tired;
    }


    public String getSleeping() {
        return sleeping;
    }


    public void setSleeping(String sleeping) {
        this.sleeping = sleeping;
    }


    public String getNormal() {
        return normal;
    }


    public void setNormal(String normal) {
        this.normal = normal;
    }

    
    
}
