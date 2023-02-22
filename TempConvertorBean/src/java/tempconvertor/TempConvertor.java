/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvertor;

import javax.ejb.Stateless;

/**
 *
 * @author Punnarat Rattanapawan 62050191
 */
@Stateless
public class TempConvertor implements TempConvertorRemote {

    @Override
    public double fToC(double fahrenheit) {
        return (5 / 9) * (fahrenheit - 32);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
