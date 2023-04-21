
import Role.Role;


public class SupplierEmployeeRole extends Role{
    private RoleType roleType;
    public SupplierEmployeeRole(){
        RoleType type = RoleType.SuppplierEmployee;
    }
    public RoleType getRoleType() {
        return roleType;
    }
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
