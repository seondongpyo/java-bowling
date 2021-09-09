package bowling.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastFrame {

    private static final int MAX_PINS_COUNT = 10;

    private final int number;
    private final List<PitchResult> results;

    public LastFrame() {
        this.number = 10;
        this.results = new ArrayList<>();
    }

    public void bowl(int fallenPins) {
        if (isEnd()) {
            throw new IllegalArgumentException();
        }

        if (isBonusChance()) {
            results.add(PitchResult.of(fallenPins));
            return;
        }

        if (isTotalPinsMoreThan10With(fallenPins)) {
            throw new IllegalArgumentException();
        }

        if (isSpare(fallenPins)) {
            results.add(PitchResult.spare(fallenPins));
            return;
        }

        results.add(PitchResult.of(fallenPins));
    }

    private boolean isTotalPinsMoreThan10With(int fallenPins) {
        return totalPins() + fallenPins > MAX_PINS_COUNT;
    }

    private boolean isBonusChance() {
        return results.size() < 3 && (hasStrike() || hasSpare());
    }

    public boolean isEnd() {
        if (hasStrike() || hasSpare()) {
            return results.size() == 3;
        }
        return results.size() == 2;
    }

    private boolean isSpare(int fallenPins) {
        return !results.isEmpty() && (totalPins() + fallenPins == MAX_PINS_COUNT);
    }

    private boolean hasStrike() {
        return results.contains(PitchResult.of(MAX_PINS_COUNT));
    }

    private boolean hasSpare() {
        return results.size() == 2 && totalPins() == MAX_PINS_COUNT;
    }

    private int totalPins() {
        return results.stream()
                .mapToInt(PitchResult::fallenPins)
                .sum();
    }

    public List<PitchResult> results() {
        return Collections.unmodifiableList(results);
    }

    public int number() {
        return number;
    }
}
