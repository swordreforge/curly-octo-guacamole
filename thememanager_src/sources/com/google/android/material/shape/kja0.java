package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final InterfaceC4109q f67832qrj = new qrj(0.5f);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    InterfaceC4109q f67833f7l8;

    /* JADX INFO: renamed from: g */
    InterfaceC4109q f24952g;

    /* JADX INFO: renamed from: k */
    C4107n f24953k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    f7l8 f67834ld6;

    /* JADX INFO: renamed from: n */
    InterfaceC4109q f24954n;

    /* JADX INFO: renamed from: p */
    f7l8 f24955p;

    /* JADX INFO: renamed from: q */
    C4107n f24956q;

    /* JADX INFO: renamed from: s */
    f7l8 f24957s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C4107n f67835toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    f7l8 f67836x2;

    /* JADX INFO: renamed from: y */
    InterfaceC4109q f24958y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    C4107n f67837zy;

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public interface zy {
        @lvui
        /* JADX INFO: renamed from: k */
        InterfaceC4109q mo14840k(@lvui InterfaceC4109q interfaceC4109q);
    }

    @lvui
    public static toq f7l8(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3, @lvui InterfaceC4109q interfaceC4109q) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.tdgg, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.xtyc, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.m5h3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m14821q(context, resourceId, resourceId2, interfaceC4109q);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static toq m14818g(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3, int i4) {
        return f7l8(context, attributeSet, i2, i3, new C4105k(i4));
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static toq m14819k() {
        return new toq();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static toq m14820n(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        return m14818g(context, attributeSet, i2, i3, 0);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private static toq m14821q(Context context, @hb int i2, @hb int i3, @lvui InterfaceC4109q interfaceC4109q) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C6095k.kja0.tre1);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.iz1i, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.fx, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.wa, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.eyzx, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.qj, i4);
            InterfaceC4109q interfaceC4109qQrj = qrj(typedArrayObtainStyledAttributes, C6095k.kja0.xt, interfaceC4109q);
            InterfaceC4109q interfaceC4109qQrj2 = qrj(typedArrayObtainStyledAttributes, C6095k.kja0.v0, interfaceC4109qQrj);
            InterfaceC4109q interfaceC4109qQrj3 = qrj(typedArrayObtainStyledAttributes, C6095k.kja0.bvq, interfaceC4109qQrj);
            InterfaceC4109q interfaceC4109qQrj4 = qrj(typedArrayObtainStyledAttributes, C6095k.kja0.bxas, interfaceC4109qQrj);
            return new toq().d3(i5, interfaceC4109qQrj2).m14837r(i6, interfaceC4109qQrj3).wvg(i7, interfaceC4109qQrj4).zurt(i8, qrj(typedArrayObtainStyledAttributes, C6095k.kja0.rkfn, interfaceC4109qQrj));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @lvui
    private static InterfaceC4109q qrj(TypedArray typedArray, int i2, @lvui InterfaceC4109q interfaceC4109q) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return interfaceC4109q;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new C4105k(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new qrj(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC4109q;
    }

    @lvui
    public static toq toq(Context context, @hb int i2, @hb int i3) {
        return zy(context, i2, i3, 0);
    }

    @lvui
    private static toq zy(Context context, @hb int i2, @hb int i3, int i4) {
        return m14821q(context, i2, i3, new C4105k(i4));
    }

    @lvui
    public C4107n cdj() {
        return this.f24953k;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean fn3e(@lvui RectF rectF) {
        boolean z2 = this.f67836x2.getClass().equals(f7l8.class) && this.f24955p.getClass().equals(f7l8.class) && this.f24957s.getClass().equals(f7l8.class) && this.f67834ld6.getClass().equals(f7l8.class);
        float fMo14816k = this.f24954n.mo14816k(rectF);
        return z2 && ((this.f24952g.mo14816k(rectF) > fMo14816k ? 1 : (this.f24952g.mo14816k(rectF) == fMo14816k ? 0 : -1)) == 0 && (this.f24958y.mo14816k(rectF) > fMo14816k ? 1 : (this.f24958y.mo14816k(rectF) == fMo14816k ? 0 : -1)) == 0 && (this.f67833f7l8.mo14816k(rectF) > fMo14816k ? 1 : (this.f67833f7l8.mo14816k(rectF) == fMo14816k ? 0 : -1)) == 0) && ((this.f67835toq instanceof n7h) && (this.f24953k instanceof n7h) && (this.f67837zy instanceof n7h) && (this.f24956q instanceof n7h));
    }

    @lvui
    public kja0 fu4(@lvui InterfaceC4109q interfaceC4109q) {
        return zurt().m14835h(interfaceC4109q).qrj();
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public f7l8 m14822h() {
        return this.f24957s;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public InterfaceC4109q m14823i() {
        return this.f24952g;
    }

    @lvui
    public InterfaceC4109q ki() {
        return this.f24954n;
    }

    @lvui
    public f7l8 kja0() {
        return this.f24955p;
    }

    @lvui
    public C4107n ld6() {
        return this.f67837zy;
    }

    @lvui
    public f7l8 n7h() {
        return this.f67836x2;
    }

    @lvui
    public kja0 ni7(float f2) {
        return zurt().kja0(f2).qrj();
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public InterfaceC4109q m14824p() {
        return this.f24958y;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public C4107n m14825s() {
        return this.f24956q;
    }

    @lvui
    public C4107n t8r() {
        return this.f67835toq;
    }

    @lvui
    public InterfaceC4109q x2() {
        return this.f67833f7l8;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public f7l8 m14826y() {
        return this.f67834ld6;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: z */
    public kja0 m14827z(@lvui zy zyVar) {
        return zurt().d2ok(zyVar.mo14840k(ki())).ncyb(zyVar.mo14840k(m14823i())).m14839z(zyVar.mo14840k(m14824p())).jk(zyVar.mo14840k(x2())).qrj();
    }

    @lvui
    public toq zurt() {
        return new toq(this);
    }

    private kja0(@lvui toq toqVar) {
        this.f24953k = toqVar.f24960k;
        this.f67835toq = toqVar.f67840toq;
        this.f67837zy = toqVar.f67842zy;
        this.f24956q = toqVar.f24963q;
        this.f24954n = toqVar.f24961n;
        this.f24952g = toqVar.f24959g;
        this.f67833f7l8 = toqVar.f67838f7l8;
        this.f24958y = toqVar.f24965y;
        this.f24957s = toqVar.f24964s;
        this.f24955p = toqVar.f24962p;
        this.f67834ld6 = toqVar.f67839ld6;
        this.f67836x2 = toqVar.f67841x2;
    }

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @lvui
        private InterfaceC4109q f67838f7l8;

        /* JADX INFO: renamed from: g */
        @lvui
        private InterfaceC4109q f24959g;

        /* JADX INFO: renamed from: k */
        @lvui
        private C4107n f24960k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @lvui
        private f7l8 f67839ld6;

        /* JADX INFO: renamed from: n */
        @lvui
        private InterfaceC4109q f24961n;

        /* JADX INFO: renamed from: p */
        @lvui
        private f7l8 f24962p;

        /* JADX INFO: renamed from: q */
        @lvui
        private C4107n f24963q;

        /* JADX INFO: renamed from: s */
        @lvui
        private f7l8 f24964s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private C4107n f67840toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        @lvui
        private f7l8 f67841x2;

        /* JADX INFO: renamed from: y */
        @lvui
        private InterfaceC4109q f24965y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private C4107n f67842zy;

        public toq() {
            this.f24960k = ld6.toq();
            this.f67840toq = ld6.toq();
            this.f67842zy = ld6.toq();
            this.f24963q = ld6.toq();
            this.f24961n = new C4105k(0.0f);
            this.f24959g = new C4105k(0.0f);
            this.f67838f7l8 = new C4105k(0.0f);
            this.f24965y = new C4105k(0.0f);
            this.f24964s = ld6.zy();
            this.f24962p = ld6.zy();
            this.f67839ld6 = ld6.zy();
            this.f67841x2 = ld6.zy();
        }

        private static float n7h(C4107n c4107n) {
            if (c4107n instanceof n7h) {
                return ((n7h) c4107n).f24966k;
            }
            if (c4107n instanceof C4102g) {
                return ((C4102g) c4107n).f24937k;
            }
            return -1.0f;
        }

        @lvui
        public toq a9(@lvui f7l8 f7l8Var) {
            this.f67841x2 = f7l8Var;
            return this;
        }

        @lvui
        public toq cdj(int i2, @zy.cdj float f2) {
            return ki(ld6.m14842k(i2)).kja0(f2);
        }

        @lvui
        public toq d2ok(@lvui InterfaceC4109q interfaceC4109q) {
            this.f24961n = interfaceC4109q;
            return this;
        }

        @lvui
        public toq d3(int i2, @lvui InterfaceC4109q interfaceC4109q) {
            return oc(ld6.m14842k(i2)).d2ok(interfaceC4109q);
        }

        @lvui
        public toq dd(@lvui C4107n c4107n) {
            this.f67840toq = c4107n;
            float fN7h = n7h(c4107n);
            if (fN7h != -1.0f) {
                x9kr(fN7h);
            }
            return this;
        }

        @lvui
        public toq eqxt(@zy.cdj float f2) {
            this.f24961n = new C4105k(f2);
            return this;
        }

        @lvui
        public toq fn3e(int i2, @zy.cdj float f2) {
            return ni7(ld6.m14842k(i2)).fu4(f2);
        }

        @lvui
        public toq fti(@lvui f7l8 f7l8Var) {
            this.f24962p = f7l8Var;
            return this;
        }

        @lvui
        public toq fu4(@zy.cdj float f2) {
            this.f24965y = new C4105k(f2);
            return this;
        }

        @lvui
        public toq gvn7(int i2, @zy.cdj float f2) {
            return oc(ld6.m14842k(i2)).eqxt(f2);
        }

        @lvui
        /* JADX INFO: renamed from: h */
        public toq m14835h(@lvui InterfaceC4109q interfaceC4109q) {
            return d2ok(interfaceC4109q).ncyb(interfaceC4109q).jk(interfaceC4109q).m14839z(interfaceC4109q);
        }

        @lvui
        /* JADX INFO: renamed from: i */
        public toq m14836i(@lvui f7l8 f7l8Var) {
            this.f67839ld6 = f7l8Var;
            return this;
        }

        @lvui
        public toq jk(@lvui InterfaceC4109q interfaceC4109q) {
            this.f67838f7l8 = interfaceC4109q;
            return this;
        }

        @lvui
        public toq jp0y(@lvui f7l8 f7l8Var) {
            this.f24964s = f7l8Var;
            return this;
        }

        @lvui
        public toq ki(@lvui C4107n c4107n) {
            return oc(c4107n).dd(c4107n).m14838t(c4107n).ni7(c4107n);
        }

        @lvui
        public toq kja0(@zy.cdj float f2) {
            return eqxt(f2).x9kr(f2).mcp(f2).fu4(f2);
        }

        @lvui
        public toq lvui(int i2, @zy.cdj float f2) {
            return dd(ld6.m14842k(i2)).x9kr(f2);
        }

        @lvui
        public toq mcp(@zy.cdj float f2) {
            this.f67838f7l8 = new C4105k(f2);
            return this;
        }

        @lvui
        public toq ncyb(@lvui InterfaceC4109q interfaceC4109q) {
            this.f24959g = interfaceC4109q;
            return this;
        }

        @lvui
        public toq ni7(@lvui C4107n c4107n) {
            this.f24963q = c4107n;
            float fN7h = n7h(c4107n);
            if (fN7h != -1.0f) {
                fu4(fN7h);
            }
            return this;
        }

        @lvui
        public toq o1t(int i2, @zy.cdj float f2) {
            return m14838t(ld6.m14842k(i2)).mcp(f2);
        }

        @lvui
        public toq oc(@lvui C4107n c4107n) {
            this.f24960k = c4107n;
            float fN7h = n7h(c4107n);
            if (fN7h != -1.0f) {
                eqxt(fN7h);
            }
            return this;
        }

        @lvui
        public kja0 qrj() {
            return new kja0(this);
        }

        @lvui
        /* JADX INFO: renamed from: r */
        public toq m14837r(int i2, @lvui InterfaceC4109q interfaceC4109q) {
            return dd(ld6.m14842k(i2)).ncyb(interfaceC4109q);
        }

        @lvui
        /* JADX INFO: renamed from: t */
        public toq m14838t(@lvui C4107n c4107n) {
            this.f67842zy = c4107n;
            float fN7h = n7h(c4107n);
            if (fN7h != -1.0f) {
                mcp(fN7h);
            }
            return this;
        }

        @lvui
        public toq t8r(@lvui f7l8 f7l8Var) {
            return a9(f7l8Var).jp0y(f7l8Var).fti(f7l8Var).m14836i(f7l8Var);
        }

        @lvui
        public toq wvg(int i2, @lvui InterfaceC4109q interfaceC4109q) {
            return m14838t(ld6.m14842k(i2)).jk(interfaceC4109q);
        }

        @lvui
        public toq x9kr(@zy.cdj float f2) {
            this.f24959g = new C4105k(f2);
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: z */
        public toq m14839z(@lvui InterfaceC4109q interfaceC4109q) {
            this.f24965y = interfaceC4109q;
            return this;
        }

        @lvui
        public toq zurt(int i2, @lvui InterfaceC4109q interfaceC4109q) {
            return ni7(ld6.m14842k(i2)).m14839z(interfaceC4109q);
        }

        public toq(@lvui kja0 kja0Var) {
            this.f24960k = ld6.toq();
            this.f67840toq = ld6.toq();
            this.f67842zy = ld6.toq();
            this.f24963q = ld6.toq();
            this.f24961n = new C4105k(0.0f);
            this.f24959g = new C4105k(0.0f);
            this.f67838f7l8 = new C4105k(0.0f);
            this.f24965y = new C4105k(0.0f);
            this.f24964s = ld6.zy();
            this.f24962p = ld6.zy();
            this.f67839ld6 = ld6.zy();
            this.f67841x2 = ld6.zy();
            this.f24960k = kja0Var.f24953k;
            this.f67840toq = kja0Var.f67835toq;
            this.f67842zy = kja0Var.f67837zy;
            this.f24963q = kja0Var.f24956q;
            this.f24961n = kja0Var.f24954n;
            this.f24959g = kja0Var.f24952g;
            this.f67838f7l8 = kja0Var.f67833f7l8;
            this.f24965y = kja0Var.f24958y;
            this.f24964s = kja0Var.f24957s;
            this.f24962p = kja0Var.f24955p;
            this.f67839ld6 = kja0Var.f67834ld6;
            this.f67841x2 = kja0Var.f67836x2;
        }
    }

    public kja0() {
        this.f24953k = ld6.toq();
        this.f67835toq = ld6.toq();
        this.f67837zy = ld6.toq();
        this.f24956q = ld6.toq();
        this.f24954n = new C4105k(0.0f);
        this.f24952g = new C4105k(0.0f);
        this.f67833f7l8 = new C4105k(0.0f);
        this.f24958y = new C4105k(0.0f);
        this.f24957s = ld6.zy();
        this.f24955p = ld6.zy();
        this.f67834ld6 = ld6.zy();
        this.f67836x2 = ld6.zy();
    }
}
