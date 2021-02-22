package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        String infixString ="A+B-C*D";
                
        //"A/C^L*(N*M/O)^G*F";
        // expected output --> A C L ^ / N M * O / G ^ * F *
        //output --> postfix = ACL^/NM*O/G^*F*
        InfixToPostfix convertor = new InfixToPostfix();
        String postfix = convertor.infixToPostfix(infixString);
        System.out.println("postfix = " + postfix);
    }
}
