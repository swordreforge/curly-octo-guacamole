package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0824h;
import zy.dd;
import zy.lvui;
import zy.o1t;

/* JADX INFO: compiled from: EmojiEditableFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class toq extends Editable.Factory {

    /* JADX INFO: renamed from: k */
    private static final Object f4597k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @o1t("INSTANCE_LOCK")
    private static volatile Editable.Factory f51202toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private static Class<?> f51203zy;

    @SuppressLint({"PrivateApi"})
    private toq() {
        try {
            f51203zy = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, toq.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f51202toq == null) {
            synchronized (f4597k) {
                if (f51202toq == null) {
                    f51202toq = new toq();
                }
            }
        }
        return f51202toq;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@lvui CharSequence charSequence) {
        Class<?> cls = f51203zy;
        return cls != null ? C0824h.zy(cls, charSequence) : super.newEditable(charSequence);
    }
}
