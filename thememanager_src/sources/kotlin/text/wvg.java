package kotlin.text;

import java.io.IOException;
import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
class wvg extends o1t {
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder a9(StringBuilder sb, CharSequence value, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        sb.append(value, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: c */
    private static final StringBuilder m23629c(StringBuilder sb, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((int) s2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value.toInt())");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder d2ok(StringBuilder sb, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(c2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final Appendable d3(Appendable appendable, CharSequence charSequence) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append(value)");
        return jp0y(appendableAppend);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder dd(StringBuilder sb, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(i2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: e */
    private static final StringBuilder m23630e(StringBuilder sb, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i2);
        kotlin.jvm.internal.d2ok.kja0(sbDeleteCharAt, "this.deleteCharAt(index)");
        return sbDeleteCharAt;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final void ek5k(StringBuilder sb, char[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        sb.getChars(i3, i4, destination, i2);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder eqxt(StringBuilder sb, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((int) b2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value.toInt())");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: f */
    private static final StringBuilder m23631f(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder fti(StringBuilder sb, char[] value, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        sb.append(value, i2, i3 - i2);
        kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder fu4(StringBuilder sb, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(d2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final Appendable gvn7(Appendable appendable, char c2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c2);
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append(value)");
        return jp0y(appendableAppend);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder hb(StringBuilder sb, int i2, CharSequence value, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        StringBuilder sbInsert = sb.insert(i2, value, i3, i4);
        kotlin.jvm.internal.d2ok.kja0(sbInsert, "this.insert(index, value, startIndex, endIndex)");
        return sbInsert;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder hyr(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: j */
    private static final StringBuilder m23632j(StringBuilder sb, int i2, char[] value, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        StringBuilder sbInsert = sb.insert(i2, value, i3, i4 - i3);
        kotlin.jvm.internal.d2ok.kja0(sbInsert, "this.insert(index, value…x, endIndex - startIndex)");
        return sbInsert;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder jk(StringBuilder sb, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((int) s2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine()", imports = {}))
    public static final Appendable jp0y(@InterfaceC7396q Appendable appendable) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(appendable, "<this>");
        Appendable appendableAppend = appendable.append(d3.f81888toq);
        kotlin.jvm.internal.d2ok.kja0(appendableAppend, "append(SystemProperties.LINE_SEPARATOR)");
        return appendableAppend;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: l */
    private static final StringBuilder m23633l(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder lrht(StringBuilder sb, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(z2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder lvui(StringBuilder sb, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(d2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: m */
    private static final StringBuilder m23634m(StringBuilder sb, int i2, int i3, String value) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        StringBuilder sbReplace = sb.replace(i2, i3, value);
        kotlin.jvm.internal.d2ok.kja0(sbReplace, "this.replace(startIndex, endIndex, value)");
        return sbReplace;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder mcp(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder n5r1(StringBuilder sb, String str) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder ncyb(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder ni7(StringBuilder sb, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append((int) b2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder nn86(StringBuilder sb, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        StringBuilder sbDelete = sb.delete(i2, i3);
        kotlin.jvm.internal.d2ok.kja0(sbDelete, "this.delete(startIndex, endIndex)");
        return sbDelete;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: o */
    private static final void m23635o(StringBuilder sb, int i2, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.setCharAt(i2, c2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder o1t(StringBuilder sb, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(i2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine()", imports = {}))
    public static final StringBuilder oc(@InterfaceC7396q StringBuilder sb) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(d3.f81888toq);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: r */
    private static final StringBuilder m23636r(StringBuilder sb, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(f2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: t */
    private static final StringBuilder m23637t(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder uv6(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        sb.append(value);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final StringBuilder vyq(@InterfaceC7396q StringBuilder sb) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final StringBuilder wvg(StringBuilder sb, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(j2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @hb(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder x9kr(StringBuilder sb, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(j2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        return oc(sb);
    }

    static /* synthetic */ void yz(StringBuilder sb, char[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = sb.length();
        }
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        sb.getChars(i3, i4, destination, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: z */
    private static final StringBuilder m23638z(StringBuilder sb, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(sb, "<this>");
        sb.append(f2);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        return sb;
    }
}
