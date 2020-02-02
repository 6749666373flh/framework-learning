package com.github.yangguang19.dubbolearningpersonserviceprovider.service;

import com.github.yangguang19.entity.Person;
import com.github.yangguang19.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author yangguang
 * @Date 2020/1/31
 * @Description TODO    person service implement 02
 */

@Slf4j
@Service(version = "2.0.0")
@Component
public class PersonServiceImpl02 implements PersonService
{
    private AtomicInteger retryCount = new AtomicInteger(0);

    @Override
    public Person getPersonByPersonId(Long personId)
    {
//        log.info("consumer retry : ------------> " + retryCount.incrementAndGet() );
        log.info("current version is : --- >  2.0.0");
        try
        {
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e)
        {
        }
        return new Person().setPersonId(1L).setName("yangxiaoguang2").setAge(19);
    }
}