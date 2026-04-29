package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.d3;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.window.embedding.p */
/* JADX INFO: compiled from: EmbeddingBackend.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J,\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J\u001c\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J\b\u0010\u0017\u001a\u00020\u0016H&¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/p;", "", "", "Landroidx/window/embedding/qrj;", "rules", "Lkotlin/was;", "k", "toq", "rule", "q", "f7l8", "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "", "Landroidx/window/embedding/i;", "callback", "zy", "consumer", "n", "", C7704k.y.toq.f95579toq, "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public interface InterfaceC1320p {
    void f7l8(@InterfaceC7396q qrj qrjVar);

    /* JADX INFO: renamed from: g */
    boolean mo5620g();

    /* JADX INFO: renamed from: k */
    void mo5621k(@InterfaceC7396q Set<? extends qrj> set);

    /* JADX INFO: renamed from: n */
    void mo5622n(@InterfaceC7396q androidx.core.util.zy<List<C1316i>> zyVar);

    /* JADX INFO: renamed from: q */
    void mo5623q(@InterfaceC7396q qrj qrjVar);

    @InterfaceC7396q
    Set<qrj> toq();

    void zy(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<List<C1316i>> zyVar);
}
