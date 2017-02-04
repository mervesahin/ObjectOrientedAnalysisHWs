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
public class GreenState implements TrafficState{
    public void doAction(Context context) {
      System.out.print("Cars in green traffic light,");
      context.setState(this);	
    }

    public String toString(){
      return "Cars continue to traffic 60 seconds";
    } 
}
