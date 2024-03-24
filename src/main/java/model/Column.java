package model;

public class Column
{
private String columnName;
private String type;
private boolean isNullable;

public Column(String columnName,String type,boolean isNullable)
{
this.columnName=columnName;
this.type=type;
this.isNullable=isNullable;
}

public void setColumnName(String columnName)
{
this.columnName=columnName;
}

public String getColumnName()
{
return this.columnName;
}

public void setType(String type)
{
this.type=type;
}

public String getType()
{
return this.type;
}

public void setIsNullable(boolean isNullable)
{
this.isNullable=isNullable;
}

public boolean getIsNullable()
{
return this.isNullable;
}

}