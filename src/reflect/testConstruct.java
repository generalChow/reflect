/**
 * 
 */
package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 周大帅
 * 
 *         2013年9月29日
 */
public class testConstruct {

	public static void main(String arg[]) {
		// showContruct();
		showAllConstruct();
	}

	/**
	 * 只能获取到public修饰的 构造方法
	 */
	public static void showContruct() {
		try {
			Object role1 = Role.class.newInstance();// 该方法会默认调用无参构造方法

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Constructor<Role> con1 = Role.class
					.getConstructor(new Class[] { String.class });
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("没有权限访问，该private修饰的");

		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("没有该方法，因为getConstrutor是获取不到private修饰的构造方法的");
		}

		try {
			Constructor<Role> con = Role.class.getConstructor(new Class[] {
					String.class, String.class });
			Role role12 = con.newInstance(new Object[] { "bb", "xx" });
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("没有权限访问，该构造方法是private修饰的");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
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

	public static void showAllConstruct() {
		try {
			// getDeclaredCon...可以获取到private修饰的构造方法，new
			// Class[]{String.class}表示一个Class类型的数组，String.class是他的元素
			Constructor<Role> con = Role.class
					.getDeclaredConstructor(new Class[] { String.class });
			con.setAccessible(true);// 这个步骤是用来设置访问 private 构造方法的权限的
			Role r = con.newInstance(new Object[] { "uu" });
		} catch (SecurityException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println("没有权限,请将con.setAccessible(true);");
			e.printStackTrace();
		} catch (InstantiationException e) {
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
