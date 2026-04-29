package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.BatchOperationAdapter.toq;
import miuix.miuixbasewidget.widget.MessageView;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class HeaderTipsViewHolder<T extends BatchOperationAdapter.toq> extends BatchOperationAdapter.BatchViewHolder<T> {

    /* JADX INFO: renamed from: s */
    private zy f12919s;

    /* JADX INFO: renamed from: y */
    private View f12920y;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder$k */
    class ViewOnClickListenerC2196k implements View.OnClickListener {
        ViewOnClickListenerC2196k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            HeaderTipsViewHolder.this.f12919s.x2();
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (HeaderTipsViewHolder.this.f12919s != null) {
                HeaderTipsViewHolder.this.f12919s.kja0();
            }
        }
    }

    public interface zy {
        void kja0();

        String n7h();

        void x2();
    }

    public HeaderTipsViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter, zy operation) {
        super(itemView, adapter);
        this.f12919s = operation;
        MessageView messageView = (MessageView) itemView.findViewById(R.id.alert_msg);
        if (messageView != null) {
            zy zyVar = this.f12919s;
            if (zyVar != null && !TextUtils.isEmpty(zyVar.n7h())) {
                messageView.setMessage(this.f12919s.n7h());
            }
            if (this.f12919s != null) {
                messageView.setOnClickListener(new ViewOnClickListenerC2196k());
            }
            if (messageView.getChildCount() > 1) {
                this.f12920y = messageView.getChildAt(1);
            }
        }
    }

    public static HeaderTipsViewHolder n5r1(ViewGroup parent, BatchOperationAdapter adapter, zy operation) {
        return new HeaderTipsViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_header_remote_purchased_resource, parent, false), adapter, operation);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: ncyb */
    public void o1t(T item, int position) {
        super.o1t(item, position);
        View view = this.f12920y;
        if (view != null) {
            view.setOnClickListener(new toq());
        }
    }
}
