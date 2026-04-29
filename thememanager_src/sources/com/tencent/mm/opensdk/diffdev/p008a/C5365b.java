package com.tencent.mm.opensdk.diffdev.p008a;

import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b */
/* JADX INFO: loaded from: classes3.dex */
final class C5365b implements OAuthListener {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    final /* synthetic */ C5364a f72525ab;

    C5365b(C5364a c5364a) {
        this.f72525ab = c5364a;
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
        Log.m18252d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
        C5364a.m18242c(this.f72525ab);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f72525ab.f29899Y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onAuthGotQrcode(String str, byte[] bArr) {
        Log.m18252d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f72525ab.f29899Y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onQrcodeScanned() {
        Log.m18252d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
        if (this.f72525ab.handler != null) {
            this.f72525ab.handler.post(new RunnableC5366c(this));
        }
    }
}
