package com.ncu.controller;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.ncu.pojo.CustomerCare;
import com.ncu.pojo.CustomerCondition;
import com.ncu.pojo.CustomerInfo;
import com.ncu.pojo.CustomerSource;
import com.ncu.pojo.CustomerType;
import com.ncu.pojo.EmailInfo;
import com.ncu.pojo.UserInfo;
import com.ncu.service.ICustomerService;
import com.ncu.service.IMessageService;
import com.ncu.service.IUserService;
import com.ncu.utils.MailUtils;
import com.ncu.utils.PageBean;
import com.ncu.utils.Pie;
@Controller
@RequestMapping("customer")
public class CustomerController {
/* *
 * customer的控制层
 * */	
	@Autowired
	private ICustomerService cService;
	@Autowired
	private IUserService uService;
	@Autowired
	private IMessageService mService;
	/**
	 * 查询所有客户信息(带分页)
	 * @param m
	 * @param page 显示第几页客户信息
	 * @param differ 区别分页页面是cutomerlist1还是customerlist2(因为两个都在同一页面显示) 
	 *        cutomerlist1:differ=1;cutomerlist2:differ=2;   
	 * @return
	 */
	@RequestMapping("customerlist1")
	public String list1(Model m,int page,int differ){
		List<CustomerInfo> clist = cService.list();
		int total = clist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerInfo> clist2 = clist.subList(start, end);
		m.addAttribute("cs", clist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		m.addAttribute("differ",differ);
		return "customer/customer_list";
	}
	/**
	 * 按条件查询客户信息(不带分页)
	 * @param m
	 * @param queryContent 查询内容
	 * @param queryType 查询方式
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerlist2")
	public String list2(Model m,String queryContent,Integer queryType,int differ){
		List<CustomerInfo> clist = cService.list(queryContent,queryType);
		m.addAttribute("cs", clist);
		m.addAttribute("differ",differ);
		m.addAttribute("queryContent", queryContent);
		m.addAttribute("queryType", queryType);
		return "customer/customer_list";
	}
	/**
	 * 查询客户信息(带分页)
	 * @param m
	 * @param page 显示第几页客户状态
	 * @return
	 */
	@RequestMapping("customerDistributelist1")
	public String list3(Model m,int page){
		List<CustomerInfo> clist = cService.list();
		int total = clist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerInfo> clist2 = clist.subList(start, end);
		m.addAttribute("cs", clist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		return "customer/customer_distribute_list";
	}
	/**
	 * 给员工分配批量客户(显示所有客户,分配操作在下一步)
	 * @param m
	 * @param customerIds 员工ids数组
	 * @return
	 */
	@RequestMapping("customerDistributelist2")
	public String list4(Model m,Integer[] customerIds){
		if(customerIds==null){
			return "redirect:/customer/customerDistributelist1?page=1&differ=1";
		}
		List<CustomerInfo> cList=cService.batchSelectCustomerById(customerIds);
		List<UserInfo> uList=uService.list();
		m.addAttribute("cs", cList);
		m.addAttribute("userList", uList);
		return "customer/customer_distribute";
	}
	/**
	 * 给员工分配客户
	 * @param m
	 * @param customerIds 员工ids数组
	 * @return
	 */
	@RequestMapping("customerDistributelist3")
	public String list5(Model m,Integer customerId,Integer userId){
		CustomerInfo c=cService.selectCustomerById(customerId);
		c.setUserId(userId);
		cService.updateCustomer(c);
		return "redirect:/customer/customerlist1?page=1&differ=1";
	}
	/**
	 * 查询所有客户信息(带分页)
	 * @param m
	 * @param page 同上
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerCarelist1")
	public String list6(Model m,int page,int differ){
		List<CustomerCare> clist = cService.careList();
		int total = clist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerCare> clist2 = clist.subList(start, end);
		m.addAttribute("cc", clist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		m.addAttribute("differ",differ);
		return "customer/customer_care_list";
	}
	/**
	 * 按条件查询客户关怀信息(不带分页)
	 * @param m
	 * @param queryContent 同上
	 * @param queryType 同上
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerCarelist2")
	public String list7(Model m,String queryContent,Integer queryType,int differ){
		List<CustomerCare> clist = cService.careList(queryContent,queryType);
		m.addAttribute("cc", clist);
		m.addAttribute("differ",differ);
		m.addAttribute("queryContent", queryContent);
		m.addAttribute("queryType", queryType);
		return "customer/customer_care_list";
	}
	/**
	 * 查询所有客户类型信息(带分页)
	 * @param m
	 * @param page 同上
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerTypelist1")
	public String list8(Model m,int page,int differ){
		List<CustomerType> tlist = cService.typeList();
		int total = tlist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerType> tlist2 = tlist.subList(start, end);
		m.addAttribute("tList", tlist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		m.addAttribute("differ",differ);
		return "customer/customer_type_list";
	}
	/**
	 * 按条件查询客户分类信息(不带分页)
	 * @param m
	 * @param queryType 客户类型
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerTypelist2")
	public String list9(Model m,String queryType,int differ){
		List<CustomerType> tlist = cService.typeList(queryType);
		m.addAttribute("tList", tlist);
		m.addAttribute("differ",differ);
		m.addAttribute("queryType", queryType);
		return "customer/customer_type_list";
	}
	/**
	 * 查询所有客户状态信息(带分页)
	 * @param m
	 * @param page 同上
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerStatelist1")
	public String list10(Model m,int page,int differ){
		List<CustomerCondition> clist = cService.conditionList();
		int total = clist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerCondition> clist2 = clist.subList(start, end);
		m.addAttribute("cList", clist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		m.addAttribute("differ",differ);
		return "customer/customer_state_list";
	}
	/**
	 * 按条件查询客户状态信息(不带分页)
	 * @param m
	 * @param queryState 客户状态
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerStatelist2")
	public String list11(Model m,String queryState,int differ){
		List<CustomerCondition> clist = cService.conditionList(queryState);
		m.addAttribute("cList", clist);
		m.addAttribute("differ",differ);
		m.addAttribute("queryState", queryState);
		return "customer/customer_state_list";
	}
	/**
	 * 查询所有客户来源信息(带分页)
	 * @param m
	 * @param page 同上
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerSourcelist1")
	public String list12(Model m,int page,int differ){
		List<CustomerSource> slist = cService.sourceList();
		int total = slist.size();
		int size = 10;//每页10条记录
		int pageTotal = 0;
		if(total < size){
			pageTotal = 1;
		}else if(total%size == 0){
			pageTotal = total/size;
		}else{
			pageTotal = total/size + 1;
		}
		if(page < 1){
			page = 1;
		}else if(page > pageTotal){
			page = pageTotal;
		}
		int start = (page - 1)*size;
		int end = page*size;
		if(end>total){
			end = total;
		}
		List<CustomerSource> slist2 = slist.subList(start, end);
		m.addAttribute("sList", slist2);
		m.addAttribute("total",total);
		m.addAttribute("pageTotal",pageTotal);
		m.addAttribute("page",page);
		m.addAttribute("differ",differ);
		return "customer/customer_source_list";
	}
	/**
	 * 按条件查询客户来源信息(不带分页)
	 * @param m
	 * @param querySource 客户来源
	 * @param differ 同上
	 * @return
	 */
	@RequestMapping("customerSourcelist2")
	public String list13(Model m,String querySource,int differ){
		List<CustomerSource> slist = cService.sourceList(querySource);
		m.addAttribute("sList", slist);
		m.addAttribute("differ",differ);
		m.addAttribute("queryState", querySource);
		return "customer/customer_source_list";
	}
	/**
	 * 通过controller进入编辑(修改)客户信息
	 * @param m
	 * @param customerId 客户id
	 * @return
	 */
	@RequestMapping("customerUpdate1")
	public String update1(Model m,Integer customerId){
		CustomerInfo c=cService.selectCustomerById(customerId);
		List<UserInfo> userList=cService.userList();
		List<CustomerSource> sourceList=cService.sourceList();
		List<CustomerCondition> conditionList=cService.conditionList();
		List<CustomerType> typeList=cService.typeList();
		m.addAttribute("c", c);
		m.addAttribute("userList", userList);
		m.addAttribute("sourceList", sourceList);
		m.addAttribute("conditionList", conditionList);
		m.addAttribute("typeList", typeList);
		return "customer/customer_edit";
	}
	/**
	 * 修改客户信息
	 * @param m
	 * @param c 客户信息
	 * @return
	 */
	@RequestMapping("customerUpdate2")
	public String update2(Model m,CustomerInfo c){
		cService.updateCustomer(c);
		return "redirect:/customer/customerlist1?page=1&differ=1";//重定向,并且不加前后缀
	}
	/**
	 * 通过controller进入编辑(修改)客户关怀信息
	 * @param m
	 * @param careId 客户关怀id
	 * @return
	 */
	@RequestMapping("customerCareUpdate1")
	public String update3(Model m,Integer careId){
		CustomerCare c=cService.selectCustomerCareById(careId);
		List<CustomerInfo> cList=cService.list();
		m.addAttribute("cList", cList);
		m.addAttribute("care", c);
		return "customer/customer_care_edit";
	}
	/**
	 * 修改客户信息
	 * @param m
	 * @param c 客户关怀信息
	 * @return
	 */
	@RequestMapping("customerCareUpdate2")
	public String update4(Model m,CustomerCare c){
		cService.updateCustomerCare(c);
		return "redirect:/customer/customerCarelist1?page=1&differ=1";
	}
	/**
	 * 查询客户详情
	 * @param m
	 * @param customerId 客户id
	 * @return
	 */
	@RequestMapping("customerSelect")
	public String select1(Model m,Integer customerId){
		CustomerInfo c=cService.selectCustomerById(customerId);
		UserInfo user=cService.selectUserById(c.getUserId());
		CustomerSource source=cService.selectSourceById(c.getSourceId());
		CustomerCondition condition=cService.selectConditionById(c.getConditionId());
		CustomerType type=cService.selectTypeById(c.getTypeId());
		m.addAttribute("c", c);
		m.addAttribute("user", user);
		m.addAttribute("source", source);
		m.addAttribute("condition", condition);
		m.addAttribute("type", type);
		return "customer/customer_detail";
	}
	/**
	 * 删除客户信息
	 * @param m
	 * @param customerId 客户id
	 * @return
	 */
	@RequestMapping("customerDelete")
	public String delete1(Model m,Integer customerId){
		cService.deleteCustomerById(customerId);
		return "redirect:/customer/customerlist1?page=1&differ=1";//重定向,并且不加前后缀
	}
	/**
	 * 删除客户关怀信息
	 * @param m
	 * @param careId 客户关怀id
	 * @return
	 */
	@RequestMapping("customerCareDelete")
	public String delete2(Model m,Integer careId){
		cService.deleteCustomerCareById(careId);
		return "redirect:/customer/customerCarelist1?page=1&differ=1";
	}
	/**
	 * 删除客户类型信息
	 * @param m
	 * @param typeId 客户分类id
	 * @return
	 */
	@RequestMapping("customerTypeDelete")
	public String delete3(Model m,Integer typeId){
		cService.deleteCustomerTypeById(typeId);
		return "redirect:/customer/customerTypelist1?page=1&differ=1";
	}
	/**
	 * 删除客户状态信息
	 * @param m
	 * @param conditionId 客户状态id
	 * @return
	 */
	@RequestMapping("customerStateDelete")
	public String delete4(Model m,Integer conditionId){
		cService.deleteCustomerConditionById(conditionId);
		return "redirect:/customer/customerStatelist1?page=1&differ=1";
	}
	/**
	 * 删除客户来源信息
	 * @param m
	 * @param sourceId 客户来源id
	 * @return
	 */
	@RequestMapping("customerSourceDelete")
	public String delete5(Model m,Integer sourceId){
		cService.deleteCustomerSourceById(sourceId);
		return "redirect:/customer/customerSourcelist1?page=1&differ=1";
	}
	/**
	 * 进入添加页面,实际添加操作在下一步
	 * @param m
	 * @return
	 */
	@RequestMapping("customerAdd1")
	public String add1(Model m){
		List<UserInfo> userList=cService.userList();
		List<CustomerSource> sourceList=cService.sourceList();
		List<CustomerCondition> conditionList=cService.conditionList();
		List<CustomerType> typeList=cService.typeList();
		m.addAttribute("userList", userList);
		m.addAttribute("sourceList", sourceList);
		m.addAttribute("conditionList", conditionList);
		m.addAttribute("typeList", typeList);
		return "customer/customer_add";
	}
	/**
	 * 添加客户信息(实现添加)
	 * @param m
	 * @param c
	 * @return
	 */
	@RequestMapping("customerAdd2")
	public String add2(Model m,CustomerInfo c){
		cService.addCustomer(c);
		return "redirect:/customer/customerlist1?page=1&differ=1";
	}
	/**
	 * 进入添加页面,实际添加操作在下一步
	 * @param m
	 * @return
	 */
	@RequestMapping("customerCareAdd1")
	public String add3(Model m){
		List<CustomerInfo> cList=cService.list();
		m.addAttribute("cList", cList);
		return "customer/customer_care_add";
	}
	/**
	 * 添加客户关怀信息(实现添加)
	 * @param m
	 * @param c
	 * @return
	 */
	@RequestMapping("customerCareAdd2")
	public String add4(Model m,CustomerCare c){
		cService.addCustomerCare(c);
		return "redirect:/customer/customerCarelist1?page=1&differ=1";
	}
	/**
	 * 添加客户类型信息(实现添加)
	 * @param m
	 * @param c
	 * @return
	 */
	@RequestMapping("customerTypeAdd")
	public String add5(Model m,CustomerType c){
		cService.addCustomerType(c);
		return "redirect:/customer/customerTypelist1?page=1&differ=1";
	}
	/**
	 * 添加客户状态信息(实现添加)
	 * @param m
	 * @param c
	 * @return
	 */
	@RequestMapping("customerStateAdd")
	public String add6(Model m,CustomerCondition c){
		cService.addCustomerCondition(c);
		return "redirect:/customer/customerStatelist1?page=1&differ=1";
	}
	/**
	 * 添加客户来源信息(实现添加)
	 * @param m
	 * @param c
	 * @return
	 */
	@RequestMapping("customerSourceAdd")
	public String add6(Model m,CustomerSource c){
		cService.addCustomerSource(c);
		return "redirect:/customer/customerSourcelist1?page=1&differ=1";
	}
	/**
	 * 导出客户列表信息至Excel文件中
	 * @param response 用到输出流,所以是response
	 * @throws Exception 
	 */
	@RequestMapping("customerExportExcel")
	public void exportExcel(HttpServletResponse response) throws Exception{
		//1.创建一个输出流
		ServletOutputStream outputStream=response.getOutputStream();
		//2.创建Excel对象
		HSSFWorkbook workbook=cService.getExcel();
		//3.设置生成文件相应头属性(这里生成文件名写死1.xlsx)
		response.setHeader("content-disposition", "attachment;filename=1.xlsx");
		workbook.write(outputStream);
	}
	/**
	 * 导入Excel文件格式的客户列表信息
	 * @param userExcelFile 导入文件名
	 * @throws Exception
	 */
	@RequestMapping("customerImportExcel")
	public String importExcel(MultipartFile userExcelFile) throws Exception{
		//1.读文件中的客户数据
		HSSFWorkbook workbook=new HSSFWorkbook(userExcelFile.getInputStream());//放入一个文件流
		//2.插入到客户表
		cService.importExcel(workbook);
		return "redirect:/customer/customerlist1?page=1&differ=1";
	}
	/**
	 * 用来查看在不同时间段内对顾客的关怀
	 * @param m 前端显示对象
	 * @param bettweenTime 前端传过来的查看多少天内的关心信息
	 * @return
	 */
	@RequestMapping("findCustomerCare")
	private String findCustomerCare(Model m,Integer bettweenTime,Integer turnPage) {
		PageBean<CustomerCare> carePageBean=cService.selectCarePageBean(bettweenTime,turnPage);
		m.addAttribute("carePageBean", carePageBean);
		m.addAttribute("bettweenTime1", bettweenTime);
		return "frame/center";
	}
	/**
	 * 用于查看不同时间段内该登陆对象应联系的客户
	 * @param m
	 * @param bettweenTime  查看一定联系信息的时间段
	 * @param turnPage 分页显示的页数
	 * @param userId 该登录用户的用户ID
	 * @return
	 */
	@RequestMapping("findEmailInfo")
	private String findEmailInfo(Model m,Integer bettweenTime,Integer turnPage,Integer userId) {
		PageBean<EmailInfo> emailPageBean=cService.selectEmailPageBean(bettweenTime,turnPage,userId);
		m.addAttribute("emailPageBean", emailPageBean);
		m.addAttribute("bettweenTime2", bettweenTime);
		return "frame/center";
	}
	/**
	 * 用于根据时间段的长短，查询出在这时间段内生日的 顾客相关信息
	 * @param m
	 * @param bettweenTime  查看顾客生日的时间段 间隔
	 * @param turnPage  分页显示的页数
	 * @return
	 */
	@RequestMapping("findCustomerBirthday")
	private String finCustomerBirthday(Model m,Integer bettweenTime,Integer turnPage) {
		PageBean<CustomerInfo> custinfoPageBean=cService.selectCustInfoPageBean(bettweenTime,turnPage);
		m.addAttribute("custinfoPageBean", custinfoPageBean);
		m.addAttribute("bettweenTime3", bettweenTime);
		return "frame/center";
	}
	@ResponseBody
	/* *
	 * @ResponseBody,注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
	 * 写入到response对象的body区，通常用来返回JSON数据或者是XML
	 * */
	@RequestMapping("pieData")
	public List<Pie> getPieData1(){
		//虽然只有一个大饼形状报表，但是为了对应前端js对象格式,创建为集合类型
		List<Pie> pieData=cService.getPieData();
		return pieData;
	}
	/**
	 * 发送邮箱
	 * @param m
	 * @param emailTitle 主题
	 * @param emailContent 内容
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("sendEmail")
	public String sendEmail(Model m,String emailTitle,String emailContent) throws Exception{
		//选择一个发送邮箱测试
		MailUtils.sendMail("15797768089@163.com", emailTitle+","+emailContent);
		m.addAttribute("info", "发送成功");
	    return "plug/sendEmail";
	}
	/**
	 * 进入发送短信页面,发送短信在下一步
	 * @param m
	 * @param careId 客户关怀id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("sendMessage1")
	public String sendMessage1(Model m,Integer careId) throws Exception{
		CustomerCare cc=cService.selectCustomerByCareId(careId);
		String phone=cc.getCs().getCustomerMobile();
		m.addAttribute("phone", phone);
	    return "plug/sendMessage";
	}
	/**
	 * 发送短信
	 * @param m
	 * @param phone 手机号
	 * @param messageContent 发送内容
	 * @return
	 */
	@RequestMapping("sendMessage2")
	public String sendMessage2(Model m,String phone,String messageContent) {
		mService.send(phone, new String[]{messageContent,"5"});//因为是测试只开放了几个测试号码和测试模板
		m.addAttribute("info", "发送成功");
		return "plug/sendMessage";
	}
}
