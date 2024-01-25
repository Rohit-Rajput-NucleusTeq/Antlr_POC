package expression;

import java.util.ArrayList;
import java.util.List;

public class SelectStatement {
	
	private List<Model> models;
	
	public SelectStatement() {
		models = new ArrayList<>();
	}

	public void addModel(Model model) {
		models.add(model);
	}
	
	public List<Model> getModels(){
		return this.models;
	}

}
