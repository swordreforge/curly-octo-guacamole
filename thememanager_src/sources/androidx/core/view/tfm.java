package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import androidx.core.util.C0642s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import zy.uv6;

/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class tfm {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50913toq = "WindowInsetsCompat";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    public static final tfm f50914zy;

    /* JADX INFO: renamed from: k */
    private final x2 f4130k;

    /* JADX INFO: renamed from: androidx.core.view.tfm$g */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class C0722g {

        /* JADX INFO: renamed from: k */
        private final tfm f4137k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        androidx.core.graphics.x2[] f50919toq;

        C0722g() {
            this(new tfm((tfm) null));
        }

        void f7l8(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        /* JADX INFO: renamed from: g */
        void mo3483g(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        /* JADX INFO: renamed from: k */
        protected final void m3484k() {
            androidx.core.graphics.x2[] x2VarArr = this.f50919toq;
            if (x2VarArr != null) {
                androidx.core.graphics.x2 x2VarM3466g = x2VarArr[qrj.m3495n(1)];
                androidx.core.graphics.x2 x2VarM3466g2 = this.f50919toq[qrj.m3495n(2)];
                if (x2VarM3466g2 == null) {
                    x2VarM3466g2 = this.f4137k.m3466g(2);
                }
                if (x2VarM3466g == null) {
                    x2VarM3466g = this.f4137k.m3466g(1);
                }
                mo3488s(androidx.core.graphics.x2.toq(x2VarM3466g, x2VarM3466g2));
                androidx.core.graphics.x2 x2Var = this.f50919toq[qrj.m3495n(16)];
                if (x2Var != null) {
                    mo3489y(x2Var);
                }
                androidx.core.graphics.x2 x2Var2 = this.f50919toq[qrj.m3495n(32)];
                if (x2Var2 != null) {
                    mo3483g(x2Var2);
                }
                androidx.core.graphics.x2 x2Var3 = this.f50919toq[qrj.m3495n(64)];
                if (x2Var3 != null) {
                    mo3486p(x2Var3);
                }
            }
        }

        void ld6(int i2, boolean z2) {
        }

        /* JADX INFO: renamed from: n */
        void mo3485n(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            if (i2 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        /* JADX INFO: renamed from: p */
        void mo3486p(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        /* JADX INFO: renamed from: q */
        void mo3487q(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            if (this.f50919toq == null) {
                this.f50919toq = new androidx.core.graphics.x2[9];
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.f50919toq[qrj.m3495n(i3)] = x2Var;
                }
            }
        }

        /* JADX INFO: renamed from: s */
        void mo3488s(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        @zy.lvui
        tfm toq() {
            m3484k();
            return this.f4137k;
        }

        /* JADX INFO: renamed from: y */
        void mo3489y(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        void zy(@zy.dd C0685g c0685g) {
        }

        C0722g(@zy.lvui tfm tfmVar) {
            this.f4137k = tfmVar;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$k */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    static class C0723k {

        /* JADX INFO: renamed from: k */
        private static Field f4138k;

        /* JADX INFO: renamed from: q */
        private static boolean f4139q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Field f50920toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static Field f50921zy;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4138k = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f50920toq = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f50921zy = declaredField3;
                declaredField3.setAccessible(true);
                f4139q = true;
            } catch (ReflectiveOperationException e2) {
                Log.w(tfm.f50913toq, "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        private C0723k() {
        }

        @zy.dd
        /* JADX INFO: renamed from: k */
        public static tfm m3490k(@zy.lvui View view) {
            if (f4139q && view.isAttachedToWindow()) {
                try {
                    Object obj = f4138k.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f50920toq.get(obj);
                        Rect rect2 = (Rect) f50921zy.get(obj);
                        if (rect != null && rect2 != null) {
                            tfm tfmVarM3503k = new toq().m3502g(androidx.core.graphics.x2.m2574n(rect)).m3508y(androidx.core.graphics.x2.m2574n(rect2)).m3503k();
                            tfmVarM3503k.gvn7(tfmVarM3503k);
                            tfmVarM3503k.m3472q(view.getRootView());
                            return tfmVarM3503k;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w(tfm.f50913toq, "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(30)
    private static class ld6 extends C0725p {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        @zy.lvui
        static final tfm f50922cdj = tfm.eqxt(WindowInsets.CONSUMED);

        ld6(@zy.lvui tfm tfmVar, @zy.lvui WindowInsets windowInsets) {
            super(tfmVar, windowInsets);
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        public boolean cdj(int i2) {
            return this.f50918zy.isVisible(n7h.m3491k(i2));
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        @zy.lvui
        public androidx.core.graphics.x2 f7l8(int i2) {
            return androidx.core.graphics.x2.f7l8(this.f50918zy.getInsets(n7h.m3491k(i2)));
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        /* JADX INFO: renamed from: q */
        final void mo3481q(@zy.lvui View view) {
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        @zy.lvui
        /* JADX INFO: renamed from: y */
        public androidx.core.graphics.x2 mo3482y(int i2) {
            return androidx.core.graphics.x2.f7l8(this.f50918zy.getInsetsIgnoringVisibility(n7h.m3491k(i2)));
        }

        ld6(@zy.lvui tfm tfmVar, @zy.lvui ld6 ld6Var) {
            super(tfmVar, ld6Var);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$n */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(30)
    private static class C0724n extends C0726q {
        C0724n() {
        }

        @Override // androidx.core.view.tfm.C0722g
        void ld6(int i2, boolean z2) {
            this.f50925zy.setVisible(n7h.m3491k(i2), z2);
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: n */
        void mo3485n(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setInsetsIgnoringVisibility(n7h.m3491k(i2), x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: q */
        void mo3487q(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setInsets(n7h.m3491k(i2), x2Var.m2577y());
        }

        C0724n(@zy.lvui tfm tfmVar) {
            super(tfmVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(30)
    private static final class n7h {
        private n7h() {
        }

        /* JADX INFO: renamed from: k */
        static int m3491k(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets$Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class qrj {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f50926f7l8 = 32;

        /* JADX INFO: renamed from: g */
        static final int f4141g = 16;

        /* JADX INFO: renamed from: k */
        static final int f4142k = 1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        static final int f50927ld6 = 9;

        /* JADX INFO: renamed from: n */
        static final int f4143n = 8;

        /* JADX INFO: renamed from: p */
        static final int f4144p = 256;

        /* JADX INFO: renamed from: q */
        static final int f4145q = 4;

        /* JADX INFO: renamed from: s */
        static final int f4146s = 128;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final int f50928toq = 1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        static final int f50929x2 = 256;

        /* JADX INFO: renamed from: y */
        static final int f4147y = 64;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final int f50930zy = 2;

        /* JADX INFO: renamed from: androidx.core.view.tfm$qrj$k */
        /* JADX INFO: compiled from: WindowInsetsCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public @interface InterfaceC0727k {
        }

        private qrj() {
        }

        public static int f7l8() {
            return 2;
        }

        /* JADX INFO: renamed from: g */
        public static int m3493g() {
            return 32;
        }

        @SuppressLint({"WrongConstant"})
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        /* JADX INFO: renamed from: k */
        static int m3494k() {
            return -1;
        }

        public static int ld6() {
            return 64;
        }

        /* JADX INFO: renamed from: n */
        static int m3495n(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }

        /* JADX INFO: renamed from: p */
        public static int m3496p() {
            return 16;
        }

        /* JADX INFO: renamed from: q */
        public static int m3497q() {
            return 8;
        }

        /* JADX INFO: renamed from: s */
        public static int m3498s() {
            return 7;
        }

        public static int toq() {
            return 4;
        }

        /* JADX INFO: renamed from: y */
        public static int m3499y() {
            return 1;
        }

        public static int zy() {
            return 128;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$s */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(28)
    private static class C0728s extends C0729y {
        C0728s(@zy.lvui tfm tfmVar, @zy.lvui WindowInsets windowInsets) {
            super(tfmVar, windowInsets);
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0728s)) {
                return false;
            }
            C0728s c0728s = (C0728s) obj;
            return Objects.equals(this.f50918zy, c0728s.f50918zy) && Objects.equals(this.f50917f7l8, c0728s.f50917f7l8);
        }

        @Override // androidx.core.view.tfm.x2
        @zy.dd
        /* JADX INFO: renamed from: g */
        C0685g mo3500g() {
            return C0685g.m3278s(this.f50918zy.getDisplayCutout());
        }

        @Override // androidx.core.view.tfm.x2
        public int hashCode() {
            return this.f50918zy.hashCode();
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        /* JADX INFO: renamed from: k */
        tfm mo3501k() {
            return tfm.eqxt(this.f50918zy.consumeDisplayCutout());
        }

        C0728s(@zy.lvui tfm tfmVar, @zy.lvui C0728s c0728s) {
            super(tfmVar, c0728s);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class x2 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.lvui
        static final tfm f50931toq = new toq().m3503k().m3469k().toq().zy();

        /* JADX INFO: renamed from: k */
        final tfm f4149k;

        x2(@zy.lvui tfm tfmVar) {
            this.f4149k = tfmVar;
        }

        boolean cdj(int i2) {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x2)) {
                return false;
            }
            x2 x2Var = (x2) obj;
            return mo3478h() == x2Var.mo3478h() && kja0() == x2Var.kja0() && C0642s.m2985k(x2(), x2Var.x2()) && C0642s.m2985k(mo3509p(), x2Var.mo3509p()) && C0642s.m2985k(mo3500g(), x2Var.mo3500g());
        }

        @zy.lvui
        androidx.core.graphics.x2 f7l8(int i2) {
            return androidx.core.graphics.x2.f3599n;
        }

        public void fn3e(androidx.core.graphics.x2 x2Var) {
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        C0685g mo3500g() {
            return null;
        }

        /* JADX INFO: renamed from: h */
        boolean mo3478h() {
            return false;
        }

        public int hashCode() {
            return C0642s.toq(Boolean.valueOf(mo3478h()), Boolean.valueOf(kja0()), x2(), mo3509p(), mo3500g());
        }

        /* JADX INFO: renamed from: i */
        void mo3479i(@zy.dd tfm tfmVar) {
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        tfm mo3501k() {
            return this.f4149k;
        }

        public void ki(androidx.core.graphics.x2[] x2VarArr) {
        }

        boolean kja0() {
            return false;
        }

        @zy.lvui
        androidx.core.graphics.x2 ld6() {
            return x2();
        }

        /* JADX INFO: renamed from: n */
        void mo3480n(@zy.lvui tfm tfmVar) {
        }

        @zy.lvui
        tfm n7h(int i2, int i3, int i4, int i5) {
            return f50931toq;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        androidx.core.graphics.x2 mo3509p() {
            return androidx.core.graphics.x2.f3599n;
        }

        /* JADX INFO: renamed from: q */
        void mo3481q(@zy.lvui View view) {
        }

        @zy.lvui
        androidx.core.graphics.x2 qrj() {
            return x2();
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        androidx.core.graphics.x2 mo3492s() {
            return x2();
        }

        void t8r(@zy.lvui androidx.core.graphics.x2 x2Var) {
        }

        @zy.lvui
        tfm toq() {
            return this.f4149k;
        }

        @zy.lvui
        androidx.core.graphics.x2 x2() {
            return androidx.core.graphics.x2.f3599n;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        androidx.core.graphics.x2 mo3482y(int i2) {
            if ((i2 & 8) == 0) {
                return androidx.core.graphics.x2.f3599n;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @zy.lvui
        tfm zy() {
            return this.f4149k;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f50914zy = ld6.f50922cdj;
        } else {
            f50914zy = x2.f50931toq;
        }
    }

    @zy.hyr(20)
    private tfm(@zy.lvui WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f4130k = new ld6(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f4130k = new C0725p(this, windowInsets);
        } else if (i2 >= 28) {
            this.f4130k = new C0728s(this, windowInsets);
        } else {
            this.f4130k = new C0729y(this, windowInsets);
        }
    }

    @zy.hyr(20)
    @zy.lvui
    public static tfm d2ok(@zy.lvui WindowInsets windowInsets, @zy.dd View view) {
        tfm tfmVar = new tfm((WindowInsets) androidx.core.util.n7h.x2(windowInsets));
        if (view != null && C0683f.zsr0(view)) {
            tfmVar.gvn7(C0683f.m3178x(view));
            tfmVar.m3472q(view.getRootView());
        }
        return tfmVar;
    }

    @zy.hyr(20)
    @zy.lvui
    public static tfm eqxt(@zy.lvui WindowInsets windowInsets) {
        return d2ok(windowInsets, null);
    }

    static androidx.core.graphics.x2 o1t(@zy.lvui androidx.core.graphics.x2 x2Var, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, x2Var.f3600k - i2);
        int iMax2 = Math.max(0, x2Var.f50489toq - i3);
        int iMax3 = Math.max(0, x2Var.f50490zy - i4);
        int iMax4 = Math.max(0, x2Var.f3601q - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? x2Var : androidx.core.graphics.x2.m2575q(iMax, iMax2, iMax3, iMax4);
    }

    @zy.lvui
    @Deprecated
    public tfm a9(@zy.lvui Rect rect) {
        return new toq(this).m3508y(androidx.core.graphics.x2.m2574n(rect)).m3503k();
    }

    @Deprecated
    public int cdj() {
        return this.f4130k.x2().f50490zy;
    }

    void d3(@zy.dd androidx.core.graphics.x2 x2Var) {
        this.f4130k.fn3e(x2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tfm) {
            return C0642s.m2985k(this.f4130k, ((tfm) obj).f4130k);
        }
        return false;
    }

    @zy.lvui
    public androidx.core.graphics.x2 f7l8(int i2) {
        return this.f4130k.mo3482y(i2);
    }

    public boolean fn3e() {
        androidx.core.graphics.x2 x2VarM3466g = m3466g(qrj.m3494k());
        androidx.core.graphics.x2 x2Var = androidx.core.graphics.x2.f3599n;
        return (x2VarM3466g.equals(x2Var) && f7l8(qrj.m3494k() ^ qrj.m3497q()).equals(x2Var) && m3470n() == null) ? false : true;
    }

    void fti(androidx.core.graphics.x2[] x2VarArr) {
        this.f4130k.ki(x2VarArr);
    }

    @zy.lvui
    public tfm fu4(@zy.a9(from = 0) int i2, @zy.a9(from = 0) int i3, @zy.a9(from = 0) int i4, @zy.a9(from = 0) int i5) {
        return this.f4130k.n7h(i2, i3, i4, i5);
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public androidx.core.graphics.x2 m3466g(int i2) {
        return this.f4130k.f7l8(i2);
    }

    void gvn7(@zy.dd tfm tfmVar) {
        this.f4130k.mo3479i(tfmVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public int m3467h() {
        return this.f4130k.x2().f3600k;
    }

    public int hashCode() {
        x2 x2Var = this.f4130k;
        if (x2Var == null) {
            return 0;
        }
        return x2Var.hashCode();
    }

    @zy.lvui
    @Deprecated
    /* JADX INFO: renamed from: i */
    public androidx.core.graphics.x2 m3468i() {
        return this.f4130k.qrj();
    }

    @zy.lvui
    @Deprecated
    public tfm jk(int i2, int i3, int i4, int i5) {
        return new toq(this).m3508y(androidx.core.graphics.x2.m2575q(i2, i3, i4, i5)).m3503k();
    }

    void jp0y(@zy.lvui androidx.core.graphics.x2 x2Var) {
        this.f4130k.t8r(x2Var);
    }

    @zy.lvui
    @Deprecated
    /* JADX INFO: renamed from: k */
    public tfm m3469k() {
        return this.f4130k.mo3501k();
    }

    @Deprecated
    public int ki() {
        return this.f4130k.x2().f50489toq;
    }

    @Deprecated
    public int kja0() {
        return this.f4130k.x2().f3601q;
    }

    @Deprecated
    public int ld6() {
        return this.f4130k.mo3509p().f50490zy;
    }

    public boolean mcp(int i2) {
        return this.f4130k.cdj(i2);
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public C0685g m3470n() {
        return this.f4130k.mo3500g();
    }

    @zy.lvui
    @Deprecated
    public androidx.core.graphics.x2 n7h() {
        return this.f4130k.ld6();
    }

    @Deprecated
    public boolean ni7() {
        return !this.f4130k.x2().equals(androidx.core.graphics.x2.f3599n);
    }

    @zy.hyr(20)
    @zy.dd
    public WindowInsets oc() {
        x2 x2Var = this.f4130k;
        if (x2Var instanceof f7l8) {
            return ((f7l8) x2Var).f50918zy;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public int m3471p() {
        return this.f4130k.mo3509p().f3600k;
    }

    /* JADX INFO: renamed from: q */
    void m3472q(@zy.lvui View view) {
        this.f4130k.mo3481q(view);
    }

    @zy.lvui
    @Deprecated
    public androidx.core.graphics.x2 qrj() {
        return this.f4130k.mo3509p();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public int m3473s() {
        return this.f4130k.mo3509p().f3601q;
    }

    /* JADX INFO: renamed from: t */
    public boolean m3474t() {
        return this.f4130k.mo3478h();
    }

    @zy.lvui
    @Deprecated
    public androidx.core.graphics.x2 t8r() {
        return this.f4130k.x2();
    }

    @zy.lvui
    @Deprecated
    public tfm toq() {
        return this.f4130k.toq();
    }

    public boolean wvg() {
        return this.f4130k.kja0();
    }

    @Deprecated
    public int x2() {
        return this.f4130k.mo3509p().f50489toq;
    }

    @zy.lvui
    @Deprecated
    /* JADX INFO: renamed from: y */
    public androidx.core.graphics.x2 m3475y() {
        return this.f4130k.mo3492s();
    }

    @zy.lvui
    /* JADX INFO: renamed from: z */
    public tfm m3476z(@zy.lvui androidx.core.graphics.x2 x2Var) {
        return fu4(x2Var.f3600k, x2Var.f50489toq, x2Var.f50490zy, x2Var.f3601q);
    }

    @Deprecated
    public boolean zurt() {
        return !this.f4130k.mo3509p().equals(androidx.core.graphics.x2.f3599n);
    }

    @zy.lvui
    @Deprecated
    public tfm zy() {
        return this.f4130k.zy();
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$q */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(api = 29)
    private static class C0726q extends C0722g {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final WindowInsets$Builder f50925zy;

        C0726q() {
            this.f50925zy = new WindowInsets$Builder();
        }

        @Override // androidx.core.view.tfm.C0722g
        void f7l8(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setStableInsets(x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: g */
        void mo3483g(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setMandatorySystemGestureInsets(x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: p */
        void mo3486p(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setTappableElementInsets(x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: s */
        void mo3488s(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setSystemWindowInsets(x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        @zy.lvui
        tfm toq() {
            m3484k();
            tfm tfmVarEqxt = tfm.eqxt(this.f50925zy.build());
            tfmVarEqxt.fti(this.f50919toq);
            return tfmVarEqxt;
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: y */
        void mo3489y(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50925zy.setSystemGestureInsets(x2Var.m2577y());
        }

        @Override // androidx.core.view.tfm.C0722g
        void zy(@zy.dd C0685g c0685g) {
            this.f50925zy.setDisplayCutout(c0685g != null ? c0685g.m3282y() : null);
        }

        C0726q(@zy.lvui tfm tfmVar) {
            WindowInsets$Builder windowInsets$Builder;
            super(tfmVar);
            WindowInsets windowInsetsOc = tfmVar.oc();
            if (windowInsetsOc != null) {
                windowInsets$Builder = new WindowInsets$Builder(windowInsetsOc);
            } else {
                windowInsets$Builder = new WindowInsets$Builder();
            }
            this.f50925zy = windowInsets$Builder;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$y */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(21)
    private static class C0729y extends f7l8 {

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private androidx.core.graphics.x2 f50932qrj;

        C0729y(@zy.lvui tfm tfmVar, @zy.lvui WindowInsets windowInsets) {
            super(tfmVar, windowInsets);
            this.f50932qrj = null;
        }

        @Override // androidx.core.view.tfm.x2
        public void fn3e(@zy.dd androidx.core.graphics.x2 x2Var) {
            this.f50932qrj = x2Var;
        }

        @Override // androidx.core.view.tfm.x2
        boolean kja0() {
            return this.f50918zy.isConsumed();
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        /* JADX INFO: renamed from: p */
        final androidx.core.graphics.x2 mo3509p() {
            if (this.f50932qrj == null) {
                this.f50932qrj = androidx.core.graphics.x2.m2575q(this.f50918zy.getStableInsetLeft(), this.f50918zy.getStableInsetTop(), this.f50918zy.getStableInsetRight(), this.f50918zy.getStableInsetBottom());
            }
            return this.f50932qrj;
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        tfm toq() {
            return tfm.eqxt(this.f50918zy.consumeStableInsets());
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        tfm zy() {
            return tfm.eqxt(this.f50918zy.consumeSystemWindowInsets());
        }

        C0729y(@zy.lvui tfm tfmVar, @zy.lvui C0729y c0729y) {
            super(tfmVar, c0729y);
            this.f50932qrj = null;
            this.f50932qrj = c0729y.f50932qrj;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(api = 20)
    private static class zy extends C0722g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static Constructor<WindowInsets> f50933f7l8 = null;

        /* JADX INFO: renamed from: g */
        private static boolean f4150g = false;

        /* JADX INFO: renamed from: n */
        private static Field f4151n = null;

        /* JADX INFO: renamed from: y */
        private static boolean f4152y = false;

        /* JADX INFO: renamed from: q */
        private androidx.core.graphics.x2 f4153q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WindowInsets f50934zy;

        zy() {
            this.f50934zy = x2();
        }

        @zy.dd
        private static WindowInsets x2() {
            if (!f4150g) {
                try {
                    f4151n = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i(tfm.f50913toq, "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f4150g = true;
            }
            Field field = f4151n;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i(tfm.f50913toq, "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f4152y) {
                try {
                    f50933f7l8 = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i(tfm.f50913toq, "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f4152y = true;
            }
            Constructor<WindowInsets> constructor = f50933f7l8;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e6) {
                    Log.i(tfm.f50913toq, "Could not invoke WindowInsets(Rect) constructor", e6);
                }
            }
            return null;
        }

        @Override // androidx.core.view.tfm.C0722g
        void f7l8(@zy.dd androidx.core.graphics.x2 x2Var) {
            this.f4153q = x2Var;
        }

        @Override // androidx.core.view.tfm.C0722g
        /* JADX INFO: renamed from: s */
        void mo3488s(@zy.lvui androidx.core.graphics.x2 x2Var) {
            WindowInsets windowInsets = this.f50934zy;
            if (windowInsets != null) {
                this.f50934zy = windowInsets.replaceSystemWindowInsets(x2Var.f3600k, x2Var.f50489toq, x2Var.f50490zy, x2Var.f3601q);
            }
        }

        @Override // androidx.core.view.tfm.C0722g
        @zy.lvui
        tfm toq() {
            m3484k();
            tfm tfmVarEqxt = tfm.eqxt(this.f50934zy);
            tfmVarEqxt.fti(this.f50919toq);
            tfmVarEqxt.d3(this.f4153q);
            return tfmVarEqxt;
        }

        zy(@zy.lvui tfm tfmVar) {
            super(tfmVar);
            this.f50934zy = tfmVar.oc();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(20)
    private static class f7l8 extends x2 {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static Field f50915ld6 = null;

        /* JADX INFO: renamed from: p */
        private static Class<?> f4131p = null;

        /* JADX INFO: renamed from: s */
        private static Method f4132s = null;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static Field f50916x2 = null;

        /* JADX INFO: renamed from: y */
        private static boolean f4133y = false;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        androidx.core.graphics.x2 f50917f7l8;

        /* JADX INFO: renamed from: g */
        private tfm f4134g;

        /* JADX INFO: renamed from: n */
        private androidx.core.graphics.x2 f4135n;

        /* JADX INFO: renamed from: q */
        private androidx.core.graphics.x2[] f4136q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.lvui
        final WindowInsets f50918zy;

        f7l8(@zy.lvui tfm tfmVar, @zy.lvui WindowInsets windowInsets) {
            super(tfmVar);
            this.f4135n = null;
            this.f50918zy = windowInsets;
        }

        private androidx.core.graphics.x2 fu4() {
            tfm tfmVar = this.f4134g;
            return tfmVar != null ? tfmVar.qrj() : androidx.core.graphics.x2.f3599n;
        }

        @SuppressLint({"PrivateApi"})
        private static void wvg() {
            try {
                f4132s = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4131p = cls;
                f50915ld6 = cls.getDeclaredField("mVisibleInsets");
                f50916x2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f50915ld6.setAccessible(true);
                f50916x2.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e(tfm.f50913toq, "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f4133y = true;
        }

        @zy.dd
        /* JADX INFO: renamed from: z */
        private androidx.core.graphics.x2 m3477z(@zy.lvui View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f4133y) {
                wvg();
            }
            Method method = f4132s;
            if (method != null && f4131p != null && f50915ld6 != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w(tfm.f50913toq, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f50915ld6.get(f50916x2.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.x2.m2574n(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e(tfm.f50913toq, "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }

        @zy.lvui
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.x2 zurt(int i2, boolean z2) {
            androidx.core.graphics.x2 qVar = androidx.core.graphics.x2.f3599n;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    qVar = androidx.core.graphics.x2.toq(qVar, ni7(i3, z2));
                }
            }
            return qVar;
        }

        @Override // androidx.core.view.tfm.x2
        @SuppressLint({"WrongConstant"})
        boolean cdj(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !o1t(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.tfm.x2
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f50917f7l8, ((f7l8) obj).f50917f7l8);
            }
            return false;
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        public androidx.core.graphics.x2 f7l8(int i2) {
            return zurt(i2, false);
        }

        @Override // androidx.core.view.tfm.x2
        /* JADX INFO: renamed from: h */
        boolean mo3478h() {
            return this.f50918zy.isRound();
        }

        @Override // androidx.core.view.tfm.x2
        /* JADX INFO: renamed from: i */
        void mo3479i(@zy.dd tfm tfmVar) {
            this.f4134g = tfmVar;
        }

        @Override // androidx.core.view.tfm.x2
        public void ki(androidx.core.graphics.x2[] x2VarArr) {
            this.f4136q = x2VarArr;
        }

        @Override // androidx.core.view.tfm.x2
        /* JADX INFO: renamed from: n */
        void mo3480n(@zy.lvui tfm tfmVar) {
            tfmVar.gvn7(this.f4134g);
            tfmVar.jp0y(this.f50917f7l8);
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        tfm n7h(int i2, int i3, int i4, int i5) {
            toq toqVar = new toq(tfm.eqxt(this.f50918zy));
            toqVar.m3508y(tfm.o1t(x2(), i2, i3, i4, i5));
            toqVar.m3502g(tfm.o1t(mo3509p(), i2, i3, i4, i5));
            return toqVar.m3503k();
        }

        @zy.lvui
        protected androidx.core.graphics.x2 ni7(int i2, boolean z2) {
            androidx.core.graphics.x2 x2VarQrj;
            int i3;
            if (i2 == 1) {
                return z2 ? androidx.core.graphics.x2.m2575q(0, Math.max(fu4().f50489toq, x2().f50489toq), 0, 0) : androidx.core.graphics.x2.m2575q(0, x2().f50489toq, 0, 0);
            }
            if (i2 == 2) {
                if (z2) {
                    androidx.core.graphics.x2 x2VarFu4 = fu4();
                    androidx.core.graphics.x2 x2VarMo3509p = mo3509p();
                    return androidx.core.graphics.x2.m2575q(Math.max(x2VarFu4.f3600k, x2VarMo3509p.f3600k), 0, Math.max(x2VarFu4.f50490zy, x2VarMo3509p.f50490zy), Math.max(x2VarFu4.f3601q, x2VarMo3509p.f3601q));
                }
                androidx.core.graphics.x2 x2VarX2 = x2();
                tfm tfmVar = this.f4134g;
                x2VarQrj = tfmVar != null ? tfmVar.qrj() : null;
                int iMin = x2VarX2.f3601q;
                if (x2VarQrj != null) {
                    iMin = Math.min(iMin, x2VarQrj.f3601q);
                }
                return androidx.core.graphics.x2.m2575q(x2VarX2.f3600k, 0, x2VarX2.f50490zy, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return ld6();
                }
                if (i2 == 32) {
                    return mo3492s();
                }
                if (i2 == 64) {
                    return qrj();
                }
                if (i2 != 128) {
                    return androidx.core.graphics.x2.f3599n;
                }
                tfm tfmVar2 = this.f4134g;
                C0685g c0685gM3470n = tfmVar2 != null ? tfmVar2.m3470n() : mo3500g();
                return c0685gM3470n != null ? androidx.core.graphics.x2.m2575q(c0685gM3470n.m3281q(), c0685gM3470n.m3279g(), c0685gM3470n.m3280n(), c0685gM3470n.zy()) : androidx.core.graphics.x2.f3599n;
            }
            androidx.core.graphics.x2[] x2VarArr = this.f4136q;
            x2VarQrj = x2VarArr != null ? x2VarArr[qrj.m3495n(8)] : null;
            if (x2VarQrj != null) {
                return x2VarQrj;
            }
            androidx.core.graphics.x2 x2VarX22 = x2();
            androidx.core.graphics.x2 x2VarFu42 = fu4();
            int i4 = x2VarX22.f3601q;
            if (i4 > x2VarFu42.f3601q) {
                return androidx.core.graphics.x2.m2575q(0, 0, 0, i4);
            }
            androidx.core.graphics.x2 x2Var = this.f50917f7l8;
            return (x2Var == null || x2Var.equals(androidx.core.graphics.x2.f3599n) || (i3 = this.f50917f7l8.f3601q) <= x2VarFu42.f3601q) ? androidx.core.graphics.x2.f3599n : androidx.core.graphics.x2.m2575q(0, 0, 0, i3);
        }

        protected boolean o1t(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !ni7(i2, false).equals(androidx.core.graphics.x2.f3599n);
        }

        @Override // androidx.core.view.tfm.x2
        /* JADX INFO: renamed from: q */
        void mo3481q(@zy.lvui View view) {
            androidx.core.graphics.x2 x2VarM3477z = m3477z(view);
            if (x2VarM3477z == null) {
                x2VarM3477z = androidx.core.graphics.x2.f3599n;
            }
            t8r(x2VarM3477z);
        }

        @Override // androidx.core.view.tfm.x2
        void t8r(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f50917f7l8 = x2Var;
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        final androidx.core.graphics.x2 x2() {
            if (this.f4135n == null) {
                this.f4135n = androidx.core.graphics.x2.m2575q(this.f50918zy.getSystemWindowInsetLeft(), this.f50918zy.getSystemWindowInsetTop(), this.f50918zy.getSystemWindowInsetRight(), this.f50918zy.getSystemWindowInsetBottom());
            }
            return this.f4135n;
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        /* JADX INFO: renamed from: y */
        public androidx.core.graphics.x2 mo3482y(int i2) {
            return zurt(i2, true);
        }

        f7l8(@zy.lvui tfm tfmVar, @zy.lvui f7l8 f7l8Var) {
            this(tfmVar, new WindowInsets(f7l8Var.f50918zy));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.tfm$p */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @zy.hyr(29)
    private static class C0725p extends C0728s {

        /* JADX INFO: renamed from: h */
        private androidx.core.graphics.x2 f4140h;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private androidx.core.graphics.x2 f50923kja0;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private androidx.core.graphics.x2 f50924n7h;

        C0725p(@zy.lvui tfm tfmVar, @zy.lvui WindowInsets windowInsets) {
            super(tfmVar, windowInsets);
            this.f50924n7h = null;
            this.f50923kja0 = null;
            this.f4140h = null;
        }

        @Override // androidx.core.view.tfm.C0729y, androidx.core.view.tfm.x2
        public void fn3e(@zy.dd androidx.core.graphics.x2 x2Var) {
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        androidx.core.graphics.x2 ld6() {
            if (this.f50924n7h == null) {
                this.f50924n7h = androidx.core.graphics.x2.f7l8(this.f50918zy.getSystemGestureInsets());
            }
            return this.f50924n7h;
        }

        @Override // androidx.core.view.tfm.f7l8, androidx.core.view.tfm.x2
        @zy.lvui
        tfm n7h(int i2, int i3, int i4, int i5) {
            return tfm.eqxt(this.f50918zy.inset(i2, i3, i4, i5));
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        androidx.core.graphics.x2 qrj() {
            if (this.f4140h == null) {
                this.f4140h = androidx.core.graphics.x2.f7l8(this.f50918zy.getTappableElementInsets());
            }
            return this.f4140h;
        }

        @Override // androidx.core.view.tfm.x2
        @zy.lvui
        /* JADX INFO: renamed from: s */
        androidx.core.graphics.x2 mo3492s() {
            if (this.f50923kja0 == null) {
                this.f50923kja0 = androidx.core.graphics.x2.f7l8(this.f50918zy.getMandatorySystemGestureInsets());
            }
            return this.f50923kja0;
        }

        C0725p(@zy.lvui tfm tfmVar, @zy.lvui C0725p c0725p) {
            super(tfmVar, c0725p);
            this.f50924n7h = null;
            this.f50923kja0 = null;
            this.f4140h = null;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final C0722g f4148k;

        public toq() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f4148k = new C0724n();
            } else if (i2 >= 29) {
                this.f4148k = new C0726q();
            } else {
                this.f4148k = new zy();
            }
        }

        @zy.lvui
        @Deprecated
        public toq f7l8(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3489y(x2Var);
            return this;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: g */
        public toq m3502g(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.f7l8(x2Var);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public tfm m3503k() {
            return this.f4148k.toq();
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: n */
        public toq m3504n(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3483g(x2Var);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public toq m3505p(int i2, boolean z2) {
            this.f4148k.ld6(i2, z2);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public toq m3506q(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3485n(i2, x2Var);
            return this;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: s */
        public toq m3507s(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3486p(x2Var);
            return this;
        }

        @zy.lvui
        public toq toq(@zy.dd C0685g c0685g) {
            this.f4148k.zy(c0685g);
            return this;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: y */
        public toq m3508y(@zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3488s(x2Var);
            return this;
        }

        @zy.lvui
        public toq zy(int i2, @zy.lvui androidx.core.graphics.x2 x2Var) {
            this.f4148k.mo3487q(i2, x2Var);
            return this;
        }

        public toq(@zy.lvui tfm tfmVar) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f4148k = new C0724n(tfmVar);
            } else if (i2 >= 29) {
                this.f4148k = new C0726q(tfmVar);
            } else {
                this.f4148k = new zy(tfmVar);
            }
        }
    }

    public tfm(@zy.dd tfm tfmVar) {
        if (tfmVar != null) {
            x2 x2Var = tfmVar.f4130k;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (x2Var instanceof ld6)) {
                this.f4130k = new ld6(this, (ld6) x2Var);
            } else if (i2 >= 29 && (x2Var instanceof C0725p)) {
                this.f4130k = new C0725p(this, (C0725p) x2Var);
            } else if (i2 >= 28 && (x2Var instanceof C0728s)) {
                this.f4130k = new C0728s(this, (C0728s) x2Var);
            } else if (x2Var instanceof C0729y) {
                this.f4130k = new C0729y(this, (C0729y) x2Var);
            } else if (x2Var instanceof f7l8) {
                this.f4130k = new f7l8(this, (f7l8) x2Var);
            } else {
                this.f4130k = new x2(this);
            }
            x2Var.mo3480n(this);
            return;
        }
        this.f4130k = new x2(this);
    }
}
