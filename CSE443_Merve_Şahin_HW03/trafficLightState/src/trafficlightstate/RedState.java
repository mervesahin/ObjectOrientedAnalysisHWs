/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlightstate;

/**
 *
 * @author Merve Şahin
 */
public class RedState implements TrafficState {
    public void doAction(Context context) {
      System.out.print("Cars in red traffic light,");
      context.setState(this);	
   }
   
   public String toString(){
      return "Waiting 15 seconds.";
   }
    
}
