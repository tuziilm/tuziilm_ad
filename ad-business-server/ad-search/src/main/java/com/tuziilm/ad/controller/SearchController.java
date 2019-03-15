package com.tuziilm.ad.controller;

import com.alibaba.fastjson.JSON;
import com.tuziilm.ad.annotation.IgnoreResponseAdvice;
import com.tuziilm.ad.client.SponsorClient;
import com.tuziilm.ad.client.vo.AdPlan;
import com.tuziilm.ad.client.vo.AdPlanGetRequest;
import com.tuziilm.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: <a href="tuziilm@gmail.com">tuziilm</a>
 * @Date 2019/3/15
 **/
@Slf4j
@RestController
public class SearchController {

    private final RestTemplate restTemplate;
    private final SponsorClient sponsorClient;

    @Autowired
    public SearchController(RestTemplate restTemplate,SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("getAdPlanSByRebbon")
    public CommonResponse<List<AdPlan>> getAdPlansByRebbon(
            @RequestBody AdPlanGetRequest request
            ){
        log.info("ad-search: getAdPlansByRebbon -> {}", JSON.toJSONString(request));
        return restTemplate.postForEntity(
                "http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan",
                request,
                CommonResponse.class
        ).getBody();
    }

    @IgnoreResponseAdvice
    @PostMapping("getAdPlansByFeign")
    public CommonResponse<List<AdPlan>> getAdPlansByFeign(
            @RequestBody AdPlanGetRequest request
    ){
        log.info("ad-search: getAdPlansByFeign -> {}", JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);
    }
}
