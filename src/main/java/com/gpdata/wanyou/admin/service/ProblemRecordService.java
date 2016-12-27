package com.gpdata.wanyou.admin.service;

import java.util.Map;

/**
 * Created by ligang on 2016/12/10.
 */
public interface ProblemRecordService {
    /**
     * 获取问题记录列表
     *
     * @param input
     * @param limit
     * @param offset
     * @return ProblemRecordList
     */
    Map<String, Object> getProblemRecordList(String input, Integer limit, Integer offset);
}
