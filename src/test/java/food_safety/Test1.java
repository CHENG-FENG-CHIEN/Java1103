package food_safety;


import food_safety.entity.Rice;
import food_safety.util.Service;
import org.junit.Test;

public class Test1 {
    @Test
    public void t1() {
        Service service = new Service();
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        System.out.println(service.getJsonString(url));
        //String url2 = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceQualified.aspx";
        //System.out.println(service.getJsonString(url2));
    }
    
    @Test
    public void t2() {
        Service service = new Service();
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        Rice[] rices = service.queryRices(url);
        for(Rice rice : rices) {
            System.out.printf("%s %s\n", rice.get品名(), rice.get不合格原因());
        }
    }
}
