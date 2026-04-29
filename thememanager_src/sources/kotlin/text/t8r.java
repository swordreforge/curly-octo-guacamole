package kotlin.text;

import androidx.exifinterface.media.C0846k;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C6163t;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"})
public final class t8r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.text.t8r$k */
    /* JADX INFO: compiled from: Regex.kt */
    @lv5({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    static final class C6456k<T> extends AbstractC6308r implements cyoe.x2<T, Boolean> {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6456k(int i2) {
            super(1);
            this.$value = i2;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(Enum r3) {
            InterfaceC6454s interfaceC6454s = (InterfaceC6454s) r3;
            return Boolean.valueOf((this.$value & interfaceC6454s.getMask()) == interfaceC6454s.getValue());
        }
    }

    private static final /* synthetic */ <T extends Enum<T> & InterfaceC6454s> Set<T> f7l8(int i2) {
        kotlin.jvm.internal.d2ok.m23086z(4, C0846k.zaso);
        EnumSet fromInt$lambda$1 = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.d2ok.kja0(fromInt$lambda$1, "fromInt$lambda$1");
        kotlin.jvm.internal.d2ok.ni7();
        C6163t.gbni(fromInt$lambda$1, new C6456k(i2));
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        kotlin.jvm.internal.d2ok.kja0(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return setUnmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC6439h m23621g(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new cdj(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ld6(Iterable<? extends InterfaceC6454s> iterable) {
        Iterator<? extends InterfaceC6454s> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final kotlin.ranges.x2 m23624p(MatchResult matchResult, int i2) {
        return kotlin.ranges.fn3e.nme(matchResult.start(i2), matchResult.end(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final kotlin.ranges.x2 m23626s(MatchResult matchResult) {
        return kotlin.ranges.fn3e.nme(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC6439h m23627y(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new cdj(matcher, charSequence);
        }
        return null;
    }
}
