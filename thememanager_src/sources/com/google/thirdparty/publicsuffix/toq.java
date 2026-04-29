package com.google.thirdparty.publicsuffix;

import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: PublicSuffixType.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
@InterfaceC7731k
public enum toq {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    toq(char c2, char c3) {
        this.innerNodeCode = c2;
        this.leafNodeCode = c3;
    }

    static toq fromCode(char c2) {
        for (toq toqVar : values()) {
            if (toqVar.getInnerNodeCode() == c2 || toqVar.getLeafNodeCode() == c2) {
                return toqVar;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c2);
    }

    static toq fromIsPrivate(boolean z2) {
        return z2 ? PRIVATE : REGISTRY;
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
