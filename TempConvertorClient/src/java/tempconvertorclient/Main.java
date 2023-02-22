/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvertorclient;

/**
 *
 * @author Punnarat Rattanapawan 62050191
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        
        try {
            myThread.join();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
