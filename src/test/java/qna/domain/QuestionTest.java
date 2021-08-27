package qna.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import qna.CannotDeleteException;

public class QuestionTest {
    public static final Question Q1 = new Question("title1", "contents1").writeBy(UserTest.JAVAJIGI);
    public static final Question Q2 = new Question("title2", "contents2").writeBy(UserTest.SANJIGI);

    @DisplayName("질문 작성자와 작성자와 로그인 사용자가 일치하면, 질문을 삭제할 수 있다.")
    @Test
    void deletable() throws Exception {
        Question question = QuestionTest.Q1;
        question.delete(UserTest.JAVAJIGI);
        assertThat(question.isDeleted()).isTrue();
    }

    @DisplayName("질문 작성자와 로그인 사용자가 일치하지 않으면, 질문 삭제 시 CannotDeleteException 예외가 발생한다.")
    @Test
    void notDeletable() {
        Question question = QuestionTest.Q1;
        assertThatThrownBy(() -> question.delete(UserTest.SANJIGI))
            .isInstanceOf(CannotDeleteException.class);
        assertThat(question.isDeleted()).isFalse();
    }

}
