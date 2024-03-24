package main.java.parser;
import java.util.*;
import main.java.model.Column;

public class CreateTableStatement
{
String tableName;
private List<Column> columns;

public CreateTableStatement(String tableName, List<Column> columns)
{
this.tableName=tableName;
this.columns=columns;
}

public String getTableName()
{
return tableName;
}

public void setTableName(String tableName)
{
this.tableName=tableName;
}

public List<Column> getColumns()
{
return this.columns;
}

public void setColumns(List<Column> columns)
{
this.columns=columns;
}

public void execute()
{
}

public String generateQuery()
{
StringBuilder queryBuilder=new StringBuilder("CREATE TABLE");
queryBuilder.append(tableName).append(" (");
for(int i=0;i<columns.size();i++)
{
if(i>0)
{
queryBuilder.append(", ");
}
Column column=columns.get(i);
queryBuilder.append(column.getColumnName());
queryBuilder.append(" ");
queryBuilder.append(column.getType());
if(!column.getIsNullable())
{
queryBuilder.append(" NOT NULL");
}
}
queryBuilder.append(")");
return queryBuilder.toString();
}

public boolean validate()
{
return true;
}

}