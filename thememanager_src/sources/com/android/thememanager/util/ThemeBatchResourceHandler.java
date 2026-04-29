package com.android.thememanager.util;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.android.thememanager.R;
import com.android.thememanager.activity.nsb;
import com.android.thememanager.activity.pc;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.util.t8r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeBatchResourceHandler extends BatchResourceHandler {

    /* JADX INFO: renamed from: com.android.thememanager.util.ThemeBatchResourceHandler$k */
    class C2754k implements AbstractC1918k.k<Boolean> {

        /* JADX INFO: renamed from: com.android.thememanager.util.ThemeBatchResourceHandler$k$k */
        class k implements t8r.zy {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ List f16305k;

            k(final List val$rs) {
                this.f16305k = val$rs;
            }

            @Override // com.android.thememanager.util.t8r.zy
            /* JADX INFO: renamed from: k */
            public void mo9559k(Resource r2) {
                this.f16305k.add(r2);
            }
        }

        C2754k() {
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        /* JADX INFO: renamed from: k */
        public void mo6418k() {
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void zy(Boolean result) {
            if (result.booleanValue()) {
                ThemeBatchResourceHandler.this.wvg();
            }
            ThemeBatchResourceHandler.this.mo9372s();
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        public Resource[] toq() {
            ArrayList arrayList = new ArrayList();
            ThemeBatchResourceHandler.this.mo9553n(new k(arrayList));
            return (Resource[]) arrayList.toArray(new Resource[arrayList.size()]);
        }
    }

    public ThemeBatchResourceHandler(nsb fragment, pc adapter, com.android.thememanager.fu4 resContext) {
        super(fragment, adapter, resContext);
    }

    protected void dd() {
        if (C1915g.m7550n()) {
            com.android.thememanager.controller.online.o1t.zy().m7604n(false, this.f16230n, this.f16233s, new C2754k());
        } else {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
        }
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected boolean ld6() {
        return (!this.f16233s.isPicker() && this.f16234t) || (this.f16229l & 4) != 0;
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected boolean o1t(ActionMode mode, MenuItem item) {
        if (item.getItemId() != R.string.theme_favorite_delete) {
            return super.o1t(mode, item);
        }
        dd();
        return true;
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected void x2(Menu menu, int actionFlag) {
        for (int i2 = 0; i2 < 3; i2++) {
            if (((1 << i2) & actionFlag) != 0) {
                int i3 = qkj8.f16722p[i2];
                menu.add(0, i3, 0, i3).setIcon(qkj8.f61394ld6[i2]);
            }
        }
    }
}
