package br.com.meta.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserBean {

	public UserBean() {
	}
	public void save() {
		System.out.println("SAVE");
	}

}
