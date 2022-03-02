# music
With Springboot Music Api Server

##요구사항(필수)
1 상품 관리 CRUD API : 상품 데이터에 대한 조회 / 생성 / 수정 / 삭제 기능
2 구매 정보 저장 API : 사용자 번호 + 상품 아이디 + 주문 번호를 입력 받아 구매 정
보를 저장
3 구매 통계 출력 API : 구매 정보를 기반으로 사용자 / 상품별 구매 합계를 출력

##제약 조건
Spring boot 를 바탕으로 java 또는 kotlin 을 이용하여 작성
Request / Response 대한 log를 한 줄로 출력
요구사항에 정의 된 응답 규격을 만족
in-memory 또는 docker 등을 이용하여 persistence-layer를 구성하고 해당 layer
에 데이터를 저장 및 조회
application 기동 시 제공 되는 csv 파일을 이용하여 구매 데이터 초기 로딩
기능에 대한 단위 / 통합 테스트 작성

##추가 요구사항(선택)
1 필수 요구 사항 3 추가 기능 : 캐싱 및 페이징 처리, 캐시는 일정 주기 (주기는 임의
로 지정 가능)로 캐시를 갱신하도록 스케쥴링
2 필수 요구 사항 2 추가 기능 : Oauth 를 이용하여 회원가입 / 로그인을 구현하고,
사용자 번호 대신 oauth token을 사용. 요청은 oauth 표준인 Authorization
Header 를 사용

##제출
github repository 에 소스를 올린 후 공유 (아래 메일주소 collaborator로 추가)
실행 가능한 jar 파일 제출 또는 docker image 주소를 공유

##응답규격
>성공 : 별도의 공통 규격 없이 요구 조건의 데이터를 출력
ex) 상품 조회
```json
{
    "product" : {
    "id" : 123
    , "name" : "상품1"
    }
}
```

>실패 : error code 및 message를 정의하여 출력
```json
{
    "code" : "xxx"
    , "message" : "실패하였습니다."
}
```
##Data structure

```text
Product 
id: int
name: String
price: int

Purchase 
id: int
user_id: int
product_id: int
price : int

User
id: int
name: String
```
