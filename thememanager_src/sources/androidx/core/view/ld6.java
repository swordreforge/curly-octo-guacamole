package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: DragStartHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private final View f4061k;

    /* JADX INFO: renamed from: n */
    private boolean f4062n;

    /* JADX INFO: renamed from: q */
    private int f4063q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC0705k f50840toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f50841zy;

    /* JADX INFO: renamed from: g */
    private final View.OnLongClickListener f4060g = new View.OnLongClickListener() { // from class: androidx.core.view.s
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f4105k.m3364q(view);
        }
    };

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final View.OnTouchListener f50839f7l8 = new View.OnTouchListener() { // from class: androidx.core.view.p
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f4083k.m3363n(view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: androidx.core.view.ld6$k */
    /* JADX INFO: compiled from: DragStartHelper.java */
    public interface InterfaceC0705k {
        /* JADX INFO: renamed from: k */
        boolean m3365k(@zy.lvui View view, @zy.lvui ld6 ld6Var);
    }

    public ld6(@zy.lvui View view, @zy.lvui InterfaceC0705k interfaceC0705k) {
        this.f4061k = view;
        this.f50840toq = interfaceC0705k;
    }

    /* JADX INFO: renamed from: k */
    public void m3362k() {
        this.f4061k.setOnLongClickListener(this.f4060g);
        this.f4061k.setOnTouchListener(this.f50839f7l8);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3363n(@zy.lvui android.view.View r7, @zy.lvui android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.C0720t.x2(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f4062n
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f50841zy
            if (r8 != r0) goto L39
            int r8 = r6.f4063q
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f50841zy = r0
            r6.f4063q = r1
            androidx.core.view.ld6$k r8 = r6.f50840toq
            boolean r7 = r8.m3365k(r7, r6)
            r6.f4062n = r7
            return r7
        L46:
            r6.f4062n = r3
            goto L4d
        L49:
            r6.f50841zy = r0
            r6.f4063q = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ld6.m3363n(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: q */
    public boolean m3364q(@zy.lvui View view) {
        return this.f50840toq.m3365k(view, this);
    }

    public void toq() {
        this.f4061k.setOnLongClickListener(null);
        this.f4061k.setOnTouchListener(null);
    }

    public void zy(@zy.lvui Point point) {
        point.set(this.f50841zy, this.f4063q);
    }
}
