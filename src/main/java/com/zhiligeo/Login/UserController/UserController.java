package com.zhiligeo.Login.UserController;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import com.zhiligeo.Login.UserService.UserService;

import com.zhiligeo.Login.domain.User;






@Controller
@EnableAutoConfiguration

public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	String welcome() {
		return "welcome my first spring boot project";
	}

	@RequestMapping("/notVerify")
	@ResponseBody
	String notVerify() {
		return "用户名或密码错误";
	}

	@RequestMapping("/login")

	 String login(Model model) {
		model.addAttribute("user",new User());
      
        return "index";
    }

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	
	String userLogin(User user, Model model) {
		boolean verify=userService.verifyUser(user);

//		SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();
//		 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<User> users = userMapper.findByNameAndPassword(user);
		if (verify) {
			model.addAttribute("name", user.getName());
			model.addAttribute("password", user.getPassword());
			return "result";
		}else {
			return "redirect:/notVerify";
		}
	}
}
