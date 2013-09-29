/**
 * 
 */
package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 周大帅
 *
 * 2013年9月29日
 */
public class testMethod {

	public static void main(String arg[]){
		//showPublicMethod();
		showAllMethod();
	}
	
	public static void showPublicMethod(){
		Method m[] = Role.class.getMethods();//返回被public修饰的方法包括自己声明的 接口实现的 继承父类的
		Role role = new Role();
		for(int i=0;i<m.length;i++){
			System.out.println("方法的名字"+m[i].getName()+"--方法的修饰："+m[i].getModifiers());
			if(m[i].getName().equals("walk")){
				try {
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("我们没有发现被private修饰的方法  eat()");
	}
	
	public static void showAllMethod(){
		Method m[] = Role.class.getDeclaredMethods();//获得该类声明的方法或者实现的方法，没有继承父类的方法
		Role role = new Role();
		for(int i =0;i<m.length;i++){
			System.out.println("方法的名字"+m[i].getName()+"--方法的修饰："+m[i].getModifiers());
			if(m[i].getName().equals("walk")){
				try {
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
			if(m[i].getModifiers()==2){
				try {
					System.out.println("进入一个private修饰的方法");
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					System.out.println("没有权限访问");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		Method.setAccessible(m, true);
		
		for(int i =0;i<m.length;i++){
			System.out.println("方法的名字"+m[i].getName()+"--方法的修饰："+m[i].getModifiers());
			if(m[i].getName().equals("walk")){
				try {
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
			if(m[i].getModifiers()==2){
				try {
					System.out.println("进入一个private修饰的方法");
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					System.out.println("没有权限访问");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		
	}
	
}
