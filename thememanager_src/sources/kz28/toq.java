package kz28;

import android.content.res.Configuration;
import java.util.List;
import kt06.C6753n;
import kt06.C6754q;

/* JADX INFO: compiled from: IViewResponsive.java */
/* JADX INFO: loaded from: classes2.dex */
public interface toq {
    /* JADX INFO: renamed from: k */
    default boolean m24699k(Configuration configuration, C6753n c6753n, boolean z2, List<C6754q> list) {
        return false;
    }

    boolean onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2);
}
