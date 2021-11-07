package com.spring.wednes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 빈 생성+읽기가 자동으로 설정된다.
// ** 특히 이 어노테이션이 있는 위치 부터 설정을 읽어가기 때문에 메인 클래스는 항상 프로젝트의 최상단에 위치해야한다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // run메서드는 내장 WAS를 실행한다.
    }
}
