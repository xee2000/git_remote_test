package com.ljh.exam.jsp_bootstrap.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ljh.exam.jsp_bootstrap.vo.Member;

@Mapper
public interface MemberRepository {
	@Insert("""
			INSERT INTO `member`
			SET regDate = NOW(),
			updateDate = NOW(),
			loginId = #{loginId},
			loginPw = #{loginPw},
			`name` = #{name},
			nickname = #{nickname},
			cellphoneNo = #{cellphoneNo},
			email = #{email}
			""")
	void join(@Param("loginId") String loginId, @Param("loginPw") String loginPw, @Param("name") String name, @Param("nickname") String nickname, @Param("cellphoneNo") String cellphoneNo, @Param("email") String email);

	@Select("""
			SELECT *
			FROM `member`
			ORDER BY
			id DESC
			""")
	List<Member> getMembers();

	@Select("SELECT LAST_INSERT_ID()")
	int getLastInsertId();
	
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.id = #{id}
			""")
	Member getMemberById(@Param("id") int id);

	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.loginId = #{loginId}
			""")
	Member getMemberByLoginId(@Param("loginId") String loginId);

	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.name = #{name}
			AND M.email = #{email}
			""")
	Member getMemberByNameAndEmail(@Param("name") String name, @Param("email") String email);

	@Update("""
			<script>
			UPDATE `member`
			<set>
			updateDate = now(),
			<if test="loginPw != null">
			loginPw = #{loginPw},
			</if>
			<if test="name != null">
			name = #{name},
			</if>
			<if test="email != null">
			email = #{email},
			</if>
			<if test="nickname != null">
			nickname = #{nickname},
			</if>
			<if test="cellphoneNo != null">
			cellphoneNo = #{cellphoneNo}
			</if>
			</set>
			where id = #{id}
			</script>
			""")	
	void modify(int id, String loginPw, String name, String nickname, String email, String cellphoneNo);
}