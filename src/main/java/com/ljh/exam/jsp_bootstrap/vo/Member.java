package com.ljh.exam.jsp_bootstrap.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	private int id; 
	private String loginId;
	private String loginPw;
	private Date regDate;
	private Date updateDate; 
	private String name; 
	private String nickname;
	private String cellphoneNo;
	private String email;
	private int authLevel;
	private boolean delStatus;
	private String delDate;
	
	
}
