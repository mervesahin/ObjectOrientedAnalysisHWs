/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;
/**
 *
 * @author Merve Şahin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.*;

public abstract class Clustering {
    private List<clusteringVector> vList = new ArrayList<clusteringVector>();

    public void loadDataFromFile()throws Exception{  /*kumelemede ortak olan islem implemen edilir*/
       
      BufferedReader br = new BufferedReader(new FileReader("data"));
      String line = null;
      
      while ((line = br.readLine()) != null) {
     
        String lines[] = line.split(", ");
        
        clusteringVector c = new clusteringVector();    
        c.setX(Integer.parseInt(lines[0]));
        c.setY(Integer.parseInt(lines[1]));
        c.setZ(Integer.parseInt(lines[2]));
        
        vList.add(c);
        
      }
      br.close();
     

    }
    public clusteringVector getter(int i){
       return vList.get(i); 
    }
    public int getSize(){
        return vList.size();
    }
            
    
    public void print(){
        Iterator itr = vList.iterator();
      
        while(itr.hasNext()) {
           Object element = itr.next();
          /* System.out.print(element + " ");
           System.out.println();*/
        }
       
    
    }
    public abstract void initializeClusteringParameters();
        
    
    
    public abstract void Clustering();  /*kumeleme algoritmaları farklı bunları kendileri implement etsinler*/
    
   
    public abstract void printClusteringOutput();
    //ortak olabilitesi var
    
    public static void main(String[] args) {
        // TODO code application logic here
         Clustering [] rArray ; //abstract classın objesi yapilamaz referansı ypılabilir.
        
         rArray = new Clustering[2];
         Kmeans obje1 = new Kmeans();
         rArray[0] = obje1;
         
     
        try{
            obje1.loadDataFromFile();
        }
        
        catch(Exception e){
            System.out.println("DataFromFile exception !!!!!");
            
        }
        
        obje1.print();
        
        obje1.initializeClusteringParameters();
    
        
        obje1.Clustering();
       
    }
}
