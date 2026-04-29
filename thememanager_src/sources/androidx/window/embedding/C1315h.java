package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.window.core.InterfaceC1310q;
import androidx.window.embedding.C1315h;
import androidx.window.embedding.ld6;
import androidx.window.embedding.x2;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.o1t;
import zy.yz;

/* JADX INFO: renamed from: androidx.window.embedding.h */
/* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0003\u0007\u0004\u0013B\u0013\b\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+¨\u0006."}, d2 = {"Landroidx/window/embedding/h;", "Landroidx/window/embedding/p;", "", "Landroidx/window/embedding/qrj;", "toq", "rules", "Lkotlin/was;", "k", "rule", "q", "f7l8", "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "", "Landroidx/window/embedding/i;", "callback", "zy", "consumer", "n", "", C7704k.y.toq.f95579toq, "Landroidx/window/embedding/x2;", "Landroidx/window/embedding/x2;", "ld6", "()Landroidx/window/embedding/x2;", "n7h", "(Landroidx/window/embedding/x2;)V", "embeddingExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/h$zy;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "x2", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "splitChangeCallbacks", "Landroidx/window/embedding/h$toq;", "Landroidx/window/embedding/h$toq;", "splitInfoEmbeddingCallback", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", C4991s.f28129n, "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class C1315h implements InterfaceC1320p {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private static volatile C1315h f7106g = null;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final String f7108y = "EmbeddingBackend";

    /* JADX INFO: renamed from: k */
    @o1t("globalLock")
    @InterfaceC7395n
    @yz
    private x2 f7109k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final CopyOnWriteArraySet<qrj> f7110q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final CopyOnWriteArrayList<zy> f53711toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final toq f53712zy;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final k f7107n = new k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final ReentrantLock f53710f7l8 = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.embedding.h$k */
    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/h$k;", "", "Landroidx/window/embedding/x2;", "toq", "Landroidx/window/embedding/h;", "k", "", "extensionVersion", "", "zy", "(Ljava/lang/Integer;)Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/embedding/h;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        private final x2 toq() {
            ld6 ld6Var = null;
            try {
                ld6.C1318k c1318k = ld6.f53721zy;
                if (zy(c1318k.toq()) && c1318k.zy()) {
                    ld6Var = new ld6();
                }
            } catch (Throwable th) {
                Log.d(C1315h.f7108y, d2ok.mcp("Failed to load embedding extension: ", th));
            }
            if (ld6Var == null) {
                Log.d(C1315h.f7108y, "No supported embedding extension found");
            }
            return ld6Var;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C1315h m5624k() {
            if (C1315h.f7106g == null) {
                ReentrantLock reentrantLock = C1315h.f53710f7l8;
                reentrantLock.lock();
                try {
                    if (C1315h.f7106g == null) {
                        C1315h.f7106g = new C1315h(C1315h.f7107n.toq());
                    }
                    was wasVar = was.f36763k;
                } finally {
                    reentrantLock.unlock();
                }
            }
            C1315h c1315h = C1315h.f7106g;
            d2ok.qrj(c1315h);
            return c1315h;
        }

        @yz
        public final boolean zy(@InterfaceC7395n Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.h$toq */
    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/h$toq;", "Landroidx/window/embedding/x2$k;", "", "Landroidx/window/embedding/i;", "splitInfo", "Lkotlin/was;", "k", "Ljava/util/List;", "toq", "()Ljava/util/List;", "zy", "(Ljava/util/List;)V", "lastInfo", C4991s.f28129n, "(Landroidx/window/embedding/h;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public final class toq implements x2.InterfaceC1324k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private List<C1316i> f7111k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C1315h f53713toq;

        public toq(C1315h this$0) {
            d2ok.m23075h(this$0, "this$0");
            this.f53713toq = this$0;
        }

        @Override // androidx.window.embedding.x2.InterfaceC1324k
        /* JADX INFO: renamed from: k */
        public void mo5625k(@InterfaceC7396q List<C1316i> splitInfo) {
            d2ok.m23075h(splitInfo, "splitInfo");
            this.f7111k = splitInfo;
            Iterator<zy> it = this.f53713toq.x2().iterator();
            while (it.hasNext()) {
                it.next().toq(splitInfo);
            }
        }

        @InterfaceC7395n
        public final List<C1316i> toq() {
            return this.f7111k;
        }

        public final void zy(@InterfaceC7395n List<C1316i> list) {
            this.f7111k = list;
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.h$zy */
    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/h$zy;", "", "", "Landroidx/window/embedding/i;", "splitInfoList", "Lkotlin/was;", "toq", "Landroid/app/Activity;", "k", "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "zy", "Landroidx/core/util/zy;", "q", "()Landroidx/core/util/zy;", "callback", "Ljava/util/List;", "lastValue", C4991s.f28129n, "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/zy;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Activity f7112k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private List<C1316i> f7113q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final Executor f53714toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final androidx.core.util.zy<List<C1316i>> f53715zy;

        public zy(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<List<C1316i>> callback) {
            d2ok.m23075h(activity, "activity");
            d2ok.m23075h(executor, "executor");
            d2ok.m23075h(callback, "callback");
            this.f7112k = activity;
            this.f53714toq = executor;
            this.f53715zy = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void zy(zy this$0, List splitsWithActivity) {
            d2ok.m23075h(this$0, "this$0");
            d2ok.m23075h(splitsWithActivity, "$splitsWithActivity");
            this$0.f53715zy.accept(splitsWithActivity);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final androidx.core.util.zy<List<C1316i>> m5627q() {
            return this.f53715zy;
        }

        public final void toq(@InterfaceC7396q List<C1316i> splitInfoList) {
            d2ok.m23075h(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((C1316i) obj).m5628k(this.f7112k)) {
                    arrayList.add(obj);
                }
            }
            if (d2ok.f7l8(arrayList, this.f7113q)) {
                return;
            }
            this.f7113q = arrayList;
            this.f53714toq.execute(new Runnable() { // from class: androidx.window.embedding.cdj
                @Override // java.lang.Runnable
                public final void run() {
                    C1315h.zy.zy(this.f7098k, arrayList);
                }
            });
        }
    }

    @yz
    public C1315h(@InterfaceC7395n x2 x2Var) {
        this.f7109k = x2Var;
        toq toqVar = new toq(this);
        this.f53712zy = toqVar;
        this.f53711toq = new CopyOnWriteArrayList<>();
        x2 x2Var2 = this.f7109k;
        if (x2Var2 != null) {
            x2Var2.toq(toqVar);
        }
        this.f7110q = new CopyOnWriteArraySet<>();
    }

    @yz
    public static /* synthetic */ void qrj() {
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    public void f7l8(@InterfaceC7396q qrj rule) {
        d2ok.m23075h(rule, "rule");
        if (this.f7110q.contains(rule)) {
            this.f7110q.remove(rule);
            x2 x2Var = this.f7109k;
            if (x2Var == null) {
                return;
            }
            x2Var.mo5634k(this.f7110q);
        }
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    /* JADX INFO: renamed from: g */
    public boolean mo5620g() {
        return this.f7109k != null;
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    /* JADX INFO: renamed from: k */
    public void mo5621k(@InterfaceC7396q Set<? extends qrj> rules) {
        d2ok.m23075h(rules, "rules");
        this.f7110q.clear();
        this.f7110q.addAll(rules);
        x2 x2Var = this.f7109k;
        if (x2Var == null) {
            return;
        }
        x2Var.mo5634k(this.f7110q);
    }

    @InterfaceC7395n
    public final x2 ld6() {
        return this.f7109k;
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    /* JADX INFO: renamed from: n */
    public void mo5622n(@InterfaceC7396q androidx.core.util.zy<List<C1316i>> consumer) {
        d2ok.m23075h(consumer, "consumer");
        ReentrantLock reentrantLock = f53710f7l8;
        reentrantLock.lock();
        try {
            Iterator<zy> it = x2().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zy next = it.next();
                if (d2ok.f7l8(next.m5627q(), consumer)) {
                    x2().remove(next);
                    break;
                }
            }
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n7h(@InterfaceC7395n x2 x2Var) {
        this.f7109k = x2Var;
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    /* JADX INFO: renamed from: q */
    public void mo5623q(@InterfaceC7396q qrj rule) {
        d2ok.m23075h(rule, "rule");
        if (this.f7110q.contains(rule)) {
            return;
        }
        this.f7110q.add(rule);
        x2 x2Var = this.f7109k;
        if (x2Var == null) {
            return;
        }
        x2Var.mo5634k(this.f7110q);
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    @InterfaceC7396q
    public Set<qrj> toq() {
        return this.f7110q;
    }

    @InterfaceC7396q
    public final CopyOnWriteArrayList<zy> x2() {
        return this.f53711toq;
    }

    @Override // androidx.window.embedding.InterfaceC1320p
    public void zy(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<List<C1316i>> callback) {
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(executor, "executor");
        d2ok.m23075h(callback, "callback");
        ReentrantLock reentrantLock = f53710f7l8;
        reentrantLock.lock();
        try {
            if (ld6() == null) {
                Log.v(f7108y, "Extension not loaded, skipping callback registration.");
                callback.accept(kotlin.collections.ni7.a9());
                return;
            }
            zy zyVar = new zy(activity, executor, callback);
            x2().add(zyVar);
            if (this.f53712zy.toq() != null) {
                List<C1316i> qVar = this.f53712zy.toq();
                d2ok.qrj(qVar);
                zyVar.toq(qVar);
            } else {
                zyVar.toq(kotlin.collections.ni7.a9());
            }
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }
}
