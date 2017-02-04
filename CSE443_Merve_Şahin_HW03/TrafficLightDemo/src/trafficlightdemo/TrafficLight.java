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
public class TrafficLight {
    private AbstractTrafficLight state;
    private int outTime = 60;
    public TrafficLight(AbstractTrafficLight a){
        state = a;
    }  
    public void changeTimeOfLight(){
        state.change(this);
        state.setGreenLight(outTime);
    }
  
    
    private AbstractTrafficLight getTrafficLightState(){
        return state;
    }
    public void setTrafficLightState(AbstractTrafficLight a){
        this.state = a;
    }
    public void timeOut_X(int outTime){
        this.outTime=outTime;
    }
    public void update(boolean flag){
        if(flag==true){
            
            System.out.println("!!!!Suddenly Unexpected state occurs then!!!! ");
            System.out.println("Traffic increased");
            timeOut_X(90);
            
        }
        else{
            System.out.println("Traffic is normal ");
        }
    }
    
    
}
