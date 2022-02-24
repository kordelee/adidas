package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public int selectOneCount(MemberVo vo) throws Exception { return dao.selectOneCount(vo); }
	
	@Override
	public List<Member> selectList(MemberVo vo) throws Exception { return dao.selectList(vo); }
	
	@Override
	public Member selectOne(MemberVo vo) throws Exception { return dao.selectOne(vo); }

	@Override
	public int insert(MemberVo vo) throws Exception { return dao.insert(vo); }

	@Override
	public int update(MemberVo vo) throws Exception { return dao.update(vo); }


}
