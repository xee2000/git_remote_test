package com.ljh.exam.jsp_bootstrap.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ljh.exam.jsp_bootstrap.vo.Board;

@Mapper
public interface BoardRepository {
	
	@Select("""
			select * 
			from board as B
			where B.id = #{id}
			and B.delStatus = 0
			""")
	Board getBoardById(@Param("id")int id);
}
