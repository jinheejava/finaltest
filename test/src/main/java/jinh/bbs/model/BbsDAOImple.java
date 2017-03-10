package jinh.bbs.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class BbsDAOImple implements BbsDAO {
	
	private SqlSessionTemplate sqlMap;

	public BbsDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	public List<BbsDTO> bbslist(int cp, int ls) {
		
		List<BbsDTO> list = sqlMap.selectList("bbslist", cp);
		
		return list;
	}
	
	public int bbsTotalcnt() {
		
		int result = sqlMap.selectOne("bbsTotalcnt");
		
		return result;

	}

}
