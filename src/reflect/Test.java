/**
 * 
 */
package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author �ܴ�˧
 *
 * 2013��9��29��
 */
public class Test {

	//private Class c;
	//private Constructor<T>
	public static void main(String a[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		//Class s = Class.forName("java.util.Stack");
//		Method m[] = s.getMethods();
//		for(int i = 0;i<m.length;i++){
//			System.out.println(m[i].toString());
//		}
		Class c = Role.class;
		//Object r = c.newInstance();//Ĭ�ϵ����޲ι��췽��
	//	System.out.println(r.toString());
		//Constructor[] con= c.getConstructors();
		//Constructor con = c.getConstructor(new Class[] {String.class});
	      Constructor<Role> con = c.getDeclaredConstructor(new Class[]{String.class});
		con.setAccessible(true);
		System.out.println(con.isAccessible());
		 Object obj = con.newInstance(new Object[]{"liyang"});
		 //System.out.println(obj);  //��ӡһ������������Ϣ
		//System.out.println(new Class[]{String.class,Integer.class});
		//System.out.println(new Object[] {"bobo","yes"}[0]);
		
//		 Constructor con1 = c.getDeclaredConstructor(new Class[]{String.class});
//		 Object o = con1.newInstance(new String[]{"yeyes"});
//		 System.out.println(o.toString());
//		Field[] fields= c.getDeclaredFields();
//		for(int i =0;i<fields.length;i++){
//			System.out.println(fields[i].getName()+":"+fields[i].getType());
//		}
	//	Role role = new Role();
		//Class cls = role.getClass();
		//cls.getField("name").set(role,"cc");
		//System.out.println(role.getName());
		
		
		 
	
	}
	
}
