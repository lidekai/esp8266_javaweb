package net.person.service.impl;

import net.person.dao.TestDao;
import net.person.model.TestModel;
import net.person.model.json.ListObject;
import net.person.service.TestService;
import net.person.utils.JackJsonUtils;
import net.person.utils.ResponseUtils;
import net.person.utils.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * service的实现类
 * Created by admin on 2018/1/31.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    public TestDao testDao;
    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
    public void getAllTest(HttpServletResponse response) {
        List<TestModel> list = testDao.getAllTest();
        ListObject listObject=new ListObject();
        listObject.setItems(list);
        listObject.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        String responseText = JackJsonUtils.toJson(listObject);
        ResponseUtils.renderJson(response, responseText);
    }
}