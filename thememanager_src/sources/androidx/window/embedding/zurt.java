package androidx.window.embedding;

import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a9;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SplitPairRule.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006!"}, d2 = {"Landroidx/window/embedding/zurt;", "Landroidx/window/embedding/fu4;", "Landroidx/window/embedding/fn3e;", InterfaceC1357q.f53904ltg8, "p", "(Landroidx/window/embedding/fn3e;)Landroidx/window/embedding/zurt;", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "n", com.market.sdk.reflect.toq.f68929toq, AnimatedProperty.PROPERTY_NAME_Y, "()Z", "finishPrimaryWithSecondary", C7704k.y.toq.f95579toq, C7704k.y.toq.f44691k, "finishSecondaryWithPrimary", "f7l8", "clearTop", "", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", C4991s.f28129n, "(Ljava/util/Set;ZZZIIFI)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class zurt extends fu4 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f53729f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f7131g;

    /* JADX INFO: renamed from: n */
    private final boolean f7132n;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Set<fn3e> f7133y;

    public /* synthetic */ zurt(Set set, boolean z2, boolean z3, boolean z5, int i2, int i3, float f2, int i4, int i5, kotlin.jvm.internal.ni7 ni7Var) {
        this(set, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? true : z3, (i5 & 8) != 0 ? false : z5, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) == 0 ? i3 : 0, (i5 & 64) != 0 ? 0.5f : f2, (i5 & 128) != 0 ? 3 : i4);
    }

    @Override // androidx.window.embedding.fu4
    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zurt) || !super.equals(obj)) {
            return false;
        }
        zurt zurtVar = (zurt) obj;
        return d2ok.f7l8(this.f7133y, zurtVar.f7133y) && this.f7132n == zurtVar.f7132n && this.f7131g == zurtVar.f7131g && this.f53729f7l8 == zurtVar.f53729f7l8;
    }

    @InterfaceC7396q
    public final Set<fn3e> f7l8() {
        return this.f7133y;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5662g() {
        return this.f53729f7l8;
    }

    @Override // androidx.window.embedding.fu4
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f7133y.hashCode()) * 31) + Boolean.hashCode(this.f7132n)) * 31) + Boolean.hashCode(this.f7131g)) * 31) + Boolean.hashCode(this.f53729f7l8);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final zurt m5663p(@InterfaceC7396q fn3e filter) {
        d2ok.m23075h(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f7133y);
        linkedHashSet.add(filter);
        return new zurt(a9.yvs(linkedHashSet), this.f7132n, this.f7131g, this.f53729f7l8, m5615q(), zy(), m5614n(), toq());
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5664s() {
        return this.f7131g;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5665y() {
        return this.f7132n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zurt(@InterfaceC7396q Set<fn3e> filters, boolean z2, boolean z3, boolean z5, int i2, int i3, float f2, int i4) {
        super(i2, i3, f2, i4);
        d2ok.m23075h(filters, "filters");
        this.f7132n = z2;
        this.f7131g = z3;
        this.f53729f7l8 = z5;
        this.f7133y = a9.yvs(filters);
    }
}
