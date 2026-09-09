public class WordGuessing {
    private String wordToBeGuessed;
    private String userString = "_____";// 5 underscores
  
    //we will say that secret must be five characters
    public WordGuessing(String secret) {
      wordToBeGuessed = secret;
    }
  
    public void update(String letter) {
      int letPosition = wordToBeGuessed.indexOf(letter);
      userString = userString.substring(0,letPosition) + letter + userString.substring(letPosition+1);
    }
  
    public String getUserString(){
      return userString;
    }
  }
  