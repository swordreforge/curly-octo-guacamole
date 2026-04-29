package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.hyr(api = 28)
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    /* JADX INFO: renamed from: androidx.core.app.CoreComponentFactory$k */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0409k {
        /* JADX INFO: renamed from: k */
        Object m1776k();
    }

    static <T> T checkCompatWrapper(T t2) {
        T t3;
        return (!(t2 instanceof InterfaceC0409k) || (t3 = (T) ((InterfaceC0409k) t2).m1776k()) == null) ? t2 : t3;
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public Activity instantiateActivity(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public Application instantiateApplication(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public ContentProvider instantiateProvider(@zy.lvui ClassLoader classLoader, @zy.lvui String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public BroadcastReceiver instantiateReceiver(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @zy.lvui
    public Service instantiateService(@zy.lvui ClassLoader classLoader, @zy.lvui String str, @zy.dd Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }
}
