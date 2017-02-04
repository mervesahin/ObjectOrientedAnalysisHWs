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
public abstract class PhoneCase {
    protected final String phoneCaseModel;
    public PhoneCase(String thePhoneCaseModel ){
        phoneCaseModel = thePhoneCaseModel;
    
    }
    public String getterPhoneCaseModel(){
        return phoneCaseModel;
    }
}
