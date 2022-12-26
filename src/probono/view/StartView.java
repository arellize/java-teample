/** 
 * PROJECT  : LOL
 * NAME  :  StartView.java
 * DESC  : 실행 클래스
 * 		     챔피온 종류 및 실제 진행되는 프로젝트 생성 및 CRUD 로직을 test하는 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import probono.controller.InformationChampionController;
import probono.model.dto.Champion;
import probono.model.dto.ChampionItem;
import probono.model.dto.InformationChampion;
import probono.model.dto.Skill;

public class StartView {
	
	public static void main(String[] args) {
		
		//챔피언
		//챔피언 명, 라인
//		
		Champion champion1 = new Champion("가렌", "탑");
		Champion champion2 = new Champion("갈리오", "미드");
		Champion champion3 = new Champion("그레이브즈", "정글");
		Champion champion4 = new Champion("그라가스", "정글");
				
//		//아이템
		ChampionItem championItem1 = new ChampionItem("발검음분쇄기", "망자의갑옷", "필멸자의 운명");
		ChampionItem championItem2 = new ChampionItem("만년서리", "존야의모래시계", "모렐로노미콘");
		ChampionItem championItem3 = new ChampionItem("그림자 검", "월식", "징수의 총");
		
		//스킬
		Skill skill1 = new Skill("인내심", "결정타", "용기", "심판", "데마시아의 정의"); // 가렌
		Skill skill2 = new Skill("석상의 강타", "전장의 돌풍", "듀란드의 방패", "정의의 주먹", "영웅출현"); // 갈리오
		Skill skill3 = new Skill("새로운 운명", "화약 역류", "연막탄", "빨리 뽑기", "무고한 희생자"); // 그레이브즈
		Skill skill4 = new Skill("서비스 시간", "술통 굴리기", "취중 분노", "몸통 박치기", "술통 폭발"); // 그라가스
		
		InformationChampion firstChampion = new InformationChampion("첫번째 챔피언", champion1, championItem1, skill1);		
		InformationChampion secondChampion = new InformationChampion("두번째 챔피언",champion2, championItem2, skill2);
		InformationChampion thirdCampion = new InformationChampion("세번째 챔피언",champion3, championItem3, skill3);

		System.out.println("*** 01. Champion 생성 ***");
		InformationChampionController.informationChampionProject(firstChampion);
		InformationChampionController.informationChampionProject(secondChampion);
		InformationChampionController.informationChampionProject(thirdCampion);
		
		// *************
		System.out.println("\n*** 02. 모든 Champion 검색 ***");
		InformationChampionController.getInformationChampionProjectList();		
		
		System.out.println("\n*** 03. 첫번째 챔피언 검색 ***");
		InformationChampionController.getInformationChampionProject(champion1);
		
		System.out.println("\n*** 04. 챔피언 정보와 스킬 수정 ***");
		InformationChampionController.informationChampionUpdate("첫번째 챔피언", champion4);
		InformationChampionController.skillUpdate("첫번째 챔피언", skill4);
		
		InformationChampionController.getInformationChampionProject(champion4);
	}
}


