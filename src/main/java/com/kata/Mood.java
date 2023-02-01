package com.kata;

public class Mood extends States{
   private String happy =  ":-)";
   private String angry =  "ఠ_ఠ";
   private String normal = ":-|";


   public Mood(String mood, int hunger, String energy, String happy, String angry, String normal) {
    super(mood, hunger, energy);
    this.happy = happy;
    this.angry = angry;
    this.normal = normal;
}


public String getHappy() {
    return happy;
}


public void setHappy(String happy) {
    this.happy = happy;
}


public String getAngry() {
    return angry;
}


public void setAngry(String angry) {
    this.angry = angry;
}


public String getNormal() {
    return normal;
}


public void setNormal(String normal) {
    this.normal = normal;
}
   
   
   

}
