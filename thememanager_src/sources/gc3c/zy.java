package gc3c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import zy.nn86;

/* JADX INFO: compiled from: WidgetSuitViewHolderController.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f77003fn3e = 2;

    /* JADX INFO: renamed from: i */
    public static final int f35022i = 1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f77004ni7 = 4;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f77005t8r = "WidgetSuitViewHolderController";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f77006zurt = 3;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private x2.C1735g f77007cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private NinePatchImageView f77008f7l8;

    /* JADX INFO: renamed from: g */
    private FrameLayout f35023g;

    /* JADX INFO: renamed from: h */
    private x2.C1735g f35024h;

    /* JADX INFO: renamed from: k */
    private Activity f35025k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f77009ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f77010kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private LinearLayout f77011ld6;

    /* JADX INFO: renamed from: n */
    private final Resources f35026n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f77012n7h;

    /* JADX INFO: renamed from: p */
    private TextView f35027p;

    /* JADX INFO: renamed from: q */
    private final View f35028q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private TextView f77013qrj;

    /* JADX INFO: renamed from: s */
    private TextView f35029s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f77014toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ImageView f77015x2;

    /* JADX INFO: renamed from: y */
    private TextView f35030y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f77016zy;

    public zy(BaseThemeAdapter adapter, View itemView, int source) {
        this.f35025k = null;
        this.f77014toq = false;
        this.f77016zy = 0;
        this.f35028q = itemView;
        this.f35026n = itemView.getResources();
        this.f77009ki = source;
        if (adapter != null) {
            this.f35025k = adapter.ki();
            if (adapter instanceof RecommendListViewAdapter) {
                RecommendListViewAdapter recommendListViewAdapter = (RecommendListViewAdapter) adapter;
                this.f77014toq = recommendListViewAdapter.ncyb();
                this.f77016zy = recommendListViewAdapter.x9kr();
            }
        }
        m22296p(itemView);
    }

    private float fu4(String snapshotAspectRatio) {
        String str;
        String str2 = "";
        if (TextUtils.isEmpty(snapshotAspectRatio)) {
            return m22293y();
        }
        String[] strArrSplit = snapshotAspectRatio.split(":");
        if (strArrSplit.length == 2) {
            try {
                String str3 = strArrSplit[0];
                try {
                    str2 = strArrSplit[1];
                    float f2 = Float.parseFloat(str3) / Float.parseFloat(str2);
                    return f2 <= 0.0f ? m22293y() : f2;
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    str2 = str3;
                    Log.e(f77005t8r, "splitSnapshotAspectRatio error(width = " + str2 + ", height = " + str + "): \n" + e);
                    return m22293y();
                }
            } catch (Exception e3) {
                e = e3;
                str = "";
            }
        }
        return m22293y();
    }

    /* JADX INFO: renamed from: i */
    private void m22288i(int width, int height) {
        ViewGroup.LayoutParams layoutParams;
        NinePatchImageView ninePatchImageView = this.f77008f7l8;
        if (ninePatchImageView == null || (layoutParams = ninePatchImageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f77008f7l8.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    private void m22289k(String imageUrl, int position, int displayWidth, int displayHeight) {
        if (this.f77008f7l8 == null) {
            Log.w(f77005t8r, "displayPreviewImage ignored: mPreviewImageView == null");
        } else if (this.f35025k == null) {
            Log.w(f77005t8r, "displayPreviewImage ignored: mActivity == null");
        } else {
            x2.m6782y(this.f35025k, imageUrl, this.f77008f7l8, m22292s(position, displayWidth, displayHeight));
        }
    }

    /* JADX INFO: renamed from: n */
    private void m22290n() {
        int i2 = this.f77016zy;
        if (i2 > 0) {
            this.f77012n7h = i2;
        } else {
            this.f77012n7h = (int) this.f35026n.getDimension(toq());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m22291q() {
        this.f77007cdj = x2.fn3e().wvg(0).x9kr(this.f35026n.getDimensionPixelSize(R.dimen.widget_designer_avatar_width), this.f35026n.getDimensionPixelSize(R.dimen.widget_designer_avatar_height));
    }

    /* JADX INFO: renamed from: s */
    private x2.C1735g m22292s(int position, int displayWidth, int displayHeight) {
        if (this.f35024h == null) {
            this.f35024h = x2.fn3e().jk(3);
        }
        this.f35024h.m6793r(x2.t8r(position, 0.0f, this.f77014toq)).x9kr(displayWidth, displayHeight);
        return this.f35024h;
    }

    private int toq() {
        return this.f77009ki != 2 ? R.dimen.widget_preview_image_width_stagger : R.dimen.widget_preview_image_width_nested;
    }

    /* JADX INFO: renamed from: y */
    private float m22293y() {
        return this.f77009ki == 2 ? 0.611276f : 0.6105528f;
    }

    public static View zy(Context context, ViewGroup parent, boolean attachToRoot) {
        return LayoutInflater.from(context).inflate(R.layout.common_item_widget_suit, parent, attachToRoot);
    }

    public void cdj(String contentDescription) {
        if (this.f35028q == null || TextUtils.isEmpty(contentDescription)) {
            return;
        }
        C1812k.toq(this.f35028q, contentDescription);
    }

    public boolean f7l8(final int id) {
        return id == R.id.preview_container || id == R.id.title || id == R.id.brief;
    }

    public void fn3e(String title) {
        if (TextUtils.isEmpty(title)) {
            this.f35029s.setVisibility(8);
        } else {
            this.f35029s.setVisibility(0);
            this.f35029s.setText(title);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m22294g(final int id) {
        return id == R.id.designer_container;
    }

    /* JADX INFO: renamed from: h */
    public void m22295h(@nn86 int textResId) {
        TextView textView = this.f35030y;
        if (textView != null) {
            textView.setVisibility(0);
            this.f35030y.setText(textResId);
        }
    }

    public void ki(String imageUrl, String snapshotAspectRatio, int position) {
        float fFu4 = fu4(snapshotAspectRatio);
        int i2 = this.f77012n7h;
        int i3 = (int) (i2 / fFu4);
        this.f77010kja0 = i3;
        m22288i(i2, i3);
        m22289k(imageUrl, position, this.f77012n7h, this.f77010kja0);
    }

    public void kja0(String designerName) {
        if (TextUtils.isEmpty(designerName)) {
            this.f77013qrj.setVisibility(4);
        } else {
            this.f77013qrj.setVisibility(0);
            this.f77013qrj.setText(designerName);
        }
    }

    public void ld6(String brief) {
        if (TextUtils.isEmpty(brief)) {
            this.f35027p.setVisibility(8);
        } else {
            this.f35027p.setVisibility(0);
            this.f35027p.setText(brief);
        }
    }

    public void n7h(String designerAvatarUrl, String designerName) {
        if (TextUtils.isEmpty(designerAvatarUrl) && TextUtils.isEmpty(designerName)) {
            this.f77011ld6.setVisibility(8);
            return;
        }
        this.f77011ld6.setVisibility(0);
        x2(designerAvatarUrl);
        kja0(designerName);
    }

    public void ni7(boolean shouldShow) {
        TextView textView = this.f35030y;
        if (textView != null) {
            textView.setVisibility(shouldShow ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m22296p(View itemView) {
        this.f35023g = (FrameLayout) itemView.findViewById(R.id.preview_container);
        this.f77008f7l8 = (NinePatchImageView) itemView.findViewById(R.id.preview_image);
        this.f35030y = (TextView) itemView.findViewById(R.id.incompatible_flag);
        this.f35029s = (TextView) itemView.findViewById(R.id.title);
        this.f35027p = (TextView) itemView.findViewById(R.id.brief);
        this.f77011ld6 = (LinearLayout) itemView.findViewById(R.id.designer_container);
        this.f77015x2 = (ImageView) itemView.findViewById(R.id.designer_avatar_icon);
        this.f77013qrj = (TextView) itemView.findViewById(R.id.designer_name);
        m22290n();
        m22291q();
        FrameLayout frameLayout = this.f35023g;
        if (frameLayout != null) {
            C6077k.o1t(frameLayout);
        }
    }

    public void qrj(View.OnClickListener listener) {
        LinearLayout linearLayout = this.f77011ld6;
        if (linearLayout == null || listener == null) {
            return;
        }
        linearLayout.setOnClickListener(listener);
    }

    public void t8r(String contentDescription) {
        if (this.f77008f7l8 == null || TextUtils.isEmpty(contentDescription)) {
            return;
        }
        C1812k.toq(this.f77008f7l8, contentDescription);
    }

    public void x2(String designerAvatarUrl) {
        if (TextUtils.isEmpty(designerAvatarUrl)) {
            this.f77015x2.setVisibility(4);
            return;
        }
        this.f77015x2.setVisibility(0);
        Activity activity = this.f35025k;
        if (activity != null) {
            x2.m6782y(activity, designerAvatarUrl, this.f77015x2, this.f77007cdj);
        } else {
            Log.w(f77005t8r, "setDesignerAvatar failed: mActivity == null");
            this.f77015x2.setVisibility(4);
        }
    }

    public void zurt(View.OnClickListener listener, boolean excludePreviewClick) {
        if (listener != null) {
            FrameLayout frameLayout = this.f35023g;
            if (frameLayout != null && !excludePreviewClick) {
                frameLayout.setOnClickListener(listener);
            }
            TextView textView = this.f35029s;
            if (textView != null) {
                textView.setOnClickListener(listener);
            }
            TextView textView2 = this.f35027p;
            if (textView2 != null) {
                textView2.setOnClickListener(listener);
            }
        }
    }

    public zy(Activity activity, boolean isDarkMode, int staggerViewHolderWidth, View itemView, int source) {
        this.f35025k = null;
        this.f77014toq = false;
        this.f77016zy = 0;
        this.f35028q = itemView;
        this.f35026n = itemView.getResources();
        this.f77009ki = source;
        this.f35025k = activity;
        this.f77014toq = isDarkMode;
        this.f77016zy = staggerViewHolderWidth;
        m22296p(itemView);
    }
}
