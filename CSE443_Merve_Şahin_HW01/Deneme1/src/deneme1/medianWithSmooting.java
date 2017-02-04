package deneme1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Merve Şahin
 */

import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;
import java.util.Arrays;

public class medianWithSmooting implements SmootingBehaviour {
     public void smooth(Image img){
	int total=0;	
        int average=0;
        int k=0,i=0,j=0,l=0,m=0;
        int medianValue = 0; //declare variable 
        int []medianArray = new int[25];
        
        // genisligi ogren
        int genislik = img.getXDim();

        // yuksekligi ogren
        int yukseklik = img.getYDim();
        System.err.println(genislik + " " + yukseklik);
        for(i=0;i<img.getYDim();++i){
            for(j=0; j<img.getXDim(); ++j){
                m=0;
                for(k=i;k<i+5 && k< img.getXDim();++k){
                    for(l=j; l<j+5 && l< img.getXDim() ;++l){
                        medianArray[m]= img.getXYByte(k,l);
                        ++m;         
                    } 
                }
                 Arrays.sort(medianArray);
                 
                        int middle = medianArray.length/2;
                        if (medianArray.length%2 == 1) 
                            medianValue = medianArray[middle];
                        else
                           medianValue = (medianArray[middle-1] + medianArray[middle]) / 2;
                if(i+2<img.getYDim() && j+2<img.getXDim()){
                    img.setXYByte(i+2, j+2, medianValue);
                }
                
            }     
        }
    }
}
