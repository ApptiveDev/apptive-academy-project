# APPTIVE 아카데미 프로젝트형 스터디

## 브랜치 구조
![homepagegit](https://github.com/ApptiveDev/apptive-20th-academy-project/assets/64734115/afffd8b1-35bc-4f45-9b68-861c70ba381e)  
미션 진행을 위한 브랜치 구조는 아래와 같이 Git Flow를 따릅니다. 단, 간소화하여 `main`, `develop`, `feature(개인브랜치)` 정도로만 구분합니다.
```python
main
  - <미션명>/main                    #  잘 동작하는 프론트, 백엔드 코드 합본
    - <미션명>/frontend/develop      #  프론트엔드팀 미션 진행 공간
      - <미션명>/frontend/<이름>      #  프론트엔드팀 개인별 미션 진행 공간
      - ...
    - <미션명>/backend/develop       #  백엔드팀 미션 진행 공간
      - <미션명>/backend/<이름>       #  백엔드팀 개인별 미션 진행 공간
      - ...
```
## 스터디 진행
### 스터디원
1. 브랜치 생성 및 작업 시작
    - 미션과 직군 해당하는 브랜치에서 자신의 이름으로 브랜치를 생성한다.
2. 미션 수행
    - 해당 미션을 수행 후 미션과 직군에 해당하는 브랜치로 pr을 보낸다.  
3. 코드 리뷰 및 리팩터링 후 merge
   - 팀원들과 코드를 리뷰를 하고 팀장은 최종 코드를 미션과 직군에 해당하는 브랜치에 merge한다.
### 개발부장
1. 수행된 미션 확인 후 merge
    - 수행된 미션을 확인 후 미션브랜치, main브랜치로 merge 한다.
2. 다음 미션 브랜치 생성
   - 다음 미션을 위해 새로운 브랜치를 main브랜치에서 생성한다.

## 프론트엔드에서 백엔드 API 이용 방법
1. docker-compose 활성화 확인 : 터미널에서 ```docker-compose -v``` 명령을 통해 version이 출력되는지 확인한다.
2. docker-compose 활성화가 되어있지 않으면 os에 맞추어 docker-compose를 설치한다.
3. 터미널에 ```docker compose up --build``` 명령을 통해 컨테이너를 실행 시킨다.
4. Started ApptiveApplication in 8.111 seconds (process running for 8.981)과 같은 출력이 뜨면 localhost:8080 포트를 통해 API를 이용 가능하다.
5. 모든 작업을 마친 후 터미널에 ctrl + c를 통해 실행 중인 서버를 종료시킨다.
6. ```docker compose down``` 명령을 통해 생성된 컨테이너를 삭제한다.
