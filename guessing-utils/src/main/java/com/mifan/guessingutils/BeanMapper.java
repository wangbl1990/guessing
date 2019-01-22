package com.mifan.guessingutils;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.List;

public class BeanMapper
{
    private static DozerBeanMapper dozer = new DozerBeanMapper();

    /**
     * 构造新的destinationClass实例对象，通过source对象中的字段内容
     * 映射到destinationClass实例对象中，并返回新的destinationClass实例对象。
     *
     * @param source 源数据对象
     * @param destinationClass 要构造新的实例对象Class
     */
    public static <T> T map(Object source, Class<T> destinationClass)
    {
        if( source == null ){
            return null ;
        }
        return dozer.map(source, destinationClass);
    }



    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass)
    {
        List destinationList = Lists.newArrayList();
        sourceList.forEach(single ->{destinationList.add(dozer.map(single, destinationClass));});
        return destinationList;
    }

    public static <T> List<T> mapList(Iterable iterable, Class<T> destinationClass)
    {
        List paramList = Lists.newArrayList( iterable );
        List destinationList = Lists.newArrayList();
        paramList.forEach(single ->{destinationList.add(dozer.map(single, destinationClass));});
        return destinationList;
    }

    /**
     * 将对象source的所有属性值拷贝到对象destination中.
     *
     * @param source 对象source
     * @param destinationObject 对象destination
     */
    public static void copy(Object source, Object destinationObject)
    {
        dozer.map(source, destinationObject);
    }

}
