package org.andy.service;

import java.util.List;

import org.andy.entity.UserInfo;
import org.andy.service.utils.ResultComm;

public interface UserInfoService {
	// ͨ��Id��ѯUserInfo  
    UserInfo getById(Integer id);  
  
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();  
  
    /**
     * 保存
     * @param userInfo
     * @return
     */
    Integer save(UserInfo userInfo); 
    
    /**
     * 删除
     * @param id
     * @return
     */
    Integer delete(Integer id);
    
    /**
     * 批量保存
     * @param users
     * @return
     */
    int[] batchSave(List<UserInfo> users);
    
    /**
     * 批量删除
     * @param id
     * @return
     */
    int[] batchDelete(List<Integer> id);
    
    /**
     * 根据id更新用户信息
     * @param userInfo
     * @return
     */
    ResultComm updateById(UserInfo userInfo);
}
