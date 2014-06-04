package cn.ssm.sample.action;

import cn.ssm.sample.dto.User;
import cn.ssm.sample.service.IndexSvr;

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
		System.out.println("test");
		return super.execute();
	}

}
