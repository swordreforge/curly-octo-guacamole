package kotlin.text;

import java.io.IOException;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 {
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    /* JADX INFO: renamed from: g */
    public static final <T extends Appendable> T m23582g(@InterfaceC7396q T t2, @InterfaceC7396q CharSequence value, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(t2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        T t3 = (T) t2.append(value, i2, i3);
        kotlin.jvm.internal.d2ok.n7h(t3, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t3;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T extends Appendable> T m23583k(@InterfaceC7396q T t2, @InterfaceC7396q CharSequence... value) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(t2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        for (CharSequence charSequence : value) {
            t2.append(charSequence);
        }
        return t2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: n */
    private static final Appendable m23584n(Appendable appendable, CharSequence charSequence) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        kotlin.jvm.internal.d2ok.kja0(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: q */
    private static final Appendable m23585q(Appendable appendable, char c2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c2);
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        kotlin.jvm.internal.d2ok.kja0(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void toq(@InterfaceC7396q Appendable appendable, T t2, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        if (x2Var != null) {
            appendable.append(x2Var.invoke(t2));
            return;
        }
        if (t2 == 0 ? true : t2 instanceof CharSequence) {
            appendable.append((CharSequence) t2);
        } else if (t2 instanceof Character) {
            appendable.append(((Character) t2).charValue());
        } else {
            appendable.append(String.valueOf(t2));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final Appendable zy(Appendable appendable) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append('\\n')");
        return appendableAppend;
    }
}
