package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C0701k;
import androidx.recyclerview.widget.C1113t;
import androidx.recyclerview.widget.RecyclerView;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class t8r extends C1113t {

    /* JADX INFO: renamed from: n */
    final C0701k f5606n;

    /* JADX INFO: renamed from: q */
    final C0701k f5607q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final RecyclerView f51985zy;

    /* JADX INFO: renamed from: androidx.preference.t8r$k */
    /* JADX INFO: compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    class C1034k extends C0701k {
        C1034k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            Preference preferenceNi7;
            t8r.this.f5607q.onInitializeAccessibilityNodeInfo(view, kiVar);
            int childAdapterPosition = t8r.this.f51985zy.getChildAdapterPosition(view);
            RecyclerView.AbstractC1060y adapter = t8r.this.f51985zy.getAdapter();
            if ((adapter instanceof n7h) && (preferenceNi7 = ((n7h) adapter).ni7(childAdapterPosition)) != null) {
                preferenceNi7.m4647b(kiVar);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return t8r.this.f5607q.performAccessibilityAction(view, i2, bundle);
        }
    }

    public t8r(@lvui RecyclerView recyclerView) {
        super(recyclerView);
        this.f5607q = super.mo4722k();
        this.f5606n = new C1034k();
        this.f51985zy = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C1113t
    @lvui
    /* JADX INFO: renamed from: k */
    public C0701k mo4722k() {
        return this.f5606n;
    }
}
