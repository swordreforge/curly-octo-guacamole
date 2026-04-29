package com.android.thememanager.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import miuix.android.content.C6824k;
import miuix.appcompat.app.ki;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperMiuiTabActivity extends ThemeTabActivity implements InterfaceC2950k {
    private Menu aj;
    private ActionMode be;
    boolean ay = false;
    private final List<ActionMode.Callback> bs = new LinkedList();
    private ArrayList<WeakReference<zy>> k0 = new ArrayList<>();
    private final ActionMode.Callback ar = new ActionModeCallbackC2507k();
    private p000a.zy bc = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.settings.WallpaperMiuiTabActivity$k */
    class ActionModeCallbackC2507k implements ActionMode.Callback {
        ActionModeCallbackC2507k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(ActionMode actionMode, MenuItem menuItem, DialogInterface dialogInterface, int i2) {
            Iterator it = WallpaperMiuiTabActivity.this.bs.iterator();
            while (it.hasNext()) {
                ((ActionMode.Callback) it.next()).onActionItemClicked(actionMode, menuItem);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(final ActionMode mode, final MenuItem item) {
            boolean z2;
            if (WallpaperMiuiTabActivity.this.bs.size() == 0) {
                return true;
            }
            if (item.getItemId() == 16908314) {
                return ((ActionMode.Callback) WallpaperMiuiTabActivity.this.bs.get(0)).onActionItemClicked(mode, item);
            }
            if (item.getItemId() == R.string.resource_delete) {
                new ki.C6947k(WallpaperMiuiTabActivity.this).m25039i(android.R.attr.alertDialogIcon).m25050z(WallpaperMiuiTabActivity.this.getString(R.string.wallpaper_delete_all)).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.settings.d2ok
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f14994k.toq(mode, item, dialogInterface, i2);
                    }
                }).hb();
                return true;
            }
            while (true) {
                for (ActionMode.Callback callback : WallpaperMiuiTabActivity.this.bs) {
                    z2 = z2 || callback.onActionItemClicked(mode, item);
                }
                return z2;
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            boolean z2;
            WallpaperMiuiTabActivity.this.aj = menu;
            while (true) {
                for (ActionMode.Callback callback : WallpaperMiuiTabActivity.this.bs) {
                    z2 = z2 || callback.onCreateActionMode(mode, menu);
                }
                return z2;
            }
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            Iterator it = WallpaperMiuiTabActivity.this.bs.iterator();
            while (it.hasNext()) {
                ((ActionMode.Callback) it.next()).onDestroyActionMode(mode);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            boolean z2;
            while (true) {
                for (ActionMode.Callback callback : WallpaperMiuiTabActivity.this.bs) {
                    z2 = z2 || callback.onPrepareActionMode(mode, menu);
                }
                return z2;
            }
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            for (WeakReference weakReference : WallpaperMiuiTabActivity.this.k0) {
                if (weakReference != null && weakReference.get() != null) {
                    ((zy) weakReference.get()).nn86();
                }
            }
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(WallpaperMiuiTabActivity.this, false);
            }
        }
    }

    public interface zy {
        void nn86();
    }

    private void wlev() {
        this.bc = null;
        this.k0.clear();
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean bo() {
        return false;
    }

    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        recreate();
    }

    public void ga(zy callback) {
        this.k0.add(new WeakReference<>(callback));
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
        this.ay = false;
        View viewFindViewById = findViewById(R.id.view_pager);
        if (viewFindViewById instanceof ViewPager) {
            ((ViewPager) viewFindViewById).setDraggable(false);
        }
        this.be = null;
        this.aj = null;
        com.android.thememanager.basemodule.utils.o1t.fti(this, true);
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        this.ay = true;
        View viewFindViewById = findViewById(R.id.view_pager);
        if (viewFindViewById instanceof ViewPager) {
            ((ViewPager) viewFindViewById).setDraggable(false);
        }
        com.android.thememanager.basemodule.utils.o1t.fti(this, false);
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            finish();
            return;
        }
        if (requestCode != 102 || data == null) {
            return;
        }
        if (getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)) {
            com.android.thememanager.x2.f17856k.m10531k().mo8413q(data, this);
            return;
        }
        if (data.getType() != null && data.getType().startsWith("video")) {
            com.android.thememanager.v9.f7l8.fn3e(this, data.getDataString());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WallpaperDetailActivity.class);
        intent.setAction(uc.f16827n);
        intent.setData(data.getData());
        intent.putExtra(C6824k.e4e, "");
        startActivity(intent);
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.activity.t8r, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) && getIntent().getIntExtra(com.android.thememanager.f7l8.f11607n, -1) == 0) {
            gc3c.ni7(this);
        }
        C2949g c2949g = C2949g.f17747k;
        if (c2949g.ld6()) {
            getWindow().setColorMode(1);
        }
        c2949g.m10467q(this);
        View viewFindViewById = findViewById(R.id.operation_btn);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ActionMode actionMode = this.be;
        if (actionMode != null && this.ay) {
            actionMode.finish();
        }
        wlev();
        C2949g.f17747k.m10468s(this);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (!getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) || y9n.jk()) {
            return;
        }
        finish();
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public ActionMode startActionMode(ActionMode.Callback callback) {
        this.bs.clear();
        this.bs.add(callback);
        if (this.ay) {
            callback.onCreateActionMode(this.be, this.aj);
            callback.onPrepareActionMode(this.be, this.aj);
        } else {
            this.be = super.startActionMode(this.ar);
        }
        return this.be;
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.activity.t8r
    protected void zkd() {
    }
}
