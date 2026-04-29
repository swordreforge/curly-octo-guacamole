package miui.settings.splitlib;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: SplitUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    public static final String f38569k = "android.settings.SETTINGS";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f86502toq = "split_page_intent";

    /* JADX INFO: renamed from: k */
    public static Intent m24752k(Context context, Intent intent, String str) {
        return toq(context, intent, str, false);
    }

    /* JADX INFO: renamed from: n */
    public static void m24753n(Context context, Intent intent, String str, boolean z2) {
        context.startActivity(toq(context, intent, str, z2));
    }

    /* JADX INFO: renamed from: q */
    public static void m24754q(Context context, Intent intent, String str) {
        m24753n(context, intent, str, false);
    }

    public static Intent toq(Context context, Intent intent, String str, boolean z2) {
        Intent intent2 = new Intent(f38569k);
        if (z2) {
            intent2.addFlags(268435456);
        }
        intent2.putExtra(f86502toq, new SplitPageIntent(intent, str));
        return intent2;
    }

    public static Intent zy(Intent intent) {
        SplitPageIntent splitPageIntent;
        if (intent == null || (splitPageIntent = (SplitPageIntent) intent.getParcelableExtra(f86502toq)) == null) {
            return null;
        }
        return splitPageIntent.getIntent();
    }
}
