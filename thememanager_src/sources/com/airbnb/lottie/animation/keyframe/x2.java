package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.List;

/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends f7l8<com.airbnb.lottie.value.ld6> {

    /* JADX INFO: renamed from: s */
    private final com.airbnb.lottie.value.ld6 f7911s;

    public x2(List<C1515k<com.airbnb.lottie.value.ld6>> list) {
        super(list);
        this.f7911s = new com.airbnb.lottie.value.ld6();
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
    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.ld6 mo5911s(C1515k<com.airbnb.lottie.value.ld6> c1515k, float f2) {
        com.airbnb.lottie.value.ld6 ld6Var;
        com.airbnb.lottie.value.ld6 ld6Var2;
        com.airbnb.lottie.value.ld6 ld6Var3 = c1515k.f56198toq;
        if (ld6Var3 == null || (ld6Var = c1515k.f56200zy) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.ld6 ld6Var4 = ld6Var3;
        com.airbnb.lottie.value.ld6 ld6Var5 = ld6Var;
        C1517p<A> c1517p = this.f7893n;
        if (c1517p != 0 && (ld6Var2 = (com.airbnb.lottie.value.ld6) c1517p.toq(c1515k.f56193f7l8, c1515k.f8306y.floatValue(), ld6Var4, ld6Var5, f2, m5923n(), m5921g())) != null) {
            return ld6Var2;
        }
        this.f7911s.m6284q(com.airbnb.lottie.utils.f7l8.ld6(ld6Var4.toq(), ld6Var5.toq(), f2), com.airbnb.lottie.utils.f7l8.ld6(ld6Var4.zy(), ld6Var5.zy(), f2));
        return this.f7911s;
    }
}
