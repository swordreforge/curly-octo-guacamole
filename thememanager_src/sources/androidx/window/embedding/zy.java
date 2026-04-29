package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ActivityStack.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/zy;", "", "Landroid/app/Activity;", C1873k.f10652g, "", "k", "zy", C2690k.k.f61039ld6, "equals", "", "hashCode", "", "toString", "", "Ljava/util/List;", "toq", "()Ljava/util/List;", "activities", com.market.sdk.reflect.toq.f68929toq, "isEmpty", C4991s.f28129n, "(Ljava/util/List;Z)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<Activity> f7134k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f53730toq;

    /* JADX WARN: Multi-variable type inference failed */
    public zy(@InterfaceC7396q List<? extends Activity> activities, boolean z2) {
        d2ok.m23075h(activities, "activities");
        this.f7134k = activities;
        this.f53730toq = z2;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return (d2ok.f7l8(this.f7134k, zyVar.f7134k) || this.f53730toq == zyVar.f53730toq) ? false : true;
    }

    public int hashCode() {
        return ((this.f53730toq ? 1 : 0) * 31) + this.f7134k.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5666k(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        return this.f7134k.contains(activity);
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(d2ok.mcp("activities=", toq()));
        sb.append("isEmpty=" + this.f53730toq + '}');
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC7396q
    public final List<Activity> toq() {
        return this.f7134k;
    }

    public final boolean zy() {
        return this.f53730toq;
    }

    public /* synthetic */ zy(List list, boolean z2, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(list, (i2 & 2) != 0 ? false : z2);
    }
}
