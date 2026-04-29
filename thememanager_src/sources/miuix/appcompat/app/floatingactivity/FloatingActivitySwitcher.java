package miuix.appcompat.app.floatingactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import miuix.appcompat.app.t8r;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActivitySwitcher {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final HashMap<String, ActivitySpec> f86838f7l8 = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private static final String f38806g = "miuix_floating_activity_info_key";

    /* JADX INFO: renamed from: n */
    private static FloatingActivitySwitcher f38807n = null;

    /* JADX INFO: renamed from: y */
    private static final String f38808y = "FloatingActivity";

    /* JADX INFO: renamed from: k */
    private final SparseArray<ArrayList<t8r>> f38809k = new SparseArray<>();

    /* JADX INFO: renamed from: q */
    private final ArrayList<t8r> f38810q = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f86839toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private WeakReference<View> f86840zy;

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher$k */
    class C6916k implements InterfaceC6939y {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        protected int f86841f7l8;

        /* JADX INFO: renamed from: g */
        protected String f38815g;

        public C6916k(t8r t8rVar) {
            this.f38815g = t8rVar.getActivityIdentity();
            this.f86841f7l8 = t8rVar.getTaskId();
        }

        private boolean cdj(int i2) {
            ArrayList arrayList = (ArrayList) FloatingActivitySwitcher.this.f38809k.get(m24898h());
            return (i2 == 4 || i2 == 3) && (arrayList != null && arrayList.size() > 1);
        }

        private boolean n7h(int i2) {
            return !FloatingActivitySwitcher.this.f86839toq && (i2 == 1 || i2 == 2);
        }

        private void x2(t8r t8rVar) {
            View viewKi;
            ViewGroup viewGroup;
            FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
            if (floatingActivitySwitcherCdj == null || (viewKi = floatingActivitySwitcherCdj.ki()) == null || (viewGroup = (ViewGroup) t8rVar.getFloatingBrightPanel().getParent()) == null) {
                return;
            }
            viewGroup.getOverlay().clear();
            viewGroup.getOverlay().add(viewKi);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public boolean f7l8() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f86838f7l8.get(kja0());
            if (activitySpec == null || (arrayList = (ArrayList) FloatingActivitySwitcher.this.f38809k.get(activitySpec.f38814q)) == null) {
                return true;
            }
            if (arrayList.size() > 1) {
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (!((t8r) it.next()).isFinishing()) {
                        i2++;
                    }
                    if (i2 > 1) {
                        return false;
                    }
                }
            }
            t8r t8rVar = arrayList.size() == 0 ? null : (t8r) arrayList.get(0);
            if (t8rVar == null || t8rVar.isFinishing() || ((ActivitySpec) FloatingActivitySwitcher.f86838f7l8.get(t8rVar.getActivityIdentity())) == null) {
                return true;
            }
            return !activitySpec.f38813n;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: g */
        public void mo24897g() {
            FloatingActivitySwitcher.this.fn3e(kja0());
        }

        /* JADX INFO: renamed from: h */
        protected int m24898h() {
            return this.f86841f7l8;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: k */
        public void mo24899k() {
            FloatingActivitySwitcher.this.fn3e(kja0());
        }

        protected String kja0() {
            return this.f38815g;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public void ld6(t8r t8rVar) {
            FloatingActivitySwitcher.this.jk(t8rVar);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: n */
        public void mo24900n() {
            Iterator it = FloatingActivitySwitcher.this.f38810q.iterator();
            while (it.hasNext()) {
                ((t8r) it.next()).realFinish();
            }
            FloatingActivitySwitcher.this.f38810q.clear();
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: p */
        public boolean mo24901p() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f86838f7l8.get(kja0());
            if (activitySpec != null && (arrayList = (ArrayList) FloatingActivitySwitcher.this.f38809k.get(activitySpec.f38814q)) != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    t8r t8rVar = (t8r) arrayList.get(i2);
                    if (!t8rVar.isFinishing()) {
                        return t8rVar.getActivityIdentity().equals(kja0());
                    }
                }
            }
            return false;
        }

        @Override // miuix.appcompat.app.floatingactivity.f7l8
        /* JADX INFO: renamed from: q */
        public boolean mo24902q(int i2) {
            if (n7h(i2)) {
                return false;
            }
            if (cdj(i2)) {
                FloatingActivitySwitcher.this.m24884p(kja0());
            } else {
                FloatingActivitySwitcher.this.m24889s(kja0());
            }
            return false;
        }

        protected boolean qrj(t8r t8rVar) {
            return t8rVar != null;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: s */
        public int mo24903s() {
            ArrayList arrayList = (ArrayList) FloatingActivitySwitcher.this.f38809k.get(m24898h());
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public boolean toq() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f86838f7l8.get(kja0());
            if (activitySpec == null || (arrayList = (ArrayList) FloatingActivitySwitcher.this.f38809k.get(activitySpec.f38814q)) == null) {
                return true;
            }
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (!((t8r) it.next()).isFinishing()) {
                    i2++;
                }
            }
            return i2 == 1;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: y */
        public void mo24904y() {
            FloatingActivitySwitcher.this.d3(kja0());
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public void zy(t8r t8rVar) {
            FloatingActivitySwitcher floatingActivitySwitcherCdj;
            t8r t8rVarM24888i;
            View viewM24949q;
            if (t8rVar == null || (floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj()) == null || (t8rVarM24888i = floatingActivitySwitcherCdj.m24888i(t8rVar)) == null) {
                return;
            }
            int i2 = 0;
            do {
                viewM24949q = ld6.m24949q(t8rVarM24888i, t8rVar);
                i2++;
                if (viewM24949q != null) {
                    break;
                }
            } while (i2 < 3);
            floatingActivitySwitcherCdj.gvn7(viewM24949q);
            x2(t8rVarM24888i);
        }
    }

    private FloatingActivitySwitcher() {
    }

    public static void a9(t8r t8rVar, Bundle bundle) {
        if (cdj() == null || bundle == null) {
            return;
        }
        bundle.putParcelable(f38806g, t8r(t8rVar));
    }

    static FloatingActivitySwitcher cdj() {
        return f38807n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(String str) {
        ActivitySpec activitySpec = f86838f7l8.get(str);
        if (activitySpec != null) {
            ArrayList<t8r> arrayList = this.f38809k.get(activitySpec.f38814q);
            int i2 = -1;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (arrayList.get(i3).getActivityIdentity().equals(str)) {
                        i2 = i3;
                    }
                }
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                arrayList.get(i4).showFloatingBrightPanel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(String str) {
        ActivitySpec activitySpec = f86838f7l8.get(str);
        if (activitySpec != null) {
            ArrayList<t8r> arrayList = this.f38809k.get(activitySpec.f38814q);
            int i2 = -1;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (arrayList.get(i3).getActivityIdentity().equals(str)) {
                        i2 = i3;
                    }
                }
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                arrayList.get(i4).hideFloatingBrightPanel();
            }
        }
    }

    private ActivitySpec fti(@lvui t8r t8rVar, @lvui Bundle bundle) {
        ActivitySpec activitySpec = (ActivitySpec) bundle.getParcelable(f38806g);
        if (activitySpec != null) {
            return activitySpec;
        }
        Log.w(f38808y, "FloatingActivitySwitcher restore a full ActivitySpec instance with savedInstanceState fail, Check if you have replaced the theme in the float window !");
        return new ActivitySpec(t8rVar.getClass().getSimpleName(), 0, t8rVar.getActivityIdentity(), t8rVar.getTaskId(), false);
    }

    private void fu4(ArrayList<t8r> arrayList, int i2, t8r t8rVar) {
        int i3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ActivitySpec activitySpec = f86838f7l8.get(arrayList.get(size).getActivityIdentity());
            if (i2 > (activitySpec != null ? activitySpec.f38812k : 0)) {
                i3 = size + 1;
                break;
            }
        }
        arrayList.add(i3, t8rVar);
    }

    private void ld6(t8r t8rVar) {
        if (toq.m24987g()) {
            return;
        }
        if (t8rVar.isInFloatingWindowMode()) {
            toq.m24988k(t8rVar);
        } else {
            toq.toq(t8rVar);
        }
    }

    private boolean mcp(t8r t8rVar) {
        return f86838f7l8.get(t8rVar.getActivityIdentity()) != null;
    }

    private void ni7(t8r t8rVar, Bundle bundle) {
        if (miuix.appcompat.app.floatingactivity.helper.toq.toq(t8rVar) == 0) {
            return;
        }
        oc(t8rVar, bundle);
        t8rVar.getLifecycle().mo4451k(new SingleAppFloatingLifecycleObserver(t8rVar));
        t8rVar.setEnableSwipToDismiss(this.f86839toq);
        t8rVar.setOnFloatingCallback(new C6916k(t8rVar));
    }

    public static void o1t(t8r t8rVar, Bundle bundle) {
        wvg(t8rVar, true, bundle);
    }

    private void oc(t8r t8rVar, Bundle bundle) {
        if (!mcp(t8rVar)) {
            int taskId = t8rVar.getTaskId();
            ArrayList<t8r> arrayList = this.f38809k.get(taskId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f38809k.put(taskId, arrayList);
            }
            if (bundle != null) {
                ActivitySpec activitySpecFti = fti(t8rVar, bundle);
                activitySpecFti.activityClassName = t8rVar.getClass().getSimpleName();
                activitySpecFti.identity = t8rVar.getActivityIdentity();
                fu4(arrayList, activitySpecFti.f38812k, t8rVar);
                f86838f7l8.put(t8rVar.getActivityIdentity(), activitySpecFti);
            } else {
                arrayList.add(t8rVar);
                FloatingActivitySwitcher floatingActivitySwitcherCdj = cdj();
                f86838f7l8.put(t8rVar.getActivityIdentity(), new ActivitySpec(t8rVar.getClass().getSimpleName(), floatingActivitySwitcherCdj == null ? 0 : floatingActivitySwitcherCdj.kja0(t8rVar), t8rVar.getActivityIdentity(), t8rVar.getTaskId(), false));
            }
        }
        ActivitySpec activitySpec = f86838f7l8.get(t8rVar.getActivityIdentity());
        if (activitySpec != null) {
            toq.f7l8(t8rVar, activitySpec.f38812k);
        }
        ld6(t8rVar);
        zurt(t8rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m24884p(String str) {
        ArrayList<t8r> arrayList;
        ActivitySpec activitySpec = f86838f7l8.get(str);
        if (activitySpec == null || (arrayList = this.f38809k.get(activitySpec.f38814q)) == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(arrayList.size() - 1).realFinish();
    }

    private static ActivitySpec t8r(t8r t8rVar) {
        ActivitySpec activitySpec = f86838f7l8.get(t8rVar.getActivityIdentity());
        FloatingActivitySwitcher floatingActivitySwitcherCdj = cdj();
        if (activitySpec == null) {
            activitySpec = new ActivitySpec(t8rVar.getClass().getSimpleName(), floatingActivitySwitcherCdj == null ? 0 : floatingActivitySwitcherCdj.kja0(t8rVar), t8rVar.getActivityIdentity(), t8rVar.getTaskId(), false);
        }
        return activitySpec;
    }

    private static void wvg(t8r t8rVar, boolean z2, Bundle bundle) {
        if (f38807n == null) {
            FloatingActivitySwitcher floatingActivitySwitcher = new FloatingActivitySwitcher();
            f38807n = floatingActivitySwitcher;
            floatingActivitySwitcher.f86839toq = z2;
        }
        f38807n.ni7(t8rVar, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static void m24886z(t8r t8rVar) {
        wvg(t8rVar, true, null);
    }

    private void zurt(t8r t8rVar) {
        ArrayList<t8r> arrayList = this.f38809k.get(t8rVar.getTaskId());
        if (arrayList == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (!arrayList.get(i2).isFinishing()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        while (true) {
            i2++;
            if (i2 >= arrayList.size()) {
                return;
            } else {
                arrayList.get(i2).hideFloatingDimBackground();
            }
        }
    }

    void gvn7(View view) {
        this.f86840zy = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: h */
    ArrayList<t8r> m24887h(int i2) {
        return this.f38809k.get(i2);
    }

    /* JADX INFO: renamed from: i */
    t8r m24888i(t8r t8rVar) {
        if (t8rVar == null) {
            return null;
        }
        ArrayList<t8r> arrayList = this.f38809k.get(t8rVar.getTaskId());
        int iIndexOf = arrayList != null ? arrayList.indexOf(t8rVar) : -1;
        if (iIndexOf <= 0) {
            return null;
        }
        int i2 = iIndexOf - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            t8r t8rVar2 = arrayList.get(i2);
            if (!t8rVar2.isFinishing()) {
                return t8rVar2;
            }
        }
        return null;
    }

    public void jk(t8r t8rVar) {
        ActivitySpec activitySpec = f86838f7l8.get(t8rVar.getActivityIdentity());
        if (activitySpec != null) {
            activitySpec.f38813n = true;
        }
    }

    public void jp0y(String str, int i2) {
        ArrayList<t8r> arrayList = this.f38809k.get(i2);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                t8r t8rVar = arrayList.get(size);
                if (t8rVar.getActivityIdentity().equals(str)) {
                    arrayList.remove(size);
                }
                this.f38810q.remove(t8rVar);
            }
            if (arrayList.isEmpty()) {
                this.f38809k.remove(i2);
            }
        }
        f86838f7l8.remove(str);
        if (this.f38809k.size() == 0) {
            m24891y();
        }
    }

    View ki() {
        WeakReference<View> weakReference = this.f86840zy;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    int kja0(t8r t8rVar) {
        ArrayList<t8r> arrayList;
        if (t8rVar == null || (arrayList = this.f38809k.get(t8rVar.getTaskId())) == null) {
            return -1;
        }
        return arrayList.indexOf(t8rVar);
    }

    SparseArray<ArrayList<t8r>> n7h() {
        return this.f38809k;
    }

    t8r qrj(String str, int i2) {
        ArrayList<t8r> arrayList = this.f38809k.get(i2);
        if (arrayList == null) {
            return null;
        }
        for (t8r t8rVar : arrayList) {
            if (t8rVar.getActivityIdentity().equals(str)) {
                return t8rVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m24889s(String str) {
        ArrayList<t8r> arrayList;
        ActivitySpec activitySpec = f86838f7l8.get(str);
        if (activitySpec == null || (arrayList = this.f38809k.get(activitySpec.f38814q)) == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t8r t8rVar = arrayList.get(size);
            if (!t8rVar.getActivityIdentity().equals(str)) {
                t8rVar.hideFloatingBrightPanel();
                this.f38810q.add(t8rVar);
                arrayList.remove(t8rVar);
                f86838f7l8.remove(t8rVar.getActivityIdentity());
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m24890t(t8r t8rVar) {
        ActivitySpec activitySpec = f86838f7l8.get(t8rVar.getActivityIdentity());
        return activitySpec != null && activitySpec.f38813n;
    }

    t8r x2(String str) {
        ActivitySpec activitySpec = f86838f7l8.get(str);
        if (activitySpec != null) {
            return qrj(str, activitySpec.f38814q);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public void m24891y() {
        this.f38809k.clear();
        f86838f7l8.clear();
        this.f86840zy = null;
        f38807n = null;
    }

    private static class ActivitySpec implements Parcelable {
        public static final Parcelable.Creator<ActivitySpec> CREATOR = new Parcelable.Creator<ActivitySpec>() { // from class: miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher.ActivitySpec.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public ActivitySpec createFromParcel(Parcel parcel) {
                return new ActivitySpec(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public ActivitySpec[] newArray(int i2) {
                return new ActivitySpec[i2];
            }
        };
        private String activityClassName;

        /* JADX INFO: renamed from: g */
        private boolean f38811g = false;
        private String identity;

        /* JADX INFO: renamed from: k */
        private int f38812k;

        /* JADX INFO: renamed from: n */
        private boolean f38813n;

        /* JADX INFO: renamed from: q */
        private int f38814q;

        public ActivitySpec(String str, int i2, String str2, int i3, boolean z2) {
            this.activityClassName = str;
            this.f38812k = i2;
            this.identity = str2;
            this.f38814q = i3;
            this.f38813n = z2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void ld6(boolean z2) {
            this.f38811g = z2;
        }

        /* JADX INFO: renamed from: p */
        public boolean m24895p() {
            return this.f38811g;
        }

        @lvui
        public String toString() {
            return "{ activityClassName : " + this.activityClassName + "; index : " + this.f38812k + "; identity : " + this.identity + "; taskId : " + this.f38814q + "; isOpenEnterAnimExecuted : " + this.f38813n + "; }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.activityClassName);
            parcel.writeInt(this.f38812k);
            parcel.writeString(this.identity);
            parcel.writeInt(this.f38814q);
            parcel.writeByte(this.f38813n ? (byte) 1 : (byte) 0);
        }

        protected ActivitySpec(Parcel parcel) {
            this.activityClassName = "";
            this.f38812k = 0;
            this.f38814q = 0;
            this.f38813n = false;
            this.activityClassName = parcel.readString();
            this.f38812k = parcel.readInt();
            this.identity = parcel.readString();
            this.f38814q = parcel.readInt();
            this.f38813n = parcel.readByte() != 0;
        }
    }
}
