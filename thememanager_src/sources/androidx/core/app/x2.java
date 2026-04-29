package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: AppComponentFactory.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(28)
public class x2 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    @zy.lvui
    public final Activity instantiateActivity(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.checkCompatWrapper(m2004k(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public final Application instantiateApplication(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.checkCompatWrapper(toq(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public final ContentProvider instantiateProvider(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(zy(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public final BroadcastReceiver instantiateReceiver(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(m2006q(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public final Service instantiateService(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.checkCompatWrapper(m2005n(classLoader, str, intent));
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Activity m2004k(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException("Couldn't call constructor", e2);
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public Service m2005n(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException("Couldn't call constructor", e2);
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public BroadcastReceiver m2006q(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException("Couldn't call constructor", e2);
        }
    }

    @zy.lvui
    public Application toq(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException("Couldn't call constructor", e2);
        }
    }

    @zy.lvui
    public ContentProvider zy(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException("Couldn't call constructor", e2);
        }
    }
}
