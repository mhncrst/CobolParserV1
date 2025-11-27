// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.mhncrst.cobolparserv1;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.mhncrst.cobolparserv1.CobolTypes;
import com.intellij.psi.TokenType;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}


%%

//keywords
"IDENTIFICATION"       { return CobolTypes.IDENTIFICATION; }
"DIVISION"             { return CobolTypes.DIVISION; }
"PROGRAM-ID"           { return CobolTypes.PROGRAM_ID; }
"DATA"                 { return CobolTypes.DATA; }
"WORKING-STORAGE"      { return CobolTypes.WORKING_STORAGE; }
"SECTION"              { return CobolTypes.SECTION; }
"PROCEDURE"            { return CobolTypes.PROCEDURE; }
"PIC"                  { return CobolTypes.PIC; }
"VALUE"                { return CobolTypes.VALUE; }
"PERFORM"              { return CobolTypes.PERFORM; }
"STOP"                 { return CobolTypes.STOP; }
"RUN"                  { return CobolTypes.RUN; }
"DISPLAY"              { return CobolTypes.DISPLAY; }
"VARYING"              { return CobolTypes.VARYING; }
"FROM"                 { return CobolTypes.FROM; }
"BY"                 { return CobolTypes.BY; }
"UNTIL"                 { return CobolTypes.UNTIL; }


//symbols
"."                    { return CobolTypes.DOT; }
"("                    { return CobolTypes.LPAREN; }
")"                    { return CobolTypes.RPAREN; }
"="                    { return CobolTypes.EQUALS; }

//literals
"'"[^']*"'"            { return CobolTypes.STRING_LITERAL; }
^[0-9]{2}              { return CobolTypes.LINENUMBER; }
[ \t]+[0-9]{2}         { return CobolTypes.LEVELNUMBER; }
[0-9]+                 { return CobolTypes.NUMBER; }






//identifiers (variable names, paragraph names)
[A-Z][A-Z0-9-]*        { return CobolTypes.IDENTIFIER; }

//whitespace and comments
[ \t\r\n\f]+           { return TokenType.WHITE_SPACE; }
"*"[^\\r\\n]*          { return CobolTypes.COMMENT; }

//fallback
[^]                    { return TokenType.BAD_CHARACTER; }