/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author fanta
 */
public class HoraireException extends EmissionException{
    
        public HoraireException() {
    }

    /**
     * Constructs an instance of <code>AnimalException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public HoraireException(String msg) {
        super(msg);
    }
}
