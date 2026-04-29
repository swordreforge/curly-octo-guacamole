package androidx.activity.contextaware;

import android.content.Context;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.activity.contextaware.k */
/* JADX INFO: compiled from: ContextAware.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0046k {
    void addOnContextAvailableListener(@lvui InterfaceC0047q interfaceC0047q);

    @dd
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@lvui InterfaceC0047q interfaceC0047q);
}
