/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulutgraphtestdriver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Merve Şahin
 */
public class GraphOperationImpl implements GraphOperation{
    private List<BulutGraphCustomer> customers;
    
    public GraphOperationImpl()throws RemoteException{
        super();
        customers = new ArrayList<>();
    }
    public <T> List<Vertex<T>> hamiltonCycleOperation(BulutGraphCustomer customer, Graph<T> graph,T source)                                                             
    {
        ///implement edilecek stub now
        List<Vertex<T>> a = new ArrayList<Vertex<T>>();
        decreaseMine(customer);
        return a ;
    }
    public <T> List<Vertex<T>> shortestPathOperation(BulutGraphCustomer customer, Graph<T> graph,T source,T destination)
    {
        //implement edilecek stub now
       
        List<Vertex<T>> a = new ArrayList<Vertex<T>>();
        
        decreaseMine(customer);      
        return a ;
    }                                                              

    public String sayHello(BulutGraphCustomer customer){
        
        String result ="";
        int newCreditCount=0;
        //result = "\n--------------------------\n";
        result = "\nCustomer name :"+ customer.getName();
        result += "\nCustomer id : " + customer.getCustomerId();
        //decreaseMine(customer);
        //customer.setCreditCount(customer.getCreditCount()-1);
        //result += ", Customer credit count : " + customer.getCreditCount();
        result += "\n--------------------------\n";
        return result;
          
    }
    public int decreaseMine(BulutGraphCustomer customer) {
        int newCreditCount=0;
        int i=0;
        
        if(customer.getCreditCount()!=0) {
            i=customer.getCreditCount()-1;
        }
        return i;
    }
    public boolean ControlCreditByServer(int id){
        int count =customers.get(id).getCreditCount();
        if(count != 0)
            return true;
        else
            return false;
    }
    public int decreaseCreditServer(int id){
        
       int count = customers.get(id).getCreditCount();
       return count-1;
    }
   
    public void connectServer()throws RemoteException{
        String hostName = "BulutGraph - GraphOperation";
        System.setProperty("java.rmi.server.hostname", "10.40.146.205");
        GraphOperation operation = new GraphOperationImpl();
        GraphOperation stub =((GraphOperation)UnicastRemoteObject.exportObject(operation, 8080));
        Registry registry = LocateRegistry.createRegistry(8080);
        registry.rebind(hostName, stub);
    
    }
    public static void main(String args[]){
        try{
            GraphOperationImpl graphOperationImpl = new GraphOperationImpl();
            graphOperationImpl.connectServer();
            System.out.println("Server started at: " + LocalTime.now() );
            System.out.println("Server Port:"+"8080");
            System.out.println("Server IP:"+ "10.40.146.205");
        }catch(RemoteException e){
            e.printStackTrace();
            System.exit(1);
        }
    
    } 
}
