package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/was;", "Lkotlin/fn3e;", "action", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ki {
    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: k */
    public static final void m2180k(@InterfaceC7396q SharedPreferences edit, boolean z2, @InterfaceC7396q cyoe.x2<? super SharedPreferences.Editor, was> action) {
        d2ok.cdj(edit, "$this$edit");
        d2ok.cdj(action, "action");
        SharedPreferences.Editor editor = edit.edit();
        d2ok.m23085y(editor, "editor");
        action.invoke(editor);
        if (z2) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static /* synthetic */ void toq(SharedPreferences edit, boolean z2, cyoe.x2 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        d2ok.cdj(edit, "$this$edit");
        d2ok.cdj(action, "action");
        SharedPreferences.Editor editor = edit.edit();
        d2ok.m23085y(editor, "editor");
        action.invoke(editor);
        if (z2) {
            editor.commit();
        } else {
            editor.apply();
        }
    }
}
