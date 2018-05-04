package m04.d19.Qbaba.mapper;

import java.util.List;

import m04.d19.Qbaba.entity.ShangPing;

public interface ShangPingMapper {
  List<ShangPing> selectPsAll();
  List<ShangPing> selectPsById (Integer id);
}