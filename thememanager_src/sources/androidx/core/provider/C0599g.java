package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.n7h;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.List;
import zy.InterfaceC7837n;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.provider.g */
/* JADX INFO: compiled from: FontRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0599g {

    /* JADX INFO: renamed from: g */
    private final String f3735g;

    /* JADX INFO: renamed from: k */
    private final String f3736k;

    /* JADX INFO: renamed from: n */
    private final int f3737n;

    /* JADX INFO: renamed from: q */
    private final List<List<byte[]>> f3738q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f50555toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f50556zy;

    public C0599g(@lvui String str, @lvui String str2, @lvui String str3, @lvui List<List<byte[]>> list) {
        this.f3736k = (String) n7h.x2(str);
        this.f50555toq = (String) n7h.x2(str2);
        this.f50556zy = (String) n7h.x2(str3);
        this.f3738q = (List) n7h.x2(list);
        this.f3737n = 0;
        this.f3735g = m2793k(str, str2, str3);
    }

    /* JADX INFO: renamed from: k */
    private String m2793k(@lvui String str, @lvui String str2, @lvui String str3) {
        return str + C5658n.f73185t8r + str2 + C5658n.f73185t8r + str3;
    }

    @lvui
    public String f7l8() {
        return this.f50555toq;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public String m2794g() {
        return this.f3736k;
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public String m2795n() {
        return this.f3735g;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: q */
    String m2796q() {
        return this.f3735g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3736k + ", mProviderPackage: " + this.f50555toq + ", mQuery: " + this.f50556zy + ", mCertificates:");
        for (int i2 = 0; i2 < this.f3738q.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f3738q.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3737n);
        return sb.toString();
    }

    @dd
    public List<List<byte[]>> toq() {
        return this.f3738q;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public String m2797y() {
        return this.f50556zy;
    }

    @InterfaceC7837n
    public int zy() {
        return this.f3737n;
    }

    public C0599g(@lvui String str, @lvui String str2, @lvui String str3, @InterfaceC7837n int i2) {
        this.f3736k = (String) n7h.x2(str);
        this.f50555toq = (String) n7h.x2(str2);
        this.f50556zy = (String) n7h.x2(str3);
        this.f3738q = null;
        n7h.m2975k(i2 != 0);
        this.f3737n = i2;
        this.f3735g = m2793k(str, str2, str3);
    }
}
