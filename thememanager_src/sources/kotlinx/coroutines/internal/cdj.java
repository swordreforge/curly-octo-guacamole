package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import kotlin.was;
import l05.InterfaceC6761g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: InlineList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/cdj;", C0846k.d9i, "", "element", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/was;", "action", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;Lcyoe/x2;)V", "", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/String;", "", "f7l8", "(Ljava/lang/Object;)I", C2690k.k.f61039ld6, "", "q", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", "Ljava/lang/Object;", "holder", "toq", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC6761g
public final class cdj<E> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Object f37206k;

    private /* synthetic */ cdj(Object obj) {
        this.f37206k = obj;
    }

    public static int f7l8(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: g */
    public static final void m24318g(Object obj, @InterfaceC7396q cyoe.x2<? super E, was> x2Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            x2Var.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            x2Var.invoke((Object) arrayList.get(size));
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cdj m24319k(Object obj) {
        return new cdj(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m24320n(Object obj, Object obj2) {
        return kotlin.jvm.internal.d2ok.f7l8(obj, obj2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m24321q(Object obj, Object obj2) {
        return (obj2 instanceof cdj) && kotlin.jvm.internal.d2ok.f7l8(obj, ((cdj) obj2).m24324p());
    }

    /* JADX INFO: renamed from: s */
    public static String m24322s(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    @InterfaceC7396q
    public static <E> Object toq(@InterfaceC7395n Object obj) {
        return obj;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final Object m24323y(Object obj, E e2) {
        if (obj == null) {
            return toq(e2);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            return toq(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return toq(arrayList);
    }

    public static /* synthetic */ Object zy(Object obj, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return toq(obj);
    }

    public boolean equals(Object obj) {
        return m24321q(this.f37206k, obj);
    }

    public int hashCode() {
        return f7l8(this.f37206k);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object m24324p() {
        return this.f37206k;
    }

    public String toString() {
        return m24322s(this.f37206k);
    }
}
