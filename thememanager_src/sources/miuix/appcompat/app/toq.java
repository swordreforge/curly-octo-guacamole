package miuix.appcompat.app;

import android.content.res.Configuration;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import zy.uv6;

/* JADX INFO: compiled from: ActionBarDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
interface toq extends jp0y {
    int getBottomMenuMode();

    void invalidateOptionsMenu();

    AbstractC6946k jk();

    void onActionModeFinished(ActionMode actionMode);

    void onActionModeStarted(ActionMode actionMode);

    void onConfigurationChanged(Configuration configuration);

    boolean onCreatePanelMenu(int i2, Menu menu);

    View onCreatePanelView(int i2);

    void onDestroy();

    boolean onMenuItemSelected(int i2, MenuItem menuItem);

    void onPanelClosed(int i2, Menu menu);

    void onPostResume();

    boolean onPreparePanel(int i2, View view, Menu menu);

    void onStop();

    ActionMode onWindowStartingActionMode(ActionMode.Callback callback);

    void registerCoordinateScrollView(View view);

    boolean requestWindowFeature(int i2);

    default void setBottomExtraInset(int i2) {
    }

    default void setBottomMenuMode(int i2) {
    }

    @Override // miuix.appcompat.app.jp0y
    void setCorrectNestedScrollMotionEventEnabled(boolean z2);

    ActionMode startActionMode(ActionMode.Callback callback);

    void unregisterCoordinateScrollView(View view);
}
