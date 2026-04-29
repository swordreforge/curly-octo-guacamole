package androidx.window.core;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.mipush.sdk.C5658n;
import cyoe.InterfaceC5981k;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.d3;
import kotlin.fti;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.window.core.s */
/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB)\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/window/core/s;", "", "", "toString", C2690k.k.f61039ld6, "", "f7l8", "", "", "equals", "hashCode", "k", com.market.sdk.reflect.toq.f28131g, "ld6", "()I", "major", "q", "x2", "minor", "n", "qrj", "patch", C7704k.y.toq.f95579toq, "Ljava/lang/String;", "p", "()Ljava/lang/String;", "description", "Ljava/math/BigInteger;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/jk;", C7704k.y.toq.f44691k, "()Ljava/math/BigInteger;", "bigInteger", C4991s.f28129n, "(IIILjava/lang/String;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1311s implements Comparable<C1311s> {

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    private static final C1311s f7083i;

    /* JADX INFO: renamed from: t */
    @InterfaceC7396q
    private static final String f7086t = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* JADX INFO: renamed from: z */
    @InterfaceC7396q
    private static final C1311s f7087z;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final String f7088g;

    /* JADX INFO: renamed from: k */
    private final int f7089k;

    /* JADX INFO: renamed from: n */
    private final int f7090n;

    /* JADX INFO: renamed from: q */
    private final int f7091q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final jk f7092y;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final k f7085s = new k(null);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final C1311s f7084p = new C1311s(0, 0, 0, "");

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private static final C1311s f7082h = new C1311s(0, 1, 0, "");

    /* JADX INFO: renamed from: androidx.window.core.s$k */
    /* JADX INFO: compiled from: Version.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/core/s$k;", "", "", "versionString", "Landroidx/window/core/s;", "n", "UNKNOWN", "Landroidx/window/core/s;", "toq", "()Landroidx/window/core/s;", "VERSION_0_1", "zy", "VERSION_1_0", "q", "CURRENT", "k", "VERSION_PATTERN_STRING", "Ljava/lang/String;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C1311s m5597k() {
            return C1311s.f7087z;
        }

        @InterfaceC7395n
        @qrj
        /* JADX INFO: renamed from: n */
        public final C1311s m5598n(@InterfaceC7395n String str) {
            if (str == null || a9.m58i(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(C1311s.f7086t).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            d2ok.kja0(description, "description");
            return new C1311s(iIntValue, iIntValue2, iIntValue3, description, null);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C1311s m5599q() {
            return C1311s.f7083i;
        }

        @InterfaceC7396q
        public final C1311s toq() {
            return C1311s.f7084p;
        }

        @InterfaceC7396q
        public final C1311s zy() {
            return C1311s.f7082h;
        }
    }

    /* JADX INFO: renamed from: androidx.window.core.s$toq */
    /* JADX INFO: compiled from: Version.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6308r implements InterfaceC5981k<BigInteger> {
        toq() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        public final BigInteger invoke() {
            return BigInteger.valueOf(C1311s.this.ld6()).shiftLeft(32).or(BigInteger.valueOf(C1311s.this.x2())).shiftLeft(32).or(BigInteger.valueOf(C1311s.this.qrj()));
        }
    }

    static {
        C1311s c1311s = new C1311s(1, 0, 0, "");
        f7083i = c1311s;
        f7087z = c1311s;
    }

    private C1311s(int i2, int i3, int i4, String str) {
        this.f7089k = i2;
        this.f7091q = i3;
        this.f7090n = i4;
        this.f7088g = str;
        this.f7092y = fti.m22825k(new toq());
    }

    public /* synthetic */ C1311s(int i2, int i3, int i4, String str, ni7 ni7Var) {
        this(i2, i3, i4, str);
    }

    @InterfaceC7395n
    @qrj
    public static final C1311s n7h(@InterfaceC7395n String str) {
        return f7085s.m5598n(str);
    }

    /* JADX INFO: renamed from: s */
    private final BigInteger m5595s() {
        Object value = this.f7092y.getValue();
        d2ok.kja0(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (!(obj instanceof C1311s)) {
            return false;
        }
        C1311s c1311s = (C1311s) obj;
        return this.f7089k == c1311s.f7089k && this.f7091q == c1311s.f7091q && this.f7090n == c1311s.f7090n;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC7396q C1311s other) {
        d2ok.m23075h(other, "other");
        return m5595s().compareTo(other.m5595s());
    }

    public int hashCode() {
        return ((((527 + this.f7089k) * 31) + this.f7091q) * 31) + this.f7090n;
    }

    public final int ld6() {
        return this.f7089k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final String m5596p() {
        return this.f7088g;
    }

    public final int qrj() {
        return this.f7090n;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f7089k + '.' + this.f7091q + '.' + this.f7090n + (a9.m58i(this.f7088g) ^ true ? d2ok.mcp(C5658n.f73185t8r, this.f7088g) : "");
    }

    public final int x2() {
        return this.f7091q;
    }
}
