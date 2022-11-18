package bridge.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputValidatorTest {

	InputValidator inputValidator = new InputValidator();
	private static final String ERROR_MESSAGE = "[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.";

	@DisplayName("3부터 20사이의 숫자가 아니라면 Exception이 발생한다.")
	@ParameterizedTest
	@ValueSource(strings = {"가나다", "a", "-1", "0", "1", "2", "21", "22", "99"})
	void validateBridgeLengthTest(String string) {
		Assertions.assertThrows(IllegalArgumentException.class,
			() -> inputValidator.validateBridgeLength(string),
			ERROR_MESSAGE);
	}

}
