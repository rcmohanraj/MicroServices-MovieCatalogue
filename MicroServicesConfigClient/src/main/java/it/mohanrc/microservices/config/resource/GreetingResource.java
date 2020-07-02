package it.mohanrc.microservices.config.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class GreetingResource {

    @Value("${my.greeting}")
    private String greetingMessage;

    @Value("my static message")
    private String staticMessage;

    @Value("${my.test : default}")
    private String defaultValue;

    @Value("${my.list}")
    private List<String> list;

    @Value("#{${my.map}}")
    private Map<String, String> map;

    @GetMapping("/greet")
    public String greeting() {
        return greetingMessage + staticMessage + list + defaultValue + map;
    }

}
