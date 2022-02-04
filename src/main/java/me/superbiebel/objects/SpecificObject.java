package me.superbiebel.objects;

import javax.validation.constraints.NotNull;

public class SpecificObject {
    public final ObjectType objectType;
    public final String objectID;
    
    public static final String SEPARATOR = ":";
    
    public SpecificObject(String objectType, String objectID) {
        this.objectType = new ObjectType(objectType);
        this.objectID = objectID;
    }
    
    public SpecificObject(@NotNull String tupleString) {
        String[] splittedString = tupleString.split(SEPARATOR);
        if (splittedString.length != 2) {
            throw new IllegalArgumentException("Could not properly split string" + tupleString);
        }
        objectType = new ObjectType(splittedString[0]);
        objectID = splittedString[1];
    }
    
    @Override
    public String toString() {
        return objectType + SEPARATOR + objectID;
    }
}
