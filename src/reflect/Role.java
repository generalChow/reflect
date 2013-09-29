/**
 * 
 */
package reflect;

/**
 * @author 周大帅
 *
 * 2013年9月29日
 */
public class Role {

	
	private String type;
	private String id;
	public String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 */
	public Role() {
		// TODO Auto-generated constructor stub
		 System.out.println("Constructor Role() is invoking");
	}
	
	@SuppressWarnings("unused")
	private  Role(String name){
		this.name = name;
		System.out.println("Constructor Role(String name) is invoking.");
	}
	
	public Role(String name,String type){
		this.name=name;
		this.type=type;
		System.out.println("Constructor Role(String name,String name) is invoking.");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a role called "+this.name;
	}
	
	private void eat(){
		System.out.println("this is a private method called eat ");
	}
	
	public void walk(){
		System.out.println("this is a public method called walk");
	}
}
