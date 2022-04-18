package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String poem;

    public PoemBeautifier(String poem) {
        this.poem = poem;
    }

    public String beautify(String poem,PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(poem);
        System.out.println("result equals" + result);
        return result;
    }
}
