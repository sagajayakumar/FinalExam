/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Jaya Kumar Saga
 */
public class MultipleByZeroException extends RuntimeException {

    public MultipleByZeroException() {
    }

    public MultipleByZeroException(String message) {
        super(message);
    }

    public MultipleByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultipleByZeroException(Throwable cause) {
        super(cause);
    }

    public MultipleByZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
