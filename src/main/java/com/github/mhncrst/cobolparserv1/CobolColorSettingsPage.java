package com.github.mhncrst.cobolparserv1;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public final class CobolColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
        new AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEYWORD),
        new AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
        new AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
        new AttributesDescriptor("Line number", CobolSyntaxHighlighter.LINE_NUMBER),
        new AttributesDescriptor("Level number", CobolSyntaxHighlighter.LEVEL_NUMBER),
        new AttributesDescriptor("Comment", CobolSyntaxHighlighter.COMMENT),
        new AttributesDescriptor("Bad character", CobolSyntaxHighlighter.BAD_CHARACTER)
    };

    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CobolSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
            IDENTIFICATION DIVISION.
            PROGRAM-ID. HELLO-WORLD.

            DATA DIVISION.
            WORKING-STORAGE SECTION.
            01 WS-NUMBER PIC 9(2) VALUE 10.

            PROCEDURE DIVISION.
            0001 DISPLAY 'Hello, world!'.
            0002 STOP RUN.
            """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "COBOL";
    }
}
