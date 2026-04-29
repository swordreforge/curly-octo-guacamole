package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1414q;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.content.C1450h;
import com.airbnb.lottie.model.content.C1452k;
import com.airbnb.lottie.parser.C1494p;
import java.util.Collections;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends toq {

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final zy f56029d3;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final C1414q f56030gvn7;

    f7l8(C1504r c1504r, C1464n c1464n, zy zyVar) {
        super(c1504r, c1464n);
        this.f56029d3 = zyVar;
        C1414q c1414q = new C1414q(c1504r, this, new C1450h("__container", c1464n.n7h(), false));
        this.f56030gvn7 = c1414q;
        c1414q.toq(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.toq
    @dd
    public C1494p fu4() {
        C1494p c1494pFu4 = super.fu4();
        return c1494pFu4 != null ? c1494pFu4 : this.f56029d3.fu4();
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        super.mo5886g(rectF, matrix, z2);
        this.f56030gvn7.mo5886g(rectF, this.f56076kja0, z2);
    }

    @Override // com.airbnb.lottie.model.layer.toq
    protected void gvn7(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        this.f56030gvn7.mo5888n(c1471n, i2, list, c1471n2);
    }

    @Override // com.airbnb.lottie.model.layer.toq
    /* JADX INFO: renamed from: i */
    void mo6064i(@lvui Canvas canvas, Matrix matrix, int i2) {
        this.f56030gvn7.mo5890y(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.model.layer.toq
    @dd
    public C1452k zurt() {
        C1452k c1452kZurt = super.zurt();
        return c1452kZurt != null ? c1452kZurt : this.f56029d3.zurt();
    }
}
