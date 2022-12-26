/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;

import probono.model.dto.InformationChampion;

public class SuccessView {
	
	//진행중인 특정 프로젝트 출력 
	public static void projectView(InformationChampion project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<InformationChampion> allProbonoProject){
		
		for (InformationChampion project : allProbonoProject) {
			System.out.println(project.toString());
		}
	}

	// 예외 발생시 단독으로 처리하는 view단 로직
	// 향후 브라우저에 출력 기술로 변환 예정
	
	public static void successMessage(String successMessage) {
		System.out.println("진행상황 : " + successMessage);
	}
}
