package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5980i;
import kotlin.C6318m;
import kotlin.C6480z;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import kotlinx.coroutines.ek5k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a\u0018\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001aF\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aX\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0019\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001cH\u0007\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010!\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001c¢\u0006\u0002\b H\u0007\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020#H\u0007\u001aU\u0010*\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000321\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u0080\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00028\u00012H\b\u0001\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a,\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b:\u00102\u001a,\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001al\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u0086\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010>\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aº\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010K\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010>\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a&\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001a&\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001ag\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000327\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001b\u001ap\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032F\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", AnimatedProperty.PROPERTY_NAME_H, C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlin/coroutines/f7l8;", "context", "cdj", "z", "oc", "fallback", "ki", "t8r", "Lkotlin/was;", "jp0y", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "onEach", "gvn7", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)V", "", "onError", "d3", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;Lcyoe/h;)V", "R", "mapper", "x2", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function1;", "f7l8", "kja0", "qrj", "Lkotlin/fn3e;", "transformer", C7704k.y.toq.f95579toq, "", "count", "jk", "Lkotlin/c;", "name", "value", "action", "n7h", "initial", "Lkotlin/Function3;", "accumulator", "operation", "t", "(Lkotlinx/coroutines/flow/s;Ljava/lang/Object;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "i", "(Lkotlinx/coroutines/flow/s;Ljava/lang/Object;)Lkotlinx/coroutines/flow/s;", "", "predicate", "fn3e", "(Lkotlinx/coroutines/flow/s;Ljava/lang/Object;Lcyoe/x2;)Lkotlinx/coroutines/flow/s;", "a9", C2690k.k.f61039ld6, "fti", AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "T1", "T2", "transform", "toq", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "T3", "other2", "Lkotlin/Function4;", "zy", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/ki;)Lkotlinx/coroutines/flow/s;", "T4", "other3", "Lkotlin/Function5;", "q", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/t8r;)Lkotlinx/coroutines/flow/s;", "T5", "other4", "Lkotlin/Function6;", "n", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/i;)Lkotlinx/coroutines/flow/s;", "", "timeMillis", "ld6", "p", "eqxt", "mcp", "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "ni7", "bufferSize", "fu4", "o1t", "wvg", "k", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class fu4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fu4$k */
    /* JADX INFO: compiled from: Migration.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", m22756f = "Migration.kt", m22757i = {}, m22758l = {427}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6569k<T> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<T, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6569k(long j2, InterfaceC6216q<? super C6569k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$timeMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C6569k(this.$timeMillis, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(T t2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6569k) create(t2, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                long j2 = this.$timeMillis;
                this.label = 1;
                if (ek5k.toq(j2, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fu4$n */
    /* JADX INFO: compiled from: Merge.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", m22756f = "Migration.kt", m22757i = {}, m22758l = {190, 190}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/ni7$toq", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6570n<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6570n(InterfaceC5979h interfaceC5979h, InterfaceC6216q interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, T t2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            C6570n c6570n = new C6570n(this.$transform, interfaceC6216q);
            c6570n.L$0 = interfaceC6618p;
            c6570n.L$1 = t2;
            return c6570n.invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                interfaceC6618p = (InterfaceC6618p) this.L$0;
                Object obj2 = this.L$1;
                InterfaceC5979h interfaceC5979h = this.$transform;
                this.L$0 = interfaceC6618p;
                this.label = 1;
                obj = interfaceC5979h.invoke(obj2, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                    return was.f36763k;
                }
                interfaceC6618p = (InterfaceC6618p) this.L$0;
                C6318m.n7h(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (ld6.m24155a(interfaceC6618p, (InterfaceC6622s) obj, this) == objX2) {
                return objX2;
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fu4$q */
    /* JADX INFO: compiled from: Migration.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m22756f = "Migration.kt", m22757i = {}, m22758l = {306}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "", "e", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6571q<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super T>, Throwable, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ T $fallback;
        final /* synthetic */ cyoe.x2<Throwable, Boolean> $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6571q(cyoe.x2<? super Throwable, Boolean> x2Var, T t2, InterfaceC6216q<? super C6571q> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$predicate = x2Var;
            this.$fallback = t2;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q Throwable th, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            C6571q c6571q = new C6571q(this.$predicate, this.$fallback, interfaceC6216q);
            c6571q.L$0 = interfaceC6618p;
            c6571q.L$1 = th;
            return c6571q.invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!this.$predicate.invoke(th).booleanValue()) {
                    throw th;
                }
                T t2 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC6618p.emit(t2, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Migration.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", m22756f = "Migration.kt", m22757i = {}, m22758l = {415}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq<T> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(long j2, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$timeMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new toq(this.$timeMillis, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                long j2 = this.$timeMillis;
                this.label = 1;
                if (ek5k.toq(j2, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Migration.kt */
    @kotlin.d3(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", C0846k.zaso, "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy extends AbstractC6308r implements cyoe.x2<Throwable, Boolean> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q Throwable th) {
            return Boolean.TRUE;
        }
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @hb(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> InterfaceC6622s<T> a9(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, T t2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> InterfaceC6622s<T> cdj(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void d3(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC5979h<? super Throwable, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @hb(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> InterfaceC6622s<R> eqxt(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h) {
        return ld6.m24177w(interfaceC6622s, new C6570n(interfaceC5979h, null));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @hb(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC6622s<R> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super T, ? extends InterfaceC6622s<? extends R>> x2Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @hb(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> InterfaceC6622s<T> fn3e(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, T t2, @InterfaceC7396q cyoe.x2<? super Throwable, Boolean> x2Var) {
        return ld6.fn3e(interfaceC6622s, new C6571q(x2Var, t2, null));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @hb(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> InterfaceC6622s<T> fti(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @hb(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC6622s<T> fu4(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @hb(expression = "let(transformer)", imports = {}))
    /* JADX INFO: renamed from: g */
    public static final <T, R> InterfaceC6622s<R> m24094g(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super InterfaceC6622s<? extends T>, ? extends InterfaceC6622s<? extends R>> x2Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void gvn7(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final Void m24095h() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @hb(expression = "catch { emit(fallback) }", imports = {}))
    /* JADX INFO: renamed from: i */
    public static final <T> InterfaceC6622s<T> m24096i(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, T t2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @hb(expression = "drop(count)", imports = {}))
    public static final <T> InterfaceC6622s<T> jk(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void jp0y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @hb(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24097k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @hb(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC6622s<T> ki(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @hb(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC6622s<T> kja0(@InterfaceC7396q InterfaceC6622s<? extends InterfaceC6622s<? extends T>> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @hb(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> InterfaceC6622s<T> ld6(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        return ld6.bek6(interfaceC6622s, new toq(j2, null));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @hb(expression = "runningReduce(operation)", imports = {}))
    public static final <T> InterfaceC6622s<T> mcp(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.cdj<? super T, ? super T, ? super InterfaceC6216q<? super T>, ? extends Object> cdjVar) {
        return ld6.ij(interfaceC6622s, cdjVar);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @hb(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: n */
    public static final <T1, T2, T3, T4, T5, R> InterfaceC6622s<R> m24098n(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q InterfaceC6622s<? extends T5> interfaceC6622s5, @InterfaceC7396q InterfaceC5980i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5980i) {
        return ld6.jp0y(interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4, interfaceC6622s5, interfaceC5980i);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @hb(expression = "collect(action)", imports = {}))
    public static final <T> void n7h(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @hb(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC6622s<T> ni7(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @hb(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> InterfaceC6622s<T> o1t(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'flowOn' instead")
    public static final <T> InterfaceC6622s<T> oc(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @hb(expression = "onEach { delay(timeMillis) }", imports = {}))
    /* JADX INFO: renamed from: p */
    public static final <T> InterfaceC6622s<T> m24099p(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        return ld6.gc3c(interfaceC6622s, new C6569k(j2, null));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @hb(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: q */
    public static final <T1, T2, T3, T4, R> InterfaceC6622s<R> m24100q(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q cyoe.t8r<? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC6216q<? super R>, ? extends Object> t8rVar) {
        return ld6.fti(interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4, t8rVar);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @hb(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC6622s<T> qrj(@InterfaceC7396q InterfaceC6622s<? extends InterfaceC6622s<? extends T>> interfaceC6622s) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @hb(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    /* JADX INFO: renamed from: s */
    public static final <T> InterfaceC6622s<T> m24101s(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @hb(expression = "scan(initial, operation)", imports = {}))
    /* JADX INFO: renamed from: t */
    public static final <T, R> InterfaceC6622s<R> m24102t(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, R r2, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @hb(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC6622s<T> t8r(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @hb(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> InterfaceC6622s<R> toq(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return ld6.jk(interfaceC6622s, interfaceC6622s2, cdjVar);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @hb(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> InterfaceC6622s<T> wvg(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @hb(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC6622s<R> x2(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @hb(expression = "onCompletion { emit(value) }", imports = {}))
    /* JADX INFO: renamed from: y */
    public static final <T> InterfaceC6622s<T> m24103y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, T t2) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Collect flow in the desired context instead")
    /* JADX INFO: renamed from: z */
    public static final <T> InterfaceC6622s<T> m24104z(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    public static /* synthetic */ InterfaceC6622s zurt(InterfaceC6622s interfaceC6622s, Object obj, cyoe.x2 x2Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            x2Var = zy.INSTANCE;
        }
        return ld6.ktq(interfaceC6622s, obj, x2Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @hb(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> InterfaceC6622s<R> zy(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q cyoe.ki<? super T1, ? super T2, ? super T3, ? super InterfaceC6216q<? super R>, ? extends Object> kiVar) {
        return ld6.a9(interfaceC6622s, interfaceC6622s2, interfaceC6622s3, kiVar);
    }
}
