package main.java.parser;

public abstract class SQLStatement
{
abstract public void execute();
abstract public String generateQuery();
abstract public boolean validate();
}