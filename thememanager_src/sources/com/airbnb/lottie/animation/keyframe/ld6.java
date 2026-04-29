package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.List;

/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 extends f7l8<PointF> {

    /* JADX INFO: renamed from: s */
    private final PointF f7902s;

    public ld6(List<C1515k<PointF>> list) {
        super(list);
        this.f7902s = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public PointF mo5924p(C1515k<PointF> c1515k, float f2, float f3, float f4) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c1515k.f56198toq;
        if (pointF3 == null || (pointF = c1515k.f56200zy) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C1517p<A> c1517p = this.f7893n;
        if (c1517p != 0 && (pointF2 = (PointF) c1517p.toq(c1515k.f56193f7l8, c1515k.f8306y.floatValue(), pointF4, pointF5, f2, m5923n(), m5921g())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f7902s;
        float f5 = pointF4.x;
        float f6 = f5 + (f3 * (pointF5.x - f5));
        float f7 = pointF4.y;
        pointF6.set(f6, f7 + (f4 * (pointF5.y - f7)));
        return this.f7902s;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PointF mo5911s(C1515k<PointF> c1515k, float f2) {
        return mo5924p(c1515k, f2, f2, f2);
    }
}
