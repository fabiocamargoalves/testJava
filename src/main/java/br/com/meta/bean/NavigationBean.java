package br.com.meta.bean;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class NavigationBean {
	public String gotoStart() {
		return "/index.xhtml";
	}
	public String gotoUserList() {
		return "/userList.xhtml";
	}
	public String gotoDepartmentList() {
		return "/departmentList.xhtml";
	}
	public String gotoPermissionList() {
		return "/permissionList.xhtml";
	}
	public String gotoNewUser() {
		return "/newUser.xhtml";
	}
	public String gotoNewDepartment() {
		return "/newDepartment.xhtml";
	}
	public String gotoNewPermission() {
		return "/newPermission.xhtml";
	}
}
