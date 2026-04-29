package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ToolbarUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class ki {

    /* JADX INFO: renamed from: k */
    private static final Comparator<View> f24550k = new C4047k();

    /* JADX INFO: renamed from: com.google.android.material.internal.ki$k */
    /* JADX INFO: compiled from: ToolbarUtils.java */
    class C4047k implements Comparator<View> {
        C4047k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private ki() {
    }

    @dd
    public static TextView f7l8(@lvui Toolbar toolbar) {
        List<TextView> listM14557y = m14557y(toolbar, toolbar.getSubtitle());
        if (listM14557y.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listM14557y, f24550k);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static View m14552g(@lvui Toolbar toolbar) {
        ActionMenuView qVar = toq(toolbar);
        if (qVar == null || qVar.getChildCount() <= 1) {
            return null;
        }
        return qVar.getChildAt(0);
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ActionMenuItemView m14553k(@lvui Toolbar toolbar, @InterfaceC7843t int i2) {
        ActionMenuView qVar = toq(toolbar);
        if (qVar == null) {
            return null;
        }
        for (int i3 = 0; i3 < qVar.getChildCount(); i3++) {
            View childAt = qVar.getChildAt(i3);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i2) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static ImageButton m14554n(@lvui Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static ImageView m14555q(@lvui Toolbar toolbar) {
        return zy(toolbar, toolbar.getLogo());
    }

    @dd
    /* JADX INFO: renamed from: s */
    public static TextView m14556s(@lvui Toolbar toolbar) {
        List<TextView> listM14557y = m14557y(toolbar, toolbar.getTitle());
        if (listM14557y.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listM14557y, f24550k);
    }

    @dd
    public static ActionMenuView toq(@lvui Toolbar toolbar) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static List<TextView> m14557y(@lvui Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @dd
    private static ImageView zy(@lvui Toolbar toolbar, @dd Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }
}
