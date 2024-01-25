package app;

import antlr.SQLBaseVisitor;
import antlr.SQLParser.SelectStatementContext;
import expression.SelectStatement;

public class AntlrToStatement extends SQLBaseVisitor<SelectStatement> {

	@Override
	public SelectStatement visitSelectStatement(SelectStatementContext ctx) {
		SelectStatement selectStatement = new SelectStatement();
		AntrToModel antrToModel = new AntrToModel();
		for(int i = 0; i<ctx.getChildCount(); i++) {
			if(i == ctx.getChildCount()-1) {
				
			}else {
				selectStatement.addModel(antrToModel.visit(ctx.getChild(i)));
			}
		}
		return selectStatement;
	}

}
