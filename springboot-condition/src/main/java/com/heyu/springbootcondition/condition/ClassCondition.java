package com.heyu.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author shkstart
 * @date 2021-08-15 16:49
 */
public class ClassCondition implements Condition {

    /**
     *
     * @param conditionContext 上下文对象，用于获取环境，IOC容器，ClassLoader对象
     * @param annotatedTypeMetadata 注解的元对象。可以用于获取注解定义的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {


//       //1.需求：导入jedis坐标后创建bean
//        //思路：判断redis.clients.jedis.Jedis为念是否存在
//        boolean flag=true;
//        try {
//            Class<?> aClass = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            flag=false;
//        }
//        return flag;

        //2。需求：导入通过注解属性值value指定坐标后创建Bean
        //思路：获取注解属性值

        Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());

//        System.out.println(map);

        String[] value = (String[]) map.get("value");
        boolean flag = true;
        try {

            for (String className : value) {
                Class<?> aClass = Class.forName("redis.clients.jedis.Jedis");
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;


    }
}
