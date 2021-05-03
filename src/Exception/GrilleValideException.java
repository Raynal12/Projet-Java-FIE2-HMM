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
public class GrilleValideException extends Exception {

    /**
     * Creates a new instance of <code>VerificationException</code> without
     * detail message.
     */
    public GrilleValideException() {
    }

    /**
     * Constructs an instance of <code>VerificationException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GrilleValideException(String msg) {
        super(msg);
    }
}
