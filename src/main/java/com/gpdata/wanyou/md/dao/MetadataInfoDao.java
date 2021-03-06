package com.gpdata.wanyou.md.dao;

import com.gpdata.wanyou.md.entity.MetadataInfo;

import java.util.List;

/**
 * 3.2.2元数据基本信息
 *
 * @author chengchao
 */
public interface MetadataInfoDao {


    /**
     * 参数：metadataid元数据id（必填）
     * 成功：表metadata_info中指定metadataid的记录
     *
     * @param metadataid
     * @return
     */
    MetadataInfo getById(Integer metadataid);

    /**
     * 说明：在元数据基本信息表中新增记录。
     * 参数1：dialectid方言id（必填）
     * 参数2：metaname元数据标识（必填）
     * 参数3：caption标题（必填）
     * 参数4：ontologyid本体id
     * 参数5：fieldid字段id
     * 参数6：type类型
     * 参数7：unit数据单位
     * 参数8：autocodeid自动编码项id
     * 参数9：remark说明
     *
     * @param input
     * @return
     */
    MetadataInfo save(MetadataInfo input);

    /**
     * 说明：修改元数据信息
     * 参数1：metadataid元数据id（必填）
     * 参数2：dialectid方言id
     * 参数3：ontologyid本体id
     * 参数4：fieldid字段id
     * 参数5：metaname元数据标识
     * 参数6：caption元数据名称
     * 参数7：type类型
     * 参数8：unit数据单位
     * 参数9：autocodeid自动编码项id
     * 参数10：remark说明
     *
     * @param input
     * @return
     */
    MetadataInfo update(MetadataInfo input);

    /**
     * 说明：删除某个元数据
     * 参数：metadataid元数据id（必填）
     * 成功：删除元数据基本信息表中指定记录
     *
     * @param input
     */
    void delete(MetadataInfo input);

    /**
     * 说明：检索元数据信息
     * 参数1：caption标题
     * 参数2：dialectid方言id
     * 参数3：ontologyid本体id
     * 参数4：fieldid字段id
     * 参数5：metaname元数据标识
     *
     * @param input
     * @return
     */
    Integer queryTotal(MetadataInfo input);

    /**
     * 说明：检索元数据信息
     * 参数1：caption标题
     * 参数2：dialectid方言id
     * 参数3：ontologyid本体id
     * 参数4：fieldid字段id
     * 参数5：metaname元数据标识
     *
     * @param input
     * @return
     */
    List<MetadataInfo> queryRows(MetadataInfo input);


    /**
     * 3.2.6.2修改
     * 说明：修改元数据依赖关系
     * 参数1：metadataid元数据id（必填）
     * 参数2：depmetadataid依赖的元数据
     * 成功：”success”
     * 失败：[“error”:”错误原因”]
     *
     * @param info MetadataInfo
     * @return
     */
    MetadataInfo updateRelyon(MetadataInfo info);


    String getMetadataSynonyms(Integer metadataid);

    /**
     * 查找影响分析相关数据:
     * <p>
     * 查找数据库中 MetadataInfo 表的 depmetadataid 属性包含 metadataId 的数据
     *
     * @param metadataId
     * @return
     */
    List<MetadataInfo> getAffectMetadataInfoList(Integer metadataId);

    /**
     * 查找一个本体对象所直接关联的元数据对象的列表
     *
     * @param ontologyId
     * @return
     */
    List<MetadataInfo> getMetadataInfosByOntologyId(Integer ontologyId);
}
