package miuix.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import miuix.core.util.C7084p;
import miuix.core.util.C7085q;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: Application.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends Application {

    /* JADX INFO: renamed from: g */
    private ComponentCallbacksC6896k f38722g;

    /* JADX INFO: renamed from: n */
    private toq f38724n;

    /* JADX INFO: renamed from: k */
    private Object f38723k = new Object();

    /* JADX INFO: renamed from: q */
    private Object f38725q = new Object();

    /* JADX INFO: renamed from: miuix.app.zy$k */
    /* JADX INFO: compiled from: Application.java */
    static class ComponentCallbacksC6896k implements ComponentCallbacks {

        /* JADX INFO: renamed from: k */
        private List<ComponentCallbacks> f38726k;

        /* JADX INFO: renamed from: q */
        private final Context f38727q;

        public ComponentCallbacksC6896k(Context context) {
            this.f38727q = context;
        }

        private void toq(androidx.core.util.zy<ComponentCallbacks> zyVar) {
            synchronized (this) {
                List<ComponentCallbacks> list = this.f38726k;
                if (list != null && !list.isEmpty()) {
                    int size = this.f38726k.size();
                    ComponentCallbacks[] componentCallbacksArr = new ComponentCallbacks[size];
                    this.f38726k.toArray(componentCallbacksArr);
                    for (int i2 = 0; i2 < size; i2++) {
                        zyVar.accept(componentCallbacksArr[i2]);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m24813g(@lvui ComponentCallbacks componentCallbacks) {
            List<ComponentCallbacks> list = this.f38726k;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f38726k.remove(componentCallbacks);
        }

        /* JADX INFO: renamed from: n */
        public void m24814n(@lvui ComponentCallbacks componentCallbacks) {
            if (this.f38726k == null) {
                this.f38726k = new ArrayList();
            }
            this.f38726k.add(componentCallbacks);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@lvui final Configuration configuration) {
            toq(new androidx.core.util.zy() { // from class: miuix.app.k
                @Override // androidx.core.util.zy
                public final void accept(Object obj) {
                    ((ComponentCallbacks) obj).onConfigurationChanged(configuration);
                }
            });
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            toq(new androidx.core.util.zy() { // from class: miuix.app.toq
                @Override // androidx.core.util.zy
                public final void accept(Object obj) {
                    ((ComponentCallbacks) obj).onLowMemory();
                }
            });
        }

        public int zy() {
            return this.f38726k.size();
        }
    }

    /* JADX INFO: compiled from: Application.java */
    static class toq implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: k */
        private ArrayList<Application.ActivityLifecycleCallbacks> f38728k = new ArrayList<>();

        toq() {
        }

        private Object[] toq() {
            Object[] array;
            synchronized (this.f38728k) {
                array = this.f38728k.size() > 0 ? this.f38728k.toArray() : null;
            }
            return array;
        }

        /* JADX INFO: renamed from: k */
        public boolean m24815k(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            return this.f38728k.add(activityLifecycleCallbacks);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@lvui Activity activity, @dd Bundle bundle) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@lvui Activity activity) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@lvui Activity activity) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@lvui Activity activity) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@lvui Activity activity, @lvui Bundle bundle) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@lvui Activity activity) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@lvui Activity activity) {
            Object[] qVar = toq();
            if (qVar != null) {
                for (Object obj : qVar) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public boolean m24816q(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            return this.f38728k.remove(activityLifecycleCallbacks);
        }

        public int zy() {
            return this.f38728k.size();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m24809k(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        synchronized (this.f38723k) {
            if (this.f38724n == null) {
                toq toqVar = new toq();
                this.f38724n = toqVar;
                registerActivityLifecycleCallbacks(toqVar);
            }
            this.f38724n.m24815k(activityLifecycleCallbacks);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@lvui Configuration configuration) {
        C7084p.m25597q();
        C7085q.m25602i(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        C7085q.m25601h(this);
        super.onCreate();
    }

    /* JADX INFO: renamed from: q */
    public void m24810q(ComponentCallbacks componentCallbacks) {
        synchronized (this.f38725q) {
            ComponentCallbacksC6896k componentCallbacksC6896k = this.f38722g;
            if (componentCallbacksC6896k != null) {
                componentCallbacksC6896k.m24813g(componentCallbacks);
                if (this.f38722g.zy() == 0) {
                    unregisterComponentCallbacks(this.f38722g);
                    this.f38722g = null;
                }
            }
        }
    }

    public void toq(ComponentCallbacks componentCallbacks) {
        synchronized (this.f38725q) {
            if (this.f38722g == null) {
                ComponentCallbacksC6896k componentCallbacksC6896k = new ComponentCallbacksC6896k(this);
                this.f38722g = componentCallbacksC6896k;
                registerComponentCallbacks(componentCallbacksC6896k);
            }
            this.f38722g.m24814n(componentCallbacks);
        }
    }

    public void zy(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        synchronized (this.f38723k) {
            toq toqVar = this.f38724n;
            if (toqVar != null) {
                toqVar.m24816q(activityLifecycleCallbacks);
                if (this.f38724n.zy() == 0) {
                    unregisterActivityLifecycleCallbacks(this.f38724n);
                    this.f38724n = null;
                }
            }
        }
    }
}
