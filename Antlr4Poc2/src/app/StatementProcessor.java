package app;

import java.util.List;

import antlr.value.Value;
import expression.ColumnName;
import expression.Condition;
import expression.Model;
import expression.SelectStatement;
import expression.TableName;

public class StatementProcessor {

	private ColumnName columnName;
	private TableName tableName;
	private Condition condition;
	private Value value;
	
	public ColumnName getColumnName() {
		return columnName;
	}

	public TableName getTableName() {
		return tableName;
	}

	public Condition getCondition() {
		return condition;
	}

	public Value getValue() {
		return value;
	}

	public StatementProcessor parseStatement(SelectStatement selectStatement) {
		List<Model> models = selectStatement.getModels();
		for(Model model : models) {
			if(model instanceof ColumnName) {
				columnName = (ColumnName) model;
			}
			else if(model instanceof TableName){
				tableName = (TableName) model;
			}
			else if(model instanceof Value) {
				value = (Value) model;
			}
			else {
				condition = (Condition) model;
			}
		}
		
		return this;
		
	}
	
}
