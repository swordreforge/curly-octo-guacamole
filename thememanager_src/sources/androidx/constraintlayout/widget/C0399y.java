package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0394g;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.y */
/* JADX INFO: compiled from: StateSet.java */
/* JADX INFO: loaded from: classes.dex */
public class C0399y {

    /* JADX INFO: renamed from: s */
    private static final boolean f3036s = false;

    /* JADX INFO: renamed from: y */
    public static final String f3037y = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C0397q f50002toq;

    /* JADX INFO: renamed from: k */
    int f3039k = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f50003zy = -1;

    /* JADX INFO: renamed from: q */
    int f3041q = -1;

    /* JADX INFO: renamed from: n */
    private SparseArray<k> f3040n = new SparseArray<>();

    /* JADX INFO: renamed from: g */
    private SparseArray<C0397q> f3038g = new SparseArray<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private AbstractC0396n f50001f7l8 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.y$k */
    /* JADX INFO: compiled from: StateSet.java */
    static class k {

        /* JADX INFO: renamed from: k */
        int f3042k;

        /* JADX INFO: renamed from: q */
        boolean f3043q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ArrayList<toq> f50004toq = new ArrayList<>();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f50005zy;

        public k(Context context, XmlPullParser parser) {
            this.f50005zy = -1;
            this.f3043q = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.u7l5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.gm) {
                    this.f3042k = typedArrayObtainStyledAttributes.getResourceId(index, this.f3042k);
                } else if (index == C0394g.qrj.y9h3) {
                    this.f50005zy = typedArrayObtainStyledAttributes.getResourceId(index, this.f50005zy);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f50005zy);
                    context.getResources().getResourceName(this.f50005zy);
                    if (C3678q.f65834ni7.equals(resourceTypeName)) {
                        this.f3043q = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        void m1709k(toq size) {
            this.f50004toq.add(size);
        }

        public int toq(float width, float height) {
            for (int i2 = 0; i2 < this.f50004toq.size(); i2++) {
                if (this.f50004toq.get(i2).m1710k(width, height)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.y$toq */
    /* JADX INFO: compiled from: StateSet.java */
    static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f50006f7l8;

        /* JADX INFO: renamed from: g */
        int f3044g;

        /* JADX INFO: renamed from: k */
        int f3045k;

        /* JADX INFO: renamed from: n */
        float f3046n;

        /* JADX INFO: renamed from: q */
        float f3047q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f50007toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f50008zy;

        public toq(Context context, XmlPullParser parser) {
            this.f50007toq = Float.NaN;
            this.f50008zy = Float.NaN;
            this.f3047q = Float.NaN;
            this.f3046n = Float.NaN;
            this.f3044g = -1;
            this.f50006f7l8 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.lp7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.be) {
                    this.f3044g = typedArrayObtainStyledAttributes.getResourceId(index, this.f3044g);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3044g);
                    context.getResources().getResourceName(this.f3044g);
                    if (C3678q.f65834ni7.equals(resourceTypeName)) {
                        this.f50006f7l8 = true;
                    }
                } else if (index == C0394g.qrj.qh) {
                    this.f3046n = typedArrayObtainStyledAttributes.getDimension(index, this.f3046n);
                } else if (index == C0394g.qrj.m9j) {
                    this.f50008zy = typedArrayObtainStyledAttributes.getDimension(index, this.f50008zy);
                } else if (index == C0394g.qrj.oay) {
                    this.f3047q = typedArrayObtainStyledAttributes.getDimension(index, this.f3047q);
                } else if (index == C0394g.qrj.c7hg) {
                    this.f50007toq = typedArrayObtainStyledAttributes.getDimension(index, this.f50007toq);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        boolean m1710k(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f50007toq) && widthDp < this.f50007toq) {
                return false;
            }
            if (!Float.isNaN(this.f50008zy) && heightDp < this.f50008zy) {
                return false;
            }
            if (Float.isNaN(this.f3047q) || widthDp <= this.f3047q) {
                return Float.isNaN(this.f3046n) || heightDp <= this.f3046n;
            }
            return false;
        }
    }

    public C0399y(Context context, XmlPullParser parser) {
        toq(context, parser);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void toq(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = androidx.constraintlayout.widget.C0394g.qrj.gun
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C0394g.qrj.zx6
            if (r4 != r5) goto L22
            int r5 = r9.f3039k
            int r4 = r0.getResourceId(r4, r5)
            r9.f3039k = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
        L2d:
            r3 = 1
            if (r1 == r3) goto La8
            if (r1 == 0) goto L97
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L47
            if (r1 == r5) goto L3c
            goto L9a
        L3c:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            boolean r1 = r4.equals(r1)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L9a
            return
        L47:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r7 = -1
            int r8 = r1.hashCode()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            switch(r8) {
                case 80204913: goto L6f;
                case 1301459538: goto L65;
                case 1382829617: goto L5e;
                case 1901439077: goto L54;
                default: goto L53;
            }     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
        L53:
            goto L79
        L54:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L79
            r3 = r5
            goto L7a
        L5e:
            boolean r1 = r1.equals(r4)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L79
            goto L7a
        L65:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L79
            r3 = r2
            goto L7a
        L6f:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L79
            r3 = r6
            goto L7a
        L79:
            r3 = r7
        L7a:
            if (r3 == r6) goto L8a
            if (r3 == r5) goto L7f
            goto L9a
        L7f:
            androidx.constraintlayout.widget.y$toq r1 = new androidx.constraintlayout.widget.y$toq     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r1.<init>(r10, r11)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L9a
            r0.m1709k(r1)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            goto L9a
        L8a:
            androidx.constraintlayout.widget.y$k r0 = new androidx.constraintlayout.widget.y$k     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r0.<init>(r10, r11)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            android.util.SparseArray<androidx.constraintlayout.widget.y$k> r1 = r9.f3040n     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            int r3 = r0.f3042k     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r1.put(r3, r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            goto L9a
        L97:
            r11.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
        L9a:
            int r1 = r11.next()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            goto L2d
        L9f:
            r10 = move-exception
            r10.printStackTrace()
            goto La8
        La4:
            r10 = move-exception
            r10.printStackTrace()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0399y.toq(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX INFO: renamed from: g */
    public int m1705g(int currentId, int id, float width, float height) {
        int qVar;
        if (currentId == id) {
            k kVarValueAt = id == -1 ? this.f3040n.valueAt(0) : this.f3040n.get(this.f50003zy);
            if (kVarValueAt == null) {
                return -1;
            }
            return ((this.f3041q == -1 || !kVarValueAt.f50004toq.get(currentId).m1710k(width, height)) && currentId != (qVar = kVarValueAt.toq(width, height))) ? qVar == -1 ? kVarValueAt.f50005zy : kVarValueAt.f50004toq.get(qVar).f3044g : currentId;
        }
        k kVar = this.f3040n.get(id);
        if (kVar == null) {
            return -1;
        }
        int qVar2 = kVar.toq(width, height);
        return qVar2 == -1 ? kVar.f50005zy : kVar.f50004toq.get(qVar2).f3044g;
    }

    /* JADX INFO: renamed from: k */
    public int m1706k(int currentConstrainSettId, int stateId, float width, float height) {
        k kVar = this.f3040n.get(stateId);
        if (kVar == null) {
            return stateId;
        }
        if (width == -1.0f || height == -1.0f) {
            if (kVar.f50005zy == currentConstrainSettId) {
                return currentConstrainSettId;
            }
            Iterator<toq> it = kVar.f50004toq.iterator();
            while (it.hasNext()) {
                if (currentConstrainSettId == it.next().f3044g) {
                    return currentConstrainSettId;
                }
            }
            return kVar.f50005zy;
        }
        toq toqVar = null;
        for (toq toqVar2 : kVar.f50004toq) {
            if (toqVar2.m1710k(width, height)) {
                if (currentConstrainSettId == toqVar2.f3044g) {
                    return currentConstrainSettId;
                }
                toqVar = toqVar2;
            }
        }
        return toqVar != null ? toqVar.f3044g : kVar.f50005zy;
    }

    /* JADX INFO: renamed from: n */
    public int m1707n(int id, int width, int height) {
        return m1705g(-1, id, width, height);
    }

    /* JADX INFO: renamed from: q */
    public void m1708q(AbstractC0396n constraintsChangedListener) {
        this.f50001f7l8 = constraintsChangedListener;
    }

    public boolean zy(int id, float width, float height) {
        int i2 = this.f50003zy;
        if (i2 != id) {
            return true;
        }
        k kVarValueAt = id == -1 ? this.f3040n.valueAt(0) : this.f3040n.get(i2);
        int i3 = this.f3041q;
        return (i3 == -1 || !kVarValueAt.f50004toq.get(i3).m1710k(width, height)) && this.f3041q != kVarValueAt.toq(width, height);
    }
}
