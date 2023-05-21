package com.ll.jwt_2023_05_16;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JwtTest {
    @Value("${custom.jwt.secretKey}")
    private String secretKey;

    @Test
    @DisplayName("secretKey 키가 존재해야한다.")
    void t1() {
        Assertions.assertThat(secretKey).isNotNull();
    }
}