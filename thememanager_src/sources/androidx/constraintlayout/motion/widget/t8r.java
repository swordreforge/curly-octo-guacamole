package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.C0399y;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: MotionScene.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f48273a9 = 1;

    /* JADX INFO: renamed from: c */
    static final int f2396c = 5;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f48274d2ok = "Include";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f48275d3 = "OnSwipe";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f48276dd = "ConstraintSet";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final String f48277eqxt = "StateSet";

    /* JADX INFO: renamed from: f */
    static final int f2397f = 4;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f48278fti = 2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f48279fu4 = 8;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final String f48280gvn7 = "Transition";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    static final int f48281hyr = 3;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f48282jk = 0;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f48283jp0y = "MotionScene";

    /* JADX INFO: renamed from: l */
    static final int f2398l = 1;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    static final int f48284lrht = 6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f48285lvui = "include";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f48286mcp = -1;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    static final int f48287n5r1 = 2;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static final int f48288ncyb = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final boolean f48289ni7 = false;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f48290o1t = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final String f48291oc = "OnClick";

    /* JADX INFO: renamed from: r */
    private static final String f2399r = "KeyFrameSet";

    /* JADX INFO: renamed from: t */
    private static final int f2400t = -2;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f48292wvg = -1;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final String f48293x9kr = "ViewTransition";

    /* JADX INFO: renamed from: z */
    static final int f2401z = 0;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f48294zurt = "MotionScene";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private MotionLayout.InterfaceC0365s f48295cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    float f48297fn3e;

    /* JADX INFO: renamed from: i */
    float f2404i;

    /* JADX INFO: renamed from: k */
    private final MotionLayout f2405k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f48298ki;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private MotionEvent f48301n7h;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    final wvg f48303t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C0399y f48304toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    toq f48306zy = null;

    /* JADX INFO: renamed from: q */
    private boolean f2408q = false;

    /* JADX INFO: renamed from: n */
    private ArrayList<toq> f2406n = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private toq f2402g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ArrayList<toq> f48296f7l8 = new ArrayList<>();

    /* JADX INFO: renamed from: y */
    private SparseArray<C0397q> f2410y = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    private HashMap<String, Integer> f2409s = new HashMap<>();

    /* JADX INFO: renamed from: p */
    private SparseIntArray f2407p = new SparseIntArray();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f48300ld6 = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f48305x2 = 400;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f48302qrj = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f48299kja0 = false;

    /* JADX INFO: renamed from: h */
    private boolean f2403h = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.t8r$k */
    /* JADX INFO: compiled from: MotionScene.java */
    class InterpolatorC0379k implements Interpolator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0284q f2411k;

        InterpolatorC0379k(final t8r this$0, final C0284q val$easing) {
            this.f2411k = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v2) {
            return (float) this.f2411k.mo986k(v2);
        }
    }

    public t8r(MotionLayout layout) {
        this.f2405k = layout;
        this.f48303t8r = new wvg(layout);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    private void m1517c(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        toq toqVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f48300ld6) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            b2 = !name.equals(f48276dd) ? (byte) -1 : (byte) 5;
                            break;
                        case -1239391468:
                            b2 = !name.equals("KeyFrameSet") ? (byte) -1 : (byte) 8;
                            break;
                        case -687739768:
                            b2 = !name.equals(f48274d2ok) ? (byte) -1 : (byte) 7;
                            break;
                        case 61998586:
                            b2 = !name.equals("ViewTransition") ? (byte) -1 : (byte) 9;
                            break;
                        case 269306229:
                            if (!name.equals(f48280gvn7)) {
                                b2 = -1;
                            }
                            break;
                        case 312750793:
                            b2 = !name.equals(f48291oc) ? (byte) -1 : (byte) 3;
                            break;
                        case 327855227:
                            b2 = !name.equals(f48275d3) ? (byte) -1 : (byte) 2;
                            break;
                        case 793277014:
                            b2 = !name.equals(zurt.InterfaceC0292q.f1742k) ? (byte) -1 : (byte) 0;
                            break;
                        case 1382829617:
                            b2 = !name.equals(f48277eqxt) ? (byte) -1 : (byte) 4;
                            break;
                        case 1942574248:
                            b2 = !name.equals(f48285lvui) ? (byte) -1 : (byte) 6;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            m1519j(context, xml);
                            break;
                        case 1:
                            ArrayList<toq> arrayList = this.f2406n;
                            toq toqVar2 = new toq(this, context, xml);
                            arrayList.add(toqVar2);
                            if (this.f48306zy == null && !toqVar2.f48328toq) {
                                this.f48306zy = toqVar2;
                                if (toqVar2.f48329x2 != null) {
                                    this.f48306zy.f48329x2.jk(this.f48298ki);
                                }
                            }
                            if (toqVar2.f48328toq) {
                                if (toqVar2.f48330zy == -1) {
                                    this.f2402g = toqVar2;
                                } else {
                                    this.f48296f7l8.add(toqVar2);
                                }
                                this.f2406n.remove(toqVar2);
                            }
                            toqVar = toqVar2;
                            break;
                        case 2:
                            if (toqVar == null) {
                                Log.v(zurt.InterfaceC0292q.f1742k, " OnSwipe (" + context.getResources().getResourceEntryName(resourceId) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (toqVar != null) {
                                toqVar.f48329x2 = new zurt(context, this.f2405k, xml);
                            }
                            break;
                        case 3:
                            if (toqVar != null) {
                                toqVar.zurt(context, xml);
                            }
                            break;
                        case 4:
                            this.f48304toq = new C0399y(context, xml);
                            break;
                        case 5:
                            m1518e(context, xml);
                            break;
                        case 6:
                        case 7:
                            hb(context, xml);
                            break;
                        case 8:
                            C0378s c0378s = new C0378s(context, xml);
                            if (toqVar != null) {
                                toqVar.f48325ld6.add(c0378s);
                            }
                            break;
                        case 9:
                            this.f48303t8r.toq(new o1t(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    private int m1518e(Context context, XmlPullParser parser) {
        String attributeValue;
        C0397q c0397q = new C0397q();
        c0397q.yqrt(false);
        int attributeCount = parser.getAttributeCount();
        int iZurt = -1;
        int iZurt2 = -1;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = parser.getAttributeName(i2);
            attributeValue = parser.getAttributeValue(i2);
            if (this.f48300ld6) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iZurt2 = zurt(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        c0397q.f2947q = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                c0397q.f2947q = 4;
                                break;
                            case "left":
                                c0397q.f2947q = 2;
                                break;
                            case "none":
                                c0397q.f2947q = 0;
                                break;
                            case "right":
                                c0397q.f2947q = 1;
                                break;
                            case "x_right":
                                c0397q.f2947q = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iZurt = zurt(context, attributeValue);
                    this.f2409s.put(nmn5(attributeValue), Integer.valueOf(iZurt));
                    c0397q.f49814toq = zy.m1601s(context, iZurt);
                    break;
            }
        }
        if (iZurt != -1) {
            if (this.f2405k.zmmu != 0) {
                c0397q.ij(true);
            }
            c0397q.gyi(context, parser);
            if (iZurt2 != -1) {
                this.f2407p.put(iZurt, iZurt2);
            }
            this.f2410y.put(iZurt, c0397q);
        }
        return iZurt;
    }

    private void hb(Context context, XmlPullParser mainParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), C0394g.qrj.me);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C0394g.qrj.eov) {
                nn86(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean hyr() {
        return this.f48295cdj != null;
    }

    /* JADX INFO: renamed from: j */
    private void m1519j(Context context, XmlPullParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.dxb);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C0394g.qrj.hx) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f48305x2);
                this.f48305x2 = i3;
                if (i3 < 8) {
                    this.f48305x2 = 8;
                }
            } else if (index == C0394g.qrj.ss2) {
                this.f48302qrj = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int jp0y(int stateId) {
        int iM1707n;
        C0399y c0399y = this.f48304toq;
        return (c0399y == null || (iM1707n = c0399y.m1707n(stateId, -1, -1)) == -1) ? stateId : iM1707n;
    }

    /* JADX INFO: renamed from: l */
    private boolean m1521l(int key) {
        int i2 = this.f2407p.get(key);
        int size = this.f2407p.size();
        while (i2 > 0) {
            if (i2 == key) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f2407p.get(i2);
            size = i3;
        }
        return false;
    }

    private int ni7(toq transition) {
        int i2 = transition.f2417k;
        if (i2 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i3 = 0; i3 < this.f2406n.size(); i3++) {
            if (this.f2406n.get(i3).f2417k == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static String nmn5(String id) {
        if (id == null) {
            return "";
        }
        int iIndexOf = id.indexOf(47);
        return iIndexOf < 0 ? id : id.substring(iIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nn86(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && f48276dd.equals(name)) {
                    return m1518e(context, xml);
                }
            }
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    static String wvg(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + zy.m1601s(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    private void yz(int key, MotionLayout motionLayout) {
        C0397q c0397q = this.f2410y.get(key);
        c0397q.f49815zy = c0397q.f49814toq;
        int i2 = this.f2407p.get(key);
        if (i2 > 0) {
            yz(i2, motionLayout);
            C0397q c0397q2 = this.f2410y.get(i2);
            if (c0397q2 == null) {
                Log.e(zurt.InterfaceC0292q.f1742k, "ERROR! invalid deriveConstraintsFrom: @id/" + zy.m1601s(this.f2405k.getContext(), i2));
                return;
            }
            c0397q.f49815zy += "/" + c0397q2.f49815zy;
            c0397q.wo(c0397q2);
        } else {
            c0397q.f49815zy += "  layout";
            c0397q.tfm(motionLayout);
        }
        c0397q.cdj(c0397q);
    }

    private int zurt(Context context, String idString) {
        int identifier;
        if (idString.contains("/")) {
            identifier = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f48300ld6) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (idString.length() > 1) {
            return Integer.parseInt(idString.substring(1));
        }
        Log.e(zurt.InterfaceC0292q.f1742k, "error in parsing id");
        return identifier;
    }

    /* JADX INFO: renamed from: a */
    public void m1524a(boolean rtl) {
        this.f48298ki = rtl;
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return;
        }
        this.f48306zy.f48329x2.jk(this.f48298ki);
    }

    public float a9(View view, int position) {
        return 0.0f;
    }

    public void a98o(View view, int position, String name, Object value) {
        toq toqVar = this.f48306zy;
        if (toqVar == null) {
            return;
        }
        Iterator it = toqVar.f48325ld6.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC0368g> it2 = ((C0378s) it.next()).m1516q(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f2240k == position) {
                    if (value != null) {
                        ((Float) value).floatValue();
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1525b(toq transition) {
        int iNi7 = ni7(transition);
        if (iNi7 != -1) {
            this.f2406n.remove(iNi7);
        }
    }

    public void bf2(int id, C0397q set) {
        this.f2410y.put(id, set);
    }

    public C0397q cdj(Context context, String id) {
        if (this.f48300ld6) {
            System.out.println("id " + id);
            System.out.println("size " + this.f2410y.size());
        }
        for (int i2 = 0; i2 < this.f2410y.size(); i2++) {
            int iKeyAt = this.f2410y.keyAt(i2);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f48300ld6) {
                System.out.println("Id for <" + i2 + "> is <" + resourceName + "> looking for <" + id + ">");
            }
            if (id.equals(resourceName)) {
                return this.f2410y.get(iKeyAt);
            }
        }
        return null;
    }

    void ch() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return;
        }
        this.f48306zy.f48329x2.gvn7();
    }

    float d2ok() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.cdj();
    }

    float d3() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.n7h();
    }

    public toq dd(int id) {
        for (toq toqVar : this.f2406n) {
            if (toqVar.f2417k == id) {
                return toqVar;
            }
        }
        return null;
    }

    void ek5k(MotionEvent event, int currentState, MotionLayout motionLayout) {
        MotionLayout.InterfaceC0365s interfaceC0365s;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.f48295cdj == null) {
            this.f48295cdj = this.f2405k.jz5();
        }
        this.f48295cdj.mo1415q(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z2 = false;
            if (action == 0) {
                this.f2404i = event.getRawX();
                this.f48297fn3e = event.getRawY();
                this.f48301n7h = event;
                this.f48299kja0 = false;
                if (this.f48306zy.f48329x2 != null) {
                    RectF rectFF7l8 = this.f48306zy.f48329x2.f7l8(this.f2405k, rectF);
                    if (rectFF7l8 != null && !rectFF7l8.contains(this.f48301n7h.getX(), this.f48301n7h.getY())) {
                        this.f48301n7h = null;
                        this.f48299kja0 = true;
                        return;
                    }
                    RectF rectFKi = this.f48306zy.f48329x2.ki(this.f2405k, rectF);
                    if (rectFKi == null || rectFKi.contains(this.f48301n7h.getX(), this.f48301n7h.getY())) {
                        this.f2403h = false;
                    } else {
                        this.f2403h = true;
                    }
                    this.f48306zy.f48329x2.wvg(this.f2404i, this.f48297fn3e);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f48299kja0) {
                float rawY = event.getRawY() - this.f48297fn3e;
                float rawX = event.getRawX() - this.f2404i;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent = this.f48301n7h) == null) {
                    return;
                }
                toq toqVarM1532p = m1532p(currentState, rawX, rawY, motionEvent);
                if (toqVarM1532p != null) {
                    motionLayout.setTransition(toqVarM1532p);
                    RectF rectFKi2 = this.f48306zy.f48329x2.ki(this.f2405k, rectF);
                    if (rectFKi2 != null && !rectFKi2.contains(this.f48301n7h.getX(), this.f48301n7h.getY())) {
                        z2 = true;
                    }
                    this.f2403h = z2;
                    this.f48306zy.f48329x2.jp0y(this.f2404i, this.f48297fn3e);
                }
            }
        }
        if (this.f48299kja0) {
            return;
        }
        toq toqVar = this.f48306zy;
        if (toqVar != null && toqVar.f48329x2 != null && !this.f2403h) {
            this.f48306zy.f48329x2.fn3e(event, this.f48295cdj, currentState, this);
        }
        this.f2404i = event.getRawX();
        this.f48297fn3e = event.getRawY();
        if (event.getAction() != 1 || (interfaceC0365s = this.f48295cdj) == null) {
            return;
        }
        interfaceC0365s.toq();
        this.f48295cdj = null;
        int i2 = motionLayout.ax;
        if (i2 != -1) {
            m1534s(motionLayout, i2);
        }
    }

    float eqxt() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.m1586h();
    }

    /* JADX INFO: renamed from: f */
    public boolean m1526f(int id) {
        return this.f48303t8r.m1564y(id);
    }

    public void f7l8(toq transition) {
        int iNi7 = ni7(transition);
        if (iNi7 == -1) {
            this.f2406n.add(transition);
        } else {
            this.f2406n.set(iNi7, transition);
        }
    }

    int fn3e() {
        toq toqVar = this.f48306zy;
        if (toqVar == null) {
            return -1;
        }
        return toqVar.f48330zy;
    }

    float fti(float dx, float dy) {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.x2(dx, dy);
    }

    public Interpolator fu4() {
        int i2 = this.f48306zy.f2418n;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.f2405k.getContext(), this.f48306zy.f48322f7l8);
        }
        if (i2 == -1) {
            return new InterpolatorC0379k(this, C0284q.zy(this.f48306zy.f2415g));
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: g */
    public void m1527g(MotionLayout motionLayout, int currentState) {
        for (toq toqVar : this.f2406n) {
            if (toqVar.f48327qrj.size() > 0) {
                Iterator it = toqVar.f48327qrj.iterator();
                while (it.hasNext()) {
                    ((toq.ViewOnClickListenerC0380k) it.next()).zy(motionLayout);
                }
            }
        }
        for (toq toqVar2 : this.f48296f7l8) {
            if (toqVar2.f48327qrj.size() > 0) {
                Iterator it2 = toqVar2.f48327qrj.iterator();
                while (it2.hasNext()) {
                    ((toq.ViewOnClickListenerC0380k) it2.next()).zy(motionLayout);
                }
            }
        }
        for (toq toqVar3 : this.f2406n) {
            if (toqVar3.f48327qrj.size() > 0) {
                Iterator it3 = toqVar3.f48327qrj.iterator();
                while (it3.hasNext()) {
                    ((toq.ViewOnClickListenerC0380k) it3.next()).m1555k(motionLayout, currentState, toqVar3);
                }
            }
        }
        for (toq toqVar4 : this.f48296f7l8) {
            if (toqVar4.f48327qrj.size() > 0) {
                Iterator it4 = toqVar4.f48327qrj.iterator();
                while (it4.hasNext()) {
                    ((toq.ViewOnClickListenerC0380k) it4.next()).m1555k(motionLayout, currentState, toqVar4);
                }
            }
        }
    }

    int gvn7() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0;
        }
        return this.f48306zy.f48329x2.qrj();
    }

    /* JADX INFO: renamed from: h */
    C0397q m1528h(int id, int width, int height) {
        int iM1707n;
        if (this.f48300ld6) {
            System.out.println("id " + id);
            System.out.println("size " + this.f2410y.size());
        }
        C0399y c0399y = this.f48304toq;
        if (c0399y != null && (iM1707n = c0399y.m1707n(id, width, height)) != -1) {
            id = iM1707n;
        }
        if (this.f2410y.get(id) != null) {
            return this.f2410y.get(id);
        }
        Log.e(zurt.InterfaceC0292q.f1742k, "Warning could not find ConstraintSet id/" + zy.m1601s(this.f2405k.getContext(), id) + " In MotionScene");
        SparseArray<C0397q> sparseArray = this.f2410y;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* JADX INFO: renamed from: i */
    public int m1529i() {
        toq toqVar = this.f48306zy;
        return toqVar != null ? toqVar.f2422y : this.f48305x2;
    }

    public void i1(int duration) {
        toq toqVar = this.f48306zy;
        if (toqVar != null) {
            toqVar.dd(duration);
        } else {
            this.f48305x2 = duration;
        }
    }

    boolean jk() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return false;
        }
        return this.f48306zy.f48329x2.ld6();
    }

    public int[] ki() {
        int size = this.f2410y.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f2410y.keyAt(i2);
        }
        return iArr;
    }

    C0397q kja0(int id) {
        return m1528h(id, -1, -1);
    }

    public void ld6(boolean disable) {
        this.f2408q = disable;
    }

    public int lrht(String id) {
        Integer num = this.f2409s.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    boolean lv5() {
        Iterator<toq> it = this.f2406n.iterator();
        while (it.hasNext()) {
            if (it.next().f48329x2 != null) {
                return true;
            }
        }
        toq toqVar = this.f48306zy;
        return (toqVar == null || toqVar.f48329x2 == null) ? false : true;
    }

    public float lvui() {
        toq toqVar = this.f48306zy;
        if (toqVar != null) {
            return toqVar.f2421s;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    void m1530m(float dx, float dy) {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return;
        }
        this.f48306zy.f48329x2.fu4(dx, dy);
    }

    float mcp() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.m1590p();
    }

    boolean n5r1(View view, int position) {
        toq toqVar = this.f48306zy;
        if (toqVar == null) {
            return false;
        }
        Iterator it = toqVar.f48325ld6.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC0368g> it2 = ((C0378s) it.next()).m1516q(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f2240k == position) {
                    return true;
                }
            }
        }
        return false;
    }

    int n7h() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0;
        }
        return this.f48306zy.f48329x2.m1589n();
    }

    public List<toq> ncyb(int stateId) {
        int iJp0y = jp0y(stateId);
        ArrayList arrayList = new ArrayList();
        for (toq toqVar : this.f2406n) {
            if (toqVar.f2420q == iJp0y || toqVar.f48330zy == iJp0y) {
                arrayList.add(toqVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    void m1531o(float dx, float dy) {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return;
        }
        this.f48306zy.f48329x2.ni7(dx, dy);
    }

    public void o1t(kja0 motionController) {
        toq toqVar = this.f48306zy;
        if (toqVar != null) {
            Iterator it = toqVar.f48325ld6.iterator();
            while (it.hasNext()) {
                ((C0378s) it.next()).toq(motionController);
            }
        } else {
            toq toqVar2 = this.f2402g;
            if (toqVar2 != null) {
                Iterator it2 = toqVar2.f48325ld6.iterator();
                while (it2.hasNext()) {
                    ((C0378s) it2.next()).toq(motionController);
                }
            }
        }
    }

    float oc() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.kja0();
    }

    /* JADX INFO: renamed from: p */
    public toq m1532p(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState == -1) {
            return this.f48306zy;
        }
        List<toq> listNcyb = ncyb(currentState);
        float f2 = 0.0f;
        toq toqVar = null;
        RectF rectF = new RectF();
        for (toq toqVar2 : listNcyb) {
            if (!toqVar2.f48324kja0 && toqVar2.f48329x2 != null) {
                toqVar2.f48329x2.jk(this.f48298ki);
                RectF rectFKi = toqVar2.f48329x2.ki(this.f2405k, rectF);
                if (rectFKi == null || lastTouchDown == null || rectFKi.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                    RectF rectFF7l8 = toqVar2.f48329x2.f7l8(this.f2405k, rectF);
                    if (rectFF7l8 == null || lastTouchDown == null || rectFF7l8.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        float fM1588k = toqVar2.f48329x2.m1588k(dx, dy);
                        if (toqVar2.f48329x2.f48440x2 && lastTouchDown != null) {
                            fM1588k = ((float) (Math.atan2(dy + r10, dx + r9) - Math.atan2(lastTouchDown.getX() - toqVar2.f48329x2.f2491s, lastTouchDown.getY() - toqVar2.f48329x2.f2489p))) * 10.0f;
                        }
                        float f3 = fM1588k * (toqVar2.f48330zy == currentState ? -1.0f : 1.1f);
                        if (f3 > f2) {
                            toqVar = toqVar2;
                            f2 = f3;
                        }
                    }
                }
            }
        }
        return toqVar;
    }

    public int qrj() {
        toq toqVar = this.f48306zy;
        if (toqVar != null) {
            return toqVar.f2416h;
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    int m1533r() {
        toq toqVar = this.f48306zy;
        if (toqVar == null) {
            return -1;
        }
        return toqVar.f2420q;
    }

    /* JADX INFO: renamed from: s */
    boolean m1534s(MotionLayout motionLayout, int currentState) {
        toq toqVar;
        if (hyr() || this.f2408q) {
            return false;
        }
        for (toq toqVar2 : this.f2406n) {
            if (toqVar2.f48326n7h != 0 && ((toqVar = this.f48306zy) != toqVar2 || !toqVar.d2ok(2))) {
                if (currentState == toqVar2.f2420q && (toqVar2.f48326n7h == 4 || toqVar2.f48326n7h == 2)) {
                    MotionLayout.qrj qrjVar = MotionLayout.qrj.FINISHED;
                    motionLayout.setState(qrjVar);
                    motionLayout.setTransition(toqVar2);
                    if (toqVar2.f48326n7h == 4) {
                        motionLayout.ixz();
                        motionLayout.setState(MotionLayout.qrj.SETUP);
                        motionLayout.setState(MotionLayout.qrj.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.gbni(true);
                        motionLayout.setState(MotionLayout.qrj.SETUP);
                        motionLayout.setState(MotionLayout.qrj.MOVING);
                        motionLayout.setState(qrjVar);
                        motionLayout.ktq();
                    }
                    return true;
                }
                if (currentState == toqVar2.f48330zy && (toqVar2.f48326n7h == 3 || toqVar2.f48326n7h == 1)) {
                    MotionLayout.qrj qrjVar2 = MotionLayout.qrj.FINISHED;
                    motionLayout.setState(qrjVar2);
                    motionLayout.setTransition(toqVar2);
                    if (toqVar2.f48326n7h == 3) {
                        motionLayout.ukdy();
                        motionLayout.setState(MotionLayout.qrj.SETUP);
                        motionLayout.setState(MotionLayout.qrj.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.gbni(true);
                        motionLayout.setState(MotionLayout.qrj.SETUP);
                        motionLayout.setState(MotionLayout.qrj.MOVING);
                        motionLayout.setState(qrjVar2);
                        motionLayout.ktq();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    float m1535t() {
        toq toqVar = this.f48306zy;
        if (toqVar == null || toqVar.f48329x2 == null) {
            return 0.0f;
        }
        return this.f48306zy.f48329x2.m1592s();
    }

    public boolean t8iq(MotionLayout layout) {
        return layout == this.f2405k && layout.bl == this;
    }

    public ArrayList<toq> t8r() {
        return this.f2406n;
    }

    /* JADX INFO: renamed from: u */
    public void m1536u(int id, View... view) {
        this.f48303t8r.qrj(id, view);
    }

    public String uv6(int id) {
        for (Map.Entry<String, Integer> entry : this.f2409s.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void vyq(boolean changed, int left, int top, int right, int bottom) {
    }

    /* JADX INFO: renamed from: x */
    public void m1537x(toq transition) {
        this.f48306zy = transition;
        if (transition == null || transition.f48329x2 == null) {
            return;
        }
        this.f48306zy.f48329x2.jk(this.f48298ki);
    }

    public void x2(int id, boolean enable) {
        this.f48303t8r.m1560g(id, enable);
    }

    int x9kr(int stateId) {
        Iterator<toq> it = this.f2406n.iterator();
        while (it.hasNext()) {
            if (it.next().f2420q == stateId) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public boolean m1538y(int viewTransitionId, kja0 motionController) {
        return this.f48303t8r.m1561n(viewTransitionId, motionController);
    }

    void y9n(MotionLayout motionLayout) {
        for (int i2 = 0; i2 < this.f2410y.size(); i2++) {
            int iKeyAt = this.f2410y.keyAt(i2);
            if (m1521l(iKeyAt)) {
                Log.e(zurt.InterfaceC0292q.f1742k, "Cannot be derived from yourself");
                return;
            }
            yz(iKeyAt, motionLayout);
        }
    }

    /* JADX INFO: renamed from: z */
    AbstractC0368g m1539z(Context context, int type, int target, int position) {
        toq toqVar = this.f48306zy;
        if (toqVar == null) {
            return null;
        }
        for (C0378s c0378s : toqVar.f48325ld6) {
            for (Integer num : c0378s.m1515n()) {
                if (target == num.intValue()) {
                    for (AbstractC0368g abstractC0368g : c0378s.m1516q(num.intValue())) {
                        if (abstractC0368g.f2240k == position && abstractC0368g.f2242q == type) {
                            return abstractC0368g;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void zp(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.y r0 = r6.f48304toq
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.m1707n(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.y r2 = r6.f48304toq
            int r2 = r2.m1707n(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            androidx.constraintlayout.motion.widget.t8r$toq r3 = r6.f48306zy
            if (r3 == 0) goto L2b
            int r3 = androidx.constraintlayout.motion.widget.t8r.toq.m1542k(r3)
            if (r3 != r8) goto L2b
            androidx.constraintlayout.motion.widget.t8r$toq r3 = r6.f48306zy
            int r3 = androidx.constraintlayout.motion.widget.t8r.toq.zy(r3)
            if (r3 != r7) goto L2b
            return
        L2b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t8r$toq> r3 = r6.f2406n
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t8r$toq r4 = (androidx.constraintlayout.motion.widget.t8r.toq) r4
            int r5 = androidx.constraintlayout.motion.widget.t8r.toq.m1542k(r4)
            if (r5 != r2) goto L49
            int r5 = androidx.constraintlayout.motion.widget.t8r.toq.zy(r4)
            if (r5 == r0) goto L55
        L49:
            int r5 = androidx.constraintlayout.motion.widget.t8r.toq.m1542k(r4)
            if (r5 != r8) goto L31
            int r5 = androidx.constraintlayout.motion.widget.t8r.toq.zy(r4)
            if (r5 != r7) goto L31
        L55:
            r6.f48306zy = r4
            if (r4 == 0) goto L6a
            androidx.constraintlayout.motion.widget.zurt r7 = androidx.constraintlayout.motion.widget.t8r.toq.x2(r4)
            if (r7 == 0) goto L6a
            androidx.constraintlayout.motion.widget.t8r$toq r7 = r6.f48306zy
            androidx.constraintlayout.motion.widget.zurt r7 = androidx.constraintlayout.motion.widget.t8r.toq.x2(r7)
            boolean r8 = r6.f48298ki
            r7.jk(r8)
        L6a:
            return
        L6b:
            androidx.constraintlayout.motion.widget.t8r$toq r7 = r6.f2402g
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t8r$toq> r3 = r6.f48296f7l8
            java.util.Iterator r3 = r3.iterator()
        L73:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t8r$toq r4 = (androidx.constraintlayout.motion.widget.t8r.toq) r4
            int r5 = androidx.constraintlayout.motion.widget.t8r.toq.m1542k(r4)
            if (r5 != r8) goto L73
            r7 = r4
            goto L73
        L87:
            androidx.constraintlayout.motion.widget.t8r$toq r8 = new androidx.constraintlayout.motion.widget.t8r$toq
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.t8r.toq.m1545q(r8, r0)
            androidx.constraintlayout.motion.widget.t8r.toq.toq(r8, r2)
            if (r0 == r1) goto L99
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t8r$toq> r7 = r6.f2406n
            r7.add(r8)
        L99:
            r6.f48306zy = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t8r.zp(int, int):void");
    }

    /* JADX INFO: compiled from: MotionScene.java */
    public static class toq {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public static final int f48307a9 = 2;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public static final int f48308d3 = 6;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final int f48309fn3e = 2;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public static final int f48310fti = 3;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        static final int f48311fu4 = 1;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public static final int f48312gvn7 = 5;

        /* JADX INFO: renamed from: i */
        public static final int f2412i = 1;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public static final int f48313jk = 1;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public static final int f48314jp0y = 4;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public static final int f48315mcp = 0;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final int f48316ni7 = 4;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        static final int f48317o1t = 4;

        /* JADX INFO: renamed from: t */
        public static final int f2413t = -1;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f48318t8r = 0;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final int f48319wvg = -2;

        /* JADX INFO: renamed from: z */
        static final int f2414z = 2;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final int f48320zurt = 3;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private int f48321cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f48322f7l8;

        /* JADX INFO: renamed from: g */
        private String f2415g;

        /* JADX INFO: renamed from: h */
        private int f2416h;

        /* JADX INFO: renamed from: k */
        private int f2417k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private int f48323ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f48324kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private ArrayList<C0378s> f48325ld6;

        /* JADX INFO: renamed from: n */
        private int f2418n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private int f48326n7h;

        /* JADX INFO: renamed from: p */
        private final t8r f2419p;

        /* JADX INFO: renamed from: q */
        private int f2420q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private ArrayList<ViewOnClickListenerC0380k> f48327qrj;

        /* JADX INFO: renamed from: s */
        private float f2421s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f48328toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private zurt f48329x2;

        /* JADX INFO: renamed from: y */
        private int f2422y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f48330zy;

        toq(t8r motionScene, toq global) {
            this.f2417k = -1;
            this.f48328toq = false;
            this.f48330zy = -1;
            this.f2420q = -1;
            this.f2418n = 0;
            this.f2415g = null;
            this.f48322f7l8 = -1;
            this.f2422y = 400;
            this.f2421s = 0.0f;
            this.f48325ld6 = new ArrayList<>();
            this.f48329x2 = null;
            this.f48327qrj = new ArrayList<>();
            this.f48326n7h = 0;
            this.f48324kja0 = false;
            this.f2416h = -1;
            this.f48321cdj = 0;
            this.f48323ki = 0;
            this.f2419p = motionScene;
            this.f2422y = motionScene.f48305x2;
            if (global != null) {
                this.f2416h = global.f2416h;
                this.f2418n = global.f2418n;
                this.f2415g = global.f2415g;
                this.f48322f7l8 = global.f48322f7l8;
                this.f2422y = global.f2422y;
                this.f48325ld6 = global.f48325ld6;
                this.f2421s = global.f2421s;
                this.f48321cdj = global.f48321cdj;
            }
        }

        private void fu4(t8r motionScene, Context context, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                if (index == C0394g.qrj.qp5l) {
                    this.f48330zy = a2.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f48330zy);
                    if (C3678q.f65834ni7.equals(resourceTypeName)) {
                        C0397q c0397q = new C0397q();
                        c0397q.c8jq(context, this.f48330zy);
                        motionScene.f2410y.append(this.f48330zy, c0397q);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f48330zy = motionScene.nn86(context, this.f48330zy);
                    }
                } else if (index == C0394g.qrj.pj7) {
                    this.f2420q = a2.getResourceId(index, this.f2420q);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f2420q);
                    if (C3678q.f65834ni7.equals(resourceTypeName2)) {
                        C0397q c0397q2 = new C0397q();
                        c0397q2.c8jq(context, this.f2420q);
                        motionScene.f2410y.append(this.f2420q, c0397q2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f2420q = motionScene.nn86(context, this.f2420q);
                    }
                } else if (index == C0394g.qrj.x0) {
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = a2.getResourceId(index, -1);
                        this.f48322f7l8 = resourceId;
                        if (resourceId != -1) {
                            this.f2418n = -2;
                        }
                    } else if (i3 == 3) {
                        String string = a2.getString(index);
                        this.f2415g = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f48322f7l8 = a2.getResourceId(index, -1);
                                this.f2418n = -2;
                            } else {
                                this.f2418n = -1;
                            }
                        }
                    } else {
                        this.f2418n = a2.getInteger(index, this.f2418n);
                    }
                } else if (index == C0394g.qrj.n1p9) {
                    int i4 = a2.getInt(index, this.f2422y);
                    this.f2422y = i4;
                    if (i4 < 8) {
                        this.f2422y = 8;
                    }
                } else if (index == C0394g.qrj.j5) {
                    this.f2421s = a2.getFloat(index, this.f2421s);
                } else if (index == C0394g.qrj.v9zx) {
                    this.f48326n7h = a2.getInteger(index, this.f48326n7h);
                } else if (index == C0394g.qrj.pub6) {
                    this.f2417k = a2.getResourceId(index, this.f2417k);
                } else if (index == C0394g.qrj.b10b) {
                    this.f48324kja0 = a2.getBoolean(index, this.f48324kja0);
                } else if (index == C0394g.qrj.n7c) {
                    this.f2416h = a2.getInteger(index, -1);
                } else if (index == C0394g.qrj.y380) {
                    this.f48321cdj = a2.getInteger(index, 0);
                } else if (index == C0394g.qrj.km71) {
                    this.f48323ki = a2.getInteger(index, 0);
                }
            }
            if (this.f2420q == -1) {
                this.f48328toq = true;
            }
        }

        /* JADX INFO: renamed from: z */
        private void m1548z(t8r motionScene, Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.dg4q);
            fu4(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int a9() {
            return this.f48321cdj;
        }

        /* JADX INFO: renamed from: c */
        public void m1549c(int arcMode) {
            this.f2416h = arcMode;
        }

        public boolean d2ok(int flag) {
            return (flag & this.f48323ki) != 0;
        }

        public int d3() {
            return this.f2420q;
        }

        public void dd(int duration) {
            this.f2422y = Math.max(duration, 8);
        }

        public boolean eqxt() {
            return !this.f48324kja0;
        }

        /* JADX INFO: renamed from: f */
        public void m1550f(int touchUpMode) {
            zurt zurtVarOc = oc();
            if (zurtVarOc != null) {
                zurtVarOc.fti(touchUpMode);
            }
        }

        public void fn3e(int id, int action) {
            for (ViewOnClickListenerC0380k viewOnClickListenerC0380k : this.f48327qrj) {
                if (viewOnClickListenerC0380k.f2430q == id) {
                    viewOnClickListenerC0380k.f2429n = action;
                    return;
                }
            }
            this.f48327qrj.add(new ViewOnClickListenerC0380k(this, id, action));
        }

        public List<ViewOnClickListenerC0380k> fti() {
            return this.f48327qrj;
        }

        public float gvn7() {
            return this.f2421s;
        }

        public void hyr(C0370i onSwipe) {
            this.f48329x2 = onSwipe == null ? null : new zurt(this.f2419p.f2405k, onSwipe);
        }

        /* JADX INFO: renamed from: i */
        public void m1551i(C0378s keyFrames) {
            this.f48325ld6.add(keyFrames);
        }

        public List<C0378s> jk() {
            return this.f48325ld6;
        }

        public int jp0y() {
            return this.f2416h;
        }

        /* JADX INFO: renamed from: l */
        public void m1552l(int interpolator, String interpolatorString, int interpolatorID) {
            this.f2418n = interpolator;
            this.f2415g = interpolatorString;
            this.f48322f7l8 = interpolatorID;
        }

        public void lrht(float stagger) {
            this.f2421s = stagger;
        }

        public void lvui(int id) {
            ViewOnClickListenerC0380k next;
            Iterator<ViewOnClickListenerC0380k> it = this.f48327qrj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.f2430q == id) {
                        break;
                    }
                }
            }
            if (next != null) {
                this.f48327qrj.remove(next);
            }
        }

        public int mcp() {
            return this.f2417k;
        }

        public void n5r1(int mode) {
            this.f48321cdj = mode;
        }

        public void ncyb(boolean enable) {
            this.f48324kja0 = !enable;
        }

        public String ni7(Context context) {
            String resourceEntryName = this.f2420q == -1 ? "null" : context.getResources().getResourceEntryName(this.f2420q);
            if (this.f48330zy == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f48330zy);
        }

        public int o1t() {
            return this.f48326n7h;
        }

        public zurt oc() {
            return this.f48329x2;
        }

        /* JADX INFO: renamed from: r */
        public void m1553r(int type) {
            this.f48326n7h = type;
        }

        /* JADX INFO: renamed from: t */
        public int m1554t() {
            return this.f48330zy;
        }

        public void uv6(int flag) {
            this.f48323ki = flag;
        }

        public int wvg() {
            return this.f2422y;
        }

        public void x9kr(boolean enable) {
            ncyb(enable);
        }

        public void zurt(Context context, XmlPullParser parser) {
            this.f48327qrj.add(new ViewOnClickListenerC0380k(context, this, parser));
        }

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.t8r$toq$k */
        /* JADX INFO: compiled from: MotionScene.java */
        public static class ViewOnClickListenerC0380k implements View.OnClickListener {

            /* JADX INFO: renamed from: g */
            public static final int f2423g = 1;

            /* JADX INFO: renamed from: h */
            public static final int f2424h = 4096;

            /* JADX INFO: renamed from: p */
            public static final int f2425p = 256;

            /* JADX INFO: renamed from: s */
            public static final int f2426s = 16;

            /* JADX INFO: renamed from: y */
            public static final int f2427y = 17;

            /* JADX INFO: renamed from: k */
            private final toq f2428k;

            /* JADX INFO: renamed from: n */
            int f2429n;

            /* JADX INFO: renamed from: q */
            int f2430q;

            public ViewOnClickListenerC0380k(Context context, toq transition, XmlPullParser parser) {
                this.f2430q = -1;
                this.f2429n = 17;
                this.f2428k = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.u3);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == C0394g.qrj.mmdq) {
                        this.f2430q = typedArrayObtainStyledAttributes.getResourceId(index, this.f2430q);
                    } else if (index == C0394g.qrj.ly) {
                        this.f2429n = typedArrayObtainStyledAttributes.getInt(index, this.f2429n);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX INFO: renamed from: k */
            public void m1555k(MotionLayout motionLayout, int i2, toq toqVar) {
                int i3 = this.f2430q;
                View viewFindViewById = motionLayout;
                if (i3 != -1) {
                    viewFindViewById = motionLayout.findViewById(i3);
                }
                if (viewFindViewById == null) {
                    Log.e(zurt.InterfaceC0292q.f1742k, "OnClick could not find id " + this.f2430q);
                    return;
                }
                int i4 = toqVar.f2420q;
                int i5 = toqVar.f48330zy;
                if (i4 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i6 = this.f2429n;
                boolean z2 = false;
                boolean z3 = ((i6 & 1) != 0 && i2 == i4) | ((i6 & 1) != 0 && i2 == i4) | ((i6 & 256) != 0 && i2 == i4) | ((i6 & 16) != 0 && i2 == i5);
                if ((i6 & 4096) != 0 && i2 == i5) {
                    z2 = true;
                }
                if (z3 || z2) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f2428k.f2419p.f2405k;
                if (motionLayout.gc3c()) {
                    if (this.f2428k.f2420q == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.ebn(this.f2428k.f48330zy);
                            return;
                        }
                        toq toqVar = new toq(this.f2428k.f2419p, this.f2428k);
                        toqVar.f2420q = currentState;
                        toqVar.f48330zy = this.f2428k.f48330zy;
                        motionLayout.setTransition(toqVar);
                        motionLayout.ixz();
                        return;
                    }
                    toq toqVar2 = this.f2428k.f2419p.f48306zy;
                    int i2 = this.f2429n;
                    boolean z2 = false;
                    boolean z3 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
                    boolean z5 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z3 && z5) {
                        toq toqVar3 = this.f2428k.f2419p.f48306zy;
                        toq toqVar4 = this.f2428k;
                        if (toqVar3 != toqVar4) {
                            motionLayout.setTransition(toqVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z5 = false;
                            z2 = z3;
                        }
                    } else {
                        z2 = z3;
                    }
                    if (toq(toqVar2, motionLayout)) {
                        if (z2 && (this.f2429n & 1) != 0) {
                            motionLayout.setTransition(this.f2428k);
                            motionLayout.ixz();
                            return;
                        }
                        if (z5 && (this.f2429n & 16) != 0) {
                            motionLayout.setTransition(this.f2428k);
                            motionLayout.ukdy();
                        } else if (z2 && (this.f2429n & 256) != 0) {
                            motionLayout.setTransition(this.f2428k);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z5 || (this.f2429n & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f2428k);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            boolean toq(toq current, MotionLayout tl) {
                toq toqVar = this.f2428k;
                if (toqVar == current) {
                    return true;
                }
                int i2 = toqVar.f48330zy;
                int i3 = this.f2428k.f2420q;
                if (i3 == -1) {
                    return tl.ax != i2;
                }
                int i4 = tl.ax;
                return i4 == i3 || i4 == i2;
            }

            public void zy(MotionLayout motionLayout) {
                int i2 = this.f2430q;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e(zurt.InterfaceC0292q.f1742k, " (*)  could not find id " + this.f2430q);
            }

            public ViewOnClickListenerC0380k(toq transition, int id, int action) {
                this.f2428k = transition;
                this.f2430q = id;
                this.f2429n = action;
            }
        }

        public toq(int id, t8r motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.f2417k = -1;
            this.f48328toq = false;
            this.f48330zy = -1;
            this.f2420q = -1;
            this.f2418n = 0;
            this.f2415g = null;
            this.f48322f7l8 = -1;
            this.f2422y = 400;
            this.f2421s = 0.0f;
            this.f48325ld6 = new ArrayList<>();
            this.f48329x2 = null;
            this.f48327qrj = new ArrayList<>();
            this.f48326n7h = 0;
            this.f48324kja0 = false;
            this.f2416h = -1;
            this.f48321cdj = 0;
            this.f48323ki = 0;
            this.f2417k = id;
            this.f2419p = motionScene;
            this.f2420q = constraintSetStartId;
            this.f48330zy = constraintSetEndId;
            this.f2422y = motionScene.f48305x2;
            this.f48321cdj = motionScene.f48302qrj;
        }

        toq(t8r motionScene, Context context, XmlPullParser parser) {
            this.f2417k = -1;
            this.f48328toq = false;
            this.f48330zy = -1;
            this.f2420q = -1;
            this.f2418n = 0;
            this.f2415g = null;
            this.f48322f7l8 = -1;
            this.f2422y = 400;
            this.f2421s = 0.0f;
            this.f48325ld6 = new ArrayList<>();
            this.f48329x2 = null;
            this.f48327qrj = new ArrayList<>();
            this.f48326n7h = 0;
            this.f48324kja0 = false;
            this.f2416h = -1;
            this.f48321cdj = 0;
            this.f48323ki = 0;
            this.f2422y = motionScene.f48305x2;
            this.f48321cdj = motionScene.f48302qrj;
            this.f2419p = motionScene;
            m1548z(motionScene, context, Xml.asAttributeSet(parser));
        }
    }

    t8r(Context context, MotionLayout layout, int resourceID) {
        this.f2405k = layout;
        this.f48303t8r = new wvg(layout);
        m1517c(context, resourceID);
        SparseArray<C0397q> sparseArray = this.f2410y;
        int i2 = C0394g.f7l8.f48589b8;
        sparseArray.put(i2, new C0397q());
        this.f2409s.put("motion_base", Integer.valueOf(i2));
    }
}
