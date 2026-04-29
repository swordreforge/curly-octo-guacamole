package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.q */
/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C1425q extends f7l8<Float> {
    public C1425q(List<C1515k<Float>> list) {
        super(list);
    }

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
    float cdj(C1515k<Float> c1515k, float f2) {
        Float f3;
        if (c1515k.f56198toq == null || c1515k.f56200zy == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1517p<A> c1517p = this.f7893n;
        return (c1517p == 0 || (f3 = (Float) c1517p.toq(c1515k.f56193f7l8, c1515k.f8306y.floatValue(), c1515k.f56198toq, c1515k.f56200zy, f2, m5923n(), m5921g())) == null) ? com.airbnb.lottie.utils.f7l8.ld6(c1515k.m6278g(), c1515k.zy(), f2) : f3.floatValue();
    }

    /* JADX INFO: renamed from: h */
    public float m5936h() {
        return cdj(toq(), m5925q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public Float mo5911s(C1515k<Float> c1515k, float f2) {
        return Float.valueOf(cdj(c1515k, f2));
    }
}
