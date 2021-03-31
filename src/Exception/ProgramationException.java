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
public class ProgramationException extends Exception {

    /**
     * Creates a new instance of <code>ProgramationException</code> without
     * detail message.
     */
    public ProgramationException() {
    }

    /**
     * Constructs an instance of <code>ProgramationException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ProgramationException(String msg) {
        super(msg);
    }
}
