/**
 * 
 */
package reflect;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author 周大帅
 * 
 *         2013年9月29日
 */
public class testField {

	public static void main(String a[]) throws IllegalArgumentException,
			IllegalAccessException {
		Role role = new Role();
		role.setName("aa");
		role.setType("type1");
		role.setId("id1");
		Class c = role.getClass();
		Field fields1[] = c.getFields();
		for (int i = 0; i < fields1.length; i++) {
			System.out.println("第一次变量成员：" + fields1[i].getName() + "  类名:"
					+ fields1[i].getType());
			System.out.println(fields1[i].getModifiers());// 1是表示public 2
															// 是表示private
			System.out.println("值为:" + fields1[i].get(role));
		}

		Field fields2[] = c.getDeclaredFields();
		
		for (int i = 0; i < fields2.length; i++) {
			System.out.println("第二次变量成员：" + fields2[i].getName() + "  类名:"
					+ fields2[i].getType()+"  private or public :"+fields2[i].getModifiers());
			
			// System.out.println(fields2[i].getDeclaringClass());
			// System.out.println(fields2[i].getGenericType());
			try {
				System.out.println("值为:" + fields2[i].get(role));// 我们会发现私有成员是不可以这样访问的
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("在没有设置权限的时候是不可以访问私有成员的");
			}
		
		}
		Field.setAccessible(fields2, true);// 如果不设置权限为true是不能进去的
		for (int i = 0; i < fields2.length; i++) {
			System.out.println("第三次变量成员：" + fields2[i].getName() + "  类名:"
					+ fields2[i].getType()+"  私有或public:"+fields2[i].getModifiers());
			System.out.println("修改前的值为:" + fields2[i].get(role));
			
             fields2[i].set(role, "fixed");
			System.out.println("修改后的值为:" + fields2[i].get(role));// 我们会发现私有成员是不可以这样访问的
		}

	}
}
