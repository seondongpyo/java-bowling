# 볼링 게임 점수판

## 기능 요구사항
- **1단계 - 질문 삭제하기 기능 리팩토링**
* [x] 질문 작성자와 로그인 사용자가 일치하면 질문을 삭제할 수 있다.
* [x] 질문 작성자와 로그인 사용자가 일치하지 않으면 질문을 삭제할 수 없다.
* [x] 답변 작성자와 로그인 사용자가 일치하면 답변을 삭제할 수 있다.
* [x] 답변 작성자와 로그인 사용자가 일치하지 않으면 답변을 삭제할 수 없다.
* [x] 질문에 답변이 있는 경우, 질문자와 모든 답변 글의 답변자가 같은 경우에만 질문을 삭제할 수 있다.
* [x] 질문에 답변이 있는 경우, 질문자와 답변자가 다르면 질문을 삭제할 수 없다.
* [x] 질문을 삭제할 때 답변 또한 삭제해야 하며, 답변의 삭제 또한 삭제 상태(deleted)를 변경해야 한다.
* [x] 질문과 답변 삭제 이력에 대한 정보를 DeleteHistory를 활용해 남긴다.

- **2단계 - 볼링 점수판(그리기)**
* [x] 볼링에 참여할 플레이어의 이름을 입력 받는다.  
  * 이름의 길이는 1 이상 3 이하여야 한다.
* [x] 프레임의 각 투구마다 쓰러뜨린 볼링 핀의 숫자를 입력 받는다.
  * 쓰러뜨린 볼링 핀의 숫자는 0 이상 10 이하여야 한다. 
* [x] 입력 받은 쓰러뜨린 볼링 핀의 숫자에 따라 결과를 저장한다.
  * 첫 번째 투구 10개 → 스트라이크
  * 첫 번째 투구 + 두 번째 투구 = 10 → 스페어
    * 스페어는 쓰러뜨린 볼링 핀의 합이 10을 초과할 수 없다.
  * 첫 번째 투구 + 두 번째 투구 < 10 → 미스
  * 0개 → 거터
* [x] 1 ~ 9프레임은 2번의 투구 기회를 갖는다.
  * 스트라이크를 친 경우, 프레임이 종료되고 다음 프레임으로 이동한다.
* [x] 10프레임은 최대 3번의 투구 기회를 갖는다.
  * 2번의 투구 안에 스트라이크 또는 스페어를 칠 경우, 보너스 투구 기회가 주어진다.
  * 2번의 투구 안에 스트라이크 또는 스페어를 치지 못한 경우, 프레임이 종료된다.

    
## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)