package com.gat.open.sdk.util;

import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.exception.GATIllegalArgumentException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * retrofit 参数校验
 * Created by xin.hua on 2017/7/20.
 */
public class RetrofitInvocationHandler implements InvocationHandler {

    Object retrofitApi;

    public RetrofitInvocationHandler(Object retrofitApi) {
        this.retrofitApi = retrofitApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("toString") || method.getName().equals("hashcode") || method.getName().equals("equals")){
            return method.invoke(retrofitApi,args);
        }
        ValidGroup validGroup = method.getAnnotation(ValidGroup.class);
        if (validGroup.value().length > 0){
            validParams(validGroup.value(),args,method);
        }

        return method.invoke(retrofitApi,args);
    }

    private void validParams(Valid[] valids,Object[] args,Method method){
        for (Valid valid : valids) {
            if (valid.index() >= args.length)
                throw new GATIllegalArgumentException("[Valid] 注解 [index]参数值不可超出该方法参数个数！");
            validAnnotation(valid,args[valid.index()],method);
        }
    }

    private void validAnnotation(Valid valid, Object arg, Method method){

            if (valid.required()){
                if (arg == null) throw new GATIllegalArgumentException(valid.index(),method.getName(),"不能为空");
            }
            if (valid.notEmpty()){
                if (arg == null || arg.toString().trim().isEmpty()) throw new GATIllegalArgumentException(valid.index(),method.getName(),"不能为空");
            }

            if (!valid.regStr().isEmpty()){
                if (arg != null && !arg.toString().matches(valid.regStr()))
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"正则式不匹配"+valid.regStr());
            }

            if (valid.intVals().length > 0){
                Integer intArg = (Integer)arg;
                if (intArg != null && !ParamValidator.contains(valid.intVals(),intArg))
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"intVals 取值不在"+ Arrays.toString(valid.intVals()));
            }

            if (valid.length() != -1){
                if (arg != null && arg.toString().length() != valid.length())
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数长度不等于"+valid.length());
            }

            if (valid.minLen() != -1){
                if (arg != null && arg.toString().length() < valid.minLen())
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数长度小于"+valid.minLen());
            }

            if (valid.maxLen() != -1){
                if (arg != null && arg.toString().length() > valid.maxLen())
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数长度大于"+valid.maxLen());
            }

            if (valid.scale() != -1){
                if (arg instanceof BigDecimal && ((BigDecimal)arg).scale() != valid.scale())
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数小数位数不是"+valid.scale());
            }

            if (valid.decMin() != -1.0){
                if (arg instanceof BigDecimal && ((BigDecimal)arg).compareTo(new BigDecimal(valid.decMin())) <0 )
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数值小于"+valid.decMin());
            }

            if (valid.decMax() != -1.0){
                if (arg instanceof BigDecimal && ((BigDecimal)arg).compareTo(new BigDecimal(valid.decMax())) > 0 )
                    throw new GATIllegalArgumentException(valid.index(),method.getName(),"参数值大于"+valid.decMin());
            }
    }
}
