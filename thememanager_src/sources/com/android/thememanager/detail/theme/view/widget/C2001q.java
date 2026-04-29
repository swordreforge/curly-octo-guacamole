package com.android.thememanager.detail.theme.view.widget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ikck;
import androidx.core.view.sok;
import androidx.core.view.tfm;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.window.layout.o1t;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.CornerImageView;
import com.android.thememanager.basemodule.views.RoundCornerSpringLayout;
import com.google.gson.C4871g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q */
/* JADX INFO: compiled from: DetailFullScreenPreview.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2001q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f58028cdj = "LocalTrackId_theme_detail_full_screen_preview";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f58029fn3e = -1;

    /* JADX INFO: renamed from: h */
    private static final String f11377h = "DetailFullPreview";

    /* JADX INFO: renamed from: i */
    private static final String f11378i = "SWIPE";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f58030ki = "SHOW";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f58031t8r = "HIDE";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ViewPager2 f58032f7l8;

    /* JADX INFO: renamed from: g */
    private View f11379g;

    /* JADX INFO: renamed from: k */
    private q f11380k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private sok f58033kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int f58034ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private CornerImageView f58035n7h;

    /* JADX INFO: renamed from: q */
    private String f11383q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f58036qrj;

    /* JADX INFO: renamed from: s */
    private final ResourceDetailPreview f11384s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Activity f58037toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f58038x2;

    /* JADX INFO: renamed from: y */
    private RoundCornerSpringLayout f11385y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private FrameLayout.LayoutParams f58039zy;

    /* JADX INFO: renamed from: n */
    private int f11381n = -1;

    /* JADX INFO: renamed from: p */
    private boolean f11382p = true;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$f7l8 */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    public static class f7l8 extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private AsyncTaskC1733q.k f11386k;

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$f7l8$k */
        /* JADX INFO: compiled from: DetailFullScreenPreview.java */
        class k implements AsyncTaskC1733q.k {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f11387k;

            k(final View val$itemView) {
                this.f11387k = val$itemView;
            }

            @Override // com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q.k
            public void ld6(String key, Bitmap bitmap) {
                if (bitmap != null) {
                    ((ImageView) this.f11387k.findViewById(R.id.imageView)).setImageBitmap(bitmap);
                }
            }
        }

        public f7l8(View itemView) {
            super(itemView);
            this.f11386k = new k(itemView);
        }

        public void ki(String previewUrl, int position) {
            this.itemView.setTag(Integer.valueOf(position));
            new AsyncTaskC1733q(previewUrl, Bitmap.Config.ARGB_8888, this.itemView.getWidth(), this.itemView.getHeight(), C1807g.m7081r() ? 1 : 2, this.f11386k, null, com.android.thememanager.basemodule.utils.qrj.zy(qrj.toq.THEME_DETAIL)).toq();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$g */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    private static class g extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private final WeakReference<C2001q> f11389k;

        /* JADX INFO: renamed from: q */
        private final int f11390q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final WeakReference<View> f58040toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final float f58041zy;

        g(C2001q view, View parent, float translateX, int cornerSize) {
            this.f11389k = new WeakReference<>(view);
            this.f58040toq = new WeakReference<>(parent);
            this.f11390q = cornerSize;
            this.f58041zy = translateX;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2001q c2001q = this.f11389k.get();
            View view = this.f58040toq.get();
            if (c2001q == null || view == null) {
                return;
            }
            c2001q.f11382p = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object toTag, FloatProperty property, float value, float velocity, boolean isCompleted) {
            C2001q c2001q = this.f11389k.get();
            if (c2001q == null || property == null || !ViewProperty.TRANSLATION_X.getName().equals(property.getName())) {
                return;
            }
            float f2 = this.f58041zy;
            c2001q.ki((f2 - value) / f2, this.f11390q, C1807g.toq(c2001q.f58037toq), this.f11390q, C1807g.m7076k(c2001q.f58037toq));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$k */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    class k extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ n f11391k;

        k(final n val$scrollCallback) {
            this.f11391k = val$scrollCallback;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            C2001q.this.cdj("SWIPE", C2001q.this.f11381n < position ? "left" : "right");
            C2001q.this.f11381n = position;
            n nVar = this.f11391k;
            if (nVar != null) {
                nVar.mo7829k(position);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$n */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    interface n {
        /* JADX INFO: renamed from: k */
        void mo7829k(int position);
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$q */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    private static class q extends RecyclerView.AbstractC1060y<f7l8> implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        private float f11392g;

        /* JADX INFO: renamed from: k */
        private List<String> f11393k = new ArrayList();

        /* JADX INFO: renamed from: n */
        private int f11394n;

        /* JADX INFO: renamed from: p */
        private String f11395p;

        /* JADX INFO: renamed from: q */
        private int f11396q;

        /* JADX INFO: renamed from: s */
        private final WeakReference<C2001q> f11397s;

        /* JADX INFO: renamed from: y */
        private float f11398y;

        q(C2001q viewPager, Drawable drawable, int w2, int h2, float imageRatio) {
            WeakReference<C2001q> weakReference = new WeakReference<>(viewPager);
            this.f11397s = weakReference;
            this.f11396q = w2;
            this.f11394n = h2;
            this.f11392g = h2 / w2;
            this.f11398y = imageRatio;
            if (weakReference.get() != null) {
                this.f11395p = weakReference.get().f11383q;
            }
        }

        public List<String> cdj() {
            return this.f11393k;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public f7l8 onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
            int i2;
            int i3;
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.full_preview_viewholder, parent, false);
            CornerImageView cornerImageView = (CornerImageView) viewInflate.findViewById(R.id.imageView);
            if (C1807g.m7081r()) {
                float f2 = this.f11392g;
                float f3 = this.f11398y;
                if (f2 - f3 <= 0.0f) {
                    i3 = this.f11394n;
                    i2 = (int) (i3 / f3);
                } else {
                    int i4 = this.f11396q;
                    int i5 = (int) (i4 * f3);
                    i2 = i4;
                    i3 = i5;
                }
                cornerImageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i3));
                cornerImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                cornerImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                cornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            viewInflate.setOnClickListener(this);
            return new f7l8(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f11393k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui f7l8 holder, int position) {
            holder.ki(this.f11393k.get(position), position);
            C1812k.toq(holder.itemView, String.valueOf(position + 1));
        }

        public void ni7(List<String> previewUrls) {
            this.f11393k = previewUrls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f11397s.get() != null) {
                this.f11397s.get().f11384s.a9();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$toq */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo7830k(int corner);
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.q$zy */
    /* JADX INFO: compiled from: DetailFullScreenPreview.java */
    private static class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private final WeakReference<C2001q> f11399k;

        /* JADX INFO: renamed from: n */
        private final toq f11400n;

        /* JADX INFO: renamed from: q */
        private final int f11401q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final float f58043toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final float f58044zy;

        zy(C2001q view, float tx, float ty, int cornerSize, toq callback) {
            this.f11399k = new WeakReference<>(view);
            this.f58043toq = tx;
            this.f58044zy = ty;
            this.f11401q = cornerSize;
            this.f11400n = callback;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2001q c2001q = this.f11399k.get();
            if (c2001q == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) c2001q.f58037toq.getWindow().getDecorView();
            viewGroup.removeView(c2001q.f11385y);
            if (c2001q.f11379g != null && c2001q.f11379g.getParent() != null) {
                viewGroup.removeView(c2001q.f11379g);
            }
            toq toqVar = this.f11400n;
            if (toqVar != null) {
                toqVar.mo7830k(0);
            }
            c2001q.f11382p = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object toTag, FloatProperty property, float value, float velocity, boolean isCompleted) {
            C2001q c2001q = this.f11399k.get();
            if (c2001q == null) {
                return;
            }
            if (property != null && ViewProperty.TRANSLATION_X.getName().equals(property.getName())) {
                float f2 = this.f58043toq;
                if (f2 != 0.0f) {
                    c2001q.ki(value / f2, C1807g.toq(c2001q.f58037toq), this.f11401q, C1807g.m7076k(c2001q.f58037toq), this.f11401q);
                    return;
                }
            }
            if (property == null || !ViewProperty.TRANSLATION_Y.getName().equals(property.getName())) {
                return;
            }
            float f3 = this.f58044zy;
            if (f3 != 0.0f) {
                c2001q.ki(value / f3, C1807g.toq(c2001q.f58037toq), this.f11401q, C1807g.m7076k(c2001q.f58037toq), this.f11401q);
            }
        }
    }

    public C2001q(ResourceDetailPreview preview, View parent, @dd String resourceCode, n scrollCallback, List<String> previewUrl, float previewRatio) {
        this.f11384s = preview;
        this.f11385y = (RoundCornerSpringLayout) parent;
        this.f58037toq = (Activity) parent.getContext();
        Rect rectM5736k = o1t.toq().zy(this.f58037toq).m5736k();
        this.f58034ld6 = rectM5736k.width();
        this.f58038x2 = rectM5736k.height();
        this.f58033kja0 = ikck.m3315k(this.f58037toq.getWindow(), preview);
        this.f58037toq.getWindow().getDecorView().getWindowVisibleDisplayFrame(rectM5736k);
        this.f58036qrj = rectM5736k.top;
        this.f11383q = resourceCode;
        View decorView = this.f58037toq.getWindow().getDecorView();
        this.f11380k = new q(this, this.f58037toq.getDrawable(R.color.de_color_84_d6d6d6), decorView.getMeasuredWidth(), decorView.getMeasuredHeight(), previewRatio);
        ViewPager2 viewPager2 = (ViewPager2) parent.findViewById(R.id.viewpager2);
        this.f58032f7l8 = viewPager2;
        viewPager2.setOffscreenPageLimit(1);
        int childCount = this.f58032f7l8.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (this.f58032f7l8.getChildAt(i2) instanceof RecyclerView) {
                this.f58032f7l8.getChildAt(i2).setOverScrollMode(2);
                break;
            }
            i2++;
        }
        this.f11380k.ni7(previewUrl);
        this.f58032f7l8.setAdapter(this.f11380k);
        this.f58032f7l8.registerOnPageChangeCallback(new k(scrollCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj(String actionType, String extra) {
        if (this.f58037toq instanceof InterfaceC1719p) {
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            arrayMapM6679k.put("content", extra);
            if (!p029m.zy.toq(this.f11383q)) {
                arrayMapM6679k.put("resourceType", this.f11383q);
            }
            ((InterfaceC1719p) this.f58037toq).nme(actionType, f58028cdj, new C4871g().o1t(arrayMapM6679k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki(float progress, int startTopSize, int endTopSize, int startBottomSize, int endBottomSize) {
        this.f11385y.lrht((int) (startTopSize + ((endTopSize - startTopSize) * progress)), (int) (startBottomSize + ((endBottomSize - startBottomSize) * progress)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0(int i2) {
        CornerImageView cornerImageView;
        if (!C1807g.m7081r() || (cornerImageView = this.f58035n7h) == null) {
            return;
        }
        cornerImageView.setCorner(i2);
    }

    private String x2() {
        return (this.f11381n + 1) + ":" + this.f11380k.getItemCount();
    }

    /* JADX INFO: renamed from: h */
    public void m7828h(View parent, int currentIndex, int x3, int y3, int width, int height) {
        if (!this.f11382p) {
            Log.d(f11377h, "mCanClick == false");
            return;
        }
        if (parent.getParent() == null && !y9n.mcp(this.f11380k.cdj())) {
            if (this.f58039zy == null) {
                this.f58039zy = new FrameLayout.LayoutParams(-1, -1);
            }
            sok sokVar = this.f58033kja0;
            if (sokVar != null) {
                sokVar.m3440q(tfm.qrj.m3498s());
                this.f58033kja0.m3439p(1);
            }
            this.f58032f7l8.setCurrentItem(currentIndex, false);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f58039zy);
            if (this.f11379g == null) {
                View view = new View(this.f58037toq, null);
                this.f11379g = view;
                view.setBackgroundColor(this.f58037toq.getResources().getColor(android.R.color.black));
            }
            ViewGroup viewGroup = (ViewGroup) this.f58037toq.getWindow().getDecorView();
            viewGroup.addView(this.f11379g, layoutParams);
            viewGroup.addView(parent, layoutParams);
            C6077k.zy(this.f11379g);
            int i2 = this.f58034ld6;
            float f2 = (x3 + (width / 2.0f)) - (i2 / 2.0f);
            int i3 = this.f58038x2;
            int dimensionPixelOffset = this.f58037toq.getResources().getDimensionPixelOffset(R.dimen.de_detail_corner_radius);
            this.f11382p = false;
            C6077k.fti(parent, f2, 0.0f, (y3 + (height / 2.0f)) - (i3 / 2.0f), 0.0f, (float) ((((double) width) * 1.0d) / ((double) i2)), 1.0f, (float) ((((double) height) * 1.0d) / ((double) i3)), 1.0f, new g(this, parent, f2, dimensionPixelOffset));
            this.f11381n = currentIndex;
            cdj(f58030ki, x2());
        }
    }

    public boolean n7h() {
        CornerImageView cornerImageView;
        View viewFindViewById;
        if (!this.f11382p) {
            Log.d(f11377h, "mCanClick == false");
            return false;
        }
        sok sokVar = this.f58033kja0;
        if (sokVar != null) {
            sokVar.ld6(tfm.qrj.m3498s());
        }
        View viewFindViewByPosition = this.f11384s.getLayoutManager().findViewByPosition(this.f11381n);
        if (viewFindViewByPosition == null) {
            Log.e(f11377h, "hide fail because view is null.");
            return false;
        }
        ((View) this.f58032f7l8.getParent()).setBackgroundColor(bf2.toq.toq().getResources().getColor(android.R.color.transparent));
        if (this.f11380k.getItemCount() == 1 && (viewFindViewByPosition instanceof FrameLayout) && (viewFindViewById = viewFindViewByPosition.findViewById(R.id.thumbnail)) != null) {
            viewFindViewByPosition = viewFindViewById;
        }
        int[] iArr = new int[2];
        if (C1807g.lvui() && C1819o.m7164r(this.f58037toq)) {
            viewFindViewByPosition.getLocationInWindow(iArr);
        } else {
            viewFindViewByPosition.getLocationOnScreen(iArr);
        }
        int width = viewFindViewByPosition.getWidth();
        int height = viewFindViewByPosition.getHeight();
        int i2 = this.f58034ld6;
        float f2 = (iArr[0] + (width / 2.0f)) - (i2 / 2.0f);
        int i3 = this.f58038x2;
        float f3 = (iArr[1] + (height / 2.0f)) - (i3 / 2.0f);
        float f4 = (float) ((((double) width) * 1.0d) / ((double) i2));
        float f5 = (float) ((((double) height) * 1.0d) / ((double) i3));
        float fMax = C1807g.m7081r() ? Math.max(f4, f5) : Math.min(f4, f5);
        int dimensionPixelOffset = (this.f58037toq.getResources().getDimensionPixelOffset(R.dimen.de_detail_corner_radius) * this.f58034ld6) / width;
        this.f11382p = false;
        C6077k.m22370k(this.f11379g);
        int i4 = 0;
        while (true) {
            if (i4 < this.f58032f7l8.getChildCount()) {
                View viewFindViewWithTag = ((RecyclerView) this.f58032f7l8.getChildAt(i4)).findViewWithTag(Integer.valueOf(this.f58032f7l8.getCurrentItem()));
                if (viewFindViewWithTag != null && (viewFindViewWithTag.findViewById(R.id.imageView) instanceof ImageView)) {
                    this.f58035n7h = (CornerImageView) viewFindViewWithTag.findViewById(R.id.imageView);
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (C1807g.m7081r() && (cornerImageView = this.f58035n7h) != null) {
            cornerImageView.setCorner(dimensionPixelOffset);
        }
        C6077k.fti(this.f11385y, 0.0f, f2, 0.0f, f3, 1.0f, fMax, 1.0f, fMax, new zy(this, f2, f3, dimensionPixelOffset, new toq() { // from class: com.android.thememanager.detail.theme.view.widget.zy
            @Override // com.android.thememanager.detail.theme.view.widget.C2001q.toq
            /* JADX INFO: renamed from: k */
            public final void mo7830k(int i5) {
                this.f11405k.kja0(i5);
            }
        }));
        cdj(f58031t8r, x2());
        this.f11381n = -1;
        return true;
    }

    public int qrj() {
        return this.f11381n;
    }
}
