package miuix.appcompat.internal.util;

import android.animation.Animator;
import androidx.fragment.app.Fragment;
import gb.toq;
import kq2f.ViewOnLayoutChangeListenerC6751k;

/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {
    /* JADX INFO: renamed from: k */
    public static Animator m25248k(Fragment fragment, int i2) {
        if (i2 == toq.C6052k.f76001ikck) {
            return new ViewOnLayoutChangeListenerC6751k(fragment, true, true);
        }
        if (i2 == toq.C6052k.f34812d) {
            return new ViewOnLayoutChangeListenerC6751k(fragment, true, false);
        }
        if (i2 == toq.C6052k.f76029xwq3) {
            return new ViewOnLayoutChangeListenerC6751k(fragment, false, true);
        }
        if (i2 == toq.C6052k.f34830v) {
            return new ViewOnLayoutChangeListenerC6751k(fragment, false, false);
        }
        return null;
    }
}
