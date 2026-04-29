package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.x */
/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class C0221x {

    /* JADX INFO: renamed from: y */
    private static final String f1202y = "TooltipPopup";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int[] f46966f7l8;

    /* JADX INFO: renamed from: g */
    private final int[] f1203g;

    /* JADX INFO: renamed from: k */
    private final Context f1204k;

    /* JADX INFO: renamed from: n */
    private final Rect f1205n;

    /* JADX INFO: renamed from: q */
    private final WindowManager.LayoutParams f1206q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final View f46967toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final TextView f46968zy;

    C0221x(@zy.lvui Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1206q = layoutParams;
        this.f1205n = new Rect();
        this.f1203g = new int[2];
        this.f46966f7l8 = new int[2];
        this.f1204k = context;
        View viewInflate = LayoutInflater.from(context).inflate(C7397k.p.f42419t, (ViewGroup) null);
        this.f46967toq = viewInflate;
        this.f46968zy = (TextView) viewInflate.findViewById(C7397k.f7l8.f92310d3);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C7397k.x2.f42516n;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: k */
    private void m735k(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1204k.getResources().getDimensionPixelOffset(C7397k.n.f92479i9jn);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1204k.getResources().getDimensionPixelOffset(C7397k.n.f92501py);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1204k.getResources().getDimensionPixelOffset(z2 ? C7397k.n.f92490m4 : C7397k.n.f92505r8s8);
        View qVar = toq(view);
        if (qVar == null) {
            Log.e(f1202y, "Cannot find app view");
            return;
        }
        qVar.getWindowVisibleDisplayFrame(this.f1205n);
        Rect rect = this.f1205n;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1204k.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1205n.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        qVar.getLocationOnScreen(this.f46966f7l8);
        view.getLocationOnScreen(this.f1203g);
        int[] iArr = this.f1203g;
        int i5 = iArr[0];
        int[] iArr2 = this.f46966f7l8;
        int i6 = i5 - iArr2[0];
        iArr[0] = i6;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i6 + i2) - (qVar.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f46967toq.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f46967toq.getMeasuredHeight();
        int i7 = this.f1203g[1];
        int i8 = ((i4 + i7) - dimensionPixelOffset3) - measuredHeight;
        int i9 = i7 + height + dimensionPixelOffset3;
        if (z2) {
            if (i8 >= 0) {
                layoutParams.y = i8;
                return;
            } else {
                layoutParams.y = i9;
                return;
            }
        }
        if (measuredHeight + i9 <= this.f1205n.height()) {
            layoutParams.y = i9;
        } else {
            layoutParams.y = i8;
        }
    }

    private static View toq(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: renamed from: n */
    void m736n(View view, int i2, int i3, boolean z2, CharSequence charSequence) {
        if (m737q()) {
            zy();
        }
        this.f46968zy.setText(charSequence);
        m735k(view, i2, i3, z2, this.f1206q);
        ((WindowManager) this.f1204k.getSystemService("window")).addView(this.f46967toq, this.f1206q);
    }

    /* JADX INFO: renamed from: q */
    boolean m737q() {
        return this.f46967toq.getParent() != null;
    }

    void zy() {
        if (m737q()) {
            ((WindowManager) this.f1204k.getSystemService("window")).removeView(this.f46967toq);
        }
    }
}
