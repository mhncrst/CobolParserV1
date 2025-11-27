// This is a generated file. Not intended for manual editing.
package com.github.mhncrst.cobolparserv1;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.mhncrst.cobolparserv1.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // identificationDivision dataDivision procedureDivision
  static boolean cobolFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identificationDivision(b, l + 1);
    r = r && dataDivision(b, l + 1);
    r = r && procedureDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER LEVELNUMBER IDENTIFIER dataDeclarationClause* DOT
  public static boolean dataDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDeclaration")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, LEVELNUMBER, IDENTIFIER);
    r = r && dataDeclaration_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_DECLARATION, r);
    return r;
  }

  // dataDeclarationClause*
  private static boolean dataDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dataDeclarationClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dataDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // dataTypeClause | valueClause
  public static boolean dataDeclarationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDeclarationClause")) return false;
    if (!nextTokenIs(b, "<data declaration clause>", PIC, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_DECLARATION_CLAUSE, "<data declaration clause>");
    r = dataTypeClause(b, l + 1);
    if (!r) r = valueClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER DATA DIVISION DOT workingStorageSection
  public static boolean dataDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, DATA, DIVISION, DOT);
    r = r && workingStorageSection(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // PIC picPattern
  public static boolean dataTypeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataTypeClause")) return false;
    if (!nextTokenIs(b, PIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIC);
    r = r && picPattern(b, l + 1);
    exit_section_(b, m, DATA_TYPE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER DISPLAY (IDENTIFIER | literal)+ DOT
  public static boolean display_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, DISPLAY);
    r = r && display_statement_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // (IDENTIFIER | literal)+
  private static boolean display_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_statement_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_statement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | literal
  private static boolean display_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_2_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER IDENTIFICATION DIVISION DOT programIdClause
  public static boolean identificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivision")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, IDENTIFICATION, DIVISION, DOT);
    r = r && programIdClause(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // NUMBER |STRING_LITERAL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", NUMBER, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER procedureName DOT statement*
  public static boolean paragraphDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphDeclaration")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINENUMBER);
    r = r && procedureName(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && paragraphDeclaration_3(b, l + 1);
    exit_section_(b, m, PARAGRAPH_DECLARATION, r);
    return r;
  }

  // statement*
  private static boolean paragraphDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraphDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LINENUMBER PERFORM procedureName performVaryingPhrase performUntilPhrase
  public static boolean perform_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_statement")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, PERFORM);
    r = r && procedureName(b, l + 1);
    r = r && performVaryingPhrase(b, l + 1);
    r = r && performUntilPhrase(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // UNTIL IDENTIFIER EQUALS NUMBER
  public static boolean performUntilPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performUntilPhrase")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UNTIL, IDENTIFIER, EQUALS, NUMBER);
    exit_section_(b, m, PERFORM_UNTIL_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // VARYING IDENTIFIER FROM NUMBER BY NUMBER
  public static boolean performVaryingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performVaryingPhrase")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARYING, IDENTIFIER, FROM, NUMBER, BY, NUMBER);
    exit_section_(b, m, PERFORM_VARYING_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER LPAREN NUMBER RPAREN
  public static boolean picPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picPattern")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, LPAREN, NUMBER, RPAREN);
    exit_section_(b, m, PIC_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER PROCEDURE DIVISION DOT paragraphDeclaration*
  public static boolean procedureDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivision")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, PROCEDURE, DIVISION, DOT);
    r = r && procedureDivision_4(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  // paragraphDeclaration*
  private static boolean procedureDivision_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivision_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraphDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedureDivision_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean procedureName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PROCEDURE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER PROGRAM_ID DOT IDENTIFIER DOT
  public static boolean programIdClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programIdClause")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, PROGRAM_ID, DOT, IDENTIFIER, DOT);
    exit_section_(b, m, PROGRAM_ID_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", KEY, SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, KEY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  /* ********************************************************** */
  // perform-statement | stop-statement | display-statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perform_statement(b, l + 1);
    if (!r) r = stop_statement(b, l + 1);
    if (!r) r = display_statement(b, l + 1);
    exit_section_(b, m, STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER STOP (RUN | literal) DOT
  public static boolean stop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, STOP);
    r = r && stop_statement_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  // RUN | literal
  private static boolean stop_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement_2")) return false;
    boolean r;
    r = consumeToken(b, RUN);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // VALUE literal
  public static boolean valueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueClause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, VALUE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // LINENUMBER WORKING_STORAGE SECTION DOT dataDeclaration*
  public static boolean workingStorageSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workingStorageSection")) return false;
    if (!nextTokenIs(b, LINENUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINENUMBER, WORKING_STORAGE, SECTION, DOT);
    r = r && workingStorageSection_4(b, l + 1);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

  // dataDeclaration*
  private static boolean workingStorageSection_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workingStorageSection_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dataDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workingStorageSection_4", c)) break;
    }
    return true;
  }

}
