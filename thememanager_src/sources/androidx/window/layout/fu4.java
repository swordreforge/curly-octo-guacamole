package androidx.window.layout;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import kotlin.collections.a9;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.uv6;

/* JADX INFO: compiled from: WindowLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/fu4;", "", "", "toString", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "", "Landroidx/window/layout/f7l8;", "k", "Ljava/util/List;", "()Ljava/util/List;", "displayFeatures", C4991s.f28129n, "(Ljava/util/List;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class fu4 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<f7l8> f7152k;

    /* JADX WARN: Multi-variable type inference failed */
    @uv6({uv6.EnumC7844k.TESTS})
    public fu4(@InterfaceC7396q List<? extends f7l8> displayFeatures) {
        d2ok.m23075h(displayFeatures, "displayFeatures");
        this.f7152k = displayFeatures;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d2ok.f7l8(fu4.class, obj.getClass())) {
            return false;
        }
        return d2ok.f7l8(this.f7152k, ((fu4) obj).f7152k);
    }

    public int hashCode() {
        return this.f7152k.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final List<f7l8> m5679k() {
        return this.f7152k;
    }

    @InterfaceC7396q
    public String toString() {
        return a9.uo(this.f7152k, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
