/**
 * 
 */
package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author �ܴ�˧
 *
 * 2013��9��29��
 */
public class testMethod {

	public static void main(String arg[]){
		//showPublicMethod();
		showAllMethod();
	}
	
	public static void showPublicMethod(){
		Method m[] = Role.class.getMethods();//���ر�public���εķ��������Լ������� �ӿ�ʵ�ֵ� �̳и����
		Role role = new Role();
		for(int i=0;i<m.length;i++){
			System.out.println("����������"+m[i].getName()+"--���������Σ�"+m[i].getModifiers());
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
		System.out.println("����û�з��ֱ�private���εķ���  eat()");
	}
	
	public static void showAllMethod(){
		Method m[] = Role.class.getDeclaredMethods();//��ø��������ķ�������ʵ�ֵķ�����û�м̳и���ķ���
		Role role = new Role();
		for(int i =0;i<m.length;i++){
			System.out.println("����������"+m[i].getName()+"--���������Σ�"+m[i].getModifiers());
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
					System.out.println("����һ��private���εķ���");
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					System.out.println("û��Ȩ�޷���");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		Method.setAccessible(m, true);
		
		for(int i =0;i<m.length;i++){
			System.out.println("����������"+m[i].getName()+"--���������Σ�"+m[i].getModifiers());
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
					System.out.println("����һ��private���εķ���");
					m[i].invoke(role, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					System.out.println("û��Ȩ�޷���");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		
	}
	
}
