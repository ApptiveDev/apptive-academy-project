# 프로젝트형 스터디
- [📐 진행 방식](#-진행-방식)
- [📑 관리 규칙](#-관리-규칙)
  - [🌵 브랜치](#-브랜치)
  - [📁 폴더](#-폴더)
- [🌏️ 백엔드-프론트 연동](#️-백엔드-프론트-연동)

이곳은 팀장 간 회의를 통해 주어지는 MVP 미션을 모든 직군의 개발자가 함께 구현하는 곳입니다.

## 📐 진행 방식
1. MVP 회의 이후 해당 미션 폴더와 미션 브랜치를 생성합니다. (`<미션명>/main`)
2. 팀장은 미션 브랜치에서 직군별 폴더와 직군별 브랜치를 생성합니다. (`<미션명>/<직군명>`)
   - 초기 세팅을 하고 브랜치에 `push`합니다.
3. 팀원은 직군별 브랜치에서 자신의 브랜치를 따 미션을 진행합니다.
   - 미션을 쪼개 중간중간 다함께 코드리뷰를 진행합니다.  
4. 미션 이후 직군별 브랜치를 미션 브랜치에 병합합니다.
   - `<미션명>/<직군명>` -> `<미션명>/main`

## 📑 관리 규칙
### 🌵 브랜치
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

### 📁 폴더
```pl
|- <미션명>
  |- backend   # 백엔드 작업공간
  |- frontend  # 프론트 작업공간
  |- android   # 안드로이드 작업공간
  |- docker    # 백엔드-프론트 로컬 연동
|- <미션명>
  |- ...
```

## 🌏️ 백엔드-프론트 연동
1. docker-compose 활성화 확인 : 터미널에서 ```docker-compose -v``` 명령을 통해 version이 출력되는지 확인한다.
2. docker-compose 활성화가 되어있지 않으면 os에 맞추어 docker-compose를 설치한다.
3. 터미널에 ```docker compose up --build``` 명령을 통해 컨테이너를 실행 시킨다.
4. Started ApptiveApplication in 8.111 seconds (process running for 8.981)과 같은 출력이 뜨면 localhost:8080 포트를 통해 API를 이용 가능하다.
5. 모든 작업을 마친 후 터미널에 ctrl + c를 통해 실행 중인 서버를 종료시킨다.
6. ```docker compose down``` 명령을 통해 생성된 컨테이너를 삭제한다.
