package kotlin.text;

import kotlin.hb;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.t */
/* JADX INFO: compiled from: StringBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6455t extends wvg {
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: a */
    private static final StringBuilder m23617a(StringBuilder sb, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(c2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder a98o(StringBuilder sb) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use appendRange instead.", replaceWith = @hb(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    /* JADX INFO: renamed from: b */
    private static final StringBuilder m23618b(StringBuilder sb, char[] str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(str, "str");
        throw new kotlin.eqxt(null, 1, null);
    }

    @InterfaceC7396q
    public static final StringBuilder bf2(@InterfaceC7396q StringBuilder sb, @InterfaceC7396q Object... value) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        for (Object obj : value) {
            sb.append(obj);
        }
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder ch(StringBuilder sb, String str) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC7396q
    public static final StringBuilder i1(@InterfaceC7396q StringBuilder sb, @InterfaceC7396q String... value) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder lv5(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        sb.append(value);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder nmn5(StringBuilder sb, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(z2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final String t8iq(int i2, cyoe.x2<? super StringBuilder, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder(i2);
        builderAction.invoke(sb);
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: u */
    private static final String m23619u(cyoe.x2<? super StringBuilder, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder();
        builderAction.invoke(sb);
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: x */
    private static final StringBuilder m23620x(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use append(value: Any?) instead", replaceWith = @hb(expression = "append(value = obj)", imports = {}))
    private static final StringBuilder y9n(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.d2ok.kja0(sb, "this.append(obj)");
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder zp(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }
}
