import bean.Bean;
import bean.CustomerBean;
import dao.DAO;

import java.util.List;

/**
 * Created by falling on 2016/4/21.
 */
public class Test {

    public static void main(String args[]) {
        DAO Dao = new DAO();

        //����Primary Key����
//        Bean bean = new CustomerBean();
//        bean.setId("AROUT");
//        System.out.println(Dao.getById(bean));

        //�������Ʋ���
        List list = Dao.searchByName("Chri");
        for (Object object : list) {
            Bean customer = (CustomerBean) object;
            System.out.println(customer.toString());
        }


        //���
//        CustomerBean bean = new CustomerBean();
//        bean.setCompanyName("c");
//        bean.setContactName("a");
//        bean.setContactTitle("a");
//        bean.setAddress("a");
//        bean.setCity("a");
//        bean.setRegion("a");
//        bean.setPostalCode("a");
//        bean.setCountry("a");
//        bean.setPhone("a");
//        bean.setFax("a");
//        Dao.addBean(bean);

//        //����
//        CustomerBean NewBean = new CustomerBean();
//        NewBean.setId("8ac2848654484489015448448b2f0000");
//        NewBean.setCompanyName("abc");

//        Dao.updateCustomer(NewBean);

        //����PKɾ��Checked
//        Bean bean = new CustomerBean();
//        bean.setId("8ac284865448435c015448435d860000");
//        Dao.deleteCustomer(bean);
    }
}
