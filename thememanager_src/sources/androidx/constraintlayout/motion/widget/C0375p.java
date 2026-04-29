package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0394g;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.p */
/* JADX INFO: compiled from: KeyPosition.java */
/* JADX INFO: loaded from: classes.dex */
public class C0375p extends ld6 {

    /* JADX INFO: renamed from: c */
    public static final int f2354c = 0;

    /* JADX INFO: renamed from: e */
    public static final String f2355e = "percentHeight";

    /* JADX INFO: renamed from: f */
    public static final int f2356f = 1;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f48211hb = "percentX";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f48212hyr = 2;

    /* JADX INFO: renamed from: j */
    public static final String f2357j = "percentY";

    /* JADX INFO: renamed from: l */
    private static final String f2358l = "KeyPosition";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f48213lrht = "transitionEasing";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    static final String f48214n5r1 = "KeyPosition";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f48215nn86 = "sizePercent";

    /* JADX INFO: renamed from: o */
    static final int f2359o = 2;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f48216uv6 = "drawPath";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f48217vyq = "percentWidth";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    String f48222fti = null;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    int f48224jp0y = AbstractC0368g.f2232g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    int f48223gvn7 = 0;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    float f48219d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    float f48227oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    float f48221eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    float f48218d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    float f48225lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    float f2360r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    int f48220dd = 0;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f48228x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f48226ncyb = Float.NaN;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.p$k */
    /* JADX INFO: compiled from: KeyPosition.java */
    private static class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f48229f7l8 = 7;

        /* JADX INFO: renamed from: g */
        private static final int f2361g = 6;

        /* JADX INFO: renamed from: k */
        private static final int f2362k = 1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f48230ld6 = 11;

        /* JADX INFO: renamed from: n */
        private static final int f2363n = 5;

        /* JADX INFO: renamed from: p */
        private static final int f2364p = 10;

        /* JADX INFO: renamed from: q */
        private static final int f2365q = 4;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static SparseIntArray f48231qrj = null;

        /* JADX INFO: renamed from: s */
        private static final int f2366s = 9;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f48232toq = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f48233x2 = 12;

        /* JADX INFO: renamed from: y */
        private static final int f2367y = 8;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f48234zy = 3;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f48231qrj = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.wjzm, 1);
            f48231qrj.append(C0394g.qrj.kqo, 2);
            f48231qrj.append(C0394g.qrj.v6we, 3);
            f48231qrj.append(C0394g.qrj.ax, 4);
            f48231qrj.append(C0394g.qrj.trbh, 5);
            f48231qrj.append(C0394g.qrj.x3b5, 6);
            f48231qrj.append(C0394g.qrj.w1k2, 7);
            f48231qrj.append(C0394g.qrj.y9, 9);
            f48231qrj.append(C0394g.qrj.y1e, 8);
            f48231qrj.append(C0394g.qrj.hze4, 11);
            f48231qrj.append(C0394g.qrj.ktm, 12);
            f48231qrj.append(C0394g.qrj.m6t, 10);
        }

        private k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void toq(C0375p c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (f48231qrj.get(index)) {
                    case 1:
                        if (MotionLayout.faqz) {
                            int resourceId = a2.getResourceId(index, c2.f48082toq);
                            c2.f48082toq = resourceId;
                            if (resourceId == -1) {
                                c2.f48083zy = a2.getString(index);
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.f48083zy = a2.getString(index);
                        } else {
                            c2.f48082toq = a2.getResourceId(index, c2.f48082toq);
                        }
                        break;
                    case 2:
                        c2.f2240k = a2.getInt(index, c2.f2240k);
                        break;
                    case 3:
                        if (a2.peekValue(index).type == 3) {
                            c2.f48222fti = a2.getString(index);
                        } else {
                            c2.f48222fti = C0284q.f47317kja0[a2.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        c2.f48167jk = a2.getInteger(index, c2.f48167jk);
                        break;
                    case 5:
                        c2.f48223gvn7 = a2.getInt(index, c2.f48223gvn7);
                        break;
                    case 6:
                        c2.f48221eqxt = a2.getFloat(index, c2.f48221eqxt);
                        break;
                    case 7:
                        c2.f48218d2ok = a2.getFloat(index, c2.f48218d2ok);
                        break;
                    case 8:
                        float f2 = a2.getFloat(index, c2.f48227oc);
                        c2.f48219d3 = f2;
                        c2.f48227oc = f2;
                        break;
                    case 9:
                        c2.f48220dd = a2.getInt(index, c2.f48220dd);
                        break;
                    case 10:
                        c2.f48224jp0y = a2.getInt(index, c2.f48224jp0y);
                        break;
                    case 11:
                        c2.f48219d3 = a2.getFloat(index, c2.f48219d3);
                        break;
                    case 12:
                        c2.f48227oc = a2.getFloat(index, c2.f48227oc);
                        break;
                    default:
                        Log.e(zurt.f7l8.f1703k, "unused attribute 0x" + Integer.toHexString(index) + "   " + f48231qrj.get(index));
                        break;
                }
            }
            if (c2.f2240k == -1) {
                Log.e(zurt.f7l8.f1703k, "no frame position");
            }
        }
    }

    public C0375p() {
        this.f2242q = 2;
    }

    private void fn3e(float start_x, float start_y, float end_x, float end_y) {
        float f2 = end_x - start_x;
        float f3 = end_y - start_y;
        float f4 = this.f48221eqxt;
        float f5 = this.f48218d2ok;
        this.f48228x9kr = start_x + (f2 * f4) + ((-f3) * f5);
        this.f48226ncyb = start_y + (f3 * f4) + (f2 * f5);
    }

    /* JADX INFO: renamed from: i */
    private void m1500i(float start_x, float start_y, float end_x, float end_y) {
        float f2 = end_x - start_x;
        float f3 = end_y - start_y;
        float f4 = Float.isNaN(this.f48221eqxt) ? 0.0f : this.f48221eqxt;
        float f5 = Float.isNaN(this.f2360r) ? 0.0f : this.f2360r;
        float f6 = Float.isNaN(this.f48218d2ok) ? 0.0f : this.f48218d2ok;
        this.f48228x9kr = (int) (start_x + (f4 * f2) + ((Float.isNaN(this.f48225lvui) ? 0.0f : this.f48225lvui) * f3));
        this.f48226ncyb = (int) (start_y + (f2 * f5) + (f3 * f6));
    }

    private void zurt(int layoutWidth, int layoutHeight) {
        float f2 = this.f48221eqxt;
        float f3 = 0;
        this.f48228x9kr = ((layoutWidth - 0) * f2) + f3;
        this.f48226ncyb = ((layoutHeight - 0) * f2) + f3;
    }

    @Override // androidx.constraintlayout.motion.widget.ld6
    float cdj() {
        return this.f48226ncyb;
    }

    void fu4(RectF start, RectF end, float x3, float y3, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f2 = fCenterX2 / fHypot;
        float f3 = fCenterY2 / fHypot;
        float f4 = y3 - fCenterY;
        float f5 = x3 - fCenterX;
        float f6 = ((f2 * f4) - (f5 * f3)) / fHypot;
        float f7 = ((f2 * f5) + (f3 * f4)) / fHypot;
        String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f7;
                value[1] = f6;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f7;
        value[1] = f6;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: g */
    public void mo1431g(Context context, AttributeSet attrs) {
        k.toq(this, context.obtainStyledAttributes(attrs, C0394g.qrj.e2));
    }

    @Override // androidx.constraintlayout.motion.widget.ld6
    /* JADX INFO: renamed from: h */
    float mo1481h() {
        return this.f48228x9kr;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: k */
    public void mo1432k(HashMap<String, AbstractC0352q> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.ld6
    public boolean ki(int layoutWidth, int layoutHeight, RectF start, RectF end, float x3, float y3) {
        kja0(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x3 - this.f48228x9kr) < 20.0f && Math.abs(y3 - this.f48226ncyb) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.ld6
    void kja0(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i2 = this.f48220dd;
        if (i2 == 1) {
            fn3e(start_x, start_y, end_x, end_y);
        } else if (i2 != 2) {
            m1500i(start_x, start_y, end_x, end_y);
        } else {
            zurt(layoutWidth, layoutHeight);
        }
    }

    void ni7(RectF start, RectF end, float x3, float y3, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = (x3 - fCenterX) / fCenterX2;
            attribute[1] = "percentY";
            value[1] = (y3 - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = (x3 - fCenterX) / fCenterX2;
            value[1] = (y3 - fCenterY) / fCenterY2;
        } else {
            value[1] = (x3 - fCenterX) / fCenterX2;
            value[0] = (y3 - fCenterY) / fCenterY2;
        }
    }

    public void o1t(int type) {
        this.f48220dd = type;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: p */
    public void mo1433p(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "transitionEasing":
                this.f48222fti = value.toString();
                break;
            case "percentWidth":
                this.f48219d3 = qrj(value);
                break;
            case "percentHeight":
                this.f48227oc = qrj(value);
                break;
            case "drawPath":
                this.f48223gvn7 = n7h(value);
                break;
            case "sizePercent":
                float fQrj = qrj(value);
                this.f48219d3 = fQrj;
                this.f48227oc = fQrj;
                break;
            case "percentX":
                this.f48221eqxt = qrj(value);
                break;
            case "percentY":
                this.f48218d2ok = qrj(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ld6
    public void t8r(View view, RectF start, RectF end, float x3, float y3, String[] attribute, float[] value) {
        int i2 = this.f48220dd;
        if (i2 == 1) {
            fu4(start, end, x3, y3, attribute, value);
        } else if (i2 != 2) {
            ni7(start, end, x3, y3, attribute, value);
        } else {
            m1501z(view, start, end, x3, y3, attribute, value);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: toq */
    public AbstractC0368g clone() {
        return new C0375p().zy(this);
    }

    /* JADX INFO: renamed from: z */
    void m1501z(View view, RectF start, RectF end, float x3, float y3, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = x3 / width;
            attribute[1] = "percentY";
            value[1] = y3 / height;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = x3 / width;
            value[1] = y3 / height;
        } else {
            value[1] = x3 / width;
            value[0] = y3 / height;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    public AbstractC0368g zy(AbstractC0368g src) {
        super.zy(src);
        C0375p c0375p = (C0375p) src;
        this.f48222fti = c0375p.f48222fti;
        this.f48224jp0y = c0375p.f48224jp0y;
        this.f48223gvn7 = c0375p.f48223gvn7;
        this.f48219d3 = c0375p.f48219d3;
        this.f48227oc = Float.NaN;
        this.f48221eqxt = c0375p.f48221eqxt;
        this.f48218d2ok = c0375p.f48218d2ok;
        this.f48225lvui = c0375p.f48225lvui;
        this.f2360r = c0375p.f2360r;
        this.f48228x9kr = c0375p.f48228x9kr;
        this.f48226ncyb = c0375p.f48226ncyb;
        return this;
    }
}
