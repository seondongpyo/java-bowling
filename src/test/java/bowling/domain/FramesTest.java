package bowling.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FramesTest {

    @Test
    void test() {
        Frames frames = new Frames();
        assertThat(frames.current().number()).isEqualTo(1);
    }

}
