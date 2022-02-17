package me.superbiebel.objects;

import me.superbiebel.objects.logicgates.LogicGate;

public class ObjectPermission implements UserSet{
    public final String permissionName;
    public final boolean userSetRewrite; // if this permission actually calculates it's userset.
    public final UserSet contents;
}
