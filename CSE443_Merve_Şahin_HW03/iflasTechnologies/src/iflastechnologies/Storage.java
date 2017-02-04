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
public abstract class Storage {
    protected final String storageModel;
    public Storage (String thestorageModel){
        storageModel=thestorageModel;      
    }
    public String getterStorageModel(){
        return storageModel;
    }
}
