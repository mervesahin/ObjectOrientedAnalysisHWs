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
public abstract class Camera {
    protected final String cameraModel;
    public Camera(String theCameraModel){
        cameraModel = theCameraModel;
    }
    public String getterCameraModel(){
        return cameraModel;
    }
}
