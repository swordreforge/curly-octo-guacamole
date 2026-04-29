package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: JdkPattern.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class zurt extends AbstractC4279y implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* JADX INFO: renamed from: com.google.common.base.zurt$k */
    /* JADX INFO: compiled from: JdkPattern.java */
    private static final class C4281k extends f7l8 {

        /* JADX INFO: renamed from: k */
        final Matcher f25749k;

        C4281k(Matcher matcher) {
            this.f25749k = (Matcher) jk.a9(matcher);
        }

        @Override // com.google.common.base.f7l8
        /* JADX INFO: renamed from: g */
        public int mo15333g() {
            return this.f25749k.start();
        }

        @Override // com.google.common.base.f7l8
        /* JADX INFO: renamed from: k */
        public int mo15334k() {
            return this.f25749k.end();
        }

        @Override // com.google.common.base.f7l8
        /* JADX INFO: renamed from: n */
        public String mo15335n(String str) {
            return this.f25749k.replaceAll(str);
        }

        @Override // com.google.common.base.f7l8
        /* JADX INFO: renamed from: q */
        public boolean mo15336q() {
            return this.f25749k.matches();
        }

        @Override // com.google.common.base.f7l8
        public boolean toq() {
            return this.f25749k.find();
        }

        @Override // com.google.common.base.f7l8
        public boolean zy(int i2) {
            return this.f25749k.find(i2);
        }
    }

    zurt(Pattern pattern) {
        this.pattern = (Pattern) jk.a9(pattern);
    }

    @Override // com.google.common.base.AbstractC4279y
    public int flags() {
        return this.pattern.flags();
    }

    @Override // com.google.common.base.AbstractC4279y
    public f7l8 matcher(CharSequence charSequence) {
        return new C4281k(this.pattern.matcher(charSequence));
    }

    @Override // com.google.common.base.AbstractC4279y
    public String pattern() {
        return this.pattern.pattern();
    }

    @Override // com.google.common.base.AbstractC4279y
    public String toString() {
        return this.pattern.toString();
    }
}
