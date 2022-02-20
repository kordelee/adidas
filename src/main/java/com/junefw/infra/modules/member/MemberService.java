package com.junefw.infra.modules.member;

import java.util.List;

public interface MemberService {

	public int selectOneCount(MemberVo vo) throws Exception;
	public List<Member> selectList(MemberVo vo) throws Exception; 
	public Member selectOne(MemberVo vo) throws Exception;
	public int insert(MemberVo vo) throws Exception;
	public int update(Member dto) throws Exception; 
}
