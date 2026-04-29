package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class y2 {

    /* JADX INFO: renamed from: g */
    private static volatile y2 f34188g;

    /* JADX INFO: renamed from: k */
    private Context f34189k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private bo f73741toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final HashMap<String, AbstractC5949u> f73742zy = new HashMap<>();

    /* JADX INFO: renamed from: q */
    private ThreadPoolExecutor f34191q = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n */
    private final ArrayList<AbstractRunnableC5962k> f34190n = new ArrayList<>();

    /* JADX INFO: renamed from: com.xiaomi.push.y2$k */
    public static abstract class AbstractRunnableC5962k implements Runnable {

        /* JADX INFO: renamed from: g */
        private WeakReference<Context> f34192g;

        /* JADX INFO: renamed from: k */
        protected String f34193k;

        /* JADX INFO: renamed from: n */
        private String f34194n;

        /* JADX INFO: renamed from: p */
        private AbstractRunnableC5962k f34195p;

        /* JADX INFO: renamed from: q */
        protected AbstractC5949u f34196q = null;

        /* JADX INFO: renamed from: y */
        private Random f34198y = new Random();

        /* JADX INFO: renamed from: s */
        private int f34197s = 0;

        public AbstractRunnableC5962k(String str) {
            this.f34194n = str;
        }

        void f7l8(AbstractC5949u abstractC5949u, Context context) {
            this.f34196q = abstractC5949u;
            this.f34193k = abstractC5949u.m21855k();
            this.f34192g = new WeakReference<>(context);
        }

        /* JADX INFO: renamed from: g */
        public void mo20693g(Context context, Object obj) {
            y2.toq(context).m22038g(this);
        }

        /* JADX INFO: renamed from: k */
        public SQLiteDatabase mo22041k() {
            return this.f34196q.getWritableDatabase();
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo22042n(Context context, SQLiteDatabase sQLiteDatabase);

        /* JADX INFO: renamed from: p */
        public void m22043p(Context context) {
        }

        /* JADX INFO: renamed from: q */
        void mo22044q(Context context) {
            AbstractRunnableC5962k abstractRunnableC5962k = this.f34195p;
            if (abstractRunnableC5962k != null) {
                abstractRunnableC5962k.mo20693g(context, toq());
            }
            m22043p(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f34192g;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f34196q == null || TextUtils.isEmpty(this.f34194n)) {
                return;
            }
            File file = new File(this.f34194n);
            lg4k.toq(context, new File(file.getParentFile(), C5874l.m21150q(file.getAbsolutePath())), new gyi(this, context));
        }

        /* JADX INFO: renamed from: s */
        public boolean m22045s() {
            return this.f34196q == null || TextUtils.isEmpty(this.f34193k) || this.f34192g == null;
        }

        public Object toq() {
            return null;
        }

        /* JADX INFO: renamed from: y */
        public void m22046y(AbstractRunnableC5962k abstractRunnableC5962k) {
            this.f34195p = abstractRunnableC5962k;
        }

        public String zy() {
            return this.f34194n;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.y2$n */
    public static class C5963n extends AbstractRunnableC5962k {

        /* JADX INFO: renamed from: h */
        private ContentValues f34199h;

        public C5963n(String str, ContentValues contentValues) {
            super(str);
            this.f34199h = contentValues;
        }

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: n */
        public void mo22042n(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f34193k, null, this.f34199h);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.y2$q */
    public static class C5964q extends AbstractRunnableC5962k {

        /* JADX INFO: renamed from: h */
        private String f34200h;

        /* JADX INFO: renamed from: i */
        protected String[] f34201i;

        public C5964q(String str, String str2, String[] strArr) {
            super(str);
            this.f34200h = str2;
            this.f34201i = strArr;
        }

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: n */
        public void mo22042n(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f34193k, this.f34200h, this.f34201i);
        }
    }

    public static abstract class toq<T> extends AbstractRunnableC5962k {

        /* JADX INFO: renamed from: c */
        private List<T> f34202c;

        /* JADX INFO: renamed from: f */
        private int f34203f;

        /* JADX INFO: renamed from: h */
        private List<String> f34204h;

        /* JADX INFO: renamed from: i */
        private String f34205i;

        /* JADX INFO: renamed from: l */
        private String f34206l;

        /* JADX INFO: renamed from: r */
        private String f34207r;

        /* JADX INFO: renamed from: t */
        private String f34208t;

        /* JADX INFO: renamed from: z */
        private String[] f34209z;

        public toq(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i2) {
            super(str);
            this.f34202c = new ArrayList();
            this.f34204h = list;
            this.f34205i = str2;
            this.f34209z = strArr;
            this.f34208t = str3;
            this.f34207r = str4;
            this.f34206l = str5;
            this.f34203f = i2;
        }

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: k */
        public SQLiteDatabase mo22041k() {
            return this.f34196q.getReadableDatabase();
        }

        public abstract T ld6(Context context, Cursor cursor);

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: n */
        public void mo22042n(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f34202c.clear();
            List<String> list = this.f34204h;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f34204h.size()];
                this.f34204h.toArray(strArr2);
                strArr = strArr2;
            }
            int i2 = this.f34203f;
            Cursor cursorQuery = sQLiteDatabase.query(this.f34193k, strArr, this.f34205i, this.f34209z, this.f34208t, this.f34207r, this.f34206l, i2 > 0 ? String.valueOf(i2) : null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    T tLd6 = ld6(context, cursorQuery);
                    if (tLd6 != null) {
                        this.f34202c.add(tLd6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            x2(context, this.f34202c);
        }

        public abstract void x2(Context context, List<T> list);
    }

    public static class zy extends AbstractRunnableC5962k {

        /* JADX INFO: renamed from: h */
        private ArrayList<AbstractRunnableC5962k> f34210h;

        public zy(String str, ArrayList<AbstractRunnableC5962k> arrayList) {
            super(str);
            ArrayList<AbstractRunnableC5962k> arrayList2 = new ArrayList<>();
            this.f34210h = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: n */
        public void mo22042n(Context context, SQLiteDatabase sQLiteDatabase) {
            for (AbstractRunnableC5962k abstractRunnableC5962k : this.f34210h) {
                if (abstractRunnableC5962k != null) {
                    abstractRunnableC5962k.mo22042n(context, sQLiteDatabase);
                }
            }
        }

        @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
        /* JADX INFO: renamed from: q */
        public final void mo22044q(Context context) {
            super.mo22044q(context);
            for (AbstractRunnableC5962k abstractRunnableC5962k : this.f34210h) {
                if (abstractRunnableC5962k != null) {
                    abstractRunnableC5962k.mo22044q(context);
                }
            }
        }
    }

    private y2(Context context) {
        this.f34189k = context;
    }

    /* JADX INFO: renamed from: k */
    private AbstractC5949u m22035k(String str) {
        AbstractC5949u abstractC5949uM20657k = this.f73742zy.get(str);
        if (abstractC5949uM20657k == null) {
            synchronized (this.f73742zy) {
                if (abstractC5949uM20657k == null) {
                    abstractC5949uM20657k = this.f73741toq.m20657k(this.f34189k, str);
                    this.f73742zy.put(str, abstractC5949uM20657k);
                }
            }
        }
        return abstractC5949uM20657k;
    }

    /* JADX INFO: renamed from: n */
    private void m22036n() {
        C5889p.toq(this.f34189k).n7h(new c8jq(this), com.xiaomi.push.service.a9.m21550q(this.f34189k).m21553k(oph.StatDataProcessFrequency.m21370a(), 5));
    }

    public static y2 toq(Context context) {
        if (f34188g == null) {
            synchronized (y2.class) {
                if (f34188g == null) {
                    f34188g = new y2(context);
                }
            }
        }
        return f34188g;
    }

    public void f7l8(Runnable runnable) {
        if (this.f34191q.isShutdown()) {
            return;
        }
        this.f34191q.execute(runnable);
    }

    /* JADX INFO: renamed from: g */
    public void m22038g(AbstractRunnableC5962k abstractRunnableC5962k) {
        AbstractC5949u abstractC5949uM20657k;
        if (abstractRunnableC5962k == null) {
            return;
        }
        if (this.f73741toq == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String strZy = abstractRunnableC5962k.zy();
        synchronized (this.f73742zy) {
            abstractC5949uM20657k = this.f73742zy.get(strZy);
            if (abstractC5949uM20657k == null) {
                abstractC5949uM20657k = this.f73741toq.m20657k(this.f34189k, strZy);
                this.f73742zy.put(strZy, abstractC5949uM20657k);
            }
        }
        if (this.f34191q.isShutdown()) {
            return;
        }
        abstractRunnableC5962k.f7l8(abstractC5949uM20657k, this.f34189k);
        synchronized (this.f34190n) {
            this.f34190n.add(abstractRunnableC5962k);
            m22036n();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m22039s(AbstractRunnableC5962k abstractRunnableC5962k) {
        AbstractC5949u abstractC5949uM20657k;
        if (abstractRunnableC5962k == null) {
            return;
        }
        if (this.f73741toq == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String strZy = abstractRunnableC5962k.zy();
        synchronized (this.f73742zy) {
            abstractC5949uM20657k = this.f73742zy.get(strZy);
            if (abstractC5949uM20657k == null) {
                abstractC5949uM20657k = this.f73741toq.m20657k(this.f34189k, strZy);
                this.f73742zy.put(strZy, abstractC5949uM20657k);
            }
        }
        if (this.f34191q.isShutdown()) {
            return;
        }
        abstractRunnableC5962k.f7l8(abstractC5949uM20657k, this.f34189k);
        f7l8(abstractRunnableC5962k);
    }

    /* JADX INFO: renamed from: y */
    public void m22040y(ArrayList<AbstractRunnableC5962k> arrayList) {
        if (this.f73741toq == null) {
            throw new IllegalStateException("should exec setDbHelperFactory method first!");
        }
        HashMap map = new HashMap();
        if (this.f34191q.isShutdown()) {
            return;
        }
        for (AbstractRunnableC5962k abstractRunnableC5962k : arrayList) {
            if (abstractRunnableC5962k.m22045s()) {
                abstractRunnableC5962k.f7l8(m22035k(abstractRunnableC5962k.zy()), this.f34189k);
            }
            ArrayList arrayList2 = (ArrayList) map.get(abstractRunnableC5962k.zy());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(abstractRunnableC5962k.zy(), arrayList2);
            }
            arrayList2.add(abstractRunnableC5962k);
        }
        for (String str : map.keySet()) {
            ArrayList arrayList3 = (ArrayList) map.get(str);
            if (arrayList3 != null && arrayList3.size() > 0) {
                zy zyVar = new zy(str, arrayList3);
                zyVar.f7l8(((AbstractRunnableC5962k) arrayList3.get(0)).f34196q, this.f34189k);
                this.f34191q.execute(zyVar);
            }
        }
    }

    public String zy(String str) {
        return m22035k(str).m21855k();
    }
}
