package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.C0136q;

/* JADX INFO: renamed from: androidx.appcompat.widget.m */
/* JADX INFO: compiled from: ThemedSpinnerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0204m extends SpinnerAdapter {

    /* JADX INFO: renamed from: androidx.appcompat.widget.m$k */
    /* JADX INFO: compiled from: ThemedSpinnerAdapter.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        private final Context f1100k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final LayoutInflater f46920toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private LayoutInflater f46921zy;

        public k(@zy.lvui Context context) {
            this.f1100k = context;
            this.f46920toq = LayoutInflater.from(context);
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public LayoutInflater m654k() {
            LayoutInflater layoutInflater = this.f46921zy;
            return layoutInflater != null ? layoutInflater : this.f46920toq;
        }

        @zy.dd
        public Resources.Theme toq() {
            LayoutInflater layoutInflater = this.f46921zy;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void zy(@zy.dd Resources.Theme theme) {
            if (theme == null) {
                this.f46921zy = null;
            } else if (theme == this.f1100k.getTheme()) {
                this.f46921zy = this.f46920toq;
            } else {
                this.f46921zy = LayoutInflater.from(new C0136q(this.f1100k, theme));
            }
        }
    }

    @zy.dd
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@zy.dd Resources.Theme theme);
}
