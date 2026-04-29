package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/hyr;", "Lkotlin/coroutines/k;", "", "toString", "bap7", "name", "h4b", "", "hashCode", "", C2690k.k.f61039ld6, "", "equals", "k", "Ljava/lang/String;", "ga", "()Ljava/lang/String;", C4991s.f28129n, "(Ljava/lang/String;)V", "q", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class hyr extends AbstractC6212k {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6667k f37198q = new C6667k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f37199k;

    /* JADX INFO: renamed from: kotlinx.coroutines.hyr$k */
    /* JADX INFO: compiled from: CoroutineName.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/hyr$k;", "Lkotlin/coroutines/f7l8$zy;", "Lkotlinx/coroutines/hyr;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6667k implements f7l8.zy<hyr> {
        private C6667k() {
        }

        public /* synthetic */ C6667k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public hyr(@InterfaceC7396q String str) {
        super(f37198q);
        this.f37199k = str;
    }

    public static /* synthetic */ hyr wlev(hyr hyrVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hyrVar.f37199k;
        }
        return hyrVar.h4b(str);
    }

    @InterfaceC7396q
    public final String bap7() {
        return this.f37199k;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyr) && kotlin.jvm.internal.d2ok.f7l8(this.f37199k, ((hyr) obj).f37199k);
    }

    @InterfaceC7396q
    public final String ga() {
        return this.f37199k;
    }

    @InterfaceC7396q
    public final hyr h4b(@InterfaceC7396q String str) {
        return new hyr(str);
    }

    public int hashCode() {
        return this.f37199k.hashCode();
    }

    @InterfaceC7396q
    public String toString() {
        return "CoroutineName(" + this.f37199k + ')';
    }
}
