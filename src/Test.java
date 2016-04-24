import bean.CustomerBean;
import dao.DAO;

/**
 * Created by falling on 2016/4/21.
 */
public class Test {

    public static void main(String args[]) {
        DAO Dao = new DAO();

        //根据Primary Key查找
//        System.out.println(Dao.getById("AROUT",Customer.class));
//
//        //根据名称查找
//        List list = Dao.searchByName("Chri");
//        for (Object object : list) {
//            Customer customer = (Customer) object;
//            System.out.println(customer.toString());
//        }
//
//        //添加
//        Customer bean = new Customer();
//        bean.setCompanyName("c");
//        bean.setContactName("a");
//        bean.setContactTitle("a");
//        bean.setAddress("a");
//        bean.setCity("a");
//        bean.setRegion("a");
//        bean.setPostalCode("a");
//        bean.setCountry("a");
//        bean.setPhoneTest("a");
//        bean.setFaxTest("a");
//        Dao.addBean(bean);

//        //更新
//        CustomerBean NewBean = new CustomerBean();
//        NewBean.setId("8ac28486543bc29d01543bc29e660000");
//        NewBean.setCompanyName("abc");
//
//        Dao.updateCustomer(NewBean);

        //根据PK删除
//        Dao.deleteCustommer("8ac28486543bc0a901543bc0aa550000",Customer.class);
    }
}
