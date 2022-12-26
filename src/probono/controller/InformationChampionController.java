/*
 * 1. StartView 즉 요청 화면으로 부터 요청 받음
 * 2. 요청에 맞게 핵심기능(biz, model, core) 실행 지시
 * 3. 핵심 기능 실행후 결과를 controller에게 응답
 * 	경우의 수 1 : 정상 응답
 * 		- 정상 실행 출력 화면 지정해서 실행시킴
 * 	경우의 수 2 : 비정상 응답
 * 		- 비정상 실행 출력 화면 지정해서 실행시킴
 */

package probono.controller;

import java.util.ArrayList;

import probono.exception.NotFoundProjectException;
import probono.model.dto.Champion;
import probono.model.dto.InformationChampion;
import probono.model.dto.Skill;
import probono.service.InformationChampionProjectModel;
import probono.view.FailView;
import probono.view.SuccessView;

public class InformationChampionController {

	private static InformationChampionProjectModel service = InformationChampionProjectModel.getInstance();

	public static void getInformationChampionProject(Champion champion) {
		try {
			SuccessView.projectView(service.getInformationChampionProject(champion));
		} catch (NotFoundProjectException e) {
			e.printStackTrace();// 개발시 확인용 또는 유지보수 관리자들 확인용 메세지
			FailView.printFail(e.getMessage()); // client에게 응답하게되는 메세지
		}
	}

	public static void informationChampionProject(InformationChampion project) {
		if (project != null) {
			service.informationChampionProject(project);
		} else {
			FailView.printFail("입력 정보가 유효하지 않습니다. 재확인 해주세요");
		}
	}

	/**
	 * 모든 챔피언 검색
	 * 
	 * @return 모든 챔피언
	 */
	public static void getInformationChampionProjectList() {
		ArrayList<InformationChampion> projects = service.getInformationChampionProjectList();

		if (projects.size() != 0) {
			SuccessView.projectListView(projects);
		} else {
			FailView.printFail("현 시점에 진행되는 Project는 없습니다.");
		}
	}

	/**
	 * 챔피언의 정보 수정 - 첫번째 챔피언 검색해서 해당 챔피언의 정보 수정
	 * 
	 * @param name 첫번째 챔피언
	 * @param champion      챔피언
	 */
//	public static void informationChampionUpdate(String name, Champion champion)
	public static void informationChampionUpdate(String name, Champion champion) {
		if (name != null && champion != null) {
			try {
				service.informationChampionUpdate(name, champion);
				SuccessView.successMessage("쳄피언 정보를 변경하였습니다.");
				
			}catch(NotFoundProjectException e) {
				e.printStackTrace(); // 관리자용 확인 코드
				FailView.printFail(e.getMessage());
			}
		} else {
			FailView.printFail("업데이트가 불가능합니다. 챔피언 입력 정보를 재확인 해주세요");
		}

	}

	/**
	 * 챔피언의 스킬 수정 - 첫번째 챔피언 검색해서 해당 챔피언의 스킬 수정
	 * 
	 * @param name 첫번째 챔피언
	 * @param skill 스킬
	 */
	public static void skillUpdate(String name, Skill skill) {
		
		if (name != null && skill != null) {
			try {
				service.skillUpdate(name, skill);
//				SuccessView.successMessage("해당 project의 수혜자 정보 수정 완료했습니다.");
			}catch (NotFoundProjectException e){
				
			}
			
		} else {
			FailView.printFail("업데이트가 불가능합니다. 수혜자 입력 정보를 재확인 해주세요");
		}
	}

}
