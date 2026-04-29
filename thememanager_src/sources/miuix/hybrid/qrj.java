package miuix.hybrid;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import miuix.hybrid.AbstractC7152q;

/* JADX INFO: compiled from: HybridChromeClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    private miuix.hybrid.internal.f7l8 f40352k;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n7h(fn3e fn3eVar, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return true;
        }
        fn3eVar.toq();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m25912p(fn3e fn3eVar, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return true;
        }
        fn3eVar.toq();
        return false;
    }

    public boolean cdj(HybridView view, String url, String message, final fn3e result) {
        new AlertDialog.Builder(this.f40352k.qrj()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: miuix.hybrid.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                result.toq();
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: miuix.hybrid.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                result.m25788k();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: miuix.hybrid.ld6
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                result.m25788k();
            }
        }).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: miuix.hybrid.x2
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return qrj.n7h(result, dialogInterface, i2, keyEvent);
            }
        }).show();
        return true;
    }

    public void fn3e(InterfaceC7154t<Uri> uploadFile, String acceptType, String capture) {
        uploadFile.onReceiveValue(null);
    }

    /* JADX INFO: renamed from: h */
    public boolean m25916h(HybridView view, String url, String message, final fn3e result) {
        new AlertDialog.Builder(this.f40352k.qrj()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: miuix.hybrid.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                result.toq();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: miuix.hybrid.f7l8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                result.m25788k();
            }
        }).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: miuix.hybrid.y
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return qrj.m25912p(result, dialogInterface, i2, keyEvent);
            }
        }).show();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25917i(WebView webView, InterfaceC7154t<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.f40352k.jk(filePathCallback, fileChooserParams);
        return true;
    }

    public void ki(HybridView view, int progress) {
        view.setProgress(progress);
    }

    public void kja0(String origin, AbstractC7152q.k callback) {
    }

    public void t8r(HybridView view, String title) {
    }

    public void zurt(miuix.hybrid.internal.f7l8 manager) {
        this.f40352k = manager;
    }
}
