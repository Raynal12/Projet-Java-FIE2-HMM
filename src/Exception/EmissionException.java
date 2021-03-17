/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author mattonhugo
 */
public class EmissionException extends Exception {

    /**
     * Creates a new instance of <code>EmissionException</code> without detail
     * message.
     */
    public EmissionException() {
    }

    /**
     * Constructs an instance of <code>EmissionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmissionException(String msg) {
        super(msg);
    }
}
