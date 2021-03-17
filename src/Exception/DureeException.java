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
public class DureeException extends EmissionException {

    /**
     * Creates a new instance of <code>DureeException</code> without detail
     * message.
     */
    public DureeException() {
    }

    /**
     * Constructs an instance of <code>DureeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DureeException(String msg) {
        super(msg);
    }
}
