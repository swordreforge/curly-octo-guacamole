package miuix.hybrid;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: HybridFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 extends com.android.thememanager.basemodule.base.toq {

    /* JADX INFO: renamed from: t */
    private final Set<HybridView> f40339t = new HashSet();

    private void kiv() {
        for (HybridView hybridView : this.f40339t) {
            if (hybridView != null) {
                if (hybridView.getParent() != null) {
                    ((ViewGroup) hybridView.getParent()).removeView(hybridView);
                }
                hybridView.m25765g();
            }
        }
        this.f40339t.clear();
    }

    protected final void bih(View view) {
        ec(view, z4t());
    }

    protected final void ec(View view, int configResId) {
        o5(view, configResId, null);
    }

    protected final void o5(View view, int configResId, String url) {
        if (!(view instanceof HybridView)) {
            throw new IllegalArgumentException("view being registered is not a hybrid view");
        }
        HybridView hybridView = (HybridView) view;
        miuix.hybrid.internal.f7l8 f7l8Var = new miuix.hybrid.internal.f7l8(getActivity(), hybridView);
        hybridView.setHybridManager(f7l8Var);
        this.f40339t.add(hybridView);
        f7l8Var.ki(configResId, url);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().m25807z(requestCode, resultCode, data);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().o1t();
        }
        kiv();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().m25806t();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().mcp();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().a9();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<HybridView> it = this.f40339t.iterator();
        while (it.hasNext()) {
            it.next().getHybridManager().fti();
        }
    }

    protected final void yw(View view) {
        if (!(view instanceof HybridView)) {
            throw new IllegalArgumentException("view being unregistered is not a hybrid view");
        }
        this.f40339t.remove(view);
    }

    protected int z4t() {
        return 0;
    }
}
