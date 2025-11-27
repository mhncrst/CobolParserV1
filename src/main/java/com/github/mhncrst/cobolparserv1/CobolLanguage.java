package com.github.mhncrst.cobolparserv1;
import com.intellij.lang.Language;


public class CobolLanguage extends Language {
    public static final CobolLanguage INSTANCE = new CobolLanguage();

    private CobolLanguage(){
        super("Cobol");
    }
}
