/** 
 * PROJECT  : LOL
 * NAME  :  Champion.java
 * DESC  :  챔피언 정보(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class Champion {
	/** 챔피언 이름 */
	private String name;
	
	/** 라인 **/
	private String line;

	public Champion() {}
	
	public Champion(String name, String line) {
		super();
		this.name = name;
		this.line = line;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getline() {
		return line;
	}

	public void setline(String line) {
		this.line = line;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("챔피언 이름 : ");
		builder.append(name);
		builder.append(", 라인 : ");
		builder.append(line);
		return builder.toString();
	}
}