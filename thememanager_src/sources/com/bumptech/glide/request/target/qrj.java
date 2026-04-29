package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.request.InterfaceC3170n;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: PreloadTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj<Z> extends AbstractC3179n<Z> {

    /* JADX INFO: renamed from: s */
    private static final Handler f19030s = new Handler(Looper.getMainLooper(), new C3182k());

    /* JADX INFO: renamed from: y */
    private static final int f19031y = 1;

    /* JADX INFO: renamed from: g */
    private final com.bumptech.glide.kja0 f19032g;

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.qrj$k */
    /* JADX INFO: compiled from: PreloadTarget.java */
    class C3182k implements Handler.Callback {
        C3182k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((qrj) message.obj).zy();
            return true;
        }
    }

    private qrj(com.bumptech.glide.kja0 kja0Var, int i2, int i3) {
        super(i2, i3);
        this.f19032g = kja0Var;
    }

    /* JADX INFO: renamed from: q */
    public static <Z> qrj<Z> m11205q(com.bumptech.glide.kja0 kja0Var, int i2, int i3) {
        return new qrj<>(kja0Var, i2, i3);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void qrj(@lvui Z z2, @dd InterfaceC3185g<? super Z> interfaceC3185g) {
        InterfaceC3170n interfaceC3170nLd6 = ld6();
        if (interfaceC3170nLd6 == null || !interfaceC3170nLd6.f7l8()) {
            return;
        }
        f19030s.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
    }

    void zy() {
        this.f19032g.wvg(this);
    }
}
