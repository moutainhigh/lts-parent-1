package com.github.ltsopensource.admin.access.face;

import com.github.ltsopensource.admin.access.domain.Account;
import com.github.ltsopensource.admin.request.AccountReq;

import java.util.List;

/**
 * 帐户表查询接口
 * @author: Owen Jia
 * @time: 2019/3/19 13:41
 */
public interface BackendAccountAccess {

    void insert(List<Account> accounts);

    Account selectOne(AccountReq request);

    Long count(AccountReq request);

    void delete(AccountReq request);
}