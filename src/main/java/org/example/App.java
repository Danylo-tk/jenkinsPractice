package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Counter counter = new Counter();
        String testString = "Hello, World!!!";
        System.out.println("Length of a string is: " + counter.count((testString)));
    }
}
