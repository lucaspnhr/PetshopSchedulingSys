package br.com.agroisa.petshopschedulingsys.model.enums;

public enum UserRole {
    USER(new String[]{"USER"}), MANAGER(new String[]{"USER", "EMPLOYEE","MANAGER"}), EMPLOYEE(new String[]{"USER", "EMPLOYEE"});
    private String[] roleList;
    UserRole(String[] roleList){
        this.roleList = roleList;
    }

    public String[] getRolelist(){
        return this.roleList;
    }
}
