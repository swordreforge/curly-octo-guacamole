package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<C0639p<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@lvui Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i2) {
            return new RangeDateSelector[i2];
        }
    };
    private String invalidRangeStartError;
    private final String invalidRangeEndError = " ";

    @dd
    private Long selectedStartItem = null;

    @dd
    private Long selectedEndItem = null;

    @dd
    private Long proposedTextStart = null;

    @dd
    private Long proposedTextEnd = null;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.RangeDateSelector$k */
    class C3999k extends zy {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ TextInputLayout f24277h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ TextInputLayout f24278i;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ qrj f24280z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3999k(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, qrj qrjVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f24277h = textInputLayout2;
            this.f24278i = textInputLayout3;
            this.f24280z = qrjVar;
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: g */
        void mo14392g(@dd Long l2) {
            RangeDateSelector.this.proposedTextStart = l2;
            RangeDateSelector.this.m14387h(this.f24277h, this.f24278i, this.f24280z);
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: n */
        void mo14393n() {
            RangeDateSelector.this.proposedTextStart = null;
            RangeDateSelector.this.m14387h(this.f24277h, this.f24278i, this.f24280z);
        }
    }

    class toq extends zy {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ TextInputLayout f24281h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ TextInputLayout f24282i;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ qrj f24284z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, qrj qrjVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f24281h = textInputLayout2;
            this.f24282i = textInputLayout3;
            this.f24284z = qrjVar;
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: g */
        void mo14392g(@dd Long l2) {
            RangeDateSelector.this.proposedTextEnd = l2;
            RangeDateSelector.this.m14387h(this.f24281h, this.f24282i, this.f24284z);
        }

        @Override // com.google.android.material.datepicker.zy
        /* JADX INFO: renamed from: n */
        void mo14393n() {
            RangeDateSelector.this.proposedTextEnd = null;
            RangeDateSelector.this.m14387h(this.f24281h, this.f24282i, this.f24284z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m14387h(@lvui TextInputLayout textInputLayout, @lvui TextInputLayout textInputLayout2, @lvui qrj<C0639p<Long, Long>> qrjVar) {
        Long l2 = this.proposedTextStart;
        if (l2 == null || this.proposedTextEnd == null) {
            m14390y(textInputLayout, textInputLayout2);
            qrjVar.mo14415k();
        } else if (!m14389p(l2.longValue(), this.proposedTextEnd.longValue())) {
            ld6(textInputLayout, textInputLayout2);
            qrjVar.mo14415k();
        } else {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            qrjVar.toq(getSelection());
        }
    }

    private void ld6(@lvui TextInputLayout textInputLayout, @lvui TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: renamed from: p */
    private boolean m14389p(long j2, long j3) {
        return j2 <= j3;
    }

    /* JADX INFO: renamed from: y */
    private void m14390y(@lvui TextInputLayout textInputLayout, @lvui TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View cdj(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle, CalendarConstraints calendarConstraints, @lvui qrj<C0639p<Long, Long>> qrjVar) {
        View viewInflate = layoutInflater.inflate(C6095k.ld6.f79301gbni, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C6095k.y.ge);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(C6095k.y.j3y2);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.f7l8.m14538k()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewInflate.getResources().getString(C6095k.qrj.f79814i9jn);
        SimpleDateFormat simpleDateFormatM14398h = cdj.m14398h();
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            editText.setText(simpleDateFormatM14398h.format(l2));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l3 = this.selectedEndItem;
        if (l3 != null) {
            editText2.setText(simpleDateFormatM14398h.format(l3));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String strCdj = cdj.cdj(viewInflate.getResources(), simpleDateFormatM14398h);
        textInputLayout.setPlaceholderText(strCdj);
        textInputLayout2.setPlaceholderText(strCdj);
        editText.addTextChangedListener(new C3999k(strCdj, simpleDateFormatM14398h, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, qrjVar));
        editText2.addTextChangedListener(new toq(strCdj, simpleDateFormatM14398h, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, qrjVar));
        C4058z.m14622h(editText);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void fn3e(long j2) {
        Long l2 = this.selectedStartItem;
        if (l2 == null) {
            this.selectedStartItem = Long.valueOf(j2);
        } else if (this.selectedEndItem == null && m14389p(l2.longValue(), j2)) {
            this.selectedEndItem = Long.valueOf(j2);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j2);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        Long l3 = this.selectedEndItem;
        if (l3 != null) {
            arrayList.add(l3);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public Collection<C0639p<Long, Long>> getSelectedRanges() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0639p(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean ki() {
        Long l2 = this.selectedStartItem;
        return (l2 == null || this.selectedEndItem == null || !m14389p(l2.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: n */
    public int mo14373n(@lvui Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.toq.f7l8(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C6095k.g.ue) ? C6095k.zy.xypo : C6095k.zy.w82, f7l8.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public String n7h(@lvui Context context) {
        Resources resources = context.getResources();
        Long l2 = this.selectedStartItem;
        if (l2 == null && this.selectedEndItem == null) {
            return resources.getString(C6095k.qrj.f79789cfr);
        }
        Long l3 = this.selectedEndItem;
        if (l3 == null) {
            return resources.getString(C6095k.qrj.f79854v0af, C4013q.zy(l2.longValue()));
        }
        if (l2 == null) {
            return resources.getString(C6095k.qrj.f79829m4, C4013q.zy(l3.longValue()));
        }
        C0639p<String, String> c0639pM14436k = C4013q.m14436k(l2, l3);
        return resources.getString(C6095k.qrj.f79799etdu, c0639pM14436k.f3889k, c0639pM14436k.f50633toq);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: q */
    public int mo14374q() {
        return C6095k.qrj.f79847sok;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void kja0(@lvui C0639p<Long, Long> c0639p) {
        Long l2 = c0639p.f3889k;
        if (l2 != null && c0639p.f50633toq != null) {
            androidx.core.util.n7h.m2975k(m14389p(l2.longValue(), c0639p.f50633toq.longValue()));
        }
        Long l3 = c0639p.f3889k;
        this.selectedStartItem = l3 == null ? null : Long.valueOf(cdj.m14400k(l3.longValue()));
        Long l4 = c0639p.f50633toq;
        this.selectedEndItem = l4 != null ? Long.valueOf(cdj.m14400k(l4.longValue())) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @lvui
    public C0639p<Long, Long> getSelection() {
        return new C0639p<>(this.selectedStartItem, this.selectedEndItem);
    }
}
