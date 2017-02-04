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
public abstract class AbstractTrafficLight {
    private int redLightTime = 60;
    private int greenLightTime = 15;
    private int yellowLightTime = 3; 
    
    public abstract void change(TrafficLight t);
    
    public int getRedTimeValue(){
        return redLightTime;
    }
    public int getYellowTimeValue(){
        return yellowLightTime;
    }
    
    public int getGreenTimeValue(){
        return greenLightTime;
    }
    
    public void setGreenLight(int newGreenLightTime){
        greenLightTime=newGreenLightTime;
    }
}
