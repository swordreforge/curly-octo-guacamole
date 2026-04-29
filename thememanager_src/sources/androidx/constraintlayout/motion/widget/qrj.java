package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0395k;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: KeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj extends AbstractC0368g {

    /* JADX INFO: renamed from: a */
    public static final int f2375a = 5;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final String f48238a98o = "CROSS";

    /* JADX INFO: renamed from: b */
    public static final String f2376b = "positiveCross";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final String f48239bf2 = "negativeCross";

    /* JADX INFO: renamed from: e */
    private static final String f2377e = "KeyTrigger";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f48240ek5k = "triggerCollisionView";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f48241hb = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f48242i1 = "triggerReceiver";

    /* JADX INFO: renamed from: j */
    public static final String f2378j = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: m */
    public static final String f2379m = "triggerSlack";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f48243nn86 = "viewTransitionOnCross";

    /* JADX INFO: renamed from: o */
    public static final String f2380o = "postLayout";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    static final String f48244vyq = "KeyTrigger";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f48245y9n = "triggerID";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f48246yz = "triggerCollisionId";

    /* JADX INFO: renamed from: c */
    RectF f2381c;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    float f48248d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private int f48249d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean f48250dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private View f48251eqxt;

    /* JADX INFO: renamed from: f */
    int f2382f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f48252fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private String f48253gvn7;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    int f48254hyr;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private String f48256jp0y;

    /* JADX INFO: renamed from: l */
    private boolean f2383l;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    RectF f48257lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private boolean f48258lvui;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    int f48259n5r1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f48260ncyb;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f48261oc;

    /* JADX INFO: renamed from: r */
    private boolean f2384r;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    HashMap<String, Method> f48262uv6;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f48263x9kr;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f48255jk = -1;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private String f48247a9 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.qrj$k */
    /* JADX INFO: compiled from: KeyTrigger.java */
    private static class C0377k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f48264f7l8 = 8;

        /* JADX INFO: renamed from: g */
        private static final int f2385g = 7;

        /* JADX INFO: renamed from: k */
        private static final int f2386k = 1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f48265ld6 = 12;

        /* JADX INFO: renamed from: n */
        private static final int f2387n = 6;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static SparseIntArray f48266n7h = null;

        /* JADX INFO: renamed from: p */
        private static final int f2388p = 11;

        /* JADX INFO: renamed from: q */
        private static final int f2389q = 5;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f48267qrj = 14;

        /* JADX INFO: renamed from: s */
        private static final int f2390s = 10;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f48268toq = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f48269x2 = 13;

        /* JADX INFO: renamed from: y */
        private static final int f2391y = 9;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f48270zy = 4;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f48266n7h = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.d79j, 8);
            f48266n7h.append(C0394g.qrj.vm8, 4);
            f48266n7h.append(C0394g.qrj.bt4, 1);
            f48266n7h.append(C0394g.qrj.ybu, 2);
            f48266n7h.append(C0394g.qrj.tl, 7);
            f48266n7h.append(C0394g.qrj.pm14, 6);
            f48266n7h.append(C0394g.qrj.szp, 5);
            f48266n7h.append(C0394g.qrj.n5, 9);
            f48266n7h.append(C0394g.qrj.vuk, 10);
            f48266n7h.append(C0394g.qrj.dt, 11);
            f48266n7h.append(C0394g.qrj.fd, 12);
            f48266n7h.append(C0394g.qrj.lt, 13);
            f48266n7h.append(C0394g.qrj.lvt, 14);
        }

        private C0377k() {
        }

        /* JADX INFO: renamed from: k */
        public static void m1512k(qrj c2, TypedArray a2, Context context) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (f48266n7h.get(index)) {
                    case 1:
                        c2.f48256jp0y = a2.getString(index);
                        break;
                    case 2:
                        c2.f48253gvn7 = a2.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e(zurt.InterfaceC0293s.f1748k, "unused attribute 0x" + Integer.toHexString(index) + "   " + f48266n7h.get(index));
                        break;
                    case 4:
                        c2.f48247a9 = a2.getString(index);
                        break;
                    case 5:
                        c2.f48248d2ok = a2.getFloat(index, c2.f48248d2ok);
                        break;
                    case 6:
                        c2.f48249d3 = a2.getResourceId(index, c2.f48249d3);
                        break;
                    case 7:
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
                    case 8:
                        int integer = a2.getInteger(index, c2.f2240k);
                        c2.f2240k = integer;
                        c2.f48263x9kr = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c2.f48261oc = a2.getResourceId(index, c2.f48261oc);
                        break;
                    case 10:
                        c2.f2383l = a2.getBoolean(index, c2.f2383l);
                        break;
                    case 11:
                        c2.f48252fti = a2.getResourceId(index, c2.f48252fti);
                        break;
                    case 12:
                        c2.f2382f = a2.getResourceId(index, c2.f2382f);
                        break;
                    case 13:
                        c2.f48259n5r1 = a2.getResourceId(index, c2.f48259n5r1);
                        break;
                    case 14:
                        c2.f48254hyr = a2.getResourceId(index, c2.f48254hyr);
                        break;
                }
            }
        }
    }

    public qrj() {
        int i2 = AbstractC0368g.f2232g;
        this.f48252fti = i2;
        this.f48256jp0y = null;
        this.f48253gvn7 = null;
        this.f48249d3 = i2;
        this.f48261oc = i2;
        this.f48251eqxt = null;
        this.f48248d2ok = 0.1f;
        this.f48258lvui = true;
        this.f2384r = true;
        this.f48250dd = true;
        this.f48263x9kr = Float.NaN;
        this.f2383l = false;
        this.f48259n5r1 = i2;
        this.f48254hyr = i2;
        this.f2382f = i2;
        this.f2381c = new RectF();
        this.f48257lrht = new RectF();
        this.f48262uv6 = new HashMap<>();
        this.f2242q = 5;
        this.f2241n = new HashMap<>();
    }

    private void a9(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    private void mcp(String str, View view) {
        boolean z2 = str.length() == 1;
        if (!z2) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f2241n.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z2 || lowerCase.matches(str)) {
                C0395k c0395k = this.f2241n.get(str2);
                if (c0395k != null) {
                    c0395k.m1639k(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m1510t(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            mcp(str, call);
            return;
        }
        if (this.f48262uv6.containsKey(str)) {
            method = this.f48262uv6.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new Class[0]);
                this.f48262uv6.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f48262uv6.put(str, null);
                Log.e(zurt.InterfaceC0293s.f1748k, "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + zy.ld6(call));
                return;
            }
        }
        try {
            method.invoke(call, new Object[0]);
        } catch (Exception unused2) {
            Log.e(zurt.InterfaceC0293s.f1748k, "Exception in call \"" + this.f48247a9 + "\"on class " + call.getClass().getSimpleName() + " " + zy.ld6(call));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: g */
    public void mo1431g(Context context, AttributeSet attrs) {
        C0377k.m1512k(this, context.obtainStyledAttributes(attrs, C0394g.qrj.z7zz), context);
    }

    int jk() {
        return this.f48255jk;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: k */
    public void mo1432k(HashMap<String, AbstractC0352q> splines) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: p */
    public void mo1433p(String tag, Object value) {
        tag.hashCode();
        byte b2 = -1;
        switch (tag.hashCode()) {
            case -1594793529:
                if (tag.equals("positiveCross")) {
                    b2 = 0;
                }
                break;
            case -966421266:
                if (tag.equals("viewTransitionOnPositiveCross")) {
                    b2 = 1;
                }
                break;
            case -786670827:
                if (tag.equals("triggerCollisionId")) {
                    b2 = 2;
                }
                break;
            case -648752941:
                if (tag.equals("triggerID")) {
                    b2 = 3;
                }
                break;
            case -638126837:
                if (tag.equals("negativeCross")) {
                    b2 = 4;
                }
                break;
            case -76025313:
                if (tag.equals("triggerCollisionView")) {
                    b2 = 5;
                }
                break;
            case -9754574:
                if (tag.equals("viewTransitionOnNegativeCross")) {
                    b2 = 6;
                }
                break;
            case 64397344:
                if (tag.equals("CROSS")) {
                    b2 = 7;
                }
                break;
            case 364489912:
                if (tag.equals("triggerSlack")) {
                    b2 = 8;
                }
                break;
            case 1301930599:
                if (tag.equals("viewTransitionOnCross")) {
                    b2 = 9;
                }
                break;
            case 1401391082:
                if (tag.equals("postLayout")) {
                    b2 = 10;
                }
                break;
            case 1535404999:
                if (tag.equals("triggerReceiver")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.f48253gvn7 = value.toString();
                break;
            case 1:
                this.f48254hyr = n7h(value);
                break;
            case 2:
                this.f48261oc = n7h(value);
                break;
            case 3:
                this.f48249d3 = n7h(value);
                break;
            case 4:
                this.f48256jp0y = value.toString();
                break;
            case 5:
                this.f48251eqxt = (View) value;
                break;
            case 6:
                this.f48259n5r1 = n7h(value);
                break;
            case 7:
                this.f48247a9 = value.toString();
                break;
            case 8:
                this.f48248d2ok = qrj(value);
                break;
            case 9:
                this.f2382f = n7h(value);
                break;
            case 10:
                this.f2383l = x2(value);
                break;
            case 11:
                this.f48252fti = n7h(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: q */
    public void mo1434q(HashSet<String> attributes) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: toq */
    public AbstractC0368g clone() {
        return new qrj().zy(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wvg(float r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.qrj.wvg(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    public AbstractC0368g zy(AbstractC0368g src) {
        super.zy(src);
        qrj qrjVar = (qrj) src;
        this.f48255jk = qrjVar.f48255jk;
        this.f48247a9 = qrjVar.f48247a9;
        this.f48252fti = qrjVar.f48252fti;
        this.f48256jp0y = qrjVar.f48256jp0y;
        this.f48253gvn7 = qrjVar.f48253gvn7;
        this.f48249d3 = qrjVar.f48249d3;
        this.f48261oc = qrjVar.f48261oc;
        this.f48251eqxt = qrjVar.f48251eqxt;
        this.f48248d2ok = qrjVar.f48248d2ok;
        this.f48258lvui = qrjVar.f48258lvui;
        this.f2384r = qrjVar.f2384r;
        this.f48250dd = qrjVar.f48250dd;
        this.f48263x9kr = qrjVar.f48263x9kr;
        this.f48260ncyb = qrjVar.f48260ncyb;
        this.f2383l = qrjVar.f2383l;
        this.f2381c = qrjVar.f2381c;
        this.f48257lrht = qrjVar.f48257lrht;
        this.f48262uv6 = qrjVar.f48262uv6;
        return this;
    }
}
