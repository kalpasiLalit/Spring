package com.example.SpringAssignment1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
interface Ivehicle{
    void start();
}
@Component
@Primary
class Car implements Ivehicle{

    @Override
    public void start() {
        System.out.println("car started");
    }
}

@Component
class Bike implements Ivehicle{

    @Override
    public void start() {
        System.out.println("Bike started");
    }
}
/*here traveler class is tightly coupled with
* car class is Bike class got failed then traveler
* can not start the trip*/
public class TravelerQuestion1 {
    Ivehicle vehicle = new Bike();
    void  startTrip(){
        vehicle.start();
    }
}
