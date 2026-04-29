package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r implements n7h, AbstractC1421k.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f55892f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private List<InterfaceC1409i> f7859g;

    /* JADX INFO: renamed from: n */
    private final com.airbnb.lottie.animation.keyframe.qrj f7861n;

    /* JADX INFO: renamed from: q */
    private final C1504r f7862q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f55893toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f55894zy;

    /* JADX INFO: renamed from: k */
    private final Path f7860k = new Path();

    /* JADX INFO: renamed from: y */
    private final toq f7863y = new toq();

    public t8r(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.cdj cdjVar) {
        this.f55893toq = cdjVar.toq();
        this.f55894zy = cdjVar.m6007q();
        this.f7862q = c1504r;
        com.airbnb.lottie.animation.keyframe.qrj qrjVarMo5997k = cdjVar.zy().mo5997k();
        this.f7861n = qrjVarMo5997k;
        toqVar.m6084s(qrjVarMo5997k);
        qrjVarMo5997k.m5922k(this);
    }

    /* JADX INFO: renamed from: q */
    private void m5901q() {
        this.f55892f7l8 = false;
        this.f7862q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55893toq;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        if (this.f55892f7l8) {
            return this.f7860k;
        }
        this.f7860k.reset();
        if (this.f55894zy) {
            this.f55892f7l8 = true;
            return this.f7860k;
        }
        Path pathMo5912y = this.f7861n.mo5912y();
        if (pathMo5912y == null) {
            return this.f7860k;
        }
        this.f7860k.set(pathMo5912y);
        this.f7860k.setFillType(Path.FillType.EVEN_ODD);
        this.f7863y.toq(this.f7860k);
        this.f55892f7l8 = true;
        return this.f7860k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        m5901q();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.airbnb.lottie.animation.content.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toq(java.util.List<com.airbnb.lottie.animation.content.zy> r6, java.util.List<com.airbnb.lottie.animation.content.zy> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.airbnb.lottie.animation.content.zy r1 = (com.airbnb.lottie.animation.content.zy) r1
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.zurt
            if (r2 == 0) goto L26
            r2 = r1
            com.airbnb.lottie.animation.content.zurt r2 = (com.airbnb.lottie.animation.content.zurt) r2
            com.airbnb.lottie.model.content.t8r$k r3 = r2.m5908p()
            com.airbnb.lottie.model.content.t8r$k r4 = com.airbnb.lottie.model.content.t8r.EnumC1458k.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.airbnb.lottie.animation.content.toq r1 = r5.f7863y
            r1.m5902k(r2)
            r2.m5909q(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.InterfaceC1409i
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.airbnb.lottie.animation.content.i r1 = (com.airbnb.lottie.animation.content.InterfaceC1409i) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.airbnb.lottie.animation.keyframe.qrj r6 = r5.f7861n
            r6.cdj(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.t8r.toq(java.util.List, java.util.List):void");
    }
}
