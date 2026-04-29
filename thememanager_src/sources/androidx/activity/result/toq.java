package androidx.activity.result;

import androidx.activity.result.contract.AbstractC0059k;
import zy.lvui;

/* JADX INFO: compiled from: ActivityResultCaller.java */
/* JADX INFO: loaded from: classes.dex */
public interface toq {
    @lvui
    <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui ActivityResultRegistry activityResultRegistry, @lvui InterfaceC0068k<O> interfaceC0068k);

    @lvui
    <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui InterfaceC0068k<O> interfaceC0068k);
}
