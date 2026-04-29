package com.android.thememanager.util;

import android.content.DialogInterface;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import ch.InterfaceC1395k;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miuix.appcompat.app.ki;
import miuix.core.util.C7083n;
import miuix.view.InterfaceC7387s;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: VideoBatchHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class uj2j extends t8r implements InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: r */
    private static final String f16840r = "VideoBatchHandler";

    /* JADX INFO: renamed from: g */
    private com.android.thememanager.v9.adapter.toq f16841g;

    /* JADX INFO: renamed from: i */
    private List<VideoInfo> f16843i;

    /* JADX INFO: renamed from: n */
    private ActivityC0891q f16844n;

    /* JADX INFO: renamed from: p */
    private boolean f16845p;

    /* JADX INFO: renamed from: s */
    private boolean f16846s;

    /* JADX INFO: renamed from: y */
    private InterfaceC7387s f16848y;

    /* JADX INFO: renamed from: z */
    private InterfaceC1395k f16849z;

    /* JADX INFO: renamed from: h */
    private Set<Integer> f16842h = new HashSet();

    /* JADX INFO: renamed from: t */
    private ActionMode.Callback f16847t = new ActionModeCallbackC2811k();

    /* JADX INFO: renamed from: com.android.thememanager.util.uj2j$k */
    /* JADX INFO: compiled from: VideoBatchHandler.java */
    class ActionModeCallbackC2811k implements ActionMode.Callback {
        ActionModeCallbackC2811k() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return uj2j.this.o1t(mode, item);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            uj2j.this.cdj(menu);
            uj2j.this.f16848y = (InterfaceC7387s) mode;
            uj2j.this.m10042t();
            uj2j.this.f16841g.fn3e();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            uj2j.this.f16848y = null;
            uj2j.this.mo9372s();
            uj2j.this.f16841g.ni7();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: compiled from: VideoBatchHandler.java */
    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            uj2j.this.ki();
        }
    }

    /* JADX INFO: compiled from: VideoBatchHandler.java */
    class zy implements com.android.thememanager.basemodule.local.f7l8 {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.local.f7l8
        /* JADX INFO: renamed from: k */
        public void mo6814k() {
            uj2j.this.f16841g.mcp();
            uj2j.this.mo9372s();
        }
    }

    public uj2j(Fragment fragment, com.android.thememanager.v9.adapter.toq adapter) {
        this.f16844n = fragment.getActivity();
        this.f16841g = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj(Menu menu) {
        menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
    }

    private void fn3e(View v2, int position) {
        this.f16846s = true;
        this.f16842h.add(Integer.valueOf(position));
        this.f16844n.startActionMode(this.f16847t);
        this.f16841g.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        if (this.f16849z == null) {
            this.f16849z = new ch.zy(C1788k.ad);
        }
        ArrayList arrayList = null;
        Iterator<Integer> it = this.f16842h.iterator();
        while (it.hasNext()) {
            VideoInfo videoInfo = this.f16843i.get(it.next().intValue());
            if (videoInfo.mSuperWallpaperResource == null) {
                try {
                    this.f16849z.remove(C7083n.m25584g(videoInfo.path));
                    new File(videoInfo.path).delete();
                    new File(videoInfo.thumbnail).delete();
                } catch (Exception e2) {
                    Log.i(f16840r, "Delete video file exception " + e2);
                }
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(videoInfo.mSuperWallpaperResource);
            }
        }
        if (arrayList != null) {
            C2320q.ki(this.f16844n, arrayList, C1791k.getInstance("spwallpaper"), new zy());
        } else {
            this.f16841g.mcp();
            mo9372s();
        }
    }

    private int ni7(List<VideoInfo> batchList) {
        int i2 = 0;
        for (VideoInfo videoInfo : batchList) {
            if (videoInfo.path == null) {
                Log.d(f16840r, "videoInfo path is null");
            } else if (m10041p(videoInfo)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o1t(ActionMode mode, MenuItem item) {
        if (item.getItemId() == 16908313) {
            mo9372s();
        } else {
            if (item.getItemId() == 16908314) {
                if (this.f16845p) {
                    int size = this.f16843i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (m10041p(this.f16843i.get(i2))) {
                            this.f16842h.add(Integer.valueOf(i2));
                        }
                    }
                } else {
                    this.f16842h.clear();
                }
                Iterator<View> it = this.f16841g.fu4().iterator();
                while (it.hasNext()) {
                    wvg(it.next());
                }
                m10042t();
            } else if (item.getItemId() == R.string.resource_delete) {
                if (this.f16842h.isEmpty()) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_tip_select_none, 0);
                } else {
                    new ki.C6947k(this.f16844n).m25039i(android.R.attr.alertDialogIcon).m25050z(this.f16844n.getString(R.string.resource_delete_all, Integer.valueOf(this.f16842h.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new toq()).hb();
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    private boolean m10041p(@zy.lvui VideoInfo videoInfo) {
        if (VideoInfoUtils.isSystemFile(videoInfo) || VideoInfoUtils.ID_IN_CALL_SHOW_REMOVE.equals(videoInfo.onlineId)) {
            return false;
        }
        if (videoInfo.mSuperWallpaperResource == null) {
            return !VideoInfoUtils.isUsing(videoInfo, this.f16841g.f17038p);
        }
        return !videoInfo.mSuperWallpaperResource.getLocalId().equals(com.android.thememanager.basemodule.utils.vyq.zurt("spwallpaper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m10042t() {
        if (fti.f61240zy) {
            this.f16848y.cdj(16908313, "", R.drawable.action_title_cancel);
        }
        boolean z2 = this.f16842h.size() != ni7(this.f16843i);
        this.f16845p = z2;
        gc3c.zurt(this.f16848y, z2);
        ((ActionMode) this.f16848y).setTitle(String.format(this.f16844n.getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(this.f16842h.size())));
    }

    private void wvg(View v2) {
        Pair pair;
        if (v2 == null || (pair = (Pair) v2.getTag()) == null) {
            return;
        }
        boolean z2 = this.f16846s && this.f16842h.contains(pair.first);
        boolean z3 = this.f16846s && m10041p(this.f16843i.get(((Integer) pair.first).intValue()));
        CheckBox checkBox = (CheckBox) v2.findViewById(android.R.id.checkbox);
        if (checkBox != null) {
            checkBox.setVisibility(z3 ? 0 : 8);
            checkBox.setChecked(z2);
        }
    }

    public boolean fu4() {
        return this.f16842h.size() > 0;
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: g */
    protected void mo9371g(View v2) {
        Pair pair = (Pair) v2.getTag();
        if (pair == null) {
            return;
        }
        if (!this.f16846s) {
            VideoInfo videoInfo = this.f16841g.o1t().get(((Integer) pair.first).intValue());
            Resource resource = videoInfo.mSuperWallpaperResource;
            if (resource != null) {
                com.android.thememanager.v9.f7l8.cdj(this.f16844n, resource);
            } else {
                com.android.thememanager.v9.f7l8.fn3e(this.f16844n, videoInfo.path);
            }
            boolean zEquals = p001b.f7l8.f53794le7.equals(this.f16844n.getIntent().getAction());
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.lzd);
            if (zEquals) {
                arrayMapZy.put("contentType", com.android.thememanager.basemodule.analysis.toq.wutb);
            }
            C1708s.f7l8().ld6().ni7(arrayMapZy);
            return;
        }
        VideoInfo videoInfo2 = this.f16843i.get(((Integer) pair.first).intValue());
        if (!m10041p(videoInfo2)) {
            com.android.thememanager.basemodule.utils.nn86.toq(this.f16844n.getString(R.string.resource_can_not_selected, VideoInfoUtils.isSystemFile(videoInfo2) ? this.f16844n.getString(R.string.resource_system_title) : this.f16844n.getString(R.string.resource_current_using_title)), 0);
            return;
        }
        if (this.f16842h.contains(pair.first)) {
            this.f16842h.remove(pair.first);
        } else {
            this.f16842h.add((Integer) pair.first);
        }
        if (this.f16842h.isEmpty()) {
            mo9372s();
        } else {
            m10042t();
            wvg(v2);
        }
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: q */
    public boolean mo9554q() {
        return this.f16846s;
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: s */
    public void mo9372s() {
        if (this.f16846s) {
            this.f16846s = false;
            Object obj = this.f16848y;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            this.f16842h.clear();
            this.f16841g.notifyDataSetChanged();
        }
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: y */
    protected boolean mo9373y(View v2) {
        Pair pair = (Pair) v2.getTag();
        if (pair == null) {
            return false;
        }
        List<VideoInfo> listO1t = this.f16841g.o1t();
        this.f16843i = listO1t;
        if (!(listO1t.size() > 0 && m10041p(this.f16843i.get(((Integer) pair.first).intValue()))) || this.f16846s) {
            return false;
        }
        fn3e(v2, ((Integer) pair.first).intValue());
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m10043z(View v2, int position) {
        super.zy(v2, new Pair<>(Integer.valueOf(position), 0));
        wvg(v2);
    }
}
