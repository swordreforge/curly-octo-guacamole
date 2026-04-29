package androidx.window.embedding;

import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a9;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ActivityRule.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/toq;", "Landroidx/window/embedding/qrj;", "Landroidx/window/embedding/k;", InterfaceC1357q.f53904ltg8, "zy", "(Landroidx/window/embedding/k;)Landroidx/window/embedding/toq;", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "k", com.market.sdk.reflect.toq.f68929toq, "()Z", "alwaysExpand", "", "toq", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", C4991s.f28129n, "(Ljava/util/Set;Z)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class toq extends qrj {

    /* JADX INFO: renamed from: k */
    private final boolean f7129k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Set<C1317k> f53727toq;

    public /* synthetic */ toq(Set set, boolean z2, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(set, (i2 & 2) != 0 ? false : z2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toq)) {
            return false;
        }
        toq toqVar = (toq) obj;
        return d2ok.f7l8(this.f53727toq, toqVar.f53727toq) && this.f7129k == toqVar.f7129k;
    }

    public int hashCode() {
        return (this.f53727toq.hashCode() * 31) + Boolean.hashCode(this.f7129k);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5656k() {
        return this.f7129k;
    }

    @InterfaceC7396q
    public final Set<C1317k> toq() {
        return this.f53727toq;
    }

    @InterfaceC7396q
    public final toq zy(@InterfaceC7396q C1317k filter) {
        d2ok.m23075h(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f53727toq);
        linkedHashSet.add(filter);
        return new toq(a9.yvs(linkedHashSet), this.f7129k);
    }

    public toq(@InterfaceC7396q Set<C1317k> filters, boolean z2) {
        d2ok.m23075h(filters, "filters");
        this.f7129k = z2;
        this.f53727toq = a9.yvs(filters);
    }
}
