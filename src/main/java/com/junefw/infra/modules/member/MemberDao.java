package com.junefw.infra.modules.member;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	  
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.member.MemberMpp";

	public int selectOneCount(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOneCount", vo); }
	public List<Member> selectList(MemberVo vo){ return sqlSession.selectList(namespace + ".selectList", vo); }
	public Member selectOne(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOne", vo); }
	public int insert(MemberVo vo) { return sqlSession.insert(namespace + ".insert", vo); }
	public int update(Member dto) { return sqlSession.update(namespace + ".update", dto); }
}