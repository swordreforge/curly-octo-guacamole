package kotlin.text;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C6227f;
import kotlin.InterfaceC6232i;
import kotlin.collections.C6140e;
import kotlin.collections.C6163t;
import kotlin.collections.C6171x;
import kotlin.collections.a98o;
import kotlin.collections.i1;
import kotlin.collections.n5r1;
import kotlin.collections.ncyb;
import kotlin.collections.x9kr;
import kotlin.gyi;
import kotlin.hb;
import kotlin.hyr;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.random.AbstractC6332g;
import kotlin.was;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n372#3,7:2550\n372#3,7:2563\n372#3,7:2573\n372#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
public class gvn7 extends jp0y {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Strings.kt */
    static final class f7l8<R> extends AbstractC6308r implements cyoe.x2<Integer, R> {
        final /* synthetic */ int $size;
        final /* synthetic */ CharSequence $this_windowedSequence;
        final /* synthetic */ cyoe.x2<CharSequence, R> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f7l8(int i2, CharSequence charSequence, cyoe.x2<? super CharSequence, ? extends R> x2Var) {
            super(1);
            this.$size = i2;
            this.$this_windowedSequence = charSequence;
            this.$transform = x2Var;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final R invoke(int i2) {
            int length = this.$size + i2;
            if (length < 0 || length > this.$this_windowedSequence.length()) {
                length = this.$this_windowedSequence.length();
            }
            return this.$transform.invoke(this.$this_windowedSequence.subSequence(i2, length));
        }
    }

    /* JADX INFO: renamed from: kotlin.text.gvn7$g */
    /* JADX INFO: compiled from: _Strings.kt */
    static final class C6434g extends AbstractC6308r implements cyoe.x2<CharSequence, String> {
        public static final C6434g INSTANCE = new C6434g();

        C6434g() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q CharSequence it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.gvn7$k */
    /* JADX INFO: compiled from: Iterables.kt */
    @lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2475#2:71\n*E\n"})
    public static final class C6435k implements Iterable<Character>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ CharSequence f36690k;

        public C6435k(CharSequence charSequence) {
            this.f36690k = charSequence;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Character> iterator() {
            return fti.ge(this.f36690k);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.gvn7$n */
    /* JADX INFO: compiled from: _Strings.kt */
    static final class C6436n extends AbstractC6308r implements cyoe.x2<CharSequence, String> {
        public static final C6436n INSTANCE = new C6436n();

        C6436n() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q CharSequence it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* JADX INFO: renamed from: kotlin.text.gvn7$q */
    /* JADX INFO: compiled from: _Strings.kt */
    @lv5({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2486:1\n*E\n"})
    public static final class C6437q<K> implements kotlin.collections.d2ok<Character, K> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ CharSequence f36691k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cyoe.x2<Character, K> f81923toq;

        /* JADX WARN: Multi-variable type inference failed */
        public C6437q(CharSequence charSequence, cyoe.x2<? super Character, ? extends K> x2Var) {
            this.f36691k = charSequence;
            this.f81923toq = x2Var;
        }

        @Override // kotlin.collections.d2ok
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ Object mo22425k(Character ch2) {
            return zy(ch2.charValue());
        }

        @Override // kotlin.collections.d2ok
        @InterfaceC7396q
        public Iterator<Character> toq() {
            return fti.ge(this.f36691k);
        }

        public K zy(char c2) {
            return this.f81923toq.invoke(Character.valueOf(c2));
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,680:1\n2483#2:681\n*E\n"})
    public static final class toq implements kotlin.sequences.qrj<Character> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ CharSequence f36692k;

        public toq(CharSequence charSequence) {
            this.f36692k = charSequence;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Character> iterator() {
            return fti.ge(this.f36692k);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.gvn7$y */
    /* JADX INFO: compiled from: _Strings.kt */
    static final class C6438y extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Character>> {
        final /* synthetic */ CharSequence $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6438y(CharSequence charSequence) {
            super(0);
            this.$this_withIndex = charSequence;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Character> invoke() {
            return fti.ge(this.$this_withIndex);
        }
    }

    /* JADX INFO: compiled from: _Strings.kt */
    static final class zy extends AbstractC6308r implements cyoe.x2<CharSequence, String> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q CharSequence it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return it.toString();
        }
    }

    public static final boolean a4ph(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Character>>> M a5rs(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final float an(CharSequence charSequence, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C aq2a(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            C6163t.zp(destination, transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Character ar4(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @InterfaceC7396q
    public static final CharSequence azf(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(0, i2);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC7396q
    public static final Iterable<Character> b6i9(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return kotlin.collections.ni7.a9();
            }
        }
        return new C6435k(charSequence);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <R> kotlin.sequences.qrj<R> b972(@InterfaceC7396q CharSequence charSequence, int i2, @InterfaceC7396q cyoe.x2<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        return fv(charSequence, i2, i2, true, transform);
    }

    @InterfaceC7396q
    public static final <K> Map<K, Character> bao0(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <R> List<R> bbg(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Character> bp(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return kotlin.sequences.t8r.f7l8();
            }
        }
        return new toq(charSequence);
    }

    public static final boolean bru(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final String bv(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "filterNotTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R> R c2lu(CharSequence charSequence, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static /* synthetic */ kotlin.sequences.qrj c3sl(CharSequence charSequence, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return id(charSequence, i2, i3, z2);
    }

    public static final int c4(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final CharSequence c7g(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 >= 0) {
            return charSequence.subSequence(kotlin.ranges.fn3e.m23305t(i2, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final String cc1(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iKt06 = fti.kt06(str); -1 < iKt06; iKt06--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iKt06))).booleanValue()) {
                String strSubstring = str.substring(0, iKt06 + 1);
                kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    @InterfaceC6234g
    private static final char crha(CharSequence charSequence, int i2, cyoe.x2<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > fti.kt06(charSequence)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : charSequence.charAt(i2);
    }

    @InterfaceC7395n
    public static final Character cun(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char d7y(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Character chValueOf = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character da(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7396q
    public static final String dgmt(@InterfaceC7396q String str, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? "" : fti.bmt3(str, indices);
    }

    public static final void dhzo(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            action.invoke(Character.valueOf(charSequence.charAt(i2)));
        }
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Character>> M dmw0(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R extends Comparable<? super R>> R dwra(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <R> List<R> dyer(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final Float e9(CharSequence charSequence, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> ebaq(CharSequence charSequence, InterfaceC5979h<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character eh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character ek(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R> R ep5q(CharSequence charSequence, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final String ex76(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                String strSubstring = str.substring(i2);
                kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final void f1(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            i2++;
            i3++;
        }
    }

    @InterfaceC7395n
    public static final Character fai(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 < 0 || i2 > fti.kt06(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i2));
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M ff8y(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    public static final <R> R ffy(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
        }
        return r2;
    }

    public static final <R> R fjcj(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Character.valueOf(charSequence.charAt(i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static String fjxh(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (i2 >= 0) {
            String strSubstring = str.substring(0, kotlin.ranges.fn3e.m23305t(i2, str.length()));
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final Character fl(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return y76(charSequence, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <R> R fm(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char fn9(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7396q
    public static String fpn(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (i2 >= 0) {
            String strSubstring = str.substring(kotlin.ranges.fn3e.m23305t(i2, str.length()));
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final String fq(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "filterTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @InterfaceC7396q
    public static final String fu7m(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (i2 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - kotlin.ranges.fn3e.m23305t(i2, length));
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <R> kotlin.sequences.qrj<R> fv(@InterfaceC7396q CharSequence charSequence, int i2, int i3, boolean z2, @InterfaceC7396q cyoe.x2<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        C6171x.m22658k(i2, i3);
        return kotlin.sequences.fn3e.b3e(kotlin.collections.a9.ebn(kotlin.ranges.fn3e.zwy(z2 ? fti.kz28(charSequence) : kotlin.ranges.fn3e.nme(0, (charSequence.length() - i2) + 1), i3)), new f7l8(i2, charSequence, transform));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R extends Comparable<? super R>> R fvqg(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char g6i(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7396q
    public static final <C extends Appendable> C g8(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M gg7(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <R> List<R> gir(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i2));
            i2++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <V> List<V> gk(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence other, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(other.charAt(i2))));
        }
        return arrayList;
    }

    public static final char gl8t(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC6234g
    private static final String goq(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return qe(str).toString();
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <R> List<R> gz(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <S extends CharSequence> S h39(@InterfaceC7396q S s2, @InterfaceC7396q cyoe.x2<? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(s2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (int i2 = 0; i2 < s2.length(); i2++) {
            action.invoke(Character.valueOf(s2.charAt(i2)));
        }
        return s2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R> R h4g(CharSequence charSequence, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R extends Comparable<? super R>> R h8k(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final char hczd(CharSequence charSequence, int i2, cyoe.x2<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > fti.kt06(charSequence)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : charSequence.charAt(i2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final float hfwa(CharSequence charSequence, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final List<C6227f<Character, Character>> hk(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence other) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(nmn5.m23230k(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(other.charAt(i2))));
        }
        return arrayList;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int hs6(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final char huy(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return ih(charSequence, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final List<C6227f<Character, Character>> hw(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            i2++;
            arrayList.add(nmn5.m23230k(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C hzl(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return destination;
    }

    @InterfaceC7396q
    public static String i0(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (i2 >= 0) {
            return fjxh(str, kotlin.ranges.fn3e.fn3e(str.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final char i03a(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return cCharAt;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <R> List<R> i4w(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final List<Character> i8gn(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.ni7.a9();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i2 = 1; i2 < length; i2++) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character iby(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iKt06);
        for (int i2 = iKt06 - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final kotlin.sequences.qrj<String> id(@InterfaceC7396q CharSequence charSequence, int i2, int i3, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return fv(charSequence, i2, i3, z2, C6434g.INSTANCE);
    }

    @yz(version = "1.3")
    public static final char ih(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(random.nextInt(charSequence.length()));
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <S extends CharSequence> S iqz(@InterfaceC7396q S s2, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(s2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int i2 = 0;
        int i3 = 0;
        while (i2 < s2.length()) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(s2.charAt(i2)));
            i2++;
            i3++;
        }
        return s2;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C irh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final char ivs(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Character>> C jcwh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            destination.add(Character.valueOf(charSequence.charAt(i2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final Double jerf(CharSequence charSequence, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long jl(CharSequence charSequence, cyoe.x2<? super Character, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Character.valueOf(charSequence.charAt(i2))).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final kotlin.sequences.qrj<String> jp(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return b972(charSequence, i2, zy.INSTANCE);
    }

    @InterfaceC7396q
    public static final <R> List<R> jut(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static final int kho(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7395n
    public static final Character l0u(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int l5o(CharSequence charSequence, cyoe.x2<? super Character, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Character.valueOf(charSequence.charAt(i2))).a98o());
        }
        return iLd6;
    }

    @InterfaceC6234g
    private static final String lflh(String str, Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return nd(str, indices).toString();
    }

    public static final boolean li5y(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final String lm5(@InterfaceC7396q String str, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "filterIndexedTo(StringBu…(), predicate).toString()");
        return string;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double lv7(CharSequence charSequence, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    public static final Character lz(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    public static final <R> R m4ll(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q InterfaceC5979h<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iKt06 = fti.kt06(charSequence); iKt06 >= 0; iKt06--) {
            r2 = operation.invoke(Character.valueOf(charSequence.charAt(iKt06)), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <R> R mc(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        while (true) {
            if (i2 >= charSequence.length()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                break;
            }
            i2++;
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @InterfaceC7396q
    public static final C6227f<CharSequence, CharSequence> mho(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new C6227f<>(sb, sb2);
    }

    public static final int mn(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <K> kotlin.collections.d2ok<Character, K> mqs(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        return new C6437q(charSequence, keySelector);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Character mru(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R extends Comparable<? super R>> R mv(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <R> List<R> mwo2(@InterfaceC7396q CharSequence charSequence, int i2, int i3, boolean z2, @InterfaceC7396q cyoe.x2<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        C6171x.m22658k(i2, i3);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i3) + (length % i3 == 0 ? 0 : 1));
        int i4 = 0;
        while (true) {
            if (!(i4 >= 0 && i4 < length)) {
                break;
            }
            int i5 = i4 + i2;
            if (i5 < 0 || i5 > length) {
                if (!z2) {
                    break;
                }
                i5 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i4, i5)));
            i4 += i3;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Character> mzno(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? ume(charSequence) : kotlin.collections.zurt.ld6(Character.valueOf(charSequence.charAt(0))) : kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Character>> n2mu(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return new ncyb(new C6438y(charSequence));
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> n358(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final List<String> n9(@InterfaceC7396q CharSequence charSequence, int i2, int i3, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return mwo2(charSequence, i2, i3, z2, C6436n.INSTANCE);
    }

    @InterfaceC7396q
    public static final CharSequence nd(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <R> R ngvg(CharSequence charSequence, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C nm(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final C6227f<String, String> nr0(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "first.toString()");
        String string2 = sb2.toString();
        kotlin.jvm.internal.d2ok.kja0(string2, "second.toString()");
        return new C6227f<>(string, string2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final double nrcs(CharSequence charSequence, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character nrys(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static /* synthetic */ List o2(CharSequence charSequence, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return n9(charSequence, i2, i3, z2);
    }

    @InterfaceC7396q
    public static final CharSequence olj(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 >= 0) {
            return w0qe(charSequence, kotlin.ranges.fn3e.fn3e(charSequence.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int ox6n(CharSequence charSequence, cyoe.x2<? super Character, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return iIntValue;
    }

    public static char p1t5(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(fti.kt06(charSequence));
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character p2sg(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7395n
    public static final Character p68f(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long pb(CharSequence charSequence, cyoe.x2<? super Character, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            jLongValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).longValue();
        }
        return jLongValue;
    }

    public static final char pgi(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return cCharAt;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character ph5d(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7396q
    public static final CharSequence qe(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        kotlin.jvm.internal.d2ok.kja0(sbReverse, "StringBuilder(this).reverse()");
        return sbReverse;
    }

    @InterfaceC7395n
    public static final Character qm8(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Character chValueOf = null;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z2) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z2 = true;
            }
        }
        if (z2) {
            return chValueOf;
        }
        return null;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Character qspg(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final boolean qu9(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <R> List<R> qyk(@InterfaceC7396q CharSequence charSequence, int i2, @InterfaceC7396q cyoe.x2<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        return mwo2(charSequence, i2, i2, true, transform);
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double qyp(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final Float r8k(CharSequence charSequence, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M rb7(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final char rh(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @InterfaceC7396q
    public static final CharSequence rq(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iKt06 = fti.kt06(charSequence); -1 < iKt06; iKt06--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iKt06))).booleanValue()) {
                return charSequence.subSequence(0, iKt06 + 1);
            }
        }
        return "";
    }

    public static /* synthetic */ kotlin.sequences.qrj s9(CharSequence charSequence, int i2, int i3, boolean z2, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return fv(charSequence, i2, i3, z2, x2Var);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> s9de(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final CharSequence se2c(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? "" : fti.mkmm(charSequence, indices);
    }

    public static final char t0(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iKt06);
        for (int i2 = iKt06 - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char t57j(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <V, M extends Map<? super Character, ? super V>> M t8o(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final Character td(CharSequence charSequence, cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <V> Map<Character, V> te(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(charSequence.length(), 128)), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <R> List<R> thtw(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final List<Character> tn(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.ni7.a9();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i2 = 1; i2 < length; i2++) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final Character twzk(CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return fai(charSequence, i2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final char u3gu(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final double u4(CharSequence charSequence, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <R> R ue(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iKt06 = fti.kt06(charSequence); iKt06 >= 0; iKt06--) {
            r2 = operation.invoke(Integer.valueOf(iKt06), Character.valueOf(charSequence.charAt(iKt06)), r2);
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> uew(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Character> ume(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return (List) jcwh(charSequence, new ArrayList(charSequence.length()));
    }

    @InterfaceC7396q
    public static final Set<Character> un3l(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) jcwh(charSequence, new LinkedHashSet(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(charSequence.length(), 128)))) : i1.m22499g(Character.valueOf(charSequence.charAt(0))) : a98o.ld6();
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final char unv(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C vd(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <C extends Appendable> C vf(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static /* synthetic */ List vibj(CharSequence charSequence, int i2, int i3, boolean z2, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return mwo2(charSequence, i2, i3, z2, x2Var);
    }

    @InterfaceC6234g
    private static final Character w0(CharSequence charSequence, cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final CharSequence w0qe(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 >= 0) {
            return charSequence.subSequence(0, kotlin.ranges.fn3e.m23305t(i2, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final char w2bz(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    @InterfaceC7396q
    public static final <R> List<R> w6w4(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            C6163t.zp(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final HashSet<Character> w8(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return (HashSet) jcwh(charSequence, new HashSet(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(charSequence.length(), 128))));
    }

    @InterfaceC7396q
    public static final String wd(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                String strSubstring = str.substring(0, i2);
                kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    @InterfaceC7396q
    public static final CharSequence wqg(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @InterfaceC7396q
    public static final CharSequence wtm(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC7396q
    public static final <R> List<R> wutb(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    public static final char x0c(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iKt06);
        for (int i2 = iKt06 - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @InterfaceC6234g
    private static final int x8(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length();
    }

    @InterfaceC7396q
    public static final CharSequence xdxk(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iKt06 = fti.kt06(charSequence); -1 < iKt06; iKt06--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iKt06))).booleanValue()) {
                return charSequence.subSequence(iKt06 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean xknm(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <C extends Appendable> C xx(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character y76(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    @InterfaceC7396q
    public static final CharSequence y84(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @InterfaceC7396q
    public static final CharSequence yh8z(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        return sb;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <R> List<R> yl24(@InterfaceC7396q CharSequence charSequence, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final List<String> ym(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return n9(charSequence, i2, i2, true);
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Character>> ym8(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final String yn(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iKt06 = fti.kt06(str); -1 < iKt06; iKt06--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iKt06))).booleanValue()) {
                String strSubstring = str.substring(iKt06 + 1);
                kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final char z0(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7396q
    public static final CharSequence z1(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - kotlin.ranges.fn3e.m23305t(i2, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C zalf(CharSequence charSequence, C destination, InterfaceC5979h<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final Double zc(CharSequence charSequence, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, fti.kt06(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character zuh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iKt06);
        for (int i2 = iKt06 - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }
}
