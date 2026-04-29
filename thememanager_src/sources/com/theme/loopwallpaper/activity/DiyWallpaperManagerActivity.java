package com.theme.loopwallpaper.activity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.util.fti;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import com.theme.loopwallpaper.model.LoopWallpaper;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import jbh.InterfaceC6102k;
import miuix.appcompat.app.dd;
import miuix.appcompat.app.ki;
import miuix.recyclerview.widget.RecyclerView;
import miuix.view.InterfaceC7387s;

/* JADX INFO: loaded from: classes3.dex */
public class DiyWallpaperManagerActivity extends kja0 implements com.android.thememanager.basemodule.async.toq<Void, Void, ArrayList<LoopWallpaper>>, InterfaceC2950k {

    /* JADX INFO: renamed from: a */
    private boolean f30266a;

    /* JADX INFO: renamed from: b */
    private boolean f30267b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f72527bo;

    /* JADX INFO: renamed from: c */
    private RecyclerView f30268c;

    /* JADX INFO: renamed from: e */
    private ViewOnClickListenerC5433g f30270e;

    /* JADX INFO: renamed from: j */
    private dd f30271j;

    /* JADX INFO: renamed from: u */
    private InterfaceC7387s f30274u;

    /* JADX INFO: renamed from: v */
    private AsyncTaskC5437k f30275v;

    /* JADX INFO: renamed from: o */
    private ArrayList<LoopWallpaper> f30273o = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    private ArrayList<String> f30272m = new ArrayList<>();

    /* JADX INFO: renamed from: x */
    private boolean f30277x = true;

    /* JADX INFO: renamed from: d */
    private ki f30269d = null;

    /* JADX INFO: renamed from: w */
    private ActionMode.Callback f30276w = new ActionModeCallbackC5434k();

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private p000a.zy f72526ab = new C5436q();

    public static class f7l8 extends AsyncTask<Void, Void, ArrayList<LoopWallpaper>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<DiyWallpaperManagerActivity> f30278k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f72528toq;

        /* synthetic */ f7l8(DiyWallpaperManagerActivity diyWallpaperManagerActivity, int i2, ActionModeCallbackC5434k actionModeCallbackC5434k) {
            this(diyWallpaperManagerActivity, i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList<LoopWallpaper> doInBackground(Void[] objects) {
            return com.theme.loopwallpaper.controller.toq.m18516y().f7l8(this.f72528toq);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<LoopWallpaper> list) {
            super.onPostExecute(list);
            DiyWallpaperManagerActivity diyWallpaperManagerActivity = this.f30278k.get();
            if (gc3c.cdj(diyWallpaperManagerActivity)) {
                diyWallpaperManagerActivity.n2t(list);
            }
        }

        private f7l8(DiyWallpaperManagerActivity activity, int type) {
            this.f30278k = new WeakReference<>(activity);
            this.f72528toq = type;
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$g */
    public class ViewOnClickListenerC5433g extends RecyclerView.AbstractC1060y implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        private static final int f30279g = 1;

        /* JADX INFO: renamed from: y */
        private static final int f30280y = 2;

        /* JADX INFO: renamed from: k */
        private InterfaceC6102k f30281k;

        /* JADX INFO: renamed from: q */
        private View.OnLongClickListener f30283q;

        /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$g$k */
        public class k extends RecyclerView.fti {
            public k(View itemView) {
                super(itemView);
                C6077k.o1t(itemView);
            }
        }

        /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$g$toq */
        public class toq extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            public ImageView f30285k;

            /* JADX INFO: renamed from: q */
            public CheckBox f30287q;

            public toq(View itemView) {
                super(itemView);
                this.f30285k = (ImageView) itemView.findViewById(R.id.thumbnail);
                this.f30287q = (CheckBox) itemView.findViewById(android.R.id.checkbox);
                C6077k.o1t(itemView);
            }
        }

        public ViewOnClickListenerC5433g(InterfaceC6102k clickListener, View.OnLongClickListener longClickListener) {
            this.f30281k = clickListener;
            this.f30283q = longClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return (DiyWallpaperManagerActivity.this.f30273o == null ? 0 : DiyWallpaperManagerActivity.this.f30273o.size()) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemViewType(int position) {
            return position == 0 ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public void onBindViewHolder(RecyclerView.fti holder, int position) {
            holder.itemView.setTag(String.valueOf(position));
            holder.itemView.setOnClickListener(this);
            if (holder instanceof toq) {
                toq toqVar = (toq) holder;
                LoopWallpaper loopWallpaper = (LoopWallpaper) DiyWallpaperManagerActivity.this.f30273o.get(DiyWallpaperManagerActivity.this.wx16(position));
                x2.m6782y(DiyWallpaperManagerActivity.this, loopWallpaper.downloadUrl, toqVar.f30285k, x2.fn3e().m6793r(x2.ki(position, 0.0f)).dd((C2949g.f17747k.ld6() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.LINEAR_SRGB).name()).m6792l(true));
                toqVar.itemView.setOnLongClickListener(this.f30283q);
                toqVar.f30287q.setVisibility(DiyWallpaperManagerActivity.this.f30267b ? 0 : 8);
                toqVar.f30287q.setChecked(DiyWallpaperManagerActivity.this.f30272m.contains(loopWallpaper.downloadUrl));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            InterfaceC6102k interfaceC6102k = this.f30281k;
            if (interfaceC6102k != null) {
                interfaceC6102k.mo18507k(Integer.parseInt((String) v2.getTag()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public RecyclerView.fti onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            return viewType == 1 ? new k(layoutInflaterFrom.inflate(R.layout.diy_add_layout, parent, false)) : new toq(layoutInflaterFrom.inflate(R.layout.diy_wallpaper_item, parent, false));
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$k */
    class ActionModeCallbackC5434k implements ActionMode.Callback {

        /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$k$k */
        class k implements DialogInterface.OnClickListener {
            k() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                DiyWallpaperManagerActivity diyWallpaperManagerActivity = DiyWallpaperManagerActivity.this;
                new AsyncTaskC5435n(diyWallpaperManagerActivity, diyWallpaperManagerActivity.f30272m).executeOnExecutor(C6002g.ld6(), new Void[0]);
            }
        }

        ActionModeCallbackC5434k() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == 16908313) {
                DiyWallpaperManagerActivity.this.uc(mode);
            } else if (item.getItemId() == 16908314) {
                DiyWallpaperManagerActivity.this.f30272m.clear();
                if (DiyWallpaperManagerActivity.this.f30277x && DiyWallpaperManagerActivity.this.f30272m.size() != DiyWallpaperManagerActivity.this.f30273o.size()) {
                    Iterator it = DiyWallpaperManagerActivity.this.f30273o.iterator();
                    while (it.hasNext()) {
                        DiyWallpaperManagerActivity.this.f30272m.add(((LoopWallpaper) it.next()).downloadUrl);
                    }
                }
                DiyWallpaperManagerActivity.this.pjz9();
                DiyWallpaperManagerActivity.this.f30270e.notifyDataSetChanged();
            } else if (item.getItemId() == R.string.resource_delete) {
                if (DiyWallpaperManagerActivity.this.f30272m.isEmpty()) {
                    Toast.makeText(DiyWallpaperManagerActivity.this, R.string.resource_tip_select_none, 0).show();
                } else {
                    ki.C6947k c6947kM25039i = new ki.C6947k(DiyWallpaperManagerActivity.this).m25039i(android.R.attr.alertDialogIcon);
                    DiyWallpaperManagerActivity diyWallpaperManagerActivity = DiyWallpaperManagerActivity.this;
                    c6947kM25039i.m25050z(diyWallpaperManagerActivity.getString(R.string.resource_delete_all, Integer.valueOf(diyWallpaperManagerActivity.f30272m.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new k()).hb();
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
            DiyWallpaperManagerActivity.this.f30274u = (InterfaceC7387s) mode;
            DiyWallpaperManagerActivity.this.pjz9();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            DiyWallpaperManagerActivity.this.uc(mode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$n */
    public static class AsyncTaskC5435n extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private ArrayList<String> f30290k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<DiyWallpaperManagerActivity> f72529toq;

        public AsyncTaskC5435n(DiyWallpaperManagerActivity activity, ArrayList<String> list) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f30290k = arrayList;
            arrayList.addAll(list);
            this.f72529toq = new WeakReference<>(activity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            try {
                Iterator<String> it = this.f30290k.iterator();
                while (it.hasNext()) {
                    new File(it.next()).delete();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            DiyWallpaperManagerActivity diyWallpaperManagerActivity = this.f72529toq.get();
            if (gc3c.cdj(diyWallpaperManagerActivity)) {
                diyWallpaperManagerActivity.zwy();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            DiyWallpaperManagerActivity diyWallpaperManagerActivity = this.f72529toq.get();
            if (gc3c.cdj(diyWallpaperManagerActivity)) {
                diyWallpaperManagerActivity.uc((ActionMode) diyWallpaperManagerActivity.f30274u);
                Iterator it = diyWallpaperManagerActivity.f30273o.iterator();
                while (it.hasNext()) {
                    if (this.f30290k.contains(((LoopWallpaper) it.next()).downloadUrl)) {
                        it.remove();
                    }
                }
                diyWallpaperManagerActivity.f30266a = true;
                diyWallpaperManagerActivity.f30270e.notifyDataSetChanged();
                diyWallpaperManagerActivity.jbh();
            }
            com.theme.loopwallpaper.controller.toq.m18517z(com.theme.loopwallpaper.controller.toq.ki(0), com.theme.loopwallpaper.controller.toq.ki(1));
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.activity.DiyWallpaperManagerActivity$q */
    class C5436q implements p000a.zy {
        C5436q() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            DiyWallpaperManagerActivity.this.ixz();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(DiyWallpaperManagerActivity.this, false);
            }
        }
    }

    class toq implements View.OnLongClickListener {
        toq() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v2) {
            if (DiyWallpaperManagerActivity.this.f30267b) {
                return true;
            }
            DiyWallpaperManagerActivity.this.f30272m.add(((LoopWallpaper) DiyWallpaperManagerActivity.this.f30273o.get(DiyWallpaperManagerActivity.this.wx16(Integer.parseInt((String) v2.getTag())))).downloadUrl);
            DiyWallpaperManagerActivity.this.yl();
            DiyWallpaperManagerActivity.this.f30270e.notifyDataSetChanged();
            return true;
        }
    }

    class zy extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f30293k;

        zy(final int val$girdSpace) {
            this.f30293k = val$girdSpace;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui androidx.recyclerview.widget.RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
            int i2 = this.f30293k / 2;
            outRect.right = i2;
            outRect.top = i2;
            outRect.bottom = i2;
            outRect.left = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ixz() {
        if (C1803e.m7036h(null, this, 102)) {
            return;
        }
        if (this.f30269d == null) {
            this.f30269d = C1819o.x2(this);
        }
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.n9, mo6345a(), ""));
        this.f30269d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbh() {
        dd ddVar = this.f30271j;
        if (ddVar == null || !ddVar.isShowing()) {
            return;
        }
        this.f30271j.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2t(ArrayList<LoopWallpaper> list) {
        this.f30273o.clear();
        this.f30273o.addAll(list);
        this.f30270e.notifyDataSetChanged();
    }

    private void nsb() {
        AsyncTaskC5437k asyncTaskC5437k = this.f30275v;
        if (asyncTaskC5437k != null) {
            asyncTaskC5437k.toq(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uc(ActionMode actionMode) {
        this.f30267b = false;
        actionMode.finish();
        this.f30272m.clear();
        this.f30270e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ukdy(int i2) {
        if (i2 == 0) {
            if (lvui.qrj(this, this.f72526ab)) {
                return;
            }
            ixz();
        } else if (this.f30267b) {
            String str = this.f30273o.get(wx16(i2)).downloadUrl;
            if (this.f30272m.contains(str)) {
                this.f30272m.remove(str);
            } else {
                this.f30272m.add(str);
            }
            pjz9();
            this.f30270e.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wx16(int position) {
        return position - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yl() {
        this.f30267b = true;
        startActionMode(this.f30276w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zwy() {
        dd ddVar = new dd(this);
        this.f30271j = ddVar;
        ddVar.y2(0);
        this.f30271j.show();
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void ch() {
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: ebn, reason: merged with bridge method [inline-methods] */
    public void ij(ArrayList<LoopWallpaper> loopWallpapers) {
        nn86.m7150k(R.string.wallpaper_loop_add_success, 0);
        jbh();
        Iterator<LoopWallpaper> it = loopWallpapers.iterator();
        while (it.hasNext()) {
            this.f30273o.add(0, it.next());
        }
        this.f30266a = true;
        this.f30270e.notifyDataSetChanged();
        com.theme.loopwallpaper.controller.toq.zy(this.f72527bo);
        com.theme.loopwallpaper.controller.toq.m18517z(com.theme.loopwallpaper.controller.toq.ki(0), com.theme.loopwallpaper.controller.toq.ki(1));
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        nsb();
    }

    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        recreate();
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void n7h() {
        zwy();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Uri data2 = data.getData();
        ClipData clipData = data.getClipData();
        if (data2 != null) {
            arrayList.add(data2);
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                arrayList.add(clipData.getItemAt(i2).getUri());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AsyncTaskC5437k asyncTaskC5437k = new AsyncTaskC5437k(this, arrayList, this.f72527bo);
        this.f30275v = asyncTaskC5437k;
        asyncTaskC5437k.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(this.f30266a ? -1 : 0);
        finish();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C2949g c2949g = C2949g.f17747k;
        if (c2949g.ld6()) {
            getWindow().setColorMode(1);
        }
        c2949g.m10467q(this);
        int intExtra = getIntent().getIntExtra(p001b.f7l8.e4e, 0);
        this.f72527bo = intExtra;
        getAppCompatActionBar().xwq3(intExtra == 0 ? R.string.wallpaper_loop_my_lock_wallpaper : R.string.wallpaper_loop_my_desk_wallpaper);
        this.f30268c = (miuix.recyclerview.widget.RecyclerView) findViewById(R.id.recyclerView);
        this.f30270e = new ViewOnClickListenerC5433g(new InterfaceC6102k() { // from class: com.theme.loopwallpaper.activity.toq
            @Override // jbh.InterfaceC6102k
            /* JADX INFO: renamed from: k */
            public final void mo18507k(int i2) {
                this.f30294k.ukdy(i2);
            }
        }, new toq());
        this.f30268c.setLayoutManager(new GridLayoutManager(this, 3));
        this.f30268c.addItemDecoration(new zy(getResources().getDimensionPixelSize(R.dimen.recycler_divider_height)));
        this.f30268c.setAdapter(this.f30270e);
        new f7l8(this, this.f72527bo, null).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        nsb();
        C2949g.f17747k.m10468s(this);
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: pc, reason: merged with bridge method [inline-methods] */
    public void py(Void... values) {
    }

    protected void pjz9() {
        if (fti.f61240zy) {
            this.f30274u.cdj(16908313, "", R.drawable.action_title_cancel);
        }
        boolean z2 = this.f30272m.size() != this.f30273o.size();
        this.f30277x = z2;
        gc3c.zurt(this.f30274u, z2);
        ((ActionMode) this.f30274u).setTitle(String.format(getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, this.f30272m.size()), Integer.valueOf(this.f30272m.size())));
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.diy_wallpaper_manager_layout;
    }
}
