package com.cc.java;

// import com.cc.java.bees.Drone;
// import com.cc.java.bees.HoneyBee;
// import com.cc.java.bees.Queen;
// import com.cc.java.bees.Worker;
import com.cc.java.bees.*;  // Alles aus dem Ordner importieren
import com.cc.java.birds.Bird;


public class App {

    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    Bird bird = new Bird();

    ausgabe("----------- Bees -----------");
    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());
    
    ausgabe("----------- Bird(s) -----------");
    ausgabe(bird.hasFeathers());
    
    ausgabe("----------- Bees & Bird(s) -----------");
    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());
    ausgabe(bird.fly());

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
