package main.java.parser;
import java.util.*;

public class SelectStatement extends SQLStatement
{
private List<String> selectList;
private List<String> tableNames;
private List<String> joinClauses;

public SelectStatement()
{
this.selectList=new ArrayList<>();
this.tableNames=new ArrayList<>();
this.joinClauses=new ArrayList<>();
}

public void setSelectList(List<String> selectList)
{
this.selectList=selectList;
}

public List<String> getSelectList()
{
return this.selectList;
}

public void setTableNames(List<String> tableNames)
{
this.tableNames=tableNames;
}

public List<String> getTableNames()
{
return this.tableNames;
}

public List<String> getJoinClauses()
{
return this.joinClauses;
}

public void setJoinCaluses(List<String> joinClauses)
{
this.joinClauses=joinClauses;
}

public void execute()
{
//todo
}

public String generateQuery()
{
StringBuilder queryBuilder=new StringBuilder("SELECT ");
queryBuilder.append(String.join(", ",selectList));
queryBuilder.append(" FROM ");
queryBuilder.append(String.join(", ",tableNames));
if(joinClauses!=null && !joinClauses.isEmpty())
{
queryBuilder.append(" ");
queryBuilder.append(String.join(" ",joinClauses));
}
return queryBuilder.toString();
}

public boolean validate()
{
return true;
}

}