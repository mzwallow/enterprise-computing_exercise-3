/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvertorclient;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import tempconvertor.TempConvertorRemote;

/**
 *
 * @author Punnarat Rattanapawan 62050191
 */
public class MyThread extends Thread {

    TempConvertorRemote remote = lookupTempConvertorRemote();

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.println(fahrenheit + " fahrenheit = " + remote.fToC(fahrenheit) + " celsius");
    }

    private TempConvertorRemote lookupTempConvertorRemote() {
        try {
            Context c = new InitialContext();
            return (TempConvertorRemote) c.lookup("java:comp/env/TempConvertor");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
