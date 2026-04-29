package com.android.thememanager.v9.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.AbstractC1288k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.v9.data.C2853p;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: compiled from: WallpaperPagerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC1288k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private toq f61462f7l8;

    /* JADX INFO: renamed from: g */
    private LayoutInflater f17052g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Bitmap f61463ld6;

    /* JADX INFO: renamed from: n */
    private Activity f17053n;

    /* JADX INFO: renamed from: p */
    private int f17054p;

    /* JADX INFO: renamed from: s */
    private int f17055s;

    /* JADX INFO: renamed from: y */
    private C2853p f17056y;

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.zy$k */
    /* JADX INFO: compiled from: WallpaperPagerAdapter.java */
    class C2848k implements x2.InterfaceC1740s<Bitmap> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f17057k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ UIProduct f17059q;

        C2848k(final int val$position, final UIProduct val$product) {
            this.f17057k = val$position;
            this.f17059q = val$product;
        }

        @Override // com.android.thememanager.basemodule.imageloader.x2.InterfaceC1740s
        public void toq() {
            if (zy.this.f61462f7l8 != null) {
                zy.this.f61462f7l8.mo10139k(this.f17057k, this.f17059q);
            }
        }

        @Override // com.android.thememanager.basemodule.imageloader.x2.InterfaceC1740s
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo6382k(@lvui Bitmap bitmap) {
            if (zy.this.f61462f7l8 != null) {
                zy.this.f61462f7l8.toq(this.f17057k, this.f17059q);
            }
        }
    }

    /* JADX INFO: compiled from: WallpaperPagerAdapter.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo10139k(int position, UIProduct data);

        void toq(int position, UIProduct data);
    }

    public zy(Activity activity, C2853p loader, int imageWidth, int imageHeight) {
        this.f17053n = activity;
        this.f17052g = LayoutInflater.from(activity);
        this.f17055s = imageWidth;
        this.f17054p = imageHeight;
        this.f17056y = loader;
    }

    public void fu4(Bitmap bitmap) {
        this.f61463ld6 = bitmap;
        x2();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: g */
    public int mo5572g(@lvui Object object) {
        return -1;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(View view, Object object) {
        return view == object;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f17056y.qrj();
    }

    public C2853p ni7() {
        return this.f17056y;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: p */
    public Object mo4276p(ViewGroup container, final int position) {
        UIProduct uIProductKja0 = this.f17056y.kja0(position);
        if (uIProductKja0 == null) {
            return null;
        }
        String str = uIProductKja0.originalImageUrl;
        ViewGroup viewGroup = (ViewGroup) this.f17052g.inflate(R.layout.wallpaper_subject_viewpager_item, (ViewGroup) null);
        viewGroup.setTag(Integer.valueOf(position));
        container.addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.pager_wallpaper);
        if (Build.VERSION.SDK_INT < 31) {
            C6077k.o1t(imageView);
        }
        x2.m6782y(this.f17053n, str, imageView, x2.fn3e().gvn7(R.drawable.wallpaper_grey_bg).a9(false).x9kr(this.f17055s, this.f17054p).oc(C1807g.jk()).d2ok(new C2848k(position, uIProductKja0)));
        C1812k.toq(imageView, imageView.getContext().getString(R.string.de_preview));
        return viewGroup;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /* JADX INFO: renamed from: z */
    public void m10144z(toq listener) {
        this.f61462f7l8 = listener;
    }
}
