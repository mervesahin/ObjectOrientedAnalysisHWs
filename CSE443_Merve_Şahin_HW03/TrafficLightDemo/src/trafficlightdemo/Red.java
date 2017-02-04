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
public class Red extends AbstractTrafficLight{
    
    public  void change(TrafficLight t){
       Green g = new Green();
       t.setTrafficLightState(g);
       System.out.println("The cars are waiting in the red light for "+getRedTimeValue()+" seconds Then the green light will come on ");
    }   
}
