package com.ncu.service;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.ncu.pojo.CustomerCare;
import com.ncu.pojo.CustomerCondition;
import com.ncu.pojo.CustomerInfo;
import com.ncu.pojo.CustomerSource;
import com.ncu.pojo.CustomerType;
import com.ncu.pojo.EmailInfo;
import com.ncu.pojo.UserInfo;
import com.ncu.utils.PageBean;
import com.ncu.utils.Pie;
public interface ICustomerService {
/* *
 * 客户信息接口--CustomerInfoMapper
 * */
    //查询客户信息及其关联表的所有信息
	List<CustomerInfo> list();
    //根据查询内容和客户状态查找客户信息
	List<CustomerInfo> list(String queryContent, Integer queryType);
	//根据客户id查找客户信息
	CustomerInfo selectCustomerById(Integer customerId);
	//查询所有员工信息
	List<UserInfo> userList();
	//查询所有客户来源信息
	List<CustomerSource> sourceList();
	//查询所有客户状态信息
	List<CustomerCondition> conditionList();
	//查询所有客户类型信息
	List<CustomerType> typeList();
	//更新客户信息
	void updateCustomer(CustomerInfo c);
	//根据员工id查询员工信息
	UserInfo selectUserById(Integer userId);
	//根据客户来源id查询客户来源信息
	CustomerSource selectSourceById(Integer sourceId);
	//根据客户状态id查询客户状态信息
	CustomerCondition selectConditionById(Integer conditionId);
	//根据客户类型id查询客户类型信息
	CustomerType selectTypeById(Integer typeId);
	//根据客户id删除客户信息
	void deleteCustomerById(Integer customerId);
	//添加客户信息
	void addCustomer(CustomerInfo c);
	//根据客户id数组批量查询客户信息
	List<CustomerInfo> batchSelectCustomerById(Integer[] customerIds);
	//批量更新客户信息
	void batchUpdateCustomer(List<CustomerInfo> cList);
	//查询客户关怀信息及其关联表的所有信息
	List<CustomerCare> careList();
	//根据查询内容和客户关怀查找客户关怀信息
	List<CustomerCare> careList(String queryContent, Integer queryType);
	//根据客户关怀id查找客户关怀信息
	CustomerCare selectCustomerCareById(Integer careId);
	//更新客户关怀信息
	void updateCustomerCare(CustomerCare c);
	//添加客户关怀信息
	void addCustomerCare(CustomerCare c);
	//根据客户关怀id删除客户信息
	void deleteCustomerCareById(Integer careId);
	//根据客户类型查找客户类型信息
	List<CustomerType> typeList(String queryType);
	//根据客户分类id删除客户信息
	void deleteCustomerTypeById(Integer typeId);
	//添加客户类型信息
	void addCustomerType(CustomerType c);
	//根据客户状态查找客户来源信息
	List<CustomerCondition> conditionList(String queryState);
	//根据客户状态id删除客户状态信息
	void deleteCustomerConditionById(Integer conditionId);
	//添加客户状态信息
	void addCustomerCondition(CustomerCondition c);
	//添加客户来源信息
	void addCustomerSource(CustomerSource c);
	//根据客户来源id删除客户来源信息
	void deleteCustomerSourceById(Integer sourceId);
	//根据客户来源查找客户来源信息
	List<CustomerSource> sourceList(String querySource);
	//创建Excel对象,并将客户信息放入Excel对象中
	HSSFWorkbook getExcel();
	//将Excel文件中的信息插入数据库
	void importExcel(HSSFWorkbook workbook);
	//查询关怀客户相关信息接口,根据时间范围查询，以分页的形式返回信息
	PageBean<CustomerCare> selectCarePageBean(Integer bettweenTime, Integer turnPage);
    //查询联系客户相关信息接口,根据时间范围查询，以分页的形式返回信息
	PageBean<EmailInfo> selectEmailPageBean(Integer bettweenTime, Integer turnPage, Integer userId);
    //查询最近不同时间段内生日的用户信息接口，根据时间范围查询，以分页形式返回
	PageBean<CustomerInfo> selectCustInfoPageBean(Integer bettweenTime, Integer turnPage);
	//获取客户来源占比,并显示大饼形状的再报表上
	List<Pie> getPieData();
	//根据客户关怀id查找客户信息
	CustomerCare selectCustomerByCareId(Integer careId);
}
