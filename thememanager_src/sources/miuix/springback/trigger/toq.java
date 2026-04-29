package miuix.springback.trigger;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import miuix.animation.utils.VelocityMonitor;
import miuix.springback.trigger.AbstractC7346k;
import miuix.springback.view.SpringBackLayout;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import qh4d.InterfaceC7613g;
import ula6.toq;

/* JADX INFO: compiled from: CustomTrigger.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq extends AbstractC7346k {

    /* JADX INFO: renamed from: c */
    private static final float f41823c = 0.25f;

    /* JADX INFO: renamed from: f */
    private static final String f41824f = "CustomTrigger";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final float f90344lrht = 1000.0f;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f90345uv6 = 5000;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f90346a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private AbstractC7347q f90347cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private InterfaceC7613g f90348d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f90349d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected final C7353s f90350dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private SpringBackLayout.InterfaceC7358k f90351eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private AbstractC7346k.k f90352f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private AbstractC7346k.q.k f90353fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f90354fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f90355fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f90356gvn7;

    /* JADX INFO: renamed from: h */
    private VelocityMonitor f41825h;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    protected final C7354y f90357hyr;

    /* JADX INFO: renamed from: i */
    private AbstractC7346k.toq.InterfaceC8114toq f41826i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f90358jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f90359jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private InterfaceC7351p f90360ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private View f90361kja0;

    /* JADX INFO: renamed from: l */
    protected final C7348g f41827l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private RelativeLayout f90362ld6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private AbstractC7346k.zy.toq f90363lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private long f90364mcp;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    protected final qrj f90365n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private View f90366n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected final f7l8 f90367ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private float f90368ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private boolean f90369o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private View.OnLayoutChangeListener f90370oc;

    /* JADX INFO: renamed from: p */
    public SpringBackLayout f41828p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private View f90371qrj;

    /* JADX INFO: renamed from: r */
    private AbstractC7346k.toq.k f41829r;

    /* JADX INFO: renamed from: s */
    protected LayoutInflater f41830s;

    /* JADX INFO: renamed from: t */
    protected int f41831t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private ld6 f90372t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    protected int f90373wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private FrameLayout f90374x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected final x2 f90375x9kr;

    /* JADX INFO: renamed from: y */
    protected Context f41832y;

    /* JADX INFO: renamed from: z */
    private boolean f41833z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private AbstractC7346k.zy.k f90376zurt;

    /* JADX INFO: compiled from: CustomTrigger.java */
    private class f7l8 extends AbstractC7347q {
        private f7l8() {
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        void mo26694k(int i2, int i3) {
            super.mo26694k(i2, i3);
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        void toq(int i2, int i3) {
            super.toq(i2, i3);
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        boolean zy() {
            if (toq.this.f90352f7l8 != null && (toq.this.f90352f7l8 instanceof AbstractC7346k.toq)) {
                toq toqVar = toq.this;
                if (toqVar.f90373wvg > toqVar.f90352f7l8.f90341toq) {
                    toq toqVar2 = toq.this;
                    toqVar2.f41828p.dd(0, -toqVar2.f90352f7l8.f90341toq);
                    return true;
                }
            }
            return super.zy();
        }

        /* synthetic */ f7l8(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: miuix.springback.trigger.toq$g */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class C7348g extends AbstractC7347q {
        private C7348g() {
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        void mo26694k(int i2, int i3) {
            super.mo26694k(i2, i3);
            if (i3 == 0) {
                toq toqVar = toq.this;
                toqVar.w831(toqVar.f90350dd);
            }
        }

        /* synthetic */ C7348g(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$k */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class ViewOnLayoutChangeListenerC7349k implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC7349k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int paddingTop;
            int paddingBottom;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(-view.getScrollY(), 0);
            toq.this.f90362ld6.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            View viewM26710e = toq.this.m26710e();
            View viewUv6 = toq.this.uv6();
            if (viewUv6 != null) {
                viewUv6.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            if (viewM26710e != null) {
                viewM26710e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            toq.this.f90362ld6.layout(0, view.getScrollY(), view.getWidth(), 0);
            if (toq.this.f41828p.getTarget() != null) {
                paddingTop = toq.this.f41828p.getTarget().getPaddingTop();
                paddingBottom = toq.this.f41828p.getTarget().getPaddingBottom();
            } else {
                paddingTop = 0;
                paddingBottom = 0;
            }
            if (viewUv6 != null) {
                viewUv6.layout(0, toq.this.f41828p.getHeight() - paddingBottom, view.getWidth(), (toq.this.f41828p.getHeight() - paddingBottom) + view.getScrollY());
            }
            if (viewM26710e != null) {
                viewM26710e.layout(0, view.getScrollY() + paddingTop, view.getWidth(), paddingTop);
            }
            toq.this.i9jn(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    }

    /* JADX INFO: compiled from: CustomTrigger.java */
    public interface ld6 {
        /* JADX INFO: renamed from: k */
        void mo26713k(AbstractC7346k.zy zyVar);

        /* JADX INFO: renamed from: n */
        void mo26714n(AbstractC7346k.zy zyVar);

        /* JADX INFO: renamed from: q */
        void mo26715q(AbstractC7346k.zy zyVar);

        void toq(AbstractC7346k.zy zyVar);

        void zy(AbstractC7346k.zy zyVar, int i2);
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$n */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class C7350n implements AbstractC7346k.toq.k {
        C7350n() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        /* JADX INFO: renamed from: g */
        public void mo26671g(AbstractC7346k.toq toqVar, int i2, String str) {
            toqVar.f41815g[i2] = str;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        /* JADX INFO: renamed from: k */
        public void mo26672k(AbstractC7346k.toq toqVar, int i2) {
            toq.this.f90356gvn7 = false;
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar2 = toq.this;
            if (abstractC7347q == toqVar2.f90367ncyb && toqVar2.f90352f7l8 == toqVar) {
                if (toq.this.f90360ki != null) {
                    toq.this.f90360ki.mo26716k(toqVar, i2);
                }
                if (toq.this.f41828p.getScrollY() == 0) {
                    toq toqVar3 = toq.this;
                    toqVar3.w831(toqVar3.f90350dd);
                    return;
                }
                toq toqVar4 = toq.this;
                toqVar4.w831(toqVar4.f41827l);
                if (toq.this.f90355fu4 == 0) {
                    toq.this.f41828p.dd(0, 0);
                }
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        /* JADX INFO: renamed from: n */
        public void mo26673n(AbstractC7346k.toq toqVar) {
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar2 = toq.this;
            if (abstractC7347q == toqVar2.f90367ncyb && toqVar2.f90352f7l8 == toqVar) {
                if (toq.this.f41828p.getScrollY() != 0) {
                    toq toqVar3 = toq.this;
                    toqVar3.w831(toqVar3.f41827l);
                    if (toq.this.f90355fu4 == 0 || toq.this.f90355fu4 == 2) {
                        toq.this.f41828p.dd(0, 0);
                    }
                } else {
                    toq toqVar4 = toq.this;
                    toqVar4.w831(toqVar4.f90350dd);
                }
                if (toq.this.f90360ki != null) {
                    toq.this.f90360ki.mo26717n(toqVar);
                }
            }
            if (!toq.this.f90356gvn7 && toq.this.m26697f() > 5000) {
                HapticCompat.m26766g(toq.this.f41828p, C7385p.f92246mcp, C7385p.f92251qrj);
                toq.this.r8s8();
            }
            toq.this.f90356gvn7 = false;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        /* JADX INFO: renamed from: q */
        public void mo26674q(AbstractC7346k.toq toqVar) {
            toq.this.f90356gvn7 = false;
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar2 = toq.this;
            if (abstractC7347q == toqVar2.f90367ncyb && toqVar2.f90352f7l8 == toqVar) {
                if (toq.this.f41828p.getScrollY() != 0) {
                    toq toqVar3 = toq.this;
                    toqVar3.w831(toqVar3.f41827l);
                    if (toq.this.f90355fu4 == 0) {
                        toq.this.f41828p.dd(0, 0);
                    }
                } else {
                    toq toqVar4 = toq.this;
                    toqVar4.w831(toqVar4.f90350dd);
                }
                if (toq.this.f90360ki != null) {
                    toq.this.f90360ki.mo26717n(toqVar);
                }
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        public void toq(AbstractC7346k.toq toqVar) {
            AbstractC7346k.k kVar;
            toq.this.f90356gvn7 = true;
            if (toq.this.f7l8().size() > 0 && (kVar = toq.this.f7l8().get(0)) == toqVar && toq.this.f90352f7l8 == null) {
                AbstractC7347q abstractC7347q = toq.this.f90347cdj;
                toq toqVar2 = toq.this;
                if (abstractC7347q == toqVar2.f90350dd) {
                    toqVar2.w831(toqVar2.f90375x9kr);
                    AbstractC7346k.k kVar2 = toq.this.f90352f7l8;
                    toq.this.f90352f7l8 = kVar;
                    toq toqVar3 = toq.this;
                    toqVar3.zsr0(toqVar3.f90352f7l8, kVar2, toq.this.f41831t);
                    if (toq.this.f90360ki != null) {
                        toq.this.f90360ki.toq(toqVar);
                    }
                    toq toqVar4 = toq.this;
                    toqVar4.f41828p.dd(0, -toqVar4.f90352f7l8.f90341toq);
                    toq.this.f90362ld6.layout(0, -toq.this.f90352f7l8.f90341toq, toq.this.f90362ld6.getWidth(), 0);
                    toq toqVar5 = toq.this;
                    toqVar5.w831(toqVar5.f90365n5r1);
                }
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.k
        public void zy(AbstractC7346k.toq toqVar) {
            toq.this.f90356gvn7 = false;
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar2 = toq.this;
            if (abstractC7347q == toqVar2.f90367ncyb && toqVar2.f90352f7l8 == toqVar) {
                if (toq.this.f90360ki != null) {
                    toq.this.f90360ki.zy(toqVar);
                }
                if (toq.this.f41828p.getScrollY() == 0) {
                    toq toqVar3 = toq.this;
                    toqVar3.w831(toqVar3.f90350dd);
                    return;
                }
                toq toqVar4 = toq.this;
                toqVar4.w831(toqVar4.f41827l);
                if (toq.this.f90355fu4 == 0) {
                    toq.this.f41828p.dd(0, 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$p */
    /* JADX INFO: compiled from: CustomTrigger.java */
    public interface InterfaceC7351p {
        /* JADX INFO: renamed from: k */
        void mo26716k(AbstractC7346k.toq toqVar, int i2);

        /* JADX INFO: renamed from: n */
        void mo26717n(AbstractC7346k.toq toqVar);

        /* JADX INFO: renamed from: q */
        void mo26718q(AbstractC7346k.toq toqVar);

        void toq(AbstractC7346k.toq toqVar);

        void zy(AbstractC7346k.toq toqVar);
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$q */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class C7352q implements AbstractC7346k.zy.toq {
        C7352q() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        /* JADX INFO: renamed from: g */
        public void mo26690g(AbstractC7346k.zy zyVar, int i2, String str) {
            zyVar.f41821n[i2] = str;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        /* JADX INFO: renamed from: k */
        public void mo26691k(AbstractC7346k.zy zyVar) {
            toq.this.f90349d3 = false;
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar = toq.this;
            if (abstractC7347q == toqVar.f90367ncyb && toqVar.f90352f7l8 == zyVar) {
                if (toq.this.f90372t8r != null) {
                    toq.this.f90372t8r.mo26713k(zyVar);
                }
                if (toq.this.f41828p.getScrollY() == 0) {
                    toq toqVar2 = toq.this;
                    toqVar2.w831(toqVar2.f90350dd);
                    return;
                }
                toq toqVar3 = toq.this;
                toqVar3.w831(toqVar3.f41827l);
                if (toq.this.f90355fu4 == 0) {
                    toq.this.f41828p.dd(0, 0);
                }
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        /* JADX INFO: renamed from: n */
        public void mo26692n(AbstractC7346k.zy zyVar) {
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar = toq.this;
            if (abstractC7347q == toqVar.f90367ncyb && toqVar.f90352f7l8 == zyVar) {
                View viewUv6 = toq.this.uv6();
                if (toq.this.f90355fu4 == 0 && viewUv6 != null && viewUv6.getVisibility() == 0) {
                    viewUv6.setVisibility(8);
                }
            }
            toq.this.f90349d3 = false;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        /* JADX INFO: renamed from: q */
        public void mo26693q(AbstractC7346k.zy zyVar) {
            toq.this.f90349d3 = true;
            if (toq.this.m26657s() == null || toq.this.m26657s() != zyVar) {
                return;
            }
            toq toqVar = toq.this;
            toqVar.w831(toqVar.f90375x9kr);
            toq toqVar2 = toq.this;
            toqVar2.f90352f7l8 = toqVar2.m26657s();
            View viewUv6 = toq.this.uv6();
            if (viewUv6 != null) {
                viewUv6.setVisibility(0);
            }
            if (toq.this.f90372t8r != null) {
                toq.this.f90372t8r.mo26715q(zyVar);
            }
            toq toqVar3 = toq.this;
            toqVar3.f41828p.dd(0, toqVar3.f90352f7l8.f90341toq);
            if (viewUv6 != null) {
                viewUv6.layout(0, toq.this.f41828p.getHeight(), toq.this.f41828p.getWidth(), toq.this.f41828p.getHeight() + viewUv6.getMeasuredHeight());
            }
            toq toqVar4 = toq.this;
            toqVar4.w831(toqVar4.f90365n5r1);
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        public void toq(AbstractC7346k.zy zyVar) {
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar = toq.this;
            if (abstractC7347q == toqVar.f90367ncyb && toqVar.f90352f7l8 == zyVar) {
                if (toq.this.f41828p.getScrollY() != 0) {
                    toq toqVar2 = toq.this;
                    toqVar2.w831(toqVar2.f41827l);
                    if (toq.this.f90372t8r != null) {
                        toq.this.f90372t8r.toq(zyVar);
                    }
                    if (toq.this.f90355fu4 == 0) {
                        toq.this.f41828p.dd(0, 0);
                    }
                } else {
                    toq toqVar3 = toq.this;
                    toqVar3.w831(toqVar3.f90350dd);
                }
                View viewUv6 = toq.this.uv6();
                if (toq.this.f90355fu4 == 0 && viewUv6 != null && viewUv6.getVisibility() == 0) {
                    viewUv6.setVisibility(8);
                }
            }
            toq.this.f90349d3 = false;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.toq
        public void zy(AbstractC7346k.zy zyVar, int i2) {
            toq.this.f90349d3 = false;
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar = toq.this;
            if (abstractC7347q == toqVar.f90367ncyb && toqVar.f90352f7l8 == zyVar) {
                if (toq.this.f90372t8r != null) {
                    toq.this.f90372t8r.zy(zyVar, i2);
                }
                if (toq.this.f41828p.getScrollY() == 0) {
                    toq toqVar2 = toq.this;
                    toqVar2.w831(toqVar2.f90350dd);
                    return;
                }
                toq toqVar3 = toq.this;
                toqVar3.w831(toqVar3.f41827l);
                if (toq.this.f90355fu4 == 0) {
                    toq.this.f41828p.dd(0, 0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: CustomTrigger.java */
    private class qrj extends AbstractC7347q {
        private qrj() {
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        void mo26694k(int i2, int i3) {
            if (i3 == 0) {
                toq toqVar = toq.this;
                toqVar.w831(toqVar.f90367ncyb);
                if (toq.this.f90352f7l8 != null && (toq.this.f90352f7l8 instanceof AbstractC7346k.toq)) {
                    toq.this.f90352f7l8.m26660n();
                    toq toqVar2 = toq.this;
                    toqVar2.py(toqVar2.f90352f7l8, toq.this.f90373wvg);
                } else {
                    if (toq.this.m26657s() == null || !(toq.this.f90352f7l8 instanceof AbstractC7346k.zy)) {
                        return;
                    }
                    toq.this.m26657s().m26660n();
                    toq toqVar3 = toq.this;
                    toqVar3.py(toqVar3.f90352f7l8, toq.this.f90373wvg);
                }
            }
        }

        /* synthetic */ qrj(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$s */
    /* JADX INFO: compiled from: CustomTrigger.java */
    private class C7353s extends AbstractC7347q {
        private C7353s() {
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        public void mo26694k(int i2, int i3) {
            if (i2 == 0) {
                if (i3 == 1 || i3 == 2) {
                    toq toqVar = toq.this;
                    toqVar.w831(toqVar.f90375x9kr);
                }
            }
        }

        /* synthetic */ C7353s(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class C8115toq implements SpringBackLayout.InterfaceC7358k {
        C8115toq() {
        }

        @Override // miuix.springback.view.SpringBackLayout.InterfaceC7358k
        /* JADX INFO: renamed from: k */
        public boolean mo26719k() {
            return toq.this.f90347cdj.zy();
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.toq$y */
    /* JADX INFO: compiled from: CustomTrigger.java */
    private class C7354y extends AbstractC7347q {
        private C7354y() {
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        void mo26694k(int i2, int i3) {
            if (i3 == 0) {
                toq toqVar = toq.this;
                toqVar.w831(toqVar.f90350dd);
            }
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        void toq(int i2, int i3) {
            if (toq.this.f90352f7l8 == null || !(toq.this.f90352f7l8 instanceof AbstractC7346k.q)) {
                return;
            }
            toq toqVar = toq.this;
            if (toqVar.f90373wvg >= toqVar.f90352f7l8.f41812k || toq.this.f90355fu4 != 1) {
                return;
            }
            toq.this.f90358jk = -1;
            toq toqVar2 = toq.this;
            toqVar2.w831(toqVar2.f90375x9kr);
        }

        /* synthetic */ C7354y(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }

    /* JADX INFO: compiled from: CustomTrigger.java */
    class zy implements InterfaceC7613g {
        zy() {
        }

        @Override // qh4d.InterfaceC7613g
        /* JADX INFO: renamed from: k */
        public void mo26156k(int i2, int i3, boolean z2) {
            toq.this.f90355fu4 = i3;
            toq.this.f41833z = z2;
            toq.this.f90347cdj.mo26694k(i2, i3);
            AbstractC7347q abstractC7347q = toq.this.f90347cdj;
            toq toqVar = toq.this;
            if (abstractC7347q == toqVar.f90350dd) {
                View viewUv6 = toqVar.uv6();
                if (toq.this.f90349d3 || viewUv6 == null || viewUv6.getVisibility() != 0) {
                    return;
                }
                viewUv6.setVisibility(8);
                return;
            }
            toqVar.f90362ld6.setVisibility(0);
            View viewUv62 = toq.this.uv6();
            if (!toq.this.f90349d3 || viewUv62 == null || viewUv62.getVisibility() == 0) {
                return;
            }
            viewUv62.setVisibility(0);
        }

        @Override // qh4d.InterfaceC7613g
        public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            int i6 = i3 - i5;
            int i7 = i2 - i4;
            toq toqVar = toq.this;
            toqVar.f41831t = toqVar.f90373wvg;
            toqVar.f90373wvg = -view.getScrollY();
            toq.this.f41825h.update(toq.this.f90373wvg);
            toq toqVar2 = toq.this;
            toqVar2.f90368ni7 = toqVar2.f41825h.getVelocity(0);
            toq.this.f90362ld6.setTop(view.getScrollY());
            int paddingBottom = toq.this.f41828p.getTarget() != null ? toq.this.f41828p.getTarget().getPaddingBottom() : 0;
            if (toq.this.f90371qrj != null && view.getScrollY() >= 0) {
                toq.this.f90371qrj.layout(0, toq.this.f41828p.getHeight() - paddingBottom, view.getWidth(), (toq.this.f41828p.getHeight() - paddingBottom) + view.getScrollY());
            }
            toq toqVar3 = toq.this;
            if (toqVar3.f90373wvg < 0 && toqVar3.f90352f7l8 == toq.this.m26657s() && toq.this.m26657s() != null) {
                toq toqVar4 = toq.this;
                float fN5r1 = toqVar4.n5r1(toqVar4.f90352f7l8);
                if (toq.this.f90355fu4 == 1 && (Math.abs(toq.this.f41831t) < fN5r1 || Math.abs(toq.this.f90373wvg) < fN5r1)) {
                    AbstractC7347q abstractC7347q = toq.this.f90347cdj;
                    toq toqVar5 = toq.this;
                    if (abstractC7347q == toqVar5.f41827l) {
                        toqVar5.w831(toqVar5.f90375x9kr);
                    }
                }
            }
            if (toq.this.f90352f7l8 != null && (toq.this.f90352f7l8 instanceof AbstractC7346k.toq)) {
                toq toqVar6 = toq.this;
                float fN5r12 = toqVar6.n5r1(toqVar6.f90352f7l8);
                if (toq.this.f90355fu4 == 1 && (Math.abs(toq.this.f41831t) < fN5r12 || Math.abs(toq.this.f90373wvg) < fN5r12)) {
                    AbstractC7347q abstractC7347q2 = toq.this.f90347cdj;
                    toq toqVar7 = toq.this;
                    if (abstractC7347q2 == toqVar7.f41827l) {
                        toqVar7.w831(toqVar7.f90375x9kr);
                    }
                }
                if (toq.this.f90355fu4 == 1) {
                    AbstractC7347q abstractC7347q3 = toq.this.f90347cdj;
                    toq toqVar8 = toq.this;
                    if (abstractC7347q3 == toqVar8.f90365n5r1 && Math.abs(toqVar8.f41831t) > toq.this.f90352f7l8.f41812k) {
                        toq toqVar9 = toq.this;
                        toqVar9.w831(toqVar9.f90375x9kr);
                    }
                }
            }
            toq.this.f90347cdj.toq(i6, view.getScrollY());
            toq toqVar10 = toq.this;
            toqVar10.ltg8((SpringBackLayout) view, i7, i6, toqVar10.f90373wvg);
        }
    }

    public toq(Context context) {
        super(context);
        this.f90368ni7 = 0.0f;
        this.f41833z = true;
        this.f90369o1t = false;
        this.f90364mcp = -1L;
        this.f90358jk = -1;
        this.f90346a9 = false;
        this.f90354fti = false;
        this.f90359jp0y = false;
        this.f90356gvn7 = false;
        this.f90349d3 = false;
        this.f90370oc = new ViewOnLayoutChangeListenerC7349k();
        this.f90351eqxt = new C8115toq();
        this.f90348d2ok = new zy();
        this.f90363lvui = new C7352q();
        this.f41829r = new C7350n();
        ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k = null;
        C7353s c7353s = new C7353s(this, viewOnLayoutChangeListenerC7349k);
        this.f90350dd = c7353s;
        this.f90375x9kr = new x2(this, viewOnLayoutChangeListenerC7349k);
        this.f90367ncyb = new f7l8(this, viewOnLayoutChangeListenerC7349k);
        this.f41827l = new C7348g(this, viewOnLayoutChangeListenerC7349k);
        this.f90365n5r1 = new qrj(this, viewOnLayoutChangeListenerC7349k);
        this.f90357hyr = new C7354y(this, viewOnLayoutChangeListenerC7349k);
        this.f90347cdj = c7353s;
        ek5k(context);
    }

    /* JADX INFO: renamed from: a */
    private void m26695a(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.f7l8(i2);
        }
    }

    private void a98o(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.zy(i2);
        }
    }

    private void bf2(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26685n(i2);
        }
    }

    private void bo(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.zy(i2);
        }
    }

    private void c8jq(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.toq(i2);
        }
    }

    private void ch(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26689y(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m26696d(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26663g(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d8wk(AbstractC7346k.k kVar, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq)) {
            t8iq(i2);
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q)) {
            ikck(i2);
        } else {
            if (kVar == null || !(kVar instanceof AbstractC7346k.zy)) {
                return;
            }
            bf2(i2);
        }
    }

    private void dr(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26681y(i2);
        }
    }

    private void ek5k(Context context) {
        this.f41832y = context;
        this.f41830s = LayoutInflater.from(context);
        this.f41825h = new VelocityMonitor();
        RelativeLayout relativeLayout = (RelativeLayout) this.f41830s.inflate(toq.f7l8.f44449q, (ViewGroup) null);
        this.f90362ld6 = relativeLayout;
        this.f90374x2 = (FrameLayout) relativeLayout.findViewById(toq.C7694n.f44470f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public long m26697f() {
        if (this.f90364mcp == -1) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.f90364mcp;
    }

    private void fnq8(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26666p(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(AbstractC7346k.k kVar, AbstractC7346k.k kVar2, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq)) {
            if (Math.abs(i2) < kVar.f41812k) {
                xwq3(i2);
            }
            if (Math.abs(i2) >= kVar.f41812k && Math.abs(i2) < kVar.f90341toq) {
                y2(i2);
            }
            if (Math.abs(i2) >= kVar.f90341toq) {
                m26704u(i2);
                return;
            }
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q)) {
            if (Math.abs(i2) < kVar.f41812k) {
                tfm(i2);
            }
            if (Math.abs(i2) >= kVar.f41812k && Math.abs(i2) < kVar.f90341toq) {
                vq(i2);
            }
            if (Math.abs(i2) >= kVar.f90341toq) {
                m26696d(i2);
                return;
            }
            return;
        }
        if (kVar == null || !(kVar instanceof AbstractC7346k.zy)) {
            return;
        }
        if (Math.abs(i2) < kVar.f41812k) {
            nmn5(i2);
        }
        if (Math.abs(i2) >= kVar.f41812k && Math.abs(i2) < kVar.f90341toq) {
            m26695a(i2);
        }
        if (Math.abs(i2) >= kVar.f90341toq) {
            i1(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gbni(AbstractC7346k.k kVar, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq)) {
            c8jq(i2);
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q)) {
            qkj8(i2);
        } else {
            if (kVar == null || !(kVar instanceof AbstractC7346k.zy)) {
                return;
            }
            zp(i2);
        }
    }

    private void gyi(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26678p(i2);
        }
    }

    private void i1(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26683g(i2);
        }
    }

    private void ikck(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26665n(i2);
        }
    }

    private void lv5(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26684k(i2);
        }
    }

    /* JADX INFO: renamed from: m */
    private float m26701m() {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            return kVar.mo26667q();
        }
        return 0.0f;
    }

    private void mu(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.zy(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n5r1(AbstractC7346k.k kVar) {
        int i2;
        float f2;
        if (((kVar == null || !(kVar instanceof AbstractC7346k.toq)) ? (kVar == null || !(kVar instanceof AbstractC7346k.zy)) ? (kVar == null || !(kVar instanceof AbstractC7346k.q)) ? -1.0f : m26701m() : vyq() : nn86()) < 0.0f) {
            if (this.f90373wvg >= 0 || kVar != m26657s() || m26657s() == null) {
                AbstractC7346k.k kVar2 = this.f90352f7l8;
                if (kVar2 != null && (kVar instanceof AbstractC7346k.toq)) {
                    int i3 = kVar2.f90341toq;
                    i2 = kVar2.f41812k;
                    f2 = (i3 - i2) * f41823c;
                }
            } else {
                f2 = (m26657s().f90341toq - m26657s().f41812k) * f41823c;
                i2 = m26657s().f41812k;
            }
            return f2 + i2;
        }
        return 0.0f;
    }

    private void nmn5(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26688s(i2);
        }
    }

    private float nn86() {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            return interfaceC8114toq.mo26679q();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void py(AbstractC7346k.k kVar, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq)) {
            m26705v(i2);
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q)) {
            wo(i2);
        } else {
            if (kVar == null || !(kVar instanceof AbstractC7346k.zy)) {
                return;
            }
            lv5(i2);
        }
    }

    private void qkj8(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.toq(i2);
        }
    }

    private void qo(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26669y(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r8s8() {
        this.f90364mcp = -1L;
    }

    private void t8iq(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26677n(i2);
        }
    }

    private void tfm(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26668s(i2);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m26704u(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26675g(i2);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m26705v(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26676k(i2);
        }
    }

    private void vq(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.f7l8(i2);
        }
    }

    private float vyq() {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            return kVar.mo26687q();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void was(AbstractC7346k.k kVar, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq)) {
            bo(i2);
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q)) {
            mu(i2);
        } else {
            if (kVar == null || !(kVar instanceof AbstractC7346k.zy)) {
                return;
            }
            a98o(i2);
        }
    }

    private void wo(int i2) {
        AbstractC7346k.q.k kVar = this.f90353fn3e;
        if (kVar != null) {
            kVar.mo26664k(i2);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m26706x(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.mo26686p(i2);
        }
    }

    private void xwq3(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.mo26680s(i2);
        }
    }

    private void y2(int i2) {
        AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq = this.f41826i;
        if (interfaceC8114toq != null) {
            interfaceC8114toq.f7l8(i2);
        }
    }

    private void zp(int i2) {
        AbstractC7346k.zy.k kVar = this.f90376zurt;
        if (kVar != null) {
            kVar.toq(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zsr0(AbstractC7346k.k kVar, AbstractC7346k.k kVar2, int i2) {
        if (kVar != null && (kVar instanceof AbstractC7346k.toq) && kVar2 != kVar) {
            dr(i2);
            return;
        }
        if (kVar != null && (kVar instanceof AbstractC7346k.q) && kVar2 != kVar) {
            qo(i2);
        } else {
            if (kVar == null || !(kVar instanceof AbstractC7346k.zy) || kVar2 == kVar) {
                return;
            }
            ch(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m26708b() {
        return this.f90359jp0y;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC7346k.k m26709c() {
        return this.f90352f7l8;
    }

    public void cfr(ld6 ld6Var) {
        this.f90372t8r = ld6Var;
    }

    /* JADX INFO: renamed from: e */
    public View m26710e() {
        return this.f90366n7h;
    }

    public void etdu(AbstractC7346k.zy.k kVar) {
        this.f90376zurt = kVar;
    }

    public ViewGroup hb() {
        return this.f90374x2;
    }

    public void hyr(SpringBackLayout springBackLayout) {
        if (!springBackLayout.m26729l()) {
            springBackLayout.setSpringBackEnable(true);
        }
        this.f41828p = springBackLayout;
        springBackLayout.addView(this.f90362ld6);
        if (this.f90371qrj != null) {
            boolean z2 = false;
            for (int i2 = 0; i2 < this.f41828p.getChildCount(); i2++) {
                if (this.f41828p.getChildAt(i2) == this.f90371qrj) {
                    z2 = true;
                }
            }
            if (!z2) {
                this.f41828p.addView(this.f90371qrj);
            }
        }
        if (this.f90361kja0 != null) {
            boolean z3 = false;
            for (int i3 = 0; i3 < this.f90374x2.getChildCount(); i3++) {
                if (this.f90374x2.getChildAt(i3) == this.f90361kja0) {
                    z3 = true;
                }
            }
            if (!z3) {
                this.f90374x2.addView(this.f90361kja0);
            }
        }
        springBackLayout.addOnLayoutChangeListener(this.f90370oc);
        springBackLayout.setOnSpringListener(this.f90351eqxt);
        springBackLayout.mo26728k(this.f90348d2ok);
    }

    public abstract void i9jn(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    /* JADX INFO: renamed from: j */
    public ViewGroup m26711j() {
        return this.f90362ld6;
    }

    @Override // miuix.springback.trigger.AbstractC7346k
    public boolean ld6() {
        AbstractC7347q abstractC7347q = this.f90347cdj;
        return (abstractC7347q == null || abstractC7347q == this.f90350dd) ? false : true;
    }

    public AbstractC7347q lrht() {
        return this.f90347cdj;
    }

    public abstract void ltg8(SpringBackLayout springBackLayout, int i2, int i3, int i4);

    public void m4(InterfaceC7351p interfaceC7351p) {
        this.f90360ki = interfaceC7351p;
    }

    @Override // miuix.springback.trigger.AbstractC7346k
    /* JADX INFO: renamed from: n */
    public void mo26655n(AbstractC7346k.k kVar) {
        View view;
        View view2;
        View view3;
        super.mo26655n(kVar);
        if (kVar instanceof AbstractC7346k.zy) {
            this.f90354fti = true;
            AbstractC7346k.zy zyVar = (AbstractC7346k.zy) kVar;
            zyVar.f41820g = this.f90363lvui;
            if (this.f90371qrj == null) {
                View viewF7l8 = zyVar.f7l8(this.f41830s, this.f41828p);
                this.f90371qrj = viewF7l8;
                if (viewF7l8 == null) {
                    this.f90371qrj = this.f41830s.inflate(toq.f7l8.f44451y, (ViewGroup) null);
                }
                SpringBackLayout springBackLayout = this.f41828p;
                if (springBackLayout == null || (view3 = this.f90371qrj) == null) {
                    return;
                }
                springBackLayout.addView(view3);
                return;
            }
            return;
        }
        if (!(kVar instanceof AbstractC7346k.toq)) {
            if (kVar instanceof AbstractC7346k.q) {
                this.f90359jp0y = true;
                AbstractC7346k.q qVar = (AbstractC7346k.q) kVar;
                if (this.f90361kja0 == null) {
                    View viewF7l82 = qVar.f7l8(this.f41830s, this.f90374x2);
                    this.f90361kja0 = viewF7l82;
                    if (viewF7l82 == null) {
                        this.f90361kja0 = this.f41830s.inflate(toq.f7l8.f95010toq, (ViewGroup) this.f90374x2, false);
                    }
                    FrameLayout frameLayout = this.f90374x2;
                    if (frameLayout == null || (view = this.f90361kja0) == null) {
                        return;
                    }
                    frameLayout.addView(view);
                    return;
                }
                return;
            }
            return;
        }
        this.f90346a9 = true;
        AbstractC7346k.toq toqVar = (AbstractC7346k.toq) kVar;
        toqVar.f41817q = this.f41829r;
        if (this.f90366n7h == null) {
            View viewF7l83 = toqVar.f7l8(this.f41830s, this.f90362ld6);
            this.f90366n7h = viewF7l83;
            if (viewF7l83 == null) {
                View viewInflate = this.f41830s.inflate(toq.f7l8.f44447n, (ViewGroup) null);
                View viewInflate2 = this.f41830s.inflate(toq.f7l8.f44445g, (ViewGroup) null);
                View viewInflate3 = this.f41830s.inflate(toq.f7l8.f95006f7l8, (ViewGroup) null);
                this.f90362ld6.addView(viewInflate);
                this.f90362ld6.addView(viewInflate2);
                this.f90362ld6.addView(viewInflate3);
            }
            RelativeLayout relativeLayout = this.f90362ld6;
            if (relativeLayout == null || (view2 = this.f90366n7h) == null) {
                return;
            }
            relativeLayout.addView(view2);
        }
    }

    /* JADX INFO: renamed from: o */
    public View m26712o() {
        return this.f90361kja0;
    }

    @Override // miuix.springback.trigger.AbstractC7346k
    public boolean qrj(AbstractC7346k.k kVar) {
        boolean zQrj = super.qrj(kVar);
        if (zQrj && (kVar instanceof AbstractC7346k.zy)) {
            this.f90354fti = false;
            View view = this.f90371qrj;
            if (view != null) {
                this.f41828p.removeView(view);
                this.f90371qrj = null;
            }
        } else if (zQrj && (kVar instanceof AbstractC7346k.toq)) {
            this.f90346a9 = false;
            View view2 = this.f90366n7h;
            if (view2 != null) {
                this.f90362ld6.removeView(view2);
                this.f90366n7h = null;
            }
        } else if (zQrj && (kVar instanceof AbstractC7346k.q)) {
            this.f90359jp0y = false;
            View view3 = this.f90361kja0;
            if (view3 != null) {
                this.f90374x2.removeView(view3);
                this.f90361kja0 = null;
            }
        }
        return zQrj;
    }

    public void sok(AbstractC7346k.q.k kVar) {
        this.f90353fn3e = kVar;
    }

    public View uv6() {
        return this.f90371qrj;
    }

    public void v0af(AbstractC7346k.toq.InterfaceC8114toq interfaceC8114toq) {
        this.f41826i = interfaceC8114toq;
    }

    protected void w831(AbstractC7347q abstractC7347q) {
        AbstractC7346k.k kVar;
        this.f90347cdj = abstractC7347q;
        if (abstractC7347q == this.f90350dd) {
            if (this.f41833z && (kVar = this.f90352f7l8) != null) {
                kVar.m26661q();
                AbstractC7346k.k kVar2 = this.f90352f7l8;
                if (kVar2 instanceof AbstractC7346k.toq) {
                    gyi(this.f90373wvg);
                } else if (kVar2 instanceof AbstractC7346k.zy) {
                    m26706x(this.f90373wvg);
                } else if (kVar2 instanceof AbstractC7346k.q) {
                    fnq8(this.f90373wvg);
                }
            }
            this.f90352f7l8 = null;
            this.f90358jk = -1;
            this.f41825h.clear();
        }
    }

    @Override // miuix.springback.trigger.AbstractC7346k
    public boolean x2(AbstractC7346k.k kVar) {
        AbstractC7347q abstractC7347q = this.f90347cdj;
        return (abstractC7347q == null || abstractC7347q == this.f90350dd || this.f90352f7l8 != kVar) ? false : true;
    }

    public boolean y9n() {
        return this.f90354fti;
    }

    public boolean yz() {
        return this.f90346a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CustomTrigger.java */
    class x2 extends AbstractC7347q {

        /* JADX INFO: renamed from: k */
        private boolean f41842k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f90377toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f90378zy;

        private x2() {
            this.f41842k = false;
            this.f90377toq = false;
            this.f90378zy = false;
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        /* JADX INFO: renamed from: k */
        void mo26694k(int i2, int i3) {
            if (i3 == 0) {
                toq toqVar = toq.this;
                toqVar.w831(toqVar.f90350dd);
                toq.this.f41828p.dd(0, 0);
                this.f90377toq = false;
                this.f90378zy = false;
            }
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        void toq(int i2, int i3) {
            if (toq.this.f90355fu4 == 1 || toq.this.f90355fu4 == 2) {
                AbstractC7346k.k kVar = toq.this.f90352f7l8;
                toq toqVar = toq.this;
                if (toqVar.f90373wvg < 0) {
                    if (!toqVar.f90369o1t) {
                        this.f90377toq = false;
                    }
                    boolean z2 = this.f90377toq;
                    AbstractC7346k.zy zyVarM26657s = toq.this.m26657s();
                    if (zyVarM26657s != null) {
                        toq.this.f90349d3 = true;
                        View viewUv6 = toq.this.uv6();
                        if (viewUv6 != null && viewUv6.getVisibility() != 0) {
                            viewUv6.setVisibility(0);
                        }
                        toq.this.f90352f7l8 = zyVarM26657s;
                        toq toqVar2 = toq.this;
                        toqVar2.zsr0(toqVar2.f90352f7l8, kVar, toq.this.f41831t);
                        if (Math.abs(toq.this.f90373wvg) > toq.this.m26657s().f41812k && !toq.this.f90369o1t) {
                            toq.this.f90369o1t = true;
                            this.f90377toq = true;
                            toq.this.f90364mcp = SystemClock.elapsedRealtime();
                            zyVarM26657s.toq();
                            toq toqVar3 = toq.this;
                            toqVar3.was(toqVar3.f90352f7l8, toq.this.f90373wvg);
                        }
                        boolean z3 = this.f90377toq;
                        if (z2 != z3 && z3) {
                            zyVarM26657s.m26659k();
                            toq toqVar4 = toq.this;
                            toqVar4.d8wk(toqVar4.f90352f7l8, toq.this.f90373wvg);
                            if (toq.this.f90355fu4 == 2) {
                                toq.this.f41828p.dd(0, zyVarM26657s.f90341toq);
                                toq toqVar5 = toq.this;
                                toqVar5.w831(toqVar5.f90365n5r1);
                            }
                        }
                    }
                    toq toqVar6 = toq.this;
                    toqVar6.g1(toqVar6.f90352f7l8, kVar, toq.this.f90373wvg);
                    return;
                }
                this.f90377toq = false;
                int i4 = toqVar.f90358jk;
                boolean z5 = this.f41842k;
                AbstractC7346k.k kVar2 = toq.this.f90352f7l8;
                for (int i5 = 0; i5 < toq.this.f7l8().size(); i5++) {
                    toq toqVar7 = toq.this;
                    if (toqVar7.f90373wvg <= toqVar7.f7l8().get(i5).f41812k) {
                        break;
                    }
                    toq.this.f90358jk = i5;
                }
                if (toq.this.f90358jk >= 0) {
                    AbstractC7346k.k kVar3 = toq.this.f7l8().get(toq.this.f90358jk);
                    boolean z6 = kVar3 != null && (kVar3 instanceof AbstractC7346k.q);
                    if (!(z6 && toq.this.f90368ni7 < toq.f90344lrht && toq.this.f90355fu4 == 1) && z6) {
                        toq.this.f90358jk = i4;
                    } else {
                        toq.this.f90352f7l8 = kVar3;
                        toq toqVar8 = toq.this;
                        toqVar8.zsr0(toqVar8.f90352f7l8, kVar, toq.this.f41831t);
                        toq toqVar9 = toq.this;
                        this.f41842k = toqVar9.f90373wvg >= toqVar9.f90352f7l8.f90341toq;
                    }
                } else {
                    toq.this.f90352f7l8 = null;
                    this.f41842k = false;
                }
                if (i4 != toq.this.f90358jk) {
                    if (kVar2 != null) {
                        kVar2.mo7380s();
                        if (toq.this.m26712o() != null) {
                            toq.this.m26712o().setVisibility(8);
                        }
                    }
                    if (toq.this.f90352f7l8 != null) {
                        if (toq.this.f90352f7l8 instanceof AbstractC7346k.toq) {
                            if (toq.this.m26712o() != null) {
                                toq.this.m26712o().setVisibility(8);
                            }
                        } else if ((toq.this.f90352f7l8 instanceof AbstractC7346k.q) && toq.this.m26712o() != null) {
                            toq.this.m26712o().setVisibility(0);
                        }
                        toq.this.f90364mcp = SystemClock.elapsedRealtime();
                        toq.this.f90352f7l8.toq();
                        toq toqVar10 = toq.this;
                        toqVar10.was(toqVar10.f90352f7l8, toq.this.f90373wvg);
                        this.f90378zy = false;
                        if (this.f41842k) {
                            if (toq.this.f90352f7l8 instanceof AbstractC7346k.q) {
                                this.f90378zy = true;
                                HapticCompat.m26766g(toq.this.f41828p, C7385p.f92246mcp, C7385p.f92245ld6);
                            }
                            toq.this.f90352f7l8.m26659k();
                            toq toqVar11 = toq.this;
                            toqVar11.d8wk(toqVar11.f90352f7l8, toq.this.f90373wvg);
                        }
                    } else if (toq.this.m26712o() != null) {
                        toq.this.m26712o().setVisibility(8);
                    }
                } else if (kVar2 != null && z5 != this.f41842k) {
                    if (z5) {
                        toq.this.f90364mcp = SystemClock.elapsedRealtime();
                        kVar2.toq();
                        toq toqVar12 = toq.this;
                        toqVar12.was(toqVar12.f90352f7l8, toq.this.f90373wvg);
                        this.f90378zy = false;
                    } else {
                        if (toq.this.f90352f7l8 instanceof AbstractC7346k.q) {
                            this.f90378zy = true;
                        }
                        HapticCompat.m26766g(toq.this.f41828p, C7385p.f92246mcp, C7385p.f92251qrj);
                        kVar2.m26659k();
                        toq toqVar13 = toq.this;
                        toqVar13.d8wk(toqVar13.f90352f7l8, toq.this.f90373wvg);
                    }
                }
                toq toqVar14 = toq.this;
                toqVar14.g1(toqVar14.f90352f7l8, kVar, toq.this.f90373wvg);
            }
        }

        @Override // miuix.springback.trigger.AbstractC7347q
        boolean zy() {
            if ((!this.f41842k || toq.this.f90352f7l8 == null) && toq.this.f90352f7l8 != null && (toq.this.f90352f7l8 instanceof AbstractC7346k.q) && toq.this.m26712o() != null) {
                toq.this.m26712o().setVisibility(8);
            }
            if (toq.this.f90352f7l8 == null) {
                return false;
            }
            if (toq.this.f90352f7l8 instanceof AbstractC7346k.toq) {
                toq toqVar = toq.this;
                if (toqVar.f90373wvg > toqVar.f90352f7l8.f41812k) {
                    if (this.f41842k) {
                        toq toqVar2 = toq.this;
                        toqVar2.f41828p.dd(0, -toqVar2.f90352f7l8.f90341toq);
                        toq toqVar3 = toq.this;
                        toqVar3.w831(toqVar3.f90365n5r1);
                    } else {
                        if (Math.abs(toq.this.f41828p.getScaleY()) < Math.abs(toq.this.f90352f7l8.f90341toq)) {
                            toq.this.f90352f7l8.zy();
                            toq toqVar4 = toq.this;
                            toqVar4.gbni(toqVar4.f90352f7l8, toq.this.f90373wvg);
                        }
                        toq.this.f41828p.dd(0, 0);
                    }
                    return true;
                }
            }
            if (toq.this.f90352f7l8 instanceof AbstractC7346k.zy) {
                toq toqVar5 = toq.this;
                toqVar5.f41828p.dd(0, toqVar5.f90352f7l8.f90341toq);
                toq toqVar6 = toq.this;
                toqVar6.w831(toqVar6.f90365n5r1);
                return true;
            }
            toq toqVar7 = toq.this;
            toqVar7.w831(toqVar7.f90357hyr);
            if (this.f90378zy) {
                toq.this.f90352f7l8.m26660n();
                toq toqVar8 = toq.this;
                toqVar8.py(toqVar8.f90352f7l8, toq.this.f90373wvg);
            } else {
                toq.this.f90352f7l8.zy();
                toq toqVar9 = toq.this;
                toqVar9.gbni(toqVar9.f90352f7l8, toq.this.f90373wvg);
            }
            if (toq.this.m26712o() != null) {
                toq.this.m26712o().setVisibility(8);
            }
            return false;
        }

        /* synthetic */ x2(toq toqVar, ViewOnLayoutChangeListenerC7349k viewOnLayoutChangeListenerC7349k) {
            this();
        }
    }
}
