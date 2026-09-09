public class WordGuessingMain{
    public static void main(String[] args){
        WordGuessing w = new WordGuessing("witch");
        w.update("c");
        System.out.println(w.getUserString);
    }
}