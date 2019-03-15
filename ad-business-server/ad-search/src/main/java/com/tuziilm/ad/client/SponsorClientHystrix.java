package com.tuziilm.ad.client;

import com.tuziilm.ad.client.vo.AdPlan;
import com.tuziilm.ad.client.vo.AdPlanGetRequest;
import com.tuziilm.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Qinyi.
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
