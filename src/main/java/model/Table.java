package model;
import java.util.*;

public class Table
{
private String tableName;
private List<String> primaryKeys;
private List<Column> columns;

public Table()
{
this.tableName="";
this.primaryKeys=new ArrayList<>();
this.columns=new ArrayList<>();
}

public void setTableName(String tableName)
{
this.tableName=tableName;
}

public String getTableName()
{
return this.tableName;
}

public void setPrimaryKeys(List<String> primaryKeys)
{
this.primaryKeys=primaryKeys;
}

public List<String> getPrimaryKeys()
{
return this.primaryKeys;
}

public void setColumns(List<Column> columns)
{
this.columns=columns;
}

public List<Column> getColumns()
{
return this.columns;
}

public void addPrimaryKey(String columnName)
{
this.primaryKeys.add(columnName);
}

public void addColumn(Column column)
{
this.columns.add(column);
}

}