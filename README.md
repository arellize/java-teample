# 1. 프로젝트 명
게임 챔피언의 정보 조회 및 수정하기

# 2. 설명
* StartView
* ![image](https://user-images.githubusercontent.com/105897325/216893449-eb067a48-8acf-4027-835b-449492a6c643.png)
  * 챔피언의 이름, 아이템, 스킬을 각각 입력 후 저장
  * N번째 챔피언에 각 순서에 맞는 챔피언 이름, 아이템, 스킬을 대입 후 저장
* ![image](https://user-images.githubusercontent.com/105897325/216896958-bcd1d6d5-0793-4a2a-b444-59231b25a185.png)
  * Champion 생성의 경우 InformationChampionController클래스에서 informationChampionProject메소드에 firstChampion을 대입

* Champion.dto
* ![image](https://user-images.githubusercontent.com/105897325/216893920-e9d08ffe-0260-44a5-893e-e9beca66f8d4.png)
  * 챔피언 정보를 입력할 때 입력해야 할 정보를 설정 - 챔피언의 경우 이름과 라인
  * setName으로 입력받은 이름을 저장
  * getName으로 저장된 이름을 반환
  * toString으로 챔피언의 이름과 라인을 문자열로 반환

* InfomationChampion.dto
* ![image](https://user-images.githubusercontent.com/105897325/216895483-b4ea0b44-8ce1-4b9f-9dca-912fd30aa362.png)
  * Champion.dto에 맞는 설정으로 입력된 정보를 받아 championName에 저장
   * 아이템, 스킬도 각각 저장
   * 챔피언의 이름과 입력받은 정보들을 조합해 저장
* ![image](https://user-images.githubusercontent.com/105897325/216895434-6cb4c8b5-b21d-4abc-8a0c-00ff34b1ab4d.png)
   * toString으로 챔피언의 이름과 입력받은 정보들을 조합해 문자열로 반환

* InfomationChampionController
* ![image](https://user-images.githubusercontent.com/105897325/216896677-16c0e2f3-a48f-4d06-aba6-f686db5dd926.png)
   * 입력받은 정보가 존재한다면 InformationChampionProjectModel 클래스에 있는 informationChampionProject메소드를 실행

* InformationChampionProjectModel
* ![image](https://user-images.githubusercontent.com/105897325/216897968-9d3f3225-24ea-4eef-87cf-c616fd834555.png)
  * 입력받은 정보를 informationChampionProjectList에 배열형식으로 저장
  
* 모든 정보가 입력이 되었으면 두 번째 챔피언을 저장하는 코드 실행
* ![image](https://user-images.githubusercontent.com/105897325/216893320-7159e708-9fce-4e0e-b567-4024e0def962.png)


# 3. 느낀점
각 기능에 맞게 코드를 분리하고 분리한 파일끼리 연동하되는것을 직접 경험해 보니 서로 연결되어 작동하는 태엽장치를 보는 느낌이였다. 
