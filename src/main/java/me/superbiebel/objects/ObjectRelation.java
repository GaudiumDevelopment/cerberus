package me.superbiebel.objects;

import java.util.List;

public class ObjectRelation implements UserSet {
    public final String relationName;
    public final List<RelationType> relationTypes;
    
    public ObjectRelation(String relationName, List<RelationType> relationTypes) {
        this.relationName = relationName;
        this.relationTypes = relationTypes;
    }
}
