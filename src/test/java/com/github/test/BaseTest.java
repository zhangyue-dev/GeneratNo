package com.github.test;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SegmentService;
import org.github.LeafdemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

@SpringBootTest(classes = LeafdemoApplication.class)
@RunWith(SpringRunner.class)
public class BaseTest {

    @Autowired
    private SegmentService segmentService;

    @Test
    public void idInit() {
        System.err.println("id init start ...");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 5000; i++) {
            Result result = segmentService.getId("test_tag");
            System.err.println(result.toString());
        }
        stopWatch.stop();
        System.err.println(String.format("init process ms: %s", stopWatch.getTotalTimeMillis()));
    }
}
