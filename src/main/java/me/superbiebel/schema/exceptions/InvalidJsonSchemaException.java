package me.superbiebel.schema.exceptions;

public class InvalidJsonSchemaException extends Exception {
    
    public InvalidJsonSchemaException() {
    }
    
    public InvalidJsonSchemaException(String message) {
        super(message);
    }
    
    public InvalidJsonSchemaException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public InvalidJsonSchemaException(Throwable cause) {
        super(cause);
    }
    
    public InvalidJsonSchemaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
