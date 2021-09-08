package day61_exceptions_collections;

import java.util.ArrayList;
import java.util.List;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }

}
