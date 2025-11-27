package com.github.mhncrst.cobolparserv1;

import com.intellij.psi.tree.TokenSet;


public interface CobolTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(CobolTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(CobolTypes.COMMENT);

}