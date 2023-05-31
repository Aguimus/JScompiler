package ALexico;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
espacio=[ ,\t, \r, \n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}


/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( let | const | var) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador multiplicación */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador división */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_abrir, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_cerrar, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_abrir, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_cerrar, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_abrir, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_cerrar, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Booleanos*/
(true | false) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* For */
("for") {return new Symbol(sym.For, yychar, yyline, yytext());}

/* If */
("if") {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Else */
("else") {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Do */
("do") {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* While */
("while") {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Function */
("function") {return new Symbol(sym.Function, yychar, yyline, yytext());}

/* console */
("console") {return new Symbol(sym.Console, yychar, yyline, yytext());}

/* log */
("log") {return new Symbol(sym.Log, yychar, yyline, yytext());}

/* Prompt */
("log") {return new Symbol(sym.Prompt, yychar, yyline, yytext());}

/* Switch */
("switch") {return new Symbol(sym.Swithc, yychar, yyline, yytext());}

/* Case */
("case") {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Punto */
(".") {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Coma */
(",") {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* P_coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
{DD}+ | -{DD} |{DD}+.{DD}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}


/* Error de analisis */
 . {return new Symbol(sym.error, yychar, yyline, yytext());}
