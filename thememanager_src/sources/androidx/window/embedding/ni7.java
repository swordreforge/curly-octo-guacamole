package androidx.window.embedding;

import android.content.Intent;
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

/* JADX INFO: compiled from: SplitPlaceholderRule.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/window/embedding/ni7;", "Landroidx/window/embedding/fu4;", "Landroidx/window/embedding/k;", InterfaceC1357q.f53904ltg8, AnimatedProperty.PROPERTY_NAME_Y, "(Landroidx/window/embedding/k;)Landroidx/window/embedding/ni7;", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "Landroid/content/Intent;", "n", "Landroid/content/Intent;", "f7l8", "()Landroid/content/Intent;", "placeholderIntent", "", C7704k.y.toq.f95579toq, "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", C4991s.f28129n, "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class ni7 extends fu4 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Set<C1317k> f7122g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Intent f7123n;

    public /* synthetic */ ni7(Set set, Intent intent, int i2, int i3, float f2, int i4, int i5, kotlin.jvm.internal.ni7 ni7Var) {
        this(set, intent, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0.5f : f2, (i5 & 32) != 0 ? 3 : i4);
    }

    @Override // androidx.window.embedding.fu4
    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni7) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        ni7 ni7Var = (ni7) obj;
        return d2ok.f7l8(this.f7122g, ni7Var.f7122g) && d2ok.f7l8(this.f7123n, ni7Var.f7123n);
    }

    @InterfaceC7396q
    public final Intent f7l8() {
        return this.f7123n;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final Set<C1317k> m5637g() {
        return this.f7122g;
    }

    @Override // androidx.window.embedding.fu4
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f7122g.hashCode()) * 31) + this.f7123n.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final ni7 m5638y(@InterfaceC7396q C1317k filter) {
        d2ok.m23075h(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f7122g);
        linkedHashSet.add(filter);
        return new ni7(a9.yvs(linkedHashSet), this.f7123n, m5615q(), zy(), m5614n(), toq());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni7(@InterfaceC7396q Set<C1317k> filters, @InterfaceC7396q Intent placeholderIntent, int i2, int i3, float f2, int i4) {
        super(i2, i3, f2, i4);
        d2ok.m23075h(filters, "filters");
        d2ok.m23075h(placeholderIntent, "placeholderIntent");
        this.f7123n = placeholderIntent;
        this.f7122g = a9.yvs(filters);
    }
}
