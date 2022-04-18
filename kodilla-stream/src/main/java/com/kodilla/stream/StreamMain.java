package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {

       PoemDecorator poemDecorator = (p) -> "ABC" + p;
       System.out.println(poemDecorator.decorate("name"));


    }
}
