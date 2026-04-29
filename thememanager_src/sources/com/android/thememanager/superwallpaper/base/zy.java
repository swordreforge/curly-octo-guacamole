package com.android.thememanager.superwallpaper.base;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.util.C2800o;
import zy.hyr;

/* JADX INFO: compiled from: BasePositionListViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.fti {

    /* JADX INFO: renamed from: g */
    private ImageView f16134g;

    /* JADX INFO: renamed from: k */
    protected AbstractC2721k f16135k;

    /* JADX INFO: renamed from: n */
    private View f16136n;

    /* JADX INFO: renamed from: q */
    protected ImageView f16137q;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.zy$k */
    /* JADX INFO: compiled from: BasePositionListViewHolder.java */
    class ViewOnTouchListenerC2727k implements View.OnTouchListener {
        ViewOnTouchListenerC2727k() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v2, MotionEvent event) {
            C2800o.fu4(zy.this.f16136n, event);
            return false;
        }
    }

    public zy(AbstractC2721k adapter, View itemView) {
        super(itemView);
        this.f16136n = itemView.findViewById(R.id.root);
        this.f16137q = (ImageView) itemView.findViewById(R.id.land_img);
        this.f16134g = (ImageView) itemView.findViewById(R.id.background);
        this.f16135k = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ni7(vep5.toq toqVar, View view) {
        this.f16135k.fu4(toqVar.m28105g());
    }

    @hyr(api = 23)
    public void fu4(final vep5.toq data, int position) {
        if (position == 0) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams instanceof RecyclerView.cdj) {
                RecyclerView.cdj cdjVar = (RecyclerView.cdj) layoutParams;
                ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin = (int) this.itemView.getResources().getDimension(R.dimen.f8610x900cde96);
                this.itemView.setLayoutParams(cdjVar);
            }
        }
        if (data.m28105g() == this.f16135k.ki()) {
            this.f16134g.setVisibility(0);
        } else {
            this.f16134g.setVisibility(8);
        }
        this.f16136n.setContentDescription(data.m28110p());
        this.f16136n.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.superwallpaper.base.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16131k.ni7(data, view);
            }
        });
        this.f16136n.setOnTouchListener(new ViewOnTouchListenerC2727k());
    }
}
