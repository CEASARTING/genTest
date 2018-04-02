package com.wiipu.po;

import com.wiipu.po.AutowineWineBuy;
import com.wiipu.po.AutowineWineBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutowineWineBuyMapper {
    long countByExample(AutowineWineBuyExample example);

    int deleteByExample(AutowineWineBuyExample example);

    int deleteByPrimaryKey(Integer wineBuyId);

    int insert(AutowineWineBuy record);

    int insertSelective(AutowineWineBuy record);

    List<AutowineWineBuy> selectByExample(AutowineWineBuyExample example);

    AutowineWineBuy selectByPrimaryKey(Integer wineBuyId);

    int updateByExampleSelective(@Param("record") AutowineWineBuy record, @Param("example") AutowineWineBuyExample example);

    int updateByExample(@Param("record") AutowineWineBuy record, @Param("example") AutowineWineBuyExample example);

    int updateByPrimaryKeySelective(AutowineWineBuy record);

    int updateByPrimaryKey(AutowineWineBuy record);
}