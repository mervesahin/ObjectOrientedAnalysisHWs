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
public class TrafficLightDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HiTech hiTech = new HiTech();
        Red r = new Red(); //initially red   
        TrafficLight t =new TrafficLight(r);
        hiTech.addObserver(t);
        t.changeTimeOfLight();
        t.changeTimeOfLight();
        t.changeTimeOfLight();
        
        
        hiTech.setterFlag(true);
        t.changeTimeOfLight();
        t.changeTimeOfLight();
        t.changeTimeOfLight();
        
        
        
     /*   System.out.println();
        System.out.print("Suddenly Unexpected event occurs and");
       
        System.out.println("Now Cars are waiting "+r.getRedTimeValue()+" seconds");
        System.out.println("and then car is preapering "+y.getYellowTimeValue()+" seconds");
        System.out.println("and then car is continuig to traffic "+g.getGreenTimeValue()+" seconds");*/
         
      /*  hiTech.setterFlag(false);*/
             
        
    
    }
    
}
