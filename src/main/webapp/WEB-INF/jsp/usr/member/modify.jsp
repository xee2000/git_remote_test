<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="pageTitle" value="게시물 수정" />
<%@include file="../common/head.jspf"%>
c
<section class="mt-5">
		<div class="container mx-auto px-3">
				<form class="table-box-type-1" method="POST" action="../member/doModify" onsubmit="MemberModify__submit">
						<input type="hidden" name="memberModifyAuthKey" value="${param.memberModifyAuthKey}" />

						<table>
								<colgroup>
										<col width="200" />
								</colgroup>
								<tbody>
										<tr>
												<th>로그인아이디</th>
												<td>${rq.loginedMember.loginId}</td>
										</tr>
										<tr>
												<th>새 비밀번호</th>
												<td>
														<input type="password" class="input input-bordered" name="loginPw" placeholder="새 비밀번호를 입력해주세요." />
												</td>
										</tr>
										<tr>
												<th>새 비밀번호 확인</th>
												<td>
														<input type="password" class="input input-bordered" name="loginPwConfirm" placeholder="다시한번 더 입력해주세요." />
												</td>
										</tr>
										<tr>
												<th>이름</th>
												<td>
														<input type="text" class="input input-bordered" name="name" placeholder="이름을 입력해주세요."
																value="${rq.loginedMember.name }"
														/>
												</td>
										</tr>
										<tr>
												<th>닉네임</th>
												<td>
														<input type="text" class="input input-bordered" name="nickname" placeholder="닉네임을 입력해주세요."
																value="${rq.loginedMember.nickname }"
														/>
												</td>
										</tr>
										<tr>
												<th>이메일</th>
												<td>
														<input type="text" class="input input-bordered" name="email" placeholder="닉네임을 입력해주세요."
																value="${rq.loginedMember.email }"
														/>
												</td>
										</tr>
										<tr>
												<th>휴대전화번호</th>
												<td>
														<input type="text" class="input input-bordered" name="cellphoneNo" placeholder="닉네임을 입력해주세요."
																value="${rq.loginedMember.cellphoneNo }"
														/>
												</td>
										</tr>


										<tr>
												<th>회원정보수정</th>
												<td>
														<input type="submit" class="btn btn-primary" value="회원정보수정" />
														<button type="button" class="btn btn-outline btn-primary" onclick="history.back();">뒤로가기</button>
												</td>
										</tr>
								</tbody>
						</table>
						<div class="btns">
								<button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>

						</div>
				</form>
		</div>
</section>
<%@include file="../common/foot.jspf"%>