package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

/* JADX INFO: compiled from: AndroidViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends lrht {

    /* JADX INFO: renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private Application f5117g;

    public toq(@zy.lvui Application application) {
        this.f5117g = application;
    }

    @zy.lvui
    public <T extends Application> T n5r1() {
        return (T) this.f5117g;
    }
}
