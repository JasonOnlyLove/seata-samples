package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */
@FeignClient(name = "user-service", url = "127.0.0.1:8083")
public interface UserFeignClient {

    @GetMapping("/validAccountData")
    Boolean validAccountData(@RequestParam("userId") String userId);
}
