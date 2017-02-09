package com.activiti.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;

import com.activiti.demo.dao.po.User;
import com.activiti.demo.serv.ActivitiDemoServ;
import com.website.extend.struts.action.BaseAction;

/**
 * 该java的描述信息
 * 
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-9 上午9:44:21
 * @category com.activiti.demo.action
 * @copyright
 */
@SuppressWarnings("serial")
public class ActivitiDemoAction extends BaseAction {

	private static Logger log = Logger.getLogger(ActivitiDemoAction.class);
	private ActivitiDemoServ serv;
	private User user;
	private List<User> list;
	private ProcessEngine processEngine;

	public String form() {
		log.info("[form]");
		return "form";
	}

	public String list() {
		log.info("[list]");
		list = serv.findUsers(user, (getPage() - 1) * getRows(), getRows(),
				getSort(), getOrder());
		log.info("[list]"+list);
		return "list";
	}
	
	/**
	 * 供JS组件取值
	 * @return
	 */
	public String listForJson(){
		log.info("[listForJson]");
		list = serv.findUsers(user, (getPage() - 1) * getRows(), getRows(),
				getSort(), getOrder());
		super.data(serv.countUsers(user), list);
		log.info("[listForJson]"+getAjax());
//		Map<String, Object> variables = new HashMap<String, Object>();
//		variables.put("employeeName", "Kermit");
//		variables.put("numberOfDays", new Integer(4));
//		variables.put("vacationMotivation", "I'm really tired!");
//		RuntimeService runtimeService = processEngine.getRuntimeService();
//		ProcessInstance processInstance =
//		runtimeService.startProcessInstanceByKey("vacationRequest",
//		variables);
		log.info("[processEngine]"+processEngine);
		return "ajax";
	}

	public ActivitiDemoServ getServ() {
		return serv;
	}

	public void setServ(ActivitiDemoServ serv) {
		this.serv = serv;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}

}
