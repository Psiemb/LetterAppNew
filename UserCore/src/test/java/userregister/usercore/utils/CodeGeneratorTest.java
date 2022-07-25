package userregister.usercore.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeGeneratorTest {

    public CodeGenerator codeGenerator;

    @BeforeEach
    void seUp() {
        this.codeGenerator = new CodeGenerator();
    }

    @Test
    public void checkIfWorkingWhenHappyPath() {

        //when
        String code = codeGenerator.code();

        //then
        assertEquals("123456", code);
    }
}

