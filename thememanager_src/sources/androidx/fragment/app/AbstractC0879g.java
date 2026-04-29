package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: compiled from: FragmentContainer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879g {
    /* JADX INFO: renamed from: q */
    public abstract boolean mo4180q();

    @lvui
    @Deprecated
    public Fragment toq(@lvui Context context, @lvui String str, @dd Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @dd
    public abstract View zy(@InterfaceC7843t int i2);
}
