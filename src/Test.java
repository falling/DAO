import bean.CustomerBean;
import dao.DAO;

/**
 * Created by falling on 2016/4/21.
 */
public class Test {

    public static void main(String args[]) {
        DAO Dao = new DAO();

        //����Primary Key����
//        System.out.println(Dao.getById("AROUT",Customer.class));
//
//        //�������Ʋ���
//        List list = Dao.searchByName("Chri");
//        for (Object object : list) {
//            Customer customer = (Customer) object;
//            System.out.println(customer.toString());
//        }
//
//        //���
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

//        //����
//        CustomerBean NewBean = new CustomerBean();
//        NewBean.setId("8ac28486543bc29d01543bc29e660000");
//        NewBean.setCompanyName("abc");
//
//        Dao.updateCustomer(NewBean);

        //����PKɾ��
//        Dao.deleteCustommer("8ac28486543bc0a901543bc0aa550000",Customer.class);
    }
}
