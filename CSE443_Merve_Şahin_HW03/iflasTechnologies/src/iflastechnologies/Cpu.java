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
public abstract class Cpu {
    protected final String CpuModel;
    public Cpu(String theCpuModel){
        CpuModel=theCpuModel;
    }
    public String getterCpuModel(){
        return CpuModel;
    }
    
}
