package cn.ssm.sample.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.ssm.sample.dto.User;
import cn.ssm.sample.service.IndexSvr;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class TestAction extends ActionSupport{

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Autowired
	IndexSvr indexSvr;

	@Override
	public String execute() throws Exception {
		user = indexSvr.getUser(1);
		return super.execute();
	}

}
