package miuix.autodensity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import miuix.reflect.C7320k;

/* JADX INFO: compiled from: ConfigurationChangeFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends Fragment {

    /* JADX INFO: renamed from: k */
    private boolean f39842k = false;

    /* JADX INFO: renamed from: q */
    private AutoDensityConfig f39843q;

    /* JADX INFO: renamed from: k */
    public void m25515k() {
        this.f39842k = true;
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        zy.m25521q("ConfigurationChangeFragment onAttach newConfig " + context.getResources().getConfiguration() + " context: " + context);
        AutoDensityConfig.updateDensity(context);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Activity activity = getActivity();
        zy.m25521q("ConfigurationChangeFragment onConfigurationChanged newConfig " + configuration + " activity: " + activity);
        this.f39843q.updateDensityOnConfigChanged(activity, configuration);
        super.onConfigurationChanged(configuration);
        try {
            if (this.f39842k) {
                ((ActivityInfo) C7320k.qrj(Activity.class, activity, "mActivityInfo")).configChanges &= -4097;
                this.f39842k = false;
            }
        } catch (Exception unused) {
        }
    }

    public void toq(AutoDensityConfig autoDensityConfig) {
        this.f39843q = autoDensityConfig;
    }
}
