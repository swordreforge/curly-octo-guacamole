package com.android.thememanager.view.largeicon;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.ShadowLayout;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.fn3e;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.zy;
import com.android.thememanager.recommend.view.listview.decoration.C2364q;
import com.android.thememanager.settings.superwallpaper.utils.C2662g;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.view.C2938r;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.request.target.n7h;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import com.bumptech.glide.signature.C3197n;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.listener.TransitionListener;
import miuix.smooth.SmoothFrameLayout2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconHeaderView<T extends com.android.thememanager.module.detail.presenter.zy, C extends AbstractActivityC1717k> extends ConstraintLayout {
    private static final String aj = "LargeIconHeader";
    private static final int bs = 1;
    private static final int k0 = 100;
    private final int ac;
    private final int ad;
    private final int am;
    private RecyclerView as;
    private SparseArray<ImageView> ax;
    private final int ay;
    private HandlerC2925q az;
    private SparseArray<ShadowLayout> ba;
    private final int be;
    private C2927q<T> bg;
    private T bl;
    private final int bq;

    /* JADX INFO: renamed from: com.android.thememanager.view.largeicon.LargeIconHeaderView$k */
    class C2923k extends n7h<Bitmap> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ImageView f17588g;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f17590s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C2938r f17591y;

        C2923k(final ImageView val$imagePreview, final C2938r val$selectedElement, final int val$key) {
            this.f17588g = val$imagePreview;
            this.f17591y = val$selectedElement;
            this.f17590s = val$key;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void qrj(@InterfaceC7396q @lvui Bitmap resource, InterfaceC3185g<? super Bitmap> transition) {
            this.f17588g.setImageBitmap(resource);
            LargeIconHeaderView.this.a98o(this.f17591y, this.f17590s);
        }

        @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@InterfaceC7395n @dd Drawable errorDrawable) {
            super.mo6802h(errorDrawable);
            ImageView imageView = this.f17588g;
            LargeIconHeaderView largeIconHeaderView = LargeIconHeaderView.this;
            imageView.setImageDrawable(largeIconHeaderView.y9n(largeIconHeaderView.m10368b(this.f17590s)));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.largeicon.LargeIconHeaderView$n */
    private static class C2924n {

        /* JADX INFO: renamed from: k */
        private String f17592k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f61518toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f61519zy;

        C2924n(String id, String path, String tag) {
            this.f17592k = id;
            this.f61518toq = path;
            this.f61519zy = tag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public boolean m10374g(C2924n otherOne) {
            return otherOne != null && TextUtils.equals(otherOne.f61519zy, this.f61519zy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public boolean m10376n(C2924n otherOne) {
            return otherOne != null && TextUtils.equals(otherOne.f17592k, this.f17592k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public boolean m10377q() {
            String str = this.f61518toq;
            return str != null && (str.startsWith("http") || this.f61518toq.startsWith("https"));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.largeicon.LargeIconHeaderView$q */
    private static class HandlerC2925q extends Handler {

        /* JADX INFO: renamed from: k */
        private WeakReference<LargeIconHeaderView> f17593k;

        /* synthetic */ HandlerC2925q(LargeIconHeaderView largeIconHeaderView, C2923k c2923k) {
            this(largeIconHeaderView);
        }

        @Override // android.os.Handler
        public void handleMessage(@lvui Message msg) {
            super.handleMessage(msg);
            if (1 != msg.what || this.f17593k.get() == null) {
                return;
            }
            this.f17593k.get().ch((C2938r) msg.obj);
        }

        private HandlerC2925q(LargeIconHeaderView view) {
            this.f17593k = new WeakReference<>(view);
        }
    }

    class toq extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f17594k;

        toq(final View val$card) {
            this.f17594k = val$card;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            super.onComplete(toTag);
            this.f17594k.setVisibility(0);
        }
    }

    class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f17595k;

        zy(final View val$card) {
            this.f17595k = val$card;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            super.onComplete(toTag);
            this.f17595k.setVisibility(8);
        }
    }

    public LargeIconHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m10367a(int key) {
        ShadowLayout shadowLayout = this.ba.get(key);
        SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) shadowLayout.getChildAt(0);
        ImageView imageView = this.ax.get(key);
        if (smoothFrameLayout2.getStrokeWidth() != 0 && smoothFrameLayout2.getCornerRadius() != 0.0f) {
            smoothFrameLayout2.setStrokeWidth(0);
            smoothFrameLayout2.setCornerRadius(0.0f);
        }
        if (imageView.getBackground() != null) {
            imageView.setBackground(null);
        }
        if (shadowLayout.m6360s()) {
            shadowLayout.m6359n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a98o(C2938r selectedElement, int key) {
        LargeIconElement largeIconElement = selectedElement.f61539zy;
        if (largeIconElement == null || largeIconElement.enableIconMask || largeIconElement.isOfficialIcons) {
            m10372x(key);
        } else {
            m10367a(key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public int m10368b(int key) {
        return key != 1 ? key != 4 ? getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_preview_radius_1_2) : getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_preview_radius_2_2) : getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_preview_radius_1_1);
    }

    private String bf2(LargeIconElement element, int type) {
        if (type == 1) {
            return element.preview_1_1;
        }
        if (type == 2) {
            return element.preview_2_1;
        }
        if (type == 3) {
            return element.preview_1_2;
        }
        if (type != 4) {
            return null;
        }
        return element.preview_2_2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ch(C2938r selectedElement) {
        Drawable drawableM9263q;
        if (selectedElement.f61539zy == null || selectedElement.f17676k <= 0 || getContext() == null || !gc3c.cdj((Activity) getContext())) {
            return;
        }
        String str = selectedElement.f61539zy.packageName + selectedElement.f61539zy.name + selectedElement.f61539zy.author + selectedElement.f61539zy.id + selectedElement.f61539zy.signature;
        for (int i2 = 0; i2 < this.ba.size(); i2++) {
            int iKeyAt = this.ba.keyAt(i2);
            String strBf2 = bf2(selectedElement.f61539zy, iKeyAt);
            C2924n c2924n = new C2924n(selectedElement.f61539zy.id, strBf2, strBf2 + str);
            ImageView imageView = this.ax.get(iKeyAt);
            ShadowLayout shadowLayout = this.ba.get(iKeyAt);
            C2924n c2924n2 = imageView.getTag() instanceof C2924n ? (C2924n) imageView.getTag() : null;
            boolean zM10374g = c2924n.m10374g(c2924n2);
            int i3 = selectedElement.f17676k;
            if (iKeyAt == i3) {
                boolean z2 = i3 == 1 && TextUtils.equals(selectedElement.f61539zy.id, LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID);
                if (z2) {
                    imageView.setScaleX(1.08f);
                    imageView.setScaleY(1.08f);
                } else {
                    imageView.setScaleX(1.0f);
                    imageView.setScaleY(1.0f);
                }
                m10372x(iKeyAt);
                if (TextUtils.isEmpty(strBf2)) {
                    imageView.setBackgroundColor(getContext().getResources().getColor(R.color.large_icon_header_selector_bg_color));
                } else {
                    boolean z3 = TextUtils.equals(selectedElement.f61539zy.id, LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID) && selectedElement.f17676k == 1;
                    imageView.setTag(c2924n);
                    if (!zM10374g) {
                        if (!(c2924n2 != null && c2924n2.m10376n(c2924n) && !c2924n2.m10377q() && c2924n.m10377q())) {
                            imageView.setImageBitmap(null);
                            imageView.setImageDrawable(null);
                        }
                        C2763c.m9647i(getContext(), imageView);
                    }
                    if (z2 && (drawableM9263q = C2662g.m9263q(selectedElement.f61539zy.packageName)) != null) {
                        imageView.setImageDrawable(drawableM9263q);
                        a98o(selectedElement, iKeyAt);
                    }
                    if (!z2 || imageView.getDrawable() == null) {
                        com.bumptech.glide.n7h n7hVarMo6748i = com.bumptech.glide.zy.a9(getContext()).zurt().fti(y9n(m10368b(iKeyAt))).was(new C3197n(str)).mo6748i(strBf2);
                        if (z3) {
                            n7hVarMo6748i = (com.bumptech.glide.n7h) n7hVarMo6748i.mo6769z(AbstractC3039p.f62798toq).zsr0(true);
                        }
                        n7hVarMo6748i.mo6763d(imageView.getWidth(), imageView.getHeight()).yl(new C2923k(imageView, selectedElement, iKeyAt));
                    }
                }
                if (shadowLayout.getVisibility() != 0) {
                    shadowLayout.setVisibility(8);
                    C6077k.t8r(shadowLayout, new toq(shadowLayout));
                }
            } else {
                if (!zM10374g && !TextUtils.isEmpty(strBf2)) {
                    imageView.setTag(c2924n);
                    com.bumptech.glide.zy.a9(getContext()).zurt().was(new C3197n(str)).mo6748i(strBf2).mo6763d(imageView.getWidth(), imageView.getHeight()).mo6769z(AbstractC3039p.f18438q).ga();
                }
                if (shadowLayout.getVisibility() != 8) {
                    C6077k.ki(shadowLayout, new zy(shadowLayout));
                }
            }
        }
    }

    private List<Integer> getSelectInfoList() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        return arrayList;
    }

    private void i1(Context context) {
        LayoutInflater.from(getContext()).inflate(R.layout.large_icon_header_view, (ViewGroup) this, true);
        ShadowLayout shadowLayout = (ShadowLayout) findViewById(R.id.card_preview_1_1);
        ImageView imageView = (ImageView) shadowLayout.findViewById(R.id.preview_image_1_1);
        ShadowLayout shadowLayout2 = (ShadowLayout) findViewById(R.id.card_preview_2_1);
        ImageView imageView2 = (ImageView) shadowLayout2.findViewById(R.id.preview_image_2_1);
        ShadowLayout shadowLayout3 = (ShadowLayout) findViewById(R.id.card_preview_1_2);
        ImageView imageView3 = (ImageView) shadowLayout3.findViewById(R.id.preview_image_1_2);
        ShadowLayout shadowLayout4 = (ShadowLayout) findViewById(R.id.card_preview_2_2);
        ImageView imageView4 = (ImageView) shadowLayout4.findViewById(R.id.preview_image_2_2);
        this.ba.put(1, shadowLayout);
        this.ba.put(2, shadowLayout2);
        this.ba.put(3, shadowLayout3);
        this.ba.put(4, shadowLayout4);
        this.ax.put(1, imageView);
        this.ax.put(2, imageView2);
        this.ax.put(3, imageView3);
        this.ax.put(4, imageView4);
        this.az = new HandlerC2925q(this, null);
    }

    /* JADX INFO: renamed from: x */
    private void m10372x(int key) {
        ShadowLayout shadowLayout = this.ba.get(key);
        SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) shadowLayout.getChildAt(0);
        ImageView imageView = this.ax.get(key);
        if (smoothFrameLayout2.getStrokeWidth() == 0 && smoothFrameLayout2.getCornerRadius() == 0.0f) {
            smoothFrameLayout2.setStrokeWidth(getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_preview_border));
            smoothFrameLayout2.setCornerRadius(m10368b(key));
        }
        if (imageView.getBackground() == null) {
            imageView.setBackground(y9n(m10368b(key)));
        }
        if (shadowLayout.m6360s()) {
            return;
        }
        shadowLayout.ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable y9n(int radiusResourceId) {
        return C1819o.m7166t(getResources().getColor(R.color.large_icon_header_selector_bg_color), radiusResourceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(C2938r selectedElement) {
        this.az.removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = selectedElement;
        this.az.sendMessageDelayed(messageObtain, 100L);
    }

    public void yz(T vm, C context, RecyclerView rv) {
        if (vm == null) {
            throw new NullPointerException("viewModel not init.");
        }
        if (rv == null) {
            return;
        }
        this.as = rv;
        this.bl = vm;
        C2927q<T> c2927q = new C2927q<>(this.bl, this.bq, this.ac, this.ad, this.ay, this.be);
        this.bg = c2927q;
        c2927q.m10378z(getSelectInfoList());
        this.as.setAdapter(this.bg);
        this.as.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.as.addItemDecoration(new C2364q(this.bq, this.ac, this.ad, this.am, getResources().getConfiguration().getLayoutDirection() == 1));
        this.bl = vm;
        vm.mo8330g(context, new jp0y() { // from class: com.android.thememanager.view.largeicon.k
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f17596k.zp((C2938r) obj);
            }
        });
    }

    public LargeIconHeaderView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LargeIconHeaderView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public LargeIconHeaderView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.ba = new SparseArray<>(4);
        this.ax = new SparseArray<>(4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.x76, defStyleAttr, 0);
        this.bq = typedArrayObtainStyledAttributes.getInteger(3, 4);
        this.ac = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.ad = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.am = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.ay = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.be = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        typedArrayObtainStyledAttributes.recycle();
        i1(null);
    }
}
