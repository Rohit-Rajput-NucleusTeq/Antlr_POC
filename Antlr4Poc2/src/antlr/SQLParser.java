package antlr;

// Generated from SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SQLParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, WS = 2, STRING = 3, NUMBER = 4, SELECT = 5, FROM = 6, WHERE = 7, OPERATOR = 8,
			IDENTIFIER = 9;
	public static final int RULE_selectStatement = 0, RULE_columnName = 1, RULE_tableName = 2, RULE_condition = 3,
			RULE_value = 4;

	private static String[] makeRuleNames() {
		return new String[] { "selectStatement", "columnName", "tableName", "condition", "value" };
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] { null, "'*'", null, null, null, "'SELECT'", "'FROM'", "'WHERE'" };
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] { null, null, "WS", "STRING", "NUMBER", "SELECT", "FROM", "WHERE", "OPERATOR",
				"IDENTIFIER" };
	}

	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() {
		return "SQL.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() {
			return getToken(SQLParser.SELECT, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLParser.FROM, 0);
		}

		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class, 0);
		}

		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLParser.WHERE, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).enterSelectStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).exitSelectStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLVisitor)
				return ((SQLVisitor<? extends T>) visitor).visitSelectStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(10);
				match(SELECT);
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER: {
					setState(11);
					columnName();
				}
					break;
				case T__0: {
					setState(12);
					match(T__0);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15);
				match(FROM);
				setState(16);
				tableName();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(17);
						match(WHERE);
						setState(18);
						condition();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() {
			return getToken(SQLParser.IDENTIFIER, 0);
		}

		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_columnName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).enterColumnName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).exitColumnName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLVisitor)
				return ((SQLVisitor<? extends T>) visitor).visitColumnName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(21);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() {
			return getToken(SQLParser.IDENTIFIER, 0);
		}

		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).enterTableName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).exitTableName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLVisitor)
				return ((SQLVisitor<? extends T>) visitor).visitTableName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(23);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class, 0);
		}

		public TerminalNode OPERATOR() {
			return getToken(SQLParser.OPERATOR, 0);
		}

		public ValueContext value() {
			return getRuleContext(ValueContext.class, 0);
		}

		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_condition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).enterCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).exitCondition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLVisitor)
				return ((SQLVisitor<? extends T>) visitor).visitCondition(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(25);
				columnName();
				setState(26);
				match(OPERATOR);
				setState(27);
				value();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(SQLParser.STRING, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(SQLParser.NUMBER, 0);
		}

		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).enterValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLListener)
				((SQLListener) listener).exitValue(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLVisitor)
				return ((SQLVisitor<? extends T>) visitor).visitValue(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(29);
				_la = _input.LA(1);
				if (!(_la == STRING || _la == NUMBER)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\"\4\2\t\2\4\3"
			+ "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\20\n\2\3\2\3\2\3\2\3\2\5"
			+ "\2\26\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n"
			+ "\2\3\3\2\5\6\2\36\2\f\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n"
			+ "\37\3\2\2\2\f\17\7\7\2\2\r\20\5\4\3\2\16\20\7\3\2\2\17\r\3\2\2\2\17\16"
			+ "\3\2\2\2\20\21\3\2\2\2\21\22\7\b\2\2\22\25\5\6\4\2\23\24\7\t\2\2\24\26"
			+ "\5\b\5\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30\7\13\2\2\30\5"
			+ "\3\2\2\2\31\32\7\13\2\2\32\7\3\2\2\2\33\34\5\4\3\2\34\35\7\n\2\2\35\36"
			+ "\5\n\6\2\36\t\3\2\2\2\37 \t\2\2\2 \13\3\2\2\2\4\17\25";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}