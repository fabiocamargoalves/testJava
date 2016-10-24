package br.com.meta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.meta.projeto.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public @ResponseBody String create(@RequestBody UserVO request){
		return "Sucess";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public @ResponseBody List<UserVO> read(@RequestBody UserVO request){
		List<UserVO> list = new ArrayList<UserVO>();
		
		UserVO uv = new UserVO();
		uv.setName("Jhon");
		uv.setDescription("manager");
		list.add(uv);
		
		UserVO uvTwo = new UserVO();
		uvTwo.setName("Mary");
		uvTwo.setDescription("managerTwo");
		list.add(uvTwo);
		
		return list;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public @ResponseBody UserVO update(@RequestBody UserVO request){
		UserVO ur = new UserVO();
		return ur;
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public @ResponseBody String delete (@RequestBody UserVO request){
		return "Delete";
	}
}
