package com.google;
/*
Author :Uma
code for calculate time duration in which a 340m
long train can pass 160m long tunnel at speed 45 km/hr
* */

public class Ass5 {
    public static void main(String[] args) {

        int trainLength=340;//340 m long train
        double speed=45.0;//45 km/hr speed of train
        int tunnel=160; //160m long tunnel

        /*
        * Here we have given speed in km/hr and length of train and tunnel in m unit...
        * first we have to convert km/hr in m/s
        * 45 km/hr= 45* 1000/3600 m/s
        * Speed= 25/2 m/s
        * Total distance to cover (340+160)m= 500m
        * time = distance/speed
        *        500/ (25/2)
        *        500*(2/25)
        *        40 seconds
        * */

        speed=(double) speed*(1000/3600.0);
        int distance=tunnel+trainLength;
        double time=distance/speed;

        System.out.println(" Time required :"+ time+" Seconds");





    }
}
