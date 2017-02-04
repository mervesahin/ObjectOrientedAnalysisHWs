/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iflastechnologies;

/**
 *
 * @author Merve Şahin
 */
public abstract class Display {
    protected final String displayModel;
    public Display(String theDisplayModel){
        displayModel =theDisplayModel;
    }
    public String getterDisplayModel(){
        return displayModel;
    }
      
}
