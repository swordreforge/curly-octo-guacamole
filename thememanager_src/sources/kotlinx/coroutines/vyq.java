package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Debug.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0081\b\"\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\r\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/was;", C7704k.y.toq.f95579toq, "Lkotlin/Function0;", "", "value", "k", "", "Ljava/lang/String;", "DEBUG_PROPERTY_NAME", "toq", "STACKTRACE_RECOVERY_PROPERTY_NAME", "zy", "DEBUG_PROPERTY_VALUE_AUTO", "q", "DEBUG_PROPERTY_VALUE_ON", "n", "DEBUG_PROPERTY_VALUE_OFF", com.market.sdk.reflect.toq.f68929toq, "()Z", "ASSERTIONS_ENABLED", "f7l8", "DEBUG", AnimatedProperty.PROPERTY_NAME_Y, "RECOVER_STACK_TRACES", "Ljava/util/concurrent/atomic/AtomicLong;", C7704k.y.toq.f44691k, "Ljava/util/concurrent/atomic/AtomicLong;", "()Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class vyq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f82083f7l8;

    /* JADX INFO: renamed from: g */
    private static final boolean f37473g = false;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final String f37474k = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final String f37475n = "off";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final String f37476q = "on";

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final AtomicLong f37477s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f82084toq = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: y */
    private static final boolean f37478y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f82085zy = "auto";

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r0.equals(kotlinx.coroutines.vyq.f37476q) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.hyr.m24350q(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L63
            int r3 = r0.hashCode()
            if (r3 == 0) goto L39
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L30
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L43
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L30:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L41
        L39:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
        L41:
            r0 = r1
            goto L64
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L63:
            r0 = r2
        L64:
            kotlinx.coroutines.vyq.f82083f7l8 = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.hyr.m24349n(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            kotlinx.coroutines.vyq.f37478y = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.vyq.f37477s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.vyq.<clinit>():void");
    }

    /* JADX INFO: renamed from: g */
    public static final void m24639g() {
        f37477s.set(0L);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final void m24640k(InterfaceC5981k<Boolean> interfaceC5981k) {
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m24641n() {
        return f37478y;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m24642q() {
        return f82083f7l8;
    }

    public static final boolean toq() {
        return f37473g;
    }

    @InterfaceC7396q
    public static final AtomicLong zy() {
        return f37477s;
    }
}
