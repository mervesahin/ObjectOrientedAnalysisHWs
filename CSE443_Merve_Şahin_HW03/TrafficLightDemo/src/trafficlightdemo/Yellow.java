/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlightdemo;

/**
 *
 * @author Merve Şahin
 */
public class Yellow extends AbstractTrafficLight{
    public  void change(TrafficLight t){
        Red r = new Red();
        t.setTrafficLightState(r); 
        System.out.println("The cars are preparing for "+getYellowTimeValue()+" seconds in yellow light. Then the green light will come on");  
       
    }
}
