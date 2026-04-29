package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50731toq = -1;

    /* JADX INFO: renamed from: k */
    @dd
    private final Object f3956k;

    /* JADX INFO: renamed from: androidx.core.view.accessibility.t8r$k */
    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @hyr(16)
    static class C0663k extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: k */
        final t8r f3957k;

        C0663k(t8r t8rVar) {
            this.f3957k = t8rVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            ki qVar = this.f3957k.toq(i2);
            if (qVar == null) {
                return null;
            }
            return qVar.nme();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            List<ki> listZy = this.f3957k.zy(str, i2);
            if (listZy == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listZy.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listZy.get(i3).nme());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f3957k.mo3086g(i2, i3, bundle);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @hyr(19)
    static class toq extends C0663k {
        toq(t8r t8rVar) {
            super(t8rVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            ki kiVarMo3089q = this.f3957k.mo3089q(i2);
            if (kiVarMo3089q == null) {
                return null;
            }
            return kiVarMo3089q.nme();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @hyr(26)
    static class zy extends toq {
        zy(t8r t8rVar) {
            super(t8rVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3957k.m3087k(i2, ki.r25n(accessibilityNodeInfo), str, bundle);
        }
    }

    public t8r() {
        this.f3956k = new zy(this);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo3086g(int i2, int i3, @dd Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m3087k(int i2, @lvui ki kiVar, @lvui String str, @dd Bundle bundle) {
    }

    @dd
    /* JADX INFO: renamed from: n */
    public Object m3088n() {
        return this.f3956k;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public ki mo3089q(int i2) {
        return null;
    }

    @dd
    public ki toq(int i2) {
        return null;
    }

    @dd
    public List<ki> zy(@lvui String str, int i2) {
        return null;
    }

    public t8r(@dd Object obj) {
        this.f3956k = obj;
    }
}
