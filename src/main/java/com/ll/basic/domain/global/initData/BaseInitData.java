package com.ll.basic.domain.global.initData;

import com.ll.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class BaseInitData {
    private final WiseSayingService wiseSayingService;

    @Bean
    public ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            wiseSayingService.write("1번내용", "1번작가");
            wiseSayingService.write("2번내용", "2번작가");
            wiseSayingService.write("3번내용", "3번작가");
        };
    }

    @Bean
    public List<Integer> ages() {
        return List.of(10, 20, 30, 40, 50);
    }
}
