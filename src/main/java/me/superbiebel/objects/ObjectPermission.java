package me.superbiebel.objects;

public class ObjectPermission implements UserSet{
    public final String permissionName;
    public final boolean userSetRewrite; // if this permission actually calculates it's userset.
    public final UserSet contents;
    
    public ObjectPermission(String permissionName) {
        this.permissionName = permissionName;
        this.userSetRewrite = false;
        this.contents = null;
    }
    
    public ObjectPermission(UserSet contents) {
        this.contents = contents;
        this.userSetRewrite = true;
        this.permissionName = null;
    }
}
