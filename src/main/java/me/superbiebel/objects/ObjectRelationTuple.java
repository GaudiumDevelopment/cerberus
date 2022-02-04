package me.superbiebel.objects;

import javax.validation.constraints.NotNull;

public class ObjectRelationTuple {
    public final ObjectType objectType;
    public final String relationName;
    
    public static final String SEPARATOR = "#";
    
    public ObjectRelationTuple(String objectType, String relationName) {
        this.objectType = new ObjectType(objectType);
        this.relationName = relationName;
    }
    
    public ObjectRelationTuple(@NotNull String tupleString) {
        String[] splittedString = tupleString.split(SEPARATOR);
        if (splittedString.length != 2) {
            throw new IllegalArgumentException("Could not properly split string" + tupleString);
        }
        objectType = new ObjectType(splittedString[0]);
        relationName = splittedString[1];
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(objectType);
        sb.append(SEPARATOR);
        sb.append(relationName);
        return sb.toString();
    }
}
