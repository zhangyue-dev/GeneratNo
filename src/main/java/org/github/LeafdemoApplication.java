package org.github;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//EnableLeafServer 开启leafserver
@SpringBootApplication
@EnableLeafServer
public class LeafdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafdemoApplication.class, args);
    }
}