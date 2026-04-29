package com.android.thememanager.basemodule.views;

import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder;
import com.android.thememanager.basemodule.views.BatchOperationAdapter.toq;
import com.android.thememanager.recommend.view.listview.RecommendVMListView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import miuix.view.InterfaceC7387s;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
public abstract class BatchOperationAdapter<T extends toq, E extends BatchViewHolder<T>> extends BaseThemeAdapter<T, E> {

    /* JADX INFO: renamed from: g */
    private InterfaceC7387s f10529g;

    /* JADX INFO: renamed from: h */
    private boolean f10530h;

    /* JADX INFO: renamed from: i */
    private zy f10531i;

    /* JADX INFO: renamed from: p */
    private Set<String> f10532p;

    /* JADX INFO: renamed from: r */
    private ActionMode.Callback f10533r;

    /* JADX INFO: renamed from: s */
    private boolean f10534s;

    /* JADX INFO: renamed from: t */
    private final int f10535t;

    /* JADX INFO: renamed from: y */
    private Menu f10536y;

    /* JADX INFO: renamed from: z */
    private int f10537z;

    public static abstract class BatchViewHolder<T extends toq> extends BaseThemeAdapter.ViewHolder<T> {

        /* JADX INFO: renamed from: g */
        @dd
        private CheckBox f10538g;

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.BatchOperationAdapter$BatchViewHolder$k */
        class ViewOnClickListenerC1842k implements View.OnClickListener {
            ViewOnClickListenerC1842k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                BatchViewHolder.this.m7313r();
            }
        }

        class toq implements View.OnLongClickListener {
            toq() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View v2) {
                return BatchViewHolder.this.jk().mo7310e((toq) BatchViewHolder.this.fu4());
            }
        }

        public BatchViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
            super(itemView, adapter);
            this.f10538g = (CheckBox) itemView.findViewById(R.id.checkbox);
            itemView = oc() != null ? oc() : itemView;
            itemView.setOnClickListener(new ViewOnClickListenerC1842k());
            itemView.setOnLongClickListener(new toq());
            CheckBox checkBox = this.f10538g;
            if (checkBox != null) {
                checkBox.setClickable(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d2ok() {
            jk().i1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public void m7313r() {
            if (!jk().m7312m()) {
                lvui();
                return;
            }
            T tFu4 = fu4();
            if (!tFu4.canChecked(jk().f10536y)) {
                if (TextUtils.isEmpty(fu4().cantCheckReason())) {
                    return;
                }
                nn86.toq(fu4().cantCheckReason(), 0);
                return;
            }
            if (jk().ek5k(tFu4)) {
                jk().lv5(tFu4);
            } else {
                jk().zp(tFu4);
            }
            if (jk().nn86() == 0) {
                dd();
                this.itemView.postDelayed(new Runnable() { // from class: com.android.thememanager.basemodule.views.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10625k.d2ok();
                    }
                }, 300L);
            } else {
                dd();
                jk().t8iq();
            }
        }

        protected void dd() {
            if (this.f10538g == null || !jk().mo7309c()) {
                return;
            }
            T tFu4 = fu4();
            boolean z2 = jk().m7312m() && jk().ek5k(tFu4);
            this.f10538g.setVisibility(jk().m7312m() && tFu4.canChecked(jk().f10536y) ? 0 : 8);
            this.f10538g.setChecked(z2);
        }

        protected BatchOperationAdapter jk() {
            return (BatchOperationAdapter) this.f9847k;
        }

        protected abstract void lvui();

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
        public void o1t(T item, int position) {
            super.o1t(item, position);
            dd();
        }

        protected View oc() {
            return this.itemView;
        }

        public void x9kr(boolean isVisible) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.BatchOperationAdapter$k */
    class ActionModeCallbackC1843k implements ActionMode.Callback {
        ActionModeCallbackC1843k() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == 16908313) {
                BatchOperationAdapter.this.i1();
                return true;
            }
            if (item.getItemId() != 16908314) {
                BatchOperationAdapter batchOperationAdapter = BatchOperationAdapter.this;
                batchOperationAdapter.y9n(item, batchOperationAdapter.f10532p);
                return true;
            }
            if (BatchOperationAdapter.this.yz()) {
                BatchOperationAdapter.this.vyq();
            } else {
                for (int i2 = 0; i2 < BatchOperationAdapter.this.getItemCount(); i2++) {
                    toq toqVar = (toq) BatchOperationAdapter.this.ni7().get(i2);
                    if (toqVar.canChecked(BatchOperationAdapter.this.f10536y)) {
                        BatchOperationAdapter.this.zp(toqVar);
                    }
                }
            }
            BatchOperationAdapter.this.notifyDataSetChanged();
            BatchOperationAdapter.this.t8iq();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            BatchOperationAdapter.this.uv6(menu);
            BatchOperationAdapter.this.f10529g = (InterfaceC7387s) mode;
            BatchOperationAdapter.this.f10536y = menu;
            BatchOperationAdapter.this.t8iq();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            BatchOperationAdapter.this.f10529g = null;
            BatchOperationAdapter.this.f10536y = null;
            BatchOperationAdapter.this.i1();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    public static abstract class toq {
        public boolean canChecked(Menu menu) {
            return true;
        }

        protected String cantCheckReason() {
            return null;
        }

        public abstract String getId();
    }

    public interface zy {
        void qrj();

        void zy();
    }

    public BatchOperationAdapter(@lvui InterfaceC1719p viewContainer) {
        super(viewContainer);
        this.f10532p = new HashSet();
        this.f10533r = new ActionModeCallbackC1843k();
        this.f10535t = RecommendVMListView.qrj(3, R.dimen.rc_large_icon_image_padding, R.dimen.rc_large_icon_image_padding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ek5k(toq batchItem) {
        return this.f10532p.contains(batchItem.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv5(toq batchItem) {
        this.f10532p.remove(batchItem.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nn86() {
        return this.f10532p.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vyq() {
        this.f10532p.clear();
    }

    /* JADX INFO: renamed from: x */
    private void m7307x(boolean isSelectedAllItem) {
        this.f10530h = isSelectedAllItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yz() {
        return this.f10530h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(toq batchItem) {
        if (batchItem == null) {
            return;
        }
        this.f10532p.add(batchItem.getId());
    }

    @oc
    /* JADX INFO: renamed from: a */
    public void mo7308a(Set<String> deletedItemIds) {
        Iterator<T> it = this.f9846q.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (deletedItemIds.contains(next.getId())) {
                notifyItemRemoved(this.f9846q.indexOf(next));
                it.remove();
            }
        }
    }

    public void a98o(zy longClickCallback) {
        this.f10531i = longClickCallback;
    }

    public void bf2() {
        if (this.f10534s) {
            this.f10534s = false;
            Object obj = this.f10529g;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            vyq();
            zy zyVar = this.f10531i;
            if (zyVar != null) {
                zyVar.qrj();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo7309c() {
        return true;
    }

    public void ch(int width) {
        this.f10537z = width;
    }

    /* JADX INFO: renamed from: e */
    protected boolean mo7310e(toq batchItem) {
        if (!mo7309c() || this.f10534s) {
            return false;
        }
        this.f10534s = true;
        zp(batchItem);
        ki().startActionMode(this.f10533r);
        zy zyVar = this.f10531i;
        if (zyVar != null) {
            zyVar.zy();
        }
        notifyDataSetChanged();
        return true;
    }

    public int hb() {
        return this.f10537z;
    }

    public void i1() {
        bf2();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: j */
    public int m7311j() {
        return this.f10535t;
    }

    /* JADX INFO: renamed from: m */
    public boolean m7312m() {
        return this.f10534s;
    }

    public void nmn5() {
        this.f10531i = null;
    }

    protected void t8iq() {
        int i2 = 0;
        for (int i3 = 0; i3 < getItemCount(); i3++) {
            if (ni7().get(i3).canChecked(this.f10536y)) {
                i2++;
            }
        }
        if (o1t.f10386q) {
            this.f10529g.cdj(16908313, "", R.drawable.action_title_cancel);
            C1812k.m7106k((Button) ki().findViewById(16908313), android.R.string.cancel);
        }
        m7307x(nn86() == i2);
        C1819o.m7157j(this.f10529g, yz(), fn3e());
        C1812k.m7106k((Button) ki().findViewById(16908314), android.R.string.selectAll);
        ((ActionMode) this.f10529g).setTitle(String.format(fn3e().getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(nn86())));
    }

    protected abstract void uv6(Menu menu);

    protected abstract void y9n(MenuItem item, Set<String> checkedItemIds);
}
