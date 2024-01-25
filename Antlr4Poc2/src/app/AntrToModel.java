package app;

import java.util.HashMap;

import antlr.SQLBaseVisitor;
import antlr.SQLParser;
import antlr.value.NumberValue;
import antlr.value.StringValue;
import antlr.value.Value;
import expression.ColumnName;
import expression.Condition;
import expression.Model;
import expression.TableName;

public class AntrToModel extends SQLBaseVisitor<Model>{
	
    @Override
    public Model visitColumnName(SQLParser.ColumnNameContext ctx) {
        String columeName = ctx.getChild(0).getText();
        return new ColumnName(columeName);
    }

    @Override
    public Model visitTableName(SQLParser.TableNameContext ctx) {
    	String tableName = ctx.getChild(0).getText();
    	return new TableName(tableName);
    }

    @Override
    public Model visitCondition(SQLParser.ConditionContext ctx) {
    	HashMap<ColumnName, Value> condition = new HashMap<>();
    	String columnName = ctx.getChild(0).getText();
    	String value = ctx.getChild(2).getText();
    	condition.put(new ColumnName(columnName), new StringValue(value));
        return new Condition(condition);
    }

    @Override
    public Model visitValue(SQLParser.ValueContext ctx) {
    	String ctxValue = ctx.getChild(0).getText();
    	try {
    		int numberValue = Integer.parseInt(ctxValue);
    		return new NumberValue(numberValue);
    	}catch (NumberFormatException e) {
			return new StringValue(ctxValue);
		}
    }

}
