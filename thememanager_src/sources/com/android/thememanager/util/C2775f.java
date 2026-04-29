package com.android.thememanager.util;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.thememanager.util.C2763c;
import java.io.File;

/* JADX INFO: renamed from: com.android.thememanager.util.f */
/* JADX INFO: compiled from: ImageJobInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2775f {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public C2763c.k f61233f7l8;

    /* JADX INFO: renamed from: g */
    public boolean f16416g;

    /* JADX INFO: renamed from: k */
    private boolean f16417k;

    /* JADX INFO: renamed from: n */
    public int f16418n;

    /* JADX INFO: renamed from: q */
    public int f16419q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f61234toq;

    /* JADX INFO: renamed from: y */
    public Bitmap f16420y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f61235zy;

    public C2775f(String localPath, String onlinePath) {
        this.f61234toq = localPath;
        this.f61235zy = onlinePath;
    }

    public static void zy(String path) {
        File file = new File(path);
        if (!file.exists() || file.length() >= 1024) {
            return;
        }
        file.delete();
    }

    public boolean f7l8(C2775f o2) {
        return o2 != null && TextUtils.equals(this.f61234toq, o2.f61234toq) && TextUtils.equals(this.f61235zy, o2.f61235zy);
    }

    /* JADX INFO: renamed from: g */
    public String m9713g() {
        return m9717q() + " / " + m9715n();
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2775f clone() {
        return new C2775f(this);
    }

    /* JADX INFO: renamed from: n */
    public String m9715n() {
        return this.f61235zy;
    }

    /* JADX INFO: renamed from: p */
    boolean m9716p() {
        return this.f61234toq != null && (this.f16417k || this.f61235zy != null);
    }

    /* JADX INFO: renamed from: q */
    public String m9717q() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61234toq);
        if (this.f16416g) {
            str = "(" + this.f16419q + "," + this.f16418n + ")";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public boolean m9718s() {
        return this.f16417k;
    }

    public String toString() {
        return m9713g();
    }

    public boolean toq() {
        String str = this.f61234toq;
        if (str == null) {
            return false;
        }
        zy(str);
        return new File(this.f61234toq).exists();
    }

    /* JADX INFO: renamed from: y */
    void m9719y() {
        this.f16417k = toq();
    }

    public C2775f(C2775f other) {
        this.f16417k = other.f16417k;
        this.f61234toq = other.f61234toq;
        this.f61235zy = other.f61235zy;
        this.f16419q = other.f16419q;
        this.f16418n = other.f16418n;
        this.f16416g = other.f16416g;
        C2763c.k kVar = other.f61233f7l8;
        this.f61233f7l8 = kVar != null ? new C2763c.k(kVar) : null;
        this.f16420y = other.f16420y;
    }
}
