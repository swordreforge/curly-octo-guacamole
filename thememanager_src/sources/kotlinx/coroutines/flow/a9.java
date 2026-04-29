package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.util.hb;
import v5yj.C7704k;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/a9;", C0846k.zaso, "Lkotlinx/coroutines/flow/hyr;", "Lkotlinx/coroutines/flow/jk;", "expect", hb.f61276lvui, "", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface a9<T> extends hyr<T>, jk<T> {
    /* JADX INFO: renamed from: g */
    boolean mo24069g(T t2, T t3);

    @Override // kotlinx.coroutines.flow.hyr
    T getValue();

    void setValue(T t2);
}
