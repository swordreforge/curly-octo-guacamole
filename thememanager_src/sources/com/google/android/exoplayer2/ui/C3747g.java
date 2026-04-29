package com.google.android.exoplayer2.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.ui.kja0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.g */
/* JADX INFO: compiled from: DefaultMediaDescriptionAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3747g implements kja0.InterfaceC3754n {

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final PendingIntent f22613k;

    public C3747g(@zy.dd PendingIntent pendingIntent) {
        this.f22613k = pendingIntent;
    }

    @Override // com.google.android.exoplayer2.ui.kja0.InterfaceC3754n
    @zy.dd
    /* JADX INFO: renamed from: k */
    public PendingIntent mo13292k(gc3c gc3cVar) {
        return this.f22613k;
    }

    @Override // com.google.android.exoplayer2.ui.kja0.InterfaceC3754n
    @zy.dd
    /* JADX INFO: renamed from: q */
    public Bitmap mo13293q(gc3c gc3cVar, kja0.toq toqVar) {
        byte[] bArr = gc3cVar.ra().f23619t;
        if (bArr == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    @Override // com.google.android.exoplayer2.ui.kja0.InterfaceC3754n
    public CharSequence toq(gc3c gc3cVar) {
        CharSequence charSequence = gc3cVar.ra().f23624y;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence charSequence2 = gc3cVar.ra().f23610k;
        return charSequence2 != null ? charSequence2 : "";
    }

    @Override // com.google.android.exoplayer2.ui.kja0.InterfaceC3754n
    @zy.dd
    public CharSequence zy(gc3c gc3cVar) {
        CharSequence charSequence = gc3cVar.ra().f23616q;
        return !TextUtils.isEmpty(charSequence) ? charSequence : gc3cVar.ra().f23606g;
    }
}
