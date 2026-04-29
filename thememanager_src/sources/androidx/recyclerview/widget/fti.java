package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: ScrollbarHelper.java */
/* JADX INFO: loaded from: classes.dex */
class fti {
    private fti() {
    }

    /* JADX INFO: renamed from: k */
    static int m4977k(RecyclerView.mcp mcpVar, o1t o1tVar, View view, View view2, RecyclerView.AbstractC1048h abstractC1048h, boolean z2) {
        if (abstractC1048h.getChildCount() == 0 || mcpVar.m4822q() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(abstractC1048h.getPosition(view) - abstractC1048h.getPosition(view2)) + 1;
        }
        return Math.min(o1tVar.kja0(), o1tVar.mo5090q(view2) - o1tVar.f7l8(view));
    }

    static int toq(RecyclerView.mcp mcpVar, o1t o1tVar, View view, View view2, RecyclerView.AbstractC1048h abstractC1048h, boolean z2, boolean z3) {
        if (abstractC1048h.getChildCount() == 0 || mcpVar.m4822q() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (mcpVar.m4822q() - Math.max(abstractC1048h.getPosition(view), abstractC1048h.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC1048h.getPosition(view), abstractC1048h.getPosition(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(o1tVar.mo5090q(view2) - o1tVar.f7l8(view)) / (Math.abs(abstractC1048h.getPosition(view) - abstractC1048h.getPosition(view2)) + 1))) + (o1tVar.n7h() - o1tVar.f7l8(view)));
        }
        return iMax;
    }

    static int zy(RecyclerView.mcp mcpVar, o1t o1tVar, View view, View view2, RecyclerView.AbstractC1048h abstractC1048h, boolean z2) {
        if (abstractC1048h.getChildCount() == 0 || mcpVar.m4822q() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return mcpVar.m4822q();
        }
        return (int) (((o1tVar.mo5090q(view2) - o1tVar.f7l8(view)) / (Math.abs(abstractC1048h.getPosition(view) - abstractC1048h.getPosition(view2)) + 1)) * mcpVar.m4822q());
    }
}
