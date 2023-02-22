/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvertor;

import javax.ejb.Remote;

/**
 *
 * @author Punnarat Rattanapawan 62050191
 */
@Remote
public interface TempConvertorRemote {

    double fToC(double fahrenheit);
    
}
