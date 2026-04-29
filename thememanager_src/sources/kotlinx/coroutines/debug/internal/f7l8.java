package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.market.sdk.utils.C5019y;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.at;
import com.xiaomi.onetrack.p013b.C5717e;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C6227f;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.collections.C6140e;
import kotlin.collections.C6144h;
import kotlin.collections.a9;
import kotlin.collections.fu4;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.d2ok;
import kotlin.nmn5;
import kotlin.sequences.fn3e;
import kotlin.text.eqxt;
import kotlin.was;
import kotlin.wvg;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.etdu;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.hyr;
import kotlinx.coroutines.internal.C6690r;
import kotlinx.coroutines.internal.ncyb;
import kotlinx.coroutines.ltg8;
import kotlinx.coroutines.n5r1;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B\n\b\u0002¢\u0006\u0005\b\u0097\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b@\u0010AJ/\u0010C\u001a\u00020\u00042\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bE\u0010FJ\u001a\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u0004\u0018\u00010I*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bJ\u0010KJ3\u0010N\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020\u00042\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bP\u0010QJ'\u0010T\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010L*\u00020R2\u0006\u0010S\u001a\u00028\u0000H\u0002¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\bJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\bJ\u0015\u0010Y\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\n¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\u001a¢\u0006\u0004\ba\u0010bJ\u0013\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u001a¢\u0006\u0004\bd\u0010bJ\u0015\u0010e\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\be\u0010$J)\u0010f\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010^\u001a\u00020]2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bj\u0010iJ)\u0010k\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010tR$\u0010x\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010wR\u0016\u0010y\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010|R&\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b\u001b\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0086\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b#\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R$\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u0087\u0001R!\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010wR\"\u0010\u008d\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\"\u0010\u0091\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008e\u0001\u0010ZR\u001b\u0010\u0094\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0080\u0001¨\u0006\u0099\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/f7l8;", "", "Lkotlin/Function1;", "", "Lkotlin/was;", "i", "()Lcyoe/x2;", "lvui", "()V", "r", "Lkotlinx/coroutines/gbni;", "", "Lkotlinx/coroutines/debug/internal/n;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "q", "(Lkotlinx/coroutines/gbni;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/f7l8$k;", "Lkotlin/coroutines/f7l8;", "create", "", C7704k.y.toq.f44691k, "(Lcyoe/h;)Ljava/util/List;", "x9kr", "(Ljava/lang/Object;)Ljava/lang/String;", "z", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)Z", "Ljava/io/PrintStream;", "out", "p", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "jk", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n7h", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/f;", "kja0", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/f;", "frameIndex", AnimatedProperty.PROPERTY_NAME_H, "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/q;", zurt.InterfaceC0290k.f47402d2ok, "n5r1", "(Lkotlin/coroutines/q;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/n;", C5717e.f31929a, "(Lkotlin/coroutines/jvm/internal/n;Ljava/lang/String;)V", "d3", "(Lkotlin/coroutines/jvm/internal/n;)Lkotlin/coroutines/jvm/internal/n;", "owner", "hyr", "(Lkotlinx/coroutines/debug/internal/f7l8$k;Lkotlin/coroutines/q;Ljava/lang/String;)V", "t", "(Lkotlin/coroutines/q;)Lkotlinx/coroutines/debug/internal/f7l8$k;", "mcp", "(Lkotlin/coroutines/jvm/internal/n;)Lkotlinx/coroutines/debug/internal/f7l8$k;", "Lkotlinx/coroutines/debug/internal/qrj;", "dd", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/qrj;", C0846k.zaso, "completion", "n", "(Lkotlin/coroutines/q;Lkotlinx/coroutines/debug/internal/qrj;)Lkotlin/coroutines/q;", "a9", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)V", "", "throwable", "oc", "(Ljava/lang/Throwable;)Ljava/util/List;", "fu4", "ncyb", at.f31711e, "ni7", "(Lkotlinx/coroutines/gbni;)Ljava/lang/String;", AnimatedProperty.PROPERTY_NAME_Y, "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/q;", C5019y.f69035jk, "qrj", "(Lkotlinx/coroutines/debug/internal/q;)Ljava/lang/String;", "f7l8", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/p;", "ld6", C7704k.y.toq.f95579toq, "x2", "(Lkotlinx/coroutines/debug/internal/q;Ljava/util/List;)Ljava/util/List;", "jp0y", "(Lkotlin/coroutines/q;)V", "gvn7", "fti", "(Lkotlin/coroutines/q;)Lkotlin/coroutines/q;", "toq", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "zy", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/toq;", "Lkotlinx/coroutines/debug/internal/toq;", "capturedCoroutinesMap", "installations", com.market.sdk.reflect.toq.f28131g, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", com.market.sdk.reflect.toq.f68929toq, "zurt", "()Z", "d2ok", "(Z)V", "sanitizeStackTraces", "fn3e", "eqxt", "enableCreationStackTraces", "Lcyoe/x2;", "dynamicAttach", "callerInfoCache", "", "cdj", "()Ljava/util/Set;", "capturedCoroutines", "ki", "getDebugString$annotations", "(Lkotlinx/coroutines/gbni;)V", "debugString", "wvg", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "o1t", "isInstalled", C4991s.f28129n, "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f81967f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final /* synthetic */ C6550y f36883g;
    private static volatile int installations = 0;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final f7l8 f36884k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7395n
    private static final cyoe.x2<Boolean, was> f81968ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final kotlinx.coroutines.debug.internal.toq<C6537k<?>, Boolean> f36885n;

    /* JADX INFO: renamed from: p */
    private static boolean f36886p = false;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private static Thread f36887q = null;

    /* JADX INFO: renamed from: s */
    private static boolean f36888s = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f81969toq = "Coroutine creation stacktrace";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private static final kotlinx.coroutines.debug.internal.toq<InterfaceC6207n, C6543n> f81970x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final ReentrantReadWriteLock f36889y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final SimpleDateFormat f81971zy;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$f7l8, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/f7l8$k;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/f7l8$zy", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C8070f7l8 extends AbstractC6308r implements cyoe.x2<C6537k<?>, C6544p> {
        public C8070f7l8() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final C6544p invoke(@InterfaceC7396q C6537k<?> c6537k) {
            kotlin.coroutines.f7l8 f7l8VarZy;
            if (f7l8.f36884k.m24010z(c6537k) || (f7l8VarZy = c6537k.f36892q.zy()) == null) {
                return null;
            }
            return new C6544p(c6537k.f36892q, f7l8VarZy);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {C0846k.zaso, "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/f7l8$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6536g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            return kotlin.comparisons.f7l8.x2(Long.valueOf(((C6537k) t2).f36892q.f81975toq), Long.valueOf(((C6537k) t3).f36892q.f81975toq));
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$k */
    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/f7l8$k;", C0846k.zaso, "Lkotlin/coroutines/q;", "Lkotlin/coroutines/jvm/internal/n;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/o;", "result", "Lkotlin/was;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "k", "Lkotlin/coroutines/q;", "delegate", "Lkotlinx/coroutines/debug/internal/n;", "q", "Lkotlinx/coroutines/debug/internal/n;", C5019y.f69035jk, "n", "Lkotlin/coroutines/jvm/internal/n;", zurt.InterfaceC0290k.f47402d2ok, "Lkotlin/coroutines/f7l8;", "getContext", "()Lkotlin/coroutines/f7l8;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", C4991s.f28129n, "(Lkotlin/coroutines/q;Lkotlinx/coroutines/debug/internal/n;Lkotlin/coroutines/jvm/internal/n;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6537k<T> implements InterfaceC6216q<T>, InterfaceC6207n {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC6216q<T> f36890k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private final InterfaceC6207n f36891n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6543n f36892q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6537k(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, @InterfaceC7396q C6543n c6543n, @InterfaceC7395n InterfaceC6207n interfaceC6207n) {
            this.f36890k = interfaceC6216q;
            this.f36892q = c6543n;
            this.f36891n = interfaceC6207n;
        }

        @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
        @InterfaceC7395n
        public InterfaceC6207n getCallerFrame() {
            InterfaceC6207n interfaceC6207n = this.f36891n;
            if (interfaceC6207n == null) {
                return null;
            }
            return interfaceC6207n.getCallerFrame();
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        @InterfaceC7396q
        public kotlin.coroutines.f7l8 getContext() {
            return this.f36890k.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
        @InterfaceC7395n
        public StackTraceElement getStackTraceElement() {
            InterfaceC6207n interfaceC6207n = this.f36891n;
            if (interfaceC6207n == null) {
                return null;
            }
            return interfaceC6207n.getStackTraceElement();
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        public void resumeWith(@InterfaceC7396q Object obj) {
            f7l8.f36884k.a9(this);
            this.f36890k.resumeWith(obj);
        }

        @InterfaceC7396q
        public String toString() {
            return this.f36890k.toString();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$n */
    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/f7l8$k;", "it", "", "invoke", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)Ljava/lang/Boolean;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6538n extends AbstractC6308r implements cyoe.x2<C6537k<?>, Boolean> {
        public static final C6538n INSTANCE = new C6538n();

        C6538n() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q C6537k<?> c6537k) {
            return Boolean.valueOf(!f7l8.f36884k.m24010z(c6537k));
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$q */
    /* JADX INFO: compiled from: Comparisons.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {C0846k.zaso, "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/f7l8$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6539q<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            return kotlin.comparisons.f7l8.x2(Long.valueOf(((C6537k) t2).f36892q.f81975toq), Long.valueOf(((C6537k) t3).f36892q.f81975toq));
        }
    }

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/f7l8$k;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/f7l8$zy", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements cyoe.x2<C6537k<?>, C6545q> {
        public toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final C6545q invoke(@InterfaceC7396q C6537k<?> c6537k) {
            kotlin.coroutines.f7l8 f7l8VarZy;
            if (f7l8.f36884k.m24010z(c6537k) || (f7l8VarZy = c6537k.f36892q.zy()) == null) {
                return null;
            }
            return new C6545q(c6537k.f36892q, f7l8VarZy);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f7l8$y */
    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6540y extends AbstractC6308r implements InterfaceC5981k<was> {
        public static final C6540y INSTANCE = new C6540y();

        C6540y() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f7l8.f81970x2.n7h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/f7l8$k;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/f7l8$k;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy<R> extends AbstractC6308r implements cyoe.x2<C6537k<?>, R> {
        final /* synthetic */ InterfaceC5979h<C6537k<?>, kotlin.coroutines.f7l8, R> $create;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public zy(InterfaceC5979h<? super C6537k<?>, ? super kotlin.coroutines.f7l8, ? extends R> interfaceC5979h) {
            super(1);
            this.$create = interfaceC5979h;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final R invoke(@InterfaceC7396q C6537k<?> c6537k) {
            kotlin.coroutines.f7l8 f7l8VarZy;
            if (f7l8.f36884k.m24010z(c6537k) || (f7l8VarZy = c6537k.f36892q.zy()) == null) {
                return null;
            }
            return this.$create.invoke(c6537k, f7l8VarZy);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.y] */
    static {
        f7l8 f7l8Var = new f7l8();
        f36884k = f7l8Var;
        f81971zy = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f36885n = new kotlinx.coroutines.debug.internal.toq<>(false, 1, null);
        final long j2 = 0;
        f36883g = new Object(j2) { // from class: kotlinx.coroutines.debug.internal.y
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j2;
            }
        };
        f36889y = new ReentrantReadWriteLock();
        f36888s = true;
        f36886p = true;
        f81968ld6 = f7l8Var.m24001i();
        f81970x2 = new kotlinx.coroutines.debug.internal.toq<>(true);
        f81967f7l8 = AtomicLongFieldUpdater.newUpdater(C6550y.class, "sequenceNumber");
    }

    private f7l8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a9(C6537k<?> c6537k) {
        f36885n.remove(c6537k);
        InterfaceC6207n interfaceC6207nM24015g = c6537k.f36892q.m24015g();
        InterfaceC6207n interfaceC6207nD3 = interfaceC6207nM24015g == null ? null : d3(interfaceC6207nM24015g);
        if (interfaceC6207nD3 == null) {
            return;
        }
        f81970x2.remove(interfaceC6207nD3);
    }

    private final Set<C6537k<?>> cdj() {
        return f36885n.keySet();
    }

    private final InterfaceC6207n d3(InterfaceC6207n interfaceC6207n) {
        do {
            interfaceC6207n = interfaceC6207n.getCallerFrame();
            if (interfaceC6207n == null) {
                return null;
            }
        } while (interfaceC6207n.getStackTraceElement() == null);
        return interfaceC6207n;
    }

    private final qrj dd(List<StackTraceElement> list) {
        qrj qrjVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                qrjVar = new qrj(qrjVar, listIterator.previous());
            }
        }
        return qrjVar;
    }

    /* JADX INFO: renamed from: h */
    private final int m24000h(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) C6144h.b0(stackTraceElementArr, i2);
        if (stackTraceElement == null) {
            return -1;
        }
        int i3 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (d2ok.f7l8(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && d2ok.f7l8(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && d2ok.f7l8(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private final void hyr(C6537k<?> c6537k, InterfaceC6216q<?> interfaceC6216q, String str) {
        ReentrantReadWriteLock.ReadLock lock = f36889y.readLock();
        lock.lock();
        try {
            if (f36884k.o1t()) {
                c6537k.f36892q.m24017p(str, interfaceC6216q);
                was wasVar = was.f36763k;
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    private final cyoe.x2<Boolean, was> m24001i() {
        Object objM28280constructorimpl;
        Object objNewInstance;
        try {
            C6323o.k kVar = C6323o.Companion;
            objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        if (objNewInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        }
        objM28280constructorimpl = C6323o.m28280constructorimpl((cyoe.x2) bo.cdj(objNewInstance, 1));
        if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
            objM28280constructorimpl = null;
        }
        return (cyoe.x2) objM28280constructorimpl;
    }

    private final void jk(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print(d2ok.mcp("\n\tat ", (StackTraceElement) it.next()));
        }
    }

    private final String ki(gbni gbniVar) {
        return gbniVar instanceof etdu ? ((etdu) gbniVar).bek6() : gbniVar.toString();
    }

    private final C6227f<Integer, Integer> kja0(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        int i3 = 0;
        while (i3 < 3) {
            int i4 = i3 + 1;
            int iM24000h = f36884k.m24000h((i2 - 1) - i3, stackTraceElementArr, list);
            if (iM24000h != -1) {
                return nmn5.m23230k(Integer.valueOf(iM24000h), Integer.valueOf(i3));
            }
            i3 = i4;
        }
        return nmn5.m23230k(-1, 0);
    }

    /* JADX INFO: renamed from: l */
    private final void m24003l(InterfaceC6207n interfaceC6207n, String str) {
        ReentrantReadWriteLock.ReadLock lock = f36889y.readLock();
        lock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (f7l8Var.o1t()) {
                kotlinx.coroutines.debug.internal.toq<InterfaceC6207n, C6543n> toqVar = f81970x2;
                C6543n c6543nRemove = toqVar.remove(interfaceC6207n);
                if (c6543nRemove == null) {
                    C6537k<?> c6537kMcp = f7l8Var.mcp(interfaceC6207n);
                    InterfaceC6207n interfaceC6207nD3 = null;
                    c6543nRemove = c6537kMcp == null ? null : c6537kMcp.f36892q;
                    if (c6543nRemove == null) {
                        return;
                    }
                    InterfaceC6207n interfaceC6207nM24015g = c6543nRemove.m24015g();
                    if (interfaceC6207nM24015g != null) {
                        interfaceC6207nD3 = f7l8Var.d3(interfaceC6207nM24015g);
                    }
                    if (interfaceC6207nD3 != null) {
                        toqVar.remove(interfaceC6207nD3);
                    }
                }
                c6543nRemove.m24017p(str, (InterfaceC6216q) interfaceC6207n);
                InterfaceC6207n interfaceC6207nD32 = f7l8Var.d3(interfaceC6207n);
                if (interfaceC6207nD32 == null) {
                    return;
                }
                toqVar.put(interfaceC6207nD32, c6543nRemove);
                was wasVar = was.f36763k;
            }
        } finally {
            lock.unlock();
        }
    }

    private final void lvui() {
        f36887q = kotlin.concurrent.toq.zy(false, true, null, "Coroutines Debugger Cleaner", 0, C6540y.INSTANCE, 21, null);
    }

    private final C6537k<?> mcp(InterfaceC6207n interfaceC6207n) {
        while (!(interfaceC6207n instanceof C6537k)) {
            interfaceC6207n = interfaceC6207n.getCallerFrame();
            if (interfaceC6207n == null) {
                return null;
            }
        }
        return (C6537k) interfaceC6207n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    private final <T> InterfaceC6216q<T> m24004n(InterfaceC6216q<? super T> interfaceC6216q, qrj qrjVar) {
        if (!o1t()) {
            return interfaceC6216q;
        }
        C6537k<?> c6537k = new C6537k<>(interfaceC6216q, new C6543n(interfaceC6216q.getContext(), qrjVar, f81967f7l8.incrementAndGet(f36883g)), qrjVar);
        kotlinx.coroutines.debug.internal.toq<C6537k<?>, Boolean> toqVar = f36885n;
        toqVar.put(c6537k, Boolean.TRUE);
        if (!o1t()) {
            toqVar.clear();
        }
        return c6537k;
    }

    private final void n5r1(InterfaceC6216q<?> interfaceC6216q, String str) {
        if (o1t()) {
            if (d2ok.f7l8(str, C6541g.f81972toq) && wvg.f36764p.m23802s(1, 3, 30)) {
                InterfaceC6207n interfaceC6207n = interfaceC6216q instanceof InterfaceC6207n ? (InterfaceC6207n) interfaceC6216q : null;
                if (interfaceC6207n == null) {
                    return;
                }
                m24003l(interfaceC6207n, str);
                return;
            }
            C6537k<?> c6537kM24009t = m24009t(interfaceC6216q);
            if (c6537kM24009t == null) {
                return;
            }
            hyr(c6537kM24009t, interfaceC6216q, str);
        }
    }

    private final List<StackTraceElement> n7h(String str, Thread thread, List<StackTraceElement> list) {
        Object objM28280constructorimpl;
        if (!d2ok.f7l8(str, C6541g.f81972toq) || thread == null) {
            return list;
        }
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
            objM28280constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM28280constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (d2ok.f7l8(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && d2ok.f7l8(stackTraceElement.getMethodName(), "resumeWith") && d2ok.f7l8(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i2 = i3;
        }
        C6227f<Integer, Integer> c6227fKja0 = kja0(i2, stackTraceElementArr, list);
        int iIntValue = c6227fKja0.component1().intValue();
        int iIntValue2 = c6227fKja0.component2().intValue();
        if (iIntValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i2) - iIntValue) - 1) - iIntValue2);
        int i4 = i2 - iIntValue2;
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(stackTraceElementArr[i5]);
        }
        int size = list.size();
        for (int i6 = iIntValue + 1; i6 < size; i6++) {
            arrayList.add(list.get(i6));
        }
        return arrayList;
    }

    private final <T extends Throwable> List<StackTraceElement> oc(T t2) {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (d2ok.f7l8(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i2 = length2;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length2 = i3;
            }
        }
        if (!f36888s) {
            int i4 = length - i2;
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                arrayList.add(i5 == 0 ? ncyb.m24380q(f81969toq) : stackTrace[i5 + i2]);
                i5 = i6;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i2) + 1);
        arrayList2.add(ncyb.m24380q(f81969toq));
        while (true) {
            i2++;
            while (i2 < length) {
                if (wvg(stackTrace[i2])) {
                    arrayList2.add(stackTrace[i2]);
                    int i7 = i2 + 1;
                    while (i7 < length && wvg(stackTrace[i7])) {
                        i7++;
                    }
                    int i8 = i7 - 1;
                    int i9 = i8;
                    while (i9 > i2 && stackTrace[i9].getFileName() == null) {
                        i9--;
                    }
                    if (i9 > i2 && i9 < i8) {
                        arrayList2.add(stackTrace[i9]);
                    }
                    arrayList2.add(stackTrace[i8]);
                    i2 = i7;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i2]);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m24005p(PrintStream printStream) {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (!f7l8Var.o1t()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print(d2ok.mcp("Coroutines dump ", f81971zy.format(Long.valueOf(System.currentTimeMillis()))));
            for (C6537k c6537k : fn3e.ovdh(fn3e.ch(a9.ebn(f7l8Var.cdj()), C6538n.INSTANCE), new C6536g())) {
                C6543n c6543n = c6537k.f36892q;
                List<StackTraceElement> listM24020y = c6543n.m24020y();
                f7l8 f7l8Var2 = f36884k;
                List<StackTraceElement> listN7h = f7l8Var2.n7h(c6543n.f7l8(), c6543n.f36898n, listM24020y);
                printStream.print("\n\nCoroutine " + c6537k.f36890k + ", state: " + ((d2ok.f7l8(c6543n.f7l8(), C6541g.f81972toq) && listN7h == listM24020y) ? d2ok.mcp(c6543n.f7l8(), " (Last suspension stacktrace, not an actual stacktrace)") : c6543n.f7l8()));
                if (listM24020y.isEmpty()) {
                    printStream.print(d2ok.mcp("\n\tat ", ncyb.m24380q(f81969toq)));
                    f7l8Var2.jk(printStream, c6543n.m24016n());
                } else {
                    f7l8Var2.jk(printStream, listN7h);
                }
            }
            was wasVar = was.f36763k;
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m24006q(gbni gbniVar, Map<gbni, C6543n> map, StringBuilder sb, String str) {
        C6543n c6543n = map.get(gbniVar);
        if (c6543n != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) a9.kbj(c6543n.m24020y());
            sb.append(str + ki(gbniVar) + ", continuation is " + c6543n.f7l8() + " at line " + stackTraceElement + '\n');
            str = d2ok.mcp(str, "\t");
        } else if (!(gbniVar instanceof C6690r)) {
            sb.append(str + ki(gbniVar) + '\n');
            str = d2ok.mcp(str, "\t");
        }
        Iterator<gbni> it = gbniVar.wvg().iterator();
        while (it.hasNext()) {
            m24006q(it.next(), map, sb, str);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m24007r() throws InterruptedException {
        Thread thread = f36887q;
        if (thread == null) {
            return;
        }
        f36887q = null;
        thread.interrupt();
        thread.join();
    }

    /* JADX INFO: renamed from: s */
    private final <R> List<R> m24008s(InterfaceC5979h<? super C6537k<?>, ? super kotlin.coroutines.f7l8, ? extends R> interfaceC5979h) {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (f7l8Var.o1t()) {
                return fn3e.nyj(fn3e.mbx(fn3e.ovdh(a9.ebn(f7l8Var.cdj()), new C6539q()), new zy(interfaceC5979h)));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: t */
    private final C6537k<?> m24009t(InterfaceC6216q<?> interfaceC6216q) {
        InterfaceC6207n interfaceC6207n = interfaceC6216q instanceof InterfaceC6207n ? (InterfaceC6207n) interfaceC6216q : null;
        if (interfaceC6207n == null) {
            return null;
        }
        return mcp(interfaceC6207n);
    }

    private static /* synthetic */ void t8r(gbni gbniVar) {
    }

    private final boolean wvg(StackTraceElement stackTraceElement) {
        return kotlin.text.a9.r6ty(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final String x9kr(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(eqxt.f81913toq);
        sb.append(obj);
        sb.append(eqxt.f81913toq);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final boolean m24010z(C6537k<?> c6537k) {
        kotlin.coroutines.f7l8 f7l8VarZy = c6537k.f36892q.zy();
        gbni gbniVar = f7l8VarZy == null ? null : (gbni) f7l8VarZy.get(gbni.ygy);
        if (gbniVar == null || !gbniVar.mo24059p()) {
            return false;
        }
        f36885n.remove(c6537k);
        return true;
    }

    public final void d2ok(boolean z2) {
        f36888s = z2;
    }

    public final void eqxt(boolean z2) {
        f36886p = z2;
    }

    @InterfaceC7396q
    public final List<C6545q> f7l8() {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (f7l8Var.o1t()) {
                return fn3e.nyj(fn3e.mbx(fn3e.ovdh(a9.ebn(f7l8Var.cdj()), new C6539q()), new toq()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    public final boolean fn3e() {
        return f36886p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public final <T> InterfaceC6216q<T> fti(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        if (o1t() && m24009t(interfaceC6216q) == null) {
            return m24004n(interfaceC6216q, f36886p ? dd(oc(new Exception())) : null);
        }
        return interfaceC6216q;
    }

    public final void fu4() {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                return;
            }
            f36884k.lvui();
            if (C6542k.f36894k.m24013k()) {
                while (i2 < readHoldCount) {
                    i2++;
                    lock.lock();
                }
                writeLock.unlock();
                return;
            }
            cyoe.x2<Boolean, was> x2Var = f81968ld6;
            if (x2Var != null) {
                x2Var.invoke(Boolean.TRUE);
            }
            was wasVar = was.f36763k;
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m24011g(@InterfaceC7396q PrintStream printStream) {
        synchronized (printStream) {
            f36884k.m24005p(printStream);
            was wasVar = was.f36763k;
        }
    }

    public final void gvn7(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        n5r1(interfaceC6216q, C6541g.f81973zy);
    }

    public final void jp0y(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        n5r1(interfaceC6216q, C6541g.f81972toq);
    }

    @InterfaceC7396q
    public final List<C6544p> ld6() {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (f7l8Var.o1t()) {
                return fn3e.nyj(fn3e.mbx(fn3e.ovdh(a9.ebn(f7l8Var.cdj()), new C6539q()), new C8070f7l8()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    public final void ncyb() {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (!f7l8Var.o1t()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                return;
            }
            f7l8Var.m24007r();
            f36885n.clear();
            f81970x2.clear();
            if (C6542k.f36894k.m24013k()) {
                while (i2 < readHoldCount) {
                    i2++;
                    lock.lock();
                }
                writeLock.unlock();
                return;
            }
            cyoe.x2<Boolean, was> x2Var = f81968ld6;
            if (x2Var != null) {
                x2Var.invoke(Boolean.FALSE);
            }
            was wasVar = was.f36763k;
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    @InterfaceC7396q
    public final String ni7(@InterfaceC7396q gbni gbniVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = f36889y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f7l8 f7l8Var = f36884k;
            if (!f7l8Var.o1t()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            Set<C6537k<?>> setCdj = f7l8Var.cdj();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setCdj) {
                if (((C6537k) obj).f36890k.getContext().get(gbni.ygy) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fu4.vyq(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(ltg8.m24486t(((C6537k) obj2).f36890k.getContext()), ((C6537k) obj2).f36892q);
            }
            StringBuilder sb = new StringBuilder();
            f36884k.m24006q(gbniVar, linkedHashMap, sb, "");
            String string = sb.toString();
            d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    public final boolean o1t() {
        return installations > 0;
    }

    @InterfaceC7396q
    public final String qrj(@InterfaceC7396q C6545q c6545q) {
        List<StackTraceElement> listX2 = x2(c6545q, c6545q.m24025y());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listX2) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append((Object) stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append((Object) stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append((Object) (fileName == null ? null : x9kr(fileName)));
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(kotlin.text.fu4.m23524h(sb.toString()));
        }
        return '[' + a9.uo(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    @InterfaceC7396q
    public final List<StackTraceElement> x2(@InterfaceC7396q C6545q c6545q, @InterfaceC7396q List<StackTraceElement> list) {
        return n7h(c6545q.f7l8(), c6545q.m24023n(), list);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final Object[] m24012y() {
        String strGa;
        List<C6545q> listF7l8 = f7l8();
        int size = listF7l8.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (C6545q c6545q : listF7l8) {
            kotlin.coroutines.f7l8 f7l8VarM24022k = c6545q.m24022k();
            hyr hyrVar = (hyr) f7l8VarM24022k.get(hyr.f37198q);
            Long lValueOf = null;
            String strX9kr = (hyrVar == null || (strGa = hyrVar.ga()) == null) ? null : x9kr(strGa);
            dd ddVar = (dd) f7l8VarM24022k.get(dd.f36882k);
            String strX9kr2 = ddVar == null ? null : x9kr(ddVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append((Object) strX9kr);
            sb.append(",\n                    \"id\": ");
            n5r1 n5r1Var = (n5r1) f7l8VarM24022k.get(n5r1.f37301q);
            if (n5r1Var != null) {
                lValueOf = Long.valueOf(n5r1Var.ga());
            }
            sb.append(lValueOf);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append((Object) strX9kr2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(c6545q.m24021g());
            sb.append(",\n                    \"state\": \"");
            sb.append(c6545q.f7l8());
            sb.append("\"\n                } \n                ");
            arrayList3.add(kotlin.text.fu4.m23524h(sb.toString()));
            arrayList2.add(c6545q.m24024q());
            arrayList.add(c6545q.m24023n());
        }
        Object[] objArr = new Object[4];
        objArr[0] = '[' + a9.uo(arrayList3, null, null, null, 0, null, null, 63, null) + ']';
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[1] = array;
        Object[] array2 = arrayList2.toArray(new InterfaceC6207n[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[2] = array2;
        Object[] array3 = listF7l8.toArray(new C6545q[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[3] = array3;
        return objArr;
    }

    public final boolean zurt() {
        return f36888s;
    }
}
