package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.List;

/* JADX INFO: compiled from: TextKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 extends f7l8<com.airbnb.lottie.model.toq> {

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.kja0$k */
    /* JADX INFO: compiled from: TextKeyframeAnimation.java */
    class C1422k extends C1517p<com.airbnb.lottie.model.toq> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ com.airbnb.lottie.model.toq f7899g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C1517p f7900n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.airbnb.lottie.value.toq f7901q;

        C1422k(com.airbnb.lottie.value.toq toqVar, C1517p c1517p, com.airbnb.lottie.model.toq toqVar2) {
            this.f7901q = toqVar;
            this.f7900n = c1517p;
            this.f7899g = toqVar2;
        }

        @Override // com.airbnb.lottie.value.C1517p
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public com.airbnb.lottie.model.toq mo5884k(com.airbnb.lottie.value.toq<com.airbnb.lottie.model.toq> toqVar) {
            this.f7901q.m6294y(toqVar.m6290g(), toqVar.m6291k(), toqVar.f7l8().f8093k, toqVar.toq().f8093k, toqVar.m6293q(), toqVar.zy(), toqVar.m6292n());
            String str = (String) this.f7900n.mo5884k(this.f7901q);
            com.airbnb.lottie.model.toq qVar = toqVar.zy() == 1.0f ? toqVar.toq() : toqVar.f7l8();
            this.f7899g.m6095k(str, qVar.f56110toq, qVar.f56111zy, qVar.f8096q, qVar.f8094n, qVar.f8092g, qVar.f56108f7l8, qVar.f8098y, qVar.f8097s, qVar.f8095p, qVar.f56109ld6);
            return this.f7899g;
        }
    }

    public kja0(List<C1515k<com.airbnb.lottie.model.toq>> list) {
        super(list);
    }

    public void cdj(C1517p<String> c1517p) {
        super.n7h(new C1422k(new com.airbnb.lottie.value.toq(), c1517p, new com.airbnb.lottie.model.toq()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public com.airbnb.lottie.model.toq mo5911s(C1515k<com.airbnb.lottie.model.toq> c1515k, float f2) {
        com.airbnb.lottie.model.toq toqVar;
        C1517p<A> c1517p = this.f7893n;
        if (c1517p == 0) {
            return (f2 != 1.0f || (toqVar = c1515k.f56200zy) == null) ? c1515k.f56198toq : toqVar;
        }
        float f3 = c1515k.f56193f7l8;
        Float f4 = c1515k.f8306y;
        float fFloatValue = f4 == null ? Float.MAX_VALUE : f4.floatValue();
        com.airbnb.lottie.model.toq toqVar2 = c1515k.f56198toq;
        com.airbnb.lottie.model.toq toqVar3 = toqVar2;
        com.airbnb.lottie.model.toq toqVar4 = c1515k.f56200zy;
        return (com.airbnb.lottie.model.toq) c1517p.toq(f3, fFloatValue, toqVar3, toqVar4 == null ? toqVar2 : toqVar4, f2, m5925q(), m5921g());
    }
}
