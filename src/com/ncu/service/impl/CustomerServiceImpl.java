package com.ncu.service.impl;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.mapper.CustomerCareMapper;
import com.ncu.mapper.CustomerConditionMapper;
import com.ncu.mapper.CustomerInfoMapper;
import com.ncu.mapper.CustomerSourceMapper;
import com.ncu.mapper.CustomerTypeMapper;
import com.ncu.mapper.EmailInfoMapper;
import com.ncu.mapper.UserInfoMapper;
import com.ncu.pojo.CustomerCare;
import com.ncu.pojo.CustomerCondition;
import com.ncu.pojo.CustomerConditionExample;
import com.ncu.pojo.CustomerInfo;
import com.ncu.pojo.CustomerInfoExample;
import com.ncu.pojo.CustomerSource;
import com.ncu.pojo.CustomerSourceExample;
import com.ncu.pojo.CustomerType;
import com.ncu.pojo.CustomerTypeExample;
import com.ncu.pojo.EmailInfo;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserInfoExample;
import com.ncu.service.ICustomerService;
import com.ncu.utils.PageBean;
import com.ncu.utils.Partment;
import com.ncu.utils.Pie;
@SuppressWarnings("all")
@Service
public class CustomerServiceImpl implements ICustomerService {
/* *
 * customer的service层接口实现类
 * */
	@Autowired
	private CustomerInfoMapper cm;
	@Autowired
	private CustomerCareMapper ccm;
	@Autowired
	private CustomerTypeMapper ctm;
	@Autowired
	private CustomerConditionMapper conditionm;
	@Autowired
	private CustomerSourceMapper csm;
	@Autowired
	private CustomerCareMapper cCareMapper;
	@Autowired
	private EmailInfoMapper eInfoMapper;
	@Autowired
	private SqlSessionTemplate sqlSession;
	CustomerInfoExample cExample=new CustomerInfoExample();
	public List<CustomerInfo> list() {
		return cm.selectCustomerAndOther();
	}
	public List<CustomerInfo> list(String queryContent, Integer queryType) {
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent", queryContent);
		queryMap.put("queryType", queryType);
		return cm.selectCustomerByCondition(queryMap);
	}
	public CustomerInfo selectCustomerById(Integer customerId) {
		return cm.selectByPrimaryKey(customerId);
	}
	public List<UserInfo> userList() {
		UserInfoMapper um=sqlSession.getMapper(UserInfoMapper.class);
		UserInfoExample uExample=new UserInfoExample();
		uExample.createCriteria().andUserIdIsNotNull();
		return um.selectByExample(uExample);
	}
	public List<CustomerSource> sourceList() {
		CustomerSourceMapper csm=sqlSession.getMapper(CustomerSourceMapper.class);
		CustomerSourceExample csExample=new CustomerSourceExample();
		csExample.createCriteria().andSourceIdIsNotNull();
		return csm.selectByExample(csExample);
	}
	public List<CustomerCondition> conditionList() {
		CustomerConditionMapper ccm=sqlSession.getMapper(CustomerConditionMapper.class);
		CustomerConditionExample ccExample=new CustomerConditionExample();
		ccExample.createCriteria().andConditionIdIsNotNull();
		return ccm.selectByExample(ccExample);
	}
	public List<CustomerType> typeList() {
		CustomerTypeMapper ctm=sqlSession.getMapper(CustomerTypeMapper.class);
		CustomerTypeExample ctExample=new CustomerTypeExample();
		ctExample.createCriteria().andTypeIdIsNotNull();
		return ctm.selectByExample(ctExample);
	}
	public void updateCustomer(CustomerInfo c) {
		c.setCustomerChangtime(new Date());//设置客户信息修改时间
		cm.updateByPrimaryKeySelective(c);
	}
	public UserInfo selectUserById(Integer userId) {
		UserInfoMapper um=sqlSession.getMapper(UserInfoMapper.class);
		return um.selectByPrimaryKey(userId);
	}
	public CustomerSource selectSourceById(Integer sourceId) {
		CustomerSourceMapper csm=sqlSession.getMapper(CustomerSourceMapper.class);
		return csm.selectByPrimaryKey(sourceId);
	}
	public CustomerCondition selectConditionById(Integer conditionId) {
		CustomerConditionMapper ccm=sqlSession.getMapper(CustomerConditionMapper.class);
		return ccm.selectByPrimaryKey(conditionId);
	}
	public CustomerType selectTypeById(Integer typeId) {
		CustomerTypeMapper ctm=sqlSession.getMapper(CustomerTypeMapper.class);
		return ctm.selectByPrimaryKey(typeId);
	}
	public void deleteCustomerById(Integer customerId) {
		cm.deleteByPrimaryKey(customerId);
	}
	public void addCustomer(CustomerInfo c) {
		c.setCustomerAddtime(new Date());//设置客户添加时间
		cm.insert(c);
	}
	public List<CustomerInfo> batchSelectCustomerById(Integer[] customerIds) {
		List<CustomerInfo> cList = new ArrayList<CustomerInfo>();
		for(int i=0;i<customerIds.length;i++){
			CustomerInfo c=cm.selectByPrimaryKey(customerIds[i]);
			cList.add(c);
		}
		return cList;
	}
	public void batchUpdateCustomer(List<CustomerInfo> cList) {
		for(CustomerInfo c:cList){
			c.setCustomerChangtime(new Date());//设置客户信息修改时间
			cm.updateByPrimaryKeySelective(c);
		}
	}
	public List<CustomerCare> careList() {
		return ccm.selectCustomerCareAndOther();
	}
	public List<CustomerCare> careList(String queryContent, Integer queryType) {
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent", queryContent);
		queryMap.put("queryType", queryType);
		return ccm.selectCustomerCareByCondition(queryMap);
	}
	public CustomerCare selectCustomerCareById(Integer careId) {
		return ccm.selectByPrimaryKey(careId);
	}
	public void addCustomerCare(CustomerCare c) {
		ccm.insert(c);
	}
	public void updateCustomerCare(CustomerCare c) {
		ccm.updateByPrimaryKeySelective(c);
	}
	public void deleteCustomerCareById(Integer careId) {
		ccm.deleteByPrimaryKey(careId);
	}
	public List<CustomerType> typeList(String queryType) {
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryType", queryType);
		return ctm.selectCustomerTypeByCondition(queryMap);
	}
	public void deleteCustomerTypeById(Integer typeId) {
		ctm.deleteByPrimaryKey(typeId);
	}
	public void addCustomerType(CustomerType c) {
		ctm.insert(c);
	}
	public List<CustomerCondition> conditionList(String queryState) {
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryState", queryState);
		return conditionm.selectCustomerConditionByCondition(queryMap);
	}
	public void deleteCustomerConditionById(Integer conditionId) {
		conditionm.deleteByPrimaryKey(conditionId);
	}
	public void addCustomerCondition(CustomerCondition c) {
		conditionm.insert(c);
	}
	public void addCustomerSource(CustomerSource c) {
		csm.insert(c);
	}
	public void deleteCustomerSourceById(Integer sourceId) {
		csm.deleteByPrimaryKey(sourceId);
	}
	public List<CustomerSource> sourceList(String querySource) {
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("querySource", querySource);
		return csm.selectCustomerSourceByCondition(queryMap);
	}
	public HSSFWorkbook getExcel() {
		//1.创建一个Excel对象
		HSSFWorkbook workbook=new HSSFWorkbook();
		//2.创建一个sheet(这里一个sheet能装下客户信息)
	    HSSFSheet sheet=workbook.createSheet("工作簿1");
	    //3.获得数据
		List<CustomerInfo> cList=cm.selectByExample(null);//条件为null,查询所有客户信息
		//4.动态组织workbook数据(目前字段信息格式写死)
		//创建一行表头
		HSSFRow rowHeader=sheet.createRow(0);//默认从第0行开始
		rowHeader.createCell((short) 0).setCellValue("客户id");
		rowHeader.createCell((short) 1).setCellValue("客户姓名");
		rowHeader.createCell((short) 2).setCellValue("客户性别");
		rowHeader.createCell((short) 3).setCellValue("客户手机号");
		rowHeader.createCell((short) 4).setCellValue("客户QQ");
		rowHeader.createCell((short) 5).setCellValue("客户地址");
		rowHeader.createCell((short) 6).setCellValue("客户邮箱");
		rowHeader.createCell((short) 7).setCellValue("客户备注");
		rowHeader.createCell((short) 8).setCellValue("客户工作");
		rowHeader.createCell((short) 9).setCellValue("客户博客");
		rowHeader.createCell((short) 10).setCellValue("客户电话");
		rowHeader.createCell((short) 11).setCellValue("客户MSN");
		rowHeader.createCell((short) 12).setCellValue("客户生日");
		rowHeader.createCell((short) 13).setCellValue("客户添加时间");
		rowHeader.createCell((short) 14).setCellValue("客户添加人员姓名");
		rowHeader.createCell((short) 15).setCellValue("客户修改时间");
		rowHeader.createCell((short) 16).setCellValue("客户修改人员姓名");
		rowHeader.createCell((short) 17).setCellValue("客户公司");
		rowHeader.createCell((short) 18).setCellValue("客户是否被使用");
		rowHeader.createCell((short) 19).setCellValue("客户状态id");
		rowHeader.createCell((short) 20).setCellValue("客户来源id");
		rowHeader.createCell((short) 21).setCellValue("员工id");
		rowHeader.createCell((short) 22).setCellValue("客户类型id");
		//表主体
		for (int i = 0; i <cList.size(); i++) {
			HSSFRow rowBody=sheet.createRow(i+1);//第一行row用来字段标题
			CustomerInfo c=cList.get(i);
			rowBody.createCell((short) 0).setCellValue(c.getCustomerId());
			rowBody.createCell((short) 1).setCellValue(c.getCustomerName());
			rowBody.createCell((short) 2).setCellValue(c.getCustomerSex());
			rowBody.createCell((short) 3).setCellValue(c.getCustomerMobile());
			rowBody.createCell((short) 4).setCellValue(c.getCustomerQq());
			rowBody.createCell((short) 5).setCellValue(c.getCustomerAddress());
			rowBody.createCell((short) 6).setCellValue(c.getCustomerEmail());
			rowBody.createCell((short) 7).setCellValue(c.getCustomerRemark());
			rowBody.createCell((short) 8).setCellValue(c.getCustomerJob());
			rowBody.createCell((short) 9).setCellValue(c.getCustomerBlog());
			rowBody.createCell((short) 10).setCellValue(c.getCustomerTel());
			rowBody.createCell((short) 11).setCellValue(c.getCustomerMsn());
			rowBody.createCell((short) 12).setCellValue(c.getBirthDay());
			rowBody.createCell((short) 13).setCellValue(c.getCustomerAddtime());
			rowBody.createCell((short) 14).setCellValue(c.getCustomerAddman());
			rowBody.createCell((short) 15).setCellValue(c.getCustomerChangtime());
			rowBody.createCell((short) 16).setCellValue(c.getChangeMan());
			rowBody.createCell((short) 17).setCellValue(c.getCustomerCompany());
			rowBody.createCell((short) 18).setCellValue(c.getIsUsed());
			rowBody.createCell((short) 19).setCellValue(c.getConditionId());
			rowBody.createCell((short) 20).setCellValue(c.getSourceId());
			rowBody.createCell((short) 21).setCellValue(c.getUserId());
			rowBody.createCell((short) 22).setCellValue(c.getTypeId());
		}
		return workbook;
	}
	public void importExcel(HSSFWorkbook workbook) {
		HSSFSheet sheet=workbook.getSheetAt(0);//假设一个工作簿够用
		List<CustomerInfo> cList=new ArrayList<CustomerInfo>();
		//遍历excel文件中的数据组织到JavaBean中
		for (int i = 1; i < sheet.getLastRowNum(); i++) {//第一行是表头,字段描述信息
			HSSFRow row=sheet.getRow(i);
			CustomerInfo c=new CustomerInfo();
			//不使用excel文件中的单元格,自动生成,所以从1开始设置
			c.setCustomerName(row.getCell((short) 1).getStringCellValue());
			c.setCustomerSex(row.getCell((short) 2).getStringCellValue());
			c.setCustomerMobile(row.getCell((short) 3).getStringCellValue());
			c.setCustomerQq(row.getCell((short) 4).getStringCellValue());
			c.setCustomerAddress(row.getCell((short) 5).getStringCellValue());
			c.setCustomerEmail(row.getCell((short) 6).getStringCellValue());
			c.setCustomerRemark(row.getCell((short) 7).getStringCellValue());
			c.setCustomerJob(row.getCell((short) 8).getStringCellValue());
			c.setCustomerBlog(row.getCell((short) 9).getStringCellValue());
			c.setCustomerTel(row.getCell((short) 10).getStringCellValue());
			c.setCustomerMsn(row.getCell((short) 11).getStringCellValue());
			c.setBirthDay(row.getCell((short) 12).getDateCellValue());
			c.setCustomerAddtime(row.getCell((short) 13).getDateCellValue());
			c.setCustomerAddman(row.getCell((short) 14).getStringCellValue());
			c.setCustomerChangtime(row.getCell((short) 15).getDateCellValue());
			c.setChangeMan(row.getCell((short) 16).getStringCellValue());
			c.setCustomerCompany(row.getCell((short) 17).getStringCellValue());
			c.setIsUsed(row.getCell((short) 18).getStringCellValue());
			c.setConditionId((int) row.getCell((short) 19).getNumericCellValue());
			c.setSourceId((int) row.getCell((short) 20).getNumericCellValue());
			c.setUserId((int) row.getCell((short) 21).getNumericCellValue());
			c.setTypeId((int) row.getCell((short) 22).getNumericCellValue());
			cm.insert(c);
		}
	}
	
	@Override
	public PageBean<CustomerCare> selectCarePageBean(Integer bettweenTime,Integer turnPage) {
		 HashMap<Object, Object> hashmap=new HashMap<>();
		 Integer TotalCount;
		 List<CustomerCare> cCareList=null;		 
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 try {
			 //得到今天的日期
			 Date today=sdf.parse(sdf.format(new Date()));
			 //得到加上相应天数的日期
	         Calendar ca=Calendar.getInstance();
	         ca.add(Calendar.DATE, bettweenTime);//加上相应的天数
	         Date careTime=ca.getTime();
	         hashmap.put("today", today);
	         hashmap.put("careTime", careTime);	         
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 //获得符合条件的信息的数量
		 TotalCount=cCareMapper.countByCondition(hashmap);
		//用于存放分页信息和符合条件的相关信息的对象
         PageBean<CustomerCare> customercarePB=new PageBean<CustomerCare>(TotalCount,turnPage);
         hashmap.put("startPos",customercarePB.getStartPos());
         hashmap.put("pageSize",customercarePB.getPageSize());
         
         cCareList=cCareMapper.selectByCareTime(hashmap);
         customercarePB.setDataList(cCareList);
		return customercarePB;
	}
	@Override
	public PageBean<EmailInfo> selectEmailPageBean(Integer bettweenTime, Integer turnPage, Integer userId) {
		HashMap<Object, Object> hashmap=new HashMap<>();
		Integer TotalCount;
		List<EmailInfo> emailInfoList=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			//得到今天的日期
			Date today=sdf.parse(sdf.format(new Date()));
			//得到时间段最大的日期
			Calendar ca=Calendar.getInstance();
			ca.add(Calendar.DATE, bettweenTime);
			Date emailTime=ca.getTime();
			
			hashmap.put("today", today);
			hashmap.put("emailTime", emailTime);
			hashmap.put("userId", userId);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//获得符合条件的信息的数量
		TotalCount=eInfoMapper.countByCondition(hashmap);
		//用于存放分页信息和符合条件的相关信息的对象
		PageBean<EmailInfo> emailinfoPB=new PageBean<EmailInfo>(TotalCount,turnPage);
		hashmap.put("startPos",emailinfoPB.getStartPos());
        hashmap.put("pageSize",emailinfoPB.getPageSize());
		emailInfoList=eInfoMapper.selectByEmailTime(hashmap);
		emailinfoPB.setDataList(emailInfoList);
		return emailinfoPB;
	}
	public PageBean<CustomerInfo> selectCustInfoPageBean(Integer bettweenTime, Integer turnPage) {
		HashMap<Object, Object> hashmap=new HashMap<>();
		hashmap.put("bettweenTime", bettweenTime);
		//获得符合条件的信息的数量
		Integer TotalCount=cm.countByBirthday(hashmap);
		//用于存放分页信息和符合条件的相关信息的对象
		PageBean<CustomerInfo> customerinfoPB=new PageBean<CustomerInfo>(TotalCount,turnPage);
		hashmap.put("startPos",customerinfoPB.getStartPos());
        hashmap.put("pageSize",customerinfoPB.getPageSize());
        List<CustomerInfo> cInfoList=cm.selectCustomerInfoByBirthday(hashmap);
        customerinfoPB.setDataList(cInfoList);
		return customerinfoPB;
	}
	public List<Pie> getPieData() {
		//装饼的集合
		List<Pie> pieData=new ArrayList<Pie>();
		//装饼中一块的集合
		List<Partment> partmentData=cm.getPartment();
		pieData.add(new Pie("Share",partmentData));//大饼基本信息见js文件
		return pieData;
	}
	public CustomerCare selectCustomerByCareId(Integer careId) {
		List<CustomerCare> cList=ccm.selectCustomerCareAndOther();
		CustomerCare care=null;
		for(CustomerCare c:cList){
			if(c.getCareId()==careId){
				care=c;
			}
		}
		return care;
	}
}
