package com.tuziilm.ad.service;

import com.tuziilm.ad.exception.AdException;
import com.tuziilm.ad.vo.CreateUserRequest;
import com.tuziilm.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
