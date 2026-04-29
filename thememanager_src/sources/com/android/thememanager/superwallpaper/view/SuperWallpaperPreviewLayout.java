package com.android.thememanager.superwallpaper.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.presenter.C2728k;
import com.miui.clock.MiuiClockView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import cv06.InterfaceC5977k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vep5.C7705k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class SuperWallpaperPreviewLayout extends FrameLayout implements InterfaceC5977k.k, AbstractC2723p.k {

    /* JADX INFO: renamed from: c */
    public static final long f16173c = 200;

    /* JADX INFO: renamed from: e */
    public static final int f16174e = 0;

    /* JADX INFO: renamed from: f */
    public static final long f16175f = 250;

    /* JADX INFO: renamed from: j */
    public static final int f16176j = 255;

    /* JADX INFO: renamed from: l */
    public static final long f16177l = 300;

    /* JADX INFO: renamed from: m */
    public static final float f16178m = 1.0f;

    /* JADX INFO: renamed from: o */
    public static final float f16179o = 0.0f;

    /* JADX INFO: renamed from: g */
    private Animator f16180g;

    /* JADX INFO: renamed from: h */
    private MiuiClockView f16181h;

    /* JADX INFO: renamed from: i */
    private ImageView f16182i;

    /* JADX INFO: renamed from: k */
    private AbstractC2723p f16183k;

    /* JADX INFO: renamed from: n */
    private InterfaceC5977k.toq f16184n;

    /* JADX INFO: renamed from: p */
    private ImageView f16185p;

    /* JADX INFO: renamed from: q */
    private InterfaceC5977k.toq f16186q;

    /* JADX INFO: renamed from: r */
    private int f16187r;

    /* JADX INFO: renamed from: s */
    private BitmapDrawable f16188s;

    /* JADX INFO: renamed from: t */
    private boolean f16189t;

    /* JADX INFO: renamed from: y */
    private SparseArray<BitmapDrawable> f16190y;

    /* JADX INFO: renamed from: z */
    private int f16191z;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.view.SuperWallpaperPreviewLayout$k */
    class C2737k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ImageView f16192k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ BitmapDrawable f16194q;

        C2737k(final ImageView val$imageView, final BitmapDrawable val$bitmapDrawable) {
            this.f16192k = val$imageView;
            this.f16194q = val$bitmapDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            this.f16192k.setImageDrawable(this.f16194q);
        }
    }

    private static class toq extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: k */
        private WeakReference<SuperWallpaperPreviewLayout> f16195k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C7705k f61164toq;

        public toq(SuperWallpaperPreviewLayout preView, C7705k data) {
            this.f16195k = new WeakReference<>(preView);
            this.f61164toq = data;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voids) {
            return C2663k.m9267n(bf2.toq.toq(), this.f61164toq.m28101k(), this.f61164toq.toq(), this.f61164toq.zy(), this.f61164toq.m28103q());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            SuperWallpaperPreviewLayout superWallpaperPreviewLayout = this.f16195k.get();
            if (superWallpaperPreviewLayout != null) {
                superWallpaperPreviewLayout.f16188s = new BitmapDrawable(superWallpaperPreviewLayout.getResources(), bitmap);
                superWallpaperPreviewLayout.n7h();
            }
        }
    }

    private static class zy extends AsyncTask<Void, Void, SparseArray<BitmapDrawable>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<SuperWallpaperPreviewLayout> f16196k;

        /* JADX INFO: renamed from: n */
        private Resources f16197n;

        /* JADX INFO: renamed from: q */
        private SparseArray<Bitmap> f16198q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ArrayList<vep5.toq> f61165toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private SparseArray<BitmapDrawable> f61166zy;

        public zy(SuperWallpaperPreviewLayout preView, ArrayList<vep5.toq> list) {
            this.f16196k = new WeakReference<>(preView);
            this.f61165toq = list;
            this.f16197n = preView.getResources();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SparseArray<BitmapDrawable> doInBackground(Void... voids) {
            this.f61166zy = new SparseArray<>(this.f61165toq.size());
            this.f16198q = new SparseArray<>(2);
            for (vep5.toq toqVar : this.f61165toq) {
                Bitmap bitmapM7006n = this.f16198q.get(toqVar.m28108k());
                if (bitmapM7006n == null) {
                    bitmapM7006n = bf2.m7006n(toqVar.m28108k(), false, true);
                    this.f16198q.put(toqVar.m28108k(), bitmapM7006n);
                }
                this.f61166zy.put(toqVar.m28105g(), new BitmapDrawable(this.f16197n, bitmapM7006n));
            }
            return this.f61166zy;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SparseArray<BitmapDrawable> bitmap) {
            super.onPostExecute(bitmap);
            SuperWallpaperPreviewLayout superWallpaperPreviewLayout = this.f16196k.get();
            if (superWallpaperPreviewLayout != null) {
                superWallpaperPreviewLayout.f16190y = this.f61166zy;
                superWallpaperPreviewLayout.kja0();
            }
        }
    }

    public SuperWallpaperPreviewLayout(Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f16189t = true;
    }

    /* JADX INFO: renamed from: h */
    private void m9527h() {
        this.f16181h = (MiuiClockView) findViewById(R.id.super_wallpaper_lock_screen_preview_clock);
        if (o1t.m7171i()) {
            this.f16181h.m17554p();
            this.f16181h.setClockBean(ClockBean.getClassicDefaultBean(bf2.toq.toq()));
        } else {
            this.f16181h.x2(new ClockBean(AbstractC5074q.f29194r));
        }
        this.f16181h.setAlpha(0.0f);
        this.f16181h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0() {
        Animator animatorX2;
        SparseArray<BitmapDrawable> sparseArray = this.f16190y;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                BitmapDrawable bitmapDrawable = this.f16190y.get(i2);
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha(0);
                }
            }
        }
        if (this.f16189t) {
            InterfaceC5977k.toq toqVar = InterfaceC5977k.toq.DESKTOP;
            if (!toqVar.equals(this.f16186q) || (animatorX2 = x2(null, toqVar)) == null) {
                return;
            }
            animatorX2.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h() {
        if (this.f16189t) {
            InterfaceC5977k.toq toqVar = InterfaceC5977k.toq.AOD;
            if (toqVar.equals(this.f16186q)) {
                Animator animatorX2 = x2(null, toqVar);
                if (animatorX2 != null) {
                    animatorX2.start();
                    return;
                }
                return;
            }
        }
        BitmapDrawable bitmapDrawable = this.f16188s;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha(0);
        }
    }

    /* JADX INFO: renamed from: p */
    private ObjectAnimator m9529p(ImageView imageView, BitmapDrawable bitmapDrawable, boolean show) {
        ObjectAnimator objectAnimatorOfInt = show ? ObjectAnimator.ofInt(bitmapDrawable, "alpha", 0, 255) : ObjectAnimator.ofInt(bitmapDrawable, "alpha", 255, 0);
        objectAnimatorOfInt.addUpdateListener(new C2737k(imageView, bitmapDrawable));
        return objectAnimatorOfInt;
    }

    private ObjectAnimator qrj(View view, boolean show) {
        return show ? ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: s */
    private ObjectAnimator m9530s(InterfaceC5977k.toq sceneType, boolean isShow) {
        SparseArray<BitmapDrawable> sparseArray;
        BitmapDrawable bitmapDrawable;
        if (InterfaceC5977k.toq.AOD == sceneType && o1t.f7l8()) {
            BitmapDrawable bitmapDrawable2 = this.f16188s;
            if (bitmapDrawable2 != null) {
                return m9529p(this.f16185p, bitmapDrawable2, isShow);
            }
        } else {
            if (InterfaceC5977k.toq.LOCKSCREEN == sceneType) {
                return qrj(this.f16181h, isShow);
            }
            if (InterfaceC5977k.toq.DESKTOP == sceneType && (sparseArray = this.f16190y) != null && (bitmapDrawable = sparseArray.get(this.f16191z)) != null) {
                return m9529p(this.f16182i, bitmapDrawable, isShow);
            }
        }
        return null;
    }

    private Animator x2(InterfaceC5977k.toq fromScene, InterfaceC5977k.toq toScene) {
        ObjectAnimator objectAnimatorM9530s = fromScene != null ? m9530s(fromScene, false) : null;
        ObjectAnimator objectAnimatorM9530s2 = toScene != null ? m9530s(toScene, true) : null;
        if (objectAnimatorM9530s != null && objectAnimatorM9530s2 != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playSequentially(objectAnimatorM9530s, objectAnimatorM9530s2);
            this.f16180g = animatorSet;
        } else if (objectAnimatorM9530s != null) {
            objectAnimatorM9530s.setDuration(200L);
            this.f16180g = objectAnimatorM9530s;
        } else if (objectAnimatorM9530s2 != null) {
            objectAnimatorM9530s2.setDuration(250L);
            this.f16180g = objectAnimatorM9530s2;
        } else {
            this.f16180g = null;
        }
        return this.f16180g;
    }

    @Override // cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: k */
    public void mo9489k(InterfaceC5977k.toq sceneType) {
        InterfaceC5977k.toq toqVar = this.f16186q;
        if (toqVar == sceneType) {
            return;
        }
        this.f16184n = toqVar;
        this.f16186q = sceneType;
        if (this.f16189t) {
            Animator animator = this.f16180g;
            if (animator != null) {
                animator.end();
            }
            Animator animatorX2 = x2(this.f16184n, this.f16186q);
            this.f16180g = animatorX2;
            if (animatorX2 != null) {
                animatorX2.start();
            }
        }
    }

    public Animator ld6(boolean canShow) {
        this.f16189t = canShow;
        Animator animator = this.f16180g;
        if (animator != null) {
            animator.end();
            this.f16180g = null;
        }
        if (!canShow) {
            return x2(this.f16186q, null);
        }
        InterfaceC5977k.toq toqVar = InterfaceC5977k.toq.DESKTOP;
        if (toqVar.equals(this.f16186q)) {
            return x2(null, toqVar);
        }
        return null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16185p = (ImageView) findViewById(R.id.super_wallpaper_setting_aod_preview);
        this.f16182i = (ImageView) findViewById(R.id.super_wallpaper_setting_desktop_preview);
    }

    public void setPresenter(AbstractC2723p presenter) {
        List<RelatedResource> subResources;
        this.f16183k = presenter;
        int iMo9495s = presenter.mo9495s();
        this.f16187r = iMo9495s;
        boolean z2 = true;
        if (iMo9495s == 1) {
            m9527h();
            return;
        }
        Resource resourceM9499z = ((C2728k) presenter).m9499z();
        if (resourceM9499z == null || (subResources = resourceM9499z.getSubResources()) == null) {
            return;
        }
        Iterator<RelatedResource> it = subResources.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (it.next().getResourceCode().equals("splockscreen")) {
                break;
            }
        }
        if (z2) {
            return;
        }
        m9527h();
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p.k
    public void vyq(int position) {
        AbstractC2723p abstractC2723p = this.f16183k;
        if (abstractC2723p == null) {
            return;
        }
        this.f16191z = position;
        SparseArray<BitmapDrawable> sparseArray = this.f16190y;
        if (sparseArray != null) {
            this.f16182i.setImageDrawable(sparseArray.get(position));
        } else {
            ArrayList<vep5.toq> arrayListF7l8 = abstractC2723p.f7l8();
            if (arrayListF7l8 == null || arrayListF7l8.size() == 0) {
                arrayListF7l8 = new ArrayList<>();
                vep5.toq toqVar = new vep5.toq(1);
                toqVar.ki(0);
                toqVar.qrj(0);
                arrayListF7l8.add(toqVar);
            }
            new zy(this, arrayListF7l8).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        if (this.f16187r == 1) {
            BitmapDrawable bitmapDrawable = this.f16188s;
            if (bitmapDrawable != null) {
                this.f16185p.setImageDrawable(bitmapDrawable);
                return;
            }
            if (o1t.f7l8()) {
                SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f16183k.m9492n());
                if (superWallpaperSummaryDataM9221s != null && C2656k.f60915gvn7.equals(superWallpaperSummaryDataM9221s.f15591b)) {
                    this.f16188s = null;
                    this.f16185p.setVisibility(8);
                } else {
                    C7705k c7705kM9494q = this.f16183k.m9494q();
                    if (c7705kM9494q != null) {
                        new toq(this, c7705kM9494q).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                }
            }
        }
    }
}
