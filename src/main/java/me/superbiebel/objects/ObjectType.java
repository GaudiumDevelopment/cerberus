package me.superbiebel.objects;

import javax.validation.constraints.NotNull;
import java.util.Objects;


public class ObjectType {
    public final LINKED_OBJECT_TYPE linkedObjectType;
    public final String typeName;
    public final ObjectRelationTuple objectRelationType;
    
    public ObjectType(@NotNull String typeName) {
        this.typeName = typeName;
        this.objectRelationType = null;
        this.linkedObjectType = LINKED_OBJECT_TYPE.SINGLE;
    }
    
    public ObjectType(@NotNull ObjectRelationTuple objectRelationType) {
        this.typeName = null;
        this.objectRelationType = objectRelationType;
        this.linkedObjectType = LINKED_OBJECT_TYPE.GROUP;
    }
    
    public boolean isObjectTypeSingle() {
        return linkedObjectType == LINKED_OBJECT_TYPE.SINGLE;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectType)) return false;
        ObjectType that = (ObjectType) o;

        if (this.isObjectTypeSingle() && that.isObjectTypeSingle()) {
            return that.typeName.equals(this.typeName);
        } else if (!this.isObjectTypeSingle() && that.isObjectTypeSingle()) {
            return that.objectRelationType.equals(that.objectRelationType);
        } else {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        if (this.isObjectTypeSingle()) {
            return Objects.hash(linkedObjectType, typeName);
        } else {
            return Objects.hash(linkedObjectType, objectRelationType);
        }
    }
    
    enum LINKED_OBJECT_TYPE {
        SINGLE, GROUP
    }
}
