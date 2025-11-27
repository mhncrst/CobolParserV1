package com.github.mhncrst.cobolparserv1;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import javax.swing.Icon;

public final class CobolFileType extends LanguageFileType {
    public static final CobolFileType INSTANCE = new CobolFileType();

    private  CobolFileType(){
        super(CobolLanguage.INSTANCE);
    }
    @NotNull
    @Override
    public String getName() {
        return "Cobol File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cobol language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cbl";
    }

    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }
}
