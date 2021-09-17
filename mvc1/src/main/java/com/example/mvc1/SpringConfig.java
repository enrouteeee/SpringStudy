package com.example.mvc1;

import com.example.mvc1.aop.TimeTraceAop;
import com.example.mvc1.repository.JpaMemberRepository;
import com.example.mvc1.repository.MemberRepository;
import com.example.mvc1.repository.MemoryMemberRepository;
import com.example.mvc1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import java.sql.Time;

@Configuration
public class SpringConfig {


    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        return new JpaMemberRepository(em);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
}
