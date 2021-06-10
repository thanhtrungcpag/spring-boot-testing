package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HearingInterpreterTest {

    HearingInterpreter hearingInterpreter;

    @BeforeEach
    void setUp() throws Exception{
        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
    }

    @Test
    void whatIheard() {

        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);

    }
}