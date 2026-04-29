package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.k */
/* JADX INFO: compiled from: ArrayQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0003R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/k;", "", C0846k.zaso, "Lkotlin/was;", "zy", "element", "k", "(Ljava/lang/Object;)V", "n", "()Ljava/lang/Object;", "toq", "", "[Ljava/lang/Object;", "elements", "", com.market.sdk.reflect.toq.f28131g, C3678q.f65826kja0, "tail", "", "q", "()Z", "isEmpty", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class C6678k<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private Object[] f37222k = new Object[16];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f82015toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f82016zy;

    private final void zy() {
        Object[] objArr = this.f37222k;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        kotlin.collections.kja0.d8wk(objArr, objArr2, 0, this.f82015toq, 0, 10, null);
        Object[] objArr3 = this.f37222k;
        int length2 = objArr3.length;
        int i2 = this.f82015toq;
        kotlin.collections.kja0.d8wk(objArr3, objArr2, length2 - i2, 0, i2, 4, null);
        this.f37222k = objArr2;
        this.f82015toq = 0;
        this.f82016zy = length;
    }

    /* JADX INFO: renamed from: k */
    public final void m24354k(@InterfaceC7396q T t2) {
        Object[] objArr = this.f37222k;
        int i2 = this.f82016zy;
        objArr[i2] = t2;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f82016zy = length;
        if (length == this.f82015toq) {
            zy();
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final T m24355n() {
        int i2 = this.f82015toq;
        if (i2 == this.f82016zy) {
            return null;
        }
        Object[] objArr = this.f37222k;
        T t2 = (T) objArr[i2];
        objArr[i2] = null;
        this.f82015toq = (i2 + 1) & (objArr.length - 1);
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m24356q() {
        return this.f82015toq == this.f82016zy;
    }

    public final void toq() {
        this.f82015toq = 0;
        this.f82016zy = 0;
        this.f37222k = new Object[this.f37222k.length];
    }
}
