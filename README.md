#CobolParserV1

#Overview
CobolParserV1 is an IntelliJ Platform Plugin that provides basic parsing and syntax highlighting support for COBOL source files. It includes a lexer and grammar built with JFlex and GrammarKit, and highlights COBOL keywords, literals, comments, line numbers, and level numbers with distinct colors. The plugin is designed to be minimal, correct, and maintainable.

#Features
COBOL lexer defined in Cobol.flex using JFlex

COBOL grammar defined in Cobol.bnf using GrammarKit

PSI tree generation and visitor support

Syntax highlighting for keywords, strings, numbers, comments

Integration with IntelliJ color scheme settings via CobolColorSettingsPage

Runs in IntelliJ sandbox using Gradle tasks

#Installation
From source
Clone the repository and run the plugin in a sandbox IDE:

git clone https://github.com/mhncrst/CobolParserV1.git
cd CobolParserV1
./gradlew runIde
This launches a sandbox IntelliJ IDE with the plugin loaded.
