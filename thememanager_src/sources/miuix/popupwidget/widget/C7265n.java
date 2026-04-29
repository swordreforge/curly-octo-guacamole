package miuix.popupwidget.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.core.content.C0498q;
import c25.toq;
import java.util.Arrays;
import java.util.List;
import miuix.popupwidget.widget.C7265n;
import miuix.popupwidget.widget.zy;

/* JADX INFO: renamed from: miuix.popupwidget.widget.n */
/* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7265n implements zy.InterfaceC7274s {

    /* JADX INFO: renamed from: g */
    private miuix.popupwidget.widget.zy f41076g;

    /* JADX INFO: renamed from: k */
    private Context f41077k;

    /* JADX INFO: renamed from: n */
    private View f41078n;

    /* JADX INFO: renamed from: q */
    private n f41079q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<String> f88063toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f88064zy;

    /* JADX INFO: renamed from: miuix.popupwidget.widget.n$k */
    /* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
    class k extends zy.C7272p {
        k() {
        }

        @Override // miuix.popupwidget.widget.zy.C7272p, miuix.popupwidget.widget.zy.InterfaceC7274s
        /* JADX INFO: renamed from: k */
        public void mo26426k() {
            if (C7265n.this.f41079q != null) {
                C7265n.this.f41079q.m26430k();
            }
        }

        @Override // miuix.popupwidget.widget.zy.C7272p, miuix.popupwidget.widget.zy.InterfaceC7274s
        public void onDismiss() {
            C7265n.this.ld6();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.n$n */
    /* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
    public interface n {
        /* JADX INFO: renamed from: k */
        void m26430k();

        void onDismiss();

        void toq(C7265n c7265n, int i2);
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.n$q */
    /* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
    class q extends View.AccessibilityDelegate {
        q() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(Spinner.class.getName());
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.n$toq */
    /* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
    class toq extends ArrayAdapter<String> {
        toq(Context context, int i2, List list) {
            super(context, i2, list);
        }

        private View toq(Context context, int i2, int i3, View view) {
            int dimensionPixelSize;
            int dimensionPixelSize2;
            view.getLayoutParams();
            int paddingStart = view.getPaddingStart();
            view.getPaddingTop();
            int paddingEnd = view.getPaddingEnd();
            view.getPaddingBottom();
            if (i2 == 1) {
                Resources resources = context.getResources();
                int i4 = toq.C1385g.f54455pc;
                dimensionPixelSize = resources.getDimensionPixelSize(i4);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(i4);
            } else if (i3 == 0) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(toq.C1385g.f54375ebn);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(toq.C1385g.f54455pc);
            } else if (i3 == i2 - 1) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(toq.C1385g.f54455pc);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(toq.C1385g.f54375ebn);
            } else {
                Resources resources2 = context.getResources();
                int i5 = toq.C1385g.f54455pc;
                dimensionPixelSize = resources2.getDimensionPixelSize(i5);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(i5);
            }
            view.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, dimensionPixelSize2);
            return view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean zy(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 9) {
                view.setHovered(true);
            } else if (motionEvent.getAction() == 10) {
                view.setHovered(false);
            }
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            View qVar = toq(getContext(), getCount(), i2, super.getView(i2, view, viewGroup));
            qVar.setForeground(C0498q.m2259s(getContext(), toq.f7l8.f54188fh));
            if (!qVar.isClickable()) {
                qVar.setOnHoverListener(new View.OnHoverListener() { // from class: miuix.popupwidget.widget.g
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view2, MotionEvent motionEvent) {
                        return C7265n.toq.zy(view2, motionEvent);
                    }
                });
            }
            return qVar;
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.n$zy */
    /* JADX INFO: compiled from: DropDownSingleChoiceMenu.java */
    class zy implements AdapterView.OnItemClickListener {
        zy() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            C7265n.this.f88064zy = i2;
            if (C7265n.this.f41079q != null) {
                C7265n.this.f41079q.toq(C7265n.this, i2);
            }
            C7265n.this.m26429y();
        }
    }

    public C7265n(Context context) {
        this.f41077k = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6() {
        this.f41076g = null;
    }

    private void x2(View view) {
        view.setAccessibilityDelegate(new q());
    }

    public void cdj(int i2) {
        this.f88064zy = i2;
    }

    /* JADX INFO: renamed from: h */
    public void m26425h(n nVar) {
        this.f41079q = nVar;
    }

    @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
    /* JADX INFO: renamed from: k */
    public void mo26426k() {
    }

    public void ki() {
        if (this.f88063toq == null || this.f41078n == null) {
            return;
        }
        if (this.f41076g == null) {
            miuix.popupwidget.widget.zy zyVar = new miuix.popupwidget.widget.zy(this.f41077k, null, 0);
            this.f41076g = zyVar;
            zyVar.m26463t(new k());
            this.f41076g.jk(this);
            ListView listViewM26466y = new zy.ld6(this.f41076g).m26466y();
            listViewM26466y.setAdapter((ListAdapter) new toq(this.f41077k, toq.x2.f55339d3, this.f88063toq));
            listViewM26466y.setOnItemClickListener(new zy());
            listViewM26466y.setChoiceMode(1);
            listViewM26466y.setItemChecked(this.f88064zy, true);
            this.f41076g.wvg(this.f41078n);
        }
        this.f41076g.jp0y();
    }

    public void kja0(String[] strArr) {
        this.f88063toq = Arrays.asList(strArr);
    }

    public void n7h(List<String> list) {
        this.f88063toq = list;
    }

    @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
    public void onDismiss() {
        n nVar = this.f41079q;
        if (nVar != null) {
            nVar.onDismiss();
        }
    }

    /* JADX INFO: renamed from: p */
    public int m26427p() {
        return this.f88064zy;
    }

    public void qrj(View view) {
        this.f41078n = view;
        x2(view);
    }

    /* JADX INFO: renamed from: s */
    public List<String> m26428s() {
        return this.f88063toq;
    }

    /* JADX INFO: renamed from: y */
    public void m26429y() {
        miuix.popupwidget.widget.zy zyVar = this.f41076g;
        if (zyVar != null) {
            zyVar.ki();
        }
    }

    @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
    public void zy(View view, float f2) {
    }
}
