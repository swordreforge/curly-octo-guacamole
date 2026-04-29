package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C0252s;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1414q;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.cdj;
import com.airbnb.lottie.animation.keyframe.kja0;
import com.airbnb.lottie.ld6;
import com.airbnb.lottie.model.C1472q;
import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.model.content.C1450h;
import com.airbnb.lottie.model.toq;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import com.miui.maml.elements.MusicLyricParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.s */
/* JADX INFO: compiled from: TextLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1467s extends com.airbnb.lottie.model.layer.toq {

    /* JADX INFO: renamed from: c */
    @dd
    private AbstractC1421k<Float, Float> f8064c;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private final Paint f56052d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final RectF f56053d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final kja0 f56054dd;

    /* JADX INFO: renamed from: e */
    @dd
    private AbstractC1421k<Float, Float> f8065e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private final Paint f56055eqxt;

    /* JADX INFO: renamed from: f */
    @dd
    private AbstractC1421k<Integer, Integer> f8066f;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final StringBuilder f56056gvn7;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    @dd
    private AbstractC1421k<Integer, Integer> f56057hyr;

    /* JADX INFO: renamed from: l */
    @dd
    private AbstractC1421k<Integer, Integer> f8067l;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f56058lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private final Map<C1472q, List<C1414q>> f56059lvui;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    @dd
    private AbstractC1421k<Integer, Integer> f56060n5r1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private final ld6 f56061ncyb;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    @dd
    private AbstractC1421k<Typeface, Typeface> f56062nn86;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private final Matrix f56063oc;

    /* JADX INFO: renamed from: r */
    private final C0252s<String> f8068r;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f56064uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f56065vyq;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private final C1504r f56066x9kr;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.s$k */
    /* JADX INFO: compiled from: TextLayer.java */
    class k extends Paint {
        k(int i2) {
            super(i2);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.s$toq */
    /* JADX INFO: compiled from: TextLayer.java */
    class toq extends Paint {
        toq(int i2) {
            super(i2);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.s$zy */
    /* JADX INFO: compiled from: TextLayer.java */
    static /* synthetic */ class zy {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8071k;

        static {
            int[] iArr = new int[toq.EnumC1474k.values().length];
            f8071k = iArr;
            try {
                iArr[toq.EnumC1474k.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8071k[toq.EnumC1474k.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8071k[toq.EnumC1474k.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C1467s(C1504r c1504r, C1464n c1464n) {
        com.airbnb.lottie.model.animatable.toq toqVar;
        com.airbnb.lottie.model.animatable.toq toqVar2;
        C1443k c1443k;
        C1443k c1443k2;
        super(c1504r, c1464n);
        this.f56056gvn7 = new StringBuilder(2);
        this.f56053d3 = new RectF();
        this.f56063oc = new Matrix();
        this.f56055eqxt = new k(1);
        this.f56052d2ok = new toq(1);
        this.f56059lvui = new HashMap();
        this.f8068r = new C0252s<>();
        this.f56066x9kr = c1504r;
        this.f56061ncyb = c1464n.toq();
        kja0 kja0VarMo5997k = c1464n.t8r().mo5997k();
        this.f56054dd = kja0VarMo5997k;
        kja0VarMo5997k.m5922k(this);
        m6084s(kja0VarMo5997k);
        com.airbnb.lottie.model.animatable.ld6 ld6VarM6067i = c1464n.m6067i();
        if (ld6VarM6067i != null && (c1443k2 = ld6VarM6067i.f7976k) != null) {
            AbstractC1421k<Integer, Integer> abstractC1421kMo5997k = c1443k2.mo5997k();
            this.f8067l = abstractC1421kMo5997k;
            abstractC1421kMo5997k.m5922k(this);
            m6084s(this.f8067l);
        }
        if (ld6VarM6067i != null && (c1443k = ld6VarM6067i.f55981toq) != null) {
            AbstractC1421k<Integer, Integer> abstractC1421kMo5997k2 = c1443k.mo5997k();
            this.f56057hyr = abstractC1421kMo5997k2;
            abstractC1421kMo5997k2.m5922k(this);
            m6084s(this.f56057hyr);
        }
        if (ld6VarM6067i != null && (toqVar2 = ld6VarM6067i.f55982zy) != null) {
            AbstractC1421k<Float, Float> abstractC1421kMo5997k3 = toqVar2.mo5997k();
            this.f8064c = abstractC1421kMo5997k3;
            abstractC1421kMo5997k3.m5922k(this);
            m6084s(this.f8064c);
        }
        if (ld6VarM6067i == null || (toqVar = ld6VarM6067i.f7977q) == null) {
            return;
        }
        AbstractC1421k<Float, Float> abstractC1421kMo5997k4 = toqVar.mo5997k();
        this.f56064uv6 = abstractC1421kMo5997k4;
        abstractC1421kMo5997k4.m5922k(this);
        m6084s(this.f56064uv6);
    }

    /* JADX INFO: renamed from: c */
    private void m6075c(String str, com.airbnb.lottie.model.toq toqVar, Matrix matrix, com.airbnb.lottie.model.zy zyVar, Canvas canvas, float f2, float f3) {
        float fFloatValue;
        for (int i2 = 0; i2 < str.length(); i2++) {
            C1472q c1472qN7h = this.f56061ncyb.zy().n7h(C1472q.zy(str.charAt(i2), zyVar.toq(), zyVar.m6101q()));
            if (c1472qN7h != null) {
                m6079l(c1472qN7h, matrix, f3, toqVar, canvas);
                float qVar = ((float) c1472qN7h.toq()) * f3 * C1512y.m6260n() * f2;
                float f4 = toqVar.f8094n / 10.0f;
                AbstractC1421k<Float, Float> abstractC1421k = this.f56065vyq;
                if (abstractC1421k != null) {
                    fFloatValue = abstractC1421k.mo5912y().floatValue();
                } else {
                    AbstractC1421k<Float, Float> abstractC1421k2 = this.f56064uv6;
                    if (abstractC1421k2 != null) {
                        fFloatValue = abstractC1421k2.mo5912y().floatValue();
                    }
                    canvas.translate(qVar + (f4 * f2), 0.0f);
                }
                f4 += fFloatValue;
                canvas.translate(qVar + (f4 * f2), 0.0f);
            }
        }
    }

    private void dd(toq.EnumC1474k enumC1474k, Canvas canvas, float f2) {
        int i2 = zy.f8071k[enumC1474k.ordinal()];
        if (i2 == 2) {
            canvas.translate(-f2, 0.0f);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((-f2) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    private float m6076e(String str, com.airbnb.lottie.model.zy zyVar, float f2, float f3) {
        float qVar = 0.0f;
        for (int i2 = 0; i2 < str.length(); i2++) {
            C1472q c1472qN7h = this.f56061ncyb.zy().n7h(C1472q.zy(str.charAt(i2), zyVar.toq(), zyVar.m6101q()));
            if (c1472qN7h != null) {
                qVar = (float) (((double) qVar) + (c1472qN7h.toq() * ((double) f2) * ((double) C1512y.m6260n()) * ((double) f3)));
            }
        }
        return qVar;
    }

    /* JADX INFO: renamed from: f */
    private void m6077f(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @dd
    private Typeface hb(com.airbnb.lottie.model.zy zyVar) {
        Typeface typefaceMo5912y;
        AbstractC1421k<Typeface, Typeface> abstractC1421k = this.f56062nn86;
        if (abstractC1421k != null && (typefaceMo5912y = abstractC1421k.mo5912y()) != null) {
            return typefaceMo5912y;
        }
        Typeface typefaceY9n = this.f56066x9kr.y9n(zyVar.toq(), zyVar.m6101q());
        return typefaceY9n != null ? typefaceY9n : zyVar.m6100n();
    }

    private void hyr(String str, com.airbnb.lottie.model.toq toqVar, Canvas canvas, float f2) {
        int length = 0;
        while (length < str.length()) {
            String strX9kr = x9kr(str, length);
            length += strX9kr.length();
            n5r1(strX9kr, toqVar, canvas);
            canvas.translate(this.f56055eqxt.measureText(strX9kr) + f2, 0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m6078j(int i2) {
        return Character.getType(i2) == 16 || Character.getType(i2) == 27 || Character.getType(i2) == 6 || Character.getType(i2) == 28 || Character.getType(i2) == 8 || Character.getType(i2) == 19;
    }

    /* JADX INFO: renamed from: l */
    private void m6079l(C1472q c1472q, Matrix matrix, float f2, com.airbnb.lottie.model.toq toqVar, Canvas canvas) {
        List<C1414q> listVyq = vyq(c1472q);
        for (int i2 = 0; i2 < listVyq.size(); i2++) {
            Path path = listVyq.get(i2).getPath();
            path.computeBounds(this.f56053d3, false);
            this.f56063oc.set(matrix);
            this.f56063oc.preTranslate(0.0f, (-toqVar.f56108f7l8) * C1512y.m6260n());
            this.f56063oc.preScale(f2, f2);
            path.transform(this.f56063oc);
            if (toqVar.f56109ld6) {
                m6077f(path, this.f56055eqxt, canvas);
                m6077f(path, this.f56052d2ok, canvas);
            } else {
                m6077f(path, this.f56052d2ok, canvas);
                m6077f(path, this.f56055eqxt, canvas);
            }
        }
    }

    private void lrht(com.airbnb.lottie.model.toq toqVar, Matrix matrix, com.airbnb.lottie.model.zy zyVar, Canvas canvas) {
        AbstractC1421k<Float, Float> abstractC1421k = this.f8065e;
        float fFloatValue = (abstractC1421k != null ? abstractC1421k.mo5912y().floatValue() : toqVar.f56111zy) / 100.0f;
        float fF7l8 = C1512y.f7l8(matrix);
        String str = toqVar.f8093k;
        float fM6260n = toqVar.f8092g * C1512y.m6260n();
        List<String> listNn86 = nn86(str);
        int size = listNn86.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = listNn86.get(i2);
            float fM6076e = m6076e(str2, zyVar, fFloatValue, fF7l8);
            canvas.save();
            dd(toqVar.f8096q, canvas, fM6076e);
            canvas.translate(0.0f, (i2 * fM6260n) - (((size - 1) * fM6260n) / 2.0f));
            m6075c(str2, toqVar, matrix, zyVar, canvas, fF7l8, fFloatValue);
            canvas.restore();
        }
    }

    private void n5r1(String str, com.airbnb.lottie.model.toq toqVar, Canvas canvas) {
        if (toqVar.f56109ld6) {
            ncyb(str, this.f56055eqxt, canvas);
            ncyb(str, this.f56052d2ok, canvas);
        } else {
            ncyb(str, this.f56052d2ok, canvas);
            ncyb(str, this.f56055eqxt, canvas);
        }
    }

    private void ncyb(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<String> nn86(String str) {
        return Arrays.asList(str.replaceAll(MusicLyricParser.CRLF, "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[LOOP:0: B:20:0x008d->B:21:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uv6(com.airbnb.lottie.model.toq r8, com.airbnb.lottie.model.zy r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.hb(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f8093k
            com.airbnb.lottie.r r1 = r7.f56066x9kr
            com.airbnb.lottie.hb r1 = r1.yz()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.zy(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.f56055eqxt
            r1.setTypeface(r9)
            com.airbnb.lottie.animation.keyframe.k<java.lang.Float, java.lang.Float> r9 = r7.f8065e
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.mo5912y()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f56111zy
        L2f:
            android.graphics.Paint r1 = r7.f56055eqxt
            float r2 = com.airbnb.lottie.utils.C1512y.m6260n()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f56052d2ok
            android.graphics.Paint r2 = r7.f56055eqxt
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f56052d2ok
            android.graphics.Paint r2 = r7.f56055eqxt
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f8092g
            float r2 = com.airbnb.lottie.utils.C1512y.m6260n()
            float r1 = r1 * r2
            int r2 = r8.f8094n
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.airbnb.lottie.animation.keyframe.k<java.lang.Float, java.lang.Float> r3 = r7.f56065vyq
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.mo5912y()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6a:
            float r2 = r2 + r3
            goto L7b
        L6c:
            com.airbnb.lottie.animation.keyframe.k<java.lang.Float, java.lang.Float> r3 = r7.f56064uv6
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.mo5912y()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6a
        L7b:
            float r3 = com.airbnb.lottie.utils.C1512y.m6260n()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.nn86(r0)
            int r0 = r9.size()
            r3 = 0
        L8d:
            if (r3 >= r0) goto Lc3
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f56052d2ok
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            com.airbnb.lottie.model.toq$k r6 = r8.f8096q
            r7.dd(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.hyr(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L8d
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C1467s.uv6(com.airbnb.lottie.model.toq, com.airbnb.lottie.model.zy, android.graphics.Canvas):void");
    }

    private List<C1414q> vyq(C1472q c1472q) {
        if (this.f56059lvui.containsKey(c1472q)) {
            return this.f56059lvui.get(c1472q);
        }
        List<C1450h> listM6093k = c1472q.m6093k();
        int size = listM6093k.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1414q(this.f56066x9kr, this, listM6093k.get(i2)));
        }
        this.f56059lvui.put(c1472q, arrayList);
        return arrayList;
    }

    private String x9kr(String str, int i2) {
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!m6078j(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j2 = iCodePointAt;
        if (this.f8068r.m876g(j2)) {
            return this.f8068r.n7h(j2);
        }
        this.f56056gvn7.setLength(0);
        while (i2 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i2);
            this.f56056gvn7.appendCodePoint(iCodePointAt3);
            i2 += Character.charCount(iCodePointAt3);
        }
        String string = this.f56056gvn7.toString();
        this.f8068r.fn3e(j2, string);
        return string;
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        super.mo5886g(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.f56061ncyb.toq().width(), this.f56061ncyb.toq().height());
    }

    @Override // com.airbnb.lottie.model.layer.toq
    /* JADX INFO: renamed from: i */
    void mo6064i(Canvas canvas, Matrix matrix, int i2) {
        canvas.save();
        if (!this.f56066x9kr.ukdy()) {
            canvas.concat(matrix);
        }
        com.airbnb.lottie.model.toq toqVarMo5912y = this.f56054dd.mo5912y();
        com.airbnb.lottie.model.zy zyVar = this.f56061ncyb.f7l8().get(toqVarMo5912y.f56110toq);
        if (zyVar == null) {
            canvas.restore();
            return;
        }
        AbstractC1421k<Integer, Integer> abstractC1421k = this.f56060n5r1;
        if (abstractC1421k != null) {
            this.f56055eqxt.setColor(abstractC1421k.mo5912y().intValue());
        } else {
            AbstractC1421k<Integer, Integer> abstractC1421k2 = this.f8067l;
            if (abstractC1421k2 != null) {
                this.f56055eqxt.setColor(abstractC1421k2.mo5912y().intValue());
            } else {
                this.f56055eqxt.setColor(toqVarMo5912y.f8098y);
            }
        }
        AbstractC1421k<Integer, Integer> abstractC1421k3 = this.f8066f;
        if (abstractC1421k3 != null) {
            this.f56052d2ok.setColor(abstractC1421k3.mo5912y().intValue());
        } else {
            AbstractC1421k<Integer, Integer> abstractC1421k4 = this.f56057hyr;
            if (abstractC1421k4 != null) {
                this.f56052d2ok.setColor(abstractC1421k4.mo5912y().intValue());
            } else {
                this.f56052d2ok.setColor(toqVarMo5912y.f8097s);
            }
        }
        int iIntValue = ((this.f56074fu4.m5920y() == null ? 100 : this.f56074fu4.m5920y().mo5912y().intValue()) * 255) / 100;
        this.f56055eqxt.setAlpha(iIntValue);
        this.f56052d2ok.setAlpha(iIntValue);
        AbstractC1421k<Float, Float> abstractC1421k5 = this.f56058lrht;
        if (abstractC1421k5 != null) {
            this.f56052d2ok.setStrokeWidth(abstractC1421k5.mo5912y().floatValue());
        } else {
            AbstractC1421k<Float, Float> abstractC1421k6 = this.f8064c;
            if (abstractC1421k6 != null) {
                this.f56052d2ok.setStrokeWidth(abstractC1421k6.mo5912y().floatValue());
            } else {
                this.f56052d2ok.setStrokeWidth(toqVarMo5912y.f8095p * C1512y.m6260n() * C1512y.f7l8(matrix));
            }
        }
        if (this.f56066x9kr.ukdy()) {
            lrht(toqVarMo5912y, matrix, zyVar, canvas);
        } else {
            uv6(toqVarMo5912y, zyVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f8116k) {
            AbstractC1421k<Integer, Integer> abstractC1421k = this.f56060n5r1;
            if (abstractC1421k != null) {
                jp0y(abstractC1421k);
            }
            if (c1517p == null) {
                this.f56060n5r1 = null;
                return;
            }
            cdj cdjVar = new cdj(c1517p);
            this.f56060n5r1 = cdjVar;
            cdjVar.m5922k(this);
            m6084s(this.f56060n5r1);
            return;
        }
        if (t2 == n5r1.f56145toq) {
            AbstractC1421k<Integer, Integer> abstractC1421k2 = this.f8066f;
            if (abstractC1421k2 != null) {
                jp0y(abstractC1421k2);
            }
            if (c1517p == null) {
                this.f8066f = null;
                return;
            }
            cdj cdjVar2 = new cdj(c1517p);
            this.f8066f = cdjVar2;
            cdjVar2.m5922k(this);
            m6084s(this.f8066f);
            return;
        }
        if (t2 == n5r1.f56144t8r) {
            AbstractC1421k<Float, Float> abstractC1421k3 = this.f56058lrht;
            if (abstractC1421k3 != null) {
                jp0y(abstractC1421k3);
            }
            if (c1517p == null) {
                this.f56058lrht = null;
                return;
            }
            cdj cdjVar3 = new cdj(c1517p);
            this.f56058lrht = cdjVar3;
            cdjVar3.m5922k(this);
            m6084s(this.f56058lrht);
            return;
        }
        if (t2 == n5r1.f8115i) {
            AbstractC1421k<Float, Float> abstractC1421k4 = this.f56065vyq;
            if (abstractC1421k4 != null) {
                jp0y(abstractC1421k4);
            }
            if (c1517p == null) {
                this.f56065vyq = null;
                return;
            }
            cdj cdjVar4 = new cdj(c1517p);
            this.f56065vyq = cdjVar4;
            cdjVar4.m5922k(this);
            m6084s(this.f56065vyq);
            return;
        }
        if (t2 == n5r1.f56129fti) {
            AbstractC1421k<Float, Float> abstractC1421k5 = this.f8065e;
            if (abstractC1421k5 != null) {
                jp0y(abstractC1421k5);
            }
            if (c1517p == null) {
                this.f8065e = null;
                return;
            }
            cdj cdjVar5 = new cdj(c1517p);
            this.f8065e = cdjVar5;
            cdjVar5.m5922k(this);
            m6084s(this.f8065e);
            return;
        }
        if (t2 != n5r1.f56137lvui) {
            if (t2 == n5r1.f56125dd) {
                this.f56054dd.cdj(c1517p);
                return;
            }
            return;
        }
        AbstractC1421k<Typeface, Typeface> abstractC1421k6 = this.f56062nn86;
        if (abstractC1421k6 != null) {
            jp0y(abstractC1421k6);
        }
        if (c1517p == null) {
            this.f56062nn86 = null;
            return;
        }
        cdj cdjVar6 = new cdj(c1517p);
        this.f56062nn86 = cdjVar6;
        cdjVar6.m5922k(this);
        m6084s(this.f56062nn86);
    }
}
