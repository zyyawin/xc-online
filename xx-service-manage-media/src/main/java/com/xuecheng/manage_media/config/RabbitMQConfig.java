package com.xuecheng.manage_media.config;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Exchanger;

/**
 * @author ZhangYang
 *
 */

@Configuration
public class RabbitMQConfig {
    public static final String EX_MEDIA_PROCESSTASK="ex_media_processer";

    //视频处理路由
    @Value("${xc-service-manage-media.mq.routingkey-media-video}")
    public String routingkey_media_video;

    /**
     * 交换机配置
     * @return the exchange
     *
     */
    @Bean(EX_MEDIA_PROCESSTASK)
    public Exchange EX_MEDIA_VIDEOTASK(){
        return ExchangeBuilder.directExchange(EX_MEDIA_PROCESSTASK).durable(true).build();
    }

}
