package main.java.parser;

public class Tokenizer
{
private String tokens[];
private int currentPosition;

public Tokenizer(String query)
{
this.currentPosition=0;
this.tokens=query.split(" ");
}

public String getNext()
{
if(this.currentPosition<tokens.length)
{
String newToken=tokens[this.currentPosition];
this.currentPosition++;
return newToken;
}else
{
return null;
}
}

}