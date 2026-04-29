package com.android.thememanager.v9.adapter;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.activity.ktq;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.ld6;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.uj2j;
import gyi.C6068k;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: compiled from: VideoAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends RecyclerView.AbstractC1060y<RecyclerView.fti> implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: i */
    private static final String f17031i = "VideoAdapter";

    /* JADX INFO: renamed from: t */
    private static final int f17032t = 1;

    /* JADX INFO: renamed from: z */
    private static final int f17033z = 0;

    /* JADX INFO: renamed from: g */
    private boolean f17034g;

    /* JADX INFO: renamed from: h */
    private InterfaceC7941toq f17035h;

    /* JADX INFO: renamed from: k */
    private uj2j f17036k;

    /* JADX INFO: renamed from: n */
    private zy f17037n;

    /* JADX INFO: renamed from: p */
    public final int f17038p;

    /* JADX INFO: renamed from: q */
    private ktq f17039q;

    /* JADX INFO: renamed from: y */
    private List<VideoInfo> f17041y = new ArrayList();

    /* JADX INFO: renamed from: s */
    private Set<View> f17040s = new HashSet();

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.toq$k */
    /* JADX INFO: compiled from: VideoAdapter.java */
    class ViewOnClickListenerC2845k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f17042k;

        /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.toq$k$k */
        /* JADX INFO: compiled from: VideoAdapter.java */
        class k implements DialogInterface.OnClickListener {
            k() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                ld6.toq();
                vyq.f7l8(InterfaceC1789q.ta3f);
                toq.this.notifyDataSetChanged();
                nn86.m7150k(R.string.incall_show_remove_success, 0);
                C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.mjed));
            }
        }

        ViewOnClickListenerC2845k(final boolean val$isNoIncallShow) {
            this.f17042k = val$isNoIncallShow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f17042k) {
                return;
            }
            new ki.C6947k(toq.this.f17039q.getActivity()).fu4(R.string.incall_show_remove_dialog_message).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new k()).hb();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.toq$n */
    /* JADX INFO: compiled from: VideoAdapter.java */
    private static class C2846n extends RecyclerView.fti {

        /* JADX INFO: renamed from: g */
        private TextView f17045g;

        /* JADX INFO: renamed from: k */
        private ImageView f17046k;

        /* JADX INFO: renamed from: n */
        private TextView f17047n;

        /* JADX INFO: renamed from: q */
        private ImageView f17048q;

        /* JADX INFO: renamed from: s */
        private LinearLayout f17049s;

        /* JADX INFO: renamed from: y */
        private TextView f17050y;

        /* synthetic */ C2846n(View view, ViewOnClickListenerC2845k viewOnClickListenerC2845k) {
            this(view);
        }

        private C2846n(View itemView) {
            super(itemView);
            this.f17046k = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.f17048q = (ImageView) itemView.findViewById(R.id.super_wallpaper_show_bg);
            this.f17047n = (TextView) itemView.findViewById(R.id.top_flag_lockscreen);
            this.f17045g = (TextView) itemView.findViewById(R.id.top_flag_desktop);
            this.f17050y = (TextView) itemView.findViewById(R.id.top_flag_incall);
            LinearLayout linearLayout = (LinearLayout) itemView.findViewById(R.id.wallpaper_bg_container);
            this.f17049s = linearLayout;
            if (linearLayout != null) {
                if (itemView.getContext().getResources().getConfiguration().locale.getLanguage().equalsIgnoreCase("zh")) {
                    this.f17049s.setOrientation(0);
                } else {
                    this.f17049s.setOrientation(1);
                }
            }
            C6077k.o1t(itemView);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.toq$q */
    /* JADX INFO: compiled from: VideoAdapter.java */
    private static class AsyncTaskC2847q extends AsyncTask<Void, Void, List<VideoInfo>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<toq> f17051k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f61460toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f61461zy;

        AsyncTaskC2847q(toq adapter, boolean isDynamicVideo, int usingType) {
            this.f61460toq = isDynamicVideo;
            this.f17051k = new WeakReference<>(adapter);
            this.f61461zy = usingType;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<VideoInfo> doInBackground(Void... voids) {
            if (isCancelled()) {
                return null;
            }
            return this.f61460toq ? VideoInfoUtils.fetchDynamicVideoInfo() : 2 == this.f61461zy ? VideoInfoUtils.fetchShowVideoInfo() : VideoInfoUtils.fetchVideoInfo(true, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<VideoInfo> videoBeans) {
            super.onPostExecute(videoBeans);
            toq toqVar = this.f17051k.get();
            if (toqVar == null || !gc3c.cdj(toqVar.f17039q.getActivity())) {
                return;
            }
            if (toqVar.f17038p == 2) {
                ArrayList arrayList = new ArrayList(videoBeans.size() + 1);
                VideoInfo videoInfo = new VideoInfo();
                videoInfo.onlineId = VideoInfoUtils.ID_IN_CALL_SHOW_REMOVE;
                videoInfo.path = "";
                arrayList.add(videoInfo);
                for (VideoInfo videoInfo2 : videoBeans) {
                    if (!VideoInfoUtils.isSystemFile(videoInfo2)) {
                        arrayList.add(videoInfo2);
                        if (VideoInfoUtils.isUsing(videoInfo2, 2) && !ld6.m8010n()) {
                            C6068k.m22356q(C6068k.f35060p, videoInfo2.path);
                        }
                    }
                }
                videoBeans = arrayList;
            }
            toqVar.d2ok(videoBeans);
            toqVar.f17037n.mo6430k(videoBeans.size() == 0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoAdapter.java */
    public interface InterfaceC7941toq {
        /* JADX INFO: renamed from: h */
        void mo6429h();

        void x2();
    }

    /* JADX INFO: compiled from: VideoAdapter.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo6430k(boolean isEmpty);
    }

    public toq(ktq fragment, @lvui zy onLoadListener, int usingType, boolean isDynamicVideo) {
        this.f17036k = new uj2j(fragment, this);
        this.f17037n = onLoadListener;
        this.f17034g = isDynamicVideo;
        this.f17039q = fragment;
        this.f17038p = usingType;
    }

    private void jk(C2846n holder) {
        holder.itemView.setOnClickListener(new ViewOnClickListenerC2845k(!ld6.m8010n()));
    }

    private boolean wvg(TextView textView, String localId, String resourceCode) {
        if (C2320q.o1t(bf2.toq.toq(), resourceCode).contains(localId)) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(8);
        return false;
    }

    /* JADX INFO: renamed from: z */
    private Resource m10140z(Resource resource, String code) {
        RelatedResource subResource = resource.getSubResource(code);
        if (subResource != null) {
            return C1792n.zy(subResource, C1791k.getInstance(code));
        }
        return null;
    }

    public void d2ok(List<VideoInfo> videoList) {
        this.f17040s.clear();
        this.f17041y.clear();
        this.f17041y.addAll(videoList);
        notifyDataSetChanged();
    }

    public void fn3e() {
        InterfaceC7941toq interfaceC7941toq = this.f17035h;
        if (interfaceC7941toq != null) {
            interfaceC7941toq.x2();
        }
    }

    public Set<View> fu4() {
        return this.f17040s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f17041y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return VideoInfoUtils.ID_IN_CALL_SHOW_REMOVE.equals(this.f17041y.get(position).onlineId) ? 1 : 0;
    }

    public void mcp() {
        new AsyncTaskC2847q(this, this.f17034g, this.f17038p).execute(new Void[0]);
    }

    public void ni7() {
        InterfaceC7941toq interfaceC7941toq = this.f17035h;
        if (interfaceC7941toq != null) {
            interfaceC7941toq.mo6429h();
        }
    }

    public List<VideoInfo> o1t() {
        return this.f17041y;
    }

    public void oc() {
        this.f17035h = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(RecyclerView.fti holder, int position) {
        boolean z2;
        boolean zWvg;
        C2846n c2846n = (C2846n) holder;
        VideoInfo videoInfo = this.f17041y.get(position);
        if (VideoInfoUtils.ID_IN_CALL_SHOW_REMOVE.equals(videoInfo.onlineId)) {
            jk(c2846n);
            return;
        }
        boolean zIsUsing = true;
        x2.C1735g c1735gA9 = x2.fn3e().m6793r(x2.ki(position, 0.0f)).a9(true);
        Resource resource = videoInfo.mSuperWallpaperResource;
        if (resource != null) {
            c2846n.f17048q.setVisibility(0);
            List<String> listM6967n = new C1795s(resource, C1791k.getInstance("spwallpaper")).m6967n();
            String str = null;
            if (listM6967n != null && listM6967n.size() > 0) {
                Iterator<String> it = listM6967n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (next.contains("spwallpaper")) {
                        str = next;
                        break;
                    }
                }
            }
            x2.m6782y((Activity) c2846n.f17046k.getContext(), str, c2846n.f17046k, c1735gA9);
            List<RelatedResource> subResources = resource.getSubResources();
            if (subResources != null) {
                zIsUsing = false;
                for (RelatedResource relatedResource : subResources) {
                    if ("spwallpaper".equals(relatedResource.getResourceCode())) {
                        zWvg = wvg(c2846n.f17045g, relatedResource.getLocalId(), "spwallpaper");
                    } else if ("splockscreen".equals(relatedResource.getResourceCode())) {
                        zWvg = wvg(c2846n.f17047n, relatedResource.getLocalId(), "splockscreen");
                    }
                    zIsUsing |= zWvg;
                }
            } else {
                zIsUsing = false;
            }
        } else {
            c2846n.f17048q.setVisibility(8);
            int i2 = this.f17038p;
            if (i2 == 1) {
                c2846n.f17050y.setVisibility(8);
                String strLd6 = C1821p.ld6(videoInfo.path);
                if (VideoInfoUtils.isUsingWallpaper("wallpaper", strLd6)) {
                    c2846n.f17045g.setVisibility(0);
                    z2 = true;
                } else {
                    c2846n.f17045g.setVisibility(8);
                    z2 = false;
                }
                if (VideoInfoUtils.isUsingWallpaper("lockscreen", strLd6)) {
                    c2846n.f17047n.setVisibility(0);
                } else {
                    c2846n.f17047n.setVisibility(8);
                    zIsUsing = z2;
                }
            } else if (i2 == 2) {
                c2846n.f17045g.setVisibility(8);
                c2846n.f17047n.setVisibility(8);
                zIsUsing = VideoInfoUtils.isUsing(videoInfo, 2);
                if (zIsUsing) {
                    c2846n.f17050y.setVisibility(0);
                } else {
                    c2846n.f17050y.setVisibility(8);
                }
            } else {
                zIsUsing = false;
            }
            x2.m6782y((Activity) c2846n.f17046k.getContext(), videoInfo.path, c2846n.f17046k, c1735gA9);
        }
        if (zIsUsing) {
            c2846n.f17049s.setVisibility(0);
        } else {
            c2846n.f17049s.setVisibility(8);
        }
        this.f17040s.add(holder.itemView);
        this.f17036k.m10043z(holder.itemView, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public RecyclerView.fti onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewOnClickListenerC2845k viewOnClickListenerC2845k = null;
        return viewType != 1 ? new C2846n(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_video_wallpaepr_local_item, parent, false), viewOnClickListenerC2845k) : new C2846n(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_incall_show_remove, parent, false), viewOnClickListenerC2845k);
    }

    /* JADX INFO: renamed from: t */
    public void m10141t(InterfaceC7941toq callback) {
        this.f17035h = callback;
    }
}
