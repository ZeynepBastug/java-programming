package day61_exceptions_collections;

public class BreakTimeExceptions extends RuntimeException {

    public BreakTimeExceptions() {

    }

    public BreakTimeExceptions(String message) {

        super(message); // call to parent class constructor
    }
}
