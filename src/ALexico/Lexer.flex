package ALexico;
import static ALexico.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
espacio=[ ,\t ,\r]+
%{
    public String lexemas;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
( let | const | var) {lexemas=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador multiplicación */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador división */
( "/" ) {lexemas=yytext(); return Division;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parentesis_abrir;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parentesis_cerrar;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_abrir;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_cerrar;}

/* Corchete de apertura */
( "[" ) {lexemas=yytext(); return Corchete_abrir;}

/* Corchete de cierre */
( "]" ) {lexemas=yytext(); return Corchete_cerrar;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexemas = yytext(); return Op_incremento;}

/* Operadores logicos */
( "&&" | "||" | "!" ) {lexemas=yytext(); return Op_logico;}

/*Operadores Booleanos*/
(true | false) {lexemas = yytext(); return Op_booleano;}

/* For */
("for") {lexemas=yytext(); return For;}

/* If */
("if") {lexemas=yytext(); return If;}

/* Else */
("else") {lexemas=yytext(); return Else;}

/* Do */
("do") {lexemas=yytext(); return Do;}

/* While */
("while") {lexemas=yytext(); return While;}

/* Function */
("function") {lexemas=yytext(); return Function;}

/* console */
("console") {lexemas=yytext(); return Console;}

/* log */
("log") {lexemas=yytext(); return Log;}

/* Prompt */
("log") {lexemas=yytext(); return Prompt;}

/* Switch */
("switch") {lexemas=yytext(); return Switch;}

/* Case */
("case") {lexemas=yytext(); return Case;}

/* Punto */
(".") {lexemas=yytext(); return Punto;}

/* Coma */
(",") {lexemas=yytext(); return Coma;}

/* P_coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
{DD}+ | -{DD} |{DD}+.{DD}+ {lexemas=yytext(); return Numero;}


/* Error de analisis */
 . {return Error;}