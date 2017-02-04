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
public class TrafficLightState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
      Context context = new Context();

      RedState startState = new RedState();
      startState.doAction(context);
      System.out.println(context.getState().toString());

      YellowState preaperingState = new YellowState();
      preaperingState.doAction(context);
      System.out.println(context.getState().toString());
      
      GreenState runState = new GreenState();
      runState.doAction(context);
      System.out.println(context.getState().toString());
      
    }
    
}
