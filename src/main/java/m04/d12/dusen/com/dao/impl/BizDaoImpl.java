/**
 * Project Name:pinhong1
 * File Name:BizDaoImpl.java
 * Package Name:com.dao.impl
 * Date:2018年4月12日下午9:53:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.dusen.com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d12.dusen.com.dao.BaseDao;
import m04.d12.dusen.com.dao.BizDao;
import m04.d12.dusen.com.entity.News;
import m04.d12.dusen.com.entity.Product;



/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午9:53:16 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao{

    @Override
    public List<News> getAllNews() {
        List<News> list=new ArrayList<News>();
        String sql="SELECT * FROM news";
        try {
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                News ne=new News();
                ne.setNid(rs.getInt(1));
                ne.setNtitle(rs.getString(2));
                ne.setNcontent(rs.getString(3));
                ne.setNdate(rs.getDate(4));
                list.add(ne);
            }
        } catch (Exception e) {
            // TODO: handle exception
        e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
        return list;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> listpro=new ArrayList<Product>();
        String sql="SELECT * FROM product";
       
        try {
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPdrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }finally{
            close(con, cs, rs);
        }
        //  Auto-generated method stub
        return listpro;
    }

}

