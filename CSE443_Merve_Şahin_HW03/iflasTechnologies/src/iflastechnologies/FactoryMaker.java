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
public class FactoryMaker {
    
	public static Factory getFactory(String factoryName)
	{
		if(factoryName.equals("TurkeyMarket"))
                    return new TurkeyMarket();
                else if(factoryName.equals("GlobalMarket"))
                    return new GlobalMarket();
		else if(factoryName.equals("EuMarket"))
                    return new EuMarket();
		else
                    return null;
	}
    
}
