package nl.hkstwk.spring6authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.HttpLogFormatter;
import org.zalando.logbook.Sink;
import org.zalando.logbook.json.JsonHttpLogFormatter;
import org.zalando.logbook.logstash.LogstashLogbackSink;

/**
 * Created by jt, Spring Framework Guru.
 */
@Configuration
public class LogbookConfig {

    @Bean
    public Sink LogbookLogStash(){
        HttpLogFormatter formatter = new JsonHttpLogFormatter();
        LogstashLogbackSink sink = new LogstashLogbackSink(formatter);
        return sink;
    }
}
