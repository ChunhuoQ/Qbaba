package m04.d12.Qbaba.mapper;

import java.util.List;

import m04.d12.Qbaba.entity.ProPage;
import m04.d12.Qbaba.entity.Product;

public interface ProductMapper {
   List<Product> selectProAll();
   
   List<Product> selectProLimit(ProPage propage);
   
   int getAllPage();
}