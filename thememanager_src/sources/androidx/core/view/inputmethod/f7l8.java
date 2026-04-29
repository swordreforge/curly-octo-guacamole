package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C0642s;
import androidx.core.util.n7h;
import androidx.core.view.C0683f;
import androidx.core.view.C0711q;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f50823cdj = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50824f7l8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: g */
    private static final String f4036g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: h */
    public static final int f4037h = 1;

    /* JADX INFO: renamed from: k */
    private static final String f4038k = "InputConnectionCompat";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f50825kja0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50826ld6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: n */
    private static final String f4039n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f50827n7h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: p */
    private static final String f4040p = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: q */
    private static final String f4041q = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f50828qrj = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: s */
    private static final String f4042s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50829toq = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50830x2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: y */
    private static final String f4043y = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50831zy = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.f7l8$k */
    /* JADX INFO: compiled from: InputConnectionCompat.java */
    class C0693k extends InputConnectionWrapper {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC0694q f4044k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0693k(InputConnection inputConnection, boolean z2, InterfaceC0694q interfaceC0694q) {
            super(inputConnection, z2);
            this.f4044k = interfaceC0694q;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            if (this.f4044k.mo3323k(C0699y.f7l8(inputContentInfo), i2, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.f7l8$q */
    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public interface InterfaceC0694q {
        /* JADX INFO: renamed from: k */
        boolean mo3323k(@lvui C0699y c0699y, int i2, @dd Bundle bundle);
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    class toq extends InputConnectionWrapper {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC0694q f4045k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(InputConnection inputConnection, boolean z2, InterfaceC0694q interfaceC0694q) {
            super(inputConnection, z2);
            this.f4045k = interfaceC0694q;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (f7l8.m3319g(str, bundle, this.f4045k)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    @hyr(25)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3324k(InputConnection inputConnection, InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i2, bundle);
        }
    }

    @Deprecated
    public f7l8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f7l8(View view, C0699y c0699y, int i2, Bundle bundle) {
        if ((i2 & 1) != 0) {
            try {
                c0699y.m3339n();
                InputContentInfo inputContentInfo = (InputContentInfo) c0699y.m3337g();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f50823cdj, inputContentInfo);
            } catch (Exception e2) {
                Log.w(f4038k, "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        return C0683f.cv06(view, new C0711q.toq(new ClipData(c0699y.toq(), new ClipData.Item(c0699y.m3338k())), 2).m3414n(c0699y.zy()).zy(bundle).m3413k()) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: g */
    static boolean m3319g(@dd String str, @dd Bundle bundle, @lvui InterfaceC0694q interfaceC0694q) throws Throwable {
        boolean z2;
        ResultReceiver resultReceiver;
        ?? Mo3323k = 0;
        Mo3323k = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f50829toq, str)) {
            z2 = false;
        } else {
            if (!TextUtils.equals(f50831zy, str)) {
                return false;
            }
            z2 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z2 ? f50825kja0 : f50827n7h);
            try {
                Uri uri = (Uri) bundle.getParcelable(z2 ? f4039n : f4041q);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z2 ? f50824f7l8 : f4036g);
                Uri uri2 = (Uri) bundle.getParcelable(z2 ? f4042s : f4043y);
                int i2 = bundle.getInt(z2 ? f50828qrj : f50830x2);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z2 ? f50826ld6 : f4040p);
                if (uri != null && clipDescription != null) {
                    Mo3323k = interfaceC0694q.mo3323k(new C0699y(uri, clipDescription, uri2), i2, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(Mo3323k, null);
                }
                return Mo3323k;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: n */
    public static InputConnection m3321n(@lvui InputConnection inputConnection, @lvui EditorInfo editorInfo, @lvui InterfaceC0694q interfaceC0694q) {
        C0642s.m2986n(inputConnection, "inputConnection must be non-null");
        C0642s.m2986n(editorInfo, "editorInfo must be non-null");
        C0642s.m2986n(interfaceC0694q, "onCommitContentListener must be non-null");
        return new C0693k(inputConnection, false, interfaceC0694q);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static InputConnection m3322q(@lvui View view, @lvui InputConnection inputConnection, @lvui EditorInfo editorInfo) {
        return m3321n(inputConnection, editorInfo, zy(view));
    }

    public static boolean toq(@lvui InputConnection inputConnection, @lvui EditorInfo editorInfo, @lvui C0699y c0699y, int i2, @dd Bundle bundle) {
        return zy.m3324k(inputConnection, (InputContentInfo) c0699y.m3337g(), i2, bundle);
    }

    @lvui
    private static InterfaceC0694q zy(@lvui final View view) {
        n7h.x2(view);
        return new InterfaceC0694q() { // from class: androidx.core.view.inputmethod.g
            @Override // androidx.core.view.inputmethod.f7l8.InterfaceC0694q
            /* JADX INFO: renamed from: k */
            public final boolean mo3323k(C0699y c0699y, int i2, Bundle bundle) {
                return f7l8.f7l8(view, c0699y, i2, bundle);
            }
        };
    }
}
