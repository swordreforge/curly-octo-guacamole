package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;

/* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class qo {

    /* JADX INFO: renamed from: k */
    private final toq f4098k;

    /* JADX INFO: renamed from: androidx.core.view.qo$k */
    /* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
    @zy.hyr(30)
    private static class C0712k extends toq {

        /* JADX INFO: renamed from: k */
        private final WindowInsetsAnimationController f4099k;

        C0712k(@zy.lvui WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f4099k = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.qo.toq
        @SuppressLint({"WrongConstant"})
        public int f7l8() {
            return this.f4099k.getTypes();
        }

        @Override // androidx.core.view.qo.toq
        @zy.lvui
        /* JADX INFO: renamed from: g */
        public androidx.core.graphics.x2 mo3424g() {
            return androidx.core.graphics.x2.f7l8(this.f4099k.getShownStateInsets());
        }

        @Override // androidx.core.view.qo.toq
        /* JADX INFO: renamed from: k */
        void mo3425k(boolean z2) {
            this.f4099k.finish(z2);
        }

        @Override // androidx.core.view.qo.toq
        public void ld6(@zy.dd androidx.core.graphics.x2 x2Var, float f2, float f3) {
            this.f4099k.setInsetsAndAlpha(x2Var == null ? null : x2Var.m2577y(), f2, f3);
        }

        @Override // androidx.core.view.qo.toq
        @zy.lvui
        /* JADX INFO: renamed from: n */
        public androidx.core.graphics.x2 mo3426n() {
            return androidx.core.graphics.x2.f7l8(this.f4099k.getHiddenStateInsets());
        }

        @Override // androidx.core.view.qo.toq
        /* JADX INFO: renamed from: p */
        public boolean mo3427p() {
            return this.f4099k.isReady();
        }

        @Override // androidx.core.view.qo.toq
        @zy.lvui
        /* JADX INFO: renamed from: q */
        public androidx.core.graphics.x2 mo3428q() {
            return androidx.core.graphics.x2.f7l8(this.f4099k.getCurrentInsets());
        }

        @Override // androidx.core.view.qo.toq
        /* JADX INFO: renamed from: s */
        boolean mo3429s() {
            return this.f4099k.isFinished();
        }

        @Override // androidx.core.view.qo.toq
        public float toq() {
            return this.f4099k.getCurrentAlpha();
        }

        @Override // androidx.core.view.qo.toq
        /* JADX INFO: renamed from: y */
        boolean mo3430y() {
            return this.f4099k.isCancelled();
        }

        @Override // androidx.core.view.qo.toq
        public float zy() {
            return this.f4099k.getCurrentFraction();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
    private static class toq {
        toq() {
        }

        public int f7l8() {
            return 0;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public androidx.core.graphics.x2 mo3424g() {
            return androidx.core.graphics.x2.f3599n;
        }

        /* JADX INFO: renamed from: k */
        void mo3425k(boolean z2) {
        }

        public void ld6(@zy.dd androidx.core.graphics.x2 x2Var, @zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3) {
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public androidx.core.graphics.x2 mo3426n() {
            return androidx.core.graphics.x2.f3599n;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo3427p() {
            return false;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public androidx.core.graphics.x2 mo3428q() {
            return androidx.core.graphics.x2.f3599n;
        }

        /* JADX INFO: renamed from: s */
        boolean mo3429s() {
            return false;
        }

        public float toq() {
            return 0.0f;
        }

        /* JADX INFO: renamed from: y */
        boolean mo3430y() {
            return true;
        }

        @zy.zurt(from = 0.0d, to = 1.0d)
        public float zy() {
            return 0.0f;
        }
    }

    @zy.hyr(30)
    qo(@zy.lvui WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f4098k = new C0712k(windowInsetsAnimationController);
    }

    public int f7l8() {
        return this.f4098k.f7l8();
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public androidx.core.graphics.x2 m3417g() {
        return this.f4098k.mo3424g();
    }

    /* JADX INFO: renamed from: k */
    public void m3418k(boolean z2) {
        this.f4098k.mo3425k(z2);
    }

    public void ld6(@zy.dd androidx.core.graphics.x2 x2Var, @zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3) {
        this.f4098k.ld6(x2Var, f2, f3);
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public androidx.core.graphics.x2 m3419n() {
        return this.f4098k.mo3426n();
    }

    /* JADX INFO: renamed from: p */
    public boolean m3420p() {
        return (m3422s() || m3423y()) ? false : true;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public androidx.core.graphics.x2 m3421q() {
        return this.f4098k.mo3428q();
    }

    /* JADX INFO: renamed from: s */
    public boolean m3422s() {
        return this.f4098k.mo3429s();
    }

    public float toq() {
        return this.f4098k.toq();
    }

    /* JADX INFO: renamed from: y */
    public boolean m3423y() {
        return this.f4098k.mo3430y();
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    public float zy() {
        return this.f4098k.zy();
    }
}
