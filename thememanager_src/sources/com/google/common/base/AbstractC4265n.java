package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.base.n */
/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class AbstractC4265n implements a9<Character> {

    /* JADX INFO: renamed from: k */
    private static final int f25683k = 65536;

    /* JADX INFO: renamed from: com.google.common.base.n$cdj */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class cdj extends zurt {

        /* JADX INFO: renamed from: n */
        static final cdj f25684n = new cdj();

        private cdj() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$f7l8 */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class f7l8 extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final AbstractC4265n f25685q = new f7l8();

        private f7l8() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            if (c2 != ' ' && c2 != 133 && c2 != 5760) {
                if (c2 == 8199) {
                    return false;
                }
                if (c2 != 8287 && c2 != 12288 && c2 != 8232 && c2 != 8233) {
                    switch (c2) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c2 < 8192 || c2 > 8202) {
                            }
                            break;
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$fn3e */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class fn3e extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final fn3e f25686q = new fn3e();

        private fn3e() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Character.isUpperCase(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$fu4 */
    /* JADX INFO: compiled from: CharMatcher.java */
    static class fu4 extends ni7 {
        fu4(AbstractC4265n abstractC4265n) {
            super(abstractC4265n);
        }

        @Override // com.google.common.base.AbstractC4265n
        public final AbstractC4265n oc() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$g */
    /* JADX INFO: compiled from: CharMatcher.java */
    @wlev.zy
    private static final class g extends zurt {

        /* JADX INFO: renamed from: n */
        private final BitSet f25687n;

        /* synthetic */ g(BitSet bitSet, String str, k kVar) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.AbstractC4265n
        void ncyb(BitSet bitSet) {
            bitSet.or(this.f25687n);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return this.f25687n.get(c2);
        }

        private g(BitSet bitSet, String str) {
            super(str);
            this.f25687n = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$h */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class h extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final h f25688q = new h();

        private h() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Character.isDigit(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$i */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class i extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final i f25689q = new i();

        private i() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Character.isLowerCase(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$k */
    /* JADX INFO: compiled from: CharMatcher.java */
    class k extends fu4 {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f25691n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AbstractC4265n abstractC4265n, String str) {
            super(abstractC4265n);
            this.f25691n = str;
        }

        @Override // com.google.common.base.AbstractC4265n.ni7, com.google.common.base.AbstractC4265n
        public String toString() {
            return this.f25691n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$ki */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class ki extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final ki f25692q = new ki();

        private ki() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Character.isLetter(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$kja0 */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class kja0 extends s {

        /* JADX INFO: renamed from: q */
        private final char f25693q;

        kja0(char c2) {
            this.f25693q = c2;
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n d3(AbstractC4265n abstractC4265n) {
            return abstractC4265n.mo15362t(this.f25693q) ? AbstractC4265n.zy() : this;
        }

        @Override // com.google.common.base.AbstractC4265n.s, com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return AbstractC4265n.cdj(this.f25693q);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            bitSet.set(0, this.f25693q);
            bitSet.set(this.f25693q + 1, 65536);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return c2 != this.f25693q;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.isNot('" + AbstractC4265n.m15418l(this.f25693q) + "')";
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n toq(AbstractC4265n abstractC4265n) {
            return abstractC4265n.mo15362t(this.f25693q) ? super.toq(abstractC4265n) : abstractC4265n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$ld6 */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class ld6 extends s {

        /* JADX INFO: renamed from: n */
        private final char f25694n;

        /* JADX INFO: renamed from: q */
        private final char f25695q;

        ld6(char c2, char c3) {
            jk.m15383q(c3 >= c2);
            this.f25695q = c2;
            this.f25694n = c3;
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            bitSet.set(this.f25695q, this.f25694n + 1);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return this.f25695q <= c2 && c2 <= this.f25694n;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.inRange('" + AbstractC4265n.m15418l(this.f25695q) + "', '" + AbstractC4265n.m15418l(this.f25694n) + "')";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$mcp */
    /* JADX INFO: compiled from: CharMatcher.java */
    @InterfaceC7732q
    static final class mcp extends zurt {

        /* JADX INFO: renamed from: g */
        static final int f25696g = 1682554634;

        /* JADX INFO: renamed from: n */
        static final String f25697n = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: y */
        static final int f25699y = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: s */
        static final mcp f25698s = new mcp();

        mcp() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            for (int i2 = 0; i2 < 32; i2++) {
                bitSet.set(f25697n.charAt(i2));
            }
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return f25697n.charAt((f25696g * c2) >>> f25699y) == c2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$n */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class n extends zurt {

        /* JADX INFO: renamed from: n */
        static final n f25700n = new n();

        n() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return c2 <= 127;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$n7h */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class n7h extends s {

        /* JADX INFO: renamed from: n */
        private final char f25701n;

        /* JADX INFO: renamed from: q */
        private final char f25702q;

        n7h(char c2, char c3) {
            this.f25702q = c2;
            this.f25701n = c3;
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            bitSet.set(this.f25702q);
            bitSet.set(this.f25701n);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return c2 == this.f25702q || c2 == this.f25701n;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.anyOf(\"" + AbstractC4265n.m15418l(this.f25702q) + AbstractC4265n.m15418l(this.f25701n) + "\")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$ni7 */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static class ni7 extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        final AbstractC4265n f25703q;

        ni7(AbstractC4265n abstractC4265n) {
            this.f25703q = (AbstractC4265n) jk.a9(abstractC4265n);
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean a9(CharSequence charSequence) {
            return this.f25703q.mcp(charSequence);
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return this.f25703q;
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean mcp(CharSequence charSequence) {
            return this.f25703q.a9(charSequence);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f25703q.ncyb(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: s */
        public int mo15426s(CharSequence charSequence) {
            return charSequence.length() - this.f25703q.mo15426s(charSequence);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return !this.f25703q.mo15362t(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return this.f25703q + ".negate()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$o1t */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class o1t extends AbstractC4265n {

        /* JADX INFO: renamed from: n */
        final AbstractC4265n f25704n;

        /* JADX INFO: renamed from: q */
        final AbstractC4265n f25705q;

        o1t(AbstractC4265n abstractC4265n, AbstractC4265n abstractC4265n2) {
            this.f25705q = (AbstractC4265n) jk.a9(abstractC4265n);
            this.f25704n = (AbstractC4265n) jk.a9(abstractC4265n2);
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            this.f25705q.ncyb(bitSet);
            this.f25704n.ncyb(bitSet);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return this.f25705q.mo15362t(c2) || this.f25704n.mo15362t(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.or(" + this.f25705q + ", " + this.f25704n + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$p */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class p extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        private final a9<? super Character> f25706q;

        p(a9<? super Character> a9Var) {
            this.f25706q = (a9) jk.a9(a9Var);
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character ch2) {
            return this.f25706q.apply(jk.a9(ch2));
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return this.f25706q.apply(Character.valueOf(c2));
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f25706q + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$q */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class q extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        private final char[] f25707q;

        public q(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f25707q = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            for (char c2 : this.f25707q) {
                bitSet.set(c2);
            }
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Arrays.binarySearch(this.f25707q, c2) >= 0;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c2 : this.f25707q) {
                sb.append(AbstractC4265n.m15418l(c2));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$qrj */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class qrj extends s {

        /* JADX INFO: renamed from: q */
        private final char f25708q;

        qrj(char c2) {
            this.f25708q = c2;
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n d3(AbstractC4265n abstractC4265n) {
            return abstractC4265n.mo15362t(this.f25708q) ? abstractC4265n : super.d3(abstractC4265n);
        }

        @Override // com.google.common.base.AbstractC4265n.s, com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return AbstractC4265n.t8r(this.f25708q);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            bitSet.set(this.f25708q);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: r */
        public String mo15425r(CharSequence charSequence, char c2) {
            return charSequence.toString().replace(this.f25708q, c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return c2 == this.f25708q;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.is('" + AbstractC4265n.m15418l(this.f25708q) + "')";
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n toq(AbstractC4265n abstractC4265n) {
            return abstractC4265n.mo15362t(this.f25708q) ? this : AbstractC4265n.jp0y();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$s */
    /* JADX INFO: compiled from: CharMatcher.java */
    static abstract class s extends AbstractC4265n {
        s() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return new fu4(this);
        }

        @Override // com.google.common.base.AbstractC4265n
        public final AbstractC4265n oc() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$t */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class t extends wvg {

        /* JADX INFO: renamed from: y */
        static final t f25709y = new t();

        private t() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$t8r */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class t8r extends AbstractC4265n {

        /* JADX INFO: renamed from: q */
        static final t8r f25710q = new t8r();

        private t8r() {
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return Character.isLetterOrDigit(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$toq */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class toq extends AbstractC4265n {

        /* JADX INFO: renamed from: n */
        final AbstractC4265n f25711n;

        /* JADX INFO: renamed from: q */
        final AbstractC4265n f25712q;

        toq(AbstractC4265n abstractC4265n, AbstractC4265n abstractC4265n2) {
            this.f25712q = (AbstractC4265n) jk.a9(abstractC4265n);
            this.f25711n = (AbstractC4265n) jk.a9(abstractC4265n2);
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        @wlev.zy
        void ncyb(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f25712q.ncyb(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f25711n.ncyb(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return this.f25712q.mo15362t(c2) && this.f25711n.mo15362t(c2);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return "CharMatcher.and(" + this.f25712q + ", " + this.f25711n + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$wvg */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static class wvg extends AbstractC4265n {

        /* JADX INFO: renamed from: g */
        private final char[] f25713g;

        /* JADX INFO: renamed from: n */
        private final char[] f25714n;

        /* JADX INFO: renamed from: q */
        private final String f25715q;

        wvg(String str, char[] cArr, char[] cArr2) {
            this.f25715q = str;
            this.f25714n = cArr;
            this.f25713g = cArr2;
            jk.m15383q(cArr.length == cArr2.length);
            int i2 = 0;
            while (i2 < cArr.length) {
                jk.m15383q(cArr[i2] <= cArr2[i2]);
                int i3 = i2 + 1;
                if (i3 < cArr.length) {
                    jk.m15383q(cArr2[i2] < cArr[i3]);
                }
                i2 = i3;
            }
        }

        @Override // com.google.common.base.AbstractC4265n, com.google.common.base.a9
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            int iBinarySearch = Arrays.binarySearch(this.f25714n, c2);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i2 = (~iBinarySearch) - 1;
            return i2 >= 0 && c2 <= this.f25713g[i2];
        }

        @Override // com.google.common.base.AbstractC4265n
        public String toString() {
            return this.f25715q;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$x2 */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class x2 extends wvg {

        /* JADX INFO: renamed from: p */
        static final x2 f25716p = new x2();

        /* JADX INFO: renamed from: s */
        private static final String f25717s = "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* JADX INFO: renamed from: y */
        private static final String f25718y = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private x2() {
            super("CharMatcher.invisible()", f25718y.toCharArray(), f25717s.toCharArray());
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$y */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class y extends wvg {

        /* JADX INFO: renamed from: s */
        static final y f25719s = new y();

        /* JADX INFO: renamed from: y */
        private static final String f25720y = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private y() {
            super("CharMatcher.digit()", m15428e(), vyq());
        }

        /* JADX INFO: renamed from: e */
        private static char[] m15428e() {
            return f25720y.toCharArray();
        }

        private static char[] vyq() {
            char[] cArr = new char[37];
            for (int i2 = 0; i2 < 37; i2++) {
                cArr[i2] = (char) (f25720y.charAt(i2) + '\t');
            }
            return cArr;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$z */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class z extends zurt {

        /* JADX INFO: renamed from: n */
        static final z f25721n = new z();

        private z() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean a9(CharSequence charSequence) {
            jk.a9(charSequence);
            return true;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: c */
        public String mo15422c(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n d3(AbstractC4265n abstractC4265n) {
            return (AbstractC4265n) jk.a9(abstractC4265n);
        }

        @Override // com.google.common.base.AbstractC4265n
        public String dd(CharSequence charSequence, CharSequence charSequence2) {
            jk.a9(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: f */
        public String mo15423f(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n.s, com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return AbstractC4265n.zy();
        }

        @Override // com.google.common.base.AbstractC4265n
        public int kja0(CharSequence charSequence, int i2) {
            jk.m15381o(i2, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String lrht(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        public String lvui(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean mcp(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.AbstractC4265n
        public int n7h(CharSequence charSequence) {
            jk.a9(charSequence);
            return -1;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: r */
        public String mo15425r(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: s */
        public int mo15426s(CharSequence charSequence) {
            jk.a9(charSequence);
            return 0;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return false;
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n toq(AbstractC4265n abstractC4265n) {
            jk.a9(abstractC4265n);
            return this;
        }

        @Override // com.google.common.base.AbstractC4265n
        public int wvg(CharSequence charSequence) {
            jk.a9(charSequence);
            return -1;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: y */
        public String mo15427y(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$zurt */
    /* JADX INFO: compiled from: CharMatcher.java */
    static abstract class zurt extends s {

        /* JADX INFO: renamed from: q */
        private final String f25722q;

        zurt(String str) {
            this.f25722q = (String) jk.a9(str);
        }

        @Override // com.google.common.base.AbstractC4265n
        public final String toString() {
            return this.f25722q;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.n$zy */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class zy extends zurt {

        /* JADX INFO: renamed from: n */
        static final zy f25723n = new zy();

        private zy() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean a9(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n d3(AbstractC4265n abstractC4265n) {
            jk.a9(abstractC4265n);
            return this;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String dd(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: f */
        public String mo15423f(CharSequence charSequence) {
            jk.a9(charSequence);
            return "";
        }

        @Override // com.google.common.base.AbstractC4265n.s, com.google.common.base.AbstractC4265n
        public AbstractC4265n fti() {
            return AbstractC4265n.jp0y();
        }

        @Override // com.google.common.base.AbstractC4265n
        public int kja0(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            jk.m15381o(i2, length);
            if (i2 == length) {
                return -1;
            }
            return i2;
        }

        @Override // com.google.common.base.AbstractC4265n
        public String lvui(CharSequence charSequence) {
            jk.a9(charSequence);
            return "";
        }

        @Override // com.google.common.base.AbstractC4265n
        public boolean mcp(CharSequence charSequence) {
            jk.a9(charSequence);
            return true;
        }

        @Override // com.google.common.base.AbstractC4265n
        public int n7h(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: r */
        public String mo15425r(CharSequence charSequence, char c2) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c2);
            return new String(cArr);
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: s */
        public int mo15426s(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: t */
        public boolean mo15362t(char c2) {
            return true;
        }

        @Override // com.google.common.base.AbstractC4265n
        public AbstractC4265n toq(AbstractC4265n abstractC4265n) {
            return (AbstractC4265n) jk.a9(abstractC4265n);
        }

        @Override // com.google.common.base.AbstractC4265n
        public int wvg(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.AbstractC4265n
        /* JADX INFO: renamed from: y */
        public String mo15427y(CharSequence charSequence, char c2) {
            return charSequence.length() == 0 ? "" : String.valueOf(c2);
        }
    }

    protected AbstractC4265n() {
    }

    public static AbstractC4265n cdj(char c2) {
        return new qrj(c2);
    }

    @wlev.zy
    private static AbstractC4265n d2ok(int i2, BitSet bitSet, String str) {
        if (i2 == 0) {
            return jp0y();
        }
        if (i2 == 1) {
            return cdj((char) bitSet.nextSetBit(0));
        }
        if (i2 != 2) {
            return m15416i(i2, bitSet.length()) ? gvn7.nn86(bitSet, str) : new g(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return ki(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    public static AbstractC4265n f7l8() {
        return f7l8.f25685q;
    }

    @Deprecated
    public static AbstractC4265n fn3e() {
        return h.f25688q;
    }

    @Deprecated
    public static AbstractC4265n fu4() {
        return t8r.f25710q;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC4265n m15414g() {
        return n.f25700n;
    }

    public static AbstractC4265n gvn7(CharSequence charSequence) {
        return m15420q(charSequence).fti();
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static AbstractC4265n m15415h() {
        return x2.f25716p;
    }

    @wlev.zy
    /* JADX INFO: renamed from: i */
    private static boolean m15416i(int i2, int i3) {
        return i2 <= 1023 && i3 > (i2 * 4) * 16;
    }

    public static AbstractC4265n jp0y() {
        return z.f25721n;
    }

    private static n7h ki(char c2, char c3) {
        return new n7h(c2, c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static String m15418l(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    private String ld6(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!mo15362t(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    @Deprecated
    public static AbstractC4265n n5r1() {
        return t.f25709y;
    }

    @Deprecated
    public static AbstractC4265n ni7() {
        return ki.f25692q;
    }

    @Deprecated
    public static AbstractC4265n o1t() {
        return fn3e.f25686q;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static AbstractC4265n m15419p() {
        return y.f25719s;
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC4265n m15420q(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new q(charSequence) : ki(charSequence.charAt(0), charSequence.charAt(1)) : cdj(charSequence.charAt(0)) : jp0y();
    }

    public static AbstractC4265n qrj(char c2, char c3) {
        return new ld6(c2, c3);
    }

    public static AbstractC4265n t8r(char c2) {
        return new kja0(c2);
    }

    public static AbstractC4265n uv6() {
        return mcp.f25698s;
    }

    public static AbstractC4265n x2(a9<? super Character> a9Var) {
        return a9Var instanceof AbstractC4265n ? (AbstractC4265n) a9Var : new p(a9Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static AbstractC4265n m15421z() {
        return i.f25689q;
    }

    public static AbstractC4265n zurt() {
        return cdj.f25684n;
    }

    public static AbstractC4265n zy() {
        return zy.f25723n;
    }

    public boolean a9(CharSequence charSequence) {
        return n7h(charSequence) == -1;
    }

    /* JADX INFO: renamed from: c */
    public String mo15422c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!mo15362t(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public AbstractC4265n d3(AbstractC4265n abstractC4265n) {
        return new o1t(this, abstractC4265n);
    }

    public String dd(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return lvui(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return mo15425r(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iN7h = n7h(string);
        if (iN7h == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i2, iN7h);
            sb.append(charSequence2);
            i2 = iN7h + 1;
            iN7h = kja0(string, i2);
        } while (iN7h != -1);
        sb.append((CharSequence) string, i2, length2);
        return sb.toString();
    }

    @wlev.zy
    AbstractC4265n eqxt() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        ncyb(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return d2ok(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i2 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new k(d2ok(i2, bitSet, strSubstring), string);
    }

    /* JADX INFO: renamed from: f */
    public String mo15423f(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && mo15362t(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && mo15362t(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public AbstractC4265n fti() {
        return new ni7(this);
    }

    public String hyr(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && mo15362t(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && mo15362t(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return mo15427y(charSequence, c2);
        }
        int i5 = i4 + 1;
        return ld6(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    public boolean jk(CharSequence charSequence) {
        return !a9(charSequence);
    }

    public int kja0(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        jk.m15381o(i2, length);
        while (i2 < length) {
            if (mo15362t(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public String lrht(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo15362t(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String lvui(CharSequence charSequence) {
        String string = charSequence.toString();
        int iN7h = n7h(string);
        if (iN7h == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iN7h++;
            while (iN7h != charArray.length) {
                if (mo15362t(charArray[iN7h])) {
                    break;
                }
                charArray[iN7h - i2] = charArray[iN7h];
                iN7h++;
            }
            return new String(charArray, 0, iN7h - i2);
            i2++;
        }
    }

    public boolean mcp(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo15362t(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.base.a9
    @Deprecated
    /* JADX INFO: renamed from: n */
    public boolean apply(Character ch2) {
        return mo15362t(ch2.charValue());
    }

    public int n7h(CharSequence charSequence) {
        return kja0(charSequence, 0);
    }

    @wlev.zy
    void ncyb(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (mo15362t((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public AbstractC4265n oc() {
        return com.google.common.base.mcp.m15411s(this);
    }

    /* JADX INFO: renamed from: r */
    public String mo15425r(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int iN7h = n7h(string);
        if (iN7h == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iN7h] = c2;
        while (true) {
            iN7h++;
            if (iN7h >= charArray.length) {
                return new String(charArray);
            }
            if (mo15362t(charArray[iN7h])) {
                charArray[iN7h] = c2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public int mo15426s(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (mo15362t(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo15362t(char c2);

    public String toString() {
        return super.toString();
    }

    public AbstractC4265n toq(AbstractC4265n abstractC4265n) {
        return new toq(this, abstractC4265n);
    }

    public int wvg(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (mo15362t(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public String x9kr(CharSequence charSequence) {
        return fti().lvui(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public String mo15427y(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (mo15362t(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && mo15362t(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return ld6(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }
}
