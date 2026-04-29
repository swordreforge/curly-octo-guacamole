package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.p */
/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C1424p extends f7l8<PointF> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final PathMeasure f55931ld6;

    /* JADX INFO: renamed from: p */
    private final float[] f7906p;

    /* JADX INFO: renamed from: s */
    private final PointF f7907s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private C1426s f55932x2;

    public C1424p(List<? extends C1515k<PointF>> list) {
        super(list);
        this.f7907s = new PointF();
        this.f7906p = new float[2];
        this.f55931ld6 = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PointF mo5911s(C1515k<PointF> c1515k, float f2) {
        PointF pointF;
        C1426s c1426s = (C1426s) c1515k;
        Path pathM5938p = c1426s.m5938p();
        if (pathM5938p == null) {
            return c1515k.f56198toq;
        }
        C1517p<A> c1517p = this.f7893n;
        if (c1517p != 0 && (pointF = (PointF) c1517p.toq(c1426s.f56193f7l8, c1426s.f8306y.floatValue(), (PointF) c1426s.f56198toq, (PointF) c1426s.f56200zy, m5923n(), f2, m5921g())) != null) {
            return pointF;
        }
        if (this.f55932x2 != c1426s) {
            this.f55931ld6.setPath(pathM5938p, false);
            this.f55932x2 = c1426s;
        }
        PathMeasure pathMeasure = this.f55931ld6;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f7906p, null);
        PointF pointF2 = this.f7907s;
        float[] fArr = this.f7906p;
        pointF2.set(fArr[0], fArr[1]);
        return this.f7907s;
    }
}
