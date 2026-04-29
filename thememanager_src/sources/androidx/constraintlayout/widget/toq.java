package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0394g;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: ConstraintLayoutStates.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: s */
    private static final boolean f3024s = false;

    /* JADX INFO: renamed from: y */
    public static final String f3025y = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: k */
    private final ConstraintLayout f3027k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C0397q f49994toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f49995zy = -1;

    /* JADX INFO: renamed from: q */
    int f3029q = -1;

    /* JADX INFO: renamed from: n */
    private SparseArray<C0398k> f3028n = new SparseArray<>();

    /* JADX INFO: renamed from: g */
    private SparseArray<C0397q> f3026g = new SparseArray<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private AbstractC0396n f49993f7l8 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.toq$k */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    static class C0398k {

        /* JADX INFO: renamed from: k */
        int f3030k;

        /* JADX INFO: renamed from: q */
        C0397q f3031q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ArrayList<C7858toq> f49996toq = new ArrayList<>();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f49997zy;

        public C0398k(Context context, XmlPullParser parser) {
            this.f49997zy = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.u7l5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.gm) {
                    this.f3030k = typedArrayObtainStyledAttributes.getResourceId(index, this.f3030k);
                } else if (index == C0394g.qrj.y9h3) {
                    this.f49997zy = typedArrayObtainStyledAttributes.getResourceId(index, this.f49997zy);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f49997zy);
                    context.getResources().getResourceName(this.f49997zy);
                    if (C3678q.f65834ni7.equals(resourceTypeName)) {
                        C0397q c0397q = new C0397q();
                        this.f3031q = c0397q;
                        c0397q.jp0y(context, this.f49997zy);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        void m1703k(C7858toq size) {
            this.f49996toq.add(size);
        }

        public int toq(float width, float height) {
            for (int i2 = 0; i2 < this.f49996toq.size(); i2++) {
                if (this.f49996toq.get(i2).m1704k(width, height)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    static class C7858toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        C0397q f49998f7l8;

        /* JADX INFO: renamed from: g */
        int f3032g;

        /* JADX INFO: renamed from: k */
        int f3033k;

        /* JADX INFO: renamed from: n */
        float f3034n;

        /* JADX INFO: renamed from: q */
        float f3035q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f49999toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f50000zy;

        public C7858toq(Context context, XmlPullParser parser) {
            this.f49999toq = Float.NaN;
            this.f50000zy = Float.NaN;
            this.f3035q = Float.NaN;
            this.f3034n = Float.NaN;
            this.f3032g = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.lp7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.be) {
                    this.f3032g = typedArrayObtainStyledAttributes.getResourceId(index, this.f3032g);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3032g);
                    context.getResources().getResourceName(this.f3032g);
                    if (C3678q.f65834ni7.equals(resourceTypeName)) {
                        C0397q c0397q = new C0397q();
                        this.f49998f7l8 = c0397q;
                        c0397q.jp0y(context, this.f3032g);
                    }
                } else if (index == C0394g.qrj.qh) {
                    this.f3034n = typedArrayObtainStyledAttributes.getDimension(index, this.f3034n);
                } else if (index == C0394g.qrj.m9j) {
                    this.f50000zy = typedArrayObtainStyledAttributes.getDimension(index, this.f50000zy);
                } else if (index == C0394g.qrj.oay) {
                    this.f3035q = typedArrayObtainStyledAttributes.getDimension(index, this.f3035q);
                } else if (index == C0394g.qrj.c7hg) {
                    this.f49999toq = typedArrayObtainStyledAttributes.getDimension(index, this.f49999toq);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        boolean m1704k(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f49999toq) && widthDp < this.f49999toq) {
                return false;
            }
            if (!Float.isNaN(this.f50000zy) && heightDp < this.f50000zy) {
                return false;
            }
            if (Float.isNaN(this.f3035q) || widthDp <= this.f3035q) {
                return Float.isNaN(this.f3034n) || heightDp <= this.f3034n;
            }
            return false;
        }
    }

    toq(Context context, ConstraintLayout layout, int resourceID) {
        this.f3027k = layout;
        m1700k(context, resourceID);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1700k(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        Ld:
            r2 = 1
            if (r1 == r2) goto L8c
            if (r1 == 0) goto L7b
            r3 = 2
            if (r1 == r3) goto L17
            goto L7e
        L17:
            java.lang.String r1 = r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L4d;
                case 80204913: goto L43;
                case 1382829617: goto L3a;
                case 1657696882: goto L30;
                case 1901439077: goto L26;
                default: goto L25;
            }     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L25:
            goto L57
        L26:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r7
            goto L58
        L30:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 0
            goto L58
        L3a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            goto L58
        L43:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r3
            goto L58
        L4d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r6
            goto L58
        L57:
            r2 = r4
        L58:
            if (r2 == r3) goto L6e
            if (r2 == r7) goto L63
            if (r2 == r6) goto L5f
            goto L7e
        L5f:
            r8.zy(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L63:
            androidx.constraintlayout.widget.toq$toq r1 = new androidx.constraintlayout.widget.toq$toq     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L7e
            r0.m1703k(r1)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L6e:
            androidx.constraintlayout.widget.toq$k r0 = new androidx.constraintlayout.widget.toq$k     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            android.util.SparseArray<androidx.constraintlayout.widget.toq$k> r1 = r8.f3028n     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            int r2 = r0.f3030k     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.put(r2, r0)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L7b:
            r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L7e:
            int r1 = r10.next()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto Ld
        L83:
            r9 = move-exception
            r9.printStackTrace()
            goto L8c
        L88:
            r9 = move-exception
            r9.printStackTrace()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.toq.m1700k(android.content.Context, int):void");
    }

    private void zy(Context context, XmlPullParser parser) {
        C0397q c0397q = new C0397q();
        int attributeCount = parser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = parser.getAttributeName(i2);
            String attributeValue = parser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0397q.gyi(context, parser);
                this.f3026g.put(identifier, c0397q);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1701n(int id, float width, float height) {
        int qVar;
        int i2 = this.f49995zy;
        if (i2 == id) {
            C0398k c0398kValueAt = id == -1 ? this.f3028n.valueAt(0) : this.f3028n.get(i2);
            int i3 = this.f3029q;
            if ((i3 == -1 || !c0398kValueAt.f49996toq.get(i3).m1704k(width, height)) && this.f3029q != (qVar = c0398kValueAt.toq(width, height))) {
                C0397q c0397q = qVar == -1 ? this.f49994toq : c0398kValueAt.f49996toq.get(qVar).f49998f7l8;
                int i4 = qVar == -1 ? c0398kValueAt.f49997zy : c0398kValueAt.f49996toq.get(qVar).f3032g;
                if (c0397q == null) {
                    return;
                }
                this.f3029q = qVar;
                AbstractC0396n abstractC0396n = this.f49993f7l8;
                if (abstractC0396n != null) {
                    abstractC0396n.toq(-1, i4);
                }
                c0397q.ki(this.f3027k);
                AbstractC0396n abstractC0396n2 = this.f49993f7l8;
                if (abstractC0396n2 != null) {
                    abstractC0396n2.m1644k(-1, i4);
                    return;
                }
                return;
            }
            return;
        }
        this.f49995zy = id;
        C0398k c0398k = this.f3028n.get(id);
        int qVar2 = c0398k.toq(width, height);
        C0397q c0397q2 = qVar2 == -1 ? c0398k.f3031q : c0398k.f49996toq.get(qVar2).f49998f7l8;
        int i5 = qVar2 == -1 ? c0398k.f49997zy : c0398k.f49996toq.get(qVar2).f3032g;
        if (c0397q2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + id + ", dim =" + width + ", " + height);
            return;
        }
        this.f3029q = qVar2;
        AbstractC0396n abstractC0396n3 = this.f49993f7l8;
        if (abstractC0396n3 != null) {
            abstractC0396n3.toq(id, i5);
        }
        c0397q2.ki(this.f3027k);
        AbstractC0396n abstractC0396n4 = this.f49993f7l8;
        if (abstractC0396n4 != null) {
            abstractC0396n4.m1644k(id, i5);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1702q(AbstractC0396n constraintsChangedListener) {
        this.f49993f7l8 = constraintsChangedListener;
    }

    public boolean toq(int id, float width, float height) {
        int i2 = this.f49995zy;
        if (i2 != id) {
            return true;
        }
        C0398k c0398kValueAt = id == -1 ? this.f3028n.valueAt(0) : this.f3028n.get(i2);
        int i3 = this.f3029q;
        return (i3 == -1 || !c0398kValueAt.f49996toq.get(i3).m1704k(width, height)) && this.f3029q != c0398kValueAt.toq(width, height);
    }
}
