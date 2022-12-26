/** 
 * PROJECT  : LOL
 * NAME  :  ChampionItem.java
 * DESC  :  아이템 정보(Data)
 * 
 * @author 
 * @version 1.0
*/
package probono.model.dto;

public class ChampionItem {
	/** 첫번째 아이템 */
	private String firstItem;

	/** 두번째 아이템 */
	private String secondItem;

	/** 세번째 아이템 */
	private String thirdItem;

	public ChampionItem() {}
	
	public ChampionItem(String firstItem, String secondItem, String thirdItem) {
		super();
		this.firstItem = firstItem;
		this.secondItem = secondItem;
		this.thirdItem = thirdItem;
	}

	public String getFirstIteme() {
		return firstItem;
	}

	public void setFirstIteme(String firstItem) {
		this.firstItem = firstItem;
	}

	public String getSecondItem() {
		return secondItem;
	}

	public void setSecondItem(String secondItem) {
		this.secondItem = secondItem;
	}

	public String getThirdItem() {
		return thirdItem;
	}

	public void setThirdItem(String thirdItem) {
		this.thirdItem = thirdItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("첫번째 아이템 : ");
		builder.append(firstItem);
		builder.append(", 두번째 아이템 : ");
		builder.append(secondItem);
		builder.append(", 세번째 아이템 : ");
		builder.append(thirdItem);
		return builder.toString();
	}
}