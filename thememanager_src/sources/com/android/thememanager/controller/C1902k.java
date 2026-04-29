package com.android.thememanager.controller;

import android.content.SharedPreferences;
import android.media.ExtraRingtone;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.ch;
import java.util.ArrayList;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.controller.k */
/* JADX INFO: compiled from: AudioDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1902k extends C1950s implements InterfaceC1357q, InterfaceC1789q {
    public static final String ac = "ringtone_default_local_id";
    public static final String ad = "ringtone_group_title_id";
    private static final String am = "ringtone_extra_local_id_";
    private static final String[] ax = {com.android.thememanager.basemodule.resource.constants.toq.pm14, ".ogg"};
    public static final String bq = "ringtone_silent_local_id";
    private SharedPreferences as;
    private volatile boolean az;
    private Object ba;
    private SharedPreferences.Editor bg;

    public C1902k(fu4 context) {
        super(context);
        this.ba = new Object();
    }

    private String cfr(String fileName) {
        if (!TextUtils.isEmpty(fileName)) {
            String lowerCase = fileName.toLowerCase();
            for (String str : ax) {
                if (lowerCase.endsWith(str)) {
                    return fileName.substring(0, lowerCase.lastIndexOf(str));
                }
            }
        }
        return fileName;
    }

    private void etdu() {
        if (this.az) {
            return;
        }
        synchronized (this.ba) {
            if (!this.az) {
                SharedPreferences sharedPreferences = C2082k.zy().toq().getSharedPreferences("audio_duration", 0);
                this.as = sharedPreferences;
                this.bg = sharedPreferences.edit();
                this.az = true;
            }
        }
    }

    private Resource g1() {
        Resource resource = new Resource();
        resource.getLocalInfo().setTitle(bf2.toq.toq().getString(R.string.resource_default));
        resource.setMetaPath(InterfaceC1789q.s4y);
        resource.setContentPath(InterfaceC1789q.s4y);
        resource.setLocalId(ac);
        return resource;
    }

    private long gbni(Resource resource) {
        long jA9;
        String extraMeta = resource.getLocalInfo().getExtraMeta("duration");
        if (extraMeta != null) {
            try {
                jA9 = Long.parseLong(extraMeta);
            } catch (NumberFormatException unused) {
                jA9 = -1;
            }
        } else {
            jA9 = -1;
        }
        if (jA9 == -1) {
            String contentPath = new ResourceResolver(resource, this.f11062k).getContentPath();
            jA9 = zsr0().getLong(contentPath, -1L);
            if (jA9 == -1) {
                jA9 = ch.a9(contentPath);
                SharedPreferences.Editor editorPy = py();
                editorPy.putLong(contentPath, jA9);
                editorPy.apply();
            }
            if (jA9 == 0) {
                jA9 = 1;
            }
            resource.getLocalInfo().putExtraMeta("duration", String.valueOf(jA9));
        }
        return jA9;
    }

    private List<Resource> i9jn() {
        List<fu4.C2043k> extraRingtoneInfo = this.f11062k.getExtraRingtoneInfo();
        int size = extraRingtoneInfo.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            fu4.C2043k c2043k = extraRingtoneInfo.get(i2);
            Resource resource = new Resource();
            String str = am + i2;
            resource.setMetaPath(c2043k.path);
            resource.setContentPath(c2043k.path);
            resource.setLocalId(str);
            resource.getLocalInfo().setTitle(c2043k.title);
            resource.setCanNotPlay(c2043k.canNotPlay);
            arrayList.add(resource);
        }
        return arrayList;
    }

    private Resource ltg8() {
        Resource resource = new Resource();
        resource.setMetaPath("");
        resource.setContentPath("");
        resource.setLocalId(bq);
        resource.getLocalInfo().setTitle(C2082k.zy().toq().getString(R.string.resource_mute));
        resource.setCanNotPlay(true);
        return resource;
    }

    private int m4(int ringtoneType) {
        return ringtoneType != 1 ? ringtoneType != 2 ? ringtoneType != 4 ? R.string.resource_default : R.string.resource_alarm_default : R.string.resource_notification_default : R.string.resource_ringtone_default;
    }

    private SharedPreferences.Editor py() {
        etdu();
        return this.bg;
    }

    public static Resource r8s8(String groupTitle) {
        Resource resource = new Resource();
        resource.setLocalId(ad);
        resource.getLocalInfo().setTitle(groupTitle);
        return resource;
    }

    public static boolean sok(String id) {
        return !TextUtils.isEmpty(id) && id.startsWith(am);
    }

    private Uri v0af(int ringtoneType) {
        if (ringtoneType == 1) {
            return Settings.System.DEFAULT_RINGTONE_URI;
        }
        if (ringtoneType == 2) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        if (ringtoneType != 4) {
            return null;
        }
        return Settings.System.DEFAULT_ALARM_ALERT_URI;
    }

    private Resource was() {
        ThemeApplication qVar = C2082k.zy().toq();
        Resource resource = new Resource();
        String str = (String) this.f11062k.getExtraMeta("android.intent.extra.ringtone.DEFAULT_URI");
        int iIntValue = ((Integer) this.f11062k.getExtraMeta("android.intent.extra.ringtone.TYPE")).intValue();
        Uri uriV0af = TextUtils.isEmpty(str) ? v0af(iIntValue) : Uri.parse(str);
        if (uriV0af == null) {
            return null;
        }
        resource.setMetaPath(uriV0af.toString());
        resource.setContentPath(uriV0af.toString());
        resource.setLocalId(ac);
        String strCfr = cfr(ExtraRingtone.getRingtoneTitle(qVar, uriV0af, false));
        int iM4 = m4(iIntValue);
        resource.getLocalInfo().setTitle(TextUtils.isEmpty(strCfr) ? qVar.getResources().getString(iM4) : String.format("%s (%s)", qVar.getResources().getString(iM4), strCfr));
        return resource;
    }

    private SharedPreferences zsr0() {
        etdu();
        return this.as;
    }

    @Override // com.android.thememanager.controller.C1950s
    protected boolean t8iq(Resource resource) {
        return super.t8iq(resource) && gbni(resource) >= 0;
    }

    @Override // com.android.thememanager.controller.C1950s
    /* JADX INFO: renamed from: v */
    protected void mo7472v() {
        Resource resourceWas;
        super.mo7472v();
        if (this.f11062k.isPicker() && this.f11062k.getExtraRingtoneInfo() != null && !this.f11062k.getExtraRingtoneInfo().isEmpty()) {
            List<Resource> listI9jn = i9jn();
            this.f11078n.addAll(0, listI9jn);
            this.f11086y.addAll(0, listI9jn);
        }
        if (this.f11062k.isPicker() && ((Boolean) this.f11062k.getExtraMeta("android.intent.extra.ringtone.SHOW_DEFAULT")).booleanValue() && (resourceWas = was()) != null) {
            this.f11078n.add(0, resourceWas);
            this.f11086y.add(0, resourceWas);
        }
        if (!this.f11062k.isPicker() || ((Boolean) this.f11062k.getExtraMeta("android.intent.extra.ringtone.SHOW_SILENT")).booleanValue()) {
            Resource resourceLtg8 = ltg8();
            if (resourceLtg8 != null) {
                this.f11078n.add(0, resourceLtg8);
                this.f11086y.add(0, resourceLtg8);
            }
            if ("bootaudio".equals(this.f11062k.getResourceCode()) && C1792n.jk()) {
                Resource resourceG1 = g1();
                this.f11078n.add(1, resourceG1);
                this.f11086y.add(1, resourceG1);
            }
        }
    }

    public void w831() {
        if (this.f11062k.isPicker() && ((Boolean) this.f11062k.getExtraMeta("android.intent.extra.ringtone.SHOW_DEFAULT")).booleanValue()) {
            for (Resource resource : this.f11086y) {
                if (ac.equals(resource.getLocalId())) {
                    resource.updateFrom(was());
                }
            }
        }
    }
}
