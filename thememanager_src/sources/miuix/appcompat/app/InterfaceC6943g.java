package miuix.appcompat.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: miuix.appcompat.app.g */
/* JADX INFO: compiled from: ActivityCallback.java */
/* JADX INFO: loaded from: classes3.dex */
interface InterfaceC6943g {
    /* JADX INFO: renamed from: k */
    void mo25015k(@zy.dd Bundle bundle);

    void onConfigurationChanged(Configuration configuration);

    boolean onCreatePanelMenu(int i2, Menu menu);

    View onCreatePanelView(int i2);

    boolean onMenuItemSelected(int i2, @zy.lvui MenuItem menuItem);

    void onPanelClosed(int i2, Menu menu);

    void onPostResume();

    boolean onPreparePanel(int i2, View view, Menu menu);

    void onStop();

    void toq(Bundle bundle);

    void zy(Bundle bundle);
}
