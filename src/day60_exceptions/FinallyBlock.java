package day60_exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println("You enter: " + num);
        } catch (InputMismatchException e){
            System.out.println("You entered Invalid value!");
        } finally {
            scan.close(); // close and clean up the scanner
            System.out.println("Finally block - runs always");
        }

    }

}
