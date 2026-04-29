package com.miui.maml.elements;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.ContextVariables;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.elements.VariableArrayElement;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ListScreenElement extends ElementGroup {
    private static double ACC = -800.0d;
    private static String DATA_TYPE_BITMAP = "bitmap";
    private static String DATA_TYPE_DOUBLE = "double";
    private static String DATA_TYPE_FLOAT = "float";
    private static String DATA_TYPE_INTEGER = "int";
    private static String DATA_TYPE_INTEGER1 = "integer";
    private static String DATA_TYPE_LONG = "long";
    private static String DATA_TYPE_STRING = "string";
    private static final String LOG_TAG = "ListScreenElement";
    public static final String TAG_NAME = "List";
    protected AttrDataBinders mAttrDataBinders;
    private int mBottomIndex;
    private int mCachedItemCount;
    private boolean mClearOnFinish;
    private ArrayList<ColumnInfo> mColumnsInfo;
    private int mCurrentIndex;
    private long mCurrentTime;
    private ArrayList<DataIndexMap> mDataList;
    private ArrayList<Integer> mIndexOrder;
    private IndexedVariable[] mIndexedVariables;
    private ElementGroup mInnerGroup;
    private boolean mIsChildScroll;
    private boolean mIsScroll;
    private boolean mIsUpDirection;
    private ListItemElement mItem;
    private int mItemCount;
    private long mLastTime;
    protected ListData mListData;
    private final Object mLock;
    private Expression mMaxHeight;
    private boolean mMoving;
    private double mOffsetX;
    private double mOffsetY;
    private boolean mPressed;
    private ArrayList<Integer> mReuseIndex;
    private AnimatedScreenElement mScrollBar;
    private int mSelectedId;
    private IndexedVariable mSelectedIdVar;
    private double mSpeed;
    private long mStartAnimTime;
    private float mStartAnimY;
    private int mTopIndex;
    private double mTouchStartX;
    private double mTouchStartY;
    private int mVisibleItemCount;

    /* JADX INFO: renamed from: com.miui.maml.elements.ListScreenElement$1 */
    static /* synthetic */ class C51871 {

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$elements$ListScreenElement$ColumnInfo$Type */
        static final /* synthetic */ int[] f29469xf5c3983b;

        static {
            int[] iArr = new int[ColumnInfo.Type.values().length];
            f29469xf5c3983b = iArr;
            try {
                iArr[ColumnInfo.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29469xf5c3983b[ColumnInfo.Type.BITMAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29469xf5c3983b[ColumnInfo.Type.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29469xf5c3983b[ColumnInfo.Type.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29469xf5c3983b[ColumnInfo.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29469xf5c3983b[ColumnInfo.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Column {
        public ListScreenElement mList;
        public String mName;
        public VariableArrayElement.VarObserver mObserver;
        public ScreenElementRoot mRoot;
        public String mTarget;
        public VariableArrayElement mTargetElement;

        public Column(Element element, ScreenElementRoot screenElementRoot, ListScreenElement listScreenElement) {
            this.mRoot = screenElementRoot;
            this.mList = listScreenElement;
            if (element != null) {
                load(element);
            }
        }

        private void load(Element element) {
            this.mName = element.getAttribute("name");
            this.mTarget = element.getAttribute(zurt.InterfaceC0290k.f47416lvui);
            this.mObserver = new VariableArrayElement.VarObserver() { // from class: com.miui.maml.elements.ListScreenElement.Column.1
                @Override // com.miui.maml.elements.VariableArrayElement.VarObserver
                public void onDataChange(Object[] objArr) {
                    Column column = Column.this;
                    column.mList.addColumn(column.mName, objArr);
                }
            };
        }

        public void finish() {
            VariableArrayElement variableArrayElement = this.mTargetElement;
            if (variableArrayElement != null) {
                variableArrayElement.registerVarObserver(this.mObserver, false);
            }
        }

        public void init() {
            if (this.mTargetElement == null) {
                ScreenElement screenElementFindElement = this.mRoot.findElement(this.mTarget);
                if (!(screenElementFindElement instanceof VariableArrayElement)) {
                    MamlLog.m17851e(ListScreenElement.LOG_TAG, "can't find VarArray:" + this.mTarget);
                    return;
                }
                this.mTargetElement = (VariableArrayElement) screenElementFindElement;
            }
            this.mTargetElement.registerVarObserver(this.mObserver, true);
        }
    }

    public static class ColumnInfo {
        public Type mType;
        public String mVarName;

        public enum Type {
            STRING,
            BITMAP,
            INTEGER,
            DOUBLE,
            LONG,
            FLOAT;

            public boolean isNumber() {
                return this == INTEGER || this == DOUBLE || this == LONG || this == FLOAT;
            }
        }

        public ColumnInfo(String str) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("List: invalid item data " + str);
            }
            this.mVarName = str.substring(0, iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1);
            if (ListScreenElement.DATA_TYPE_STRING.equals(strSubstring)) {
                this.mType = Type.STRING;
                return;
            }
            if (ListScreenElement.DATA_TYPE_BITMAP.equals(strSubstring)) {
                this.mType = Type.BITMAP;
                return;
            }
            if (ListScreenElement.DATA_TYPE_INTEGER.equals(strSubstring) || ListScreenElement.DATA_TYPE_INTEGER1.equals(strSubstring)) {
                this.mType = Type.INTEGER;
                return;
            }
            if (ListScreenElement.DATA_TYPE_DOUBLE.equals(strSubstring)) {
                this.mType = Type.DOUBLE;
                return;
            }
            if (ListScreenElement.DATA_TYPE_LONG.equals(strSubstring)) {
                this.mType = Type.LONG;
            } else {
                if (ListScreenElement.DATA_TYPE_FLOAT.equals(strSubstring)) {
                    this.mType = Type.FLOAT;
                    return;
                }
                throw new IllegalArgumentException("List: invalid item data type:" + strSubstring);
            }
        }

        public static ArrayList<ColumnInfo> createColumnsInfo(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ArrayList<ColumnInfo> arrayList = new ArrayList<>();
            for (String str2 : str.split(",")) {
                arrayList.add(new ColumnInfo(str2));
            }
            return arrayList;
        }

        public boolean validate(Object obj) {
            if (obj == null) {
                return true;
            }
            switch (C51871.f29469xf5c3983b[this.mType.ordinal()]) {
                case 1:
                    return obj instanceof String;
                case 2:
                    return obj instanceof Bitmap;
                case 3:
                    return obj instanceof Integer;
                case 4:
                    return obj instanceof Double;
                case 5:
                    return obj instanceof Long;
                case 6:
                    return obj instanceof Float;
                default:
                    return false;
            }
        }
    }

    public static class ListData {
        public ArrayList<Column> mColumns = new ArrayList<>();
        public ListScreenElement mList;
        public ScreenElementRoot mRoot;

        public ListData(Element element, ScreenElementRoot screenElementRoot, ListScreenElement listScreenElement) {
            this.mRoot = screenElementRoot;
            this.mList = listScreenElement;
            if (element != null) {
                load(element);
            }
        }

        private void load(Element element) {
            Utils.traverseXmlElementChildren(element, "Column", new Utils.XmlTraverseListener() { // from class: com.miui.maml.elements.ListScreenElement.ListData.1
                @Override // com.miui.maml.util.Utils.XmlTraverseListener
                public void onChild(Element element2) {
                    ListData listData = ListData.this;
                    listData.mColumns.add(new Column(element2, listData.mRoot, listData.mList));
                }
            });
        }

        public void finish() {
            for (Column column : this.mColumns) {
                if (column != null) {
                    column.finish();
                }
            }
        }

        public void init() {
            for (Column column : this.mColumns) {
                if (column != null) {
                    column.init();
                }
            }
        }
    }

    private static class ListItemElement extends ElementGroup {
        public static final String TAG_NAME = "Item";
        private int mDataIndex;
        private AnimatedScreenElement mDivider;
        protected Element mNode;

        public ListItemElement(Element element, ScreenElementRoot screenElementRoot) {
            super(element, screenElementRoot);
            this.mDataIndex = -1;
            this.mNode = element;
            ScreenElement screenElementFindElement = findElement("divider");
            if (screenElementFindElement instanceof AnimatedScreenElement) {
                this.mDivider = (AnimatedScreenElement) screenElementFindElement;
                removeElement(screenElementFindElement);
                addElement(this.mDivider);
            }
            this.mAlignV = ScreenElement.AlignV.TOP;
        }

        public int getDataIndex() {
            return this.mDataIndex;
        }

        public void setDataIndex(int i2) {
            this.mDataIndex = i2;
            AnimatedScreenElement animatedScreenElement = this.mDivider;
            if (animatedScreenElement != null) {
                if (i2 <= 0) {
                    animatedScreenElement.show(false);
                } else {
                    animatedScreenElement.show(true);
                }
            }
        }
    }

    public ListScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mLock = new Object();
        this.mDataList = new ArrayList<>();
        this.mIndexOrder = new ArrayList<>();
        this.mReuseIndex = new ArrayList<>();
        this.mCurrentIndex = -1;
        if (this.mItem == null) {
            MamlLog.m17851e(LOG_TAG, "no item");
            throw new IllegalArgumentException("List: no item");
        }
        setClip(true);
        this.mMaxHeight = Expression.build(getVariables(), element.getAttribute("maxHeight"));
        this.mClearOnFinish = Boolean.parseBoolean(element.getAttribute("clearOnFinish"));
        String attribute = element.getAttribute("data");
        if (TextUtils.isEmpty(attribute)) {
            MamlLog.m17851e(LOG_TAG, "no data");
            throw new IllegalArgumentException("List: no data");
        }
        ArrayList<ColumnInfo> arrayListCreateColumnsInfo = ColumnInfo.createColumnsInfo(attribute);
        this.mColumnsInfo = arrayListCreateColumnsInfo;
        if (arrayListCreateColumnsInfo == null) {
            MamlLog.m17851e(LOG_TAG, "invalid item data");
            throw new IllegalArgumentException("List: invalid item data");
        }
        this.mIndexedVariables = new IndexedVariable[arrayListCreateColumnsInfo.size()];
        Element child = Utils.getChild(element, AttrDataBinders.TAG);
        if (child == null) {
            MamlLog.m17851e(LOG_TAG, "no attr data binder");
            throw new IllegalArgumentException("List: no attr data binder");
        }
        this.mAttrDataBinders = new AttrDataBinders(child, this.mRoot.getContext().mContextVariables);
        Element child2 = Utils.getChild(element, "Data");
        if (child2 != null) {
            this.mListData = new ListData(child2, this.mRoot, this);
        }
        ScreenElement screenElementFindElement = findElement("scrollbar");
        if (screenElementFindElement instanceof AnimatedScreenElement) {
            AnimatedScreenElement animatedScreenElement = (AnimatedScreenElement) screenElementFindElement;
            this.mScrollBar = animatedScreenElement;
            animatedScreenElement.mAlignV = ScreenElement.AlignV.TOP;
            removeElement(screenElementFindElement);
            addElement(this.mScrollBar);
        }
        this.mSelectedIdVar = new IndexedVariable(this.mName + ".selectedId", this.mRoot.getContext().mVariables, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addColumn(String str, Object[] objArr) {
        if (str == null || objArr == null) {
            return;
        }
        int i2 = -1;
        int size = this.mColumnsInfo.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            if (str.equals(this.mColumnsInfo.get(i4).mVarName)) {
                i2 = i4;
                break;
            }
            i4++;
        }
        if (i2 < 0) {
            return;
        }
        synchronized (this.mLock) {
            int length = objArr.length;
            int size2 = this.mDataList.size();
            while (i3 < size2) {
                this.mDataList.get(i3).setData(i2, i3 < length ? objArr[i3] : null);
                if (this.mDataList.get(i3).mElementIndex >= 0) {
                    getItem(i3);
                }
                i3++;
            }
            while (size2 < length) {
                Object[] objArr2 = new Object[this.mColumnsInfo.size()];
                objArr2[i2] = objArr[size2];
                addItem(objArr2);
                size2++;
            }
            clearEmptyRowLocked();
        }
        requestUpdate();
    }

    private void bindDataLocked(ListItemElement listItemElement, int i2, int i3) {
        if (i3 < 0 || i3 >= this.mItemCount) {
            MamlLog.m17851e(LOG_TAG, "invalid item data");
            return;
        }
        Object[] objArr = this.mDataList.get(i3).mData;
        listItemElement.setDataIndex(i3);
        this.mDataList.get(i3).mElementIndex = i2;
        this.mDataList.get(i3).mNeedRebind = false;
        listItemElement.setY(i3 * this.mItem.getHeight());
        int size = this.mColumnsInfo.size();
        ContextVariables contextVariables = getContext().mContextVariables;
        for (int i4 = 0; i4 < size; i4++) {
            contextVariables.setVar(this.mColumnsInfo.get(i4).mVarName, objArr[i4]);
        }
        AttrDataBinders attrDataBinders = this.mAttrDataBinders;
        if (attrDataBinders != null) {
            attrDataBinders.bind(listItemElement);
        }
    }

    private void checkVisibility() {
        synchronized (this.mLock) {
            ArrayList<ScreenElement> elements = this.mInnerGroup.getElements();
            for (int i2 = 0; i2 < elements.size(); i2++) {
                ListItemElement listItemElement = (ListItemElement) elements.get(i2);
                int dataIndex = listItemElement.getDataIndex();
                if (dataIndex < 0 || dataIndex < this.mTopIndex || dataIndex > this.mBottomIndex) {
                    if (listItemElement.isVisible()) {
                        listItemElement.show(false);
                    }
                } else if (!listItemElement.isVisible()) {
                    listItemElement.show(true);
                }
            }
        }
    }

    private void clearEmptyRowLocked() {
        for (int size = this.mDataList.size() - 1; size >= 0; size--) {
            Object[] objArr = this.mDataList.get(size).mData;
            int length = objArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = true;
                    break;
                } else if (objArr[i2] != null) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                return;
            }
            removeItemLocked(size);
        }
    }

    private ListItemElement getItem(int i2) {
        synchronized (this.mLock) {
            ListItemElement listItemElement = null;
            if (i2 >= 0) {
                if (i2 < this.mItemCount) {
                    int useableElementIndex = this.mDataList.get(i2).mElementIndex;
                    if (useableElementIndex >= 0 && useableElementIndex < this.mInnerGroup.getElements().size()) {
                        listItemElement = (ListItemElement) this.mInnerGroup.getElements().get(useableElementIndex);
                    }
                    if (useableElementIndex < 0 || (listItemElement != null && listItemElement.getDataIndex() != i2)) {
                        useableElementIndex = getUseableElementIndex();
                        listItemElement = (ListItemElement) this.mInnerGroup.getElements().get(useableElementIndex);
                        if (listItemElement != null && listItemElement.getDataIndex() < 0) {
                            listItemElement.reset();
                        }
                    }
                    if (listItemElement != null && (listItemElement.getDataIndex() != i2 || this.mDataList.get(i2).mNeedRebind)) {
                        bindDataLocked(listItemElement, useableElementIndex, i2);
                    }
                    return listItemElement;
                }
            }
            return null;
        }
    }

    private int getUseableElementIndex() {
        int iIntValue;
        if (this.mReuseIndex.size() > 0) {
            iIntValue = this.mReuseIndex.remove(0).intValue();
        } else if (this.mIsUpDirection) {
            iIntValue = this.mIndexOrder.remove(0).intValue();
        } else {
            iIntValue = this.mIndexOrder.remove(r0.size() - 1).intValue();
        }
        if (this.mIsUpDirection) {
            this.mIndexOrder.add(Integer.valueOf(iIntValue));
        } else {
            this.mIndexOrder.add(0, Integer.valueOf(iIntValue));
        }
        return iIntValue;
    }

    private void moveTo(double d2) {
        if (d2 < getHeight() - (this.mItemCount * this.mItem.getHeight())) {
            d2 = getHeight() - (this.mItemCount * this.mItem.getHeight());
            this.mStartAnimTime = 0L;
        }
        if (d2 > 0.0d) {
            this.mStartAnimTime = 0L;
            d2 = 0.0d;
        }
        this.mInnerGroup.setY((float) d2);
        this.mTopIndex = Math.min((int) Math.floor((-d2) / ((double) this.mItem.getHeight())), (this.mItemCount - ((int) (getHeight() / this.mItem.getHeight()))) - 1);
        this.mBottomIndex = Math.min(((int) (getHeight() / this.mItem.getHeight())) + this.mTopIndex, this.mItemCount - 1);
        for (int i2 = this.mTopIndex; i2 <= this.mBottomIndex; i2++) {
            getItem(i2);
        }
        checkVisibility();
        updateScorllBar();
    }

    private void removeItemLocked(int i2) {
        if (i2 < 0 || i2 >= this.mItemCount) {
            return;
        }
        this.mDataList.remove(i2);
        this.mItemCount--;
        setActualHeight(descale(getHeight()));
        int size = this.mIndexOrder.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ListItemElement listItemElement = (ListItemElement) this.mInnerGroup.getElements().get(this.mIndexOrder.get(i4).intValue());
            int dataIndex = listItemElement.getDataIndex();
            if (dataIndex == i2) {
                listItemElement.setDataIndex(-1);
                listItemElement.setY(-1.7976931348623157E308d);
                listItemElement.show(false);
                i3 = i4;
            } else if (dataIndex > i2) {
                listItemElement.setDataIndex(dataIndex - 1);
                listItemElement.setY(r5 * this.mItem.getHeight());
            }
        }
        if (size > 0) {
            int iIntValue = this.mIndexOrder.remove(i3).intValue();
            moveTo(this.mInnerGroup.getY());
            this.mReuseIndex.add(Integer.valueOf(iIntValue));
        }
        requestUpdate();
    }

    private void resetInner() {
        AnimatedScreenElement animatedScreenElement = this.mScrollBar;
        if (animatedScreenElement != null) {
            animatedScreenElement.show(false);
        }
        this.mMoving = false;
        this.mIsScroll = false;
        this.mIsChildScroll = false;
        this.mStartAnimTime = -1L;
        this.mSpeed = 0.0d;
    }

    private void setVariables() {
        int size = this.mColumnsInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ColumnInfo columnInfo = this.mColumnsInfo.get(i2);
            if (columnInfo.mType != ColumnInfo.Type.BITMAP) {
                IndexedVariable[] indexedVariableArr = this.mIndexedVariables;
                if (indexedVariableArr[i2] == null) {
                    indexedVariableArr[i2] = new IndexedVariable(this.mName + "." + columnInfo.mVarName, this.mRoot.getContext().mVariables, columnInfo.mType.isNumber());
                }
                synchronized (this.mLock) {
                    IndexedVariable indexedVariable = this.mIndexedVariables[i2];
                    int i3 = this.mSelectedId;
                    indexedVariable.set((i3 < 0 || i3 >= this.mDataList.size()) ? null : this.mDataList.get(this.mSelectedId).mData[i2]);
                }
            }
        }
    }

    private void startAnimation() {
        this.mStartAnimTime = SystemClock.elapsedRealtime();
        this.mStartAnimY = this.mInnerGroup.getY();
    }

    private void updateScorllBar() {
        if (this.mScrollBar == null || !this.mIsScroll) {
            return;
        }
        double height = this.mItemCount * this.mItem.getHeight();
        double height2 = getHeight();
        double d2 = height2 / height;
        boolean z2 = true;
        if (d2 >= 1.0d) {
            d2 = 0.0d;
            z2 = false;
        }
        double y3 = ((double) this.mInnerGroup.getY()) / (height2 - height);
        if (y3 > 1.0d) {
            y3 = 1.0d;
        }
        this.mScrollBar.setY((float) ((1.0d - d2) * height2 * y3));
        this.mScrollBar.setHeight((float) (height2 * d2));
        if (this.mScrollBar.isVisible() != z2) {
            this.mScrollBar.show(z2);
        }
    }

    public void addItem(Object... objArr) {
        if (objArr == null) {
            return;
        }
        if (objArr.length != this.mColumnsInfo.size()) {
            MamlLog.m17851e(LOG_TAG, "invalid item data count");
            return;
        }
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.mColumnsInfo.get(i2).validate(objArr[i2])) {
                MamlLog.m17851e(LOG_TAG, "invalid item data type: " + objArr[i2]);
                return;
            }
        }
        synchronized (this.mLock) {
            this.mDataList.add(new DataIndexMap((Object[]) objArr.clone()));
            this.mCurrentIndex++;
            this.mItemCount++;
            setActualHeight(descale(getHeight()));
            int iMax = (int) (Math.max(super.getHeight(), scale(evaluate(this.mMaxHeight))) / this.mItem.getHeight());
            this.mVisibleItemCount = iMax;
            this.mCachedItemCount = iMax * 2;
            int size = this.mInnerGroup.getElements().size();
            if (size < this.mCachedItemCount) {
                ListItemElement listItemElement = this.mItem;
                ListItemElement listItemElement2 = new ListItemElement(listItemElement.mNode, listItemElement.mRoot);
                this.mInnerGroup.addElement(listItemElement2);
                this.mDataList.get(this.mCurrentIndex).mElementIndex = size;
                this.mSelectedId = this.mCurrentIndex;
                listItemElement2.init();
                this.mSelectedId = -1;
                bindDataLocked(listItemElement2, size, this.mCurrentIndex);
                this.mIndexOrder.add(Integer.valueOf(this.mCurrentIndex));
            }
        }
        requestUpdate();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void doTick(long r11) {
        /*
            r10 = this;
            super.doTick(r11)
            long r0 = r10.mStartAnimTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L4c
            boolean r4 = r10.mPressed
            if (r4 != 0) goto L4c
            long r11 = r11 - r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L46
            double r0 = r10.mSpeed
            double r2 = com.miui.maml.elements.ListScreenElement.ACC
            double r11 = (double) r11
            double r4 = r2 * r11
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r6
            double r4 = r4 + r0
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L29
            goto L46
        L29:
            double r0 = r0 * r11
            double r0 = r0 / r6
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r4
            double r2 = r2 * r11
            double r2 = r2 * r11
            r11 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r11
            double r0 = r0 + r2
            r10.mOffsetY = r0
            float r11 = r10.mStartAnimY
            double r11 = (double) r11
            boolean r2 = r10.mIsUpDirection
            if (r2 == 0) goto L41
            double r0 = -r0
        L41:
            double r11 = r11 + r0
            r10.moveTo(r11)
            goto L49
        L46:
            r10.resetInner()
        L49:
            r10.requestUpdate()
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.elements.ListScreenElement.doTick(long):void");
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.ScreenElement
    public ScreenElement findElement(String str) {
        int i2;
        ScreenElement screenElementFindElement;
        synchronized (this.mLock) {
            int i3 = this.mSelectedId;
            return (i3 < 0 || i3 >= this.mItemCount || (i2 = this.mDataList.get(i3).mElementIndex) < 0 || (screenElementFindElement = ((ListItemElement) this.mInnerGroup.getElements().get(i2)).findElement(str)) == null) ? super.findElement(str) : screenElementFindElement;
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        if (this.mClearOnFinish) {
            removeAllItems();
        }
        ListData listData = this.mListData;
        if (listData != null) {
            listData.finish();
        }
    }

    public ArrayList<ColumnInfo> getColumnsInfo() {
        return this.mColumnsInfo;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getHeight() {
        return this.mMaxHeight == null ? super.getHeight() : Math.min(this.mItemCount * this.mItem.getHeight(), scale(evaluate(this.mMaxHeight)));
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        resetInner();
        this.mInnerGroup.setY(0.0d);
        setActualHeight(descale(getHeight()));
        this.mSelectedId = -1;
        this.mSelectedIdVar.set(-1);
        setVariables();
        ListData listData = this.mListData;
        if (listData != null) {
            listData.init();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.maml.elements.ElementGroup
    public ScreenElement onCreateChild(Element element) {
        if (!element.getTagName().equalsIgnoreCase(ListItemElement.TAG_NAME) || this.mInnerGroup != null) {
            return super.onCreateChild(element);
        }
        this.mItem = new ListItemElement(element, this.mRoot);
        ElementGroup elementGroup = new ElementGroup((Element) null, this.mRoot);
        this.mInnerGroup = elementGroup;
        return elementGroup;
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public boolean onTouch(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!isVisible()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                z2 = false;
                this.mPressed = false;
                if (this.mMoving) {
                    MamlLog.m17853i(LOG_TAG, "unlock touch up");
                    performAction("up");
                    onActionUp();
                    if (this.mSpeed < 400.0d) {
                        resetInner();
                    } else {
                        startAnimation();
                    }
                    z3 = true;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.mPressed = false;
                    if (this.mMoving) {
                        performAction("cancel");
                        resetInner();
                        this.mStartAnimTime = -1L;
                        z2 = false;
                        z3 = true;
                    }
                }
                z2 = false;
            } else if (this.mMoving) {
                this.mCurrentTime = SystemClock.elapsedRealtime();
                double d2 = y3;
                double d4 = d2 - this.mTouchStartY;
                this.mOffsetY = d4;
                this.mOffsetX = ((double) x3) - this.mTouchStartX;
                if (!this.mIsScroll && !this.mIsChildScroll) {
                    double dAbs = Math.abs(d4);
                    double dAbs2 = Math.abs(this.mOffsetX);
                    if (dAbs > 5.0d && !this.mIsChildScroll && dAbs >= dAbs2) {
                        this.mIsScroll = true;
                    } else if (dAbs2 > 5.0d && !this.mIsScroll && dAbs < dAbs2) {
                        this.mIsChildScroll = true;
                    }
                }
                this.mIsUpDirection = this.mOffsetY < 0.0d || this.mIsChildScroll;
                if (this.mIsScroll) {
                    motionEvent.setAction(3);
                    performAction("move");
                    onActionMove(x3, y3);
                    this.mSpeed = (Math.abs(this.mOffsetY) / (this.mCurrentTime - this.mLastTime)) * 1000.0d;
                    moveTo(((double) this.mInnerGroup.getY()) + this.mOffsetY);
                    this.mTouchStartY = d2;
                    this.mLastTime = this.mCurrentTime;
                }
                z3 = true;
                z2 = false;
            } else {
                z2 = false;
            }
            z3 = z2;
        } else {
            z2 = false;
            if (touched(x3, y3)) {
                this.mMoving = true;
                this.mPressed = true;
                performAction("down");
                onActionDown(x3, y3);
                this.mStartAnimTime = -1L;
                this.mSpeed = 0.0d;
                this.mLastTime = SystemClock.elapsedRealtime();
                int iFloor = (int) Math.floor((y3 - this.mInnerGroup.getAbsoluteTop()) / this.mItem.getHeight());
                this.mSelectedId = iFloor;
                this.mSelectedIdVar.set(iFloor);
                setVariables();
                this.mTouchStartX = x3;
                this.mTouchStartY = y3;
                updateScorllBar();
                z3 = true;
            }
            z3 = z2;
        }
        if (super.onTouch(motionEvent) || (z3 && this.mInterceptTouch)) {
            return true;
        }
        return z2;
    }

    public void removeAllItems() {
        synchronized (this.mLock) {
            this.mInnerGroup.removeAllElements();
            this.mInnerGroup.setY(0.0d);
            this.mDataList.clear();
            this.mIndexOrder.clear();
            this.mReuseIndex.clear();
            this.mCurrentIndex = -1;
            this.mItemCount = 0;
            setActualHeight(descale(getHeight()));
        }
    }

    private static class DataIndexMap {
        public Object[] mData;
        public int mElementIndex;
        public boolean mNeedRebind;

        public DataIndexMap(Object[] objArr, int i2) {
            this.mData = objArr;
            this.mElementIndex = i2;
        }

        public void setData(int i2, Object obj) {
            Object[] objArr = this.mData;
            if (objArr == null || objArr.length <= i2) {
                return;
            }
            objArr[i2] = obj;
            this.mNeedRebind = true;
        }

        public DataIndexMap(Object[] objArr) {
            this(objArr, -1);
        }
    }
}
