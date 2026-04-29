package ikck;

import com.android.thememanager.util.C2789j;
import java.lang.reflect.InvocationTargetException;
import p020d.InterfaceC5987k;
import zy.lvui;
import zy.oc;

/* JADX INFO: compiled from: Repository.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements InterfaceC5987k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f80334toq = "zy";

    /* JADX INFO: renamed from: k */
    private boolean f35786k;

    /* JADX INFO: renamed from: k */
    public static <T extends zy> T m22379k(@lvui Class<T> clazz) {
        T tCast = (T) com.android.thememanager.library.base.arch.cache.zy.m8023k().zy(clazz.getName(), clazz);
        if (tCast == null) {
            synchronized (zy.class) {
                tCast = (T) com.android.thememanager.library.base.arch.cache.zy.m8023k().zy(clazz.getName(), clazz);
                if (tCast == null) {
                    try {
                        try {
                            tCast = clazz.cast(clazz.getConstructor(new Class[0]).newInstance(new Object[0]));
                        } catch (IllegalAccessException e2) {
                            C2789j.qrj(f80334toq, e2);
                        } catch (InstantiationException e3) {
                            C2789j.qrj(f80334toq, e3);
                        }
                    } catch (NoSuchMethodException e4) {
                        C2789j.qrj(f80334toq, e4);
                    } catch (InvocationTargetException e6) {
                        C2789j.qrj(f80334toq, e6);
                    }
                }
            }
        }
        return tCast;
    }

    @oc
    /* JADX INFO: renamed from: q */
    public void m22380q() {
        if (this.f35786k) {
            this.f35786k = false;
            release();
        }
    }

    @Override // p020d.InterfaceC5987k
    public void release() {
        if (this.f35786k) {
            return;
        }
        com.android.thememanager.library.base.arch.cache.zy.m8023k().remove(getClass().getName());
    }

    @oc
    public boolean toq() {
        return this.f35786k;
    }

    @oc
    public void zy() {
        if (this.f35786k) {
            return;
        }
        this.f35786k = true;
        com.android.thememanager.library.base.arch.cache.zy.m8023k().m8024q(getClass().getName(), this);
    }
}
