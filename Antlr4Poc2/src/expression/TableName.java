package expression;

public class TableName implements Model{

	private String tableName;
	
	public TableName(String tableName) {
		this.tableName = tableName;
	}
	
	@Override
	public String toString() {
		return tableName;
	}
}
