package miuix.androidbasewidget.widget;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: LinkMovementMethod.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends LinkMovementMethod {

    /* JADX INFO: renamed from: k */
    private static toq f38708k;

    public static MovementMethod getInstance() {
        if (f38708k == null) {
            f38708k = new toq();
        }
        return f38708k;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 0) && ((int) motionEvent.getX()) - textView.getTotalPaddingLeft() < 0) {
            return false;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
