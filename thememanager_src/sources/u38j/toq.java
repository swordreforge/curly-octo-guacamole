package u38j;

/* JADX INFO: compiled from: DebugUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {
    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m28060k() {
        try {
            return ((Boolean) Class.forName("com.miui.systemAdSolution.BuildConfig").getField("DEBUG").get(null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
