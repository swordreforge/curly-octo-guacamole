package ix;

import android.text.TextUtils;

/* JADX INFO: renamed from: ix.k */
/* JADX INFO: compiled from: PassportCAToken.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6099k {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static C6099k f80335zy = new C6099k("", "");

    /* JADX INFO: renamed from: k */
    public final String f35787k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f80336toq;

    public C6099k(String str, String str2) {
        this.f35787k = str;
        this.f80336toq = str2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m22382k() {
        return (TextUtils.isEmpty(this.f35787k) || TextUtils.isEmpty(this.f80336toq)) ? false : true;
    }
}
