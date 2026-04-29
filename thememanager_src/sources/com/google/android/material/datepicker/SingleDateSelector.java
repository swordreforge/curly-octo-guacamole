package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.C0639p;
import com.google.android.material.internal.C4058z;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@lvui Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i2) {
            return new SingleDateSelector[i2];
        }
    };

    @dd
    private Long selectedItem;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.SingleDateSelector$k */
    class C4001k extends zy {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ qrj f24285h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4001k(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, qrj qrjVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f24285h = qrjVar;
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: g */
        void mo14392g(@dd Long l2) {
            if (l2 == null) {
                SingleDateSelector.this.zy();
            } else {
                SingleDateSelector.this.fn3e(l2.longValue());
            }
            this.f24285h.toq(SingleDateSelector.this.getSelection());
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: n */
        void mo14393n() {
            this.f24285h.mo14415k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zy() {
        this.selectedItem = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View cdj(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle, CalendarConstraints calendarConstraints, @lvui qrj<Long> qrjVar) {
        View viewInflate = layoutInflater.inflate(C6095k.ld6.f79351was, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C6095k.y.anhx);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.f7l8.m14538k()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatM14398h = cdj.m14398h();
        String strCdj = cdj.cdj(viewInflate.getResources(), simpleDateFormatM14398h);
        textInputLayout.setPlaceholderText(strCdj);
        Long l2 = this.selectedItem;
        if (l2 != null) {
            editText.setText(simpleDateFormatM14398h.format(l2));
        }
        editText.addTextChangedListener(new C4001k(strCdj, simpleDateFormatM14398h, textInputLayout, calendarConstraints, qrjVar));
        C4058z.m14622h(editText);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void fn3e(long j2) {
        this.selectedItem = Long.valueOf(j2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void kja0(@dd Long l2) {
        this.selectedItem = l2 == null ? null : Long.valueOf(cdj.m14400k(l2.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.selectedItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public Collection<C0639p<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean ki() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: n */
    public int mo14373n(Context context) {
        return com.google.android.material.resources.toq.f7l8(context, C6095k.zy.xypo, f7l8.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public String n7h(@lvui Context context) {
        Resources resources = context.getResources();
        Long l2 = this.selectedItem;
        if (l2 == null) {
            return resources.getString(C6095k.qrj.f79805g1);
        }
        return resources.getString(C6095k.qrj.f79860wo, C4013q.m14438p(l2.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: q */
    public int mo14374q() {
        return C6095k.qrj.f79794d8wk;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeValue(this.selectedItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @dd
    public Long getSelection() {
        return this.selectedItem;
    }
}
