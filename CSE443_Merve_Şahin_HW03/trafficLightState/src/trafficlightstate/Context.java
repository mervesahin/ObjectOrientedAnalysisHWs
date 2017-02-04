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
public class Context {   
   private TrafficState state;

   public Context(){
      state = null;
   }

   public void setState(TrafficState state){
      this.state = state;		
   }

   public TrafficState getState(){
      return state;
   }  
}
