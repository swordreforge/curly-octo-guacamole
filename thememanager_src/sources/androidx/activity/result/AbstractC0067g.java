package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.core.app.C0447s;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: renamed from: androidx.activity.result.g */
/* JADX INFO: compiled from: ActivityResultLauncher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0067g<I> {
    @lvui
    /* JADX INFO: renamed from: k */
    public abstract AbstractC0059k<I, ?> mo30k();

    @oc
    /* JADX INFO: renamed from: q */
    public abstract void mo31q();

    public void toq(@SuppressLint({"UnknownNullness"}) I i2) {
        zy(i2, null);
    }

    public abstract void zy(@SuppressLint({"UnknownNullness"}) I i2, @dd C0447s c0447s);
}
