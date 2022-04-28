package tw.com.fcb.flower.core.im.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ImDomainTest {

	// BDD
	@Test
	void Given_fxNo_1234_When_user_keyin_Then_false() {
		assertFalse(new ImDomainImpl("1234", new BigDecimal("20.1154"), "USD").fxNoValid());
	}

}
