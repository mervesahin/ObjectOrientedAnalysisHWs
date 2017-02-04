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
public class YellowState implements TrafficState{
    public void doAction(Context context) {
      System.out.print("Cars in yellow traffic light,");
      context.setState(this);	
    }

    public String toString(){
      return "Cars are preparing for traffic and waiting 3 seconds.";
    }
}
