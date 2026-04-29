package ktq;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;
import jz5.C6105k;

/* JADX INFO: compiled from: PickerOnlineRingViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends lrht {

    /* JADX INFO: renamed from: g */
    private fti<List<UIElement>> f37540g;

    /* JADX INFO: renamed from: y */
    private final fti<Boolean> f37543y = new fti<>(Boolean.TRUE);

    /* JADX INFO: renamed from: s */
    private int f37542s = 0;

    /* JADX INFO: renamed from: p */
    private boolean f37541p = false;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lrht() {
        List<UIElement> list;
        synchronized (zy.class) {
            Pair<UIPage, List<UIElement>> pairM22389k = C6105k.m22389k(this.f37542s);
            List<UIElement> listM4388g = this.f37540g.m4388g();
            if (pairM22389k != null && (list = (List) pairM22389k.second) != null && list.size() > 0) {
                this.f37542s++;
                if (listM4388g == null) {
                    this.f37540g.n7h(list);
                } else {
                    ArrayList arrayList = new ArrayList(list.size() + listM4388g.size());
                    arrayList.addAll(listM4388g);
                    arrayList.addAll(list);
                    this.f37540g.n7h(arrayList);
                }
                this.f37543y.n7h(Boolean.valueOf(((UIPage) pairM22389k.first).hasMore));
            }
        }
        this.f37541p = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24697c() {
        return this.f37541p;
    }

    /* JADX INFO: renamed from: f */
    public boolean m24698f() {
        if (this.f37543y.m4388g() == null) {
            return true;
        }
        return this.f37543y.m4388g().booleanValue();
    }

    public LiveData<List<UIElement>> hyr() {
        if (this.f37540g == null) {
            this.f37540g = new fti<>();
            vyq();
        }
        return this.f37540g;
    }

    public void uv6() {
        vyq();
    }

    public void vyq() {
        this.f37541p = true;
        C6002g.f7l8(new Runnable() { // from class: ktq.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f37539k.lrht();
            }
        });
    }
}
