package com.miui.clock.rhombus;

import android.content.Context;
import android.graphics.Color;
import com.miui.clock.hct.C5055q;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.clock.rhombus.toq;
import com.miui.maml.data.VariableNames;
import gcp.C6062n;
import gcp.C6066y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;

/* JADX INFO: compiled from: MiuiRhombusClockBaseInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq extends AbstractC5074q {

    /* JADX INFO: renamed from: c */
    private int f29307c;

    /* JADX INFO: renamed from: f */
    private int f29309f;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private int f72028hyr;

    /* JADX INFO: renamed from: l */
    protected int f29310l;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private int f72029lrht;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    protected boolean f72030n5r1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected int f72031ncyb;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    protected int f72032uv6;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private boolean f72034x9kr;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f72027dd = 1;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private List<C5094k> f72033vyq = new ArrayList();

    /* JADX INFO: renamed from: e */
    private Map<String, com.miui.clock.hct.zy> f29308e = new HashMap();

    /* JADX INFO: renamed from: com.miui.clock.rhombus.toq$k */
    /* JADX INFO: compiled from: MiuiRhombusClockBaseInfo.java */
    class C5094k {

        /* JADX INFO: renamed from: k */
        public com.miui.clock.hct.zy f29311k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f72035toq;

        public C5094k(String str, com.miui.clock.hct.zy zyVar) {
            this.f29311k = zyVar;
            this.f72035toq = str;
        }

        /* JADX INFO: renamed from: k */
        public double m17755k() {
            return this.f29311k.m17691n();
        }
    }

    public toq(ClockBean clockBean) {
        m17747e(clockBean);
    }

    /* JADX INFO: renamed from: c */
    private void m17746c(Context context) {
        int iM17725q = m17725q();
        int iM17723n = m17723n();
        com.miui.clock.hct.zy qVar = com.miui.clock.hct.zy.toq(iM17725q);
        com.miui.clock.hct.zy qVar2 = com.miui.clock.hct.zy.toq(iM17723n);
        if (qVar.m17691n() < qVar2.m17691n()) {
            iM17725q = C5055q.ki(qVar.m17693q(), qVar.zy(), 50.0d);
        } else {
            iM17723n = C5055q.ki(qVar2.m17693q(), qVar2.zy(), 50.0d);
        }
        Map<String, Integer> mapX2 = x2();
        if (!C6062n.m22317h(context) || !cdj() || mapX2 == null) {
            hb(iM17725q);
            m17751j(iM17725q);
            nn86(iM17723n);
            return;
        }
        if (m17722i()) {
            if (mapX2.get("secondary70") != null) {
                iM17725q = mapX2.get("secondary70").intValue();
            }
            hb(iM17725q);
            m17751j(iM17725q);
        } else {
            hb(Color.parseColor("#BEBEBE"));
            m17751j(Color.parseColor("#BEBEBE"));
        }
        nn86(iM17723n);
    }

    /* JADX INFO: renamed from: e */
    private void m17747e(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        gvn7(clockBean.getPrimaryColor());
        d3(clockBean.getSecondaryColor());
        jk(clockBean.getInfoAreaColor());
        m17753o(clockBean.getStyle());
        ek5k(clockBean.isDiffHourMinuteColor());
        wvg(clockBean.isAutoSecondaryColor());
        o1t(clockBean.isAutoPrimaryColor());
        yz(clockBean.isEnableDiffusion());
        mcp(clockBean.isDisableContainerPassBlur());
    }

    /* JADX INFO: renamed from: l */
    private void m17748l(Context context) {
        int iD2ok;
        int iQrj = qrj();
        int i2 = 0;
        if ((iQrj != -1 || (iD2ok = this.f72031ncyb) == 0) && (iQrj != -16777216 || (iD2ok = this.f29310l) == 0)) {
            iD2ok = d2ok(iQrj, false);
            iQrj = d2ok(iQrj, true);
        }
        int iM22346k = C6066y.m22346k(iQrj);
        int iM22346k2 = C6066y.m22346k(iD2ok);
        int iM17723n = m17723n();
        com.miui.clock.hct.zy qVar = com.miui.clock.hct.zy.toq(iM22346k);
        com.miui.clock.hct.zy qVar2 = com.miui.clock.hct.zy.toq(iM22346k2);
        com.miui.clock.hct.zy qVar3 = com.miui.clock.hct.zy.toq(iM17723n);
        this.f72033vyq.clear();
        this.f72033vyq.add(new C5094k("hour", qVar));
        this.f72033vyq.add(new C5094k(VariableNames.VAR_MINUTE, qVar2));
        this.f72033vyq.add(new C5094k("colon", qVar3));
        Collections.sort(this.f72033vyq, Comparator.comparingDouble(new ToDoubleFunction() { // from class: com.miui.clock.rhombus.k
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                return ((toq.C5094k) obj).m17755k();
            }
        }));
        this.f72033vyq.get(0).f29311k.m17692p(50.0d);
        Map<String, Integer> mapX2 = x2();
        if (!C6062n.m22317h(context) || !cdj() || mapX2 == null) {
            while (i2 < this.f72033vyq.size()) {
                C5094k c5094k = this.f72033vyq.get(i2);
                if ("hour".equals(c5094k.f72035toq)) {
                    hb(c5094k.f29311k.ld6());
                } else if (VariableNames.VAR_MINUTE.equals(c5094k.f72035toq)) {
                    m17751j(c5094k.f29311k.ld6());
                } else if ("colon".equals(c5094k.f72035toq)) {
                    nn86(c5094k.f29311k.ld6());
                }
                i2++;
            }
            return;
        }
        while (i2 < this.f72033vyq.size()) {
            C5094k c5094k2 = this.f72033vyq.get(i2);
            if ("colon".equals(c5094k2.f72035toq)) {
                nn86(c5094k2.f29311k.ld6());
            }
            i2++;
        }
        if (m17722i()) {
            if (mapX2.get("secondary80") != null) {
                iQrj = mapX2.get("secondary80").intValue();
            }
            hb(iQrj);
            if (mapX2.get("secondary60") != null) {
                iD2ok = mapX2.get("secondary60").intValue();
            }
            m17751j(iD2ok);
        } else {
            hb(Color.parseColor("#D9D9D9"));
            m17751j(Color.parseColor("#A6A6A6"));
        }
        nn86(iM17723n);
    }

    /* JADX INFO: renamed from: b */
    public void m17749b(int i2) {
        this.f72028hyr = i2;
    }

    protected int d2ok(int i2, boolean z2) {
        com.miui.clock.hct.zy qVar = com.miui.clock.hct.zy.toq(i2);
        double dM17691n = qVar.m17691n();
        int iKi = C5055q.ki(qVar.m17693q(), qVar.zy(), Math.max(0.0d, dM17691n - 8.0d));
        int iKi2 = C5055q.ki(qVar.m17693q(), qVar.zy(), Math.min(100.0d, (0.8500000238418579d * dM17691n) + 15.5d));
        return dM17691n < 40.0d ? z2 ? iKi : iKi2 : z2 ? iKi2 : iKi;
    }

    public int dd() {
        return this.f29307c;
    }

    public void ek5k(boolean z2) {
        this.f72034x9kr = z2;
    }

    public void eqxt(Context context) {
        if (uv6()) {
            m17748l(context);
        } else {
            m17746c(context);
        }
    }

    /* JADX INFO: renamed from: f */
    public int m17750f() {
        return this.f72031ncyb;
    }

    public void hb(int i2) {
        this.f29309f = i2;
    }

    public int[] hyr(Context context) {
        int iD2ok;
        int iQrj = qrj();
        if (!uv6()) {
            return new int[]{iQrj, iQrj};
        }
        if (C6062n.m22317h(context) && cdj()) {
            return new int[]{iQrj, -6710887};
        }
        if ((iQrj != -1 || (iD2ok = this.f72031ncyb) == 0) && (iQrj != -16777216 || (iD2ok = this.f29310l) == 0)) {
            iD2ok = d2ok(iQrj, false);
            iQrj = d2ok(iQrj, true);
        }
        return new int[]{iQrj, iD2ok};
    }

    /* JADX INFO: renamed from: j */
    public void m17751j(int i2) {
        this.f29307c = i2;
    }

    public int lrht() {
        return this.f72028hyr;
    }

    public int lvui() {
        return this.f72029lrht;
    }

    /* JADX INFO: renamed from: m */
    public void m17752m(int i2) {
        this.f29310l = i2;
    }

    public int n5r1() {
        return this.f72032uv6;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public int n7h() {
        if (ni7()) {
            return -65536;
        }
        return super.n7h();
    }

    public int ncyb() {
        return this.f29310l;
    }

    public void nn86(int i2) {
        this.f72029lrht = i2;
    }

    /* JADX INFO: renamed from: o */
    public void m17753o(int i2) {
        this.f72027dd = i2;
    }

    /* JADX INFO: renamed from: r */
    public int m17754r() {
        return this.f29309f;
    }

    public boolean uv6() {
        if (ni7()) {
            return false;
        }
        return this.f72034x9kr;
    }

    public boolean vyq() {
        return this.f72030n5r1;
    }

    public int x9kr() {
        return this.f72027dd;
    }

    public void y9n(int i2) {
        this.f72031ncyb = i2;
    }

    public void yz(boolean z2) {
        this.f72030n5r1 = z2;
    }
}
