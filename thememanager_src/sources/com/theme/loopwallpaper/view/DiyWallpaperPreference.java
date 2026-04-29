package com.theme.loopwallpaper.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorSpace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.AbstractC0067g;
import androidx.fragment.app.Fragment;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.v9.C2871p;
import com.android.thememanager.wallpaper.C2949g;
import com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity;
import com.theme.loopwallpaper.fragment.C5441q;
import com.theme.loopwallpaper.model.LoopWallpaper;
import i1.C6077k;
import java.util.List;
import miuix.appcompat.app.t8r;
import miuix.recyclerview.widget.RecyclerView;
import p001b.f7l8;

/* JADX INFO: loaded from: classes3.dex */
public class DiyWallpaperPreference extends Preference {
    private RecyclerView aj;
    private Activity ar;
    private Fragment bc;
    private AbstractC0067g bd;
    private TextView be;
    private C5448q bs;
    private int bu;
    private List<LoopWallpaper> k0;
    public InterfaceC5445g tlhn;

    /* JADX INFO: renamed from: com.theme.loopwallpaper.view.DiyWallpaperPreference$g */
    public interface InterfaceC5445g {
        /* JADX INFO: renamed from: k */
        void mo18557k();
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.view.DiyWallpaperPreference$k */
    class ViewOnClickListenerC5446k implements View.OnClickListener {
        ViewOnClickListenerC5446k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            DiyWallpaperPreference.this.ixz();
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.view.DiyWallpaperPreference$n */
    public class C5447n extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        public ImageView f30399k;

        /* JADX INFO: renamed from: q */
        private View f30401q;

        public C5447n(View itemView) {
            super(itemView);
            this.f30399k = (ImageView) itemView.findViewById(R.id.imageView);
            View viewFindViewById = itemView.findViewById(R.id.rootView);
            this.f30401q = viewFindViewById;
            C6077k.o1t(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.view.DiyWallpaperPreference$q */
    public class C5448q extends RecyclerView.AbstractC1060y {

        /* JADX INFO: renamed from: n */
        private static final int f30402n = 2;

        /* JADX INFO: renamed from: q */
        private static final int f30403q = 1;

        /* JADX INFO: renamed from: com.theme.loopwallpaper.view.DiyWallpaperPreference$q$k */
        class k implements View.OnClickListener {
            k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                if (((Integer) v2.getTag()).intValue() != 0) {
                    DiyWallpaperPreference.this.ixz();
                } else if (DiyWallpaperPreference.this.bc instanceof C5441q) {
                    ((C5441q) DiyWallpaperPreference.this.bc).nnh(DiyWallpaperPreference.this.tlhn);
                    if (lvui.x2(DiyWallpaperPreference.this.bc.getActivity(), ((C5441q) DiyWallpaperPreference.this.bc).m2t(), DiyWallpaperPreference.this.bd)) {
                        return;
                    }
                    DiyWallpaperPreference.this.tlhn.mo18557k();
                }
            }
        }

        public C5448q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return (DiyWallpaperPreference.this.k0 == null ? 0 : DiyWallpaperPreference.this.k0.size()) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemViewType(int position) {
            return position == 0 ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public void onBindViewHolder(RecyclerView.fti holder, int position) {
            View view;
            if (holder instanceof C5447n) {
                C5447n c5447n = (C5447n) holder;
                x2.m6782y(DiyWallpaperPreference.this.ar, ((LoopWallpaper) DiyWallpaperPreference.this.k0.get(DiyWallpaperPreference.wx16(position))).downloadUrl, c5447n.f30399k, x2.fn3e().m6793r(x2.ki(position, 0.0f)).dd((C2949g.f17747k.ld6() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.LINEAR_SRGB).name()).m6792l(true));
                view = c5447n.f30401q;
            } else {
                view = ((zy) holder).f30407k;
            }
            holder.itemView.setTag(Integer.valueOf(position));
            view.setOnClickListener(new k());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public RecyclerView.fti onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            if (viewType != 1) {
                return DiyWallpaperPreference.this.new C5447n(layoutInflaterFrom.inflate(R.layout.loop_wallpaper_layout, parent, false));
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.diy_add_layout, parent, false);
            Resources resources = DiyWallpaperPreference.this.ar.getResources();
            viewInflate.setLayoutParams(new RecyclerView.cdj(resources.getDimensionPixelSize(R.dimen.loop_wallpaper_preview_width), resources.getDimensionPixelSize(R.dimen.loop_wallpaper_preview_height)));
            return DiyWallpaperPreference.this.new zy(viewInflate);
        }
    }

    class toq implements InterfaceC5445g {
        toq() {
        }

        @Override // com.theme.loopwallpaper.view.DiyWallpaperPreference.InterfaceC5445g
        /* JADX INFO: renamed from: k */
        public void mo18557k() {
            DiyWallpaperPreference.this.m28272do();
        }
    }

    public class zy extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private View f30407k;

        public zy(View itemView) {
            super(itemView);
            View viewFindViewById = itemView.findViewById(R.id.rootView);
            this.f30407k = viewFindViewById;
            C6077k.o1t(viewFindViewById);
        }
    }

    public DiyWallpaperPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.tlhn = new toq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28272do() {
        Fragment fragment = this.bc;
        if (C1803e.m7036h(fragment, fragment.getActivity(), this.bu)) {
            return;
        }
        C1819o.x2((t8r) x2()).show();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.n9, "WallpaperLoopPreferenceActivity", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ixz() {
        Intent intent = new Intent(this.ar, (Class<?>) DiyWallpaperManagerActivity.class);
        intent.putExtra(f7l8.e4e, this.bu);
        this.bc.startActivityForResult(intent, this.bu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int wx16(int position) {
        return position - 1;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        super.mo4638o(c1016i);
        View view = c1016i.itemView;
        this.ar = (Activity) x2();
        this.bu = !com.theme.loopwallpaper.controller.toq.f72546jk.equals(fn3e()) ? 1 : 0;
        this.be = (TextView) view.findViewById(android.R.id.summary);
        view.findViewById(R.id.info_container).setOnClickListener(new ViewOnClickListenerC5446k());
        this.aj = (miuix.recyclerview.widget.RecyclerView) view.findViewById(R.id.recyclerView);
        this.bs = new C5448q();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.ar);
        linearLayoutManager.setOrientation(0);
        if (this.aj.getItemDecorationCount() == 0) {
            C2871p c2871p = new C2871p(this.ar, 0);
            c2871p.x2(this.ar.getResources().getDrawable(R.drawable.recycler_inter_vertical_divider));
            this.aj.addItemDecoration(c2871p);
        }
        this.aj.setLayoutManager(linearLayoutManager);
        this.aj.setAdapter(this.bs);
    }

    public void ukdy(List<LoopWallpaper> list) {
        this.k0 = list;
        C5448q c5448q = this.bs;
        if (c5448q != null) {
            c5448q.notifyDataSetChanged();
        }
    }

    public DiyWallpaperPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.tlhn = new toq();
    }

    public DiyWallpaperPreference(Context context) {
        super(context);
        this.tlhn = new toq();
    }

    public DiyWallpaperPreference(Context context, Fragment fragment, AbstractC0067g activityResultLauncher) {
        super(context);
        this.tlhn = new toq();
        this.bc = fragment;
        this.bd = activityResultLauncher;
    }
}
