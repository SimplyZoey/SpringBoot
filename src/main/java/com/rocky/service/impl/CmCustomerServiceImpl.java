package com.rocky.service.impl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rocky.dao.busibean.CmCustomerMapper;
import com.rocky.api.busibean.ICmCustomerService;
import com.rocky.busibean.CmCustomer;

@Service
public class CmCustomerServiceImpl implements CmCustomerService {

	@Autowired
    private CmCustomerDao cmCustomerDao;
	
    @Override
    public CmCustomer getById(Integer id) {
        return cmCustomerMapper.getById(id);
    }

    @Override
    public int insert(CmCustomer entity) {
        entity.setCreateTime(new Date());
        entity.setModifyTime(new Date());
        return cmCustomerMapper.insert(entity);
    }

    @Override
    public int update(CmCustomer entity) {
        entity.setModifyTime(new Date());

        return cmCustomerMapper.update(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return cmCustomerMapper.deleteById(id);
    }

    @Override
    public List <CmCustomer> queryList(CmCustomerQuery cmCustomerQuery) {
        Map<String, Object> map = BeanToMapUtils.toMap(cmCustomerQuery);
        return cmCustomerMapper.queryList(map);
    }

    @Override
    public DataPage<CmCustomer> queryForPage(CmCustomerQuery cmCustomerQuery, int currentPage, int pageSize) {
        DataPage<CmCustomer> dataPage = new DataPage<>();

        Map<String, Object> map = BeanToMapUtils.toMap(cmCustomerQuery);

        Paging page = new Paging();
        page.setCurrentPage(currentPage);
        page.setPageSize(pageSize);
        map.put("page", page);

        List<CmCustomer> list = cmCustomerMapper.queryList(map);
        dataPage.setData(list);
        dataPage.setTotalItem(page.getTotalItem());
        dataPage.setPageSize(page.getPageSize());
        dataPage.setCurrentPage(page.getCurrentPage());
        return dataPage;
    }

}
