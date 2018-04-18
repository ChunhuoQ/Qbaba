/**
 * Project Name:Demo
 * File Name:questionInfoDao.java
 * Package Name:dao2
 * Date:2018��3��28������3:47:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.lvruiling.dao2;

import java.util.List;

/**
 * Description: <br/>
 * Date: 2018��3��28�� ����3:47:49 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public interface questionInfoDao<T> {
    List<QuestionInfo> getAllInfo();

    int deleteInfo(int id);

    int saveInfo2(T t);

}
