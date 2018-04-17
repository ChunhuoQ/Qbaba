package m04.d12.Qbaba.mapper;

import java.util.List;

import m04.d12.Qbaba.entity.Message;

public interface MessageMapper {
   List<Message> selectMesAll();
   List<Message>  messListById(String id);
   void updatemess(Integer id);
}