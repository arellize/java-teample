/** 
 * PROJECT  : LOL
 * NAME  :  Skill.java
 * DESC  :  스킬 종류(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class Skill {
	/** 패시브 */
	private String passive; 
	
	/** Q */
	private String q;
	
	/** W */
	private String w;
	
	/** E */
	private String e;
	
	/** R */
	private String r;
	
	public Skill() {}

	public Skill(String passive, String q, String w, String e, String r) {
		super();
		this.passive = passive;
		this.q = q;
		this.w = w;
		this.e = e;
		this.r = r;
	}

	public String getPassive() {
		return passive;
	}

	public void setPassive(String passive) {
		this.passive = passive;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}
	
	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}
	
	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("패시브 : ");
		builder.append(passive);
		builder.append(", Q스킬 : ");
		builder.append(q);
		builder.append(", W스킬 : ");
		builder.append(w);
		builder.append(", E스킬 : ");
		builder.append(e);
		builder.append(", 궁극기 : ");
		builder.append(r);
		return builder.toString();
	}
}
