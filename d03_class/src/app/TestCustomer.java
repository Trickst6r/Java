/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class TestCustomer {

 
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.accept();
        c1.display();
        
        Customer c2 = new Customer();
        c2.display();
        
        Customer c3 = new Customer("C03", "Ricardo", "Ricardo@gmail.com", 2000, false);
        c3.display();
    }
    
}
