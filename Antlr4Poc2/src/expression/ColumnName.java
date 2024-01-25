package expression;

public class ColumnName implements Model{

	private String columnName;
	
	public ColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return columnName;
	}
	
}
