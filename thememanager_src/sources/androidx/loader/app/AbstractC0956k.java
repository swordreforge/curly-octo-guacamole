package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.InterfaceC0954z;
import androidx.loader.content.zy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: renamed from: androidx.loader.app.k */
/* JADX INFO: compiled from: LoaderManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0956k {

    /* JADX INFO: renamed from: androidx.loader.app.k$k */
    /* JADX INFO: compiled from: LoaderManager.java */
    public interface k<D> {
        @oc
        /* JADX INFO: renamed from: k */
        void m4505k(@lvui zy<D> zyVar, D d2);

        @lvui
        @oc
        zy<D> toq(int i2, @dd Bundle bundle);

        @oc
        void zy(@lvui zy<D> zyVar);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static <T extends InterfaceC0954z & InterfaceC0931j> AbstractC0956k m4499q(@lvui T t2) {
        return new toq(t2, t2.getViewModelStore());
    }

    public static void zy(boolean z2) {
        toq.f5141q = z2;
    }

    @lvui
    @oc
    public abstract <D> zy<D> f7l8(int i2, @dd Bundle bundle, @lvui k<D> kVar);

    /* JADX INFO: renamed from: g */
    public boolean mo4500g() {
        return false;
    }

    @oc
    /* JADX INFO: renamed from: k */
    public abstract void mo4501k(int i2);

    @dd
    /* JADX INFO: renamed from: n */
    public abstract <D> zy<D> mo4502n(int i2);

    @lvui
    @oc
    /* JADX INFO: renamed from: s */
    public abstract <D> zy<D> mo4503s(int i2, @dd Bundle bundle, @lvui k<D> kVar);

    @Deprecated
    public abstract void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: y */
    public abstract void mo4504y();
}
