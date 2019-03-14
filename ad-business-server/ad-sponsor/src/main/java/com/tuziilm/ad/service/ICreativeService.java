package com.tuziilm.ad.service;

import com.tuziilm.ad.vo.CreativeRequest;
import com.tuziilm.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
