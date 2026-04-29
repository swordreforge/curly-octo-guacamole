package kotlin.text;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C6163t;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.i9jn;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import kotlin.nn86;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n22#2,3:397\n1#3:400\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n102#1:397,3\n*E\n"})
public final class ki implements Serializable {

    @InterfaceC7396q
    public static final C6443k Companion = new C6443k(null);

    @InterfaceC7395n
    private Set<? extends EnumC6440i> _options;

    @InterfaceC7396q
    private final Pattern nativePattern;

    /* JADX INFO: renamed from: kotlin.text.ki$g */
    /* JADX INFO: compiled from: Regex.kt */
    @InterfaceC6205g(m22755c = "kotlin.text.Regex$splitToSequence$1", m22756f = "Regex.kt", m22757i = {1, 1, 1}, m22758l = {274, 282, 286}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "matcher", "splitCount"}, m22761s = {"L$0", "L$1", "I$0"})
    static final class C6442g extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super String>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6442g(CharSequence charSequence, int i2, InterfaceC6216q<? super C6442g> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$input = charSequence;
            this.$limit = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6442g c6442g = ki.this.new C6442g(this.$input, this.$limit, interfaceC6216q);
            c6442g.L$0 = obj;
            return c6442g;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super String> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6442g) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L30
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C6318m.n7h(r11)
                goto L9f
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                int r1 = r10.I$0
                java.lang.Object r2 = r10.L$1
                java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
                java.lang.Object r6 = r10.L$0
                kotlin.sequences.kja0 r6 = (kotlin.sequences.kja0) r6
                kotlin.C6318m.n7h(r11)
                r7 = r10
                r11 = r1
                r1 = r2
                goto L73
            L30:
                kotlin.C6318m.n7h(r11)
                goto Lb1
            L35:
                kotlin.C6318m.n7h(r11)
                java.lang.Object r11 = r10.L$0
                kotlin.sequences.kja0 r11 = (kotlin.sequences.kja0) r11
                kotlin.text.ki r1 = kotlin.text.ki.this
                java.util.regex.Pattern r1 = kotlin.text.ki.access$getNativePattern$p(r1)
                java.lang.CharSequence r6 = r10.$input
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.$limit
                if (r6 == r5) goto La2
                boolean r6 = r1.find()
                if (r6 != 0) goto L53
                goto La2
            L53:
                r7 = r10
                r6 = r11
                r11 = r2
            L56:
                java.lang.CharSequence r8 = r7.$input
                int r9 = r1.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r9)
                java.lang.String r2 = r2.toString()
                r7.L$0 = r6
                r7.L$1 = r1
                r7.I$0 = r11
                r7.label = r4
                java.lang.Object r2 = r6.toq(r2, r7)
                if (r2 != r0) goto L73
                return r0
            L73:
                int r2 = r1.end()
                int r11 = r11 + r5
                int r8 = r7.$limit
                int r8 = r8 - r5
                if (r11 == r8) goto L83
                boolean r8 = r1.find()
                if (r8 != 0) goto L56
            L83:
                java.lang.CharSequence r11 = r7.$input
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r2, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r11 = r6.toq(r11, r7)
                if (r11 != r0) goto L9f
                return r0
            L9f:
                kotlin.was r11 = kotlin.was.f36763k
                return r11
            La2:
                java.lang.CharSequence r1 = r10.$input
                java.lang.String r1 = r1.toString()
                r10.label = r5
                java.lang.Object r11 = r11.toq(r1, r10)
                if (r11 != r0) goto Lb1
                return r0
            Lb1:
                kotlin.was r11 = kotlin.was.f36763k
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.ki.C6442g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlin.text.ki$k */
    /* JADX INFO: compiled from: Regex.kt */
    public static final class C6443k {
        private C6443k() {
        }

        public /* synthetic */ C6443k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toq(int i2) {
            return (i2 & 2) != 0 ? i2 | 64 : i2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final ki m23539n(@InterfaceC7396q String literal) {
            kotlin.jvm.internal.d2ok.m23075h(literal, "literal");
            return new ki(literal, EnumC6440i.LITERAL);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final String m23540q(@InterfaceC7396q String literal) {
            kotlin.jvm.internal.d2ok.m23075h(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.d2ok.kja0(strQuoteReplacement, "quoteReplacement(literal)");
            return strQuoteReplacement;
        }

        @InterfaceC7396q
        public final String zy(@InterfaceC7396q String literal) {
            kotlin.jvm.internal.d2ok.m23075h(literal, "literal");
            String strQuote = Pattern.quote(literal);
            kotlin.jvm.internal.d2ok.kja0(strQuote, "quote(literal)");
            return strQuote;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.ki$n */
    /* JADX INFO: compiled from: Regex.kt */
    @lv5({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    static final class C6444n extends AbstractC6308r implements cyoe.x2<EnumC6440i, Boolean> {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6444n(int i2) {
            super(1);
            this.$value = i2;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(EnumC6440i enumC6440i) {
            EnumC6440i enumC6440i2 = enumC6440i;
            return Boolean.valueOf((this.$value & enumC6440i2.getMask()) == enumC6440i2.getValue());
        }
    }

    /* JADX INFO: renamed from: kotlin.text.ki$q */
    /* JADX INFO: compiled from: Regex.kt */
    /* synthetic */ class C6445q extends kotlin.jvm.internal.gvn7 implements cyoe.x2<InterfaceC6439h, InterfaceC6439h> {
        public static final C6445q INSTANCE = new C6445q();

        C6445q() {
            super(1, InterfaceC6439h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final InterfaceC6439h invoke(@InterfaceC7396q InterfaceC6439h p0) {
            kotlin.jvm.internal.d2ok.m23075h(p0, "p0");
            return p0.next();
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    private static final class toq implements Serializable {

        @InterfaceC7396q
        public static final C6446k Companion = new C6446k(null);
        private static final long serialVersionUID = 0;
        private final int flags;

        @InterfaceC7396q
        private final String pattern;

        /* JADX INFO: renamed from: kotlin.text.ki$toq$k */
        /* JADX INFO: compiled from: Regex.kt */
        public static final class C6446k {
            private C6446k() {
            }

            public /* synthetic */ C6446k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        public toq(@InterfaceC7396q String pattern, int i2) {
            kotlin.jvm.internal.d2ok.m23075h(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i2;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(pattern, flags)");
            return new ki(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @InterfaceC7396q
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    static final class zy extends AbstractC6308r implements InterfaceC5981k<InterfaceC6439h> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(CharSequence charSequence, int i2) {
            super(0);
            this.$input = charSequence;
            this.$startIndex = i2;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final InterfaceC6439h invoke() {
            return ki.this.find(this.$input, this.$startIndex);
        }
    }

    @nn86
    public ki(@InterfaceC7396q Pattern nativePattern) {
        kotlin.jvm.internal.d2ok.m23075h(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ InterfaceC6439h find$default(ki kiVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kiVar.find(charSequence, i2);
    }

    public static /* synthetic */ kotlin.sequences.qrj findAll$default(ki kiVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kiVar.findAll(charSequence, i2);
    }

    public static /* synthetic */ List split$default(ki kiVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kiVar.split(charSequence, i2);
    }

    public static /* synthetic */ kotlin.sequences.qrj splitToSequence$default(ki kiVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kiVar.splitToSequence(charSequence, i2);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.d2ok.kja0(strPattern, "nativePattern.pattern()");
        return new toq(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@InterfaceC7396q CharSequence input) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    @InterfaceC7395n
    public final InterfaceC6439h find(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.d2ok.kja0(matcher, "nativePattern.matcher(input)");
        return t8r.m23621g(matcher, i2, input);
    }

    @InterfaceC7396q
    public final kotlin.sequences.qrj<InterfaceC6439h> findAll(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        if (i2 >= 0 && i2 <= input.length()) {
            return kotlin.sequences.t8r.qrj(new zy(input, i2), C6445q.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i2 + ", input length: " + input.length());
    }

    @InterfaceC7396q
    public final Set<EnumC6440i> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int iFlags = this.nativePattern.flags();
        EnumSet fromInt$lambda$1 = EnumSet.allOf(EnumC6440i.class);
        kotlin.jvm.internal.d2ok.kja0(fromInt$lambda$1, "fromInt$lambda$1");
        C6163t.gbni(fromInt$lambda$1, new C6444n(iFlags));
        Set<EnumC6440i> setUnmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        kotlin.jvm.internal.d2ok.kja0(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @InterfaceC7396q
    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.d2ok.kja0(strPattern, "nativePattern.pattern()");
        return strPattern;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.7")
    public final InterfaceC6439h matchAt(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.d2ok.kja0(matcherRegion, "this");
        return new cdj(matcherRegion, input);
    }

    @InterfaceC7395n
    public final InterfaceC6439h matchEntire(@InterfaceC7396q CharSequence input) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.d2ok.kja0(matcher, "nativePattern.matcher(input)");
        return t8r.m23627y(matcher, input);
    }

    public final boolean matches(@InterfaceC7396q CharSequence input) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.7")
    public final boolean matchesAt(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length()).lookingAt();
    }

    @InterfaceC7396q
    public final String replace(@InterfaceC7396q CharSequence input, @InterfaceC7396q String replacement) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.d2ok.kja0(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    @InterfaceC7396q
    public final String replaceFirst(@InterfaceC7396q CharSequence input, @InterfaceC7396q String replacement) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.d2ok.kja0(strReplaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return strReplaceFirst;
    }

    @InterfaceC7396q
    public final List<String> split(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        fti.xouc(i2);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i2 == 1 || !matcher.find()) {
            return kotlin.collections.zurt.ld6(input.toString());
        }
        ArrayList arrayList = new ArrayList(i2 > 0 ? kotlin.ranges.fn3e.m23305t(i2, 10) : 10);
        int iEnd = 0;
        int i3 = i2 - 1;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.6")
    public final kotlin.sequences.qrj<String> splitToSequence(@InterfaceC7396q CharSequence input, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        fti.xouc(i2);
        return kotlin.sequences.cdj.toq(new C6442g(input, i2, null));
    }

    @InterfaceC7396q
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @InterfaceC7396q
    public String toString() {
        String string = this.nativePattern.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "nativePattern.toString()");
        return string;
    }

    @InterfaceC7396q
    public final String replace(@InterfaceC7396q CharSequence input, @InterfaceC7396q cyoe.x2<? super InterfaceC6439h, ? extends CharSequence> transform) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iIntValue = 0;
        InterfaceC6439h interfaceC6439hFind$default = find$default(this, input, 0, 2, null);
        if (interfaceC6439hFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, interfaceC6439hFind$default.zy().mo2951k().intValue());
            sb.append(transform.invoke(interfaceC6439hFind$default));
            iIntValue = interfaceC6439hFind$default.zy().zy().intValue() + 1;
            interfaceC6439hFind$default = interfaceC6439hFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC6439hFind$default != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ki(@InterfaceC7396q String pattern) {
        kotlin.jvm.internal.d2ok.m23075h(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ki(@InterfaceC7396q String pattern, @InterfaceC7396q EnumC6440i option) {
        kotlin.jvm.internal.d2ok.m23075h(pattern, "pattern");
        kotlin.jvm.internal.d2ok.m23075h(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, Companion.toq(option.getValue()));
        kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(pattern, ensureUnicodeCase(option.value))");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ki(@InterfaceC7396q String pattern, @InterfaceC7396q Set<? extends EnumC6440i> options) {
        kotlin.jvm.internal.d2ok.m23075h(pattern, "pattern");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, Companion.toq(t8r.ld6(options)));
        kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(pattern, ensureU…odeCase(options.toInt()))");
        this(patternCompile);
    }
}
