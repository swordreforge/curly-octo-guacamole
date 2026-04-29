package com.android.thememanager.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.n2t;
import com.android.thememanager.activity.t8r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import miuix.appcompat.app.ki;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperTabActivity extends n2t {
    private Menu bd;
    private ActionMode bu;
    boolean bc = false;
    private List<ActionMode.Callback> tlhn = new LinkedList();
    private ActionMode.Callback w97r = new ActionModeCallbackC2509k();

    /* JADX INFO: renamed from: com.android.thememanager.settings.WallpaperTabActivity$k */
    class ActionModeCallbackC2509k implements ActionMode.Callback {
        ActionModeCallbackC2509k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(ActionMode actionMode, MenuItem menuItem, DialogInterface dialogInterface, int i2) {
            Iterator it = WallpaperTabActivity.this.tlhn.iterator();
            while (it.hasNext()) {
                ((ActionMode.Callback) it.next()).onActionItemClicked(actionMode, menuItem);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(final ActionMode mode, final MenuItem item) {
            boolean z2;
            if (WallpaperTabActivity.this.tlhn.size() == 0) {
                return true;
            }
            if (item.getItemId() == 16908314) {
                return ((ActionMode.Callback) WallpaperTabActivity.this.tlhn.get(0)).onActionItemClicked(mode, item);
            }
            if (item.getItemId() == R.string.resource_delete) {
                new ki.C6947k(WallpaperTabActivity.this).m25039i(android.R.attr.alertDialogIcon).m25050z(WallpaperTabActivity.this.getString(R.string.wallpaper_delete_all)).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.settings.hyr
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f15045k.toq(mode, item, dialogInterface, i2);
                    }
                }).hb();
                return true;
            }
            while (true) {
                for (ActionMode.Callback callback : WallpaperTabActivity.this.tlhn) {
                    z2 = z2 || callback.onActionItemClicked(mode, item);
                }
                return z2;
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            boolean z2;
            WallpaperTabActivity.this.bd = menu;
            while (true) {
                for (ActionMode.Callback callback : WallpaperTabActivity.this.tlhn) {
                    z2 = z2 || callback.onCreateActionMode(mode, menu);
                }
                return z2;
            }
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            Iterator it = WallpaperTabActivity.this.tlhn.iterator();
            while (it.hasNext()) {
                ((ActionMode.Callback) it.next()).onDestroyActionMode(mode);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            boolean z2;
            while (true) {
                for (ActionMode.Callback callback : WallpaperTabActivity.this.tlhn) {
                    z2 = z2 || callback.onPrepareActionMode(mode, menu);
                }
                return z2;
            }
        }
    }

    @Override // com.android.thememanager.activity.n2t
    protected View h4b(int index, t8r.C1625k info) {
        View viewInflate = this.k0.inflate(R.layout.wallpaper_list_tab, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(android.R.id.title);
        textView.setText(info.f9337k);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wallpaper_list_tab_half_offset);
        if (index == 0) {
            layoutParams.gravity = androidx.core.view.qrj.f50866zy;
            layoutParams.setMarginEnd(dimensionPixelSize);
        } else if (index == 1) {
            layoutParams.gravity = androidx.core.view.qrj.f50865toq;
            layoutParams.setMarginStart(dimensionPixelSize);
        }
        textView.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
        this.bc = false;
        this.bu = null;
        this.bd = null;
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        this.bc = true;
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.activity.t8r, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.operation_btn);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
        if (this.be != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wallpaper_list_tab_bar_vertical_padding);
            LinearLayout linearLayout = this.be;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, this.be.getPaddingRight(), dimensionPixelSize);
        }
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public ActionMode startActionMode(ActionMode.Callback callback) {
        this.tlhn.remove(callback);
        this.tlhn.add(0, callback);
        if (this.bc) {
            callback.onCreateActionMode(this.bu, this.bd);
            callback.onPrepareActionMode(this.bu, this.bd);
        } else {
            this.bu = super.startActionMode(this.w97r);
        }
        return this.bu;
    }

    @Override // com.android.thememanager.activity.ThemeTabActivity, com.android.thememanager.activity.t8r
    protected void zkd() {
    }
}
