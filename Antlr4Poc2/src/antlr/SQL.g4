grammar SQL;
// Lexer rules
WS : [ \t\r\n]+ -> skip;
STRING : '\'' ( ~'\'' | ' ' | '\t' | '\r' | '\n' )* '\'';
NUMBER : [0-9]+;
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
OPERATOR : '=' | '<' | '>';
// Recognize IDENTIFIER as a single token
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]*;
// Parser rules
selectStatement : SELECT (columnName | '*') FROM tableName (WHERE condition)?;
columnName : IDENTIFIER;
tableName : IDENTIFIER;
condition : columnName OPERATOR value;
value : STRING | NUMBER;







