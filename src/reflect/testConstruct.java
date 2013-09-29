/**
 * 
 */
package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author �ܴ�˧
 * 
 *         2013��9��29��
 */
public class testConstruct {

	public static void main(String arg[]) {
		// showContruct();
		showAllConstruct();
	}

	/**
	 * ֻ�ܻ�ȡ��public���ε� ���췽��
	 */
	public static void showContruct() {
		try {
			Object role1 = Role.class.newInstance();// �÷�����Ĭ�ϵ����޲ι��췽��

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
			System.out.println("û��Ȩ�޷��ʣ���private���ε�");

		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("û�и÷�������ΪgetConstrutor�ǻ�ȡ����private���εĹ��췽����");
		}

		try {
			Constructor<Role> con = Role.class.getConstructor(new Class[] {
					String.class, String.class });
			Role role12 = con.newInstance(new Object[] { "bb", "xx" });
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("û��Ȩ�޷��ʣ��ù��췽����private���ε�");
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
			// getDeclaredCon...���Ի�ȡ��private���εĹ��췽����new
			// Class[]{String.class}��ʾһ��Class���͵����飬String.class������Ԫ��
			Constructor<Role> con = Role.class
					.getDeclaredConstructor(new Class[] { String.class });
			con.setAccessible(true);// ����������������÷��� private ���췽����Ȩ�޵�
			Role r = con.newInstance(new Object[] { "uu" });
		} catch (SecurityException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println("û��Ȩ��,�뽫con.setAccessible(true);");
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
