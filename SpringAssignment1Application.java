package com.example.SpringAssignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAssignment1Application {

	public static void main(String[] args) {
		/*this the example of TightCoupling here traveler class is tightly coupled
		* with car class you can check more in TravelerQuestion1 class */
		TravelerQuestion1 traveler2 = new TravelerQuestion1();
		        traveler2.startTrip();

		/*this the example of Loosely Coupled code here traveler class is Loosely coupled
		 *you can check more in travelerQuestion2 class*/
		TravelerQuestion2 traveler1 = new TravelerQuestion2(new Car());
		traveler1.startTrip();

		/* this will call the start method of car class because we set the car
		class as primary*/
		ApplicationContext context = SpringApplication.run(SpringAssignment1Application.class, args);
		TravelerQuestion3_6 traveler = context.getBean(TravelerQuestion3_6.class);
		      traveler.startTrip();

	}

}
