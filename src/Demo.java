
/**
 * @author 作者 马仁喜 E-mail 372445135@qq.com:
 * @version 创建时间：2017年11月26日 上午6:29:28
 * 类说明
 */
public class Demo {
	public static int userCount=2;
	public void addUser(String user){
		System.out.println("执行addUser");
		userCount++;
	};
	public int queryCount(){
		return userCount;
	}
	public void deleteUser(){
		System.out.println("执行deleteUser");
		userCount--;
	}
}

