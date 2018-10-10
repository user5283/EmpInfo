/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empinfo;

/**
 *
 * @author Clera
 */
public class EmpInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Employee emp1 = new Employee(-123, "Clera");
//        Employee emp2 = new Employee(45,"Chris");
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        
        emp1.setId(666);
        emp1.setName("xyz");
        System.out.println(emp1.getId());
        
       
        
//        emp1.id = 123;
//        emp1.name = "Clera";
//        
//        emp2.id = 6768;
//        emp2.name = "Chris";
        
//        System.out.println(emp1.id + ":" +emp1.name);
//        System.out.println(emp2.id + ":" +emp2.name);
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        
    }
    
}
