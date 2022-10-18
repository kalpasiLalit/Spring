/* this is the example of loosely Coupled code
    here start trip method is not dependent on any
    single class we can define vehicle class in the constructor of this class
 */

package com.example.SpringAssignment1;
public class TravelerQuestion2 {

    Ivehicle vehicle1 ;

    public TravelerQuestion2 (Ivehicle vehicle1) {
        this.vehicle1 = vehicle1;
    }
    void startTrip(){
        vehicle1.start();
    }
}
