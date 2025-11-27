package com.github.mhncrst.cobolparserv1;
import com.intellij.lexer.FlexAdapter;
public class CobolLexerAdapter extends FlexAdapter{
    public CobolLexerAdapter() {
        super(new CobolLexer(null));
    }
}
