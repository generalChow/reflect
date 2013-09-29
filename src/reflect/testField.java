/**
 * 
 */
package reflect;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author �ܴ�˧
 * 
 *         2013��9��29��
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
			System.out.println("��һ�α�����Ա��" + fields1[i].getName() + "  ����:"
					+ fields1[i].getType());
			System.out.println(fields1[i].getModifiers());// 1�Ǳ�ʾpublic 2
															// �Ǳ�ʾprivate
			System.out.println("ֵΪ:" + fields1[i].get(role));
		}

		Field fields2[] = c.getDeclaredFields();
		
		for (int i = 0; i < fields2.length; i++) {
			System.out.println("�ڶ��α�����Ա��" + fields2[i].getName() + "  ����:"
					+ fields2[i].getType()+"  private or public :"+fields2[i].getModifiers());
			
			// System.out.println(fields2[i].getDeclaringClass());
			// System.out.println(fields2[i].getGenericType());
			try {
				System.out.println("ֵΪ:" + fields2[i].get(role));// ���ǻᷢ��˽�г�Ա�ǲ������������ʵ�
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("��û������Ȩ�޵�ʱ���ǲ����Է���˽�г�Ա��");
			}
		
		}
		Field.setAccessible(fields2, true);// ���������Ȩ��Ϊtrue�ǲ��ܽ�ȥ��
		for (int i = 0; i < fields2.length; i++) {
			System.out.println("�����α�����Ա��" + fields2[i].getName() + "  ����:"
					+ fields2[i].getType()+"  ˽�л�public:"+fields2[i].getModifiers());
			System.out.println("�޸�ǰ��ֵΪ:" + fields2[i].get(role));
			
             fields2[i].set(role, "fixed");
			System.out.println("�޸ĺ��ֵΪ:" + fields2[i].get(role));// ���ǻᷢ��˽�г�Ա�ǲ������������ʵ�
		}

	}
}
