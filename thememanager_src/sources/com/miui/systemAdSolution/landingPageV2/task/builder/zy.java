package com.miui.systemAdSolution.landingPageV2.task.builder;

import com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import com.miui.systemAdSolution.landingPageV2.task.action.DownloadAction;
import org.json.JSONObject;

/* JADX INFO: compiled from: DownloadActionBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends AbstractC5339k<IDownloadListener> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f72496f7l8;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private DownloadAction.toq f72497ld6;

    /* JADX INFO: renamed from: p */
    private boolean f29833p;

    /* JADX INFO: renamed from: s */
    private boolean f29834s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private DownloadAction.C5337k f72498x2;

    /* JADX INFO: renamed from: y */
    private int f29835y;

    /* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.builder.zy$k */
    /* JADX INFO: compiled from: DownloadActionBuilder.java */
    public class C5341k extends JSONObject {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f72499f7l8 = "size";

        /* JADX INFO: renamed from: g */
        private static final String f29836g = "summary";

        /* JADX INFO: renamed from: n */
        private static final String f29837n = "title";

        /* JADX INFO: renamed from: q */
        private static final String f29838q = "iconUrl";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String f72500toq = "DownloadInfoBuilder";

        /* JADX INFO: renamed from: y */
        private static final String f29839y = "category";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f72501zy = "downloadUrl";

        public C5341k() {
        }

        public C5341k f7l8(String str) {
            try {
                put("title", str);
            } catch (Exception unused) {
            }
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C5341k m18180g(String str) {
            try {
                put("summary", str);
            } catch (Exception unused) {
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public DownloadAction.C5337k m18181k() {
            return (DownloadAction.C5337k) com.xiaomi.ad.entity.util.zy.zy(DownloadAction.C5337k.class, toString(), f72500toq);
        }

        /* JADX INFO: renamed from: n */
        public C5341k m18182n(long j2) {
            try {
                put("size", j2);
            } catch (Exception unused) {
            }
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C5341k m18183q(String str) {
            try {
                put("iconUrl", str);
            } catch (Exception unused) {
            }
            return this;
        }

        public C5341k toq(String str) {
            try {
                put("category", str);
            } catch (Exception unused) {
            }
            return this;
        }

        public C5341k zy(String str) {
            try {
                put("downloadUrl", str);
            } catch (Exception unused) {
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: DownloadActionBuilder.java */
    public class toq extends JSONObject {

        /* JADX INFO: renamed from: q */
        private static final String f29841q = "dismissWhenDownloadStart";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String f72502toq = "MiniCardConfigBuilder";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f72503zy = "canCancel";

        public toq() {
        }

        /* JADX INFO: renamed from: k */
        public DownloadAction.toq m18184k() {
            if (!has(f72503zy)) {
                zy(true);
            }
            if (!has("dismissWhenDownloadStart")) {
                toq(false);
            }
            return (DownloadAction.toq) com.xiaomi.ad.entity.util.zy.zy(DownloadAction.toq.class, toString(), f72502toq);
        }

        public toq toq(boolean z2) {
            try {
                put("dismissWhenDownloadStart", z2);
            } catch (Exception unused) {
            }
            return this;
        }

        public toq zy(boolean z2) {
            try {
                put(f72503zy, z2);
            } catch (Exception unused) {
            }
            return this;
        }
    }

    public zy f7l8(boolean z2) {
        this.f29834s = z2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public zy m18176g(int i2) {
        this.f29835y = i2;
        return this;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.builder.AbstractC5339k
    /* JADX INFO: renamed from: k */
    public Action mo18170k() {
        return new DownloadAction(this.f29831k, (IDownloadListener) this.f72493zy, this.f72492toq, this.f72496f7l8, this.f29835y, this.f29834s, this.f29833p, this.f72497ld6, this.f72498x2);
    }

    /* JADX INFO: renamed from: n */
    public zy m18177n(DownloadAction.C5337k c5337k) {
        this.f72498x2 = c5337k;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public zy m18178s(String str) {
        this.f72496f7l8 = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public zy m18179y(DownloadAction.toq toqVar) {
        this.f72497ld6 = toqVar;
        return this;
    }
}
