package com.android.thememanager.basemodule.views.pad;

import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.pad.BasePadAdapter;
import com.android.thememanager.basemodule.views.pad.PadBatchOperationAdapter.BatchViewHolder;
import com.android.thememanager.basemodule.views.pad.PadBatchOperationAdapter.toq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miuix.view.InterfaceC7387s;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
public abstract class PadBatchOperationAdapter<T extends toq, E extends BatchViewHolder<T>> extends BasePadAdapter<T, E> {

    /* JADX INFO: renamed from: g */
    private Menu f10615g;

    /* JADX INFO: renamed from: n */
    private InterfaceC7387s f10616n;

    /* JADX INFO: renamed from: s */
    private ActionMode.Callback f10617s;

    /* JADX INFO: renamed from: y */
    private zy f10618y;

    public static abstract class BatchViewHolder<T extends toq> extends BasePadAdapter.ViewHolder<T> {

        /* JADX INFO: renamed from: g */
        @dd
        private CheckBox f10619g;

        public BatchViewHolder(@lvui View itemView, @lvui PadBatchOperationAdapter adapter) {
            super(itemView, adapter);
            this.f10619g = (CheckBox) itemView.findViewById(R.id.checkbox);
            itemView = oc() != null ? oc() : itemView;
            itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.basemodule.views.pad.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10623k.lvui(view);
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.android.thememanager.basemodule.views.pad.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f10621k.m7355r(view);
                }
            });
            CheckBox checkBox = this.f10619g;
            if (checkBox != null) {
                checkBox.setClickable(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void dd() {
            jk().uv6();
        }

        private PadBatchOperationAdapter jk() {
            return (PadBatchOperationAdapter) this.f10612k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lvui(View view) {
            ncyb();
        }

        private void ncyb() {
            if (!jk().ncyb()) {
                x9kr();
                return;
            }
            T tFu4 = fu4();
            if (!tFu4.m7360k(jk().f10615g)) {
                if (TextUtils.isEmpty(fu4().toq())) {
                    return;
                }
                nn86.toq(fu4().toq(), 0);
                return;
            }
            if (jk().m7353l(tFu4)) {
                jk().ek5k(tFu4);
            } else {
                jk().nn86(tFu4);
            }
            if (jk().x9kr() == 0) {
                m7358l();
                this.itemView.postDelayed(new Runnable() { // from class: com.android.thememanager.basemodule.views.pad.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10624k.dd();
                    }
                }, 300L);
            } else {
                m7358l();
                jk().yz();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public /* synthetic */ boolean m7355r(View view) {
            return jk().dd(fu4());
        }

        protected List<String> d2ok() {
            return null;
        }

        @Override // com.android.thememanager.basemodule.views.pad.BasePadAdapter.ViewHolder
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o1t(T item, int position) {
            super.o1t(item, position);
            m7358l();
        }

        /* JADX INFO: renamed from: l */
        protected void m7358l() {
            if (this.f10619g == null || !jk().d2ok()) {
                return;
            }
            T tFu4 = fu4();
            boolean z2 = jk().ncyb() && jk().m7353l(tFu4);
            this.f10619g.setVisibility(jk().ncyb() && tFu4.m7360k(jk().f10615g) ? 0 : 8);
            (oc() == null ? this.itemView : oc()).setSelected(z2);
            this.f10619g.setChecked(z2);
        }

        /* JADX INFO: renamed from: n */
        public void m7359n() {
            m7346z().fnq8(d2ok());
        }

        public void n5r1(boolean isVisible) {
        }

        protected View oc() {
            return this.itemView;
        }

        protected abstract void x9kr();

        public void zy() {
            m7346z().x9kr(d2ok());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.pad.PadBatchOperationAdapter$k */
    class ActionModeCallbackC1859k implements ActionMode.Callback {
        ActionModeCallbackC1859k() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == 16908313) {
                PadBatchOperationAdapter.this.uv6();
                return true;
            }
            if (item.getItemId() != 16908314) {
                PadBatchOperationAdapter padBatchOperationAdapter = PadBatchOperationAdapter.this;
                padBatchOperationAdapter.m7352f(item, padBatchOperationAdapter.fn3e().mo7368z().mo7365s());
                return true;
            }
            if (PadBatchOperationAdapter.this.n5r1()) {
                PadBatchOperationAdapter.this.m7348r();
            } else {
                for (int i2 = 0; i2 < PadBatchOperationAdapter.this.getItemCount(); i2++) {
                    toq toqVar = (toq) PadBatchOperationAdapter.this.f10611q.getItem(i2);
                    if (toqVar.m7360k(PadBatchOperationAdapter.this.f10615g)) {
                        PadBatchOperationAdapter.this.nn86(toqVar);
                    }
                }
            }
            PadBatchOperationAdapter.this.notifyDataSetChanged();
            PadBatchOperationAdapter.this.yz();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            PadBatchOperationAdapter.this.lvui(menu);
            PadBatchOperationAdapter.this.f10616n = (InterfaceC7387s) mode;
            PadBatchOperationAdapter.this.f10615g = menu;
            PadBatchOperationAdapter.this.yz();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            PadBatchOperationAdapter.this.f10616n = null;
            PadBatchOperationAdapter.this.f10615g = null;
            PadBatchOperationAdapter.this.uv6();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public boolean m7360k(Menu menu) {
            return true;
        }

        public String toq() {
            return null;
        }

        public abstract String zy();
    }

    public interface zy {
        void qrj();

        void zy();
    }

    public PadBatchOperationAdapter(@lvui InterfaceC1719p viewContainer) {
        super(viewContainer);
        this.f10617s = new ActionModeCallbackC1859k();
    }

    /* JADX INFO: renamed from: j */
    private void m7347j(boolean isSelectedAllItem) {
        this.f10611q.mo7368z().mo7363n(isSelectedAllItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n5r1() {
        return this.f10611q.mo7368z().zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m7348r() {
        this.f10611q.mo7368z().clear();
    }

    /* JADX INFO: renamed from: c */
    public void m7350c() {
        if (this.f10611q.mo7368z().toq()) {
            this.f10611q.mo7368z().mo7362k(false);
            Object obj = this.f10616n;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            zy zyVar = this.f10618y;
            if (zyVar != null) {
                zyVar.qrj();
            }
            m7348r();
        }
    }

    public boolean d2ok() {
        return true;
    }

    public boolean dd(toq batchItem) {
        if (!d2ok() || this.f10611q.mo7368z().toq()) {
            return false;
        }
        this.f10611q.mo7368z().mo7362k(true);
        nn86(batchItem);
        cdj().startActionMode(this.f10617s);
        zy zyVar = this.f10618y;
        if (zyVar != null) {
            zyVar.zy();
        }
        notifyDataSetChanged();
        return true;
    }

    @oc
    /* JADX INFO: renamed from: e */
    public void m7351e(Set<String> deletedItemIds) {
        Iterator<T> it = fn3e().toq().iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (deletedItemIds.contains(next.zy())) {
                notifyItemRemoved(fn3e().toq().indexOf(next));
                it.remove();
            }
        }
    }

    public void ek5k(toq batchItem) {
        this.f10611q.mo7368z().f7l8(batchItem.zy());
    }

    /* JADX INFO: renamed from: f */
    protected abstract void m7352f(MenuItem item, Set<String> checkedItemIds);

    public boolean hb() {
        if (!this.f10611q.mo7368z().toq() || this.f10616n != null) {
            return false;
        }
        cdj().startActionMode(this.f10617s);
        zy zyVar = this.f10618y;
        if (zyVar != null) {
            zyVar.zy();
        }
        yz();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7353l(toq batchItem) {
        return this.f10611q.mo7368z().mo7366y(batchItem.zy());
    }

    protected abstract void lvui(Menu menu);

    /* JADX INFO: renamed from: m */
    public void m7354m() {
        this.f10618y = null;
    }

    public boolean ncyb() {
        com.android.thememanager.basemodule.views.pad.zy<T> zyVar = this.f10611q;
        if (zyVar == null || zyVar.mo7368z() == null) {
            return false;
        }
        return this.f10611q.mo7368z().toq();
    }

    public void nn86(toq batchItem) {
        if (batchItem == null) {
            return;
        }
        this.f10611q.mo7368z().mo7361g(batchItem.zy());
    }

    public void uv6() {
        m7350c();
        notifyDataSetChanged();
    }

    public void vyq(zy longClickCallback) {
        this.f10618y = longClickCallback;
    }

    public int x9kr() {
        return this.f10611q.mo7368z().mo7364q();
    }

    public void yz() {
        int i2 = 0;
        for (int i3 = 0; i3 < getItemCount(); i3++) {
            if (this.f10611q.getItem(i3).m7360k(this.f10615g)) {
                i2++;
            }
        }
        if (o1t.f10386q) {
            this.f10616n.cdj(16908313, "", R.drawable.action_title_cancel);
        }
        m7347j(x9kr() == i2);
        C1819o.m7157j(this.f10616n, n5r1(), ki());
        ((ActionMode) this.f10616n).setTitle(String.format(ki().getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(x9kr())));
    }
}
