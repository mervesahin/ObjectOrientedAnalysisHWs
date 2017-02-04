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
public class Green extends AbstractTrafficLight{
    public  void change(TrafficLight t){
        
        Yellow y = new Yellow();
        t.setTrafficLightState(y);
        System.out.println("The cars are gone for "+getGreenTimeValue()+" seconds in green light Then the red light");  
    }
}
