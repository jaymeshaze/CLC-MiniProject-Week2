/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author xxx
 */
@Local
public interface MathBeanLocal {

    Integer addition(int a, int b);
    
}
