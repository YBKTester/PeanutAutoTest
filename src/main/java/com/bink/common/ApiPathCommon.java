package com.bink.common;

/**
 * 接口地址常量
 *
 * @author Bink
 * @date 2020/6/18
 */
public class ApiPathCommon {
    /**
     * 获取当前用户信息接口地址
     */
    public static final String GET_CURR_USER_INFO = "/getCurrUserInfo";
    /**
     * 查询收费门架信息
     */
    public static final String GET_GANTRY_INFO_LIST = "tbGantry/getGantryInfoList";
    /**
     * 查询省份列表
     */
    public static final String GET_PROVINCE = "/sysOrganization/getProvince";
    /**
     * 获取下载门架信息文件
     */
    public static final String DOWNLOAD_FILE = "tbGantry/downloadFile";
    /**
     * 获取收费站信息接口地址
     */
    public static final String GET_TOLL_STATION_LIST = "tollStation/getTollStationList";
    /**
     * 获取收费单元信息接口地址
     */
    public static final String GET_VERTICAL_SECTION_LIST_BY_PAGE = "verticalSection/getVerticalSectionListByPage";
    /**
     * 获取全网计算模块接口地址
     */
    public static final String GET_GLOBAL_MODULE_LIST_BY_PAGE = "globalModule/getGlobalModuleListByPage";
    /**
     * 获取省界连通性单元信息接口地址
     */
    public static final String GET_PAGE_LIST = "provinceBorderInfo/getPageList";


}
