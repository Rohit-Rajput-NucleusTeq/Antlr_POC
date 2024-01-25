package app;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.SQLLexer;
import antlr.SQLParser;
import antlr.value.Value;
import expression.ColumnName;
import expression.Condition;
import expression.Model;
import expression.SelectStatement;
import expression.TableName;

public class TestSQLVisitor {
	
	public static void main(String[] args) {
		
		String sqlExpression = "SELECT column2 FROM table1 WHERE column2 = 'value'";
		
//		if(args.length != 1) {
//			System.err.print("Usage : file Name");
//		}
//		else {
//			String fileName = args[0];
			SQLParser parser = getParser(sqlExpression);
			ParseTree antlrAST =  parser.selectStatement();
			
			AntlrToStatement programVisitor = new AntlrToStatement();
			SelectStatement statement = programVisitor.visit(antlrAST);
			
			StatementProcessor statementProcessor = new StatementProcessor().parseStatement(statement);
			
			String sql = "SELECT ";
			
			ColumnName columnName = statementProcessor.getColumnName();
			
			sql = sql + columnName ;
			
			TableName tableName = statementProcessor.getTableName();
			
			sql = sql + " FORM " + tableName ;
			
			Condition condition = statementProcessor.getCondition();
			
			sql = sql + " WHERE " + condition;
			
			System.out.println(sql);
				
	}
	
	public static SQLParser getParser(String input) {
		SQLParser parser = null;
		
//		try {
//			CharStream input = CharStreams.fromFileName(fileName);
		    SQLLexer lexer = new SQLLexer(CharStreams.fromString(input));
		    CommonTokenStream tokens = new CommonTokenStream(lexer);
		    parser = new SQLParser(tokens);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		return parser;
	}
}

