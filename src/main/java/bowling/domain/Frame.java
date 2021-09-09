package bowling.domain;

import java.util.List;

public interface Frame {

	boolean isEnd();

	int number();

	void bowl(int fallenPins);

	List<PitchResult> results();
}
