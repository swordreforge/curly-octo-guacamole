package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.core.view.C0711q;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
final class ni7 {

    /* JADX INFO: renamed from: k */
    private static final String f1147k = "ReceiveContent";

    /* JADX INFO: renamed from: androidx.appcompat.widget.ni7$k */
    /* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
    @zy.hyr(24)
    private static final class C0212k {
        private C0212k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m686k(@zy.lvui DragEvent dragEvent, @zy.lvui TextView textView, @zy.lvui Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0683f.cv06(textView, new C0711q.toq(dragEvent.getClipData(), 3).m3413k());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @InterfaceC7830i
        static boolean toq(@zy.lvui DragEvent dragEvent, @zy.lvui View view, @zy.lvui Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0683f.cv06(view, new C0711q.toq(dragEvent.getClipData(), 3).m3413k());
            return true;
        }
    }

    private ni7() {
    }

    /* JADX INFO: renamed from: k */
    static boolean m685k(@zy.lvui View view, @zy.lvui DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C0683f.y9n(view) != null) {
            Activity activityZy = zy(view);
            if (activityZy == null) {
                Log.i(f1147k, "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? C0212k.m686k(dragEvent, (TextView) view, activityZy) : C0212k.toq(dragEvent, view, activityZy);
            }
        }
        return false;
    }

    static boolean toq(@zy.lvui TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 31 || C0683f.y9n(textView) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0683f.cv06(textView, new C0711q.toq(primaryClip, 1).m3415q(i2 != 16908322 ? 1 : 0).m3413k());
        }
        return true;
    }

    @zy.dd
    static Activity zy(@zy.lvui View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
