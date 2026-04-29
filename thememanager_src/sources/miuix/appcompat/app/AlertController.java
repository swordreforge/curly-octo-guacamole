package miuix.appcompat.app;

import android.R;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsAnimation;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0107y;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.appcompat.app.ki;
import miuix.appcompat.internal.widget.DialogButtonPanel;
import miuix.appcompat.internal.widget.DialogParentPanel2;
import miuix.appcompat.internal.widget.DialogRootView;
import miuix.appcompat.internal.widget.NestedScrollViewExpander;
import miuix.appcompat.widget.toq;
import miuix.core.util.C7080i;
import miuix.core.util.C7085q;
import miuix.core.util.SystemProperties;
import miuix.device.C7106k;
import miuix.internal.util.C7164n;
import miuix.internal.util.C7168p;
import miuix.internal.util.C7169q;
import miuix.internal.util.C7172y;
import miuix.internal.widget.GroupButton;
import miuix.reflect.C7320k;
import miuix.view.C7380g;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
class AlertController {

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private static final int f86733i9jn = 16;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private static final int f86734ltg8 = 32;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private static final int f86735py = 768;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private static final int f86736r8s8 = 394;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private static final String f86737zsr0 = "AlertController";

    /* JADX INFO: renamed from: a */
    private boolean f38737a;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    Button f86738a9;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private boolean f86739a98o;

    /* JADX INFO: renamed from: b */
    boolean f38738b;

    /* JADX INFO: renamed from: c */
    int f38739c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f86743cdj;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private WindowManager f86744ch;

    /* JADX INFO: renamed from: d */
    private ki.zy f38740d;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private int f86745d2ok;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private TextView f86748dd;

    /* JADX INFO: renamed from: e */
    private final boolean f38741e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f86751eqxt;

    /* JADX INFO: renamed from: f */
    private final int f38742f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private CharSequence f86755fti;

    /* JADX INFO: renamed from: g */
    private boolean f38743g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f86757g1;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private boolean f86758gbni;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private List<ButtonInfo> f86759gvn7;

    /* JADX INFO: renamed from: h */
    private int f38744h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private DialogRootView f86761hb;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f86763i1;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    private CharSequence f86764ikck;

    /* JADX INFO: renamed from: j */
    private View f38746j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    Message f86765jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    Message f86766jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f86767ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f86768kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    ListView f86769ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    int f86770lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private int f86772lvui;

    /* JADX INFO: renamed from: m */
    private boolean f38749m;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private CharSequence f86773mcp;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    private ki.InterfaceC6948n f86774mu;

    /* JADX INFO: renamed from: n */
    private final Window f38750n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    ListAdapter f86775n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private View f86776n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private View f86777ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private DisplayCutout f86778ni7;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private int f86779nmn5;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    Handler f86780nn86;

    /* JADX INFO: renamed from: o */
    private DialogParentPanel2 f38751o;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private CharSequence f86781o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private Drawable f86782oc;

    /* JADX INFO: renamed from: p */
    private CharSequence f38752p;

    /* JADX INFO: renamed from: q */
    final DialogC0107y f38753q;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private int f86784qo;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f86785qrj;

    /* JADX INFO: renamed from: r */
    private TextView f38754r;

    /* JADX INFO: renamed from: s */
    private CharSequence f38755s;

    /* JADX INFO: renamed from: t */
    Button f38756t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f86787t8r;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private final Thread f86788tfm;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f86789toq;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    int f86790uv6;

    /* JADX INFO: renamed from: v */
    private boolean f38758v;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    private ki.InterfaceC6949q f86791vq;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    int f86792vyq;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private boolean f86794wo;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    Message f86795wvg;

    /* JADX INFO: renamed from: x */
    private int f38759x;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private View f86796x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private TextView f86797x9kr;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    private Configuration f86798xwq3;

    /* JADX INFO: renamed from: y */
    private CharSequence f38760y;

    /* JADX INFO: renamed from: z */
    Button f38761z;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private int f86802zp;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Context f86804zy;

    /* JADX INFO: renamed from: k */
    private boolean f38747k = false;

    /* JADX INFO: renamed from: i */
    private int f38745i = -1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f86753fn3e = false;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f86803zurt = -2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private TextWatcher f86756fu4 = new TextWatcher() { // from class: miuix.appcompat.app.AlertController.1
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (AlertController.this.f38751o != null) {
                DialogParentPanel2 dialogParentPanel2 = AlertController.this.f38751o;
                int i2 = toq.C6054p.f76438w831;
                if (dialogParentPanel2.findViewById(i2) != null) {
                    AlertController.this.f38751o.findViewById(i2).requestLayout();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    };

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private int f86746d3 = 0;

    /* JADX INFO: renamed from: l */
    private TextView f38748l = null;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    int f86762hyr = -1;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private boolean f86801yz = true;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private boolean f86800y9n = true;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private int f86740bf2 = 0;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private float f86771lv5 = 18.0f;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private float f86786t8iq = 17.0f;

    /* JADX INFO: renamed from: u */
    private float f38757u = 14.0f;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f86741bo = 18.0f;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private Point f86799y2 = new Point();

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private Point f86742c8jq = new Point();

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private Point f86760gyi = new Point();

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private Rect f86749dr = new Rect();

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    private ki.InterfaceC6949q f86783qkj8 = new ki.InterfaceC6949q() { // from class: miuix.appcompat.app.AlertController.2
        @Override // miuix.appcompat.app.ki.InterfaceC6949q
        public void onShowAnimComplete() {
            AlertController.this.f38737a = false;
            if (AlertController.this.f86791vq != null) {
                AlertController.this.f86791vq.onShowAnimComplete();
            }
        }

        @Override // miuix.appcompat.app.ki.InterfaceC6949q
        public void onShowAnimStart() {
            AlertController.this.f38737a = true;
            if (AlertController.this.f86791vq != null) {
                AlertController.this.f86791vq.onShowAnimStart();
            }
        }
    };

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private final View.OnClickListener f86747d8wk = new View.OnClickListener() { // from class: miuix.appcompat.app.AlertController.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2 = C7385p.f42278s;
            AlertController alertController = AlertController.this;
            if (view == alertController.f38761z) {
                Message message = alertController.f86795wvg;
                messageObtain = message != null ? Message.obtain(message) : null;
                i2 = C7385p.f42280y;
            } else if (view == alertController.f38756t) {
                Message message2 = alertController.f86765jk;
                if (message2 != null) {
                    messageObtain = Message.obtain(message2);
                }
            } else if (view == alertController.f86738a9) {
                Message message3 = alertController.f86766jp0y;
                if (message3 != null) {
                    messageObtain = Message.obtain(message3);
                }
            } else {
                if (alertController.f86759gvn7 != null && !AlertController.this.f86759gvn7.isEmpty()) {
                    Iterator it = AlertController.this.f86759gvn7.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ButtonInfo buttonInfo = (ButtonInfo) it.next();
                        if (view == buttonInfo.mButton) {
                            Message messageObtain = buttonInfo.mMsg;
                            if (messageObtain != null) {
                                messageObtain = Message.obtain(messageObtain);
                            }
                            messageObtain = messageObtain;
                        }
                    }
                }
                if ((view instanceof GroupButton) && ((GroupButton) view).zy()) {
                    i2 = C7385p.f42280y;
                }
            }
            HapticCompat.performHapticFeedbackAsync(view, C7385p.f92238fti, i2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController.this.f86780nn86.sendEmptyMessage(-1651327837);
        }
    };

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private boolean f86793was = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f86752f7l8 = true;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private final LayoutChangeListener f86750ek5k = new LayoutChangeListener(this);

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    private boolean f86754fnq8 = !C7172y.m25998k();

    /* JADX INFO: renamed from: miuix.appcompat.app.AlertController$8 */
    class ViewOnApplyWindowInsetsListenerC69058 implements View.OnApplyWindowInsetsListener {
        ViewOnApplyWindowInsetsListenerC69058() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onApplyWindowInsets$0(WindowInsets windowInsets) {
            AlertController.this.r25n(windowInsets);
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        @hyr(api = 30)
        public WindowInsets onApplyWindowInsets(View view, final WindowInsets windowInsets) {
            AlertController.this.f86757g1 = (int) (r0.nn86() + AlertController.this.f38751o.getTranslationY());
            if (view != null && windowInsets != null) {
                view.post(new Runnable() { // from class: miuix.appcompat.app.kja0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38956k.lambda$onApplyWindowInsets$0(windowInsets);
                    }
                });
            }
            return WindowInsets.CONSUMED;
        }
    }

    static class AlertParams {
        int iconHeight;
        int iconWidth;
        ListAdapter mAdapter;
        CharSequence mCheckBoxMessage;
        boolean[] mCheckedItems;
        CharSequence mComment;
        final Context mContext;
        Cursor mCursor;
        View mCustomTitleView;
        boolean mEnableEnterAnim;
        List<ButtonInfo> mExtraButtonList;
        boolean mHapticFeedbackEnabled;
        Drawable mIcon;
        final LayoutInflater mInflater;
        boolean mIsChecked;
        String mIsCheckedColumn;
        boolean mIsMultiChoice;
        boolean mIsSingleChoice;
        CharSequence[] mItems;
        String mLabelColumn;
        int mLiteVersion;
        CharSequence mMessage;
        DialogInterface.OnClickListener mNegativeButtonListener;
        CharSequence mNegativeButtonText;
        DialogInterface.OnClickListener mNeutralButtonListener;
        CharSequence mNeutralButtonText;
        DialogInterface.OnCancelListener mOnCancelListener;
        DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        DialogInterface.OnClickListener mOnClickListener;
        ki.InterfaceC6949q mOnDialogShowAnimListener;
        DialogInterface.OnDismissListener mOnDismissListener;
        AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        DialogInterface.OnKeyListener mOnKeyListener;
        OnPrepareListViewListener mOnPrepareListViewListener;
        DialogInterface.OnShowListener mOnShowListener;
        ki.InterfaceC6948n mPanelSizeChangedListener;
        DialogInterface.OnClickListener mPositiveButtonListener;
        CharSequence mPositiveButtonText;
        boolean mPreferLandscape;
        boolean mSmallIcon;
        CharSequence mTitle;
        View mView;
        int mViewLayoutResId;
        int mIconId = 0;
        int mIconAttrId = 0;
        int mCheckedItem = -1;
        boolean mCancelable = true;
        boolean mEnableDialogImmersive = !C7172y.m25998k();
        int mNonImmersiveDialogHeight = -2;

        interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        AlertParams(Context context) {
            this.mContext = context;
            int iT8r = C7106k.t8r();
            this.mLiteVersion = iT8r;
            if (iT8r < 0) {
                this.mLiteVersion = 0;
            }
            this.mEnableEnterAnim = true;
            this.mExtraButtonList = new ArrayList();
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void createListView(final AlertController alertController) {
            ListAdapter checkedItemAdapter;
            final ListView listView = (ListView) this.mInflater.inflate(alertController.f38739c, (ViewGroup) null);
            if (this.mIsMultiChoice) {
                checkedItemAdapter = this.mCursor == null ? new ArrayAdapter<CharSequence>(this.mContext, alertController.f86770lrht, R.id.text1, this.mItems) { // from class: miuix.appcompat.app.AlertController.AlertParams.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i2, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i2, view, viewGroup);
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null && zArr[i2]) {
                            listView.setItemChecked(i2, true);
                        }
                        C7380g.toq(view2, false);
                        return view2;
                    }
                } : new CursorAdapter(this.mContext, this.mCursor, false) { // from class: miuix.appcompat.app.AlertController.AlertParams.2
                    private final int mIsCheckedIndex;
                    private final int mLabelIndex;

                    {
                        Cursor cursor = getCursor();
                        this.mLabelIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                        this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.mLabelIndex));
                        listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        View viewInflate = AlertParams.this.mInflater.inflate(alertController.f86770lrht, viewGroup, false);
                        C7380g.toq(viewInflate, false);
                        return viewInflate;
                    }
                };
            } else {
                int i2 = this.mIsSingleChoice ? alertController.f86790uv6 : alertController.f86792vyq;
                if (this.mCursor != null) {
                    checkedItemAdapter = new SimpleCursorAdapter(this.mContext, i2, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1}) { // from class: miuix.appcompat.app.AlertController.AlertParams.3
                        @Override // android.widget.CursorAdapter, android.widget.Adapter
                        public View getView(int i3, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i3, view, viewGroup);
                            if (view == null) {
                                C7169q.zy(view2);
                            }
                            return view2;
                        }
                    };
                } else {
                    checkedItemAdapter = this.mAdapter;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new CheckedItemAdapter(this.mContext, i2, R.id.text1, this.mItems);
                    }
                }
            }
            OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(listView);
            }
            alertController.f86775n5r1 = checkedItemAdapter;
            alertController.f86762hyr = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: miuix.appcompat.app.AlertController.AlertParams.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                        AlertParams.this.mOnClickListener.onClick(alertController.f38753q, i3);
                        if (AlertParams.this.mIsSingleChoice) {
                            return;
                        }
                        alertController.f38753q.dismiss();
                    }
                });
            } else if (this.mOnCheckboxClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: miuix.appcompat.app.AlertController.AlertParams.5
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null) {
                            zArr[i3] = listView.isItemChecked(i3);
                        }
                        AlertParams.this.mOnCheckboxClickListener.onClick(alertController.f38753q, i3, listView.isItemChecked(i3));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                listView.setChoiceMode(2);
            }
            alertController.f86769ld6 = listView;
        }

        void apply(AlertController alertController) {
            int i2;
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.bek6(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.pc(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.mbx(drawable);
                }
                int i3 = this.mIconId;
                if (i3 != 0) {
                    alertController.vep5(i3);
                }
                int i4 = this.mIconAttrId;
                if (i4 != 0) {
                    alertController.vep5(alertController.yz(i4));
                }
                if (this.mSmallIcon) {
                    alertController.ij(true);
                }
                int i5 = this.iconWidth;
                if (i5 != 0 && (i2 = this.iconHeight) != 0) {
                    alertController.jbh(i5, i2);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.wx16(charSequence2);
            }
            CharSequence charSequence3 = this.mComment;
            if (charSequence3 != null) {
                alertController.ktq(charSequence3);
            }
            CharSequence charSequence4 = this.mPositiveButtonText;
            if (charSequence4 != null) {
                alertController.zkd(-1, charSequence4, this.mPositiveButtonListener, null);
            }
            CharSequence charSequence5 = this.mNegativeButtonText;
            if (charSequence5 != null) {
                alertController.zkd(-2, charSequence5, this.mNegativeButtonListener, null);
            }
            CharSequence charSequence6 = this.mNeutralButtonText;
            if (charSequence6 != null) {
                alertController.zkd(-3, charSequence6, this.mNeutralButtonListener, null);
            }
            if (this.mExtraButtonList != null) {
                alertController.f86759gvn7 = new ArrayList(this.mExtraButtonList);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                createListView(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                alertController.zwy(view2);
            } else {
                int i6 = this.mViewLayoutResId;
                if (i6 != 0) {
                    alertController.nsb(i6);
                }
            }
            CharSequence charSequence7 = this.mCheckBoxMessage;
            if (charSequence7 != null) {
                alertController.jz5(this.mIsChecked, charSequence7);
            }
            alertController.f38738b = this.mHapticFeedbackEnabled;
            alertController.h7am(this.mEnableDialogImmersive);
            alertController.ixz(this.mNonImmersiveDialogHeight);
            alertController.uc(this.mLiteVersion);
            alertController.ukdy(this.mPreferLandscape);
            alertController.m28297do(this.mPanelSizeChangedListener);
            alertController.cv06(this.mEnableEnterAnim);
        }
    }

    private static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = -1651327837;
        private final WeakReference<DialogInterface> mDialog;

        ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DialogInterface dialogInterface = this.mDialog.get();
            int i2 = message.what;
            if (i2 != MSG_DISMISS_DIALOG) {
                ((DialogInterface.OnClickListener) message.obj).onClick(dialogInterface, i2);
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    private static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public CheckedItemAdapter(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @zy.lvui
        public View getView(int i2, @zy.dd View view, @zy.lvui ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            if (view == null) {
                C7169q.zy(view2);
            }
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    private static class LayoutChangeListener implements View.OnLayoutChangeListener {
        private final WeakReference<AlertController> mHost;
        private final Rect mWindowVisibleFrame = new Rect();

        LayoutChangeListener(AlertController alertController) {
            this.mHost = new WeakReference<>(alertController);
        }

        private void changeViewPadding(View view, int i2, int i3) {
            view.setPadding(i2, 0, i3, 0);
        }

        private void handleImeChange(View view, Rect rect, AlertController alertController) {
            int height = (view.getHeight() - alertController.m24827e()) - rect.bottom;
            if (height > 0) {
                int i2 = -height;
                int i3 = Build.VERSION.SDK_INT;
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                systemWindowInsetBottom = (rootWindowInsets != null ? i3 >= 30 ? rootWindowInsets.getInsets(WindowInsets$Type.systemBars()).bottom : rootWindowInsets.getSystemWindowInsetBottom() : 0) + i2;
                miuix.appcompat.widget.toq.m25495k();
            }
            alertController.cnbm(systemWindowInsetBottom);
        }

        private void handleMultiWindowLandscapeChange(AlertController alertController, int i2) {
            if (!miuix.core.util.ld6.kja0(alertController.f86804zy)) {
                DialogRootView dialogRootView = alertController.f86761hb;
                if (dialogRootView.getPaddingLeft() > 0 || dialogRootView.getPaddingRight() > 0) {
                    changeViewPadding(dialogRootView, 0, 0);
                    return;
                }
                return;
            }
            Rect rect = this.mWindowVisibleFrame;
            if (rect.left <= 0) {
                changeViewPadding(alertController.f86761hb, 0, 0);
                return;
            }
            int iWidth = i2 - rect.width();
            if (this.mWindowVisibleFrame.right == i2) {
                changeViewPadding(alertController.f86761hb, iWidth, 0);
            } else {
                changeViewPadding(alertController.f86761hb, 0, iWidth);
            }
        }

        public boolean hasNavigationBarHeightInMultiWindowMode() {
            C7080i.f7l8(this.mHost.get().f86804zy, this.mHost.get().f86760gyi);
            Rect rect = this.mWindowVisibleFrame;
            return (rect.left == 0 && rect.right == this.mHost.get().f86760gyi.x && this.mWindowVisibleFrame.top <= C7085q.m25609y(this.mHost.get().f86804zy, false)) ? false : true;
        }

        public boolean isInMultiScreenTop() {
            AlertController alertController = this.mHost.get();
            if (alertController == null) {
                return false;
            }
            C7080i.f7l8(alertController.f86804zy, alertController.f86760gyi);
            Rect rect = this.mWindowVisibleFrame;
            if (rect.left != 0 || rect.right != alertController.f86760gyi.x) {
                return false;
            }
            int i2 = (int) (alertController.f86760gyi.y * 0.75f);
            Rect rect2 = this.mWindowVisibleFrame;
            return rect2.top >= 0 && rect2.bottom <= i2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            AlertController alertController = this.mHost.get();
            if (alertController != null) {
                view.getWindowVisibleDisplayFrame(this.mWindowVisibleFrame);
                handleMultiWindowLandscapeChange(alertController, i4);
                if (Build.VERSION.SDK_INT < 30) {
                    if (view.findFocus() != null) {
                        if (alertController.ikck()) {
                            return;
                        }
                        handleImeChange(view, this.mWindowVisibleFrame, alertController);
                    } else if (alertController.f38751o.getTranslationY() < 0.0f) {
                        alertController.cnbm(0);
                    }
                }
            }
        }
    }

    public AlertController(Context context, DialogC0107y dialogC0107y, Window window) {
        this.f86804zy = context;
        this.f86779nmn5 = context.getResources().getConfiguration().densityDpi;
        this.f38753q = dialogC0107y;
        this.f38750n = window;
        this.f86780nn86 = new ButtonHandler(dialogC0107y);
        m24843u(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, toq.ki.f76075etdu, R.attr.alertDialogStyle, 0);
        this.f38742f = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76224yqrt, 0);
        this.f38739c = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76051bwp, 0);
        this.f86770lrht = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76180se, 0);
        this.f86790uv6 = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76052bz2, 0);
        this.f86792vyq = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76115kcsr, 0);
        this.f38741e = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76232zkd, true);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0107y.m253n(1);
        if (Build.VERSION.SDK_INT < 28 && qkj8()) {
            C7168p.m25964k(window, "addExtraFlags", new Class[]{Integer.TYPE}, Integer.valueOf(f86735py));
        }
        this.f86763i1 = context.getResources().getBoolean(toq.C6053n.f76259x2);
        this.f38744h = context.getResources().getDimensionPixelSize(toq.f7l8.cjaj);
        this.f86743cdj = context.getResources().getDimensionPixelSize(toq.f7l8.eu);
        this.f86788tfm = Thread.currentThread();
        xwq3();
        if (this.f38747k) {
            Log.d(f86737zsr0, "create Dialog mCurrentDensityDpi " + this.f86779nmn5);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m24824a(boolean z2, boolean z3) {
        int i2;
        int i3 = toq.qrj.f76771y9n;
        this.f38749m = false;
        if (this.f86794wo && oki()) {
            i3 = toq.qrj.f34940b;
            this.f38749m = true;
            i2 = this.f86743cdj;
        } else {
            i2 = z3 ? this.f38744h : z2 ? this.f86763i1 ? this.f38759x : this.f86802zp : -1;
        }
        if (this.f86768kja0 != i3) {
            this.f86768kja0 = i3;
            DialogParentPanel2 dialogParentPanel2 = this.f38751o;
            if (dialogParentPanel2 != null) {
                this.f86761hb.removeView(dialogParentPanel2);
            }
            DialogParentPanel2 dialogParentPanel22 = (DialogParentPanel2) LayoutInflater.from(this.f86804zy).inflate(this.f86768kja0, (ViewGroup) this.f86761hb, false);
            this.f38751o = dialogParentPanel22;
            dialogParentPanel22.setVerticalAvoidSpace(nmn5());
            this.f86761hb.addView(this.f38751o);
        }
        return i2;
    }

    private void a5id() {
        if (m24849v()) {
            wlev();
        } else {
            ga();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b8(@zy.lvui ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.custom);
        boolean z2 = frameLayout != null && frameLayout.getChildCount() > 0;
        ListView listView = this.f86769ld6;
        if (listView == null) {
            if (z2) {
                C0683f.ew(frameLayout.getChildAt(0), true);
            }
            NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
            if (!z2) {
                frameLayout = null;
            }
            nestedScrollViewExpander.setExpandView(frameLayout);
            return;
        }
        if (!z2) {
            ((NestedScrollViewExpander) viewGroup).setExpandView(listView);
            return;
        }
        if (py()) {
            kcsr();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.weight = 0.0f;
            frameLayout.setLayoutParams(layoutParams);
            ((NestedScrollViewExpander) viewGroup).setExpandView(null);
            viewGroup.requestLayout();
            return;
        }
        jp0y();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams2);
        ((NestedScrollViewExpander) viewGroup).setExpandView((View) frameLayout.getParent());
        viewGroup.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b9ub(@zy.lvui ViewGroup viewGroup, @zy.lvui ViewGroup viewGroup2) {
        Point point = new Point();
        C7080i.f7l8(this.f86804zy, point);
        if (!(((float) this.f86799y2.y) <= ((float) Math.max(point.x, point.y)) * 0.3f || gvn7((DialogButtonPanel) viewGroup))) {
            bwp(viewGroup, this.f38751o);
        } else {
            bwp(viewGroup, viewGroup2);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    private void bap7(ViewGroup viewGroup) {
        CharSequence charSequence;
        this.f86748dd = (TextView) viewGroup.findViewById(toq.C6054p.f76361le7);
        this.f86797x9kr = (TextView) viewGroup.findViewById(toq.C6054p.f76446wx16);
        TextView textView = this.f86748dd;
        if (textView == null || (charSequence = this.f38755s) == null) {
            se(viewGroup);
            return;
        }
        textView.setText(charSequence);
        TextView textView2 = this.f86797x9kr;
        if (textView2 != null) {
            CharSequence charSequence2 = this.f38752p;
            if (charSequence2 != null) {
                textView2.setText(charSequence2);
            } else {
                textView2.setVisibility(8);
            }
        }
    }

    private void bwp(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 == viewGroup) {
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view);
    }

    /* JADX INFO: renamed from: c */
    private Point m24825c() {
        Point point = new Point();
        Point point2 = this.f86742c8jq;
        int iMin = point2.x;
        int iMax = point2.y;
        int iM24845x = m24845x();
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            rect = i1(true);
        }
        if (this.f86789toq) {
            if (iM24845x == 2) {
                Point point3 = this.f86742c8jq;
                iMin = Math.max(point3.x, point3.y);
                Point point4 = this.f86742c8jq;
                iMax = Math.min(point4.x, point4.y);
            }
            if (iM24845x == 1) {
                Point point5 = this.f86742c8jq;
                iMin = Math.min(point5.x, point5.y);
                Point point6 = this.f86742c8jq;
                iMax = Math.max(point6.x, point6.y);
            }
            Rect rectEk5k = ek5k(true);
            iMin -= rectEk5k.left + rectEk5k.right;
            iMax -= rectEk5k.top + rectEk5k.bottom;
        }
        int i2 = iMin - (rect.left + rect.right);
        int i3 = iMax - (rect.top + rect.bottom);
        point.x = i2;
        point.y = i3;
        return point;
    }

    private boolean c8jq() {
        return this.f86800y9n;
    }

    private Rect cfr(Rect rect) {
        rect.left = miuix.core.util.ld6.fn3e(this.f86804zy, rect.left);
        rect.top = miuix.core.util.ld6.fn3e(this.f86804zy, rect.top);
        rect.right = miuix.core.util.ld6.fn3e(this.f86804zy, rect.right);
        rect.bottom = miuix.core.util.ld6.fn3e(this.f86804zy, rect.bottom);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cnbm(int i2) {
        if (this.f38747k) {
            Log.d(f86737zsr0, "The DialogPanel transitionY for : " + i2);
        }
        this.f38751o.animate().cancel();
        this.f38751o.setTranslationY(i2);
    }

    /* JADX INFO: renamed from: d */
    private boolean m24826d() {
        return Settings.Secure.getInt(this.f86804zy.getContentResolver(), "synergy_mode", 0) == 1;
    }

    private boolean d2ok() {
        return this.f86788tfm == Thread.currentThread();
    }

    static boolean d3(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (d3(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private boolean d8wk(int i2, int i3, int i4) {
        if (i2 > i3) {
            return true;
        }
        return i2 >= i3 && i4 == 2;
    }

    private boolean dr(Configuration configuration) {
        Configuration configuration2 = this.f86798xwq3;
        return (configuration2.uiMode != configuration.uiMode) || (configuration2.screenLayout != configuration.screenLayout) || (configuration2.orientation != configuration.orientation) || (configuration2.screenWidthDp != configuration.screenWidthDp) || (configuration2.screenHeightDp != configuration.screenHeightDp) || ((configuration2.fontScale > configuration.fontScale ? 1 : (configuration2.fontScale == configuration.fontScale ? 0 : -1)) != 0) || (configuration2.smallestScreenWidthDp != configuration.smallestScreenWidthDp) || (configuration2.keyboard != configuration.keyboard) || this.f86789toq;
    }

    private void dxef() {
        vy(true, false, false, 1.0f);
        m58i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public int m24827e() {
        return 0;
    }

    private void e5(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) this.f38750n.findViewById(R.id.icon);
        View view = this.f86777ncyb;
        if (view != null) {
            se(view);
            viewGroup.addView(this.f86777ncyb, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f38750n.findViewById(toq.C6054p.f76329gyi).setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (!(!TextUtils.isEmpty(this.f38760y)) || !this.f38741e) {
            this.f38750n.findViewById(toq.C6054p.f76329gyi).setVisibility(8);
            imageView.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f38750n.findViewById(toq.C6054p.f76329gyi);
        this.f38754r = textView;
        textView.setText(this.f38760y);
        int i2 = this.f86746d3;
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            Drawable drawable = this.f86782oc;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                this.f38754r.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom());
                imageView.setVisibility(8);
            }
        }
        if (this.f86751eqxt) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.vahq);
            layoutParams.height = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.d6c);
        }
        if (this.f86745d2ok != 0 && this.f86772lvui != 0) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.width = this.f86745d2ok;
            layoutParams2.height = this.f86772lvui;
        }
        if (this.f38755s == null || viewGroup.getVisibility() == 8) {
            return;
        }
        oc(this.f38754r);
    }

    private Rect ek5k(boolean z2) {
        return Build.VERSION.SDK_INT >= 30 ? m24832j(z2) : new Rect();
    }

    private void eqxt() {
        View currentFocus = this.f38750n.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
            t8iq();
        }
    }

    private void ew(int i2, boolean z2, boolean z3) {
        if (i2 <= 0) {
            if (this.f38747k) {
                Log.d(f86737zsr0, "updateDialogPanelTranslationYByIme imeBottom <= 0");
            }
            if (this.f38751o.getTranslationY() < 0.0f) {
                cnbm(0);
                return;
            }
            return;
        }
        int iNn86 = (int) (nn86() + this.f38751o.getTranslationY());
        this.f86757g1 = iNn86;
        if (iNn86 <= 0) {
            this.f86757g1 = 0;
        }
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateDialogPanelTranslationYByIme mPanelAndImeMargin " + this.f86757g1 + " isMultiWindowMode " + z2 + " imeBottom " + i2);
        }
        int i3 = (!z3 || i2 >= this.f86757g1) ? (!z2 || z3) ? (-i2) + this.f86757g1 : -i2 : 0;
        if (!this.f38737a) {
            if (this.f38747k) {
                Log.d(f86737zsr0, "updateDialogPanelTranslationYByIme translateDialogPanel Y=" + i3);
            }
            cnbm(i3);
            return;
        }
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateDialogPanelTranslationYByIme anim translateDialogPanel Y=" + i3);
        }
        this.f38751o.animate().cancel();
        this.f38751o.animate().setDuration(200L).translationY(i3).start();
    }

    /* JADX INFO: renamed from: f */
    private Insets m24828f(int i2) {
        WindowInsets rootWindowInsets;
        Activity activityKja0 = ((ki) this.f38753q).kja0();
        if (activityKja0 == null || Build.VERSION.SDK_INT < 30 || (rootWindowInsets = activityKja0.getWindow().getDecorView().getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getInsets(i2);
    }

    private boolean fnq8() {
        boolean zKja0 = miuix.core.util.ld6.kja0(this.f86804zy);
        int i2 = this.f86804zy.getResources().getConfiguration().keyboard;
        boolean z2 = i2 == 2 || i2 == 3;
        boolean z3 = miuix.os.toq.f87880toq;
        byte b2 = (!zKja0 || ikck()) ? (byte) -1 : miuix.os.zy.f7l8(this.f86804zy) ? (byte) 0 : (byte) 1;
        if (this.f38737a) {
            if ((z3 && z2) || b2 != 0) {
                return false;
            }
        } else {
            if ((z3 && z2) || !this.f86758gbni) {
                return false;
            }
            if (!this.f86793was && !zKja0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(ViewGroup.LayoutParams layoutParams) {
        this.f38751o.setLayoutParams(layoutParams);
    }

    private void ga() {
        boolean zMu = mu();
        int i2 = m24825c().x;
        boolean zGcp = gcp(i2);
        int iM24824a = m24824a(zMu, zGcp);
        int iHb = hb(i2);
        int i3 = -1;
        if (!zGcp && iM24824a == -1) {
            iM24824a = miuix.core.util.ld6.m25581q(this.f86804zy, i2) - (iHb * 2);
        }
        int i4 = this.f86803zurt;
        if ((i4 <= 0 || i4 < this.f86799y2.y) && (!wo() || !this.f86753fn3e)) {
            i3 = i4;
        }
        int iM24835m = m24835m();
        this.f38750n.setGravity(iM24835m);
        WindowManager.LayoutParams attributes = this.f38750n.getAttributes();
        if ((iM24835m & 80) == 80) {
            int dimensionPixelSize = this.f86804zy.getResources().getDimensionPixelSize(this.f86789toq ? toq.f7l8.ie : toq.f7l8.vc);
            boolean zKi = miuix.core.util.ld6.ki(this.f86804zy);
            boolean z2 = miuix.core.util.ld6.kja0(this.f86804zy) && !this.f86753fn3e && miuix.os.zy.f7l8(this.f86804zy);
            if ((this.f86753fn3e || (z2 && zKi)) && Build.VERSION.SDK_INT >= 30) {
                Insets insetsM24828f = m24828f(WindowInsets$Type.captionBar());
                int dimensionPixelSize2 = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.oaex);
                int i5 = insetsM24828f != null ? insetsM24828f.bottom : 0;
                dimensionPixelSize = i5 == 0 ? dimensionPixelSize + dimensionPixelSize2 : dimensionPixelSize + i5;
            }
            int i6 = attributes.flags;
            if ((i6 & 134217728) != 0) {
                this.f38750n.clearFlags(134217728);
            }
            if ((i6 & 67108864) != 0) {
                this.f38750n.clearFlags(67108864);
            }
            attributes.verticalMargin = (dimensionPixelSize * 1.0f) / this.f86799y2.y;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 2;
        }
        this.f38750n.setAttributes(attributes);
        this.f38750n.addFlags(2);
        this.f38750n.addFlags(262144);
        this.f38750n.setDimAmount(0.3f);
        this.f38750n.setLayout(iM24824a, i3);
        this.f38750n.setBackgroundDrawableResource(toq.C6050g.q4lv);
        DialogParentPanel2 dialogParentPanel2 = this.f38751o;
        if (dialogParentPanel2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dialogParentPanel2.getLayoutParams();
            layoutParams.width = iM24824a;
            layoutParams.height = -2;
            this.f38751o.setLayoutParams(layoutParams);
            this.f38751o.setTag(null);
        }
        if (!this.f86752f7l8) {
            this.f38750n.setWindowAnimations(0);
        } else if (wo()) {
            this.f38750n.setWindowAnimations(toq.cdj.f34713i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gbni(View view) {
        if (y2() && c8jq()) {
            t8iq();
            this.f38753q.cancel();
        }
    }

    private void gc3c(View view) {
        if (this.f86752f7l8) {
            if ((view == null || wo() || m24849v() || !d3(view)) ? false : true) {
                this.f38750n.setWindowAnimations(toq.cdj.f75214fn3e);
            }
        }
    }

    private boolean gcp(int i2) {
        return i2 >= f86736r8s8;
    }

    private boolean gvn7(DialogButtonPanel dialogButtonPanel) {
        int buttonFullyVisibleHeight = dialogButtonPanel.getButtonFullyVisibleHeight();
        if (buttonFullyVisibleHeight <= 0) {
            return false;
        }
        float fMax = Math.max(C7085q.n7h(this.f86804zy).y, 1);
        float f2 = (buttonFullyVisibleHeight * 1.0f) / fMax;
        ViewGroup viewGroup = (ViewGroup) this.f38751o.findViewById(toq.C6054p.i0);
        return f2 >= 0.4f || (((float) (viewGroup != null ? viewGroup.getHeight() : 0)) * 1.0f) / fMax >= 0.45f || (this.f86789toq && m24845x() == 2);
    }

    private boolean h4b(ViewGroup viewGroup) {
        View view = this.f86776n7h;
        View viewInflate = null;
        if (view != null && view.getParent() != null) {
            se(this.f86776n7h);
            this.f86776n7h = null;
        }
        View view2 = this.f86796x2;
        if (view2 != null) {
            viewInflate = view2;
        } else if (this.f86785qrj != 0) {
            viewInflate = LayoutInflater.from(this.f86804zy).inflate(this.f86785qrj, viewGroup, false);
            this.f86776n7h = viewInflate;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !d3(viewInflate)) {
            this.f38750n.setFlags(131072, 131072);
        }
        gc3c(viewInflate);
        if (z2) {
            bwp(viewInflate, viewGroup);
        } else {
            se(viewGroup);
        }
        return z2;
    }

    private int hb(int i2) {
        return i2 < 360 ? this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.ie) : this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.ae4);
    }

    @hyr(api = 30)
    private Rect i1(boolean z2) {
        Rect rect = new Rect();
        Insets insetsM24828f = m24828f(WindowInsets$Type.navigationBars());
        if (insetsM24828f != null) {
            rect.set(insetsM24828f.left, insetsM24828f.top, insetsM24828f.right, insetsM24828f.bottom);
            return z2 ? cfr(rect) : rect;
        }
        int iM25606q = C7085q.m25606q(this.f86804zy, z2);
        int iZp = zp();
        if (iZp == 1) {
            rect.right = iM25606q;
        } else if (iZp == 2) {
            rect.top = iM25606q;
        } else if (iZp != 3) {
            rect.bottom = iM25606q;
        } else {
            rect.left = iM25606q;
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ikck() {
        return C7085q.cdj(this.f86804zy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ix(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f38746j.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i2) {
            marginLayoutParams.bottomMargin = i2;
            this.f38746j.requestLayout();
        }
    }

    @hyr(api = 30)
    /* JADX INFO: renamed from: j */
    private Rect m24832j(boolean z2) {
        String str;
        DisplayCutout displayCutout;
        Rect rect = new Rect();
        Insets insetsM24828f = m24828f(WindowInsets$Type.displayCutout());
        if (insetsM24828f != null) {
            if (!o05() || (displayCutout = this.f86778ni7) == null) {
                rect.set(insetsM24828f.left, insetsM24828f.top, insetsM24828f.right, insetsM24828f.bottom);
                str = "get cutout from host, cutout = " + rect.flattenToString();
            } else {
                rect.set(displayCutout.getSafeInsetLeft(), this.f86778ni7.getSafeInsetTop(), this.f86778ni7.getSafeInsetRight(), this.f86778ni7.getSafeInsetBottom());
                str = "tiny fold system alert, get cutout by reflect, cutout = " + rect.flattenToString();
            }
            sok("getDisplayCutout", str, false);
        } else {
            DisplayCutout displayCutoutVyq = vyq();
            rect.left = displayCutoutVyq != null ? displayCutoutVyq.getSafeInsetLeft() : 0;
            rect.top = displayCutoutVyq != null ? displayCutoutVyq.getSafeInsetTop() : 0;
            rect.right = displayCutoutVyq != null ? displayCutoutVyq.getSafeInsetRight() : 0;
            rect.bottom = displayCutoutVyq != null ? displayCutoutVyq.getSafeInsetBottom() : 0;
        }
        return z2 ? cfr(rect) : rect;
    }

    private void jp0y() {
        ViewGroup.LayoutParams layoutParams = this.f86769ld6.getLayoutParams();
        layoutParams.height = -2;
        this.f86769ld6.setLayoutParams(layoutParams);
    }

    private void kcsr() {
        int iCh = ch();
        int i2 = iCh * (((int) (this.f86799y2.y * 0.35f)) / iCh);
        this.f86769ld6.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = this.f86769ld6.getLayoutParams();
        layoutParams.height = i2;
        this.f86769ld6.setLayoutParams(layoutParams);
    }

    private void kx3() {
        Configuration configuration = this.f86804zy.getResources().getConfiguration();
        int iMin = (int) (Math.min(configuration.screenWidthDp, configuration.screenHeightDp) * (configuration.densityDpi / 160.0f));
        if (iMin > 0) {
            this.f86802zp = iMin;
            return;
        }
        Point point = new Point();
        this.f86744ch.getDefaultDisplay().getSize(point);
        this.f86802zp = Math.min(point.x, point.y);
    }

    /* JADX INFO: renamed from: l */
    private void m24834l(View view) {
        C7380g.toq(view, false);
    }

    private void lh(ViewGroup viewGroup, boolean z2) {
        View childAt;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.custom);
        boolean z3 = false;
        if (frameLayout != null) {
            if (z2) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(0, 200L);
                layoutTransition.setInterpolator(0, new zuf.ld6());
                frameLayout.setLayoutTransition(layoutTransition);
            } else {
                frameLayout.setLayoutTransition(null);
            }
        }
        if (this.f86769ld6 == null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(toq.C6054p.f76339ij);
            if (viewGroup2 != null) {
                bap7(viewGroup2);
            }
            if (frameLayout != null) {
                boolean zH4b = h4b(frameLayout);
                if (zH4b && (childAt = frameLayout.getChildAt(0)) != null) {
                    C0683f.ew(childAt, true);
                }
                z3 = zH4b;
            }
            NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
            if (!z3) {
                frameLayout = null;
            }
            nestedScrollViewExpander.setExpandView(frameLayout);
            return;
        }
        if (!(frameLayout != null ? h4b(frameLayout) : false)) {
            viewGroup.removeView(viewGroup.findViewById(toq.C6054p.f76339ij));
            se(frameLayout);
            se(this.f86769ld6);
            this.f86769ld6.setMinimumHeight(ch());
            C0683f.ew(this.f86769ld6, true);
            viewGroup.addView(this.f86769ld6, 0, new ViewGroup.MarginLayoutParams(-1, -2));
            ((NestedScrollViewExpander) viewGroup).setExpandView(this.f86769ld6);
            return;
        }
        int i2 = toq.C6054p.f76339ij;
        viewGroup.removeView(viewGroup.findViewById(i2));
        se(frameLayout);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        se(this.f86769ld6);
        C0683f.ew(this.f86769ld6, true);
        linearLayout.addView(this.f86769ld6, 0, new ViewGroup.MarginLayoutParams(-1, -2));
        boolean zPy = py();
        if (zPy) {
            kcsr();
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2, 0.0f));
        } else {
            jp0y();
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        viewGroup.addView(linearLayout, 0, new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(i2);
        if (viewGroup3 != null) {
            bap7(viewGroup3);
        }
        ((NestedScrollViewExpander) viewGroup).setExpandView(zPy ? null : linearLayout);
    }

    private int lv5() {
        Button button = this.f38761z;
        int i2 = 1;
        if (button == null) {
            i2 = 1 ^ (TextUtils.isEmpty(this.f86781o1t) ? 1 : 0);
        } else if (button.getVisibility() != 0) {
            i2 = 0;
        }
        Button button2 = this.f38756t;
        if (button2 == null ? !TextUtils.isEmpty(this.f86773mcp) : button2.getVisibility() == 0) {
            i2++;
        }
        Button button3 = this.f86738a9;
        if (button3 == null ? !TextUtils.isEmpty(this.f86755fti) : button3.getVisibility() == 0) {
            i2++;
        }
        List<ButtonInfo> list = this.f86759gvn7;
        if (list != null && !list.isEmpty()) {
            Iterator<ButtonInfo> it = this.f86759gvn7.iterator();
            while (it.hasNext()) {
                GroupButton groupButton = it.next().mButton;
                if (groupButton == null || groupButton.getVisibility() == 0) {
                    i2++;
                }
            }
        }
        return i2;
    }

    @hyr(api = 30)
    private void lvui() {
        if (this.f86758gbni) {
            this.f38750n.getDecorView().setWindowInsetsAnimationCallback(null);
            this.f38750n.getDecorView().setOnApplyWindowInsetsListener(null);
            this.f86758gbni = false;
        }
    }

    @hyr(api = 30)
    private void lw() {
        if (m24849v()) {
            this.f38750n.setSoftInputMode((this.f38750n.getAttributes().softInputMode & 15) | 48);
            this.f38750n.getDecorView().setWindowInsetsAnimationCallback(new WindowInsetsAnimation.Callback(1) { // from class: miuix.appcompat.app.AlertController.7
                boolean isTablet = false;

                @Override // android.view.WindowInsetsAnimation.Callback
                public void onEnd(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
                    super.onEnd(windowInsetsAnimation);
                    AlertController.this.f86793was = true;
                    WindowInsets rootWindowInsets = AlertController.this.f38750n.getDecorView().getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                        if (insets.bottom <= 0 && AlertController.this.f38751o.getTranslationY() < 0.0f) {
                            AlertController.this.cnbm(0);
                        }
                        AlertController.this.m24844w(rootWindowInsets);
                        if (this.isTablet) {
                            return;
                        }
                        AlertController.this.ix(insets.bottom);
                    }
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public void onPrepare(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
                    super.onPrepare(windowInsetsAnimation);
                    miuix.appcompat.widget.toq.m25495k();
                    AlertController.this.f86793was = false;
                    this.isTablet = AlertController.this.wo();
                }

                @hyr(api = 30)
                @zy.lvui
                public WindowInsets onProgress(@zy.lvui WindowInsets windowInsets, @zy.lvui List<WindowInsetsAnimation> list) {
                    Insets insets = windowInsets.getInsets(WindowInsets$Type.ime());
                    Insets insets2 = windowInsets.getInsets(WindowInsets$Type.navigationBars());
                    int iMax = insets.bottom - Math.max(AlertController.this.f86757g1, insets2.bottom);
                    if (windowInsets.isVisible(WindowInsets$Type.ime())) {
                        if (AlertController.this.f38747k) {
                            Log.d(AlertController.f86737zsr0, "WindowInsetsAnimation onProgress mPanelAndImeMargin : " + AlertController.this.f86757g1);
                            Log.d(AlertController.f86737zsr0, "WindowInsetsAnimation onProgress ime : " + insets.bottom);
                            Log.d(AlertController.f86737zsr0, "WindowInsetsAnimation onProgress navigationBar : " + insets2.bottom);
                        }
                        AlertController.this.cnbm(-(iMax < 0 ? 0 : iMax));
                    }
                    if (!this.isTablet) {
                        AlertController.this.ix(iMax);
                    }
                    return windowInsets;
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                @zy.lvui
                public WindowInsetsAnimation.Bounds onStart(@zy.lvui WindowInsetsAnimation windowInsetsAnimation, @zy.lvui WindowInsetsAnimation.Bounds bounds) {
                    AlertController.this.f86757g1 = (int) (r0.nn86() + AlertController.this.f38751o.getTranslationY());
                    if (AlertController.this.f38747k) {
                        Log.d(AlertController.f86737zsr0, "WindowInsetsAnimation onStart mPanelAndImeMargin : " + AlertController.this.f86757g1);
                    }
                    if (AlertController.this.f86757g1 <= 0) {
                        AlertController.this.f86757g1 = 0;
                    }
                    return super.onStart(windowInsetsAnimation, bounds);
                }
            });
            this.f38750n.getDecorView().setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC69058());
            this.f86758gbni = true;
        }
    }

    /* JADX INFO: renamed from: m */
    private int m24835m() {
        return wo() ? 17 : 81;
    }

    private void m2t(Configuration configuration) {
        miuix.core.util.t8r t8rVarM25607s = this.f86789toq ? C7085q.m25607s(this.f86804zy) : C7085q.m25605p(this.f86804zy, configuration);
        Point point = this.f86742c8jq;
        Point point2 = t8rVarM25607s.f39906q;
        point.x = point2.x;
        point.y = point2.y;
        Point point3 = this.f86799y2;
        Point point4 = t8rVarM25607s.f87381zy;
        point3.x = point4.x;
        point3.y = point4.y;
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateRootViewSize mRootViewSizeDp " + this.f86742c8jq + " mRootViewSize " + this.f86799y2 + " configuration.density " + (configuration.densityDpi / 160.0f));
        }
    }

    private void m4() {
        ((ki) this.f38753q).ni7();
        ki.zy zyVar = this.f38740d;
        if (zyVar != null) {
            zyVar.m25055k();
        }
    }

    private void m58i() {
        DisplayMetrics displayMetrics = this.f86804zy.getResources().getDisplayMetrics();
        float f2 = displayMetrics.scaledDensity;
        float f3 = displayMetrics.density;
        View view = this.f86777ncyb;
        if (view != null) {
            this.f38748l = (TextView) view.findViewById(R.id.title);
        }
        TextView textView = this.f38748l;
        if (textView != null) {
            this.f86741bo = textView.getTextSize();
            int textSizeUnit = Build.VERSION.SDK_INT >= 30 ? this.f38748l.getTextSizeUnit() : 2;
            if (textSizeUnit == 1) {
                this.f86741bo /= f3;
            } else if (textSizeUnit == 2) {
                this.f86741bo /= f2;
            }
        }
    }

    private boolean mu() {
        return vq(m24845x());
    }

    private void n2t(ViewGroup viewGroup) {
        int i2;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f38761z = button;
        button.setOnClickListener(this.f86747d8wk);
        this.f38761z.removeTextChangedListener(this.f86756fu4);
        this.f38761z.addTextChangedListener(this.f86756fu4);
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f86781o1t)) {
            this.f38761z.setVisibility(8);
            i2 = 0;
        } else {
            this.f38761z.setText(this.f86781o1t);
            this.f38761z.setVisibility(0);
            m24834l(this.f38761z);
            i2 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f38756t = button2;
        button2.setOnClickListener(this.f86747d8wk);
        this.f38756t.removeTextChangedListener(this.f86756fu4);
        this.f38756t.addTextChangedListener(this.f86756fu4);
        if (TextUtils.isEmpty(this.f86773mcp)) {
            this.f38756t.setVisibility(8);
        } else {
            this.f38756t.setText(this.f86773mcp);
            this.f38756t.setVisibility(0);
            i2++;
            m24834l(this.f38756t);
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f86738a9 = button3;
        button3.setOnClickListener(this.f86747d8wk);
        this.f86738a9.removeTextChangedListener(this.f86756fu4);
        this.f86738a9.addTextChangedListener(this.f86756fu4);
        if (TextUtils.isEmpty(this.f86755fti)) {
            this.f86738a9.setVisibility(8);
        } else {
            this.f86738a9.setText(this.f86755fti);
            this.f86738a9.setVisibility(0);
            i2++;
            m24834l(this.f86738a9);
        }
        List<ButtonInfo> list = this.f86759gvn7;
        if (list != null && !list.isEmpty()) {
            for (ButtonInfo buttonInfo : this.f86759gvn7) {
                if (buttonInfo.mButton != null) {
                    se(buttonInfo.mButton);
                }
            }
            for (ButtonInfo buttonInfo2 : this.f86759gvn7) {
                if (buttonInfo2.mButton == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    buttonInfo2.mButton = new GroupButton(this.f86804zy, null, buttonInfo2.mStyle);
                    buttonInfo2.mButton.setText(buttonInfo2.mText);
                    buttonInfo2.mButton.setOnClickListener(this.f86747d8wk);
                    buttonInfo2.mButton.setLayoutParams(layoutParams);
                    buttonInfo2.mButton.setMaxLines(1);
                    buttonInfo2.mButton.setGravity(17);
                }
                if (buttonInfo2.mMsg == null) {
                    buttonInfo2.mMsg = this.f86780nn86.obtainMessage(buttonInfo2.mWhich, buttonInfo2.mOnClickListener);
                }
                if (buttonInfo2.mButton.getVisibility() != 8) {
                    i2++;
                    m24834l(buttonInfo2.mButton);
                }
                viewGroup.addView(buttonInfo2.mButton);
            }
        }
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        } else {
            ((DialogButtonPanel) viewGroup).setForceVertical(this.f38749m);
            viewGroup.invalidate();
        }
        Point point = new Point();
        C7080i.f7l8(this.f86804zy, point);
        int iMax = Math.max(point.x, point.y);
        ViewGroup viewGroup2 = (ViewGroup) this.f38751o.findViewById(toq.C6054p.f76399pc);
        boolean zGvn7 = gvn7((DialogButtonPanel) viewGroup);
        if (this.f86799y2.y > iMax * 0.3f && !zGvn7) {
            z2 = false;
        }
        if (this.f38749m) {
            return;
        }
        if (!z2) {
            bwp(viewGroup, this.f38751o);
        } else {
            bwp(viewGroup, viewGroup2);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    private int[] ncyb(FrameLayout.LayoutParams layoutParams, int i2, int i3, int i4, boolean z2) {
        int i5;
        int[] iArr = new int[2];
        if (i2 == 0 && z2 && this.f86789toq && Build.VERSION.SDK_INT >= 30) {
            int iZp = zp();
            int iMax = Math.max(((this.f86799y2.x - i3) - layoutParams.width) / 2, 0);
            iArr[0] = iZp == 3 ? i3 + iMax : iMax;
            if (iZp != 1) {
                iMax += i3;
            }
            iArr[1] = iMax;
            layoutParams.gravity = 83;
            return iArr;
        }
        if (i3 != 0 && (i2 != 0 || !z2)) {
            int i6 = layoutParams.width;
            int i7 = (i2 * 2) + i3 + i6;
            int i8 = this.f86799y2.x;
            if (i7 > i8) {
                int iMax2 = Math.max(((i8 - i3) - i6) / 2, 0);
                i5 = i3 > i2 ? i3 : i3 + iMax2;
                if (this.f86789toq && i3 > i2) {
                    i5 = i3 + iMax2;
                }
            } else {
                i5 = i2 + i3;
            }
            iArr[0] = i4 == 16 ? i5 : i2;
            if (i4 != 16) {
                i2 = i5;
            }
            iArr[1] = i2;
            layoutParams.gravity = (i4 != 16 ? 5 : 3) | 80;
        }
        return iArr;
    }

    @Deprecated
    private void ngy(CheckBox checkBox) {
        if (this.f86764ikck == null) {
            checkBox.setVisibility(8);
            return;
        }
        checkBox.setVisibility(0);
        checkBox.setChecked(this.f86739a98o);
        checkBox.setText(this.f86764ikck);
    }

    private void nme() {
        boolean zMu = mu();
        int i2 = m24825c().x;
        boolean zGcp = gcp(i2);
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateDialogPanel isLandScape " + zMu);
            Log.d(f86737zsr0, "updateDialogPanel shouldLimitWidth " + zGcp);
        }
        int iM24824a = m24824a(zMu, zGcp);
        int iHb = zGcp ? 0 : hb(i2);
        if (iM24824a == -1 && this.f86789toq) {
            iM24824a = miuix.core.util.ld6.m25581q(this.f86804zy, i2) - (iHb * 2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM24824a, -2);
        layoutParams.gravity = m24835m();
        layoutParams.rightMargin = iHb;
        layoutParams.leftMargin = iHb;
        this.f86767ki = iHb;
        this.f86787t8r = iHb;
        this.f38751o.setLayoutParams(layoutParams);
    }

    private int nmn5() {
        int i2;
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insetsM24828f = m24828f(WindowInsets$Type.captionBar());
            int i3 = insetsM24828f != null ? insetsM24828f.top : 0;
            i2 = insetsM24828f != null ? insetsM24828f.bottom : 0;
            i = i3;
        } else {
            i2 = 0;
        }
        int dimensionPixelSize = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.vh);
        int dimensionPixelSize2 = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.oaex);
        int dimensionPixelSize3 = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.vc);
        if (i == 0) {
            i = wo() ? dimensionPixelSize : dimensionPixelSize2 + dimensionPixelSize3;
        }
        if (i2 == 0) {
            i2 = wo() ? dimensionPixelSize : dimensionPixelSize2 + dimensionPixelSize3;
        }
        return i + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nn86() {
        int[] iArr = new int[2];
        this.f38751o.getLocationInWindow(iArr);
        if (this.f38745i == -1) {
            this.f38745i = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.vc);
        }
        return (this.f38750n.getDecorView().getHeight() - (iArr[1] + this.f38751o.getHeight())) - this.f38745i;
    }

    /* JADX INFO: renamed from: o */
    private void m24837o() {
        Display defaultDisplay;
        if (this.f86789toq) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    defaultDisplay = this.f86804zy.getDisplay();
                } else {
                    WindowManager windowManager = this.f86744ch;
                    defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                }
                if (defaultDisplay == null || i2 < 28) {
                    this.f86778ni7 = null;
                } else {
                    this.f86778ni7 = (DisplayCutout) C7320k.kja0(defaultDisplay.getClass(), "getFlipFoldedCutout", new Class[0]).invoke(defaultDisplay, new Object[0]);
                }
            } catch (Exception unused) {
                sok("getFlipCutout", "can't reflect from display to query cutout", false);
                this.f86778ni7 = null;
            }
        }
    }

    private boolean o05() {
        int i2 = this.f38750n.getAttributes().type;
        return this.f86789toq && (i2 == 2038 || i2 == 2003);
    }

    private void oc(TextView textView) {
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oki() {
        if (lv5() == 0) {
            return false;
        }
        Point point = this.f86799y2;
        int i2 = point.x;
        return i2 >= this.f86743cdj && i2 * 2 > point.y && this.f86794wo;
    }

    private void pjz9(ViewGroup viewGroup, @zy.lvui ViewStub viewStub) {
        if (this.f86764ikck != null) {
            viewStub.inflate();
            CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.checkbox);
            checkBox.setVisibility(0);
            checkBox.setChecked(this.f86739a98o);
            checkBox.setText(this.f86764ikck);
            TextView textView = this.f86748dd;
            if (textView != null) {
                textView.setTextAlignment(2);
            }
            TextView textView2 = this.f86797x9kr;
            if (textView2 != null) {
                textView2.setTextAlignment(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ps(float f2) {
        TextView textView;
        DialogParentPanel2 dialogParentPanel2 = this.f38751o;
        if (dialogParentPanel2 != null) {
            miuix.view.f7l8.kja0(dialogParentPanel2, f2);
        }
        TextView textView2 = this.f38754r;
        if (textView2 != null) {
            miuix.view.f7l8.f7l8(textView2, this.f86771lv5);
        }
        TextView textView3 = this.f86748dd;
        if (textView3 != null) {
            miuix.view.f7l8.f7l8(textView3, this.f86786t8iq);
        }
        TextView textView4 = this.f86797x9kr;
        if (textView4 != null) {
            miuix.view.f7l8.f7l8(textView4, this.f38757u);
            miuix.view.f7l8.kja0(this.f86797x9kr, f2);
        }
        if (this.f86777ncyb != null && (textView = this.f38748l) != null) {
            miuix.view.f7l8.m26774n(textView, this.f86741bo);
        }
        View viewFindViewById = this.f38750n.findViewById(toq.C6054p.f76438w831);
        if (viewFindViewById != null) {
            miuix.view.f7l8.ld6(viewFindViewById, f2);
        }
        ViewGroup viewGroup = (ViewGroup) this.f38750n.findViewById(toq.C6054p.i0);
        if (viewGroup != null) {
            miuix.view.f7l8.kja0(viewGroup, f2);
        }
        View viewFindViewById2 = this.f38750n.findViewById(toq.C6054p.f76339ij);
        if (viewFindViewById2 != null) {
            miuix.view.f7l8.ld6(viewFindViewById2, f2);
        }
        CheckBox checkBox = (CheckBox) this.f38750n.findViewById(R.id.checkbox);
        if (checkBox != null) {
            miuix.view.f7l8.ld6(checkBox, f2);
        }
        ImageView imageView = (ImageView) this.f38750n.findViewById(R.id.icon);
        if (imageView != null) {
            miuix.view.f7l8.t8r(imageView, f2);
            miuix.view.f7l8.ld6(imageView, f2);
        }
    }

    private boolean py() {
        return ch() * this.f86775n5r1.getCount() > ((int) (((float) this.f86799y2.y) * 0.35f));
    }

    @Deprecated
    private boolean qkj8() {
        Class<?> clsZy = C7168p.zy("android.os.SystemProperties");
        Class cls = Integer.TYPE;
        return ((Integer) C7168p.toq(clsZy, cls, "getInt", new Class[]{String.class, cls}, "ro.miui.notch", 0)).intValue() == 1;
    }

    @hyr(api = 28)
    private boolean qo(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        return (windowInsets == null || (displayCutout = windowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    private void m24840r() {
        View view = this.f86776n7h;
        if (view != null && view.getParent() != null) {
            se(this.f86776n7h);
            this.f86776n7h = null;
        }
        View view2 = this.f86796x2;
        if (view2 == null || view2.getParent() == null) {
            return;
        }
        se(this.f86796x2);
        this.f86796x2 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hyr(api = 30)
    public void r25n(@zy.lvui WindowInsets windowInsets) {
        m24844w(windowInsets);
        if (fnq8()) {
            boolean zKja0 = miuix.core.util.ld6.kja0(this.f86804zy);
            Insets insets = windowInsets.getInsets(WindowInsets$Type.ime());
            Insets insets2 = windowInsets.getInsets(WindowInsets$Type.navigationBars());
            if (this.f38747k) {
                Log.d(f86737zsr0, "======================Debug for checkTranslateDialogPanel======================");
                Log.d(f86737zsr0, "The mPanelAndImeMargin: " + this.f86757g1);
                Log.d(f86737zsr0, "The imeInsets info: " + insets.toString());
                Log.d(f86737zsr0, "The navigationBarInsets info: " + insets2.toString());
                Log.d(f86737zsr0, "The insets info: " + windowInsets);
            }
            boolean zWo = wo();
            if (!zWo) {
                ix(insets.bottom);
            }
            int i2 = insets.bottom;
            if (zKja0 && !zWo) {
                i2 -= insets2.bottom;
            }
            ew(i2, zKja0, zWo);
            if (this.f38747k) {
                Log.d(f86737zsr0, "===================End of Debug for checkTranslateDialogPanel===================");
            }
        }
    }

    private void se(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    private void sok(String str, String str2, boolean z2) {
        if (this.f38747k || z2) {
            Log.d(f86737zsr0, str + ": " + str2);
        }
    }

    private void t8iq() {
        InputMethodManager inputMethodManager = (InputMethodManager) C0498q.kja0(this.f86804zy, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f38751o.getWindowToken(), 0);
        }
    }

    private boolean tfm() {
        return (m24849v() || this.f86803zurt == -2) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    private void m24843u(Context context) {
        this.f86744ch = (WindowManager) context.getSystemService("window");
        kx3();
        this.f38759x = context.getResources().getDimensionPixelSize(toq.f7l8.f75515sok);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u38j(View view) {
        this.f86799y2.x = view.getWidth();
        this.f86799y2.y = view.getHeight();
        float f2 = this.f86804zy.getResources().getDisplayMetrics().density;
        Point point = this.f86742c8jq;
        Point point2 = this.f86799y2;
        point.x = (int) (point2.x / f2);
        point.y = (int) (point2.y / f2);
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateRootViewSize by view mRootViewSizeDp " + this.f86742c8jq + " mRootViewSize " + this.f86799y2 + " configuration.density " + f2);
        }
    }

    private int uv6(int i2, int i3) {
        return i3 == 0 ? i2 == 2 ? 2 : 1 : i3;
    }

    private void v5yj() {
        int iM24845x = m24845x();
        if (Build.VERSION.SDK_INT <= 28 || this.f86740bf2 == iM24845x) {
            return;
        }
        this.f86740bf2 = iM24845x;
        Activity activityKja0 = ((ki) this.f38753q).kja0();
        if (activityKja0 != null) {
            int iUv6 = uv6(iM24845x, activityKja0.getWindow().getAttributes().layoutInDisplayCutoutMode);
            if (this.f38750n.getAttributes().layoutInDisplayCutoutMode != iUv6) {
                this.f38750n.getAttributes().layoutInDisplayCutoutMode = iUv6;
                View decorView = this.f38750n.getDecorView();
                if (this.f38753q.isShowing() && decorView.isAttachedToWindow()) {
                    this.f86744ch.updateViewLayout(this.f38750n.getDecorView(), this.f38750n.getAttributes());
                    return;
                }
                return;
            }
            return;
        }
        int i2 = m24845x() != 2 ? 1 : 2;
        if (this.f38750n.getAttributes().layoutInDisplayCutoutMode != i2) {
            this.f38750n.getAttributes().layoutInDisplayCutoutMode = i2;
            View decorView2 = this.f38750n.getDecorView();
            if (this.f38753q.isShowing() && decorView2.isAttachedToWindow()) {
                this.f86744ch.updateViewLayout(this.f38750n.getDecorView(), this.f38750n.getAttributes());
            }
        }
    }

    private boolean vq(int i2) {
        if (this.f86763i1) {
            return true;
        }
        Point pointN7h = C7085q.n7h(this.f86804zy);
        if (this.f86753fn3e) {
            return d8wk(pointN7h.x, pointN7h.y, i2);
        }
        if (i2 != 2) {
            return false;
        }
        if (m24826d()) {
            C7080i.f7l8(this.f86804zy, this.f86760gyi);
            Point point = this.f86760gyi;
            return point.x > point.y;
        }
        Point pointM24825c = m24825c();
        int i3 = pointM24825c.x;
        return i3 >= f86736r8s8 && i3 > pointM24825c.y;
    }

    private void vy(boolean z2, boolean z3, boolean z5, final float f2) {
        ListAdapter listAdapter;
        if (m24849v()) {
            this.f38746j.setOnClickListener(new View.OnClickListener() { // from class: miuix.appcompat.app.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39009k.was(view);
                }
            });
            nme();
        } else {
            if (tfm()) {
                this.f86761hb.setOnClickListener(new View.OnClickListener() { // from class: miuix.appcompat.app.qrj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f39001k.gbni(view);
                    }
                });
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m24824a(mu(), gcp(m24825c().x)), -2);
                layoutParams.gravity = m24835m();
                this.f38751o.setLayoutParams(layoutParams);
            }
            this.f38746j.setVisibility(8);
        }
        if (z2 || z3 || this.f86794wo) {
            ViewGroup viewGroup = (ViewGroup) this.f38751o.findViewById(toq.C6054p.i0);
            ViewGroup viewGroup2 = (ViewGroup) this.f38751o.findViewById(toq.C6054p.f76399pc);
            ViewGroup viewGroup3 = (ViewGroup) this.f38751o.findViewById(toq.C6054p.f76438w831);
            if (viewGroup2 != null) {
                lh(viewGroup2, z5);
            }
            if (viewGroup3 != null) {
                ((DialogButtonPanel) viewGroup3).m25397n(oki());
                n2t(viewGroup3);
            }
            if (viewGroup != null) {
                e5(viewGroup);
            }
            if ((viewGroup == null || viewGroup.getVisibility() == 8) ? false : true) {
                View viewFindViewById = (this.f38755s == null && this.f86769ld6 == null) ? null : viewGroup.findViewById(toq.C6054p.kho);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
            }
            ListView listView = this.f86769ld6;
            if (listView != null && (listAdapter = this.f86775n5r1) != null) {
                listView.setAdapter(listAdapter);
                int i2 = this.f86762hyr;
                if (i2 > -1) {
                    listView.setItemChecked(i2, true);
                    listView.setSelection(i2);
                }
            }
            ViewStub viewStub = (ViewStub) this.f38751o.findViewById(toq.C6054p.f76279bek6);
            if (viewStub != null) {
                pjz9(this.f38751o, viewStub);
            }
            if (!z2) {
                m4();
            }
        } else {
            this.f38751o.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.6
                @Override // java.lang.Runnable
                public void run() {
                    ViewGroup viewGroup4 = (ViewGroup) AlertController.this.f38751o.findViewById(toq.C6054p.f76399pc);
                    ViewGroup viewGroup5 = (ViewGroup) AlertController.this.f38751o.findViewById(toq.C6054p.f76438w831);
                    if (viewGroup4 != null) {
                        AlertController.this.b8(viewGroup4);
                        if (viewGroup5 != null && !AlertController.this.f86794wo) {
                            AlertController.this.b9ub(viewGroup5, viewGroup4);
                        }
                    }
                    float f3 = f2;
                    if (f3 != 1.0f) {
                        AlertController.this.ps(f3);
                    }
                }
            });
        }
        this.f38751o.post(new Runnable() { // from class: miuix.appcompat.app.n7h
            @Override // java.lang.Runnable
            public final void run() {
                this.f38969k.zsr0();
            }
        });
    }

    @hyr(api = 30)
    private DisplayCutout vyq() {
        if (o05() && this.f86778ni7 != null) {
            sok("getCutoutSafely", "show system alert in flip, use displayCutout by reflect, displayCutout = " + this.f86778ni7, false);
            return this.f86778ni7;
        }
        try {
            DisplayCutout cutout = this.f86804zy.getDisplay().getCutout();
            sok("getCutoutSafely", "get displayCutout from context = " + cutout, false);
            return cutout;
        } catch (Exception e2) {
            Log.e(f86737zsr0, "context is not associated display info, please check the type of context, the exception info = " + Log.getStackTraceString(e2));
            WindowManager windowManager = this.f86744ch;
            Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                return defaultDisplay.getCutout();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hyr(api = 30)
    /* JADX INFO: renamed from: w */
    public void m24844w(WindowInsets windowInsets) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iMax;
        if (wo() || windowInsets == null) {
            return;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.navigationBars());
        Insets insets = windowInsets.getInsets(WindowInsets$Type.statusBars());
        this.f86749dr.setEmpty();
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        if (displayCutout != null && !this.f86753fn3e) {
            this.f86749dr.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        }
        if (this.f38747k) {
            Log.d(f86737zsr0, "updateParentPanel navigationBar " + insetsIgnoringVisibility);
            Log.d(f86737zsr0, "updateParentPanel mDisplayCutoutSafeInsets " + this.f86749dr);
        }
        int paddingRight = this.f86761hb.getPaddingRight();
        int paddingLeft = this.f86761hb.getPaddingLeft();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f38751o.getLayoutParams();
        int i8 = insets.top;
        int dimensionPixelSize = this.f86804zy.getResources().getDimensionPixelSize(this.f86789toq ? toq.f7l8.ie : toq.f7l8.vc);
        int dimensionPixelSize2 = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.ie);
        int iMax2 = Math.max(Math.max(i8, dimensionPixelSize), this.f86749dr.top);
        Rect rect = this.f86749dr;
        int i9 = !this.f86789toq ? iMax2 : rect.top != 0 ? dimensionPixelSize2 + iMax2 : iMax2;
        boolean z2 = (this.f86799y2.x - layoutParams.width) / 2 < Math.max(rect.left, insetsIgnoringVisibility.left);
        boolean z3 = (this.f86799y2.x - layoutParams.width) / 2 < Math.max(this.f86749dr.right, insetsIgnoringVisibility.right);
        int i10 = this.f86767ki;
        int i11 = this.f86787t8r;
        if (z2 || z3) {
            int iMax3 = Math.max(this.f86749dr.left, insetsIgnoringVisibility.left - paddingLeft);
            int iMax4 = Math.max(this.f86749dr.right, insetsIgnoringVisibility.right - paddingRight);
            int i12 = z2 ? iMax3 : iMax4;
            boolean z5 = i12 == Math.max(insetsIgnoringVisibility.left, insetsIgnoringVisibility.right);
            int i13 = z2 ? 16 : 32;
            int i14 = z2 ? this.f86767ki : this.f86787t8r;
            if (this.f38747k) {
                StringBuilder sb = new StringBuilder();
                i2 = paddingRight;
                sb.append("immersive dialog margin compute, leftNeedAvoidSpace = ");
                sb.append(iMax3);
                sb.append(", rightNeedAvoidSpace = ");
                sb.append(iMax4);
                sb.append(", leftNeedAvoid = ");
                sb.append(z2);
                sb.append(", horizontalMargin = ");
                sb.append(i14);
                sb.append(", isAvoidNaviBar = ");
                sb.append(z5);
                Log.d(f86737zsr0, sb.toString());
            } else {
                i2 = paddingRight;
            }
            int[] iArrNcyb = ncyb(layoutParams, i14, i12, i13, z5);
            i3 = 0;
            i10 = iArrNcyb[0];
            i4 = 1;
            i5 = iArrNcyb[1];
        } else {
            layoutParams.gravity = m24835m();
            i5 = i11;
            i2 = paddingRight;
            i3 = 0;
            i4 = 1;
        }
        int i15 = (miuix.core.util.ld6.kja0(this.f86804zy) && !this.f86753fn3e && miuix.os.zy.f7l8(this.f86804zy)) ? i4 : i3;
        if ((this.f86753fn3e || i15 != 0) && insetsIgnoringVisibility.bottom == 0) {
            Insets insetsM24828f = m24828f(WindowInsets$Type.captionBar());
            int dimensionPixelSize3 = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.oaex);
            int i16 = insetsM24828f != null ? insetsM24828f.bottom : i3;
            int i17 = i16 == 0 ? dimensionPixelSize3 + dimensionPixelSize : dimensionPixelSize + i16;
            if (y9n() <= 0) {
                dimensionPixelSize = i17;
            }
        } else {
            if (!this.f86789toq || (iMax = this.f86749dr.bottom) <= 0) {
                iMax = Math.max(insetsIgnoringVisibility.bottom, this.f86749dr.bottom);
            }
            dimensionPixelSize += iMax;
        }
        if (this.f38747k) {
            Log.d(f86737zsr0, "immersive dialog margin result, leftMargin = " + i10 + ", topMargin = " + i9 + ", rightMargin = " + i5 + ", bottomMargin = " + dimensionPixelSize + ", parentPanelWidth = " + layoutParams.width + ", displayCutout = " + this.f86749dr.flattenToString() + ", navigationBarInset = " + insetsIgnoringVisibility + ", rootViewLeftPadding = " + paddingLeft + ", rootViewRightPadding = " + i2);
        }
        if (layoutParams.topMargin != i9) {
            layoutParams.topMargin = i9;
            i6 = i4;
        } else {
            i6 = i3;
        }
        if (layoutParams.bottomMargin != dimensionPixelSize) {
            layoutParams.bottomMargin = dimensionPixelSize;
            i6 = i4;
        }
        if (layoutParams.leftMargin != i10) {
            layoutParams.leftMargin = i10;
            i6 = i4;
        }
        if (layoutParams.rightMargin != i5) {
            layoutParams.rightMargin = i5;
            i7 = i4;
        } else {
            i7 = i6;
        }
        if (i7 != 0) {
            this.f38751o.requestLayout();
        }
    }

    private void w831() {
        this.f86763i1 = this.f86804zy.getResources().getBoolean(toq.C6053n.f76259x2);
        this.f38759x = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.f75515sok);
        kx3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void was(View view) {
        if (y2() && c8jq()) {
            t8iq();
            this.f38753q.cancel();
        }
    }

    private void wlev() {
        this.f38750n.setLayout(-1, -1);
        this.f38750n.setBackgroundDrawableResource(toq.C6050g.q4lv);
        this.f38750n.setDimAmount(0.0f);
        this.f38750n.setWindowAnimations(toq.cdj.f75367zurt);
        this.f38750n.addFlags(-2147481344);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            Activity activityKja0 = ((ki) this.f38753q).kja0();
            if (activityKja0 != null) {
                this.f38750n.getAttributes().layoutInDisplayCutoutMode = uv6(m24845x(), activityKja0.getWindow().getAttributes().layoutInDisplayCutoutMode);
            } else {
                this.f38750n.getAttributes().layoutInDisplayCutoutMode = m24845x() != 2 ? 1 : 2;
            }
        }
        x9kr(this.f38750n.getDecorView());
        if (i2 >= 30) {
            this.f38750n.getAttributes().setFitInsetsSides(0);
            Activity activityKja02 = ((ki) this.f38753q).kja0();
            if (activityKja02 == null || (activityKja02.getWindow().getAttributes().flags & 1024) != 0) {
                return;
            }
            this.f38750n.clearFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wo() {
        return miuix.os.toq.f87880toq;
    }

    /* JADX INFO: renamed from: x */
    private int m24845x() {
        WindowManager windowManager = this.f86744ch;
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        return (rotation == 1 || rotation == 3) ? 2 : 1;
    }

    private void x9kr(View view) {
        if ((view instanceof DialogParentPanel2) || view == null) {
            return;
        }
        int i2 = 0;
        view.setFitsSystemWindows(false);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i2 >= viewGroup.getChildCount()) {
                return;
            }
            x9kr(viewGroup.getChildAt(i2));
            i2++;
        }
    }

    private boolean xwq3() {
        String str = "";
        try {
            String str2 = SystemProperties.get("log.tag.alertdialog.ime.debug.enable");
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception e2) {
            Log.i(f86737zsr0, "can not access property log.tag.alertdialog.ime.enable, undebugable", e2);
        }
        Log.d(f86737zsr0, "Alert dialog ime debugEnable = " + str);
        boolean zEquals = TextUtils.equals("true", str);
        this.f38747k = zEquals;
        return zEquals;
    }

    private boolean y2() {
        return this.f86801yz;
    }

    @hyr(api = 30)
    private int y9n() {
        WindowInsets rootWindowInsets = this.f38750n.getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
            if (insets != null) {
                return insets.bottom;
            }
            return 0;
        }
        Insets insetsM24828f = m24828f(WindowInsets$Type.ime());
        if (insetsM24828f != null) {
            return insetsM24828f.bottom;
        }
        return 0;
    }

    @hyr(api = 30)
    private int zp() {
        try {
            return this.f86804zy.getDisplay().getRotation();
        } catch (Exception e2) {
            Log.e(f86737zsr0, "context is not associated display info, please check the type of context, the exception info = " + Log.getStackTraceString(e2));
            WindowManager windowManager = this.f86744ch;
            Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                return defaultDisplay.getRotation();
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zsr0() {
        ki.InterfaceC6948n interfaceC6948n = this.f86774mu;
        if (interfaceC6948n != null) {
            interfaceC6948n.m25051k((ki) this.f38753q, this.f38751o);
        }
    }

    int a98o() {
        return this.f86803zurt;
    }

    /* JADX INFO: renamed from: b */
    public ListView m24848b() {
        return this.f86769ld6;
    }

    public void b3e(final ViewGroup.LayoutParams layoutParams) throws IllegalArgumentException {
        DialogParentPanel2 dialogParentPanel2 = this.f38751o;
        if (dialogParentPanel2 == null || layoutParams == null) {
            throw new IllegalArgumentException("mParentPanel or layoutParams is null");
        }
        dialogParentPanel2.post(new Runnable() { // from class: miuix.appcompat.app.ld6
            @Override // java.lang.Runnable
            public final void run() {
                this.f38967k.g1(layoutParams);
            }
        });
        if (m24849v()) {
            return;
        }
        WindowManager.LayoutParams attributes = this.f38750n.getAttributes();
        attributes.width = layoutParams.width;
        attributes.height = layoutParams.height;
        this.f38750n.setAttributes(attributes);
    }

    public void bek6(View view) {
        this.f86777ncyb = view;
    }

    public TextView bf2() {
        return this.f86748dd;
    }

    public void bo(Bundle bundle) {
        this.f86789toq = miuix.os.toq.f40718n && miuix.os.zy.m26178g(this.f86804zy);
        this.f38743g = bundle != null;
        this.f86753fn3e = miuix.core.util.ld6.qrj(this.f86804zy);
        m24837o();
        this.f38753q.setContentView(this.f38742f);
        this.f86761hb = (DialogRootView) this.f38750n.findViewById(toq.C6054p.f34909w);
        this.f38746j = this.f38750n.findViewById(toq.C6054p.f76342ix);
        this.f86761hb.setConfigurationChangedCallback(new DialogRootView.toq() { // from class: miuix.appcompat.app.AlertController.4
            @Override // miuix.appcompat.internal.widget.DialogRootView.toq
            public void onConfigurationChanged(Configuration configuration, int i2, int i3, int i4, int i5) {
                AlertController.this.ltg8(configuration, false, false);
            }
        });
        Configuration configuration = this.f86804zy.getResources().getConfiguration();
        m2t(configuration);
        a5id();
        dxef();
        this.f86798xwq3 = configuration;
        this.f38758v = true;
        this.f86761hb.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.5
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup viewGroup = (ViewGroup) AlertController.this.f38751o.findViewById(toq.C6054p.f76399pc);
                ViewGroup viewGroup2 = (ViewGroup) AlertController.this.f38751o.findViewById(toq.C6054p.f76438w831);
                if (viewGroup2 != null && viewGroup != null && !AlertController.this.oki()) {
                    AlertController.this.b9ub(viewGroup2, viewGroup);
                }
                AlertController alertController = AlertController.this;
                alertController.u38j(alertController.f86761hb);
            }
        });
    }

    public void bz2(boolean z2) {
        this.f86801yz = z2;
    }

    public int ch() {
        return C7164n.m25953y(this.f86804zy, toq.C6055q.mq);
    }

    void cv06(boolean z2) {
        this.f86752f7l8 = z2;
    }

    void dd() {
        List<ButtonInfo> list = this.f86759gvn7;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28297do(ki.InterfaceC6948n interfaceC6948n) {
        this.f86774mu = interfaceC6948n;
    }

    public void ebn(ki.InterfaceC6949q interfaceC6949q) {
        this.f86791vq = interfaceC6949q;
    }

    public void etdu() {
        if (m24849v()) {
            this.f38750n.getDecorView().removeOnLayoutChangeListener(this.f86750ek5k);
        }
    }

    void fti(ButtonInfo buttonInfo) {
        if (TextUtils.isEmpty(buttonInfo.mText)) {
            return;
        }
        if (this.f86759gvn7 == null) {
            this.f86759gvn7 = new ArrayList();
        }
        this.f86759gvn7.add(buttonInfo);
    }

    public boolean gyi() {
        CheckBox checkBox = (CheckBox) this.f38750n.findViewById(R.id.checkbox);
        if (checkBox == null) {
            return false;
        }
        boolean zIsChecked = checkBox.isChecked();
        this.f86739a98o = zIsChecked;
        return zIsChecked;
    }

    void h7am(boolean z2) {
        this.f86754fnq8 = z2;
    }

    public boolean hyr(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 82;
    }

    public void i9jn() {
        w831();
        if (Build.VERSION.SDK_INT >= 30) {
            lw();
        }
    }

    public void ij(boolean z2) {
        this.f86751eqxt = z2;
    }

    void ixz(int i2) {
        this.f86803zurt = i2;
    }

    public void jbh(int i2, int i3) {
        this.f86745d2ok = i2;
        this.f86772lvui = i3;
    }

    public void jz5(boolean z2, CharSequence charSequence) {
        this.f86739a98o = z2;
        this.f86764ikck = charSequence;
    }

    public void ktq(CharSequence charSequence) {
        this.f38752p = charSequence;
        TextView textView = this.f86797x9kr;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public Button lrht(int i2) {
        if (i2 == -3) {
            return this.f86738a9;
        }
        if (i2 == -2) {
            return this.f38756t;
        }
        if (i2 == -1) {
            return this.f38761z;
        }
        List<ButtonInfo> list = this.f86759gvn7;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ButtonInfo buttonInfo : this.f86759gvn7) {
            if (buttonInfo.mWhich == i2) {
                return buttonInfo.mButton;
            }
        }
        return null;
    }

    public void ltg8(Configuration configuration, boolean z2, boolean z3) {
        this.f86789toq = miuix.os.toq.f40718n && miuix.os.zy.m26178g(this.f86804zy);
        this.f86753fn3e = miuix.core.util.ld6.qrj(this.f86804zy);
        m24837o();
        int i2 = configuration.densityDpi;
        float f2 = (i2 * 1.0f) / this.f86779nmn5;
        if (f2 != 1.0f) {
            this.f86779nmn5 = i2;
        }
        if (this.f38747k) {
            Log.d(f86737zsr0, "onConfigurationChangednewDensityDpi " + this.f86779nmn5 + " densityScale " + f2);
        }
        if (!this.f38758v || dr(configuration) || z2) {
            this.f38758v = false;
            this.f38745i = -1;
            m2t(configuration);
            if (this.f38747k) {
                Log.d(f86737zsr0, "onConfigurationChanged mRootViewSize " + this.f86799y2);
            }
            if (!d2ok()) {
                Log.w(f86737zsr0, "dialog is created in thread:" + this.f86788tfm + ", but onConfigurationChanged is called from different thread:" + Thread.currentThread() + ", so this onConfigurationChanged call should be ignore");
                return;
            }
            if (m24849v()) {
                this.f38750n.getDecorView().removeOnLayoutChangeListener(this.f86750ek5k);
            }
            if (this.f38750n.getDecorView().isAttachedToWindow()) {
                if (f2 != 1.0f) {
                    this.f38744h = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.cjaj);
                    this.f86743cdj = this.f86804zy.getResources().getDimensionPixelSize(toq.f7l8.eu);
                }
                w831();
                if (m24849v()) {
                    v5yj();
                } else {
                    ga();
                }
                vy(false, z2, z3, f2);
            }
            if (m24849v()) {
                this.f38750n.getDecorView().addOnLayoutChangeListener(this.f86750ek5k);
                WindowInsets rootWindowInsets = this.f38750n.getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    r25n(rootWindowInsets);
                }
            }
            this.f86761hb.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.9
                @Override // java.lang.Runnable
                public void run() {
                    AlertController alertController = AlertController.this;
                    alertController.u38j(alertController.f86761hb);
                }
            });
            this.f38751o.setVerticalAvoidSpace(nmn5());
        }
    }

    public void mbx(Drawable drawable) {
        this.f86782oc = drawable;
        this.f86746d3 = 0;
    }

    public void n5r1(toq.InterfaceC7064k interfaceC7064k) {
        if (Build.VERSION.SDK_INT >= 30) {
            lvui();
        }
        DialogParentPanel2 dialogParentPanel2 = this.f38751o;
        if (dialogParentPanel2 == null) {
            if (interfaceC7064k != null) {
                interfaceC7064k.end();
            }
        } else {
            if (dialogParentPanel2.isAttachedToWindow()) {
                eqxt();
                miuix.appcompat.widget.toq.toq(this.f38751o, this.f38746j, interfaceC7064k);
                return;
            }
            Log.d(f86737zsr0, "dialog is not attached to window when dismiss is invoked");
            try {
                ((ki) this.f38753q).m25033z();
            } catch (IllegalArgumentException e2) {
                Log.wtf(f86737zsr0, "Not catch the dialog will throw the illegalArgumentException (In Case cause the crash , we expect it should be caught)", e2);
            }
        }
    }

    public void nsb(int i2) {
        this.f86796x2 = null;
        this.f86785qrj = i2;
    }

    public void pc(CharSequence charSequence) {
        this.f38760y = charSequence;
        TextView textView = this.f38754r;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r8s8() {
        if (C7169q.m25965g()) {
            return;
        }
        Folme.clean(this.f38751o, this.f38746j);
        cnbm(0);
    }

    void uc(int i2) {
        this.f86784qo = i2;
    }

    public void uj2j(boolean z2) {
        this.f86800y9n = z2;
    }

    void ukdy(boolean z2) {
        this.f86794wo = z2;
    }

    /* JADX INFO: renamed from: v */
    boolean m24849v() {
        return this.f86754fnq8 && Build.VERSION.SDK_INT >= 30 && !this.f86789toq;
    }

    public void v0af() {
        if (m24849v()) {
            if (this.f38746j != null) {
                ix(0);
            }
            w831();
            v5yj();
            if (this.f38743g || !this.f86752f7l8) {
                this.f38751o.setTag(null);
                this.f38746j.setAlpha(0.3f);
            } else {
                miuix.appcompat.widget.toq.zy(this.f38751o, this.f38746j, mu(), this.f86783qkj8);
            }
            this.f38750n.getDecorView().addOnLayoutChangeListener(this.f86750ek5k);
        }
    }

    public void vep5(int i2) {
        this.f86782oc = null;
        this.f86746d3 = i2;
    }

    public void wx16(CharSequence charSequence) {
        this.f38755s = charSequence;
        TextView textView = this.f86748dd;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void yl(ki.zy zyVar) {
        this.f38740d = zyVar;
    }

    public void yqrt(View view, boolean z2) {
        m24840r();
        this.f86796x2 = view;
        this.f86785qrj = 0;
        ltg8(this.f86804zy.getResources().getConfiguration(), true, z2);
    }

    public int yz(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f86804zy.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void z4(int i2, boolean z2) {
        m24840r();
        this.f86796x2 = null;
        this.f86785qrj = i2;
        ltg8(this.f86804zy.getResources().getConfiguration(), true, z2);
    }

    public void zkd(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f86780nn86.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f86755fti = charSequence;
            this.f86766jp0y = message;
        } else if (i2 == -2) {
            this.f86773mcp = charSequence;
            this.f86765jk = message;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f86781o1t = charSequence;
            this.f86795wvg = message;
        }
    }

    public void zwy(View view) {
        this.f86796x2 = view;
        this.f86785qrj = 0;
    }

    static class ButtonInfo {
        private GroupButton mButton;
        private Message mMsg;
        private final DialogInterface.OnClickListener mOnClickListener;
        private final int mStyle;
        private final CharSequence mText;
        private final int mWhich;

        ButtonInfo(CharSequence charSequence, int i2, Message message) {
            this.mText = charSequence;
            this.mStyle = i2;
            this.mMsg = message;
            this.mOnClickListener = null;
            this.mWhich = 0;
        }

        ButtonInfo(CharSequence charSequence, int i2, DialogInterface.OnClickListener onClickListener, int i3) {
            this.mText = charSequence;
            this.mStyle = i2;
            this.mMsg = null;
            this.mOnClickListener = onClickListener;
            this.mWhich = i3;
        }
    }
}
