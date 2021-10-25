package com.nitincodes;

public class Main {
// Q2. Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores
        /* Boolean values to indicate whether the appliance is ON or OFF. Design a menu driven program in
         java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total
         power consumed is more than 2kW, show a message Overload. Assume AC consumes 1200 watts,
        Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt
        */

    public static void main(String[] args) {
      Classroom c1 = new Classroom();
      c1.ac = 1200;
      c1.homeTheatre = 600;
      c1.fan = 400;
      c1.light = 100;
      c1.Ac_on = true;
      c1.Fan_on = true;
      c1.Home_Theatre_on = true;
      c1.Light_on = true;
      if(c1.Ac_on && c1.Fan_on&& c1.Light_on && c1.Home_Theatre_on){
          if((c1.ac+c1.fan + c1.light + c1.homeTheatre)>2000){
              c1.message();
          }
          else {
              System.out.println("its not overloaded");
          }
      }
      else{
          System.out.println("its not on");
      }
    }
}
class Classroom{
    boolean Ac_on;
    boolean Home_Theatre_on;
    boolean Fan_on;
    boolean Light_on;
    int ac;
    int homeTheatre;
    int fan;
    int light;

    void message(){
        System.out.println("Overloaded");
    }
}
