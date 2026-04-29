package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/n5r1;", "Lkotlinx/coroutines/uc;", "", "Lkotlin/coroutines/k;", "toString", "Lkotlin/coroutines/f7l8;", "context", "dxef", "oldState", "Lkotlin/was;", "e5", "", "bap7", "id", "h4b", "", "hashCode", "", C2690k.k.f61039ld6, "", "equals", "k", com.market.sdk.reflect.toq.f68928f7l8, "ga", "()J", C4991s.f28129n, "(J)V", "q", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
public final class n5r1 extends AbstractC6212k implements uc<String> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6702k f37301q = new C6702k(null);

    /* JADX INFO: renamed from: k */
    private final long f37302k;

    /* JADX INFO: renamed from: kotlinx.coroutines.n5r1$k */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/n5r1$k;", "Lkotlin/coroutines/f7l8$zy;", "Lkotlinx/coroutines/n5r1;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6702k implements f7l8.zy<n5r1> {
        private C6702k() {
        }

        public /* synthetic */ C6702k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public n5r1(long j2) {
        super(f37301q);
        this.f37302k = j2;
    }

    public static /* synthetic */ n5r1 wlev(n5r1 n5r1Var, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = n5r1Var.f37302k;
        }
        return n5r1Var.h4b(j2);
    }

    public final long bap7() {
        return this.f37302k;
    }

    @Override // kotlinx.coroutines.uc
    @InterfaceC7396q
    /* JADX INFO: renamed from: dxef, reason: merged with bridge method [inline-methods] */
    public String nsb(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        String strGa;
        hyr hyrVar = (hyr) f7l8Var.get(hyr.f37198q);
        String str = "coroutine";
        if (hyrVar != null && (strGa = hyrVar.ga()) != null) {
            str = strGa;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iZ8 = kotlin.text.fti.z8(name, " @", 0, false, 6, null);
        if (iZ8 < 0) {
            iZ8 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iZ8 + 10);
        String strSubstring = name.substring(0, iZ8);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(ga());
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name;
    }

    @Override // kotlinx.coroutines.uc
    /* JADX INFO: renamed from: e5, reason: merged with bridge method [inline-methods] */
    public void mo24416x(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q String str) {
        Thread.currentThread().setName(str);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5r1) && this.f37302k == ((n5r1) obj).f37302k;
    }

    public final long ga() {
        return this.f37302k;
    }

    @InterfaceC7396q
    public final n5r1 h4b(long j2) {
        return new n5r1(j2);
    }

    public int hashCode() {
        return Long.hashCode(this.f37302k);
    }

    @InterfaceC7396q
    public String toString() {
        return "CoroutineId(" + this.f37302k + ')';
    }
}
