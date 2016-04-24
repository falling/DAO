package test;

import bean.CustomerBean;

import java.lang.reflect.Field;

/**
 * Created by falling on 2016/4/22.
 */
public class test {

    public static void main(String args[]) throws IllegalAccessException {
        CustomerBean bean = new CustomerBean();
        bean.setId("a");
        bean.setCompanyName("a");
        bean.setContactName("a");
        bean.setContactTitle("a");
        bean.setAddress("a");
        bean.setCity("a");
        bean.setRegion("a");
        bean.setPostalCode("a");
        bean.setCountry("a");
        bean.setPhone("a");
        bean.setFax("a");

        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.get(bean));
        }
    }
}

