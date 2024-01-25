package expression;

import java.util.HashMap;

import antlr.value.Value;

public class Condition implements Model{
	
	private HashMap<ColumnName, Value> hashMap;

	public Condition(HashMap<ColumnName, Value> hashMap) {
		this.hashMap = hashMap;
	}

	@Override
	public String toString() {
		return hashMap.entrySet().toString();
	}
	
	
}
