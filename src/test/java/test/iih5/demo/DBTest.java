package test.iih5.demo;

import com.alibaba.fastjson.JSON;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DBTest {
    public static void main(String[] args) throws Exception{
        System.out.println("dddddddddddddd");

        SubMode mModel=  SubMode.class.newInstance();
        mModel.setAb("dvbvv");
        mModel.setBb("Cccc");
        Field[] mds = mModel.getClass().getDeclaredFields();
        if (mds.length>0){
           for (Field fd:mds) {
               PropertyDescriptor pd = new PropertyDescriptor(fd.getName(),mModel.getClass());
               //Method method = pd.getWriteMethod();
              // method.invoke(mModel, "dddd");
               Method methodReader = pd.getReadMethod();//
              Object d= methodReader.invoke(mModel);//
               System.out.println("-------"+d);
           }
        }
       // System.out.println("--"+JSON.toJSONString(mModel));
    }
}
