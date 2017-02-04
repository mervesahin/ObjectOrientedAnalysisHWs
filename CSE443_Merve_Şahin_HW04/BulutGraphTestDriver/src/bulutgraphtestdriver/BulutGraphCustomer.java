/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulutgraphtestdriver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Merve Şahin
 */
public class BulutGraphCustomer implements Serializable{

    private List<Graph<Object>> graphs = new ArrayList<Graph<Object>>(); 
    private String customerName;
    private String customerId;
    private int creditCount ;
    
    public BulutGraphCustomer(String customerName,String customerId,Graph graph,int creditCount){
        this.customerName = customerName;
        this.customerId = customerId;      
        graphs.add(graph); //Müşteri graphını graph listesine ekledi
        this.creditCount=creditCount;
    }
    public String getCustomerId(){
        return  customerId;
    }
    public int getCreditCount(){
        return creditCount;
    }
    public void setCreditCount(int newCount){
        this.creditCount = newCount;
    }
    public String getName() {
        return customerName;
    }
    
  
}