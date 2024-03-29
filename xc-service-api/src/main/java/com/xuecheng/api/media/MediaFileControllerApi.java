package com.xuecheng.api.media;

import com.xuecheng.framework.domain.media.MediaFile;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "媒资文件管理",description ="媒资文件管理接口" ,tags={"媒资文件管理接口"})
public interface MediaFileControllerApi {
    @ApiOperation("我的媒资文件查询列表")
    public QueryResponseResult<MediaFile> findList(int page, int size, QueryResponseResult queryResponseResult);

}
