# 백엔드-프론트 연동
## backend
1. 스프링 프로젝트를 빌드한다. (bootjar)
2. `build/libs` 폴더에서 빌드된 파일(.jar)을 docker 폴더로 옮긴다.

## frontend 
1. `docker` 폴더에서 ```docker compose up --build``` 명령어로 백엔드 서버 실행
2. `localhost:8080` 주소로 API 테스트 진행 (ref. Postman)
3. `docker` 폴더에서 ```docker compose down``` 명령어로 백엔드 서버 종료

