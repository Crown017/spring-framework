package mytest.aop.service;

public class UserServiceImpl implements UserService {
	@Override
	public void login(String userName, String password) {
		System.out.println("方法开始执行==="+userName+"::: password"+password);
	}
}
