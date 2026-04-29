package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C0639p;
import java.util.Collection;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @lvui
    View cdj(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle, @lvui CalendarConstraints calendarConstraints, @lvui qrj<S> qrjVar);

    void fn3e(long j2);

    @lvui
    Collection<Long> getSelectedDays();

    @lvui
    Collection<C0639p<Long, Long>> getSelectedRanges();

    @dd
    S getSelection();

    boolean ki();

    void kja0(@lvui S s2);

    @hb
    /* JADX INFO: renamed from: n */
    int mo14373n(Context context);

    @lvui
    String n7h(Context context);

    @nn86
    /* JADX INFO: renamed from: q */
    int mo14374q();
}
