package miuix.autodensity;

/* JADX INFO: renamed from: miuix.autodensity.s */
/* JADX INFO: compiled from: MiuixApplication.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ApplicationC7073s extends miuix.app.zy implements InterfaceC7074y {
    @Override // miuix.app.zy, android.app.Application
    public void onCreate() {
        super.onCreate();
        AutoDensityConfig.init(this);
    }

    @Override // miuix.autodensity.InterfaceC7074y
    public boolean shouldAdaptAutoDensity() {
        return true;
    }
}
