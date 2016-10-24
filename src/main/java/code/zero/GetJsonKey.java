package code.zero;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/24.
 * function：
 * 把 json 字符串的 key 提取出来
 */

/**
 inputDemo:

 SUBMIT_USER_CODE: "",
 ACTIVE_FLAG: "1",
 CREATE_TIME: "2016-10-21 16:11:52",
 CLOSED_USER_CODE: "",
 UPDATE_TIME: "2016-10-22 15:44:58",
 STATUS: "4",
 OTHER_OUT_ID: "7",
 TENANT_ID: "10",
 CREATE_PERSON: "yshe",
 CLOSED_NAME_CN: "测试用户",
 CLOSED_TIME: "0000-00-00 00:00:00",
 OTHER_OUT_CODE: "",
 DEMO: "",
 SUBMIT_NAME_CN: "王五",
 VERSION_CODE: "",
 APPROVEDT_USER_CODE: "24",
 SUBMIT_TIME: "2016-10-22 13:43:20",
 APPROVED_NAME_CN: "root",
 PROJECTS_ID: "99",
 UPDATE_PERSON: "yshe",
 APPROVED_TIME: "2016-10-22 15:45:06",
 TYPE: "1"
 $

 */
public class GetJsonKey {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()){
            String inputStr = sc.nextLine();
            if(inputStr.contains("$")){
                break;
            }
            sb.append(inputStr.split(":")[0]+"\n");
        }
        System.out.println(sb);
    }
}
