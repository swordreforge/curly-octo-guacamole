package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.eqxt;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
@kotlin.ki
final class wvg implements TypeVariable<GenericDeclaration>, InterfaceC6381z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6365i f36582k;

    public wvg(@InterfaceC7396q InterfaceC6365i typeParameter) {
        d2ok.m23075h(typeParameter, "typeParameter");
        this.f36582k = typeParameter;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (d2ok.f7l8(getName(), typeVariable.getName()) && d2ok.f7l8(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC7396q
    public Type[] getBounds() {
        List<t8r> upperBounds = this.f36582k.getUpperBounds();
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(C6377t.zy((t8r) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC7396q
    public GenericDeclaration getGenericDeclaration() {
        throw new eqxt("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f36582k));
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC7396q
    public String getName() {
        return this.f36582k.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.InterfaceC6381z
    @InterfaceC7396q
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final <T extends Annotation> T m23412k(@InterfaceC7396q Class<T> annotationClass) {
        d2ok.m23075h(annotationClass, "annotationClass");
        return null;
    }

    @InterfaceC7396q
    public String toString() {
        return getTypeName();
    }

    @InterfaceC7396q
    public final Annotation[] toq() {
        return new Annotation[0];
    }

    @InterfaceC7396q
    public final Annotation[] zy() {
        return new Annotation[0];
    }
}
