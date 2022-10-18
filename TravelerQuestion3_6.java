package com.example.SpringAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

    @Component
    public class TravelerQuestion3_6 {
        @Autowired
        Ivehicle vehicle1 ;
        //constructor injection
        public TravelerQuestion3_6(Ivehicle vehicle1) {
            this.vehicle1 = vehicle1;
        }
        void startTrip(){
            vehicle1.start();
        }
    }


