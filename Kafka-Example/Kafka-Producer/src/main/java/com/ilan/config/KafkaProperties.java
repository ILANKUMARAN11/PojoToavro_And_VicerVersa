package com.ilan.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(-1)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaProperties {

    @Value("${kafka.consumer.bootstrap-servers}")
    private String consumerBootstrapServers;

    @Value("${kafka.simple.topic-name}")
    private String simpleTopicName;

    @Value("${kafka.simple.group-id}")
    private String simpleGroupId;

    @Value("${kafka.employee.topic-name}")
    private String employeeTopicName;

    @Value("${kafka.employee.group-id}")
    private String employeeGroupId;

}
