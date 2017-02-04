/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulutgraphtestdriver;
import java.rmi.*;
import java.util.List;
/**
 *
 * @author Merve Şahin
 */
public interface GraphOperation extends Remote{
    public <T> List<Vertex<T>> hamiltonCycleOperation(BulutGraphCustomer customer, Graph<T> graph,T source)
                                                                      throws RemoteException;
    
    public <T> List<Vertex<T>> shortestPathOperation(BulutGraphCustomer customer, Graph<T> graph,T source,T destination)
                                                                      throws RemoteException;
    
     public String sayHello(BulutGraphCustomer customer) throws RemoteException;
    //Yukaridaki iki metod implement edilmesede server client haberleşmesi saglanmaktadir
    // ve client bu sayHello metodunu çağırabilmektedir.
     
     public int decreaseMine(BulutGraphCustomer customer)throws RemoteException;
     
}




