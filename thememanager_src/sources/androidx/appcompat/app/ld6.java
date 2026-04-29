package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: LayoutIncludeDetector.java */
/* JADX INFO: loaded from: classes.dex */
class ld6 {

    /* JADX INFO: renamed from: k */
    @lvui
    private final Deque<WeakReference<XmlPullParser>> f289k = new ArrayDeque();

    ld6() {
    }

    /* JADX INFO: renamed from: q */
    private static boolean m204q(@lvui XmlPullParser xmlPullParser, @dd XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    private static boolean toq(@dd XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() != 3) {
                return xmlPullParser.getEventType() == 1;
            }
            return true;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @dd
    private static XmlPullParser zy(@lvui Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!toq(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    boolean m205k(@lvui AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserZy = zy(this.f289k);
        this.f289k.push(new WeakReference<>(xmlPullParser));
        return m204q(xmlPullParser, xmlPullParserZy);
    }
}
