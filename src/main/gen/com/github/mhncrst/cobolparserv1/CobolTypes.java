// This is a generated file. Not intended for manual editing.
package com.github.mhncrst.cobolparserv1;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.mhncrst.cobolparserv1.psi.impl.*;

public interface CobolTypes {

  IElementType DATA_DECLARATION = new CobolElementType("DATA_DECLARATION");
  IElementType DATA_DECLARATION_CLAUSE = new CobolElementType("DATA_DECLARATION_CLAUSE");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_TYPE_CLAUSE = new CobolElementType("DATA_TYPE_CLAUSE");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARAGRAPH_DECLARATION = new CobolElementType("PARAGRAPH_DECLARATION");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PERFORM_UNTIL_PHRASE = new CobolElementType("PERFORM_UNTIL_PHRASE");
  IElementType PERFORM_VARYING_PHRASE = new CobolElementType("PERFORM_VARYING_PHRASE");
  IElementType PIC_PATTERN = new CobolElementType("PIC_PATTERN");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROCEDURE_NAME = new CobolElementType("PROCEDURE_NAME");
  IElementType PROGRAM_ID_CLAUSE = new CobolElementType("PROGRAM_ID_CLAUSE");
  IElementType PROPERTY = new CobolElementType("PROPERTY");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType COMMENT = new CobolTokenType("COMMENT");
  IElementType CRLF = new CobolTokenType("CRLF");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQUALS = new CobolTokenType("EQUALS");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType KEY = new CobolTokenType("KEY");
  IElementType LEVELNUMBER = new CobolTokenType("LEVELNUMBER");
  IElementType LINENUMBER = new CobolTokenType("LINENUMBER");
  IElementType LPAREN = new CobolTokenType("LPAREN");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM_ID");
  IElementType RPAREN = new CobolTokenType("RPAREN");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType SEPARATOR = new CobolTokenType("SEPARATOR");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING_LITERAL = new CobolTokenType("STRING_LITERAL");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DATA_DECLARATION) {
        return new CobolDataDeclarationImpl(node);
      }
      else if (type == DATA_DECLARATION_CLAUSE) {
        return new CobolDataDeclarationClauseImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_TYPE_CLAUSE) {
        return new CobolDataTypeClauseImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH_DECLARATION) {
        return new CobolParagraphDeclarationImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PERFORM_UNTIL_PHRASE) {
        return new CobolPerformUntilPhraseImpl(node);
      }
      else if (type == PERFORM_VARYING_PHRASE) {
        return new CobolPerformVaryingPhraseImpl(node);
      }
      else if (type == PIC_PATTERN) {
        return new CobolPicPatternImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROCEDURE_NAME) {
        return new CobolProcedureNameImpl(node);
      }
      else if (type == PROGRAM_ID_CLAUSE) {
        return new CobolProgramIdClauseImpl(node);
      }
      else if (type == PROPERTY) {
        return new CobolPropertyImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolValueClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
