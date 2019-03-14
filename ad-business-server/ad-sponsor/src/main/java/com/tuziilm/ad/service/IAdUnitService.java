package com.tuziilm.ad.service;

import com.tuziilm.ad.exception.AdException;
import com.tuziilm.ad.vo.AdUnitDistrictRequest;
import com.tuziilm.ad.vo.AdUnitDistrictResponse;
import com.tuziilm.ad.vo.AdUnitItRequest;
import com.tuziilm.ad.vo.AdUnitItResponse;
import com.tuziilm.ad.vo.AdUnitKeywordRequest;
import com.tuziilm.ad.vo.AdUnitKeywordResponse;
import com.tuziilm.ad.vo.AdUnitRequest;
import com.tuziilm.ad.vo.AdUnitResponse;
import com.tuziilm.ad.vo.CreativeUnitRequest;
import com.tuziilm.ad.vo.CreativeUnitResponse;

/**
 * Created by Qinyi.
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
