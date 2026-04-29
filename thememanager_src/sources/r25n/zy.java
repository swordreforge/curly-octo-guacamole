package r25n;

import com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;

/* JADX INFO: compiled from: DownloadSetting.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: g */
    private int f44121g = 3;

    /* JADX INFO: renamed from: k */
    private String f44122k;

    /* JADX INFO: renamed from: n */
    private boolean f44123n;

    /* JADX INFO: renamed from: q */
    private boolean f44124q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Action.C5336k f94670toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private IDownloadListener f94671zy;

    public zy(String str) {
        this.f44122k = str;
    }

    public zy f7l8(int i2) {
        this.f44121g = i2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public Action.C5336k m27935g() {
        return this.f94670toq;
    }

    /* JADX INFO: renamed from: k */
    public int m27936k() {
        return this.f44121g;
    }

    public void ld6(String str) {
        this.f44122k = str;
    }

    /* JADX INFO: renamed from: n */
    public String m27937n() {
        return this.f44122k;
    }

    /* JADX INFO: renamed from: p */
    public zy m27938p(IDownloadListener iDownloadListener) {
        this.f94671zy = iDownloadListener;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public IDownloadListener m27939q() {
        return this.f94671zy;
    }

    /* JADX INFO: renamed from: s */
    public zy m27940s(boolean z2) {
        this.f44123n = z2;
        return this;
    }

    public boolean toq() {
        return this.f44124q;
    }

    public zy x2(Action.C5336k c5336k) {
        this.f94670toq = c5336k;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public zy m27941y(boolean z2) {
        this.f44124q = z2;
        return this;
    }

    public boolean zy() {
        return this.f44123n;
    }
}
