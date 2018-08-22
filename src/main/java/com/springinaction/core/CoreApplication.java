package com.springinaction.core;

import com.springinaction.core.knights.BraveKnight;
import com.springinaction.core.knights.Knight;
import com.springinaction.core.knights.Quest;
import com.springinaction.core.knights.SlayDragonQuest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
