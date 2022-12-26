/** 
 * PROJECT  : LOL
 * NAME  :  InformationChampionProjectModel.java
 * DESC  :  LOL 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
 * 
 * @author  
 * @version 1.0
*/

package probono.service;

//step02
import java.util.ArrayList;

import probono.exception.NotFoundProjectException;
import probono.model.dto.Champion;
import probono.model.dto.InformationChampion;
import probono.model.dto.Skill;

public class InformationChampionProjectModel {

	private static InformationChampionProjectModel instance = new InformationChampionProjectModel();

	/** 진행중인 Project를 저장하는 배열 */
	private ArrayList<InformationChampion> informationChampionProjectList = new ArrayList<InformationChampion>();

	private InformationChampionProjectModel() {}

	public static InformationChampionProjectModel getInstance() {
		return instance;
	}
	

	/**
	 * 모든 챔피언 검색
	 * 
	 * @return 모든 챔피언
	 */
	public ArrayList<InformationChampion> getInformationChampionProjectList() {
		return informationChampionProjectList;
	}

	
	/** 
	 * 챔피언 이름으로 검색 - 존재할 경우 챔피언 정보 반환하기, 없을 경우 null 반환
	 * 
	 * @param champion 프로젝트 이름
	 * @return InformationChampionProject 검색된 프로젝트
	 * @exception 검색하는 챔피언이 미 존재할 경우 NotFoundProjectException 발생
	 */
	public InformationChampion getInformationChampionProject(Champion champion) throws NotFoundProjectException{
		
		for(InformationChampion tp : informationChampionProjectList) {
			if(tp.getChampionName().equals(champion)) {
				return tp; // 반복문 내부에 return이 있는 경우 메소드 자체를 종료
//				break; 반복문만 종료
			}
		}
		
		throw new NotFoundProjectException("고객님 검색하는 project는 미존재합니다. 재확인 하세요");
//		return null;
	}

	/**
	 * 새로운 챔피언 추가 
	 * 
	 * @param project 저장하고자 하는 새로운 챔피언
	 */

	public void informationChampionProject(InformationChampion project) {
		informationChampionProjectList.add(project);  // 데이터 자동으로 index적용하면서 저장
	}

	
	/**
	 * 챔피언의 정보 수정 - 첫번째 챔피언 검색해서 해당 챔피언의 정보 수정
	 * 
	 * @param name 첫번째 챔피언
	 * @param champion      챔피언
	 */
	public void informationChampionUpdate(String name, Champion champion) throws NotFoundProjectException{
		for(InformationChampion project : informationChampionProjectList) {
			if(project.getName().equals(name)) {
				project.setChampionName(champion);
				return;
			}
		}
		
		throw new NotFoundProjectException(name + "업데이트 하려는 project는 존재하지 않습니다.");
	}
	
	/**
	 * 챔피언의 스킬 수정 - 첫번째 챔피언 검색해서 해당 챔피언의 스킬 수정
	 * 
	 * @param name 첫번째 챔피언
	 * @param skill 스킬
	 */
	public void skillUpdate(String name, Skill skill) throws NotFoundProjectException{
		for(InformationChampion project : informationChampionProjectList) {
			if(project.getName().equals(name)) {
				project.setSkill(skill);
				return;
			}
		}
		
		throw new NotFoundProjectException(name + "업데이트 하려는 project는 존재하지 않습니다.");
	}


	/**
	 * 생성된 챔피언 갯수 반환
	 * @return 갯수
	 */
	public int projectListSize() {
		return informationChampionProjectList.size();
	}
}


