package com.miui.maml;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.core.app.x9kr;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.maml.f7l8;
import com.android.thememanager.superwallpaper.view.MamlPreview;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.android.exoplayer2.util.wvg;
import com.miui.maml.ActionCommand;
import com.miui.maml.NotifierManager;
import com.miui.maml.ObjectFactory;
import com.miui.maml.SoundManager;
import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.SensorBinder;
import com.miui.maml.data.VariableBinder;
import com.miui.maml.data.VariableNames;
import com.miui.maml.data.VariableType;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.AnimConfigElement;
import com.miui.maml.elements.AnimStateElement;
import com.miui.maml.elements.AnimatedScreenElement;
import com.miui.maml.elements.ElementGroup;
import com.miui.maml.elements.FunctionElement;
import com.miui.maml.elements.GraphicsElement;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.elements.VariableElement;
import com.miui.maml.elements.filament.PhysicallyBasedRenderingElement;
import com.miui.maml.elements.lottie.LottieScreenElement;
import com.miui.maml.elements.video.VideoElement;
import com.miui.maml.util.ColorParser;
import com.miui.maml.util.HideSdkDependencyUtils;
import com.miui.maml.util.IntentInfo;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.MobileDataUtils;
import com.miui.maml.util.ReflectionHelper;
import com.miui.maml.util.SharedPreferenceHelper;
import com.miui.maml.util.Task;
import com.miui.maml.util.Utils;
import com.miui.maml.util.Variable;
import com.miui.maml.widget.edit.MamlutilKt;
import com.xiaomi.onetrack.api.C5693g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.vyq;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionCommand {
    public static final String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    private static final String COMMAND_BLUETOOTH = "Bluetooth";
    private static final String COMMAND_DATA = "Data";
    private static final String COMMAND_RING_MODE = "RingMode";
    private static final String COMMAND_USB_STORAGE = "UsbStorage";
    private static final String COMMAND_WIFI = "Wifi";
    private static final String LOG_TAG = "ActionCommand";
    private static final int STATE_DISABLED = 0;
    private static final int STATE_ENABLED = 1;
    private static final int STATE_INTERMEDIATE = 5;
    private static final int STATE_TURNING_OFF = 3;
    private static final int STATE_TURNING_ON = 2;
    private static final int STATE_UNKNOWN = 4;
    public static final String TAG_NAME = "Command";
    public static final String USB_CONNECTED = "connected";
    private static final Handler mHandler = new Handler(Looper.getMainLooper());
    protected ScreenElement mScreenElement;

    /* JADX INFO: renamed from: com.miui.maml.ActionCommand$1 */
    static /* synthetic */ class C51191 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$AnimConfigCommand$Type;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$AnimStateCommand$Type;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$AnimationCommand$CommandType */
        static final /* synthetic */ int[] f29452x71f10317;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$GraphicsCommand$CommandType */
        static final /* synthetic */ int[] f29453xd6f2c2b2;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$IntentCommand$IntentType;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$JsonObjectCommand$CommandType */
        static final /* synthetic */ int[] f29454x68298d36;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$PbrCommand$CommandType;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$SensorBinderCommand$CommandType */
        static final /* synthetic */ int[] f29455xfb7ace19;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$TickListenerCommand$CommandType */
        static final /* synthetic */ int[] f29456xa630c98c;

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$ActionCommand$VariableBinderCommand$Command */
        static final /* synthetic */ int[] f29457xba7f707d;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$SoundManager$Command;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$data$VariableType;

        static {
            int[] iArr = new int[LottieCommand.CommandType.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType = iArr;
            try {
                iArr[LottieCommand.CommandType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.SET_SPEED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.GOTO_AND_PLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.GOTO_AND_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.PLAY_SEGMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[LottieCommand.CommandType.SET_LOOP_COUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[VideoCommand.CommandType.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType = iArr2;
            try {
                iArr2[VideoCommand.CommandType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType[VideoCommand.CommandType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType[VideoCommand.CommandType.SEEK_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType[VideoCommand.CommandType.SET_VOLUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType[VideoCommand.CommandType.CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[JsonObjectCommand.CommandType.values().length];
            f29454x68298d36 = iArr3;
            try {
                iArr3[JsonObjectCommand.CommandType.PUT_INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29454x68298d36[JsonObjectCommand.CommandType.PUT_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29454x68298d36[JsonObjectCommand.CommandType.PUT_JSON_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29454x68298d36[JsonObjectCommand.CommandType.PUT_JSON_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f29454x68298d36[JsonObjectCommand.CommandType.PUT_BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr4 = new int[FolmeCommand.Type.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type = iArr4;
            try {
                iArr4[FolmeCommand.Type.TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type[FolmeCommand.Type.SET_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type[FolmeCommand.Type.FROM_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type[FolmeCommand.Type.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr5 = new int[AnimConfigCommand.Type.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$AnimConfigCommand$Type = iArr5;
            try {
                iArr5[AnimConfigCommand.Type.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimConfigCommand$Type[AnimConfigCommand.Type.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimConfigCommand$Type[AnimConfigCommand.Type.CLEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr6 = new int[AnimStateCommand.Type.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$AnimStateCommand$Type = iArr6;
            try {
                iArr6[AnimStateCommand.Type.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimStateCommand$Type[AnimStateCommand.Type.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimStateCommand$Type[AnimStateCommand.Type.CLEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr7 = new int[AnimationCommand.CommandType.values().length];
            f29452x71f10317 = iArr7;
            try {
                iArr7[AnimationCommand.CommandType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f29452x71f10317[AnimationCommand.CommandType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f29452x71f10317[AnimationCommand.CommandType.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f29452x71f10317[AnimationCommand.CommandType.PLAY_WITH_PARAMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr8 = new int[TickListenerCommand.CommandType.values().length];
            f29456xa630c98c = iArr8;
            try {
                iArr8[TickListenerCommand.CommandType.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f29456xa630c98c[TickListenerCommand.CommandType.UNSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[GraphicsCommand.CommandType.values().length];
            f29453xd6f2c2b2 = iArr9;
            try {
                iArr9[GraphicsCommand.CommandType.LINE_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.MOVE_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.CURVE_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.DRAW_RECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.BEGIN_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.LINE_STYLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.DRAW_CIRCLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.DRAW_ELLIPSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.CUBIC_CURVE_TO.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.DRAW_ROUND_RECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.LINE_GRADIENT_STYLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.BEGIN_GRADIENT_FILL.ordinal()] = 12;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.CREATE_GRADIENT_BOX.ordinal()] = 13;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f29453xd6f2c2b2[GraphicsCommand.CommandType.SET_RENDER_LISTENER.ordinal()] = 14;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr10 = new int[PbrCommand.CommandType.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$PbrCommand$CommandType = iArr10;
            try {
                iArr10[PbrCommand.CommandType.UPDATE_UNIFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            int[] iArr11 = new int[SensorBinderCommand.CommandType.values().length];
            f29455xfb7ace19 = iArr11;
            try {
                iArr11[SensorBinderCommand.CommandType.TURN_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f29455xfb7ace19[SensorBinderCommand.CommandType.TURN_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            int[] iArr12 = new int[TargetCommand.TargetType.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType = iArr12;
            try {
                iArr12[TargetCommand.TargetType.SCREEN_ELEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[TargetCommand.TargetType.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[TargetCommand.TargetType.ANIMATION_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[TargetCommand.TargetType.VARIABLE_BINDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[TargetCommand.TargetType.CONSTRUCTOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused57) {
            }
            int[] iArr13 = new int[AnimationProperty.Type.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type = iArr13;
            try {
                iArr13[AnimationProperty.Type.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type[AnimationProperty.Type.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type[AnimationProperty.Type.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type[AnimationProperty.Type.PLAY_WITH_PARAMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused61) {
            }
            int[] iArr14 = new int[SoundManager.Command.values().length];
            $SwitchMap$com$miui$maml$SoundManager$Command = iArr14;
            try {
                iArr14[SoundManager.Command.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$miui$maml$SoundManager$Command[SoundManager.Command.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$miui$maml$SoundManager$Command[SoundManager.Command.Resume.ordinal()] = 3;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$miui$maml$SoundManager$Command[SoundManager.Command.Stop.ordinal()] = 4;
            } catch (NoSuchFieldError unused65) {
            }
            int[] iArr15 = new int[IntentCommand.IntentType.values().length];
            $SwitchMap$com$miui$maml$ActionCommand$IntentCommand$IntentType = iArr15;
            try {
                iArr15[IntentCommand.IntentType.Activity.ordinal()] = 1;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$IntentCommand$IntentType[IntentCommand.IntentType.Broadcast.ordinal()] = 2;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$IntentCommand$IntentType[IntentCommand.IntentType.Service.ordinal()] = 3;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$com$miui$maml$ActionCommand$IntentCommand$IntentType[IntentCommand.IntentType.Var.ordinal()] = 4;
            } catch (NoSuchFieldError unused69) {
            }
            int[] iArr16 = new int[VariableBinderCommand.Command.values().length];
            f29457xba7f707d = iArr16;
            try {
                iArr16[VariableBinderCommand.Command.Refresh.ordinal()] = 1;
            } catch (NoSuchFieldError unused70) {
            }
            int[] iArr17 = new int[VariableType.values().length];
            $SwitchMap$com$miui$maml$data$VariableType = iArr17;
            try {
                iArr17[VariableType.NUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                $SwitchMap$com$miui$maml$data$VariableType[VariableType.STR.ordinal()] = 2;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$com$miui$maml$data$VariableType[VariableType.JSONO.ordinal()] = 3;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$com$miui$maml$data$VariableType[VariableType.JSONA.ordinal()] = 4;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    private static class ActionPerformCommand extends TargetCommand {
        public static final String TAG_NAME = "ActionCommand";
        private String mAction;
        private Expression mActionExp;

        public ActionPerformCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("action");
            this.mAction = attribute;
            if (TextUtils.isEmpty(attribute)) {
                this.mAction = null;
                this.mActionExp = Expression.build(getVariables(), element.getAttribute("actionExp"));
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            String strEvaluateStr;
            ScreenElement screenElement = (ScreenElement) getTarget();
            if (screenElement == null) {
                return;
            }
            String str = this.mAction;
            if (str != null) {
                screenElement.performAction(str);
                return;
            }
            Expression expression = this.mActionExp;
            if (expression == null || (strEvaluateStr = expression.evaluateStr()) == null) {
                return;
            }
            screenElement.performAction(strEvaluateStr);
        }
    }

    private static class AnimConfigCommand extends TargetCommand {
        public static final String TAG_NAME = "AnimConfigCommand";
        private Expression mAttr;
        private Type mCommand;
        private Expression mSubName;
        private Expression[] mValuesExp;

        enum Type {
            UPDATE,
            REMOVE,
            CLEAR,
            INVALID
        }

        public AnimConfigCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mSubName = Expression.build(getVariables(), element.getAttribute("subNameExp"));
            this.mAttr = Expression.build(getVariables(), element.getAttribute("attrExp"));
            this.mValuesExp = Expression.buildMultiple(getVariables(), element.getAttribute("valuesExp"));
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            switch (attribute) {
                case "remove":
                    this.mCommand = Type.REMOVE;
                    break;
                case "update":
                    this.mCommand = Type.UPDATE;
                    break;
                case "clear":
                    this.mCommand = Type.CLEAR;
                    break;
                default:
                    this.mCommand = Type.INVALID;
                    break;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            String str;
            Object target = getTarget();
            if (target == null || !(target instanceof AnimConfigElement)) {
                return;
            }
            AnimConfigElement animConfigElement = (AnimConfigElement) target;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mTargetName);
            if (this.mSubName != null) {
                str = "." + this.mSubName.evaluateStr();
            } else {
                str = "";
            }
            sb.append(str);
            String string = sb.toString();
            Expression expression = this.mAttr;
            String strEvaluateStr = expression != null ? expression.evaluateStr() : "";
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$AnimConfigCommand$Type[this.mCommand.ordinal()];
            if (i2 == 1) {
                Expression[] expressionArr = this.mValuesExp;
                if (expressionArr != null) {
                    animConfigElement.updateConfigData(string, strEvaluateStr, expressionArr);
                    return;
                }
                return;
            }
            if (i2 == 2) {
                animConfigElement.removeConfigData(string, strEvaluateStr);
            } else {
                if (i2 != 3) {
                    return;
                }
                animConfigElement.clearConfigData();
            }
        }
    }

    private static class AnimStateCommand extends TargetCommand {
        public static final String TAG_NAME = "AnimStateCommand";
        private Expression mAttrArrayName;
        private String[] mAttrs;
        private Expression[] mAttrsExp;
        private Type mCommand;
        private boolean mIsAttrsValid;
        private boolean mIsValuesValid;
        private Expression mValueArrayName;
        private double[] mValues;
        private Expression[] mValuesExp;

        enum Type {
            UPDATE,
            REMOVE,
            CLEAR,
            INVALID
        }

        public AnimStateCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            Variables variables = getVariables();
            this.mValueArrayName = Expression.build(variables, element.getAttribute("valueArrayNameExp"));
            this.mAttrArrayName = Expression.build(variables, element.getAttribute("attrArrayNameExp"));
            this.mValuesExp = Expression.buildMultiple(variables, element.getAttribute("valuesExp"));
            this.mAttrsExp = Expression.buildMultiple(variables, element.getAttribute("attrsExp"));
            this.mIsValuesValid = isExpressionsValid(this.mValuesExp);
            boolean zIsExpressionsValid = isExpressionsValid(this.mAttrsExp);
            this.mIsAttrsValid = zIsExpressionsValid;
            if (zIsExpressionsValid) {
                this.mAttrs = new String[this.mAttrsExp.length];
            }
            if (this.mIsValuesValid) {
                this.mValues = new double[this.mValuesExp.length];
            }
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            switch (attribute) {
                case "remove":
                    this.mCommand = Type.REMOVE;
                    break;
                case "update":
                    this.mCommand = Type.UPDATE;
                    break;
                case "clear":
                    this.mCommand = Type.CLEAR;
                    break;
                default:
                    this.mCommand = Type.INVALID;
                    break;
            }
        }

        private void remove(AnimStateElement animStateElement) {
            Object obj;
            String[] strArr = this.mAttrs;
            if (strArr == null) {
                if (this.mAttrArrayName == null || (obj = getVariables().get(this.mAttrArrayName.evaluateStr())) == null || !(obj instanceof String[])) {
                    return;
                }
                animStateElement.removeAttr((String[]) obj);
                return;
            }
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mAttrs[i2] = this.mAttrsExp[i2].evaluateStr();
            }
            animStateElement.removeAttr(this.mAttrs);
        }

        private void update(AnimStateElement animStateElement) {
            double[] dArr;
            String[] strArr = this.mAttrs;
            if (strArr != null && (dArr = this.mValues) != null && strArr.length == dArr.length) {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    this.mAttrs[i2] = this.mAttrsExp[i2].evaluateStr();
                    this.mValues[i2] = this.mValuesExp[i2].evaluate();
                }
                animStateElement.updateAttr(this.mAttrs, this.mValues);
                return;
            }
            if (this.mAttrArrayName == null || this.mValueArrayName == null) {
                return;
            }
            Object obj = getVariables().get(this.mAttrArrayName.evaluateStr());
            Object obj2 = getVariables().get(this.mValueArrayName.evaluateStr());
            if (obj == null || !(obj instanceof String[]) || obj2 == null || !(obj2 instanceof double[])) {
                return;
            }
            animStateElement.updateAttr((String[]) obj, (double[]) obj2);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof AnimStateElement)) {
                return;
            }
            AnimStateElement animStateElement = (AnimStateElement) target;
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$AnimStateCommand$Type[this.mCommand.ordinal()];
            if (i2 == 1) {
                update(animStateElement);
            } else if (i2 == 2) {
                remove(animStateElement);
            } else {
                if (i2 != 3) {
                    return;
                }
                animStateElement.clear();
            }
        }
    }

    private static class AnimationCommand extends TargetCommand {
        public static final String TAG_NAME = "AnimationCommand";
        private boolean mAllAni;
        private String[] mAniTags;
        private CommandType mCommand;
        private Expression[] mPlayParams;

        private enum CommandType {
            INVALID,
            PLAY,
            PAUSE,
            RESUME,
            PLAY_WITH_PARAMS
        }

        public AnimationCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("command");
            if (attribute.equalsIgnoreCase(MamlPreview.f16155c)) {
                this.mCommand = CommandType.PLAY;
            } else if (attribute.equalsIgnoreCase("pause")) {
                this.mCommand = CommandType.PAUSE;
            } else if (attribute.equalsIgnoreCase("resume")) {
                this.mCommand = CommandType.RESUME;
            } else if (attribute.toLowerCase().startsWith("play(") && attribute.endsWith(")")) {
                this.mCommand = CommandType.PLAY_WITH_PARAMS;
                Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), attribute.substring(5, attribute.length() - 1));
                this.mPlayParams = expressionArrBuildMultiple;
                if (expressionArrBuildMultiple != null && expressionArrBuildMultiple.length != 2 && expressionArrBuildMultiple.length != 4) {
                    MamlLog.m17851e("ActionCommand", "bad expression format");
                }
            } else {
                this.mCommand = CommandType.INVALID;
            }
            String attribute2 = element.getAttribute("tags");
            if (".".equals(attribute2)) {
                this.mAllAni = true;
            } else {
                if (TextUtils.isEmpty(attribute2)) {
                    return;
                }
                this.mAniTags = attribute2.split(",");
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            Expression expression;
            ScreenElement screenElement = (ScreenElement) getTarget();
            if (screenElement == null) {
                return;
            }
            CommandType commandType = this.mCommand;
            if ((commandType == CommandType.PLAY || commandType == CommandType.PLAY_WITH_PARAMS) && (this.mAllAni || this.mAniTags != null)) {
                screenElement.setAnim(this.mAniTags);
            }
            int i2 = C51191.f29452x71f10317[this.mCommand.ordinal()];
            if (i2 == 1) {
                screenElement.playAnim();
                return;
            }
            if (i2 == 2) {
                screenElement.pauseAnim();
                return;
            }
            if (i2 == 3) {
                screenElement.resumeAnim();
                return;
            }
            if (i2 != 4) {
                return;
            }
            long jEvaluate = 0;
            long jEvaluate2 = -1;
            Expression[] expressionArr = this.mPlayParams;
            boolean z2 = false;
            if (expressionArr.length > 0) {
                Expression expression2 = expressionArr[0];
                jEvaluate = (long) (expression2 == null ? 0.0d : expression2.evaluate());
            }
            Expression[] expressionArr2 = this.mPlayParams;
            if (expressionArr2.length > 1) {
                Expression expression3 = expressionArr2[1];
                jEvaluate2 = (long) (expression3 == null ? -1.0d : expression3.evaluate());
            }
            Expression[] expressionArr3 = this.mPlayParams;
            boolean z3 = expressionArr3.length > 2 && (expression = expressionArr3[2]) != null && expression.evaluate() > 0.0d;
            Expression[] expressionArr4 = this.mPlayParams;
            if (expressionArr4.length > 3) {
                Expression expression4 = expressionArr4[3];
                z2 = expression4 != null && expression4.evaluate() > 0.0d;
            }
            screenElement.playAnim(jEvaluate, jEvaluate2, z3, z2);
        }
    }

    @Deprecated
    private static class AnimationProperty extends PropertyCommand {
        public static final String PROPERTY_NAME = "animation";
        private Expression[] mPlayParams;
        private Type mType;

        enum Type {
            INVALID,
            PLAY,
            PAUSE,
            RESUME,
            PLAY_WITH_PARAMS
        }

        protected AnimationProperty(ScreenElement screenElement, Variable variable, String str) {
            super(screenElement, variable, str);
            if (str.equalsIgnoreCase(MamlPreview.f16155c)) {
                this.mType = Type.PLAY;
                return;
            }
            if (str.equalsIgnoreCase("pause")) {
                this.mType = Type.PAUSE;
                return;
            }
            if (str.equalsIgnoreCase("resume")) {
                this.mType = Type.RESUME;
                return;
            }
            if (!str.toLowerCase().startsWith("play(") || !str.endsWith(")")) {
                this.mType = Type.INVALID;
                return;
            }
            this.mType = Type.PLAY_WITH_PARAMS;
            Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), str.substring(5, str.length() - 1));
            this.mPlayParams = expressionArrBuildMultiple;
            if (expressionArrBuildMultiple == null || expressionArrBuildMultiple.length == 2 || expressionArrBuildMultiple.length == 4) {
                return;
            }
            MamlLog.m17851e("ActionCommand", "bad expression format");
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            boolean z2;
            boolean z3;
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$AnimationProperty$Type[this.mType.ordinal()];
            if (i2 == 1) {
                this.mTargetElement.playAnim();
                return;
            }
            if (i2 == 2) {
                this.mTargetElement.pauseAnim();
                return;
            }
            if (i2 == 3) {
                this.mTargetElement.resumeAnim();
                return;
            }
            if (i2 != 4) {
                return;
            }
            long jEvaluate = 0;
            long jEvaluate2 = -1;
            Expression[] expressionArr = this.mPlayParams;
            if (expressionArr.length > 0) {
                Expression expression = expressionArr[0];
                jEvaluate = (long) (expression == null ? 0.0d : expression.evaluate());
            }
            long j2 = jEvaluate;
            Expression[] expressionArr2 = this.mPlayParams;
            if (expressionArr2.length > 1) {
                Expression expression2 = expressionArr2[1];
                jEvaluate2 = (long) (expression2 == null ? -1.0d : expression2.evaluate());
            }
            long j3 = jEvaluate2;
            Expression[] expressionArr3 = this.mPlayParams;
            if (expressionArr3.length > 2) {
                Expression expression3 = expressionArr3[2];
                z2 = expression3 != null && expression3.evaluate() > 0.0d;
            } else {
                z2 = false;
            }
            Expression[] expressionArr4 = this.mPlayParams;
            if (expressionArr4.length > 3) {
                Expression expression4 = expressionArr4[3];
                z3 = expression4 != null && expression4.evaluate() > 0.0d;
            } else {
                z3 = false;
            }
            this.mTargetElement.playAnim(j2, j3, z2, z3);
        }
    }

    private static abstract class BaseMethodCommand extends TargetCommand {
        protected static final int ERROR_EXCEPTION = -2;
        protected static final int ERROR_NO_METHOD = -1;
        protected static final int ERROR_SUCCESS = 1;
        protected IndexedVariable mErrorCodeVar;
        private ObjVar[] mParamObjVars;
        protected Class<?>[] mParamTypes;
        protected Object[] mParamValues;
        private Expression[] mParams;
        protected IndexedVariable mReturnVar;
        protected Class<?> mTargetClass;
        protected String mTargetClassName;

        public BaseMethodCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute(C5693g.f31802r);
            this.mTargetClassName = attribute;
            if (TextUtils.isEmpty(attribute)) {
                this.mTargetClassName = null;
            }
            this.mParams = Expression.buildMultiple(getVariables(), element.getAttribute("params"));
            String attribute2 = element.getAttribute("paramTypes");
            if (this.mParams != null && !TextUtils.isEmpty(attribute2)) {
                try {
                    Class<?>[] clsArrStrTypesToClass = ReflectionHelper.strTypesToClass(TextUtils.split(attribute2, ","));
                    this.mParamTypes = clsArrStrTypesToClass;
                    if (this.mParams.length != clsArrStrTypesToClass.length) {
                        MamlLog.m17851e("ActionCommand", this.mLogStr + "different length of params and paramTypes");
                        this.mParams = null;
                        this.mParamTypes = null;
                    }
                } catch (ClassNotFoundException e2) {
                    MamlLog.m17851e("ActionCommand", this.mLogStr + "invalid method paramTypes. " + e2.toString());
                    this.mParams = null;
                    this.mParamTypes = null;
                }
            }
            String attribute3 = element.getAttribute("return");
            if (!TextUtils.isEmpty(attribute3)) {
                this.mReturnVar = new IndexedVariable(attribute3, getVariables(), VariableType.parseType(element.getAttribute("returnType")).isNumber());
            }
            String attribute4 = element.getAttribute("errorVar");
            if (!TextUtils.isEmpty(attribute4)) {
                this.mErrorCodeVar = new IndexedVariable(attribute4, getVariables(), true);
            }
            this.mLogStr += ", class=" + this.mTargetClassName + " type=" + this.mTargetType.toString();
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            super.finish();
            this.mParamValues = null;
        }

        @Override // com.miui.maml.ActionCommand.TargetCommand, com.miui.maml.ActionCommand
        public void init() {
            Expression expression;
            super.init();
            Class<?>[] clsArr = this.mParamTypes;
            if (clsArr != null) {
                if (this.mParamObjVars == null) {
                    this.mParamObjVars = new ObjVar[clsArr.length];
                }
                int i2 = 0;
                while (true) {
                    Class<?>[] clsArr2 = this.mParamTypes;
                    if (i2 >= clsArr2.length) {
                        break;
                    }
                    this.mParamObjVars[i2] = null;
                    Class<?> cls = clsArr2[i2];
                    if ((!cls.isPrimitive() || cls.isArray()) && cls != String.class && (expression = this.mParams[i2]) != null) {
                        String strEvaluateStr = expression.evaluateStr();
                        if (!TextUtils.isEmpty(strEvaluateStr)) {
                            this.mParamObjVars[i2] = new ObjVar(strEvaluateStr, getVariables());
                        }
                    }
                    i2++;
                }
            }
            String str = this.mTargetClassName;
            if (str != null) {
                try {
                    this.mTargetClass = Class.forName(str);
                } catch (Exception e2) {
                    MamlLog.m17854w("ActionCommand", "target class not found, name: " + this.mTargetClassName + "\n" + e2.toString());
                }
            }
        }

        protected void prepareParams() {
            Expression[] expressionArr = this.mParams;
            if (expressionArr == null) {
                return;
            }
            if (this.mParamValues == null) {
                this.mParamValues = new Object[expressionArr.length];
            }
            int i2 = 0;
            while (true) {
                Expression[] expressionArr2 = this.mParams;
                if (i2 >= expressionArr2.length) {
                    return;
                }
                Object[] objArr = this.mParamValues;
                objArr[i2] = null;
                Class<?> cls = this.mParamTypes[i2];
                Expression expression = expressionArr2[i2];
                if (expression != null) {
                    if (cls == String.class) {
                        objArr[i2] = expression.evaluateStr();
                    } else if (cls == Integer.TYPE) {
                        objArr[i2] = Integer.valueOf((int) expression.evaluate());
                    } else if (cls == Long.TYPE) {
                        objArr[i2] = Long.valueOf((long) expression.evaluate());
                    } else if (cls == Boolean.TYPE) {
                        objArr[i2] = Boolean.valueOf(expression.evaluate() > 0.0d);
                    } else if (cls == Double.TYPE) {
                        objArr[i2] = Double.valueOf(expression.evaluate());
                    } else if (cls == Float.TYPE) {
                        objArr[i2] = Float.valueOf((float) expression.evaluate());
                    } else if (cls == Byte.TYPE) {
                        objArr[i2] = Byte.valueOf((byte) expression.evaluate());
                    } else if (cls == Short.TYPE) {
                        objArr[i2] = Short.valueOf((short) expression.evaluate());
                    } else if (cls == Character.TYPE) {
                        objArr[i2] = Character.valueOf((char) expression.evaluate());
                    } else {
                        ObjVar objVar = this.mParamObjVars[i2];
                        objArr[i2] = objVar != null ? objVar.get() : null;
                    }
                }
                i2++;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private static class BluetoothSwitchCommand extends NotificationReceiver {
        private BluetoothAdapter mBluetoothAdapter;
        private boolean mBluetoothEnable;
        private boolean mBluetoothEnabling;
        private OnOffCommandHelper mOnOffHelper;

        public BluetoothSwitchCommand(ScreenElement screenElement, String str) {
            super(screenElement, VariableNames.BLUETOOTH_STATE, "android.bluetooth.adapter.action.STATE_CHANGED");
            this.mOnOffHelper = new OnOffCommandHelper(str);
        }

        private boolean ensureBluetoothAdapter() {
            if (this.mBluetoothAdapter == null) {
                this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            }
            return this.mBluetoothAdapter != null;
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (ensureBluetoothAdapter()) {
                OnOffCommandHelper onOffCommandHelper = this.mOnOffHelper;
                if (onOffCommandHelper.mIsToggle) {
                    if (this.mBluetoothEnable) {
                        this.mBluetoothAdapter.disable();
                        this.mBluetoothEnabling = false;
                    } else {
                        this.mBluetoothAdapter.enable();
                        this.mBluetoothEnabling = true;
                    }
                } else if (!this.mBluetoothEnabling) {
                    boolean z2 = this.mBluetoothEnable;
                    boolean z3 = onOffCommandHelper.mIsOn;
                    if (z2 != z3) {
                        if (z3) {
                            this.mBluetoothAdapter.enable();
                            this.mBluetoothEnabling = true;
                        } else {
                            this.mBluetoothAdapter.disable();
                            this.mBluetoothEnabling = false;
                        }
                    }
                }
                update();
            }
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver
        protected void update() {
            if (ensureBluetoothAdapter()) {
                try {
                    this.mBluetoothEnable = this.mBluetoothAdapter.isEnabled();
                } catch (SecurityException e2) {
                    MamlLog.m17854w("ActionCommand", "no Bluetooth permission. " + e2);
                }
                if (!this.mBluetoothEnable) {
                    updateState(this.mBluetoothEnabling ? 2 : 0);
                } else {
                    this.mBluetoothEnabling = false;
                    updateState(1);
                }
            }
        }
    }

    private static class ConditionCommand extends ActionCommand {
        private ActionCommand mCommand;
        private Expression mCondition;

        public ConditionCommand(ActionCommand actionCommand, Expression expression) {
            super(actionCommand.getRoot());
            this.mCommand = actionCommand;
            this.mCondition = expression;
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (this.mCondition.evaluate() > 0.0d) {
                this.mCommand.perform();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            this.mCommand.init();
        }
    }

    private static class DataSwitchCommand extends NotificationReceiver {
        private boolean mApnEnable;
        private MobileDataUtils mMobileDataUtils;
        private OnOffCommandHelper mOnOffHelper;

        public DataSwitchCommand(ScreenElement screenElement, String str) {
            super(screenElement, VariableNames.DATA_STATE, NotifierManager.TYPE_MOBILE_DATA);
            this.mOnOffHelper = new OnOffCommandHelper(str);
            this.mMobileDataUtils = MobileDataUtils.getInstance();
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            boolean z2 = this.mApnEnable;
            OnOffCommandHelper onOffCommandHelper = this.mOnOffHelper;
            boolean z3 = onOffCommandHelper.mIsToggle ? !z2 : onOffCommandHelper.mIsOn;
            if (z2 != z3) {
                this.mMobileDataUtils.enableMobileData(this.mScreenElement.getContext().mContext, z3);
            }
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver
        protected void update() {
            boolean zIsMobileEnable = this.mMobileDataUtils.isMobileEnable(this.mScreenElement.getContext().mContext);
            this.mApnEnable = zIsMobileEnable;
            updateState(zIsMobileEnable ? 1 : 0);
        }
    }

    private static class DelayCommand extends ActionCommand {
        private Runnable mCmd;
        private ActionCommand mCommand;
        private long mDelay;

        public DelayCommand(ActionCommand actionCommand, long j2) {
            super(actionCommand.getRoot());
            this.mCommand = actionCommand;
            this.mDelay = j2;
            this.mCmd = new Runnable() { // from class: com.miui.maml.ActionCommand.DelayCommand.1
                @Override // java.lang.Runnable
                public void run() {
                    DelayCommand.this.mCommand.perform();
                }
            };
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            getRoot().postDelayed(this.mCmd, this.mDelay);
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            getRoot().removeCallbacks(this.mCmd);
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            this.mCommand.init();
        }
    }

    private static class EaseTypeCommand extends TargetCommand {
        public static final String TAG_NAME = "EaseTypeCommand";
        private String mEaseFun;
        private String mEaseParams;
        private Expression mEaseTypeExp;

        public EaseTypeCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mTargetType = TargetCommand.TargetType.ANIMATION_ITEM;
            this.mEaseTypeExp = Expression.build(getVariables(), element.getAttribute("easeTypeExp"));
            this.mEaseFun = element.getAttribute("easeFunExp");
            this.mEaseParams = element.getAttribute("easeParamsExp");
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            ArrayList arrayList = (ArrayList) getTarget();
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseAnimation.AnimationItem) it.next()).changeInterpolator(this.mEaseTypeExp.evaluateStr(), this.mEaseParams, this.mEaseFun);
            }
        }
    }

    private static class ExternCommand extends ActionCommand {
        public static final String TAG_NAME = "ExternCommand";
        private String mCommand;
        private Expression mNumParaExp;
        private Expression mStrParaExp;

        public ExternCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mCommand = element.getAttribute("command");
            this.mNumParaExp = Expression.build(getVariables(), element.getAttribute("numPara"));
            this.mStrParaExp = Expression.build(getVariables(), element.getAttribute("strPara"));
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            ScreenElementRoot root = getRoot();
            String str = this.mCommand;
            Expression expression = this.mNumParaExp;
            Double dValueOf = expression == null ? null : Double.valueOf(expression.evaluate());
            Expression expression2 = this.mStrParaExp;
            root.issueExternCommand(str, dValueOf, expression2 != null ? expression2.evaluateStr() : null);
        }
    }

    private static class FieldCommand extends BaseMethodCommand {
        public static final String TAG_NAME = "FieldCommand";
        private Field mField;
        private String mFieldName;
        private boolean mIsSet;

        public FieldCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mFieldName = element.getAttribute("field");
            this.mLogStr = "FieldCommand, " + this.mLogStr + ", field=" + this.mFieldName + "\n";
            String attribute = element.getAttribute("method");
            if ("get".equals(attribute)) {
                this.mIsSet = false;
            } else if ("set".equals(attribute)) {
                this.mIsSet = true;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (this.mField == null) {
                loadField();
            }
            if (this.mField != null) {
                try {
                    int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        if (this.mIsSet) {
                            prepareParams();
                            Object[] objArr = this.mParamValues;
                            if (objArr != null && objArr.length == 1) {
                                this.mField.set(getTarget(), this.mParamValues[0]);
                            }
                        } else if (this.mReturnVar != null) {
                            this.mReturnVar.set(this.mField.get(getTarget()));
                        }
                    }
                } catch (IllegalAccessException e2) {
                    MamlLog.m17851e("ActionCommand", e2.toString());
                } catch (IllegalArgumentException e3) {
                    MamlLog.m17851e("ActionCommand", e3.toString());
                } catch (NullPointerException e4) {
                    MamlLog.m17851e("ActionCommand", this.mLogStr + "Field target is null. " + e4.toString());
                }
            }
        }

        @Override // com.miui.maml.ActionCommand.BaseMethodCommand, com.miui.maml.ActionCommand.TargetCommand, com.miui.maml.ActionCommand
        public void init() {
            super.init();
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
            if ((i2 == 1 || i2 == 2) && this.mField != null) {
                loadField();
            }
        }

        protected void loadField() {
            Object target;
            if (this.mTargetClass == null && (target = getTarget()) != null) {
                this.mTargetClass = target.getClass();
            }
            Class<?> cls = this.mTargetClass;
            if (cls == null) {
                MamlLog.m17851e("ActionCommand", this.mLogStr + "class is null.");
                return;
            }
            try {
                this.mField = cls.getField(this.mFieldName);
            } catch (NoSuchFieldException e2) {
                MamlLog.m17851e("ActionCommand", this.mLogStr + e2.toString());
            }
        }
    }

    private static class FolmeCommand extends TargetCommand {
        public static final String TAG_NAME = "FolmeCommand";
        private Type mCommand;
        private Expression mConfig;
        private boolean mIsParamsValid;
        private boolean mIsStatesValid;
        private Expression[] mParams;
        private Expression[] mStates;

        enum Type {
            TO,
            SET_TO,
            FROM_TO,
            CANCEL,
            ADD_RANGE_BOARD,
            INVALID
        }

        public FolmeCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mParams = Expression.buildMultiple(getVariables(), element.getAttribute("params"));
            this.mStates = Expression.buildMultiple(getVariables(), element.getAttribute("states"));
            this.mConfig = Expression.build(getVariables(), element.getAttribute("config"));
            this.mIsParamsValid = isExpressionsValid(this.mParams);
            this.mIsStatesValid = isExpressionsValid(this.mStates);
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            switch (attribute) {
                case "cancel":
                    this.mCommand = Type.CANCEL;
                    break;
                case "fromTo":
                    this.mCommand = Type.FROM_TO;
                    break;
                case "to":
                    this.mCommand = Type.TO;
                    break;
                case "setTo":
                    this.mCommand = Type.SET_TO;
                    break;
                default:
                    this.mCommand = Type.INVALID;
                    break;
            }
        }

        private void folmeCancel(AnimatedScreenElement animatedScreenElement) {
            if (this.mIsParamsValid) {
                animatedScreenElement.folmeCancel(this.mParams);
            } else {
                animatedScreenElement.folmeCancel(null);
            }
        }

        private void folmeFromTo(AnimatedScreenElement animatedScreenElement) {
            if (this.mIsStatesValid) {
                Expression[] expressionArr = this.mStates;
                if (expressionArr.length > 1) {
                    String strEvaluateStr = expressionArr[0].evaluateStr();
                    String strEvaluateStr2 = this.mStates[1].evaluateStr();
                    Expression expression = this.mConfig;
                    animatedScreenElement.folmeFromTo(strEvaluateStr, strEvaluateStr2, expression != null ? expression.evaluateStr() : null);
                }
            }
        }

        private void folmeSetTo(AnimatedScreenElement animatedScreenElement) {
            if (this.mIsStatesValid) {
                Expression[] expressionArr = this.mStates;
                if (expressionArr.length > 0) {
                    animatedScreenElement.folmeSetTo(expressionArr[0].evaluateStr());
                }
            }
        }

        private void folmeTo(AnimatedScreenElement animatedScreenElement) {
            if (this.mIsStatesValid) {
                Expression[] expressionArr = this.mStates;
                if (expressionArr.length > 0) {
                    String strEvaluateStr = expressionArr[0].evaluateStr();
                    Expression expression = this.mConfig;
                    animatedScreenElement.folmeTo(strEvaluateStr, expression != null ? expression.evaluateStr() : null);
                }
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof AnimatedScreenElement)) {
                return;
            }
            AnimatedScreenElement animatedScreenElement = (AnimatedScreenElement) target;
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$FolmeCommand$Type[this.mCommand.ordinal()];
            if (i2 == 1) {
                folmeTo(animatedScreenElement);
                return;
            }
            if (i2 == 2) {
                folmeSetTo(animatedScreenElement);
            } else if (i2 == 3) {
                folmeFromTo(animatedScreenElement);
            } else {
                if (i2 != 4) {
                    return;
                }
                folmeCancel(animatedScreenElement);
            }
        }
    }

    private static class FrameRateCommand extends ActionCommand {
        private static final String TAG_NAME = "FrameRateCommand";
        private Expression mRate;

        public FrameRateCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mRate = Expression.build(screenElement.getVariables(), element.getAttribute("rate"));
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (this.mRate != null) {
                getRoot().requestFrameRateByCommand((float) this.mRate.evaluate());
            }
        }
    }

    private static class FunctionPerformCommand extends TargetCommand {
        public static final String TAG_NAME = "FunctionCommand";

        public FunctionPerformCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mTargetType = TargetCommand.TargetType.SCREEN_ELEMENT;
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof FunctionElement)) {
                return;
            }
            ((FunctionElement) target).perform();
        }
    }

    private static class GraphicsCommand extends TargetCommand {
        public static final String TAG_NAME = "GraphicsCommand";
        private Expression mColorArrayNameExp;
        private Expression mColorExp;
        private ColorParser[] mColorParsers;
        private int[] mColors;
        private CommandType mCommand;
        private String mCurrentColorArrayName;
        private String mCurrentStopArrayName;
        private boolean mIsParamsValid;
        private boolean mIsStopsValid;
        private Expression[] mParamExps;
        private Expression mStopArrayNameExp;
        private Expression[] mStopExps;
        private float[] mStops;

        private enum CommandType {
            INVALID,
            BEGIN_FILL,
            BEGIN_GRADIENT_FILL,
            CREATE_GRADIENT_BOX,
            CURVE_TO,
            CUBIC_CURVE_TO,
            DRAW_CIRCLE,
            DRAW_ELLIPSE,
            DRAW_RECT,
            DRAW_ROUND_RECT,
            LINE_GRADIENT_STYLE,
            LINE_STYLE,
            LINE_TO,
            MOVE_TO,
            SET_RENDER_LISTENER
        }

        public GraphicsCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            checkExps(element);
            this.mColorArrayNameExp = Expression.build(getVariables(), element.getAttribute("colorArrayNameExp"));
            this.mStopArrayNameExp = Expression.build(getVariables(), element.getAttribute("stopArrayNameExp"));
            this.mColorExp = Expression.build(getVariables(), element.getAttribute("colorExp"));
            parseCommand(element);
        }

        private void beginFill(GraphicsElement graphicsElement) {
            ColorParser[] colorParserArr = this.mColorParsers;
            int color = (colorParserArr == null || colorParserArr.length <= 0) ? -16777216 : colorParserArr[0].getColor();
            if (this.mColorExp != null) {
                color = (int) r1.evaluate();
            }
            graphicsElement.beginFill(color);
        }

        private void checkExps(Element element) {
            String[] strArrSplit;
            Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), element.getAttribute("paramsExp"));
            this.mParamExps = expressionArrBuildMultiple;
            this.mIsParamsValid = isExpressionsValid(expressionArrBuildMultiple);
            Expression[] expressionArrBuildMultiple2 = Expression.buildMultiple(getVariables(), element.getAttribute("stopsExp"));
            this.mStopExps = expressionArrBuildMultiple2;
            this.mIsStopsValid = isExpressionsValid(expressionArrBuildMultiple2);
            String attribute = element.getAttribute("colors");
            if (TextUtils.isEmpty(attribute) || (strArrSplit = attribute.split(",")) == null || strArrSplit.length <= 0) {
                return;
            }
            this.mColorParsers = new ColorParser[strArrSplit.length];
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                this.mColorParsers[i2] = new ColorParser(getVariables(), strArrSplit[i2]);
            }
        }

        private void createGradientBox(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 4) {
                    graphicsElement.createOrUpdateGradientBox(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()), scale((float) this.mParamExps[3].evaluate()), this.mParamExps[4].evaluateStr());
                }
            }
        }

        private void cubicCurveTo(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 5) {
                    graphicsElement.cubicCurveTo(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()), scale((float) this.mParamExps[3].evaluate()), scale((float) this.mParamExps[4].evaluate()), scale((float) this.mParamExps[5].evaluate()));
                }
            }
        }

        private void curveTo(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 3) {
                    graphicsElement.curveTo(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()), scale((float) this.mParamExps[3].evaluate()));
                }
            }
        }

        private void drawCircle(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 2) {
                    graphicsElement.drawCircle(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()));
                }
            }
        }

        private void drawEllipse(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 3) {
                    graphicsElement.drawEllipse(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()), scale((float) this.mParamExps[3].evaluate()));
                }
            }
        }

        private void drawRect(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 3) {
                    graphicsElement.drawRect(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()), scale((float) this.mParamExps[2].evaluate()), scale((float) this.mParamExps[3].evaluate()));
                }
            }
        }

        private void drawRoundRect(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 4) {
                    float fScale = scale((float) expressionArr[0].evaluate());
                    float fScale2 = scale((float) this.mParamExps[1].evaluate());
                    float fScale3 = scale((float) this.mParamExps[2].evaluate());
                    float fScale4 = scale((float) this.mParamExps[3].evaluate());
                    float fScale5 = scale((float) this.mParamExps[4].evaluate());
                    Expression[] expressionArr2 = this.mParamExps;
                    graphicsElement.drawRoundRect(fScale, fScale2, fScale3, fScale4, fScale5, expressionArr2.length > 5 ? scale((float) expressionArr2[5].evaluate()) : fScale5);
                }
            }
        }

        private void lineStyle(GraphicsElement graphicsElement) {
            if (!this.mIsParamsValid || this.mParamExps.length <= 0) {
                return;
            }
            int color = -16777216;
            if (this.mColorExp != null) {
                color = (int) r1.evaluate();
            } else {
                ColorParser[] colorParserArr = this.mColorParsers;
                if (colorParserArr != null && colorParserArr.length > 0) {
                    color = colorParserArr[0].getColor();
                }
            }
            int i2 = color;
            float fScale = scale((float) this.mParamExps[0].evaluate());
            Expression[] expressionArr = this.mParamExps;
            int iEvaluate = expressionArr.length > 1 ? (int) expressionArr[1].evaluate() : 0;
            Expression[] expressionArr2 = this.mParamExps;
            graphicsElement.lineStyle(fScale, i2, iEvaluate, expressionArr2.length > 2 ? (int) expressionArr2[2].evaluate() : 0, this.mParamExps.length > 3 ? (int) r0[3].evaluate() : 0);
        }

        private void lineTo(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 1) {
                    graphicsElement.lineTo(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()));
                }
            }
        }

        private void moveTo(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 1) {
                    graphicsElement.moveTo(scale((float) expressionArr[0].evaluate()), scale((float) this.mParamExps[1].evaluate()));
                }
            }
        }

        private void parseColor() {
            if (this.mColorArrayNameExp != null) {
                parseColorByArrayName();
                return;
            }
            ColorParser[] colorParserArr = this.mColorParsers;
            if (colorParserArr == null || colorParserArr.length <= 1) {
                return;
            }
            parseColorByParsers();
        }

        private void parseColorByArrayName() {
            String strEvaluateStr = this.mColorArrayNameExp.evaluateStr();
            if (TextUtils.isEmpty(strEvaluateStr)) {
                this.mColors = null;
                return;
            }
            if (strEvaluateStr.equals(this.mCurrentColorArrayName)) {
                return;
            }
            this.mCurrentColorArrayName = strEvaluateStr;
            Object obj = new IndexedVariable(strEvaluateStr, getVariables(), false).get();
            if (obj != null && (obj instanceof int[])) {
                int[] iArr = (int[]) obj;
                if (iArr.length > 1) {
                    this.mColors = iArr;
                    return;
                }
            }
            this.mColors = null;
        }

        private void parseColorByParsers() {
            if (this.mColors == null) {
                this.mColors = new int[this.mColorParsers.length];
            }
            int i2 = 0;
            while (true) {
                ColorParser[] colorParserArr = this.mColorParsers;
                if (i2 >= colorParserArr.length) {
                    return;
                }
                this.mColors[i2] = colorParserArr[i2].getColor();
                i2++;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void parseCommand(Element element) {
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            byte b2 = -1;
            switch (attribute.hashCode()) {
                case -1807133155:
                    if (attribute.equals("lineStyle")) {
                        b2 = 0;
                    }
                    break;
                case -1741117076:
                    if (attribute.equals("setRenderListener")) {
                        b2 = 1;
                    }
                    break;
                case -1102672497:
                    if (attribute.equals("lineTo")) {
                        b2 = 2;
                    }
                    break;
                case -1073257012:
                    if (attribute.equals("beginFill")) {
                        b2 = 3;
                    }
                    break;
                case -1068263892:
                    if (attribute.equals("moveTo")) {
                        b2 = 4;
                    }
                    break;
                case -826951352:
                    if (attribute.equals("drawRect")) {
                        b2 = 5;
                    }
                    break;
                case -556608716:
                    if (attribute.equals("drawCircle")) {
                        b2 = 6;
                    }
                    break;
                case 27279565:
                    if (attribute.equals("lineGradientStyle")) {
                        b2 = 7;
                    }
                    break;
                case 80105951:
                    if (attribute.equals("createGradientBox")) {
                        b2 = 8;
                    }
                    break;
                case 137996206:
                    if (attribute.equals("drawRoundRect")) {
                        b2 = 9;
                    }
                    break;
                case 753006880:
                    if (attribute.equals("cubicCurveTo")) {
                        b2 = 10;
                    }
                    break;
                case 1127058378:
                    if (attribute.equals("curveTo")) {
                        b2 = com.google.common.base.zy.f68132qrj;
                    }
                    break;
                case 1312120860:
                    if (attribute.equals("beginGradientFill")) {
                        b2 = com.google.common.base.zy.f68128n7h;
                    }
                    break;
                case 1780535802:
                    if (attribute.equals("drawEllipse")) {
                        b2 = com.google.common.base.zy.f68124kja0;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    this.mCommand = CommandType.LINE_STYLE;
                    break;
                case 1:
                    this.mCommand = CommandType.SET_RENDER_LISTENER;
                    break;
                case 2:
                    this.mCommand = CommandType.LINE_TO;
                    break;
                case 3:
                    this.mCommand = CommandType.BEGIN_FILL;
                    break;
                case 4:
                    this.mCommand = CommandType.MOVE_TO;
                    break;
                case 5:
                    this.mCommand = CommandType.DRAW_RECT;
                    break;
                case 6:
                    this.mCommand = CommandType.DRAW_CIRCLE;
                    break;
                case 7:
                    this.mCommand = CommandType.LINE_GRADIENT_STYLE;
                    break;
                case 8:
                    this.mCommand = CommandType.CREATE_GRADIENT_BOX;
                    break;
                case 9:
                    this.mCommand = CommandType.DRAW_ROUND_RECT;
                    break;
                case 10:
                    this.mCommand = CommandType.CUBIC_CURVE_TO;
                    break;
                case 11:
                    this.mCommand = CommandType.CURVE_TO;
                    break;
                case 12:
                    this.mCommand = CommandType.BEGIN_GRADIENT_FILL;
                    break;
                case 13:
                    this.mCommand = CommandType.DRAW_ELLIPSE;
                    break;
                default:
                    this.mCommand = CommandType.INVALID;
                    break;
            }
        }

        private void parseStop() {
            if (this.mStopArrayNameExp != null) {
                parseStopByArrayName();
            } else if (this.mIsStopsValid) {
                parseStopByExp();
            }
        }

        private void parseStopByArrayName() {
            String strEvaluateStr = this.mStopArrayNameExp.evaluateStr();
            if (TextUtils.isEmpty(strEvaluateStr)) {
                this.mStops = null;
                return;
            }
            if (strEvaluateStr.equals(this.mCurrentStopArrayName)) {
                return;
            }
            this.mCurrentStopArrayName = strEvaluateStr;
            Object obj = new IndexedVariable(strEvaluateStr, getVariables(), false).get();
            if (obj != null && (obj instanceof float[])) {
                float[] fArr = (float[]) obj;
                if (fArr.length > 1) {
                    this.mStops = fArr;
                    return;
                }
            }
            this.mStops = null;
        }

        private void parseStopByExp() {
            if (this.mStops == null) {
                this.mStops = new float[this.mStopExps.length];
            }
            int i2 = 0;
            while (true) {
                Expression[] expressionArr = this.mStopExps;
                if (i2 >= expressionArr.length) {
                    return;
                }
                this.mStops[i2] = (float) expressionArr[i2].evaluate();
                i2++;
            }
        }

        private float scale(float f2) {
            return f2 * getRoot().getScale();
        }

        private void setRenderListener(GraphicsElement graphicsElement) {
            if (this.mIsParamsValid) {
                Expression[] expressionArr = this.mParamExps;
                if (expressionArr.length > 0) {
                    ScreenElement screenElementFindElement = getRoot().findElement(expressionArr[0].evaluateStr());
                    if (screenElementFindElement == null || !(screenElementFindElement instanceof FunctionElement)) {
                        return;
                    }
                    graphicsElement.setRenderListener((FunctionElement) screenElementFindElement);
                }
            }
        }

        private void setShader(GraphicsElement graphicsElement) {
            if (!this.mIsParamsValid || this.mParamExps.length <= 2) {
                return;
            }
            parseColor();
            parseStop();
            int[] iArr = this.mColors;
            if (iArr == null || iArr.length < 2) {
                MamlLog.m17851e(TAG_NAME, "needs >= 2 number of colors");
                return;
            }
            float[] fArr = this.mStops;
            if (fArr != null && fArr.length != iArr.length) {
                MamlLog.m17851e(TAG_NAME, "color and position arrays must be of equal length");
                return;
            }
            int iEvaluate = (int) this.mParamExps[0].evaluate();
            String strEvaluateStr = this.mParamExps[1].evaluateStr();
            String strEvaluateStr2 = this.mParamExps[2].evaluateStr();
            Expression[] expressionArr = this.mParamExps;
            int iEvaluate2 = expressionArr.length > 3 ? (int) expressionArr[3].evaluate() : 0;
            CommandType commandType = this.mCommand;
            if (commandType == CommandType.LINE_GRADIENT_STYLE) {
                graphicsElement.lineGradientStyle(iEvaluate, this.mColors, this.mStops, strEvaluateStr, strEvaluateStr2, iEvaluate2);
            } else if (commandType == CommandType.BEGIN_GRADIENT_FILL) {
                graphicsElement.beginGradientFill(iEvaluate, this.mColors, this.mStops, strEvaluateStr, strEvaluateStr2, iEvaluate2);
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof GraphicsElement)) {
                return;
            }
            GraphicsElement graphicsElement = (GraphicsElement) target;
            switch (C51191.f29453xd6f2c2b2[this.mCommand.ordinal()]) {
                case 1:
                    lineTo(graphicsElement);
                    break;
                case 2:
                    moveTo(graphicsElement);
                    break;
                case 3:
                    curveTo(graphicsElement);
                    break;
                case 4:
                    drawRect(graphicsElement);
                    break;
                case 5:
                    beginFill(graphicsElement);
                    break;
                case 6:
                    lineStyle(graphicsElement);
                    break;
                case 7:
                    drawCircle(graphicsElement);
                    break;
                case 8:
                    drawEllipse(graphicsElement);
                    break;
                case 9:
                    cubicCurveTo(graphicsElement);
                    break;
                case 10:
                    drawRoundRect(graphicsElement);
                    break;
                case 11:
                case 12:
                    setShader(graphicsElement);
                    break;
                case 13:
                    createGradientBox(graphicsElement);
                    break;
                case 14:
                    setRenderListener(graphicsElement);
                    break;
            }
        }
    }

    private static class IfCommand extends ActionCommand {
        private static final String ALTERNATE = "Alternate";
        private static final String CONSEQUENT = "Consequent";
        public static final String TAG_NAME = "IfCommand";
        private MultiCommand mAlternateCommand;
        private Expression mCondition;
        private MultiCommand mConsequentCommand;

        public IfCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mCondition = Expression.build(screenElement.getVariables(), element.getAttribute("ifCondition"));
            NodeList childNodes = element.getChildNodes();
            for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                if (childNodes.item(i2).getNodeType() == 1) {
                    Element element2 = (Element) childNodes.item(i2);
                    String tagName = element2.getTagName();
                    if (CONSEQUENT.equalsIgnoreCase(tagName) && this.mConsequentCommand == null) {
                        this.mConsequentCommand = new MultiCommand(screenElement, element2);
                    } else if (ALTERNATE.equalsIgnoreCase(tagName) && this.mAlternateCommand == null) {
                        this.mAlternateCommand = new MultiCommand(screenElement, element2);
                    }
                }
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            Expression expression = this.mCondition;
            if (expression != null) {
                if (expression.evaluate() <= 0.0d) {
                    MultiCommand multiCommand = this.mAlternateCommand;
                    if (multiCommand != null) {
                        multiCommand.perform();
                        return;
                    }
                    return;
                }
                MultiCommand multiCommand2 = this.mConsequentCommand;
                if (multiCommand2 != null) {
                    multiCommand2.perform();
                }
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            MultiCommand multiCommand = this.mAlternateCommand;
            if (multiCommand != null) {
                multiCommand.finish();
            }
            MultiCommand multiCommand2 = this.mConsequentCommand;
            if (multiCommand2 != null) {
                multiCommand2.finish();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            MultiCommand multiCommand = this.mAlternateCommand;
            if (multiCommand != null) {
                multiCommand.init();
            }
            MultiCommand multiCommand2 = this.mConsequentCommand;
            if (multiCommand2 != null) {
                multiCommand2.init();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void pause() {
            MultiCommand multiCommand = this.mAlternateCommand;
            if (multiCommand != null) {
                multiCommand.pause();
            }
            MultiCommand multiCommand2 = this.mConsequentCommand;
            if (multiCommand2 != null) {
                multiCommand2.pause();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void resume() {
            MultiCommand multiCommand = this.mAlternateCommand;
            if (multiCommand != null) {
                multiCommand.resume();
            }
            MultiCommand multiCommand2 = this.mConsequentCommand;
            if (multiCommand2 != null) {
                multiCommand2.resume();
            }
        }
    }

    private static class IntentCommand extends ActionCommand {
        private static final String TAG_FALLBACK = "Fallback";
        public static final String TAG_NAME = "IntentCommand";
        private ObjVar mActivityOptionsBundle;
        private CommandTrigger mFallbackTrigger;
        private int mFlags;
        private Intent mIntent;
        private IntentInfo mIntentInfo;
        private IntentType mIntentType;
        private IndexedVariable mIntentVar;
        private long mMaxVersion;
        private long mMinVersion;

        private enum IntentType {
            Activity,
            Broadcast,
            Service,
            Var
        }

        public IntentCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            IntentType intentType = IntentType.Activity;
            this.mIntentType = intentType;
            this.mIntentInfo = new IntentInfo(element, getVariables());
            boolean z2 = Boolean.parseBoolean(element.getAttribute("broadcast"));
            String attribute = element.getAttribute("type");
            if (z2 || "broadcast".equals(attribute)) {
                this.mIntentType = IntentType.Broadcast;
            } else if (x9kr.f50157ikck.equals(attribute)) {
                this.mIntentType = IntentType.Service;
            } else if (C1873k.f10652g.equals(attribute)) {
                this.mIntentType = intentType;
            } else if ("var".equals(attribute)) {
                this.mIntentType = IntentType.Var;
                String attribute2 = element.getAttribute("intentVar");
                if (!TextUtils.isEmpty(attribute2)) {
                    this.mIntentVar = new IndexedVariable(attribute2, getVariables(), false);
                }
            }
            this.mMinVersion = Utils.getAttrAsLong(element, "minVersion", -1L);
            this.mMaxVersion = Utils.getAttrAsLong(element, "maxVersion", -1L);
            this.mFlags = Utils.getAttrAsInt(element, InterfaceC1925p.pwo, -1);
            String attribute3 = element.getAttribute("activityOption");
            this.mActivityOptionsBundle = TextUtils.isEmpty(attribute3) ? null : new ObjVar(attribute3, getVariables());
            Element child = Utils.getChild(element, TAG_FALLBACK);
            if (child != null) {
                this.mFallbackTrigger = new CommandTrigger(child, screenElement);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[Catch: Exception -> 0x00ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:34:0x0081, B:58:0x00c1, B:37:0x0094, B:39:0x009a, B:51:0x00b3), top: B:93:0x0081 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00e4 A[Catch: Exception -> 0x0149, TryCatch #3 {Exception -> 0x0149, blocks: (B:5:0x000b, B:14:0x0022, B:16:0x0026, B:17:0x002d, B:18:0x0038, B:19:0x0043, B:21:0x0047, B:23:0x004f, B:25:0x0061, B:27:0x0067, B:29:0x006f, B:66:0x00d6, B:68:0x00e4, B:69:0x00fa, B:31:0x0075, B:33:0x007f, B:65:0x00cf, B:70:0x0104, B:76:0x0111, B:78:0x011d, B:82:0x013e, B:79:0x0124, B:81:0x0134), top: B:99:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fa A[Catch: Exception -> 0x0149, TryCatch #3 {Exception -> 0x0149, blocks: (B:5:0x000b, B:14:0x0022, B:16:0x0026, B:17:0x002d, B:18:0x0038, B:19:0x0043, B:21:0x0047, B:23:0x004f, B:25:0x0061, B:27:0x0067, B:29:0x006f, B:66:0x00d6, B:68:0x00e4, B:69:0x00fa, B:31:0x0075, B:33:0x007f, B:65:0x00cf, B:70:0x0104, B:76:0x0111, B:78:0x011d, B:82:0x013e, B:79:0x0124, B:81:0x0134), top: B:99:0x000b }] */
        @Override // com.miui.maml.ActionCommand
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void doPerform() {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.ActionCommand.IntentCommand.doPerform():void");
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            CommandTrigger commandTrigger = this.mFallbackTrigger;
            if (commandTrigger != null) {
                commandTrigger.finish();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            Task taskFindTask = getRoot().findTask(this.mIntentInfo.getId());
            if (taskFindTask != null && !TextUtils.isEmpty(taskFindTask.action)) {
                this.mIntentInfo.set(taskFindTask);
            }
            if (Utils.isProtectedIntent(this.mIntentInfo.getAction())) {
                return;
            }
            Intent intent = new Intent();
            this.mIntent = intent;
            this.mIntentInfo.update(intent);
            int i2 = this.mFlags;
            if (i2 != -1) {
                this.mIntent.setFlags(i2);
            } else if (this.mIntentType == IntentType.Activity) {
                this.mIntent.setFlags(872415232);
            }
            CommandTrigger commandTrigger = this.mFallbackTrigger;
            if (commandTrigger != null) {
                commandTrigger.init();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void pause() {
            CommandTrigger commandTrigger = this.mFallbackTrigger;
            if (commandTrigger != null) {
                commandTrigger.pause();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void resume() {
            CommandTrigger commandTrigger = this.mFallbackTrigger;
            if (commandTrigger != null) {
                commandTrigger.resume();
            }
        }
    }

    private static class JsonObjectCommand extends TargetCommand {
        public static final String TAG_NAME = "JsonObjectCommand";
        private CommandType mCommand;
        private Expression mNameExp;
        private Expression mValueExp;

        private enum CommandType {
            INVALID,
            PUT_STRING,
            PUT_BOOLEAN,
            PUT_INT,
            PUT_JSON_OBJECT,
            PUT_JSON_ARRAY,
            REMOVE
        }

        public JsonObjectCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("command");
            this.mNameExp = Expression.build(getVariables(), element.getAttribute("nameExp"));
            this.mValueExp = Expression.build(getVariables(), element.getAttribute("valueExp"));
            attribute.hashCode();
            switch (attribute) {
                case "putInt":
                    this.mCommand = CommandType.PUT_INT;
                    break;
                case "remove":
                    this.mCommand = CommandType.REMOVE;
                    break;
                case "putJsonObject":
                    this.mCommand = CommandType.PUT_JSON_OBJECT;
                    break;
                case "putString":
                    this.mCommand = CommandType.PUT_STRING;
                    break;
                case "putBoolean":
                    this.mCommand = CommandType.PUT_BOOLEAN;
                    break;
                case "putJsonArray":
                    this.mCommand = CommandType.PUT_JSON_ARRAY;
                    break;
                default:
                    this.mCommand = CommandType.INVALID;
                    break;
            }
            this.mTargetType = TargetCommand.TargetType.VARIABLE;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
        @Override // com.miui.maml.ActionCommand
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void doPerform() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.getTarget()
                if (r0 == 0) goto La3
                boolean r1 = r0 instanceof org.json.JSONObject
                if (r1 == 0) goto La3
                org.json.JSONObject r0 = (org.json.JSONObject) r0
                com.miui.maml.ActionCommand$JsonObjectCommand$CommandType r1 = r5.mCommand
                com.miui.maml.ActionCommand$JsonObjectCommand$CommandType r2 = com.miui.maml.ActionCommand.JsonObjectCommand.CommandType.REMOVE
                r3 = 0
                if (r1 != r2) goto L2b
                com.miui.maml.data.Expression r1 = r5.mNameExp
                if (r1 == 0) goto L1b
                java.lang.String r3 = r1.evaluateStr()
            L1b:
                if (r3 == 0) goto La3
                r0.remove(r3)
                com.miui.maml.data.Variables r1 = r5.getVariables()
                java.lang.String r2 = r5.mTargetName
                r1.put(r2, r0)
                goto La3
            L2b:
                int[] r2 = com.miui.maml.ActionCommand.C51191.f29454x68298d36
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 1
                if (r1 == r2) goto L7f
                r4 = 2
                if (r1 == r4) goto L76
                r4 = 3
                if (r1 == r4) goto L6d
                r4 = 4
                if (r1 == r4) goto L64
                r4 = 5
                if (r1 == r4) goto L43
                goto L62
            L43:
                com.miui.maml.data.Expression r1 = r5.mValueExp
                if (r1 == 0) goto L62
                java.lang.String r1 = r1.evaluateStr()
                java.lang.String r4 = "0"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L5c
                java.lang.String r4 = "false"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L5c
                goto L5d
            L5c:
                r2 = 0
            L5d:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
                goto L8b
            L62:
                r1 = r3
                goto L8b
            L64:
                com.miui.maml.data.Expression r1 = r5.mValueExp
                if (r1 == 0) goto L62
                org.json.JSONArray r1 = r1.evaluateJsonArray()
                goto L8b
            L6d:
                com.miui.maml.data.Expression r1 = r5.mValueExp
                if (r1 == 0) goto L62
                org.json.JSONObject r1 = r1.evaluateJsonObject()
                goto L8b
            L76:
                com.miui.maml.data.Expression r1 = r5.mValueExp
                if (r1 == 0) goto L62
                java.lang.String r1 = r1.evaluateStr()
                goto L8b
            L7f:
                com.miui.maml.data.Expression r1 = r5.mValueExp
                if (r1 == 0) goto L62
                double r1 = r1.evaluate()
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
            L8b:
                com.miui.maml.data.Expression r2 = r5.mNameExp
                if (r2 == 0) goto L93
                java.lang.String r3 = r2.evaluateStr()
            L93:
                if (r3 == 0) goto La3
                if (r1 == 0) goto La3
                r0.put(r3, r1)     // Catch: org.json.JSONException -> La3
                com.miui.maml.data.Variables r1 = r5.getVariables()     // Catch: org.json.JSONException -> La3
                java.lang.String r2 = r5.mTargetName     // Catch: org.json.JSONException -> La3
                r1.put(r2, r0)     // Catch: org.json.JSONException -> La3
            La3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.ActionCommand.JsonObjectCommand.doPerform():void");
        }
    }

    private static class LoopCommand extends MultiCommand {
        private static final long COUNT_WARNING = 10000;
        public static final String TAG_NAME = "LoopCommand";
        private Expression mBeginExp;
        private Expression mConditionExp;
        private Expression mCountExp;
        private Expression mEndExp;
        private IndexedVariable mIndexVar;

        public LoopCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("indexName");
            Variables variables = getVariables();
            if (!TextUtils.isEmpty(attribute)) {
                this.mIndexVar = new IndexedVariable(attribute, variables, true);
            }
            this.mBeginExp = Expression.build(variables, element.getAttribute(f7l8.zy.f60418toq));
            Expression expressionBuild = Expression.build(variables, element.getAttribute("count"));
            this.mCountExp = expressionBuild;
            if (expressionBuild == null) {
                this.mEndExp = Expression.build(variables, element.getAttribute(C3678q.f65807ch));
            }
            this.mConditionExp = Expression.build(variables, element.getAttribute("loopCondition"));
        }

        @Override // com.miui.maml.ActionCommand.MultiCommand, com.miui.maml.ActionCommand
        protected void doPerform() {
            int iEvaluate;
            Expression expression = this.mBeginExp;
            int iEvaluate2 = expression == null ? 0 : (int) expression.evaluate();
            Expression expression2 = this.mCountExp;
            if (expression2 != null) {
                iEvaluate = (((int) expression2.evaluate()) + iEvaluate2) - 1;
            } else {
                Expression expression3 = this.mEndExp;
                iEvaluate = expression3 == null ? 0 : (int) expression3.evaluate();
            }
            int i2 = iEvaluate - iEvaluate2;
            if (i2 > COUNT_WARNING) {
                MamlLog.m17854w("ActionCommand", "count is too large: " + i2 + ", exceeds WARNING " + COUNT_WARNING);
            }
            while (iEvaluate2 <= iEvaluate) {
                Expression expression4 = this.mConditionExp;
                if (expression4 != null && expression4.evaluate() <= 0.0d) {
                    return;
                }
                IndexedVariable indexedVariable = this.mIndexVar;
                if (indexedVariable != null) {
                    indexedVariable.set(iEvaluate2);
                }
                int size = this.mCommands.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.mCommands.get(i3).perform();
                }
                iEvaluate2++;
            }
        }
    }

    private static class LottieCommand extends TargetCommand {
        public static final String TAG_NAME = "LottieCommand";
        private CommandType mCommand;
        private boolean mIsParamsValid;
        private Expression[] mParams;

        private enum CommandType {
            PAUSE,
            PLAY,
            RESUME,
            STOP,
            SET_SPEED,
            GOTO_AND_PLAY,
            GOTO_AND_STOP,
            PLAY_SEGMENTS,
            SET_LOOP_COUNT
        }

        public LottieCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("params");
            Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), attribute);
            this.mParams = expressionArrBuildMultiple;
            boolean zIsExpressionsValid = isExpressionsValid(expressionArrBuildMultiple);
            this.mIsParamsValid = zIsExpressionsValid;
            if (!zIsExpressionsValid) {
                MamlLog.m17851e(TAG_NAME, "Wrong params: " + attribute);
            }
            parseCommand(element);
        }

        private void parseCommand(Element element) {
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            switch (attribute) {
                case "setLoopCount":
                    this.mCommand = CommandType.SET_LOOP_COUNT;
                    break;
                case "goToAndPlay":
                    this.mCommand = CommandType.GOTO_AND_PLAY;
                    break;
                case "goToAndStop":
                    this.mCommand = CommandType.GOTO_AND_STOP;
                    break;
                case "resume":
                    this.mCommand = CommandType.RESUME;
                    break;
                case "play":
                    this.mCommand = CommandType.PLAY;
                    break;
                case "stop":
                    this.mCommand = CommandType.STOP;
                    break;
                case "pause":
                    this.mCommand = CommandType.PAUSE;
                    break;
                case "playSegments":
                    this.mCommand = CommandType.PLAY_SEGMENTS;
                    break;
                case "setSpeed":
                    this.mCommand = CommandType.SET_SPEED;
                    break;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof LottieScreenElement)) {
                return;
            }
            LottieScreenElement lottieScreenElement = (LottieScreenElement) target;
            switch (C51191.$SwitchMap$com$miui$maml$ActionCommand$LottieCommand$CommandType[this.mCommand.ordinal()]) {
                case 1:
                    lottieScreenElement.playAnimation();
                    break;
                case 2:
                    lottieScreenElement.pauseAnimation();
                    break;
                case 3:
                    lottieScreenElement.resumeAnimation();
                    break;
                case 4:
                    lottieScreenElement.stopAnimation();
                    break;
                case 5:
                    if (this.mIsParamsValid) {
                        Expression[] expressionArr = this.mParams;
                        if (expressionArr.length == 1) {
                            lottieScreenElement.setSpeed((float) expressionArr[0].evaluate());
                        }
                    }
                    break;
                case 6:
                    if (this.mIsParamsValid) {
                        Expression[] expressionArr2 = this.mParams;
                        if (expressionArr2.length == 1) {
                            lottieScreenElement.goToAndPlay((int) expressionArr2[0].evaluate());
                        }
                    }
                    break;
                case 7:
                    if (this.mIsParamsValid) {
                        Expression[] expressionArr3 = this.mParams;
                        if (expressionArr3.length == 1) {
                            lottieScreenElement.goToAndStop((int) expressionArr3[0].evaluate());
                        }
                    }
                    break;
                case 8:
                    if (this.mIsParamsValid) {
                        Expression[] expressionArr4 = this.mParams;
                        if (expressionArr4.length == 2) {
                            lottieScreenElement.playSegments((int) expressionArr4[0].evaluate(), (int) this.mParams[1].evaluate());
                        }
                    }
                    break;
                case 9:
                    if (this.mIsParamsValid) {
                        Expression[] expressionArr5 = this.mParams;
                        if (expressionArr5.length == 1) {
                            lottieScreenElement.setLoopCount((int) expressionArr5[0].evaluate());
                        }
                    }
                    break;
            }
        }
    }

    private static class MethodCommand extends BaseMethodCommand {
        public static final String TAG_NAME = "MethodCommand";
        private Constructor<?> mCtor;
        private Method mMethod;
        private String mMethodName;

        public MethodCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mMethodName = element.getAttribute("method");
            this.mLogStr = "MethodCommand, " + this.mLogStr + ", method=" + this.mMethodName + "\n    ";
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            String str;
            prepareParams();
            Object objInvoke = null;
            int i2 = 0;
            try {
                try {
                    int i3 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        if (this.mMethod == null) {
                            loadMethod();
                        }
                        if (this.mMethod != null) {
                            objInvoke = this.mMethod.invoke(getTarget(), this.mParamValues);
                            i2 = 1;
                        }
                        i2 = -1;
                    } else if (i3 == 5) {
                        Constructor<?> constructor = this.mCtor;
                        if (constructor != null) {
                            objInvoke = constructor.newInstance(this.mParamValues);
                            i2 = 1;
                        }
                        i2 = -1;
                    }
                    IndexedVariable indexedVariable = this.mReturnVar;
                    if (indexedVariable != null) {
                        indexedVariable.set(objInvoke);
                    }
                } catch (Exception e2) {
                    Throwable cause = e2.getCause();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.mLogStr);
                    sb.append(e2.toString());
                    if (cause != null) {
                        str = "\n cause: " + cause.toString();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    MamlLog.m17851e("ActionCommand", sb.toString());
                    IndexedVariable indexedVariable2 = this.mErrorCodeVar;
                    if (indexedVariable2 != null) {
                        indexedVariable2.set(-2);
                    }
                }
            } finally {
                IndexedVariable indexedVariable3 = this.mErrorCodeVar;
                if (indexedVariable3 != null) {
                    indexedVariable3.set(i2);
                }
            }
        }

        @Override // com.miui.maml.ActionCommand.BaseMethodCommand, com.miui.maml.ActionCommand.TargetCommand, com.miui.maml.ActionCommand
        public void init() {
            super.init();
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (this.mMethod == null) {
                    loadMethod();
                    return;
                }
                return;
            }
            if (i2 != 5) {
                return;
            }
            if (!getRoot().getCapability(4)) {
                this.mCtor = null;
                return;
            }
            if (this.mCtor == null) {
                Class<?> cls = this.mTargetClass;
                if (cls == null) {
                    MamlLog.m17851e("ActionCommand", this.mLogStr + "init, class is null.");
                    return;
                }
                try {
                    this.mCtor = cls.getConstructor(this.mParamTypes);
                } catch (NoSuchMethodException e2) {
                    MamlLog.m17851e("ActionCommand", this.mLogStr + "init, fail to find method. " + e2.toString());
                }
            }
        }

        protected void loadMethod() {
            Object target;
            if (this.mTargetClass == null && (target = getTarget()) != null) {
                this.mTargetClass = target.getClass();
            }
            Class<?> cls = this.mTargetClass;
            if (cls == null) {
                MamlLog.m17851e("ActionCommand", this.mLogStr + "loadMethod(), class is null.");
                return;
            }
            try {
                this.mMethod = cls.getMethod(this.mMethodName, this.mParamTypes);
            } catch (NoSuchMethodException e2) {
                MamlLog.m17851e("ActionCommand", this.mLogStr + "loadMethod(). " + e2.toString());
            }
            MamlLog.m17850d("ActionCommand", this.mLogStr + "loadMethod(), successful.  " + this.mMethod.toString());
        }
    }

    private static class MultiCommand extends ActionCommand {
        public static final String TAG_NAME = "MultiCommand";
        public static final String TAG_NAME1 = "GroupCommand";
        protected ArrayList<ActionCommand> mCommands;

        public MultiCommand(final ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mCommands = new ArrayList<>();
            Utils.traverseXmlElementChildren(element, null, new Utils.XmlTraverseListener() { // from class: com.miui.maml.ActionCommand.MultiCommand.1
                @Override // com.miui.maml.util.Utils.XmlTraverseListener
                public void onChild(Element element2) {
                    ActionCommand actionCommandCreate = ActionCommand.create(element2, screenElement);
                    if (actionCommandCreate != null) {
                        MultiCommand.this.mCommands.add(actionCommandCreate);
                    }
                }
            });
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().perform();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().init();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void pause() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().pause();
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void resume() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().resume();
            }
        }
    }

    private static abstract class NotificationReceiver extends StatefulActionCommand implements NotifierManager.OnNotifyListener {
        private NotifierManager mNotifierManager;
        private String mType;

        public NotificationReceiver(ScreenElement screenElement, String str, String str2) {
            super(screenElement, str);
            this.mType = str2;
            this.mNotifierManager = NotifierManager.getInstance(getContext());
        }

        protected void asyncUpdate() {
            ActionCommand.mHandler.post(new Runnable() { // from class: com.miui.maml.ActionCommand.NotificationReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    NotificationReceiver.this.update();
                }
            });
        }

        @Override // com.miui.maml.ActionCommand
        public void finish() {
            this.mNotifierManager.releaseNotifier(this.mType, this);
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            update();
            this.mNotifierManager.acquireNotifier(this.mType, this);
        }

        @Override // com.miui.maml.NotifierManager.OnNotifyListener
        public void onNotify(Context context, Intent intent, Object obj) {
            asyncUpdate();
        }

        @Override // com.miui.maml.ActionCommand
        public void pause() {
            this.mNotifierManager.pause(this.mType, this);
        }

        @Override // com.miui.maml.ActionCommand
        public void resume() {
            update();
            this.mNotifierManager.resume(this.mType, this);
        }

        protected abstract void update();
    }

    private static class ObjVar {
        private int mIndex;
        private Expression mIndexArr;
        private Variables mVars;

        public ObjVar(String str, Variables variables) {
            this.mVars = variables;
            int iIndexOf = str.indexOf(91);
            if (iIndexOf > 0) {
                try {
                    String strSubstring = str.substring(0, iIndexOf);
                    try {
                        this.mIndexArr = Expression.build(variables, str.substring(iIndexOf + 1, str.length() - 1));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    str = strSubstring;
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            this.mIndex = variables.registerVariable(str);
        }

        public Object get() {
            Expression expression;
            Object obj = this.mVars.get(this.mIndex);
            if (obj == null || (expression = this.mIndexArr) == null || !(obj instanceof Object[])) {
                return obj;
            }
            try {
                return ((Object[]) obj)[(int) expression.evaluate()];
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
    }

    private static class OnOffCommandHelper {
        protected boolean mIsOn;
        protected boolean mIsToggle;

        public OnOffCommandHelper(String str) {
            if (str.equalsIgnoreCase("toggle")) {
                this.mIsToggle = true;
            } else if (str.equalsIgnoreCase(vyq.f37476q)) {
                this.mIsOn = true;
            } else if (str.equalsIgnoreCase(vyq.f37475n)) {
                this.mIsOn = false;
            }
        }
    }

    private static class PbrCommand extends TargetCommand {
        public static final String TAG_NAME = "PbrCommand";
        private CommandType mCommand;
        private String mCustElementName;
        private boolean mIsParamsValid;
        private Expression[] mParams;
        private boolean mUniformAutoRefresh;
        private String mUniformName;

        private enum CommandType {
            INVALID,
            UPDATE_UNIFORM
        }

        public PbrCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            String attribute = element.getAttribute("params");
            Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), attribute);
            this.mParams = expressionArrBuildMultiple;
            boolean zIsExpressionsValid = isExpressionsValid(expressionArrBuildMultiple);
            this.mIsParamsValid = zIsExpressionsValid;
            if (!zIsExpressionsValid) {
                MamlLog.m17851e(TAG_NAME, "Wrong params: " + attribute);
            }
            this.mUniformName = element.getAttribute("uniformName");
            this.mCustElementName = element.getAttribute("custElementName");
            this.mUniformAutoRefresh = Boolean.parseBoolean(element.getAttribute("uniformRefresh"));
            parseCommand(element);
        }

        private void parseCommand(Element element) {
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            if (attribute.equals("updateUniform")) {
                this.mCommand = CommandType.UPDATE_UNIFORM;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof PhysicallyBasedRenderingElement)) {
                return;
            }
            PhysicallyBasedRenderingElement physicallyBasedRenderingElement = (PhysicallyBasedRenderingElement) target;
            if (C51191.$SwitchMap$com$miui$maml$ActionCommand$PbrCommand$CommandType[this.mCommand.ordinal()] != 1) {
                return;
            }
            physicallyBasedRenderingElement.updateUniform(this.mCustElementName, this.mUniformName, this.mUniformAutoRefresh, this.mParams);
        }
    }

    private static class PermanenceCommand extends ActionCommand {
        public static final String TAG_NAME = "PermanenceCommand";
        private Expression mExpression;
        private String mName;
        private Expression mNameExp;
        private boolean mRequestUpdate;
        private VariableType mType;
        private IndexedVariable mVar;

        public PermanenceCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            Variables variables = screenElement.getVariables();
            Expression expressionBuild = Expression.build(variables, element.getAttribute("nameExp"));
            this.mNameExp = expressionBuild;
            if (expressionBuild != null) {
                this.mName = expressionBuild.evaluateStr();
            } else {
                this.mName = element.getAttribute("name");
            }
            this.mRequestUpdate = Boolean.parseBoolean(element.getAttribute("requestUpdate"));
            this.mType = VariableType.parseType(element.getAttribute("type"));
            if (TextUtils.isEmpty(this.mName)) {
                MamlLog.m17851e("ActionCommand", "empty name in PermanenceCommand");
            } else {
                this.mVar = new IndexedVariable(this.mName, variables, this.mType.isNumber());
            }
            this.mExpression = Expression.build(variables, element.getAttribute("expression"));
        }

        private SharedPreferenceHelper getSharePreferenceHelper() {
            String str = (String) getVariables().get(MamlutilKt.CUSTOM_EDIT_LOCAL_ID);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return SharedPreferenceHelper.getInstance(getContext().getApplicationContext(), "sp_" + str);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            SharedPreferenceHelper sharePreferenceHelper = getSharePreferenceHelper();
            if (sharePreferenceHelper == null) {
                return;
            }
            ScreenElementRoot root = getRoot();
            Variables variables = getVariables();
            Expression expression = this.mNameExp;
            if (expression != null) {
                String strEvaluateStr = expression.evaluateStr();
                if (TextUtils.isEmpty(strEvaluateStr)) {
                    this.mName = null;
                    return;
                } else if (!strEvaluateStr.equals(this.mName)) {
                    this.mName = strEvaluateStr;
                    this.mVar = new IndexedVariable(strEvaluateStr, variables, this.mType.isNumber());
                }
            }
            if (this.mVar == null) {
                return;
            }
            int i2 = C51191.$SwitchMap$com$miui$maml$data$VariableType[this.mType.ordinal()];
            if (i2 == 1) {
                Expression expression2 = this.mExpression;
                if (expression2 != null) {
                    double dEvaluate = expression2.evaluate();
                    this.mVar.set(dEvaluate);
                    sharePreferenceHelper.save(this.mName, (float) dEvaluate);
                }
            } else if (i2 == 2) {
                String strEvaluateStr2 = this.mExpression.evaluateStr();
                this.mVar.set(strEvaluateStr2);
                sharePreferenceHelper.save(this.mName, strEvaluateStr2);
            }
            if (this.mRequestUpdate) {
                root.requestUpdate();
            }
        }
    }

    @Deprecated
    public static abstract class PropertyCommand extends ActionCommand {
        protected ScreenElement mTargetElement;
        private Variable mTargetObj;

        protected PropertyCommand(ScreenElement screenElement, Variable variable, String str) {
            super(screenElement);
            this.mTargetObj = variable;
        }

        public static PropertyCommand create(ScreenElement screenElement, String str, String str2) {
            Variable variable = new Variable(str);
            if ("visibility".equals(variable.getPropertyName())) {
                return new VisibilityProperty(screenElement, variable, str2);
            }
            if ("animation".equals(variable.getPropertyName())) {
                return new AnimationProperty(screenElement, variable, str2);
            }
            return null;
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            super.init();
            if (this.mTargetObj != null && this.mTargetElement == null) {
                ScreenElement screenElementFindElement = getRoot().findElement(this.mTargetObj.getObjName());
                this.mTargetElement = screenElementFindElement;
                if (screenElementFindElement == null) {
                    MamlLog.m17854w("ActionCommand", "could not find PropertyCommand target, name: " + this.mTargetObj.getObjName());
                    this.mTargetObj = null;
                }
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void perform() {
            if (this.mTargetElement == null) {
                return;
            }
            doPerform();
        }
    }

    private static class RingModeCommand extends NotificationReceiver {
        private AudioManager mAudioManager;
        private ModeToggleHelper mToggleHelper;

        public RingModeCommand(ScreenElement screenElement, String str) {
            super(screenElement, VariableNames.RING_MODE, "android.media.RINGER_MODE_CHANGED");
            ModeToggleHelper modeToggleHelper = new ModeToggleHelper(null);
            this.mToggleHelper = modeToggleHelper;
            modeToggleHelper.addMode("normal", 2);
            this.mToggleHelper.addMode(x9kr.f50177py, 0);
            this.mToggleHelper.addMode("vibrate", 1);
            if (this.mToggleHelper.build(str)) {
                return;
            }
            MamlLog.m17851e("ActionCommand", "invalid ring mode command value: " + str);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (this.mAudioManager == null) {
                return;
            }
            this.mToggleHelper.click();
            int modeId = this.mToggleHelper.getModeId();
            this.mAudioManager.setRingerMode(modeId);
            updateState(modeId);
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver
        protected void update() {
            if (this.mAudioManager == null) {
                this.mAudioManager = (AudioManager) this.mScreenElement.getContext().mContext.getSystemService(wvg.f67137toq);
            }
            AudioManager audioManager = this.mAudioManager;
            if (audioManager == null) {
                return;
            }
            updateState(audioManager.getRingerMode());
        }
    }

    private static class SensorBinderCommand extends TargetCommand {
        public static final String TAG_NAME = "SensorCommand";
        private CommandType mCommand;

        private enum CommandType {
            INVALID,
            TURN_ON,
            TURN_OFF
        }

        public SensorBinderCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mTargetType = TargetCommand.TargetType.VARIABLE_BINDER;
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            if (attribute.equals("turnOff")) {
                this.mCommand = CommandType.TURN_OFF;
            } else if (attribute.equals("turnOn")) {
                this.mCommand = CommandType.TURN_ON;
            } else {
                this.mCommand = CommandType.INVALID;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof SensorBinder)) {
                return;
            }
            SensorBinder sensorBinder = (SensorBinder) target;
            int i2 = C51191.f29455xfb7ace19[this.mCommand.ordinal()];
            if (i2 == 1) {
                sensorBinder.turnOnSensorBinder();
            } else {
                if (i2 != 2) {
                    return;
                }
                sensorBinder.turnOffSensorBinder();
            }
        }
    }

    private static class SoundCommand extends ActionCommand {
        public static final String TAG_NAME = "SoundCommand";
        private SoundManager.Command mCommand;
        private boolean mKeepCur;
        private boolean mLoop;
        private String mSound;
        private Expression mStreamIdExp;
        private IndexedVariable mStreamIdVar;
        private Expression mVolumeExp;

        public SoundCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mSound = element.getAttribute("sound");
            this.mKeepCur = Boolean.parseBoolean(element.getAttribute("keepCur"));
            this.mLoop = Boolean.parseBoolean(element.getAttribute("loop"));
            this.mCommand = SoundManager.Command.parse(element.getAttribute("command"));
            Expression expressionBuild = Expression.build(getVariables(), element.getAttribute("volume"));
            this.mVolumeExp = expressionBuild;
            if (expressionBuild == null) {
                MamlLog.m17851e("ActionCommand", "invalid expression in SoundCommand");
            }
            this.mStreamIdExp = Expression.build(getVariables(), element.getAttribute("streamId"));
            String attribute = element.getAttribute("streamIdVar");
            if (TextUtils.isEmpty(attribute)) {
                return;
            }
            this.mStreamIdVar = new IndexedVariable(attribute, getVariables(), true);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Expression expression;
            int i2 = C51191.$SwitchMap$com$miui$maml$SoundManager$Command[this.mCommand.ordinal()];
            if (i2 != 1) {
                if ((i2 == 2 || i2 == 3 || i2 == 4) && (expression = this.mStreamIdExp) != null) {
                    getRoot().playSound((int) expression.evaluate(), this.mCommand);
                    return;
                }
                return;
            }
            Expression expression2 = this.mVolumeExp;
            int iPlaySound = getRoot().playSound(this.mSound, new SoundManager.SoundOptions(this.mKeepCur, this.mLoop, expression2 != null ? (float) expression2.evaluate() : 0.0f));
            IndexedVariable indexedVariable = this.mStreamIdVar;
            if (indexedVariable != null) {
                indexedVariable.set(iPlaySound);
            }
        }
    }

    public static abstract class StateTracker {
        private boolean mInTransition = false;
        private Boolean mActualState = null;
        private Boolean mIntendedState = null;
        private boolean mDeferredStateChangeRequestNeeded = false;

        public abstract int getActualState(Context context);

        public final int getTriState(Context context) {
            if (this.mInTransition) {
                return 5;
            }
            int actualState = getActualState(context);
            if (actualState != 0) {
                return actualState != 1 ? 5 : 1;
            }
            return 0;
        }

        public final boolean isTurningOn() {
            Boolean bool = this.mIntendedState;
            return bool != null && bool.booleanValue();
        }

        public abstract void onActualStateChange(Context context, Intent intent);

        protected abstract void requestStateChange(Context context, boolean z2);

        protected final void setCurrentState(Context context, int i2) {
            Boolean bool;
            boolean z2 = this.mInTransition;
            if (i2 == 0) {
                this.mInTransition = false;
                this.mActualState = Boolean.FALSE;
            } else if (i2 == 1) {
                this.mInTransition = false;
                this.mActualState = Boolean.TRUE;
            } else if (i2 == 2) {
                this.mInTransition = true;
                this.mActualState = Boolean.FALSE;
            } else if (i2 == 3) {
                this.mInTransition = true;
                this.mActualState = Boolean.TRUE;
            }
            if (z2 && !this.mInTransition && this.mDeferredStateChangeRequestNeeded) {
                MamlLog.m17850d("ActionCommand", "processing deferred state change");
                Boolean bool2 = this.mActualState;
                if (bool2 == null || (bool = this.mIntendedState) == null || !bool.equals(bool2)) {
                    Boolean bool3 = this.mIntendedState;
                    if (bool3 != null) {
                        this.mInTransition = true;
                        requestStateChange(context, bool3.booleanValue());
                    }
                } else {
                    MamlLog.m17850d("ActionCommand", "... but intended state matches, so no changes.");
                }
                this.mDeferredStateChangeRequestNeeded = false;
            }
        }

        public final void toggleState(Context context) {
            Boolean bool;
            int triState = getTriState(context);
            boolean z2 = false;
            if (triState == 0) {
                z2 = true;
            } else if (triState != 1 && triState == 5 && (bool = this.mIntendedState) != null) {
                z2 = !bool.booleanValue();
            }
            this.mIntendedState = Boolean.valueOf(z2);
            if (this.mInTransition) {
                this.mDeferredStateChangeRequestNeeded = true;
            } else {
                this.mInTransition = true;
                requestStateChange(context, z2);
            }
        }
    }

    private static abstract class StatefulActionCommand extends ActionCommand {
        private IndexedVariable mVar;

        public StatefulActionCommand(ScreenElement screenElement, String str) {
            super(screenElement);
            this.mVar = new IndexedVariable(str, getVariables(), true);
        }

        protected final void updateState(int i2) {
            IndexedVariable indexedVariable = this.mVar;
            if (indexedVariable == null) {
                return;
            }
            indexedVariable.set(i2);
            getRoot().requestUpdate();
        }
    }

    private static abstract class TargetCommand extends ActionCommand {
        protected String mLogStr;
        private Object mTarget;
        protected Expression mTargetIndex;
        protected String mTargetName;
        protected Expression mTargetNameExp;
        protected TargetType mTargetType;

        protected enum TargetType {
            SCREEN_ELEMENT,
            VARIABLE,
            CONSTRUCTOR,
            ANIMATION_ITEM,
            VARIABLE_BINDER
        }

        public TargetCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            Expression expressionBuild = Expression.build(getVariables(), element.getAttribute("targetExp"));
            this.mTargetNameExp = expressionBuild;
            if (expressionBuild != null) {
                this.mTargetName = expressionBuild.evaluateStr();
            } else {
                this.mTargetName = element.getAttribute(zurt.InterfaceC0290k.f47416lvui);
            }
            if (TextUtils.isEmpty(this.mTargetName)) {
                this.mTargetName = null;
            }
            this.mTargetIndex = Expression.build(getVariables(), element.getAttribute("targetIndex"));
            String attribute = element.getAttribute(InterfaceC1925p.n9v);
            TargetType targetType = TargetType.SCREEN_ELEMENT;
            this.mTargetType = targetType;
            if ("element".equals(attribute)) {
                this.mTargetType = targetType;
            } else if ("var".equals(attribute)) {
                this.mTargetType = TargetType.VARIABLE;
            } else if ("ctor".equals(attribute)) {
                this.mTargetType = TargetType.CONSTRUCTOR;
            }
            this.mLogStr = "target=" + this.mTargetName + " type=" + this.mTargetType.toString();
        }

        private void findTarget() {
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.mTargetName != null) {
                        this.mTarget = Integer.valueOf(getVariables().registerVariable(this.mTargetName));
                        return;
                    } else {
                        MamlLog.m17851e("ActionCommand", "MethodCommand, type=var, empty target name");
                        return;
                    }
                }
                if (i2 == 3) {
                    this.mTarget = getRoot().getAnimationItems(this.mTargetName);
                    return;
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    this.mTarget = getRoot().findBinder(this.mTargetName);
                    return;
                }
            }
            ScreenElement screenElementFindElement = getRoot().findElement(this.mTargetName);
            this.mTarget = screenElementFindElement;
            if (screenElementFindElement == null) {
                MamlLog.m17851e("ActionCommand", "could not find ScreenElement target, name: " + this.mTargetName);
                return;
            }
            if (this.mTargetIndex == null || ElementGroup.isArrayGroup(screenElementFindElement)) {
                return;
            }
            MamlLog.m17851e("ActionCommand", "target with index is not an ArrayGroup, name: " + this.mTargetName);
            this.mTargetIndex = null;
        }

        protected Object getTarget() {
            Expression expression;
            Expression expression2 = this.mTargetNameExp;
            if (expression2 != null) {
                String strEvaluateStr = expression2.evaluateStr();
                if (strEvaluateStr == null) {
                    this.mTargetName = null;
                    this.mTarget = null;
                    return null;
                }
                if (!strEvaluateStr.equals(this.mTargetName)) {
                    this.mTargetName = strEvaluateStr;
                    findTarget();
                }
            }
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$TargetCommand$TargetType[this.mTargetType.ordinal()];
            if (i2 == 1) {
                Object obj = this.mTarget;
                return (obj == null || (expression = this.mTargetIndex) == null) ? obj : ((ElementGroup) obj).getChild((int) expression.evaluate());
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return this.mTarget;
                }
                if (i2 != 4) {
                    return null;
                }
                return this.mTarget;
            }
            if (this.mTarget != null) {
                Object obj2 = getVariables().get(((Integer) this.mTarget).intValue());
                if (this.mTargetIndex == null) {
                    return obj2;
                }
                if (obj2.getClass().isArray()) {
                    return Array.get(obj2, (int) this.mTargetIndex.evaluate());
                }
                MamlLog.m17851e("ActionCommand", "target with index is not an Array variable, name: " + this.mTargetName);
                this.mTargetIndex = null;
            }
            return null;
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            super.init();
            findTarget();
        }
    }

    private static class TickListenerCommand extends TargetCommand {
        public static final String TAG_NAME = "TickListenerCommand";
        private CommandType mCommand;
        private Expression mFunNameExp;

        private enum CommandType {
            INVALID,
            SET,
            UNSET
        }

        public TickListenerCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            this.mFunNameExp = Expression.build(getVariables(), element.getAttribute("function"));
            String attribute = element.getAttribute("command");
            attribute.hashCode();
            if (attribute.equals("set")) {
                this.mCommand = CommandType.SET;
            } else if (attribute.equals("unset")) {
                this.mCommand = CommandType.UNSET;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof AnimatedScreenElement)) {
                return;
            }
            AnimatedScreenElement animatedScreenElement = (AnimatedScreenElement) target;
            int i2 = C51191.f29456xa630c98c[this.mCommand.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                animatedScreenElement.unsetOnTickListener();
            } else {
                ScreenElement screenElementFindElement = getRoot().findElement(this.mFunNameExp.evaluateStr());
                if (screenElementFindElement == null || !(screenElementFindElement instanceof FunctionElement)) {
                    return;
                }
                animatedScreenElement.setOnTickListener((FunctionElement) screenElementFindElement);
            }
        }
    }

    private static class UsbStorageSwitchCommand extends NotificationReceiver {
        private boolean mConnected;
        private OnOffCommandHelper mOnOffHelper;
        private StorageManager mStorageManager;

        public UsbStorageSwitchCommand(ScreenElement screenElement, String str) {
            super(screenElement, VariableNames.USB_MODE, ActionCommand.ACTION_USB_STATE);
            this.mOnOffHelper = new OnOffCommandHelper(str);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            final boolean z2;
            StorageManager storageManager = this.mStorageManager;
            if (storageManager == null) {
                return;
            }
            boolean zStorageManager_isUsbMassStorageEnabled = HideSdkDependencyUtils.StorageManager_isUsbMassStorageEnabled(storageManager);
            OnOffCommandHelper onOffCommandHelper = this.mOnOffHelper;
            if (onOffCommandHelper.mIsToggle) {
                z2 = !zStorageManager_isUsbMassStorageEnabled;
            } else {
                boolean z3 = onOffCommandHelper.mIsOn;
                if (z3 == zStorageManager_isUsbMassStorageEnabled) {
                    return;
                } else {
                    z2 = z3;
                }
            }
            updateState(3);
            new Thread("StorageSwitchThread") { // from class: com.miui.maml.ActionCommand.UsbStorageSwitchCommand.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    if (z2) {
                        HideSdkDependencyUtils.StorageManager_enableUsbMassStorage(UsbStorageSwitchCommand.this.mStorageManager);
                    } else {
                        HideSdkDependencyUtils.StorageManager_disableUsbMassStorage(UsbStorageSwitchCommand.this.mStorageManager);
                    }
                    UsbStorageSwitchCommand.this.updateState(z2 ? 2 : 1);
                }
            }.start();
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver, com.miui.maml.NotifierManager.OnNotifyListener
        public void onNotify(Context context, Intent intent, Object obj) {
            if (intent != null) {
                this.mConnected = intent.getExtras().getBoolean(ActionCommand.USB_CONNECTED);
            }
            super.onNotify(context, intent, obj);
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver
        protected void update() {
            if (this.mStorageManager == null) {
                StorageManager storageManager = (StorageManager) getContext().getSystemService("storage");
                this.mStorageManager = storageManager;
                if (storageManager == null) {
                    MamlLog.m17854w("ActionCommand", "Failed to get StorageManager");
                    return;
                }
            }
            updateState(this.mConnected ? HideSdkDependencyUtils.StorageManager_isUsbMassStorageEnabled(this.mStorageManager) ? 2 : 1 : 0);
        }
    }

    private static class VariableAssignmentCommand extends ActionCommand {
        public static final String TAG_NAME = "VariableCommand";
        private Expression[] mArrayValues;
        private Expression mExpression;
        private Expression mIndexExpression;
        private IndexedVariable mLengthVar;
        private String mName;
        private Expression mNameExp;
        private boolean mPersist;
        private boolean mRequestUpdate;
        private VariableType mType;
        private IndexedVariable mVar;

        public VariableAssignmentCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            Variables variables = screenElement.getVariables();
            Expression expressionBuild = Expression.build(variables, element.getAttribute("nameExp"));
            this.mNameExp = expressionBuild;
            if (expressionBuild != null) {
                this.mName = expressionBuild.evaluateStr();
            } else {
                this.mName = element.getAttribute("name");
            }
            this.mPersist = Boolean.parseBoolean(element.getAttribute("persist"));
            this.mRequestUpdate = Boolean.parseBoolean(element.getAttribute("requestUpdate"));
            this.mType = VariableType.parseType(element.getAttribute("type"));
            if (TextUtils.isEmpty(this.mName)) {
                MamlLog.m17851e("ActionCommand", "empty name in VariableAssignmentCommand");
            } else {
                this.mVar = new IndexedVariable(this.mName, variables, this.mType.isNumber());
                if (this.mType.isArray()) {
                    this.mLengthVar = new IndexedVariable(this.mName + VariableElement.LENGTH_SUFFIX, variables, true);
                }
            }
            this.mExpression = Expression.build(variables, element.getAttribute("expression"));
            if (this.mType.isArray()) {
                this.mIndexExpression = Expression.build(variables, element.getAttribute("index"));
                this.mArrayValues = Expression.buildMultiple(variables, element.getAttribute("values"));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
        @Override // com.miui.maml.ActionCommand
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void doPerform() {
            /*
                Method dump skipped, instruction units count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.ActionCommand.VariableAssignmentCommand.doPerform():void");
        }
    }

    private static class VariableBinderCommand extends ActionCommand {
        public static final String TAG_NAME = "BinderCommand";
        private VariableBinder mBinder;
        private Command mCommand;
        private String mName;

        private enum Command {
            Refresh,
            Invalid
        }

        public VariableBinderCommand(ScreenElement screenElement, Element element) {
            super(screenElement);
            this.mCommand = Command.Invalid;
            this.mName = element.getAttribute("name");
            if (element.getAttribute("command").equals(com.android.thememanager.basemodule.analysis.toq.u2a8)) {
                this.mCommand = Command.Refresh;
            }
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            if (this.mBinder == null || C51191.f29457xba7f707d[this.mCommand.ordinal()] != 1) {
                return;
            }
            this.mBinder.refresh();
        }

        @Override // com.miui.maml.ActionCommand
        public void init() {
            this.mBinder = getRoot().findBinder(this.mName);
        }
    }

    private static class VideoCommand extends TargetCommand {
        public static final String TAG_NAME = "VideoCommand";
        private CommandType mCommand;
        private Expression mLooping;
        private Expression mPath;
        private Expression mScaleMode;
        private Expression mTime;
        private Expression mVolume;

        private enum CommandType {
            PAUSE,
            PLAY,
            SEEK_TO,
            CONFIG,
            SET_VOLUME,
            INVALID
        }

        public VideoCommand(ScreenElement screenElement, Element element) {
            super(screenElement, element);
            Variables variables = getVariables();
            String attribute = element.getAttribute("command");
            this.mPath = Expression.build(variables, element.getAttribute("path"));
            this.mVolume = Expression.build(variables, element.getAttribute("volume"));
            this.mScaleMode = Expression.build(variables, element.getAttribute("scaleMode"));
            this.mLooping = Expression.build(variables, element.getAttribute("loop"));
            this.mTime = Expression.build(variables, element.getAttribute("time"));
            attribute.hashCode();
            switch (attribute) {
                case "config":
                    this.mCommand = CommandType.CONFIG;
                    break;
                case "seekTo":
                    this.mCommand = CommandType.SEEK_TO;
                    break;
                case "play":
                    this.mCommand = CommandType.PLAY;
                    break;
                case "pause":
                    this.mCommand = CommandType.PAUSE;
                    break;
                case "setVolume":
                    this.mCommand = CommandType.SET_VOLUME;
                    break;
                default:
                    this.mCommand = CommandType.INVALID;
                    break;
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            Object target = getTarget();
            if (target == null || !(target instanceof VideoElement)) {
                return;
            }
            VideoElement videoElement = (VideoElement) target;
            int i2 = C51191.$SwitchMap$com$miui$maml$ActionCommand$VideoCommand$CommandType[this.mCommand.ordinal()];
            if (i2 == 1) {
                videoElement.play();
                return;
            }
            if (i2 == 2) {
                videoElement.pause();
                return;
            }
            if (i2 == 3) {
                Expression expression = this.mTime;
                if (expression != null) {
                    videoElement.seekTo((int) expression.evaluate());
                    return;
                }
                return;
            }
            if (i2 == 4) {
                Expression expression2 = this.mVolume;
                if (expression2 != null) {
                    videoElement.setVolume((float) expression2.evaluate());
                    return;
                }
                return;
            }
            if (i2 != 5) {
                return;
            }
            Expression expression3 = this.mLooping;
            boolean z2 = false;
            if (expression3 != null && expression3.evaluate() > 0.0d) {
                z2 = true;
            }
            Expression expression4 = this.mScaleMode;
            int iEvaluate = expression4 != null ? (int) expression4.evaluate() : 1;
            Expression expression5 = this.mPath;
            videoElement.config(z2, iEvaluate, expression5 != null ? expression5.evaluateStr() : "");
        }
    }

    @Deprecated
    private static class VisibilityProperty extends PropertyCommand {
        public static final String PROPERTY_NAME = "visibility";
        private boolean mIsShow;
        private boolean mIsToggle;

        protected VisibilityProperty(ScreenElement screenElement, Variable variable, String str) {
            super(screenElement, variable, str);
            if (str.equalsIgnoreCase("toggle")) {
                this.mIsToggle = true;
            } else if (str.equalsIgnoreCase("true")) {
                this.mIsShow = true;
            } else if (str.equalsIgnoreCase("false")) {
                this.mIsShow = false;
            }
        }

        @Override // com.miui.maml.ActionCommand
        public void doPerform() {
            if (!this.mIsToggle) {
                this.mTargetElement.show(this.mIsShow);
            } else {
                this.mTargetElement.show(!r0.isVisible());
            }
        }
    }

    private static class WifiSwitchCommand extends NotificationReceiver {
        private final OnOffCommandHelper mOnOffHelper;
        private final StateTracker mWifiState;

        public WifiSwitchCommand(ScreenElement screenElement, String str) {
            super(screenElement, VariableNames.WIFI_STATE, NotifierManager.TYPE_WIFI_STATE);
            this.mWifiState = new WifiStateTracker(null);
            update();
            this.mOnOffHelper = new OnOffCommandHelper(str);
        }

        @Override // com.miui.maml.ActionCommand
        protected void doPerform() {
            Context context = getContext();
            if (this.mOnOffHelper.mIsToggle) {
                this.mWifiState.toggleState(context);
            } else {
                boolean z2 = false;
                int triState = this.mWifiState.getTriState(context);
                if (triState == 0 ? this.mOnOffHelper.mIsOn : !(triState != 1 || this.mOnOffHelper.mIsOn)) {
                    z2 = true;
                }
                if (z2) {
                    this.mWifiState.requestStateChange(context, this.mOnOffHelper.mIsOn);
                }
            }
            update();
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver, com.miui.maml.NotifierManager.OnNotifyListener
        public void onNotify(Context context, Intent intent, Object obj) {
            this.mWifiState.onActualStateChange(context, intent);
            super.onNotify(context, intent, obj);
        }

        @Override // com.miui.maml.ActionCommand.NotificationReceiver
        protected void update() {
            int triState = this.mWifiState.getTriState(getContext());
            if (triState == 0) {
                updateState(0);
                return;
            }
            if (triState == 1) {
                updateState(((WifiStateTracker) this.mWifiState).zConnected ? 1 : 2);
            } else {
                if (triState != 5) {
                    return;
                }
                updateState(this.mWifiState.isTurningOn() ? 3 : 0);
            }
        }
    }

    public ActionCommand(ScreenElement screenElement) {
        this.mScreenElement = screenElement;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ActionCommand create(Element element, ScreenElement screenElement) {
        ActionCommand graphicsCommand;
        ActionCommand actionCommandCreate;
        if (element == null) {
            return null;
        }
        Expression expressionBuild = Expression.build(screenElement.getVariables(), element.getAttribute("condition"));
        Expression expressionBuild2 = Expression.build(screenElement.getVariables(), element.getAttribute("delayCondition"));
        long attrAsLong = Utils.getAttrAsLong(element, "delay", 0L);
        String nodeName = element.getNodeName();
        nodeName.hashCode();
        byte b2 = -1;
        switch (nodeName.hashCode()) {
            case -1988058592:
                if (nodeName.equals(GraphicsCommand.TAG_NAME)) {
                    b2 = 0;
                }
                break;
            case -1919219473:
                if (nodeName.equals(IntentCommand.TAG_NAME)) {
                    b2 = 1;
                }
                break;
            case -1735490724:
                if (nodeName.equals(SoundCommand.TAG_NAME)) {
                    b2 = 2;
                }
                break;
            case -1698045830:
                if (nodeName.equals(TickListenerCommand.TAG_NAME)) {
                    b2 = 3;
                }
                break;
            case -1679919317:
                if (nodeName.equals(TAG_NAME)) {
                    b2 = 4;
                }
                break;
            case -1263152477:
                if (nodeName.equals(PermanenceCommand.TAG_NAME)) {
                    b2 = 5;
                }
                break;
            case -1248094580:
                if (nodeName.equals(LottieCommand.TAG_NAME)) {
                    b2 = 6;
                }
                break;
            case -1214351624:
                if (nodeName.equals(AnimConfigCommand.TAG_NAME)) {
                    b2 = 7;
                }
                break;
            case -1157373931:
                if (nodeName.equals("ActionCommand")) {
                    b2 = 8;
                }
                break;
            case -1031402045:
                if (nodeName.equals(EaseTypeCommand.TAG_NAME)) {
                    b2 = 9;
                }
                break;
            case -768846862:
                if (nodeName.equals(MultiCommand.TAG_NAME)) {
                    b2 = 10;
                }
                break;
            case -447874370:
                if (nodeName.equals("FrameRateCommand")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case -176797942:
                if (nodeName.equals(MethodCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case -146126197:
                if (nodeName.equals(PbrCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 38409067:
                if (nodeName.equals(ExternCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 765286380:
                if (nodeName.equals(MultiCommand.TAG_NAME1)) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 812540743:
                if (nodeName.equals(AnimationCommand.TAG_NAME)) {
                    b2 = 16;
                }
                break;
            case 911071503:
                if (nodeName.equals(VariableAssignmentCommand.TAG_NAME)) {
                    b2 = 17;
                }
                break;
            case 967558768:
                if (nodeName.equals(VideoCommand.TAG_NAME)) {
                    b2 = 18;
                }
                break;
            case 1017417233:
                if (nodeName.equals(SensorBinderCommand.TAG_NAME)) {
                    b2 = 19;
                }
                break;
            case 1099578084:
                if (nodeName.equals(JsonObjectCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 1192886094:
                if (nodeName.equals(IfCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
            case 1242365201:
                if (nodeName.equals(FieldCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68130o1t;
                }
                break;
            case 1252238076:
                if (nodeName.equals(VibrateCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68135wvg;
                }
                break;
            case 1624729163:
                if (nodeName.equals(AnimStateCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f25759t;
                }
                break;
            case 1774042657:
                if (nodeName.equals(VariableBinderCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68127mcp;
                }
                break;
            case 1905320272:
                if (nodeName.equals(FolmeCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68121jk;
                }
                break;
            case 1952987187:
                if (nodeName.equals(FunctionPerformCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68110a9;
                }
                break;
            case 2009815015:
                if (nodeName.equals(LoopCommand.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68118fti;
                }
                break;
        }
        switch (b2) {
            case 0:
                graphicsCommand = new GraphicsCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 1:
                graphicsCommand = new IntentCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 2:
                graphicsCommand = new SoundCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 3:
                graphicsCommand = new TickListenerCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 4:
                actionCommandCreate = create(screenElement, element.getAttribute(zurt.InterfaceC0290k.f47416lvui), element.getAttribute("value"));
                break;
            case 5:
                graphicsCommand = new PermanenceCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 6:
                graphicsCommand = new LottieCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 7:
                graphicsCommand = new AnimConfigCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 8:
                graphicsCommand = new ActionPerformCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 9:
                graphicsCommand = new EaseTypeCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 10:
            case 15:
                graphicsCommand = new MultiCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 11:
                graphicsCommand = new FrameRateCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 12:
                graphicsCommand = new MethodCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 13:
                graphicsCommand = new PbrCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 14:
                graphicsCommand = new ExternCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 16:
                graphicsCommand = new AnimationCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 17:
                graphicsCommand = new VariableAssignmentCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 18:
                graphicsCommand = new VideoCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 19:
                graphicsCommand = new SensorBinderCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 20:
                graphicsCommand = new JsonObjectCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 21:
                graphicsCommand = new IfCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 22:
                graphicsCommand = new FieldCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 23:
                graphicsCommand = new VibrateCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 24:
                graphicsCommand = new AnimStateCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 25:
                graphicsCommand = new VariableBinderCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 26:
                graphicsCommand = new FolmeCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 27:
                graphicsCommand = new FunctionPerformCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            case 28:
                graphicsCommand = new LoopCommand(screenElement, element);
                actionCommandCreate = graphicsCommand;
                break;
            default:
                ObjectFactory.ActionCommandFactory actionCommandFactory = (ObjectFactory.ActionCommandFactory) screenElement.getContext().getObjectFactory("ActionCommand");
                actionCommandCreate = actionCommandFactory == null ? null : actionCommandFactory.create(screenElement, element);
                break;
        }
        if (actionCommandCreate == null) {
            return null;
        }
        if (expressionBuild2 != null) {
            actionCommandCreate = new ConditionCommand(actionCommandCreate, expressionBuild2);
        }
        if (attrAsLong > 0) {
            actionCommandCreate = new DelayCommand(actionCommandCreate, attrAsLong);
        }
        return expressionBuild != null ? new ConditionCommand(actionCommandCreate, expressionBuild) : actionCommandCreate;
    }

    protected abstract void doPerform();

    public void finish() {
    }

    protected final Context getContext() {
        return getScreenContext().mContext;
    }

    protected ScreenElementRoot getRoot() {
        return this.mScreenElement.getRoot();
    }

    protected final ScreenContext getScreenContext() {
        return this.mScreenElement.getContext();
    }

    protected ScreenElement getScreenElement() {
        return this.mScreenElement;
    }

    protected final Variables getVariables() {
        return this.mScreenElement.getVariables();
    }

    public void init() {
    }

    protected boolean isExpressionsValid(Expression[] expressionArr) {
        if (expressionArr != null) {
            int i2 = 0;
            while (i2 < expressionArr.length && expressionArr[i2] != null) {
                i2++;
            }
            if (i2 == expressionArr.length) {
                return true;
            }
        }
        return false;
    }

    public void pause() {
    }

    public void perform() {
        doPerform();
    }

    public void resume() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class WifiStateTracker extends StateTracker {
        private static final int MAX_SCAN_ATTEMPT = 3;
        public boolean zConnected;
        private int zScanAttempt;

        private WifiStateTracker() {
            this.zConnected = false;
            this.zScanAttempt = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$requestStateChange$0(Context context, boolean z2) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                MamlLog.m17850d("ActionCommand", "No wifiManager.");
                return;
            }
            if (z2 && HideSdkDependencyUtils.WifiManager_isWifiApEnabled(wifiManager)) {
                HideSdkDependencyUtils.setWifiApEnabled(context, false);
            }
            wifiManager.setWifiEnabled(z2);
        }

        private static int wifiStateToFiveState(int i2) {
            if (i2 == 0) {
                return 3;
            }
            if (i2 == 1) {
                return 0;
            }
            if (i2 != 2) {
                return i2 != 3 ? 4 : 1;
            }
            return 2;
        }

        @Override // com.miui.maml.ActionCommand.StateTracker
        public int getActualState(Context context) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                return wifiStateToFiveState(wifiManager.getWifiState());
            }
            return 4;
        }

        @Override // com.miui.maml.ActionCommand.StateTracker
        public void onActualStateChange(Context context, Intent intent) {
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra(VariableNames.WIFI_STATE, -1);
                setCurrentState(context, wifiStateToFiveState(intExtra));
                if (3 == intExtra) {
                    this.zConnected = true;
                    this.zScanAttempt = 0;
                    return;
                }
                return;
            }
            if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                int i2 = this.zScanAttempt;
                if (i2 < 3) {
                    int i3 = i2 + 1;
                    this.zScanAttempt = i3;
                    if (i3 == 3) {
                        this.zConnected = false;
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
                this.zScanAttempt = 3;
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo == null) {
                    return;
                }
                NetworkInfo.DetailedState detailedState = networkInfo.getDetailedState();
                this.zConnected = NetworkInfo.DetailedState.SCANNING == detailedState || NetworkInfo.DetailedState.CONNECTING == detailedState || NetworkInfo.DetailedState.AUTHENTICATING == detailedState || NetworkInfo.DetailedState.OBTAINING_IPADDR == detailedState || NetworkInfo.DetailedState.CONNECTED == detailedState;
            }
        }

        @Override // com.miui.maml.ActionCommand.StateTracker
        protected void requestStateChange(final Context context, final boolean z2) {
            AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() { // from class: com.miui.maml.k
                @Override // java.lang.Runnable
                public final void run() {
                    ActionCommand.WifiStateTracker.lambda$requestStateChange$0(context, z2);
                }
            });
        }

        /* synthetic */ WifiStateTracker(C51191 c51191) {
            this();
        }
    }

    private static class ModeToggleHelper {
        private int mCurModeIndex;
        private int mCurToggleIndex;
        private ArrayList<Integer> mModeIds;
        private ArrayList<String> mModeNames;
        private boolean mToggle;
        private boolean mToggleAll;
        private ArrayList<Integer> mToggleModes;

        private ModeToggleHelper() {
            this.mModeNames = new ArrayList<>();
            this.mModeIds = new ArrayList<>();
            this.mToggleModes = new ArrayList<>();
        }

        private int findMode(String str) {
            for (int i2 = 0; i2 < this.mModeNames.size(); i2++) {
                if (this.mModeNames.get(i2).equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public void addMode(String str, int i2) {
            this.mModeNames.add(str);
            this.mModeIds.add(Integer.valueOf(i2));
        }

        public boolean build(String str) {
            int iFindMode = findMode(str);
            if (iFindMode >= 0) {
                this.mCurModeIndex = iFindMode;
                return true;
            }
            if ("toggle".equals(str)) {
                this.mToggleAll = true;
                return true;
            }
            for (String str2 : str.split(",")) {
                int iFindMode2 = findMode(str2);
                if (iFindMode2 < 0) {
                    return false;
                }
                this.mToggleModes.add(Integer.valueOf(iFindMode2));
            }
            this.mToggle = true;
            return true;
        }

        public void click() {
            if (this.mToggle) {
                int i2 = this.mCurToggleIndex + 1;
                this.mCurToggleIndex = i2;
                int size = i2 % this.mToggleModes.size();
                this.mCurToggleIndex = size;
                this.mCurModeIndex = this.mToggleModes.get(size).intValue();
                return;
            }
            if (this.mToggleAll) {
                int i3 = this.mCurModeIndex + 1;
                this.mCurModeIndex = i3;
                this.mCurModeIndex = i3 % this.mModeNames.size();
            }
        }

        public int getModeId() {
            return this.mModeIds.get(this.mCurModeIndex).intValue();
        }

        public String getModeName() {
            return this.mModeNames.get(this.mCurModeIndex);
        }

        /* synthetic */ ModeToggleHelper(C51191 c51191) {
            this();
        }
    }

    protected static ActionCommand create(ScreenElement screenElement, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Variable variable = new Variable(str);
            if (variable.getObjName() != null) {
                return PropertyCommand.create(screenElement, str, str2);
            }
            String propertyName = variable.getPropertyName();
            if (COMMAND_RING_MODE.equals(propertyName)) {
                return new RingModeCommand(screenElement, str2);
            }
            if (COMMAND_WIFI.equals(propertyName)) {
                return new WifiSwitchCommand(screenElement, str2);
            }
            if (COMMAND_BLUETOOTH.equals(propertyName)) {
                return new BluetoothSwitchCommand(screenElement, str2);
            }
            if (COMMAND_DATA.equals(propertyName)) {
                return new DataSwitchCommand(screenElement, str2);
            }
            if (COMMAND_USB_STORAGE.equals(propertyName)) {
                return new UsbStorageSwitchCommand(screenElement, str2);
            }
        }
        return null;
    }
}
