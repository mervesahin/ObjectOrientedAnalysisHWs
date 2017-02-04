/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailaddressbook;

/**
 *
 * @author Merve Şahin
 */
import java.util.ArrayList;
import java.util.List;
public class EmailAddressBook {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    private String mailAddress;
    private List<EmailAddressBook> subTree;
    
    //constructor
    public EmailAddressBook(String name,String mailAddress){
        this.name = name;
        this.mailAddress = mailAddress;
        subTree = new ArrayList<EmailAddressBook>();
    }
    public void add(EmailAddressBook e) {
      subTree.add(e);
    }

    public void remove(EmailAddressBook e) {
      subTree.remove(e);
    }

    public List<EmailAddressBook> getSubTree(){
     return subTree;
    }
    
    public String toString(){
      return ("EmailAddressBook :[ Name : " + name  + ", MailAdress :" + mailAddress+" ]");
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
      EmailAddressBook mailadreess= new EmailAddressBook("GTUEngineerGroup","gtuengineer@gtu.edu.tr");

      EmailAddressBook teachersMailAddress = new EmailAddressBook("teachersgroup","teachersgroup@gtu.edu.tr");
      EmailAddressBook studentsMailAddress = new EmailAddressBook("studentsgroup", "studentsgroup@gtu.edu.tr");

      EmailAddressBook s1 = new EmailAddressBook("Merve","mervesahin@gtu.edu.tr");
      EmailAddressBook s2 = new EmailAddressBook("Begum","beg@gtu.edu.tr");
      EmailAddressBook s3 = new EmailAddressBook("Busra","busrademirkol@gtu.edu.tr");

      EmailAddressBook t1 = new EmailAddressBook("Yusuf","yusuf@gtu.edu.tr");
      EmailAddressBook t2 = new EmailAddressBook("Erchan","erchan@gtu.edu.tr");

      mailadreess.add(teachersMailAddress);
      mailadreess.add(studentsMailAddress);

      teachersMailAddress.add(t1);
      teachersMailAddress.add(t2);

      studentsMailAddress.add(s1);
      studentsMailAddress.add(s2);
      studentsMailAddress.add(s3);
      
      //print all emails of the groups
      System.out.println(mailadreess); 
      
      for (EmailAddressBook headEmployee : mailadreess.getSubTree()) {
         System.out.println(headEmployee);
         
         for (EmailAddressBook employee : headEmployee.getSubTree()) {
            System.out.println(employee);
         }
      }		
   }
        
}
    
  
