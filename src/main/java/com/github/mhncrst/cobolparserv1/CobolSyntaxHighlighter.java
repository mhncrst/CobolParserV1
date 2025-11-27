package com.github.mhncrst.cobolparserv1;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class CobolSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD =
        TextAttributesKey.createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
        TextAttributesKey.createTextAttributesKey("COBOL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
        TextAttributesKey.createTextAttributesKey("COBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_NUMBER =
        TextAttributesKey.createTextAttributesKey("COBOL_LINE_NUMBER", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey LEVEL_NUMBER =
        TextAttributesKey.createTextAttributesKey("COBOL_LEVEL_NUMBER", DefaultLanguageHighlighterColors.CONSTANT);

    public static final TextAttributesKey COMMENT =
        TextAttributesKey.createTextAttributesKey("COBOL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
        TextAttributesKey.createTextAttributesKey("COBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] LINE_NUMBER_KEYS = new TextAttributesKey[]{LINE_NUMBER};
    private static final TextAttributesKey[] LEVEL_NUMBER_KEYS = new TextAttributesKey[]{LEVEL_NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CobolLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        // Keywords
        if (tokenType == CobolTypes.IDENTIFICATION ||
            tokenType == CobolTypes.DIVISION ||
            tokenType == CobolTypes.PROGRAM_ID ||
            tokenType == CobolTypes.DATA ||
            tokenType == CobolTypes.WORKING_STORAGE ||
            tokenType == CobolTypes.SECTION ||
            tokenType == CobolTypes.PROCEDURE ||
            tokenType == CobolTypes.PIC ||
            tokenType == CobolTypes.VALUE ||
            tokenType == CobolTypes.PERFORM ||
            tokenType == CobolTypes.STOP ||
            tokenType == CobolTypes.RUN ||
            tokenType == CobolTypes.DISPLAY ||
            tokenType == CobolTypes.VARYING ||
            tokenType == CobolTypes.FROM ||
            tokenType == CobolTypes.BY ||
            tokenType == CobolTypes.UNTIL ||
            tokenType == CobolTypes.EQUALS) {
            return KEYWORD_KEYS;
        }

        // Strings
        if (tokenType == CobolTypes.STRING_LITERAL) return STRING_KEYS;

        // Numbers
        if (tokenType == CobolTypes.NUMBER) return NUMBER_KEYS;
        if (tokenType == CobolTypes.LINENUMBER) return LINE_NUMBER_KEYS;
        if (tokenType == CobolTypes.LEVELNUMBER) return LEVEL_NUMBER_KEYS;

        // Comments
        if (tokenType == CobolTypes.COMMENT) return COMMENT_KEYS;

        // Bad characters
        if (tokenType == TokenType.BAD_CHARACTER) return BAD_CHAR_KEYS;

        return EMPTY_KEYS;
    }
}
