package com.android.thememanager;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.thememanager.activity.bap7;
import com.android.thememanager.activity.bz2;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import java.util.Iterator;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: FragmentBuildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj implements InterfaceC1357q, InterfaceC1925p {

    /* JADX INFO: renamed from: com.android.thememanager.qrj$k */
    /* JADX INFO: compiled from: FragmentBuildHelper.java */
    public static class C2321k {

        /* JADX INFO: renamed from: k */
        public String f13525k;

        /* JADX INFO: renamed from: n */
        public Fragment f13526n;

        /* JADX INFO: renamed from: q */
        public boolean f13527q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Class<? extends Fragment> f60623toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Bundle f60624zy;

        public C2321k(String tag, Class<? extends Fragment> clazz, Bundle args) {
            this(tag, clazz, args, false);
        }

        public C2321k(String tag, Class<? extends Fragment> clazz, Bundle args, boolean hasActionMenu) {
            this.f13525k = tag;
            this.f60623toq = clazz;
            this.f60624zy = args;
            this.f13527q = hasActionMenu;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C2321k m8495k(Intent intent, fu4 context, PageGroup group) {
        Iterator<Page> it = group.getPages().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key != null && key.endsWith(InterfaceC1925p.rax)) {
                group.setResourceCode(p001b.toq.m5744q(key.substring(0, key.length() - 5)));
                return m8497q(context, group);
            }
        }
        Bundle bundle = new Bundle();
        if (intent.hasExtra(InterfaceC1357q.f53922nn86)) {
            bundle.putInt(InterfaceC1357q.f53922nn86, intent.getIntExtra(InterfaceC1357q.f53922nn86, 0));
        }
        if (intent.hasExtra(InterfaceC1357q.f53873fu4)) {
            bundle.putInt(InterfaceC1357q.f53873fu4, intent.getIntExtra(InterfaceC1357q.f53873fu4, 1));
        }
        if (intent.hasExtra(InterfaceC1357q.f53955vyq)) {
            bundle.putInt(InterfaceC1357q.f53955vyq, intent.getIntExtra(InterfaceC1357q.f53955vyq, 0));
        }
        if (intent.hasExtra(InterfaceC1357q.f53883hb)) {
            bundle.putBoolean(InterfaceC1357q.f53883hb, intent.getBooleanExtra(InterfaceC1357q.f53883hb, false));
        }
        if (intent.hasExtra(InterfaceC1357q.f53966y9n)) {
            bundle.putSerializable(InterfaceC1357q.f53966y9n, intent.getSerializableExtra(InterfaceC1357q.f53966y9n));
        }
        if (intent.hasExtra(InterfaceC1357q.f53911mbx)) {
            bundle.putString(InterfaceC1357q.f53911mbx, intent.getStringExtra(InterfaceC1357q.f53911mbx));
        }
        int intExtra = intent.getIntExtra(InterfaceC1357q.f53949uv6, 0);
        if (group.getPageGroupType() == 1) {
            intExtra = 4;
        }
        return toq(group, zy(intExtra), false, bundle);
    }

    /* JADX INFO: renamed from: n */
    protected static Class<? extends Fragment> m8496n() {
        return bz2.class;
    }

    /* JADX INFO: renamed from: q */
    protected static C2321k m8497q(fu4 context, PageGroup group) {
        return toq(group, m8496n(), InterfaceC1789q.gx2z.equals(context.getResourceCode()), new Bundle());
    }

    protected static C2321k toq(PageGroup group, Class<? extends Fragment> clazz, boolean hasActionMenu, Bundle info) {
        if (info == null) {
            info = new Bundle();
        }
        info.putSerializable(InterfaceC1357q.f53848bf2, group);
        return new C2321k(group.getTitle(), clazz, info, hasActionMenu);
    }

    protected static Class<? extends Fragment> zy(int fragmentType) {
        return bap7.m6389k(fragmentType);
    }
}
