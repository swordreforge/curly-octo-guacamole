package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.InterfaceC4057y;
import zy.InterfaceC7843t;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.y */
/* JADX INFO: compiled from: MaterialCheckable.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public interface InterfaceC4057y<T extends InterfaceC4057y<T>> extends Checkable {

    /* JADX INFO: renamed from: com.google.android.material.internal.y$k */
    /* JADX INFO: compiled from: MaterialCheckable.java */
    public interface k<C> {
        /* JADX INFO: renamed from: k */
        void mo14551k(C c2, boolean z2);
    }

    @InterfaceC7843t
    int getId();

    void setInternalOnCheckedChangeListener(@dd k<T> kVar);
}
