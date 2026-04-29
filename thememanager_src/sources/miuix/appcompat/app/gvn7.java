package miuix.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: IFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public interface gvn7 extends d3, jp0y, mcp {
    void checkThemeLegality();

    AbstractC6946k getActionBar();

    Context getThemedContext();

    boolean hasActionBar();

    boolean isInEditActionMode();

    boolean isIsInSearchActionMode();

    boolean isRegisterResponsive();

    void onActionModeFinished(ActionMode actionMode);

    void onActionModeStarted(ActionMode actionMode);

    boolean onCreateOptionsMenu(Menu menu);

    boolean onCreatePanelMenu(int i2, Menu menu);

    View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onPanelClosed(int i2, Menu menu);

    void onPreparePanel(int i2, View view, Menu menu);

    void onViewInflated(View view, Bundle bundle);

    void setThemeRes(int i2);

    ActionMode startActionMode(ActionMode.Callback callback);
}
