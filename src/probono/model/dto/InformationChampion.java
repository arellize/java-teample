/** 
 * PROJECT  : LOL
 * NAME  :  InformationChampion.java
 * DESC  :  챔피언 정보(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class InformationChampion {
	
	private String name;

	/** 챔피언 이름 */
	private Champion championName;

	/** 챔피언 아이템 */
	private ChampionItem championItem;

	/** 챔피언 스킬 */
	private Skill championSkill;

	public InformationChampion() {
		super();
	}
	public InformationChampion(String name, Champion championName, ChampionItem championItem, Skill championSkill) {
		super();
		this.name = name;
		this.championName = championName;
		this.championItem = championItem;
		this.championSkill = championSkill;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Champion getChampionName() {
		return championName;
	}

	public void setChampionName(Champion championName) {
		this.championName = championName;
	}

	public ChampionItem getChampionItem() {
		return championItem;
	}

	public void setChampionItem(ChampionItem championItem) {
		this.championItem = championItem;
	}

	public Skill getSkill() {
		return championSkill;
	}

	public void setSkill(Skill championSkill) {
		this.championSkill = championSkill;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 챔피언 : ");
		builder.append(name + ", ");
//		builder.append(" 챔피언 : ");
		builder.append(championName);
		builder.append(", 아이템 : ");
		builder.append(championItem);
		builder.append(", 스킬 : ");
		builder.append(championSkill);
		return builder.toString();
	}
}