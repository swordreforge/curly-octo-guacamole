package miuix.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import miuix.internal.util.C7164n;

/* JADX INFO: renamed from: miuix.appcompat.widget.k */
/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7061k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87161f7l8 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f39728g = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f87162ld6 = 1;

    /* JADX INFO: renamed from: n */
    private static final String f39729n = "BadgeDrawable";

    /* JADX INFO: renamed from: p */
    public static final int f39730p = 0;

    /* JADX INFO: renamed from: s */
    public static final int f39731s = 3;

    /* JADX INFO: renamed from: y */
    public static final int f39732y = 2;

    /* JADX INFO: renamed from: k */
    private Drawable f39733k;

    /* JADX INFO: renamed from: q */
    private View f39734q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f87163toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87164zy;

    public C7061k(Context context) {
        this(context, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Rect f7l8(android.view.View r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "BadgeDrawable"
            if (r11 != 0) goto Lb
            java.lang.String r11 = "can not attach badge on a null object."
            android.util.Log.d(r1, r11)
            return r0
        Lb:
            android.graphics.drawable.Drawable r2 = r10.f39733k
            if (r2 != 0) goto L15
            java.lang.String r11 = "can not find badge drawable resource."
            android.util.Log.d(r1, r11)
            return r0
        L15:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.Drawable r2 = r10.f39733k
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r10.f39733k
            android.graphics.drawable.Drawable r3 = r3.getCurrent()
            int r3 = r3.getIntrinsicHeight()
            r11.getDrawingRect(r0)
            boolean r11 = miuix.internal.util.n7h.x2(r11)
            int r4 = r10.f87164zy
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L6a
            r8 = 3
            if (r4 == r7) goto L4d
            if (r4 == r5) goto L6a
            if (r4 == r8) goto L4d
            java.lang.String r11 = "invalid gravity value."
            android.util.Log.d(r1, r11)
            r11 = r6
            r12 = r11
            r3 = r12
            goto L9c
        L4d:
            int r12 = r0.bottom
            int r12 = r12 - r3
            int r3 = r3 + r12
            if (r11 != 0) goto L55
            if (r4 == r7) goto L59
        L55:
            if (r11 == 0) goto L5a
            if (r4 != r8) goto L5a
        L59:
            r6 = r7
        L5a:
            if (r6 == 0) goto L5f
            int r11 = r0.left
            goto L62
        L5f:
            int r11 = r0.right
            int r11 = r11 - r2
        L62:
            r6 = r11
            int r11 = r6 + r2
            r9 = r12
            r12 = r11
            r11 = r6
            r6 = r9
            goto L9c
        L6a:
            if (r12 != r7) goto L72
            int r1 = r0.top
            int r8 = r3 / 2
            int r1 = r1 - r8
            goto L74
        L72:
            int r1 = r0.top
        L74:
            int r3 = r3 + r1
            if (r11 != 0) goto L79
            if (r4 == 0) goto L7d
        L79:
            if (r11 == 0) goto L7e
            if (r4 != r5) goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r12 != r7) goto L8e
            if (r6 == 0) goto L88
            int r11 = r0.left
            int r12 = r2 / 2
            int r11 = r11 + r12
            goto L96
        L88:
            int r11 = r0.right
            int r12 = r2 / 2
            int r11 = r11 - r12
            goto L96
        L8e:
            if (r6 == 0) goto L93
            int r11 = r0.left
            goto L96
        L93:
            int r11 = r0.right
            int r11 = r11 - r2
        L96:
            r6 = r11
            int r11 = r6 + r2
            r12 = r11
            r11 = r6
            r6 = r1
        L9c:
            r0.top = r6
            r0.left = r11
            r0.bottom = r3
            r0.right = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.widget.C7061k.f7l8(android.view.View, int):android.graphics.Rect");
    }

    /* JADX INFO: renamed from: g */
    private Drawable m25481g() {
        return C7164n.m25952s(this.f87163toq, toq.C6055q.f34925m);
    }

    /* JADX INFO: renamed from: k */
    public void m25482k(View view) {
        toq(view, this.f87164zy);
    }

    /* JADX INFO: renamed from: n */
    public void m25483n(View view) {
        if (view != null) {
            view.getOverlay().remove(this.f39733k);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m25484q() {
        View view = this.f39734q;
        if (view != null) {
            view.getOverlay().clear();
        }
    }

    public void toq(View view, int i2) {
        zy(view, i2, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m25485y(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            this.f87164zy = i2;
        } else {
            Log.d(f39729n, "set invalid gravity value.");
            this.f87164zy = 2;
        }
    }

    public void zy(View view, int i2, int i3) {
        m25485y(i2);
        Rect rectF7l8 = f7l8(view, i3);
        if (rectF7l8 == null) {
            Log.d(f39729n, "attach failed.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        this.f39733k.setBounds(rectF7l8);
        view.getOverlay().add(this.f39733k);
        this.f39734q = view;
    }

    public C7061k(Context context, int i2) {
        m25485y(i2);
        this.f87163toq = context;
        this.f39733k = m25481g();
    }
}
