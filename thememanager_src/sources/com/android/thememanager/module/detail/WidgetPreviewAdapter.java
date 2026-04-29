package com.android.thememanager.module.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.network.entity.WidgetPreviewInfo;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.oc;

/* JADX INFO: compiled from: WidgetPreviewAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetPreviewAdapter extends BaseThemeAdapter<WidgetPreviewInfo, WidgetDetailPreviewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPreviewAdapter(@InterfaceC7396q InterfaceC1719p viewContainer) {
        super(viewContainer);
        d2ok.m23075h(viewContainer, "viewContainer");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public WidgetDetailPreviewHolder onCreateViewHolder(@InterfaceC7396q ViewGroup parent, int i2) {
        View view;
        d2ok.m23075h(parent, "parent");
        int i3 = R.layout.widget_detail_preview_item_style_1x2;
        switch (i2) {
            case 2:
                i3 = R.layout.widget_detail_preview_item_style_2x1;
                break;
            case 3:
                i3 = R.layout.widget_detail_preview_item_style_2x2;
                break;
            case 4:
                i3 = R.layout.widget_detail_preview_item_style_4x2;
                break;
            case 5:
                i3 = R.layout.widget_detail_preview_item_style_2x3;
                break;
            case 6:
                i3 = R.layout.widget_detail_preview_item_style_4x4;
                break;
            case 7:
                i3 = R.layout.widget_detail_preview_item_style_front;
                break;
        }
        if (i3 != 0) {
            view = LayoutInflater.from(fn3e()).inflate(i3, parent, false);
            d2ok.qrj(view);
        } else {
            view = new View(fn3e());
        }
        return new WidgetDetailPreviewHolder(view, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getItemViewType(int r2) {
        /*
            r1 = this;
            java.util.List<T> r0 = r1.f9846q
            java.lang.Object r2 = r0.get(r2)
            com.android.thememanager.network.entity.WidgetPreviewInfo r2 = (com.android.thememanager.network.entity.WidgetPreviewInfo) r2
            java.lang.String r2 = r2.getSuitPreviewSize()
            int r0 = r2.hashCode()
            switch(r0) {
                case 179142224: goto L56;
                case 179143184: goto L4b;
                case 179143185: goto L40;
                case 179143186: goto L35;
                case 179145107: goto L2a;
                case 179145109: goto L1f;
                case 376230990: goto L14;
                default: goto L13;
            }
        L13:
            goto L61
        L14:
            java.lang.String r0 = "WIDGET_FRONT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d
            goto L61
        L1d:
            r2 = 7
            goto L62
        L1f:
            java.lang.String r0 = "WIDGET_4X4"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L61
        L28:
            r2 = 6
            goto L62
        L2a:
            java.lang.String r0 = "WIDGET_4X2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto L61
        L33:
            r2 = 4
            goto L62
        L35:
            java.lang.String r0 = "WIDGET_2X3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3e
            goto L61
        L3e:
            r2 = 5
            goto L62
        L40:
            java.lang.String r0 = "WIDGET_2X2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L49
            goto L61
        L49:
            r2 = 3
            goto L62
        L4b:
            java.lang.String r0 = "WIDGET_2X1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L54
            goto L61
        L54:
            r2 = 2
            goto L62
        L56:
            java.lang.String r0 = "WIDGET_1X2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5f
            goto L61
        L5f:
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.WidgetPreviewAdapter.getItemViewType(int):int");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @oc
    public final void lvui(@InterfaceC7396q List<WidgetPreviewInfo> list) {
        d2ok.m23075h(list, "list");
        this.f9846q.clear();
        if (!kja0.qrj(list)) {
            this.f9846q.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter
    /* JADX INFO: renamed from: oc, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@InterfaceC7396q WidgetDetailPreviewHolder holder, int i2) {
        d2ok.m23075h(holder, "holder");
        Object obj = this.f9846q.get(i2);
        d2ok.kja0(obj, "get(...)");
        holder.o1t((WidgetPreviewInfo) obj, i2);
    }
}
