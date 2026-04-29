package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0711q;
import androidx.core.view.d2ok;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class fu4 implements d2ok {

    /* JADX INFO: renamed from: k */
    private static final String f4248k = "ReceiveContent";

    /* JADX INFO: renamed from: androidx.core.widget.fu4$k */
    /* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
    @hyr(16)
    private static final class C0748k {
        private C0748k() {
        }

        /* JADX INFO: renamed from: k */
        static CharSequence m3626k(@lvui Context context, @lvui ClipData.Item item, int i2) {
            if ((i2 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    /* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
    private static final class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        static CharSequence m3627k(@lvui Context context, @lvui ClipData.Item item, int i2) {
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return ((i2 & 1) == 0 || !(charSequenceCoerceToText instanceof Spanned)) ? charSequenceCoerceToText : charSequenceCoerceToText.toString();
        }
    }

    private static CharSequence toq(@lvui Context context, @lvui ClipData.Item item, int i2) {
        return C0748k.m3626k(context, item, i2);
    }

    private static void zy(@lvui Editable editable, @lvui CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.d2ok
    @dd
    /* JADX INFO: renamed from: k */
    public C0711q mo3148k(@lvui View view, @lvui C0711q c0711q) {
        if (Log.isLoggable(f4248k, 3)) {
            Log.d(f4248k, "onReceive: " + c0711q);
        }
        if (c0711q.f7l8() == 2) {
            return c0711q;
        }
        ClipData clipDataZy = c0711q.zy();
        int iM3405n = c0711q.m3405n();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clipDataZy.getItemCount(); i2++) {
            CharSequence qVar = toq(context, clipDataZy.getItemAt(i2), iM3405n);
            if (qVar != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), qVar);
                } else {
                    zy(editable, qVar);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
