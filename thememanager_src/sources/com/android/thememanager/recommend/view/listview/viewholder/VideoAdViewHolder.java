package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.dd;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import com.android.thememanager.basemodule.views.InterfaceC1865s;
import com.android.thememanager.recommend.model.entity.element.StaggeredVideoAdElement;
import com.android.thememanager.recommend.player.AdAutoPlayer;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.ui.PlayerView;
import com.xiaomi.ad.feedback.IAdFeedbackListener;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class VideoAdViewHolder extends BaseAdViewHolder<StaggeredVideoAdElement> implements InterfaceC1865s, InterfaceC1852k {

    /* JADX INFO: renamed from: c */
    private C2429q f14277c;

    /* JADX INFO: renamed from: e */
    private boolean f14278e;

    /* JADX INFO: renamed from: f */
    private LinearLayout f14279f;

    /* JADX INFO: renamed from: h */
    private ImageView f14280h;

    /* JADX INFO: renamed from: i */
    private PlayerView f14281i;

    /* JADX INFO: renamed from: j */
    private boolean f14282j;

    /* JADX INFO: renamed from: l */
    private TextView f14283l;

    /* JADX INFO: renamed from: p */
    private ImageView f14284p;

    /* JADX INFO: renamed from: r */
    private TextView f14285r;

    /* JADX INFO: renamed from: s */
    protected x2.C1735g f14286s;

    /* JADX INFO: renamed from: t */
    private View f14287t;

    /* JADX INFO: renamed from: z */
    private AdAutoPlayer f14288z;

    private static class AdFeedbackListener extends IAdFeedbackListener.Stub {
        private WeakReference<Activity> mActivity;
        private WeakReference<VideoAdViewHolder> mVideoAdViewHolder;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.VideoAdViewHolder$AdFeedbackListener$k */
        class RunnableC2427k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f14289k;

            RunnableC2427k(final int val$i) {
                this.f14289k = val$i;
            }

            @Override // java.lang.Runnable
            public void run() {
                VideoAdViewHolder videoAdViewHolder;
                Activity activity = (Activity) AdFeedbackListener.this.mActivity.get();
                if (activity == null || this.f14289k < 0 || (videoAdViewHolder = (VideoAdViewHolder) AdFeedbackListener.this.mVideoAdViewHolder.get()) == null) {
                    return;
                }
                videoAdViewHolder.f13787y.setVisibility(4);
                videoAdViewHolder.f14286s.gvn7(R.drawable.ad_closed_bg);
                videoAdViewHolder.f14284p.setVisibility(0);
                com.android.thememanager.basemodule.imageloader.x2.m6782y(activity, "", videoAdViewHolder.f14284p, videoAdViewHolder.f14286s);
                videoAdViewHolder.f14281i.setVisibility(8);
                videoAdViewHolder.f14280h.setVisibility(8);
                videoAdViewHolder.f14279f.setVisibility(8);
                if (videoAdViewHolder.f14287t != null) {
                    C1812k.m7106k(videoAdViewHolder.f14287t, R.string.ad_close);
                }
                if (videoAdViewHolder.f14288z != null) {
                    videoAdViewHolder.f14288z.m8518s(videoAdViewHolder.f13786g.videoUrl);
                    videoAdViewHolder.f14288z = null;
                }
                AdDislikeManager.m6595g().m6599y(videoAdViewHolder.f13786g.tagId);
            }
        }

        public AdFeedbackListener(Activity activity, VideoAdViewHolder videoAdViewHolder) {
            this.mActivity = new WeakReference<>(activity);
            this.mVideoAdViewHolder = new WeakReference<>(videoAdViewHolder);
        }

        @Override // com.xiaomi.ad.feedback.IAdFeedbackListener
        public void onFinished(int i2) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2427k(i2));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.VideoAdViewHolder$k */
    class ViewOnClickListenerC2428k implements View.OnClickListener {
        ViewOnClickListenerC2428k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            VideoAdViewHolder.this.m8763j();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.VideoAdViewHolder$q */
    private static class C2429q implements gc3c.InterfaceC3440y {

        /* JADX INFO: renamed from: k */
        private final WeakReference<ImageView> f14292k;

        /* JADX INFO: renamed from: q */
        private final WeakReference<ImageView> f14293q;

        public C2429q(ImageView imageView, ImageView pauseImageView) {
            this.f14292k = new WeakReference<>(imageView);
            this.f14293q = new WeakReference<>(pauseImageView);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: r */
        public void mo6501r() {
            ImageView imageView = this.f14292k.get();
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f14293q.get();
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            VideoAdViewHolder.this.hb();
        }
    }

    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1653q.f7l8(VideoAdViewHolder.this.ki(), VideoAdViewHolder.this.f13786g, null);
        }
    }

    public VideoAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        ek5k();
    }

    private void ek5k() {
        this.f14284p = (ImageView) this.itemView.findViewById(R.id.image);
        this.f14281i = (PlayerView) this.itemView.findViewById(R.id.video_view);
        this.f14280h = (ImageView) this.itemView.findViewById(R.id.ad_pause);
        this.f14287t = this.itemView.findViewById(R.id.touch);
        this.f14285r = (TextView) this.itemView.findViewById(R.id.ad_title);
        this.f14283l = (TextView) this.itemView.findViewById(R.id.add_download);
        this.f14279f = (LinearLayout) this.itemView.findViewById(R.id.ad_message_container);
        this.f14277c = new C2429q(this.f14284p, this.f14280h);
        C6077k.o1t(this.f14283l);
        m6706z().bf2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hb() {
        if (this.f13786g == null || AdDislikeManager.m6595g().f7l8(this.f13786g.tagId)) {
            return;
        }
        C1708s.f7l8().x2(4001).jk(this.f13786g, null);
        ki().startActivityForResult(com.android.thememanager.toq.f7l8(ki(), this.f13786g), 108);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m8763j() {
        AdDislikeManager.m6595g().m6598q(new AdFeedbackListener(ki(), this), this.f13786g.ex);
    }

    public static VideoAdViewHolder yz(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new VideoAdViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_video_ad_stagger_layout, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: bf2, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredVideoAdElement item, final int position) {
        String str;
        super.o1t(item, position);
        this.f14286s = com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.kja0(position)).m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)).jk(3);
        this.f13786g = item.getImageBanner().getAdInfo();
        if (AdDislikeManager.m6595g().f7l8(this.f13786g.tagId)) {
            this.f14284p.setVisibility(0);
            this.f13787y.setVisibility(8);
            this.f14281i.setVisibility(8);
            this.f14280h.setVisibility(8);
            str = "";
        } else {
            ArrayList<String> arrayList = this.f13786g.imgUrls;
            if (arrayList == null) {
                Log.e("videoAd", "error! empty imgUrls!");
                return;
            }
            str = arrayList.get(0);
            AdInfo adInfo = this.f13786g;
            if (adInfo.width > 0.0f && adInfo.height > 0.0f) {
                int iX9kr = wvg().x9kr();
                AdInfo adInfo2 = this.f13786g;
                float f2 = iX9kr;
                float f3 = (int) ((adInfo2.height / adInfo2.width) * f2);
                adInfo2.height = f3;
                adInfo2.width = f2;
                this.f14286s.x9kr((int) f2, (int) f3);
                this.f14284p.getLayoutParams().height = (int) this.f13786g.height;
            }
            this.f14284p.setVisibility(0);
            this.f14280h.setVisibility(0);
            this.itemView.findViewById(R.id.ad_close_btn).setOnClickListener(new ViewOnClickListenerC2428k());
            this.itemView.findViewById(R.id.touch).setOnClickListener(new toq());
            this.itemView.findViewById(R.id.add_download).setOnClickListener(new zy());
            C6077k.m22369i(this.itemView.findViewById(R.id.ad_download_container));
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), str, this.f14284p, this.f14286s);
        this.f14285r.setText(C1653q.n7h(this.f13786g));
        if (!C1653q.kja0(this.f13786g)) {
            this.f14283l.setVisibility(8);
        } else if (com.android.thememanager.basemodule.utils.a9.m6999s(this.f13786g.packageName)) {
            this.f14283l.setText(R.string.ad_experience_now);
            this.f14283l.setVisibility(0);
        } else {
            this.f14283l.setText(R.string.ad_download_now);
            this.f14283l.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public View cdj() {
        return this.itemView;
    }

    /* JADX INFO: renamed from: m */
    public void m8765m() {
        this.f14278e = false;
        AdAutoPlayer adAutoPlayer = this.f14288z;
        if (adAutoPlayer != null) {
            adAutoPlayer.m8518s(this.f13786g.videoUrl);
            this.f14288z.m8519y(this.f14277c);
            this.f14288z = null;
            this.f14284p.setVisibility(0);
            this.f14280h.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        this.f14282j = true;
        C1653q.toq(this);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        m8765m();
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    /* JADX INFO: renamed from: p */
    public boolean mo7369p() {
        return this.f14282j;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1852k
    /* JADX INFO: renamed from: q */
    public void mo6499q(String packageName, int state) {
        if (TextUtils.equals(packageName, this.f13786g.packageName)) {
            if (state != -8 && state != -2) {
                if (state == 4) {
                    this.f14283l.setText(R.string.ad_experience_now);
                    return;
                } else if (state != 5) {
                    return;
                }
            }
            this.f14283l.setText(R.string.ad_download_now);
        }
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public void qrj(int state) {
        if (state == 4) {
            if (dd.m7030n(this.itemView, 50)) {
                y9n();
            }
        } else if (state == 2) {
            m8765m();
        }
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public int x2() {
        return 6;
    }

    public void y9n() {
        this.f14278e = true;
        if (!AdDislikeManager.m6595g().f7l8(this.f13786g.tagId) && com.android.thememanager.basemodule.utils.mcp.f7l8() && com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.VIDEO_AD_AUTO_PLAY) && this.f14288z == null) {
            if (!(this.itemView.getContext() instanceof AdAutoPlayer.InterfaceC2345k)) {
                C7794k.f7l8("not implement IAutoPlay. " + this.itemView.getContext());
                return;
            }
            this.f14288z = ((AdAutoPlayer.InterfaceC2345k) this.itemView.getContext()).mo6321i();
            if (this.f13786g.height > 0.0f) {
                this.f14281i.getLayoutParams().height = (int) this.f13786g.height;
            }
            this.f14288z.m8516q(this.f13786g.videoUrl, true, this.f14277c, this.f14281i);
            C1812k.toq(this.f14287t, C1653q.x2(this.f13786g));
            this.itemView.setTag(this.f13786g.videoUrl);
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        this.f14282j = false;
        C1653q.ki(this);
    }
}
