package main.java.parser;

public class SQLKidParser
{
public static SQLStatement parse(String query)
{
Tokenizer tokenizer=new Tokenizer(query);
Parser parser=new Parser(tokenizer);
return parser.parseStatement();
}
}