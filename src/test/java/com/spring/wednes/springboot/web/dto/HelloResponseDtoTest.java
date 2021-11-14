package com.spring.wednes.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
            // assertj 라는 테스트 검증 라이브러리의 검증 메서드. 검증하고 싶은 대상을 메서드 인자로 받는다.
            // 메서드 체이닝이 지원돼 isEqualTo 와 같이 메서드를 이어서 사용 가능.
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }

}