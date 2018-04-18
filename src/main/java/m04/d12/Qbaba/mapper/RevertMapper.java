package m04.d12.Qbaba.mapper;

import java.util.List;

import m04.d12.Qbaba.entity.Revert;

public interface RevertMapper {
   List<Revert> selectRevAll();
   List<Revert> reveListById(String id);
   void insertRev(Revert revert);
   int reveByNum();
}